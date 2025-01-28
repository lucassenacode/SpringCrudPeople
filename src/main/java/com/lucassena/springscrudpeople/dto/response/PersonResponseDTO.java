package com.lucassena.springscrudpeople.dto.response;

import com.lucassena.springscrudpeople.entity.Person;

public class PersonResponseDTO {

  private Long id;
  private Integer numQuadrinho;
  private String nome;
  private String apelido;
  private Integer anoFormatura;
  private String curso;
  private String cidade;
  private String estado;
  private String cep;
  private String telefone;
  private String email;
  private String empresaTrabalha;
  private String ultimaAtualizacao;

  public PersonResponseDTO(Person person) {
    this.id = person.getId();
    this.numQuadrinho = person.getNumQuadrinho();
    this.nome = person.getNome();
    this.apelido = person.getApelido();
    this.anoFormatura = person.getAnoFormatura();
    this.curso = person.getCurso();
    this.cidade = person.getCidade();
    this.estado = person.getEstado();
    this.cep = person.getCep();
    this.telefone = person.getTelefone();
    this.email = person.getEmail();
    this.empresaTrabalha = person.getEmpresaTrabalha();
    this.ultimaAtualizacao = person.getUltimaAtualizacao();
  }
}
