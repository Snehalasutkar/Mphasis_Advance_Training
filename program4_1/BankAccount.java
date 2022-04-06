package program4_1;

public class BankAccount {
 int accNo;
 String custName;
 String accType;
 float balance;
 public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
public float getBalance() {
	if( balance <1000)
    {
    try
    {   
        throw new NumberFormatException();
    }
    catch(NumberFormatException nw)
    {
        System.out.println("Balance is low"+balance);
    }
    }
   
   
    return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
public BankAccount() {
    
    this.accNo =121325;
    this.custName = "SNEHAL";
    this.accType = "Saving";
    this.balance = 450000;
}




public BankAccount(int account_number, String name, String account_type,
        float balance) {
   
    this.accNo = account_number;
    this.custName = name;
    this.accType = account_type;
    this.balance = balance;
}
public void deposit(float amt) {
	if(amt<0)
	{
	try {
		throw new NumberFormatException();
	} catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("Negative Amount cannot be deposited in account");
	}
	}
	else {
		balance=getBalance();
		System.out.println("Current balance is="+balance);
	}
}
public void withdraw(float amt) {
	if(amt >1000)
	{
		try {
			throw new NumberFormatException();
		} catch (NumberFormatException  e) {
		
			System.out.println("Insuficient balance ");
		}
	}
	else {
		balance=getBalance();
		System.out.println("Current balance is="+balance);
	}
}
	void display()
    {
   System.out.println("Balance is ="+getBalance());   
    }
  
  
  
  
   public static void main(String[] args) {
      
      
       BankAccount b=new BankAccount();
       b.deposit(2000);
       b.display();
       b.withdraw(500);
       b.display();
       b.withdraw(2000);
       b.getBalance();
       b.display();
      
      
      
   }
  

  
 
}
