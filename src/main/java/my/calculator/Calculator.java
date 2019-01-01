package my.calculator;

public class Calculator {
	public Integer add(Integer a, Integer b) {
		return a + b;
	}
	
	public Integer addAll(Integer... num) {
		int sum = 0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}
}
