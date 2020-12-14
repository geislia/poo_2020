package src;

public class Moto {

	int potencia;
	int tempo;
	Pessoa pass;

	public Moto() {

		this.potencia = 1;
		this.tempo = 0;
		this.pass = null;

	}

	public Moto(int potencia) {

		this.potencia = potencia;
		this.tempo = 0;
		this.pass = null;

	}

	public void comprarTempo(int valor) {
		this.tempo += tempo;
	}

	public void in(Pessoa pass) {

		if (this.pass == null) {
			this.pass = pass;
		} else {
			System.out.println("fail: moto ocupada");
		}
	}

	public Pessoa out() {

		if (this.pass != null) {
			Pessoa aux;
			aux = this.pass;
			this.pass = null;
			return aux;
		}

		System.out.println("fail: moto vazia");
		return null;

	}

	public void drive(int tempo) {

		if (this.pass != null) {
			
			if (this.pass.idade <= 10) {
				
				if (this.tempo > 0) {
					
					if(this.tempo >= tempo) {
						this.tempo -= tempo;
					}else {
						System.out.println("fail: andou "+this.tempo+" min e acabou o tempo");
					}
	
				} else {
					System.out.println("fail: tempo zerado");
				}
				
			} else {
				System.out.println("fail: muito grande para andar de moto");

			}

		} else {
			System.out.println("fail: moto vazia");
		}

	}
	
	public String buzinar() {
		String buzina = "P";
		for (int i = 0; i < this.potencia; i++) {
			buzina.concat("e");
		}
		buzina.concat("m");
		
		return buzina;
	}
	
	public String toString() {
        return "potencia: " + this.potencia + ", minutos: " + this.tempo + ", pessoa: " + this.pass;
    }

}

