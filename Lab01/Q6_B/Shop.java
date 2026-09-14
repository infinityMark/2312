public class Shop {
    private int totalProfit = 0;

    public void earn(Customer c, int value){
        totalProfit += value;
	    c.spend(value);
    };

    public void earn(Group group, int value){
        totalProfit += value;
	    group.spend(value);
    };


	public int getProfit(){
        return totalProfit;
    };
}