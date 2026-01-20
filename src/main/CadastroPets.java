package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CadastroPets {

    public static void lerMenu(){
        System.out.println(
                "1. Cadastrar um novo pet\n" +
                        "2. Alterar os dados do pet cadastrado\n" +
                        "3. Deletar um pet cadastrado\n" +
                        "4. Listar todos os pets cadastrados\n" +
                        "5. Listar pets por algum critério (idade, nome, raça)\n" +
                        "6. Sair\n");
    }

    public static void lerPerguntas(){

        String path = "c:\\Users\\munof\\IdeaProjects\\CadastroPets\\src\\resources\\formulario.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String lines = br.readLine();
            while (lines != null){
                System.out.println(lines);
                lines = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Erro: arquivo não encontrado " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        try{
            do {
                lerMenu();
                System.out.print("Insira a sua opção: ");
                n = sc.nextInt();
            } while (n <= 0);

            switch (n){
                case 1:
                    lerPerguntas();
                    break;
            }

        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida!");
        }


        sc.close();
    }
}
