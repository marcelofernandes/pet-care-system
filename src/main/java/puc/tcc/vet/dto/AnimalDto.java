package puc.tcc.vet.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnimalDto {

    private Long id;

    private String nome;

    private LocalDate dataNascimento;

    private String raca;

    private String foto;

    private String laudo;

    private String obs;

    private String historico;
}
