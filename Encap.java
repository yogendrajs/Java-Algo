class Encapsulation {
	private String name;
	private int acc;

	public void setNumber(int num){
		this.acc = num;
	}public void setName(String name){
		this.name = name;
	}public int getNumber(){
		return acc;
	}public String getName(){
		return name;
	}
}
class Encap {
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setNumber(23);
		obj.setName("yogendra");
		try {Thread.sleep(1000);} catch (Exception e) {}
		System.out.println("my name is " + obj.getName() + " and my age is " + obj.getNumber());
	}
}
