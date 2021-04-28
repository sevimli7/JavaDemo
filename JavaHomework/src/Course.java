
public class Course {
	
	public Course() {
		
	
	}
    public Course(int id, String name, String description, double price,String instructor, int durationCourse,int categoryid) {
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.instructor=instructor;
		this.durationCourse=durationCourse;
		this.categoryId=categoryid;
	}
	
	int id;
	int categoryId;
	String name;
	String description;
	double price;
	String instructor;
	int durationCourse;
	
	

}
