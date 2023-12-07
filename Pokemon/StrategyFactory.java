public class StrategyFactory {

    public static Strategy getStrategy(TipoPokemon tipoAtacante, TipoPokemon tipoDefensor) {
        switch (tipoAtacante) {
            case FOGO:
                return new FogoStrategy(tipoDefensor);
            case ÁGUA:
                return new AguaStrategy(tipoDefensor);
            case FADA:
                return new FadaStrategy(tipoDefensor);
           case NOTURNO:
                return new NoturnoStrategy(tipoDefensor);
            case DRAGÃO:
                return new DragaoStrategy(tipoDefensor);
            case GELO:
                return new GeloStrategy(tipoDefensor);
            case PSÍQUICO:
                return new PsquicoStrategy(tipoDefensor);
            case ELÉTRICO:
                return new EletricoStrategy(tipoDefensor);
            case PLANTA:
                return new PlantaStrategy(tipoDefensor);
            case AÇO:
                return new AcoStrategy(tipoDefensor);
            case FANTASMA:
                return new FantasmaStrategy(tipoDefensor);
           case INSETO:
                return new InsectoStrategy(tipoDefensor);
            case PEDRA:
                return new PedraStrategy(tipoDefensor);
            case TERRESTRE:
                return new TerrestreStrategy(tipoDefensor);
            case VENENOSO:
                return new VenenoStrategy(tipoDefensor);
            case VOADOR:
                return new VoadorStrategy(tipoDefensor);
            case LUTADOR:
                return new LutadorStrategy(tipoDefensor);
            case NORMAL:
                return new NormalStrategy(tipoDefensor);
        }
        return null;
    }
}
