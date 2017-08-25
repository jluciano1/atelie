package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela ENTREGADOR
 * @generated
 */
@Entity
@Table(name = "\"ENTREGADOR\"")
@XmlRootElement
public class Entregador implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id;
  
  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "nascimento", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date nascimento;
  
  /**
  * @generated
  */
  @Column(name = "habilitacao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String habilitacao;
  
  /**
   * Construtor
   * @generated
   */
  public Entregador(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Entregador setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Entregador setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém nascimento
   * return nascimento
   * @generated
   */
  public java.util.Date getNascimento(){
    return this.nascimento;
  }
  
  /**
   * Define nascimento
   * @param nascimento nascimento
   * @generated
   */
  public Entregador setNascimento(java.util.Date nascimento){
    this.nascimento = nascimento;
    return this;
  }
  
  /**
   * Obtém habilitacao
   * return habilitacao
   * @generated
   */
  public java.lang.String getHabilitacao(){
    return this.habilitacao;
  }
  
  /**
   * Define habilitacao
   * @param habilitacao habilitacao
   * @generated
   */
  public Entregador setHabilitacao(java.lang.String habilitacao){
    this.habilitacao = habilitacao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Entregador object = (Entregador)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}