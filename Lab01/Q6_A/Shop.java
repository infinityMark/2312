package Lab01.Q6_A;

public class Shop {
    private int totalProfit = 0;

    public void earn(Customer c, int value){
        totalProfit += value;
	    c.spend(value);
    };

	public int getProfit(){
        return totalProfit;
    };
}

/*
#include "Customer.h"
class Shop {
private:
	int totalProfit = 0;
public:
	void earn(Customer c, int value);
	int getProfit();
};

*/