package UI;

public class Purchase extends OperationOnProduct {

    private String vendorName;
    private double totalAmount;

    public synchronized String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public synchronized double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

class pThread1 extends Thread{
    Purchase p1 = new Purchase();
    
    public void run(){
            p1.getVendorName();
	}
}

class pThread2 extends Thread{
    Purchase p2 = new Purchase();
    
    public void run(){
            p2.getTotalAmount();
	}
}