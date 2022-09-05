package br.com.empresa.jdbc;

import javax.swing.JFrame;

import br.com.empresa.jdbc.view.ProdutoCategoriaFrame;

public class TestaOperacaoComView {

	public static void main(String[] args) {
		ProdutoCategoriaFrame produtoCategoriaFrame = new ProdutoCategoriaFrame();
		produtoCategoriaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
