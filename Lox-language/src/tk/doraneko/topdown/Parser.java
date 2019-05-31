package tk.doraneko.topdown;

import java.util.ArrayList;

public class Parser {
	public ArrayList<Rule> rules = new ArrayList<Rule>(); 
	public ArrayList<Step> steps = new ArrayList<Step>();
	String w = null;
	
	public void addRule(String left, String right) {
		this.rules.add(new Rule(left, right));
	}
	
	public void PrintAllRules() {
		System.out.println("Rules văn phạm:");
		for (Rule r : rules) {
			System.out.println(" "+r.ToFineString());
		}
	}
	
	public void PrintSteps() {
		System.out.println();
		String w = "S";
		for(Step s : steps) {
			String w0 = DoStep(w, s);
			System.out.println("\t {"+w+"} => {"+w0+"}");
			w = w0;
		}
	}
	
	private String DoStep(String w, Step s) {
		String w1 = w.substring(0, s.position);
		String w2 = w.substring(s.position+1);
		return w1 + rules.get(s.ruleNumber).right + w2;
	}
	
	public boolean Process(String x) {
		steps = new ArrayList<Step>();
		w = x;
		return Try("S");
	}
	
	public int FindNonTerminal(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(i>= w.length()) return i;
			if(s.charAt(i) != w.charAt(i)) return i;
		}
		return -1;
	}
	
	public boolean Try(String s) {
		if(s==w) return true;
		int n = FindNonTerminal(s);
		if(n != -1) {
			for(int i = 0; i<rules.size(); i++) {
				if((rules.get(i)).left.charAt(0) == s.charAt(n)) {
					Step st = new Step(i, n);
					this.steps.add(st);
					if(Try(DoStep(s, st))) return true;
					steps.remove(steps.size() - 1);
				}
				
			}
		}
		return false;
	}
}
