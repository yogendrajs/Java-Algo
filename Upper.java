class Upper {
	public static void main(String[] args) {
		String name = "yogendra";
		for (int i = 0; i < name.length(); i ++){
			char x = name.charAt(i);
			char news = Character.toUpperCase(x);
			System.out.println(news);
		}
	}
}