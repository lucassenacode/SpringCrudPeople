package com.lucassena.springscrudpeople.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.lucassena.springscrudpeople.dto.request.PersonRequestDTO;
import com.lucassena.springscrudpeople.dto.response.PersonResponseDTO;
import com.lucassena.springscrudpeople.entity.Person;
import com.lucassena.springscrudpeople.repository.PersonRepository;
import com.lucassena.springscrudpeople.util.PersonMapper;

import lombok.RequiredArgsConstructor;

@Service
@Primary
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;

  private final PersonMapper personMapper;

  @Override
  public PersonResponseDTO findById(long id) {

    return personMapper.toPersonDTO(returnerPerson(id));
  }

  @Override
  public List<PersonResponseDTO> findAll() {

    return personMapper.toListPersonDTO(personRepository.findAll());
  }

  @Override
  public PersonResponseDTO register(PersonRequestDTO registerPersonDTO) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'register'");
  }

  @Override
  public PersonResponseDTO update(PersonRequestDTO registerPersonDTO, Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public String delete(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  private Person returnerPerson(Long id) {
    return personRepository.findById(id)
        .orElseThrow(() -> new RuntimeErrorException(null, "Pessoa não encontrada no banco de dados"));
  }
}
