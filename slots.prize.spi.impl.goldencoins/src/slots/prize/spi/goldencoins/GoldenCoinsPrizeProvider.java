package slots.prize.spi.goldencoins;

import slots.prize.spi.PrizeProvider;

// service provider MUST be public
public class GoldenCoinsPrizeProvider implements PrizeProvider {
    @Override
    public void payoutTwoInARowPrize(Symbol symbol) {
        System.out.println("Two gold coins payed out");
    }

    @Override
    public void payoutThreeInARowPrize(Symbol symbol) {
        System.out.println("Three gold coins payed out");
    }
}
