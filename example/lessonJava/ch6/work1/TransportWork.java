package lessonJava.ch6.work1;

public class TransportWork {
    String TransportId, weight;

    private TransportWork(String transportId, String weight) {
        TransportId = transportId;
        this.weight = weight;
    }
    public static TransportWork getInstence(String id, String weight){
        return new TransportWork(id, weight);
    }

    private void beforeTrans(){
        System.out.println("订单开始处理,仓库拣货中...");
        System.out.println("货物重量: " + weight + "kg");
        System.out.println("运货人已通知");
        System.out.println("快递单号: " + TransportId);
        System.out.println("===========================");
    };
    private void onTrans(Truck worker){
        System.out.println("运货人" + worker.master + "正在驾驶编号为" + worker.no + "的" + worker.brand + "发送货物");
        worker.transport();
        System.out.println("货物当前坐标为" + phone.getLocation());
        System.out.println("============================");
    };
    private void afterTrans(Truck worker){
        System.out.println("货运任务已完成");
        worker.re();
    };
    public void trans(Truck worker){
        this.beforeTrans();
        this.onTrans(worker);
        this.afterTrans(worker);
    }
}
