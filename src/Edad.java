
public class Edad {
	int menores=0;
	int mayores=0;
	int jubilados=0;
	int []numeros;
	public Edad(int[] numeros) {
		super();
		this.numeros = numeros;
	}
	public String getedad(int []numeros) {
		
		for (int i =0; i<numeros.length;i++) {
			if (numeros[i] <18) {
				menores++;
			} 
			if (numeros[i]>=18 && numeros[i]<65 ) {
				mayores++;
			}
				
			if (numeros[i]>=65) {
				jubilados++;
			}
			
		}
		String frase = "Menores de edad: " + menores + ","
						+ " Mayores de edad: " + mayores + ", Jubilados: " + jubilados; 
		return frase;
	}
}
