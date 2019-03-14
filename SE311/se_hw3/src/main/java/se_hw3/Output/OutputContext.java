package se_hw3.Output;

import se_hw3.IOMode;
import se_hw3.LineStorage;
import se_hw3.Input.ConsoleInputStrategy;
import se_hw3.Input.FileInputStrategy;
import se_hw3.Observer.PassLinesObserver;

public class OutputContext {

	private OutputStrategy strategy;
	
	public OutputContext() {
		strategy = new ConsoleOutputStrategy();
	}	
	
	public void writeLine(String line) {
		strategy.writeLine(line);
	}
	
	public void writeLines(LineStorage lines) {
		strategy.writeLines(lines);
	}
	
	public void setContext(IOMode mode, String[] args) {
		
		switch (mode) {
		case Console:
		case Interactive:
			strategy = new ConsoleOutputStrategy();
			break;
		case File:
			strategy = new FileOutputStrategy(args);
			break;
		}
		
	}
	
}
