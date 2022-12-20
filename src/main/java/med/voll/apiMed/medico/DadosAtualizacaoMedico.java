package med.voll.apiMed.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.apiMed.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
