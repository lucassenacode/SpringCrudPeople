package com.lucassena.springscrudpeople.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.lucassena.springscrudpeople.dto.request.PersonRequestDTO;
import com.lucassena.springscrudpeople.dto.response.PersonResponseDTO;
import com.lucassena.springscrudpeople.service.PersonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/people")
@RequiredArgsConstructor
public class PersonController {

  private final PersonService personService;

  @GetMapping(value = "/{id}")
  public ResponseEntity<PersonResponseDTO> findById(@PathVariable(name = "id") Long id) {

    return ResponseEntity.ok().body(personService.findById(id));
  }

  @GetMapping
  public ResponseEntity<List<PersonResponseDTO>> findALL() {

    return ResponseEntity.ok().body(personService.findAll());
  }

  @PostMapping
  public ResponseEntity<PersonResponseDTO> register(@RequestBody PersonRequestDTO personRequestDTO,
      UriComponentsBuilder uriBuilder) {

    PersonResponseDTO personResponseDTO = personService.register(personRequestDTO);

    URI uri = uriBuilder.path("/people/{id}").buildAndExpand(personResponseDTO.getId()).toUri();

    return ResponseEntity.created(uri).body(personResponseDTO);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<PersonResponseDTO> upadate(@RequestBody PersonRequestDTO personRequestDTO,
      @PathVariable(name = "id") Long id) {

    return ResponseEntity.ok().body(personService.update(id, personRequestDTO));

  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<String> delete(@PathVariable(name = "id") Long id) {

    return ResponseEntity.ok().body(personService.delete(id));
  }

}
