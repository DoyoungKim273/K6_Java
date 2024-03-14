package chap3_검색;

public class List_prac02 {
	public static void main(String[] args) { //main 메서드는 public 클래스 안에만 들어갈 수 있다
		Dog mydog = new Dog("jindo", 5); // 클래스명 참조변수 = new 객체명(매개변수 2개)
//		System.out.println(mydog.breed + " " + mydog.age);
//		System.out.println();
//		
//		mydog.breed = "jindo2"; // 참조변수의 매개변수에 값을 새롭게 할당
//		mydog.age = 52;
//		System.out.println(mydog.breed + " " + mydog.age);
//		
		mydog.bark();
		
		System.out.println(mydog.getBreed() + "  " + mydog.getAge());
		
		String str = "hahaha";
		mydog.setBreed(str);
		int num = 0;
		mydog.setAge(num);
		
		System.out.println(mydog.getBreed() + " " + mydog.getAge());
		
		Dog[] arr = new Dog [3];
		arr[0] = new Dog("jindo1", 1);
		arr[1] = new Dog("jindo2", 2);
		arr[2] = new Dog("jindo3", 3);
		
//		Dog[] arr = {new Dog("jindo1", 1), new Dog("jindo2", 2), new Dog("jindo3", 3)};
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString()); // 문자열을 출력하기 위해서는 String toString 메서드를 써야함
		}
	}
}

class Dog{
	private String breed; // 필드 선언
	private int age;
	
	Dog(String breed, int age){ // 생성자
		this.breed = breed; // 필드에 선언된 breed, age와 생성자의 매개변수로 전달된 b, a는 서로 다르기에 같다고 말해줘야함
		this.age = age;
	}
	
	void bark() { // 메소
		System.out.println();
		System.out.println("Woof");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return breed + " " + age;
	}

	
}

//class Dog2{
//	String breed = "jindo2";
//	int age = 52;
//	
//	void bark2() {
//		System.out.println("Woof2");
//	}
//	
//	public static void main(String[] args) {
//		Dog2 mydog2 = new Dog2();
//		mydog2.bark2();
//	}
//}

