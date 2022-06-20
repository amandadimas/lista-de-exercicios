public class boletim {
    public static void main(String[]args){
    aluno a1 = new aluno();
    a1.nome="Amanda";
    a1.matricula= 12;
    a1.turma = 3.54f;
    a1.periodo= "Integral";
    a1.n1= 5.8f;
    a1.n2= 8.9f;
    a1.n3= 9.8f;
    a1.disciplina= "Matemática";
    a1.media = ((a1.n1+a1.n2+a1.n3)/3);

    aluno a2 = new aluno();
    a2.nome="Judas";
    a2.matricula= 17;
    a2.turma = 2.54f;
    a2.periodo= "Integral";
    a2.n1= 4.7f;
    a2.n2= 2.3f;
    a2.n3= 5.8f;
    a2.disciplina= "Matemática";
    a2.media = ((a2.n1+a2.n2+a2.n3)/3);
    
    
    aluno a3 = new aluno();
    a3.nome="Luiz Inácio";
    a3.matricula= 13;
    a3.turma = 3.13f;
    a3.periodo= "Integral";
    a3.n1= 10;
    a3.n2= 9.8f;
    a3.n3= 9.9f;
    a3.disciplina= "Matemática";
    a3.media = ((a3.n1+a3.n2+a3.n3)/3);


    aluno a4 = new aluno();
    a4.nome="Renan";
    a4.matricula= 93;
    a4.turma = 2.52f;
    a4.periodo= "Matutino";
    a4.n1= 8.3f;
    a4.disciplina = "Filosofia";

  



    System.out.println ("Aluno:" + a1.nome + " Matrícula: " + a1.matricula + " Turma: " + a1.turma + " Período:" + a1.periodo);
    System.out.println ("Aluno:" + a2.nome + " Matrícula: " + a2.matricula + " Turma: " + a2.turma + " Período:" + a2.periodo);
    System.out.println ("Aluno:" + a3.nome + " Matrícula: " + a3.matricula + " Turma: " + a3.turma + " Período:" + a3.periodo);

    
    System.out.println ("Aluno: " + a4.nome + " Matrícula: " + a4.matricula + " Turma: " + a4.turma + " Período: " + a4.periodo + " Disciplina: " + a4.disciplina + " Nota: " + a4.n1);


    System.out.println ("Aluno:" + a1.nome + " Matrícula: " + a1.matricula + " Turma: " + a1.turma + " Disciplina: " + a1.disciplina + " Média: " + a1.media);

    System.out.println ("Aluno:" + a2.nome + " Matrícula: " + a2.matricula + " Turma: " + a2.turma + " Disciplina: " + a2.disciplina + " Média: " + a2.media);

    System.out.println ("Aluno:" + a3.nome + " Matrícula: " + a3.matricula + " Turma: " + a3.turma + " Disciplina: " + a3.disciplina + " Média: " + a3.media);

          
}
}


