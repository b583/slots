import slots.prize.spi.goldencoins.GoldenCoinsPrizeProvider;

module slots.prize.spi.impl.goldencoins {
    requires slots.prize.spi;
    provides slots.prize.spi.PrizeProvider with GoldenCoinsPrizeProvider;
}