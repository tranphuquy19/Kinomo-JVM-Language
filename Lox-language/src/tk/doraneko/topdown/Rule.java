package tk.doraneko.topdown;

public class Rule {
	public String left, right;

	public Rule(String left, String right) {
		this.left = left;
		this.right = right;
	}

	public String ToFineString() {
		String s = left + "-->";
		for (int i = 0; i < right.length(); i++) {
			s += " " + right.charAt(i);
		}
		return s;
	}
}
