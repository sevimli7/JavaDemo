
public class Main {

	public static void main(String[] args) {
		
		
		
		Course course1=new Course();
		course1.id=1;
		course1.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)";
		course1.instructor="Engin Demiro�";
		course1.price=0;
		course1.durationCourse=16;
		course1.description="C# temellerinden, profesyonelli�e ve angular ile geli�tirme";
		course1.categoryId=1;
		
		Course course2=new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","java ile program geli�tirme ve react", 0,"Engin Demiro�", 16,1);
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.update(course2);
		
		Course[] courses=new Course[] {course1,course2};
		for (Course course:courses) {
			System.out.println(course.name);
		}
		System.out.println(courses.length);
		
		Category category1=new Category();
		category1.id=1;
		category1.name="programlama";
		
		CategoryManager categoryManager=new CategoryManager();
		categoryManager.add(category1);
		categoryManager.update(category1);
		categoryManager.delete(category1);
		
		Category[] categories=new Category[] {category1};
		for(Category category:categories) {
			System.out.println(category.name);
		}
	}
 
}
