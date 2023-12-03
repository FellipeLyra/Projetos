public enum TipoPokemon {
    NORMAL, LUTADOR, VOADOR, VENENOSO, TERRESTRE, PEDRA, INSETO, FANTASMA, AÇO, FOGO,
    ÁGUA, PLANTA, ELÉTRICO, PSÍQUICO, GELO, DRAGÃO,FADA, NOTURNO;

    public double multiplicadorVantagem(TipoPokemon tipoDefensor) {
        switch (this) {
            case FOGO:
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
            case ÁGUA:
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
            case FADA:
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
           case NOTURNO:
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
            case DRAGÃO:
             switch (tipoDefensor) {
                case DRAGÃO:
                    return 2.0;
                case GELO:
                case FADA:
                    return 0.5;
                default:
                    return 1.0;
             }
            case GELO:
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
            case PSÍQUICO:
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
            case ELÉTRICO:
             switch (tipoDefensor) {
                case VOADOR:
                case ÁGUA:
                    return 2.0;
                case TERRESTRE:
                    return 0.5;
                default:
                    return 1.0;
             }
            case PLANTA:
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
            case AÇO:
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
            case FANTASMA:
             switch (tipoDefensor) {
                case FANTASMA:
                case PSÍQUICO:
                    return 2.0;
                case NOTURNO:
                    return 0.5;
                default:
                    return 1.0;
             }
            case INSETO:
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
            case PEDRA:
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
            case TERRESTRE:
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
            case VENENOSO:
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
            case VOADOR:
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
            case LUTADOR:
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
            case NORMAL:
             switch (tipoDefensor) {
                case LUTADOR:
                    return 0.5;
                default:
                    return 1.0;
             }
         
        }
        return 0;
    }
}
