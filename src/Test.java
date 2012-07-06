public class Test {

	public static void changeStr(String str) {
		str = "welcome";
	}

	public static void main(String[] args) {
		String str = "1234";
		changeStr(str);
		System.out.println(str);
		Test test = new Test();
		test.changeStr1(str);
		System.out.println(str);
		int temp = 12;
		test.changeStr2(temp);
		System.out.println(temp);
		Integer temp1 = new Integer(12);
		test.changeStr3(temp1);
		System.out.println(temp1);
		myClass temp2 = new myClass(12);
		test.changeStr4(temp2);
		System.out.println(temp2);
		test.changeStr5(temp2);
		System.out.println(temp2);
	}

	public void changeStr1(String str) {
		str = "welcome";
	}

	public void changeStr2(int str) {
		str = 34;
	}

	public void changeStr3(Integer str) {
		str = new Integer(34);
	}

	public void changeStr4(myClass str) {
		str = new myClass(34);
	}

	public void changeStr5(myClass str) {
		str.num = 34;
	}
}