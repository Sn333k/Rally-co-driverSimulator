package interpreter;

import grammar.*;

public class IntVisitor extends RallyComParserBaseVisitor<Integer>{

    @Override
    public Integer visitPacenote(RallyComParser.PacenoteContext ctx) {
        System.out.print("\nKomenda:\t");
        return super.visitPacenote(ctx);
    }

    @Override
    public Integer visitTurnPhrase(RallyComParser.TurnPhraseContext ctx) {
        String direction;
        switch(ctx.direct.getType()){
            case RallyComLexer.LEWY -> direction="Lewy";
            case RallyComLexer.PRAWY -> direction="Prawy";
            default -> direction="-";
        }

        System.out.print("Zakręt: " + direction);
        if (ctx.turnSpec() != null) {
            System.out.print(" | kat: " + ctx.turnSpec().getText());
        }
        if (!ctx.modifier().isEmpty()) {
            System.out.print(" | modyfikatory: ");
            ctx.modifier().forEach(m ->
                    System.out.print(m.getText() + " ")
            );
        }
        System.out.println();
        return null;
    }

    @Override
    public Integer visitActionPhrase(RallyComParser.ActionPhraseContext ctx) {
        System.out.print("Akcja: " + ctx.getStart().getText());

        if (ctx.element() != null) {
            System.out.print(" -> dotyczy: ");
            visit(ctx.element());
        }

        return null;
    }

    @Override
    public Integer visitDistancePhrase(RallyComParser.DistancePhraseContext ctx) {
        System.out.println("Odległość: " + ctx.dist.getText());
        return null;
    }

    @Override
    public Integer visitCrestPhrase(RallyComParser.CrestPhraseContext ctx) {
        System.out.print("Szczyt");

        if (!ctx.modifier().isEmpty()) {
            System.out.print(" | modyfikatory: ");
            ctx.modifier().forEach(m ->
                    System.out.print(m.getText() + " ")
            );
        }

        System.out.println();
        return null;
    }

    @Override
    public Integer visitPositioningPhrase(RallyComParser.PositioningPhraseContext ctx) {
        System.out.println("Pozycjonowanie: " + ctx.getText());
        return null;
    }
}