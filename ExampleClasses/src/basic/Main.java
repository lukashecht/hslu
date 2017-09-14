package basic;

public class Main {

	public static void main(String[] args) {
		FileReaderExample fileReader = new FileReaderExample();
		fileReader.readFileFromPath("D:\\OneDrive\\STV Sempach\\LA Jugend\\Schuljahr 17 18\\Turnerabend\\Turnerabend Nummer LA Jugend.txt");
	
		ModuloExample modulo = new ModuloExample();
		modulo.isDividableBySeven(17);
		modulo.isDividableBySeven(14);
		modulo.isDividableBySeven(3);
		
		LambdaExample lambda = new LambdaExample();
		lambda.run();
	}
}
