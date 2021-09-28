package slots.prize.spi.impl.anonymous;

import slots.prize.spi.PrizeProvider;

public class AnonymousPrizeProvider {

    public static PrizeProvider provider() {
        return new PrizeProvider() {
            @Override
            public void payoutTwoInARowPrize(Symbol symbol) {
                System.out.println("Anonymous!");
            }

            @Override
            public void payoutThreeInARowPrize(Symbol symbol) {
                System.out.println("Anonymous!");
            }
        };
    }

}
