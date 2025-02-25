
import java.util.Scanner;


public class ConversorTemperatura{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversao! ");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsisu  ");


        int escolha = scanner.nextInt();

        if (escolha == 1) {
            converterCparaF();
            
        } else if (escolha == 2) {
            converterFparaC();
            
        } else {
            System.out.println("Opcao invalida! ");
        }

        scanner.close();
        
    }

    public static void converterCparaF() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");

        double celsius = scanner.nextDouble();

        double Fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius +  "C  convertido e igual a: " + Fahrenheit + "F");



        scanner.close();

    }

    public static void converterFparaC() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit: ");

        double  Fahrenheit= scanner.nextDouble();

        double celsius = (Fahrenheit - 32 ) * 5/9;

        System.out.println(Fahrenheit +  "F  convertido e igual a: " + celsius + "C");

        

        scanner.close();

    }





}