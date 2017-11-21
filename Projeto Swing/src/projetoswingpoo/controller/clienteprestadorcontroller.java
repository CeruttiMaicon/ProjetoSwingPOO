package projetoswingpoo.controller;

import projetoswingpoo.dao.ClientePrestadorDAO;
import projetoswingpoo.model.clienteprestador;
import projetoswingpoo.view.Cadastro;

public class clienteprestadorcontroller {
	
	private clienteprestador model;
	private Cadastro view;
	private ClientePrestadorDAO dao;
	
	
	public clienteprestadorcontroller() {
		model = new clienteprestador();
		view = new Cadastro();
		
	}
	
	public void initcontroller(){
		
		view.getBotao().addActionListener(E->savecliente());
		
	}
	
	private void savecliente(){
		model.setUsuario(view.getUsuario());
		model.setSenha(view.getSenhatext());
		model.setCEP(view.getCEP());
		model.setCPF(view.getCPF());
		model.setDatanascimento(view.getData());
		model.setNomecompleto(view.getNome());
		model.setEndereco(view.getEndereco());
		System.out.println("Save cliente");

	}
	
	

}
