/** Aluno: Atila D. Grings  Prova GB Lab1   turma 53*/

public class Pessoa{
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        setIdade(idade);
        setNome(nome);
    }
    
    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 18;
    }
    
    public String getInicialNome(){
        return this.nome.substring(0,3);
    }     
    
    public void exibeDados(){
        System.out.println("\nNome: "+nome+"\t Idade: "+idade);
    }
    
    public void setIdade(int idade){
        if(idade<18 || idade>120) this.idade = 18;
        else this.idade = idade;
    }
    
    public void setNome(String nome){
        int a = nome.length();
        if (a==1) this.nome = nome+"?";
        else if(a==2) this.nome = nome+"??";
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
}