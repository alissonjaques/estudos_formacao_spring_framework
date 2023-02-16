package med.voll.api.domain.model.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.model.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}