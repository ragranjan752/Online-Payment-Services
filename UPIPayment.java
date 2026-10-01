package OnlinePyamentSystem;

public class UPIPayment implements Payment{
    @Override
    public void pay(double amount,User user){
        System.out.println("User Name: "+user.getName()+"\n"+"Payment of "+amount+" Done via UPI"+"\n"+
                "From Account Number "+ user.getAccountNumber());
    }
}
