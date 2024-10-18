package lessonJava.ch5;

/**
 * 测试类，测试类的继承
 */
public class Test {
	public static void main(String[] args) {
//		Pet pet=new Pet("宠物");
//		pet.print();
		// 2、创建狗狗对象dog并输出信息
		Dog dog = new Dog("欧欧", "雪娜瑞");
		dog.print();
		// 3、创建企鹅对象pgn并输出信息
		Penguin pgn = new Penguin("楠楠", "Q妹");
		pgn.print();
		master m = new master("王", 200);
		System.out.println(m.getPet("1") instanceof Dog);
		System.out.println(m.getPet("2") instanceof Penguin);
		System.out.println(m.getPet("1") instanceof Penguin);
		m.play(m.getPet("1"));
		m.play(m.getPet("2"));
	}
}