package application;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.print("Entre com o numero de funcionarios: ");
        int func = sc.nextInt();
        for (int i=0; i<func; i++){
            System.out.println("Funcionario #" + (i+1) + " ");
            System.out.print("Funcionario terceirizado? (SIM/NÃO) ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Horas trabalhadas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por horas trabalhadas: ");
            double valorPorHora = sc.nextDouble();
            if(ch == 's'){
                System.out.print("Digite o valor da taxa adicional: ");
                double despesasAdicionais = sc.nextDouble();
                Funcionario fun = new FuncionarioTerceirizado(nome, horas, valorPorHora, despesasAdicionais);
                list.add(fun);
            }else {
                Funcionario fun = new Funcionario(nome, horas, valorPorHora);
                list.add(fun);
            }
        }
        System.out.println("Lista de funcionarios: ");
        for(Funcionario fun : list){
            System.out.println(fun.getNome() + " - $ " + String.format("%.2f ", fun.pagamento()));
        }

    }
}
