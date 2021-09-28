package slots.game;

import slots.prize.spi.PrizeProvider;

import java.util.ServiceLoader;

class Game {

    public static void main (String... args) {

        ServiceLoader<PrizeProvider> prizeProvidersLoader = ServiceLoader.load(PrizeProvider.class);

        if (prizeProvidersLoader.stream().findAny().isEmpty()) {
            System.out.println("Missing PrizeProvider implementation");
            return;
        }

        final String configuredProvider = args.length == 0 ? null : args[0];
        prizeProvidersLoader.stream().forEach((prizeProvider -> {
            if (configuredProvider == null || prizeProvider.getClass().getName().equals(configuredProvider)) {
                prizeProvider.get().payoutThreeInARowPrize(PrizeProvider.Symbol.CHERRY);
            }
        }));
    }
}
