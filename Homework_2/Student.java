public class Student {
	int std_year=0;
	String name;
	int id;

	public Student(String name, int id){
		this.name = name;
		this.id = id;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setId(){
		this.id = id;
	}

	public void study_year(){
		std_year++;
		
		System.out.println(std_year);
	}

		public static void main(String[] args){

			Student me = new Student("me", 1);
			me.study_year();
		}

}