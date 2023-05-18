package med.voll.api.domain.model.consulta.validacoes;

import med.voll.api.domain.exceptions.ValidacaoException;
import med.voll.api.domain.model.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.model.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta {
    @Autowired
    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        // escolha do médico opcional
        if(dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if(!medicoEstaAtivo){
            throw new ValidacaoException("Consulta não pode ser agendada com médico excluído.");
        }
    }
}