package hoa.dev;

public class MainApp {
	/**
	 * Hoa GA
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p = new Person ();
       p.name = "Van Hoa";
       p.old = 22;
       System.out.println("Ten: " + p.name+" - Tuoi:"+p.old);
       Student std = new Student();
       std.name = "Student1";
       std.old = 22;
       System.out.println("Ten: " + std.name+" - Tuoi:"+std.old);
}

}
