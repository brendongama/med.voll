package med.voll.apiMed.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.apiMed.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
