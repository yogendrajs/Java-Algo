class LargestNumber {
	public static void main(String[] args) {
		int[] array = {23,26,45,94,75,39,83,67};
		int max = array[0];

		for (int i = 0; i < array.length; i ++){
			// to find the smallest number 
			// use array[i] < max
			// max = array[i]
			if (array[i] > max){
				max = array[i];
			}
		}System.out.println(max);
	}
}
