package br.com.csribeiro.dao;

import br.com.csribeiro.domain.Produto;

import java.util.List;

public interface IProdutoDao {

    Produto cadastrar(Produto mat);

    List<Produto> buscarTodos();

    void excluir(Produto produto);
}
