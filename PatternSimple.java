class PatternSimple {
	public static void main(String[] args) {
		String a = "*";
		int b = 1;

		String c = a;
		while (b < 10){
			System.out.println(a);
			a = a + c;
			b = b + 1;
		}
	}
}