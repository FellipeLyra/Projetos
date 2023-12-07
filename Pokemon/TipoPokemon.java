public enum TipoPokemon {
    NORMAL, LUTADOR, VOADOR, VENENOSO, TERRESTRE, PEDRA, INSETO, FANTASMA, AÇO, FOGO,
    ÁGUA, PLANTA, ELÉTRICO, PSÍQUICO, GELO, DRAGÃO,FADA, NOTURNO;

    public double multiplicadorVantagem(TipoPokemon tipoDefensor) {
        return StrategyFactory.getStrategy(this, tipoDefensor).multiplicadorVantagem();
    }
}



abstract class Strategy {

    protected TipoPokemon tipoDefensor;

    public Strategy(TipoPokemon tipoDefensor) {
        this.tipoDefensor = tipoDefensor;
    }

    public abstract double multiplicadorVantagem();
}

class FogoStrategy extends Strategy {

    public FogoStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case PLANTA:
            case GELO:
            case INSETO:
            case AÇO:
                return 2.0;
            case FOGO:
            case ÁGUA:
            case PEDRA:
            case DRAGÃO:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class AguaStrategy extends Strategy {

    public AguaStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
      switch (tipoDefensor) {
                case TERRESTRE:
                case PEDRA:
                case FOGO:
                    return 2.0;
                case PLANTA:
                case ELÉTRICO:
                    return 0.5;
                default:
                    return 1.0;
             }
    }
}

class FadaStrategy extends Strategy {

    public FadaStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case LUTADOR:
            case DRAGÃO:
            case NOTURNO:
                return 2.0;
            case VENENOSO:
            case AÇO:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class NoturnoStrategy extends Strategy {

    public NoturnoStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case FANTASMA:
            case PSÍQUICO:
                return 2.0;
            case LUTADOR:
            case INSETO:
            case FADA:
                return 0.5;
            default:
                return 1.0;
        }
    }
}


class DragaoStrategy extends Strategy {

    public DragaoStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case DRAGÃO:
                return 2.0;
            case GELO:
            case FADA:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class GeloStrategy extends Strategy {

    public GeloStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case VOADOR:
                case TERRESTRE:
                case PLANTA:
                case DRAGÃO:
                    return 2.0;
                case FOGO:
                case PEDRA:
                case LUTADOR:
                case AÇO:
                    return 0.5;
                default:
                    return 1.0;
        }
    }
}

class PsquicoStrategy extends Strategy {

    public PsquicoStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case LUTADOR:
            case VENENOSO:
                return 2.0;
            case INSETO:
            case FANTASMA:
            case NOTURNO:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class EletricoStrategy extends Strategy {

    public EletricoStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case VOADOR:
            case ÁGUA:
                return 2.0;
            case TERRESTRE:
                return 0.5;
            default:
                return 1.0;
        }
    }
}


class PlantaStrategy extends Strategy {

    public PlantaStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case TERRESTRE:
            case PEDRA:
            case ÁGUA:
                return 2.0;
            case FOGO:
            case VOADOR:
            case GELO:
            case VENENOSO:
            case INSETO:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class AcoStrategy extends Strategy {

    public AcoStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case PEDRA:
            case GELO:
            case FADA:
                return 2.0;
            case FOGO:
            case TERRESTRE:
            case LUTADOR:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class FantasmaStrategy extends Strategy {

    public FantasmaStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case FANTASMA:
            case PSÍQUICO:
                return 2.0;
            case NOTURNO:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class InsectoStrategy extends Strategy {

    public InsectoStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case PLANTA:
            case PSÍQUICO:
            case NOTURNO:
                return 2.0;
            case FOGO:
            case VOADOR:
            case PEDRA:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class PedraStrategy extends Strategy {

    public PedraStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case VOADOR:
            case INSETO:
            case FOGO:
            case GELO:
                return 2.0;
            case PSÍQUICO:
            case FADA:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class TerrestreStrategy extends Strategy {

    public TerrestreStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
         case VENENOSO:
            case PEDRA:
            case AÇO:
            case FOGO:
            case ELÉTRICO:
                return 2.0;
            case ÁGUA:
            case PLANTA:
            case GELO:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class VenenoStrategy extends Strategy {

    public VenenoStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case PLANTA:
            case FADA:
                return 2.0;
            case TERRESTRE:
            case PSÍQUICO:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class VoadorStrategy extends Strategy {

    public VoadorStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case LUTADOR:
            case INSETO:
            case PLANTA:
                return 2.0;
            case ELÉTRICO:
            case PEDRA:
            case GELO:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class LutadorStrategy extends Strategy {

    public LutadorStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case NORMAL:
            case PEDRA:
            case AÇO:
            case GELO:
            case NOTURNO:
                return 2.0;
            case VOADOR:
            case PSÍQUICO:
            case FADA:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

class NormalStrategy extends Strategy {

    public NormalStrategy(TipoPokemon tipoDefensor) {
        super(tipoDefensor);
    }

    @Override
    public double multiplicadorVantagem() {
        switch (tipoDefensor) {
            case LUTADOR:
                return 0.5;
            default:
                return 1.0;
        }
    }
}

