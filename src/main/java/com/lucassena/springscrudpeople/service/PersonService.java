package com.lucassena.springscrudpeople.service;

import java.util.List;

import com.lucassena.springscrudpeople.dto.request.PersonRequestDTO;
import com.lucassena.springscrudpeople.dto.response.PersonResponseDTO;

public interface PersonService {

  PersonResponseDTO findById(long id);

  List<PersonResponseDTO> findAll();

  PersonResponseDTO register(PersonRequestDTO PersonDTO);

  PersonResponseDTO update(Long id, PersonRequestDTO PersonDTO);

  String delete(Long id);
}
