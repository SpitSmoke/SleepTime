import java.util.Scanner;

public class HoraDeAcordar {
    public static void main(String[] args) {

        int horaDormir, minutosDormir, horasSono;
        int totalMinutos, horaAcordar, minutosAcordar;


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite a hora que você vai dormir (0-23): ");
        horaDormir = scanner.nextInt();

        System.out.print("Digite os minutos que você vai dormir (0-59): ");
        minutosDormir = scanner.nextInt();

        System.out.print("Digite quantas horas você deseja dormir: ");
        horasSono = scanner.nextInt();


        totalMinutos = (horaDormir * 60) + minutosDormir + (horasSono * 60);


        horaAcordar = totalMinutos / 60;
        minutosAcordar = totalMinutos % 60;


        horaAcordar = horaAcordar % 24;


        System.out.printf("Você deve acordar às %d:%02d\n", horaAcordar, minutosAcordar);


        scanner.close();
    }
}