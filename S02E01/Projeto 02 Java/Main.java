
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carro bumblebee = new Carro();
		
		System.out.println("###################################################");
		System.out.println("#  O comando \"$in\" insere uma pessoa no carro.    #");
		System.out.println("#  O comando \"$out\" retira uma pessoa do carro.   #");
		System.out.println("#  O comando \"$show\" mostra o estado do carro.    #");
		System.out.println("#  O comando \"$fuel 10\" adiciona 10 l de gas.     #");
		System.out.println("#  O comando \"$drive 10\" dirige 10 km.            #");
		System.out.println("#  O comando \"$end\" encerra o programa.           #");
		System.out.println("###################################################");
		System.out.println("");
		
		while(true) {
			String cmd[] = scanner.nextLine().split(" ");
			
			if(cmd[0].equalsIgnoreCase("$in")) {
				bumblebee.in();
			}
			else if(cmd[0].equalsIgnoreCase("$out")){
				bumblebee.out();
			}
			else if(cmd[0].equalsIgnoreCase("$show")){
				System.out.println(bumblebee);
			}
			else if(cmd[0].equalsIgnoreCase("$fuel")){
				
				if(cmd.length == 1) {
					System.out.println("fail: Valor de gasolina não informado");
					System.out.println("ex.: $fuel 10");
				}
				else {
					int gas = Integer.parseInt(cmd[1]);
					bumblebee.fuel(gas);
				}
			}
			else if(cmd[0].equalsIgnoreCase("$drive")) {
				
				if(cmd.length == 1) {
					System.out.println("fail: Valor de Km não informado");
					System.out.println("ex.: $drive 10");
				}
				else {
					int km = Integer.parseInt(cmd[1]);
					bumblebee.drive(km);
				}
			}
			else if(cmd[0].equalsIgnoreCase("$end")) {
				System.out.println("É hora de dar tchauu!!");
				break;
			}
			else {
				System.out.println("Este comando não existe");
				System.out.println("###################################################");
				System.out.println("#  O comando \"$in\" insere uma pessoa no carro.    #");
				System.out.println("#  O comando \"$out\" retira uma pessoa do carro.   #");
				System.out.println("#  O comando \"$show\" mostra o estado do carro.    #");
				System.out.println("#  O comando \"$fuel 10\" adiciona 10 l de gas.     #");
				System.out.println("#  O comando \"$drive 10\" dirige 10 km.            #");
				System.out.println("#  O comando \"$end\" encerra o programa.           #");
				System.out.println("###################################################");
			}
		}

	}

}
