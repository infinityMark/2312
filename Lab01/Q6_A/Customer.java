package Lab01.Q6_A;

public class Customer {
    private int totalMoney;

    public Customer(int asset){
        set(asset);
    }

    public void set(int money){
        totalMoney = money;
    };

	public void spend(int value) {
        totalMoney -= value;
    };

	public int getAmount() {
        return totalMoney;
    };
}
