import java.util.Scanner;

public class NNum {
    public static void main(String[] args) {
        String Continuar = "Y";
        Integer num = 0;
        Scanner scan = new Scanner(System.in);
        while (Continuar.equals("Y")){
            System.out.println("Digite o número: ");
            num = scan.nextInt();
            if (num > 0){
                System.out.println("Positivo");
            } if (num < 0){
                System.out.println("Negativo");
            } if (num == 0){
                System.out.println("Zero");
            }
            System.out.println("Deseja continuar? Y/N");
            Continuar = scan.next().toUpperCase();
        }
    }
}
