package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Moto motoca = new Moto();

		while (true) {
			String cmd[] = scanner.nextLine().split(" ");

			if (cmd[0].equals("$init")) {
				motoca = new Moto(Integer.parseInt(cmd[1]));
			} else if (cmd[0].equalsIgnoreCase("$in")) {
				motoca.in(new Pessoa(cmd[1], Integer.parseInt(cmd[2])));
			} else if (cmd[0].equalsIgnoreCase("$out")) {
				motoca.out();
			} else if (cmd[0].equalsIgnoreCase("$buzinar")) {
				motoca.buzinar();
			} else if (cmd[0].equalsIgnoreCase("$show")) {
				System.out.println(motoca);
			} else if (cmd[0].equalsIgnoreCase("$drive")) {

				if (cmd.length == 1) {
					System.out.println("fail: Valor de tempo não informado");
					System.out.println("ex.: $drive 10");
				} else {
					int tempo = Integer.parseInt(cmd[1]);
					motoca.drive(tempo);
				}
			} else if (cmd[0].equalsIgnoreCase("$end")) {
				System.out.println("É hora de dar tchauu!!");
				break;
			}
		}
	}
}