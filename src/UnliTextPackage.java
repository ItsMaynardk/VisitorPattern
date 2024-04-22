public class UnliTextPackage implements UnliCall {
    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean hasUnli) {
        return telcoName + " unlimited calls and text package: " + (hasUnli ? "Offers unlimited calls and texts." : "Does not offer any free calls or texts, and you will be charged per use");
    }
}