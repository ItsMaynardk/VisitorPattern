public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, int price) {
        return telcoName + " Data Usage Offer and price: Data allowance of "
                + this.getDataAllowance(telcoName) + " GB for ₱" + price + " per month";
    }

    private int getDataAllowance(String telcoName) {
        switch (Telco.valueOf(telcoName)) {
            case SMART:
                return 15;
            case GLOBE:
                return 10;
            case DITTO:
                return 8;
            default:
                return 0;
        }
    }
}