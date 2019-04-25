class Special {
	public static void main(String[] args) {
		String a = "1";
		String b = "0";
		String c = a;
		String temp;
		for (int i = 0; i < 15; i++){
			for (int j = 0; j < 1; j++){
				System.out.print(a);
				a = b+a;
				temp = b;
				b = c;
				c = temp;
			}System.out.println();
		}
	}
}
