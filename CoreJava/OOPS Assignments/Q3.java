package OOPSAssignment;
class CurrentAccount extends Q3 {

    public int getCash(int deposit) {
    	return deposit;

    }
}
class SavingsAccount extends Q3 {


    public int getCash(int fixed) {
    	return fixed;
    }
}
public class Q3 {
    public int getCash(int dep, int fixed){
    	int Total = dep + fixed;
		return Total;

    }
    public static void main(String[] args) {
    	int dep = 50000;
    	int fixed = 10000;
    	CurrentAccount c = new CurrentAccount();
    	System.out.println("Cash credited in bank is : "+c.getCash(dep));
    	SavingsAccount s = new SavingsAccount();
    	System.out.println("Fixe deposit in bank is : "+s.getCash(fixed));
    	Q3 a = new Q3();
    	System.out.println("Total amount credited in bank is : "+a.getCash(dep,fixed));

    }
}
