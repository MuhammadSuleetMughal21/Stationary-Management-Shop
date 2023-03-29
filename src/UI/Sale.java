package UI;

public class Sale extends OperationOnProduct {

    private double totalAmount;

    public synchronized double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
class sThread extends Thread{
    Sale s1 = new Sale();
    
    public void run(){
        s1.getTotalAmount();
	}
}
