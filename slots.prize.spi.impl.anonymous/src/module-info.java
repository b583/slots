import slots.prize.spi.impl.anonymous.AnonymousPrizeProvider;

module slots.prize.spi.impl.anonymous {
    requires slots.prize.spi;
    provides slots.prize.spi.PrizeProvider with AnonymousPrizeProvider;
}