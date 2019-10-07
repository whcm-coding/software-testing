package calculator;

public class Calculator {
	private int result;
	public void clear() {
		this.result = 0;
	}
	public void add(int n) {
		this.result += n;
	}
	public void substract(int n) {
		this.result -= n;
	}
	public int getResult() {
		return this.result;
	}
}
