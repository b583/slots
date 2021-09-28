package slots.prize.spi;

public interface PrizeProvider {

    enum Symbol {
        CHERRY, GOLD_BAR, DIAMOND, FOUR_LEAF_CLOVER
    }

    void payoutTwoInARowPrize(Symbol symbol);

    void payoutThreeInARowPrize(Symbol symbol);

}
