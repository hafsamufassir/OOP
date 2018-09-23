public class Student {
	private int yearOfStudy = 1;
	private String name;
	private int id;

	public Student(String name, int id){
		this.name = name;
		this.id = id;
		yearOfStudy++;
	}

	public String getName(String name){
		return name;
	}

	public String getId(){
		return id;
	}

	public int getYear(){
		return yearOfStudy;
	}

		public static void main(String[] args){

			Student s = new Student("me", 1);
			System.out.println(s.getName() + " " +s.getId() + " " + s.getYear());
		}
}