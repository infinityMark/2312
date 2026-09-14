public class Group {
    private int curCustomerNum = 0;
    private int maxCapacity = 10;
    private Customer[] customers = new Customer[maxCapacity];

    public Group(Customer[] customers) {
        int lengths = customers.length;
        if (isAddable(lengths)) {
            return;
        }
        int start = getCurCustomerNum();
        for (int i = 0; i < lengths; i++) {
            this.customers[start + i] = customers[i];
        }
        increaseMember(lengths);
    }

    public boolean isEmpty(){
        return curCustomerNum == 0;
    }

    public int getCurCustomerNum(){
        return curCustomerNum;
    }

    private void increaseMember(int lengths){
        curCustomerNum += lengths;;
    }

    private boolean isAddable(int lengths){
        return lengths <= 0 || getCurCustomerNum() + lengths > maxCapacity;
    }

    public void addMember(Customer[] customers){
        int lengths = customers.length;
        if (isAddable(lengths)) {
            return;
        }
        int start = getCurCustomerNum();
        for (int i = 0; i < lengths; i++) {
            this.customers[start + i] = customers[i];
        }
        increaseMember(lengths);
    }

    public void spend(int totalPrice) {
        if (isEmpty())
            return;

        int unitPrice = totalPrice / getCurCustomerNum();
        for (int i = 0; i < getCurCustomerNum(); i++){
            customers[i].spend(unitPrice);
        }
    };
}