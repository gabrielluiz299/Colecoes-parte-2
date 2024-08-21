package br.com.gsoares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewProject {

	public static void main(String[] args) {
		listaDeAlunos();
	}
	static class Aluno implements Comparable<Aluno>{
		private String nome;
		private String sexo;
		
		public Aluno(String nome, String sexo) {
			this.nome = nome;
			this.sexo = sexo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSexo() {
			return sexo;
		}

		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		@Override
		public String toString() {
			return "Aluno{" +
					"nome = '" + nome + '\'' +
					", sexo = '" + sexo + '\''+
					'}';
			}
		@Override
		public int compareTo(Aluno aluno) {
			return this.sexo.compareTo(aluno.getSexo());
		}
	}
	
	private static void listaDeAlunos() {
		List<Aluno> lista = new ArrayList<Aluno>();
		
		Aluno a = new Aluno("José Soares", "Masculino");
		Aluno b = new Aluno("Maria Madalena", "Feminino");
		Aluno c = new Aluno("luiz silva", "masculino");
		Aluno d = new Aluno("Lurdes santos", "Feminino");
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		Collections.sort(lista);
		System.out.print(lista);
	}
}


	