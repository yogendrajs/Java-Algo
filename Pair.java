class Pair {
	public static void main(String[] args) {
		int[] a = {2,5,1,3,2,3,4,9,1,5,3,1,5,8,2,4,8,9,3,9,5,2,9};
		int[] b = {0,1,2,3,4,5,6,7,8,9};

		int temp = 0;
		for (int i = 0; i < b.length; i ++){
			for (int j = 0; j < a.length; j ++){
				if (b[i] == a[j]){
					temp += 1;
				} 
			}if (temp == 0){}
			else if (temp % 2 == 0){
				System.out.println(b[i] + "-" + temp/2);
			}else {
				temp = temp - 1;
				System.out.println(b[i] + "-" + temp/2);
			}temp = 0;
		}
	}
}