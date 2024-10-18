package lessonJava.ch5;

/**
 * 宠物类，狗狗和企鹅的父类。
 * 
 */
public abstract class Pet {//父类Object
	private  String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 0;// 亲密度
	/**
	 * 无参构造方法。
	 */
	public Pet() {
		this.health = 95;
		System.out.println("执行宠物的无参构造方法。");
	}

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;

	}

	/**
	 * 有参构造方法。
	 * @param name  昵称
	 */

	public Pet(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	/**
	 * 输出宠物信息。
	 */
	public  void print(){}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setLove(int love) {
		this.love = love;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}