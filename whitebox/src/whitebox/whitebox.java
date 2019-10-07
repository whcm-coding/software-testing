package whitebox;

public class whitebox {
	public static void main(String[] args) {
		func(4,-9,-2);
		func(-4,8,3);
		func(-4,-8,3);
		func(-4,8,6);
	}
	
	public static int func(int a, int b, int c) {
		int k = 0;
		if (a>0 || b<0 || (a+c>0)) {
			k=k+a;
		}else {
			k = k+c;
		}
		if (c>0) {
			k = k+c;
		}
		return k;
	}
}
