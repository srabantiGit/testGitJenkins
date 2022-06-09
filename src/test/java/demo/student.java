package demo;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float maths = 80;
		float physics = 82;
		float geography = 78;
		float english = 75;
		float result;
		float average;
		
		student obj = new student();
		result = obj.addNumbers(maths, physics, geography, english);
		average = (result/4);
		System.out.println("Total marks obtained " + result);		
		System.out.println("Average is " + average);
		if(average>=40 && average<60) {
			System.out.println("Second Class");
		 }else if(average>=60 && average<80){
			System.out.println("First Class");
		}else if(average>=80 && average<=100){
			System.out.println("Distinction");
		}else {
			System.out.println("Fail");
		}
		
	}
	
	public float addNumbers(float maths, float physics, float geography, float english) {
		float sum = maths + physics + geography + english ;
		return sum;
	}

}
