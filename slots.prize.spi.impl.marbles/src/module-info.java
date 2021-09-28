import slots.prize.spi.impl.marbles.MarblesPrizeProvider;

module slots.prize.spi.impl.marbles {
    requires slots.prize.spi;
    provides slots.prize.spi.PrizeProvider with MarblesPrizeProvider;
}