package fa222rw_assign4.Time;

public class StringConcat {
	public static void main(String[] args) {
		int runs = 10;
		int times = 31000;
		
		
		String str = "";
		String a = "a";
		
		Runtime mem = Runtime.getRuntime();
		mem.gc();
		long start = System.currentTimeMillis();
		for (int i = 0; i < runs; i++) {
			for (int j = 0; j < times ; j++) {
				str += a;
			}
		}
		long stop = (System.currentTimeMillis()- start)/runs;
		long con = str.length();
		System.out.print("memory: " + con + " time: " + stop + " " + con);
	}
}
