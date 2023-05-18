package med.voll.api.domain.model.consulta.validacoes.cancelamento;

import med.voll.api.domain.model.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {
    void validar(DadosCancelamentoConsulta dados);
}
