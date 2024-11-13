package lessonJava.ch7.work;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Drink {
    public static final int COFFEE = 1;
    public static final int BEER = 2;
    public static final int MILK = 3;
    public static final int ORANGE_JUICE = 4;
    public static final int WATERMELON_JUICE = 5;
    public static final int TEA = 6;

    public abstract void taste();

    // 静态工厂方法：根据传入的饮料类型返回相应饮料对象
    public static Drink getDrink(int drinkType) throws DrinkNotFoundException {
        return switch (drinkType) {
            case COFFEE -> new Coffee();
            case BEER -> new Beer();
            case MILK -> new Milk();
            case ORANGE_JUICE -> new OrangeJuice();
            case WATERMELON_JUICE -> new WatermelonJuice();
            case TEA -> new Tea();
            default -> throw new DrinkNotFoundException("对不起，没有您输入的饮料类型！");
        };
    }
}
// 咖啡类
class Coffee extends Drink {
    @Override
    public void taste() {
        System.out.println("咖啡：苦");
    }
}

// 啤酒类
class Beer extends Drink {
    @Override
    public void taste() {
        System.out.println("啤酒：微苦");
    }
}

// 牛奶类
class Milk extends Drink {
    @Override
    public void taste() {
        System.out.println("牛奶：香甜");
    }
}

// 橙汁类
class OrangeJuice extends Drink {
    @Override
    public void taste() {
        System.out.println("橙汁：酸甜");
    }
}

// 西瓜汁类
class WatermelonJuice extends Drink {
    @Override
    public void taste() {
        System.out.println("西瓜汁：甜");
    }
}

// 茶类
class Tea extends Drink {
    @Override
    public void taste() {
        System.out.println("茶：清香");
    }
}
class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入饮料类型（用数字1—6表示）：");

        try {
            int drinkType = scanner.nextInt();
            // 调用工厂方法获取饮料对象
            Drink drink = Drink.getDrink(drinkType);
            drink.taste();
        } catch (DrinkNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("对不起，请输入数字！");
        } finally {
            scanner.close();
        }
    }
}
