package com.lucassena.springscrudpeople.dto.request;

import lombok.Getter;

@Getter
public class PersonRequestDTO {

  private Integer numQuadrinho;
  private String nome;
  private String apelido;
  private Integer anoFormatura;
  private String curso;
  private String cidade;
  private String estado;
  private String cep;
  private String telefone;
  private String eMail;
  private String empresaTrabalha;
  private String ultimaAtualizacao;
}
