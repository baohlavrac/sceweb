package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {

	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		
		empresa.setCnpj("89424232000180");
		empresa.setEndereco("rua taquari");
		empresa.setNomeDaEmpresa("empresa x");
		empresa.setNomeFantasia("empresa x");
		empresa.setTelefone("25680000");
	}
	
	@Test
	public void CT01UC01CadastrarEmpresaComSucesso() {
		assertEquals(1, empresaDAO.adiciona(empresa));
		empresaDAO.exclui("89424232000180");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
