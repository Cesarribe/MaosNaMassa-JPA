package br.com.csribeiro.domain;

import javax.persistence.*;

@Entity
@Table(name = "TB_CURSO")
public class Produto {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="produto_seq")
    @SequenceGenerator(name="produto_seq", sequenceName="sq_produto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", length = 100, nullable = false)
    private String descricao;

}