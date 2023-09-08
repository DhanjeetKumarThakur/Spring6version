package com.learning;

public class Exam {
	
	String concatWithMethod(String[] arr) {
		return arr[0].concat(arr[1]);
	}
	
	String concatWithOperator(String[] arr) {
		return arr[0]+(arr[1]);
	}
	
	public static void main(String[] args) {
//		Exam obj = new Exam();
//		String[] arr = new String[2];
//		String result1 = obj.concatWithMethod(arr);
//		String result2 = obj.concatWithOperator(arr);
//		System.out.println(result1==result2);
		
//		try {
//			int value = 90/6;
//			System.out.println(value);
//		}catch(NullPointerException e) {
//			System.out.println(e);
//		}finally {
//			System.out.println("Executed");
//		}
		//System.out.println("Done");
		//List<Integer> list1 = new ArrayList<>();
		//List<Integer> list2 = new ArrayList<>();
		
//		al.add(96);
//		System.out.println(al);
//		List<String> al = new ArrayList<String>();
//		al.add("Hello");
//		al.add(10);
		
		Double d1 = Double.valueOf(0);
		Double d2 = Double.valueOf(0);
		Double d3 = Double.valueOf(0);
		
		boolean b12 = d1 == d2;
		boolean b32 = d3 == d2;
		boolean b13 = d1 == d3;
		System.out.println(b12+" "+b32+" "+b13);
	}
}
