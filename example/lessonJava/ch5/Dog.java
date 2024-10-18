package lessonJava.ch5;

/**
 * 狗狗类，宠物的子类。
 * 
 */
public class Dog extends Pet {
	private String strain;// 品种
	/**
	 * 有参构造方法。
	 * @param name   昵称 * @param strain   品种
	 */
	public Dog(String name, String strain) {
		super(name); //此处不能使用	this.name=name;
		this.strain = strain;
	}
	public void catchingFlyDisc(){
		System.out.println(this.getName() + "is catching FlyDisc");
		super.setHealth(super.getHealth() - 10);
		super.setLove(super.getLove() + 5);
	}

	@Override
	public void print() {
		System.out.println( "宠物的自白：\n我的名字叫" +
				this.getName() + "，我的健康值是" + this.getHealth()
				+ "，我和主人的亲密程度是" + this.getLove() + "品种是"+this.getStrain()+"。");
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public String getStrain() {
		return strain;
	}

}

