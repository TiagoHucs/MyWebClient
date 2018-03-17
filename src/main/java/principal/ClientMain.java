package principal;

import java.util.ArrayList;

import servicos.Pessoa;

import servicos.PessoaService;
import servicos.PessoaServiceImplService;
import servicos.RetornoSoap;

public class ClientMain {

	public static void main(String[] args) {
		PessoaServiceImplService servicoImpl = new PessoaServiceImplService();
		PessoaService servicoPessoa = servicoImpl.getPessoaServiceImplPort();
		
		Pessoa p = new Pessoa();
		p.setNome("jão silva");
		p.setCpf("8787878");
		
		//servicoPessoa.inserirPessoa(p);
		
		RetornoSoap retorno = new RetornoSoap();
		retorno = servicoPessoa.recuperarTodos();
		
		ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) retorno.getPessoas();	
		
		System.out.println(retorno.getCodRetorno()+" - "+retorno.getTextoRetorno());
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getCpf()+" - "+pessoa.getNome());
		}
	}
}
