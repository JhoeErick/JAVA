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
   static int codigo_estado;
   static int sigla_estado;
   public static void main(String[] args) {
   entradaAbrir();
   codigo_estado = LerInt("Digite a sigla do estado: ");
   entradaFechar();
   switch (codigo_estado) {
    case 50:
    System.out.println("Estado: Mato Grosso do Sul - Sigla: MS - Região: Centro Oeste.");
        break;
    case 51:
    System.out.println("Estado: ato Grosso - Sigla: MT - Região: Centro Oeste.");
       break;
    case 52:
    System.out.println("Estado: Goiás - Sigla: GO - Região: Centro Oeste");
       break;
    case 53:
    System.out.println("Estado: Distrito Federal - Sigla: DF - Região: Centro Oeste");
       break;
    default:
    System.out.println("O codigo de estado que colocou não esta Registrado no nosso sistema.");
        break;
   }


  }}