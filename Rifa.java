/** Aluno: Atila D. Grings  Prova GB Lab1   turma 53*/

public class Rifa{
    private Apostador apostador[];
    private static double valorAposta = 5.0;
    
    public Rifa(int qtdRifas){
        apostador = new Apostador[qtdRifas];
    }
    
    public boolean confereApostas(){
        int contador =0;
        for (int i=0; i<apostador.length;i++){
            if (apostador[i]!=null) contador++;}
        if (contador==apostador.length) return true;
        return false;
    }
    
    public void exibirRifa(){
        System.out.println("\f------------------------------------------");
        System.out.println("            - LISTA DE APOSTAS -            ");
        for (int i=0; i<apostador.length;i++){
            String nome = "";
            if(apostador[i]!=null) nome = ((Pessoa)apostador[i]).getNome();
           System.out.printf("\n%-6s%-15s",i+1+" - ",nome);
        }
        System.out.println("\n------------------------------------------\n\n");
    }
    
    public boolean vendeUmNumero(Apostador comprador){
        if (confereApostas()==true) return false;
        Teclado t = new Teclado();
        exibirRifa();
        int numero =0;
        do{
            numero = t.leInt("Em qual o número da rifa você deseja apostar?");
        }while (numero <=0 || numero> apostador.length || apostador[numero-1]!=null);
        apostador[numero-1] = comprador;
        comprador.pagaNumero(valorAposta);
        return true;
    }
    
    public String[] listaApostadores(){
        int contador = 0;
        for (int i=0;i<apostador.length;i++){
            if(apostador[i]!=null)contador ++;}
        if (contador==0) return null;
        String [] listaApostadores = new String[contador];
        int posicao =0;
        for (int i=0;i<apostador.length;i++){
            if(apostador[i]!=null){
                listaApostadores[posicao]= (((Pessoa)apostador[i]).getInicialNome()+i);
                posicao ++;}}
        return listaApostadores;
    }
}