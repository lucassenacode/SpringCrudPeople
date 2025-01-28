package com.lucassena.springscrudpeople.util;

import java.util.List;
import java.util.stream.Collectors;

import com.lucassena.springscrudpeople.dto.request.PersonRequestDTO;
import com.lucassena.springscrudpeople.dto.response.PersonResponseDTO;
import com.lucassena.springscrudpeople.entity.Person;

public class PersonMapper {

  public Person toPerson(PersonRequestDTO personDTO) {

    return Person.builder()
        .numQuadrinho(personDTO.getNumQuadrinho())
        .nome(personDTO.getNome())
        .apelido(personDTO.getApelido())
        .anoFormatura(personDTO.getAnoFormatura())
        .curso(personDTO.getCurso())
        .cidade(personDTO.getCidade())
        .estado(personDTO.getEstado())
        .cep(personDTO.getCep())
        .telefone(personDTO.getTelefone())
        .email(personDTO.getEMail())
        .empresaTrabalha(personDTO.getEmpresaTrabalha())
        .ultimaAtualizacao(personDTO.getUltimaAtualizacao())
        .build();
  }

  public PersonResponseDTO toPersonDTO(Person person) {

    return new PersonResponseDTO(person);
  }

  public List<PersonResponseDTO> toListPersonDTO(List<Person> peopleList) {

    return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
  }
}
