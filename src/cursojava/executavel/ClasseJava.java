package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class ClasseJava {

public static void main (String[] args){
	
	String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
	String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
	String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
	String registroGeral = JOptionPane.showInputDialog("Qual o registroGeral do aluno?");
	String cpf = JOptionPane.showInputDialog("Qual o cpf do aluno?");
	String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do aluno?");
	String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do aluno?");
	String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrícula do aluno?");
	String serie = JOptionPane.showInputDialog("Qual a serie do aluno?");
	
	String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola do aluno?");

	String disciplina1 = JOptionPane.showInputDialog("disciplina 1?" );
	String nota1 = JOptionPane.showInputDialog("nota 1");
	
	String disciplina2 = JOptionPane.showInputDialog("disciplina 2?" );
	String nota2 = JOptionPane.showInputDialog("nota 2 ");

	String disciplina3 = JOptionPane.showInputDialog("disciplina 3?" );
	String nota3 = JOptionPane.showInputDialog("nota 3 ");
	
	String disciplina4 = JOptionPane.showInputDialog("disciplina 4?" );
	String nota4 = JOptionPane.showInputDialog("nota 4 ");
	

	Aluno aluno1 = new Aluno();
	
	aluno1.setNome(nome);
	aluno1.setIdade(Integer.valueOf(idade));
	aluno1.setDataNascimento(dataNascimento);
	aluno1.setRegistroGeral(registroGeral);
	aluno1.setNumeroCpf(cpf);
	aluno1.setNomeMae(nomeMae);
	aluno1.setNomePai(nomePai);	
	aluno1.setDataMatricula(dataMatricula);
	aluno1.setSerieMatriculado(serie);
	aluno1.setNomeEscola(nomeEscola);
	
	aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
	aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
	aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
	aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
	
	aluno1.getDisciplina().setDisciplina1(disciplina1);
	aluno1.getDisciplina().setDisciplina2(disciplina2);
	aluno1.getDisciplina().setDisciplina3(disciplina3);
	aluno1.getDisciplina().setDisciplina4(disciplina4);
	
	aluno1.getAlunoAprovado();
	
	/*
	System.out.println(aluno1.getNome() + aluno1.getDataMatricula() + aluno1.getDataNascimento() + aluno1.getIdade());
	
	System.out.println("Média = " + aluno1.getMediaNota());
	System.out.println("aluno aprovado : " + (aluno1.getAlunoAprovado() ? " aprovado" : "reprovado)"));
	
	System.out.println("---------------------------"); */

	Aluno aluno = new Aluno();
	System.out.println(aluno1);
	
	System.out.println("Media do aluno = " + aluno1.getMediaNota());
	System.out.println("Resultado = " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado" ));
	
	
	
}
}