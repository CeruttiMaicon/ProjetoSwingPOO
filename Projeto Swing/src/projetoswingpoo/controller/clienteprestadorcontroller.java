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

		if (view.getUsuario().length() < 1){
			view.setErrorMessage("favor preencher o campo USUÁRIO");
		}else if(view.getSenhatext().length() <1){
			view.setErrorMessage("Favor preencher o campo SENHA");
		}else if(view.getSenhatext().length()<8){
			view.setErrorMessage("A senha deve ter no mínimo 8 caracteres");
		}else if(view.getCEP().length() <1){
			view.setErrorMessage("Favor preencher o campo CEP");
		}else if(view.getCPF().length() < 1){
			view.setErrorMessage("Favor preencher o campo CPF");
		}else if(view.getNome().length() < 1){
			view.setErrorMessage("Favor preencher o campo NOME COMPLETO");
		}else{
			model.setUsuario(view.getUsuario());
			model.setSenha(view.getSenhatext());
			model.setCEP(view.getCEP());
			model.setCPF(view.getCPF());
			model.setDatanascimento(view.getData());
			model.setNomecompleto(view.getNome());
			model.setEndereco(view.getEndereco());
			view.setSuccessMessage("Informações armazenadas com sucesso!");
		}

	}
	
	

}
