/** Aluno: Atila D. Grings  Prova GB Lab1   turma 53*/

public class Apostador extends Pessoa{
    private double totalGanho;
    
    public Apostador (String nome){
        super(nome);
    }
    
    public void pagaNumero(double numero){
        totalGanho+=numero;
    }
    
    public void exibeDados(){
        super.exibeDados();
        System.out.print("Total gasto em apostas: R$ "+totalGanho);
    }
    
    public double getTotalGanho(){
        return totalGanho;
    }
}