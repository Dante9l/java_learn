package lessonJava.ch7;

/**
 * 使用throw在方法内抛出异常。
 */
public class Person {
	private String name = "";// 姓名
	private int age = 0;// 年龄
	private String sex = "男";// 性别

	public void setAge(int age) throws Exception {
		if (age > 1 && age < 150) {
			this.age = age;
		} else {
			throw new Exception("年龄异常");
		}
	}

	/**
	 * 设置性别。
	 * @param sex 性别
	 * @throws Exception
	 */
	public void setSex(String sex) throws Exception {
		if ("男".equals(sex) || "女".equals(sex))
			this.sex = sex;
		else {
			throw new Exception("性别必须是“男”或者“女”！");//匿名对象
		}
	}
	/**
	 * 打印基本信息。
	 */
	public void print() {
		System.out.println(this.name + "（" + this.sex 
				+ "，" + this.age + "岁）");
	}
}
class TestForPerson{
	public static void main(String[] args) {
		Person p = new Person();
		try {
			p.setAge(151);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}