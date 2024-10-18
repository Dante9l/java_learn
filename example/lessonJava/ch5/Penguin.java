package lessonJava.ch5;

/**
 * 企鹅类，宠物的子类。
 *  
 */
public class Penguin extends Pet {
	private String sex;// 性别
	/**
	 * 有参构造方法。
	 * @param name 昵称
	 * @param sex 性别
	 */
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
		//this.print();
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void swimming(){
		System.out.println(this.getName() + "is swimming");
		super.setHealth(super.getHealth() - 10);
		super.setLove(super.getLove() + 5);
	}
	public void print() {
//		super.print();
		System.out.println("宠物的自白：\n我的名字叫" +
				this.getName() + "，我的健康值是" + this.getHealth()
				+ "，我和主人的亲密程度是" + this.getLove() + " "+sex+"。");
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
