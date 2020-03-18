package boot.jpa.crud.dto;

import boot.jpa.crud.domain.hero.Hero;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class HeroUpdateRequestDto {

    private Long id;
    private String name;
    private int age;
    private String note;

    public Hero toEntity() {
        return Hero.builder()
                .id(this.id)
                .name(this.name)
                .age(this.age)
                .note(this.note)
                .build();
    }


}
