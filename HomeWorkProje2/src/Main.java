
public class Main {

	public static void main(String[] args) {
		�nstructor instructor1 = new �nstructor();
		instructor1.name= "engin";
		instructor1.lastName="dermiro";
		instructor1.age=28;
		instructor1.id=1;
		instructor1.email="engin153@gmail.com";
		instructor1.activeOrPassive=true;
		instructor1.log�n=true;
		student student2 = new student();
		student2. activeOrPassive = true;
		student2.name = "h�seyim";
		student2.lastName="eser";
		student2.age=19;
		student2.comment = "ders cok guzel";
		student2.email="huseyinesr1@gmail.com";
		student2.log�n=true;
		student2.rollCall=true;
		UserManager manager = new UserManager();
		manager.add(instructor1);
		//manager.delete(instructor1);
		//manager.update(instructor1);
		manager.add(student2);
		//manager.delete(student2);
		//manager.update(student2);

	}

}
