public class TelcoPromo {
    public static void main(String[] args) {
        TelcoSubscription smart = new TelcoSubscription(15, 500, Telco.SMART, false);
        TelcoSubscription globe = new TelcoSubscription(10, 450, Telco.GLOBE, true);
        TelcoSubscription ditto = new TelcoSubscription(8, 400, Telco.DITTO, true);

        UsagePromo promo = new TelcoAllowance();
        UnliCall unli = new UnliTextPackage();

        System.out.println("Smart Data Usage Offer and price: " + promo.showAllowance(smart.getTelcoName().toString(), smart.getPrice()));
        System.out.println("Globe Data Usage Offer and price" + promo.showAllowance(globe.getTelcoName().toString(), globe.getPrice()));
        System.out.println("Ditto Data Usage Offer and price" + promo.showAllowance(ditto.getTelcoName().toString(), ditto.getPrice()));

        System.out.println("\nSmart unlimited calls and text package: " + unli.showUnliCallsTextOffer(smart.getTelcoName().toString(), smart.getUnliCallText()));
        System.out.println("Globe unlimited calls and text package: " + unli.showUnliCallsTextOffer(globe.getTelcoName().toString(), globe.getUnliCallText()));
        System.out.println("Ditto unlimited calls and text package: " + unli.showUnliCallsTextOffer(ditto.getTelcoName().toString(), ditto.getUnliCallText()));
    }
}