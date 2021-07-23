package one.digitalinnovation.personapi.mapper;

import one.digitalinnovation.personapi.dto.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;
import org.springframework.web.bind.annotation.Mapping;

@Mapper

public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyy")
    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}
