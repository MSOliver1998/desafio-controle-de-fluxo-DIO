import java.util.Scanner;

public class Contador{
    public static void main(String[] args){
        Scanner terminal=new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm= terminal.nextInt();
        System.out.println("digite o segundo parametro");
        int parametroDois=terminal.nextInt();
        terminal.close();
        try {
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois<parametroUm){
            throw new  ParametrosInvalidosException();
        }
        int contagem=parametroDois-parametroUm ;
        System.err.println("a contagem será de " + contagem + " números" );
        for(int i=1;i<=contagem;i++){
            System.out.println("contando o número " + i);
        }

    }

}