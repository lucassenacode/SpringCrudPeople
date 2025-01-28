package com.lucassena.springscrudpeople.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_springscrudpeople")
@NoArgsConstructor
@Getter
@Setter
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, unique = true)
  @Setter(AccessLevel.NONE)
  private Long id;

  @Column(nullable = false, unique = true)
  private Integer numQuadrinho;

  @Column(nullable = false)
  private String nome;

  @Column(nullable = false)
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

  @Builder
  public Person(Integer numQuadrinho, Integer anoFormatura, String nome, String apelido, String curso, String cidade,
      String estado, String cep, String telefone, String email, String empresaTrabalha, String ultimaAtualizacao) {
    this.numQuadrinho = numQuadrinho;
    this.anoFormatura = anoFormatura;
    this.nome = nome;
    this.apelido = apelido;
    this.curso = curso;
    this.cidade = cidade;
    this.estado = estado;
    this.cep = cep;
    this.telefone = telefone;
    this.email = email;
    this.empresaTrabalha = empresaTrabalha;
    this.ultimaAtualizacao = ultimaAtualizacao;
  }

}
