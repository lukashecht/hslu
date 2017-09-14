package basic;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExample extends SystemOutPrinter {
	
	public void run() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Lukas");
		list.add("Heidi");
		list.add("Sarah");

		//Lambda/Anonyme Functions
		Consumer<String> printNameWithSuffix = (String name) -> printText(name + " #");
		Consumer<String> printNameWithPrefix = (String name) -> printText("#" + name);
		list.forEach(printNameWithSuffix);	
		list.forEach(printNameWithPrefix);	
	}
}
