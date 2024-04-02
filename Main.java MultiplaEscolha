import java.util.Scanner;
public class Main{


static Scanner entrada;
  
   public static void entradaAbrir(){
       entrada = new Scanner(System.in);
   }
   public static void entradaFechar(){
       entrada.close();
   }
   public static int LerInt(String mensagem){
       System.out.println(mensagem);
       return entrada.nextInt();
   }
   static int dia_da_semana;
   public static void main(String[] args) {
   entradaAbrir();
   dia_da_semana = LerInt("Digite o numero refernte ao dia da semana! ");
   entradaFechar();
   switch (dia_da_semana) {
    case 1:
    System.out.println("Domingo");
        break;
    case 2:
    System.out.println("Segunda-Feira");
       break;
    case 3:
    System.out.println("Terça-Feira");
       break;
    case 4:
    System.out.println("Quarta-Feira");
       break;
    case 5:
    System.out.println("Quinta-Feira");
       break;
    case 6:
    System.out.println("Sexta-Feira");
       break;
    case 7:
    System.out.println("Sabado");
       break;
    default:
    System.out.println("O codigo que colocou não e um dia da semana!");
        break;
   }


  }}
