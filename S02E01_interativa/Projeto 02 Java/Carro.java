
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

}

