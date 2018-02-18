package oops;

public class Maintest2 implements i1 {

	private static class fc
	{
		public void test()
		{
			System.out.println("test methods");
		}
	}
	public static void main(String[] args) {
		Maintest2 mt2 = new Maintest2();
		int y = mt2.t1(1, 2);
		System.out.println(y);
		test t = new test();
		t.t11();
		
		fc f = new fc();
		f.test();

	}
	@Override
	public int t1(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
