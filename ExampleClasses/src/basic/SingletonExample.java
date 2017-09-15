package basic;

import java.util.ArrayList;

public final class SingletonExample extends SystemOutPrinter {
	
	private static SingletonExample _instance;
	private int _number;
	
	private SingletonExample() {
		_number = 1000;
	}
	
	public static SingletonExample getInstance() {
		if(_instance == null) {
			_instance = new SingletonExample();
		}
		return _instance;
	}

	public void printNextNumber() {
		int number = _number;
		_number++;
		printText("Next number is " + number);
	}
}
