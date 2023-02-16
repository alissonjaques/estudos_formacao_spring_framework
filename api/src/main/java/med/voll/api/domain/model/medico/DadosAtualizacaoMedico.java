package med.voll.api.domain.model.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.model.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}