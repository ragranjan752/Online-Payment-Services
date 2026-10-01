package OnlinePyamentSystem;

public class CardPayment implements Payment{
    @Override
    public void pay(double amount,User user){
        System.out.println("User Name: "+user.getName()+"\n"+"Payment of "+amount+" Done via Card"+"\n"+
                "From Account Number"+ user.getAccountNumber());
    }

}
