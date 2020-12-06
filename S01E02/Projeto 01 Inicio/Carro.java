import java.util.Scanner;

public class Carro {

		public int gas;
		public int gasMax;
		public int pass;
		public int passMax;
		public int km;
		
		public Carro() {
			this.gas = 0;
			this.gasMax = 100;
			this.pass = 0;
			this.passMax = 2;
			this.km = 0;
			
		}
		
		public void in() {
			
			if(pass < passMax) {
				pass += 1; 
				System.out.println("done: Entrou 1 pessoa");
			}
			else {
				System.out.println("fail: Limite de pessoas atingido");
			}
		}
		
		public void out() {
			
			if(pass > 0) {
				pass -= 1; 
				System.out.println("done: Saiu 1 pessoa");
			}
			else {
				System.out.println("fail: Nao ha ninguem no carro");
			}
		}
		
		public void fuel(int value) {
			
			if(gas + value >= gasMax) {
				gas = gasMax;
				System.out.println("done: Enchemo o tanque");
			}
			else {
				gas += value;
				System.out.println("done: "+value+ " lt de gas");
			}
		}
		
		public void drive(int distance) {
			
			if((pass >= 1) && (gas > 0)) {
				
				if(gas >= distance) {
					gas -= distance;
					km += distance;
					System.out.println("done: + "+distance+" km rodados");
				}
				else {
					km += gas;
					System.out.println("fail: Tanque vazio apos andar "+ gas + " km");
					gas = 0;
				}
			}
			else if(pass < 1){
				System.out.println("fail: Nao ha ninguem no carro");
			}
			else {
				System.out.println("fail: Tanque vazio");
			}
		}
		
		public String toString() {
			return "pass=" + pass + ", gas=" + gas + ", km=" + km;
		}

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
			
			/*Main não interativa
			Carro bumblebee = new Carro();
			System.out.println(bumblebee);
			//pass: 0, gas: 0, km: 0
			bumblebee.in();
			bumblebee.in();
			System.out.println(bumblebee);
			//pass: 2, gas: 0, km: 0
			bumblebee.in();
			//fail: limite de pessoas atingido
			System.out.println(bumblebee);
			//pass: 2, gas: 0, km: 0
			bumblebee.out();
			bumblebee.out();
			bumblebee.out();
			//fail: nao ha ninguem no carro
			System.out.println(bumblebee);
			//pass: 0, gas: 0, km: 0

			bumblebee = new Carro();
			bumblebee.fuel(60);
			System.out.println(bumblebee);
			//pass: 0, gas: 60, km: 0

			bumblebee.drive(10);
			//fail: nao ha ninguem no carro

			bumblebee.in();
			bumblebee.drive(10);
			System.out.println(bumblebee);
			//pass: 1, gas: 50, km: 10

			bumblebee.drive(70);
			//fail: tanque vazio apos andar 50 km
			bumblebee.drive(10);
			//fail: tanque vazio
			System.out.println(bumblebee);
			//pass: 1, gas: 0, km: 60

			bumblebee.fuel(200);
			System.out.println(bumblebee);
			//pass: 1, gas: 100, km: 60
			*/
		}
}
