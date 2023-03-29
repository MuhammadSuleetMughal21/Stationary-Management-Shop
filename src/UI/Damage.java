package UI;


public class Damage extends OperationOnProduct {
    
    private String cause;

    public synchronized String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}

class dThread1 extends Thread{
	Damage d1=new Damage(); 
	
        public void run(){
            d1.getCause();
	}
}
