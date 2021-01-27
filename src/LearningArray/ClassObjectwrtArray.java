package LearningArray;

public class ClassObjectwrtArray {
	/*
	 * this program prints the class object array associated with the array
	 */
	public static void main(String[] args) {
		int[] a = new int[6];
		byte[] b = new byte[6];
		short[] c = new short[6];
		long[] d = new long[6];
		String[] s = new String[6];

		System.out.println(a.getClass());
		System.out.println(b.getClass());
		System.out.println(c.getClass());
		System.out.println(d.getClass());
		System.out.println(s.getClass());

	}

}
