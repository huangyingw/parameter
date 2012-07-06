public class Test {

	public static void changeStr(String str) {
		str = "welcome";
	}

	public void changeStr1(String str) {
		str = "welcome";
	}

	public void changeStr2(int str) {
		str = 34;
	}

	public void changeStr3(Integer str) {
		str = 34;
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
		Integer temp1 = 12;
		test.changeStr3(temp1);
		System.out.println(temp1);
	}
}