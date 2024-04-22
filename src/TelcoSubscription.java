public class TelcoSubscription {
    private int data;
    private int price;
    private Telco telcoName;
    private boolean unliCallText;

    public TelcoSubscription(int data, int price, Telco telcoName, boolean unliCallText) {
        this.data = data;
        this.price = price;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Telco getTelcoName() {
        return telcoName;
    }

    public void setTelcoName(Telco telcoName) {
        this.telcoName = telcoName;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }
}