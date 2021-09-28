package slots.prize.spi.impl.marbles;

import slots.prize.spi.PrizeProvider;

// service provider MUST be public
public class MarblesPrizeProvider implements PrizeProvider {

    private final String marbleColor;

    // if there is no public no-args constructor then ServiceConfigurationError will be thrown
    // when ServiceLoader goes through PrizeProviders
    public MarblesPrizeProvider(String marbleColor) {
        this.marbleColor = marbleColor;
    }

    // if there is both a no-args constructor and a provider method then no-args constructor is ignored
    public MarblesPrizeProvider() {
        this.marbleColor = "blue";
    }

    // solution for this is a static provider method
    public static PrizeProvider provider() {
        return new MarblesPrizeProvider("green");
    }

    @Override
    public void payoutTwoInARowPrize(Symbol symbol) {
        System.out.printf("Two %s %s marbles payed out%n", marbleColor, symbol);
    }

    @Override
    public void payoutThreeInARowPrize(Symbol symbol) {
        System.out.printf("Three %s %s marbles payed out%n", marbleColor, symbol);
    }
}
