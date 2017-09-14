package pack;

public class ModuloExample extends SystemOutPrinter{

	public void isDividableBySeven(int number) {
		printText("Module Example Start");
		if((number % 7)==0) {
			printText(number + " ist durch 7 teilbar.");
		}else {
			printText(number + " ist nicht durch 7 teilbar.");	
		}			
		printText("Module Example End");
	}
}


