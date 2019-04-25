class Fibo {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		int x = 0;

		while (x < 20){
			c = a + b;
			System.out.println(a);
      try {Thread.sleep(1000);} catch (Exception e) {}
			a = b;
			b = c;
			x ++;
		}
	}
}
