package tk.doraneko.topdown;

public class Program {

	public static void main(String[] args) {
		Parser parser = new Parser();
		
		parser.addRule("S", "B+C");
		parser.addRule("B", "(D=D)");
		parser.addRule("D", "1");
		parser.addRule("D", "2");
		parser.addRule("D", "3");
		parser.addRule("D", "4");
		parser.addRule("D", "5");
		parser.addRule("D", "9");
		
		parser.PrintAllRules();
		if(parser.Process("(1=5)+9")) {
			parser.PrintSteps();
		}
	}

}
