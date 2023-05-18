package med.voll.api.domain.model.consulta.validacoes;

import med.voll.api.domain.model.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
