package med.voll.api.domain.model.paciente;

import med.voll.api.domain.model.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome, String email, String telefone, String cpf, Boolean ativo,
                                        Endereco endereco) {
    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(),paciente.getNome(),paciente.getEmail(),paciente.getTelefone(),paciente.getCpf(),
            paciente.getAtivo(),paciente.getEndereco());
    }
}
