package com.lucassena.springscrudpeople.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.lucassena.springscrudpeople.dto.request.PersonRequestDTO;
import com.lucassena.springscrudpeople.dto.response.PersonResponseDTO;
import com.lucassena.springscrudpeople.entity.Person;

@Component
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

  public void updatePersonData(Person person, PersonRequestDTO personRequestDTO) {

    person.setNumQuadrinho(personRequestDTO.getNumQuadrinho());
    person.setNome(personRequestDTO.getNome());
    person.setApelido(personRequestDTO.getApelido());
    person.setAnoFormatura(personRequestDTO.getAnoFormatura());
    person.setCurso(personRequestDTO.getCurso());
    person.setCidade(personRequestDTO.getCidade());
    person.setEstado(personRequestDTO.getEstado());
    person.setCep(personRequestDTO.getCep());
    person.setTelefone(personRequestDTO.getTelefone());
    person.setEmail(personRequestDTO.getEMail());
    person.setEmpresaTrabalha(personRequestDTO.getEmpresaTrabalha());
    person.setUltimaAtualizacao(personRequestDTO.getUltimaAtualizacao());
  }
}
