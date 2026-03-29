parser grammar RallyComParser;
options { tokenVocab=RallyComLexer;}

program:
    pacenote (','pacenote)* EOF
    ;

pacenote:
    sequence
    ;

sequence:
    element (connector element)*
    ;

element:
    actionPhrase
    | turnPhrase
    | distancePhrase
    | crestPhrase
    | positioningPhrase
    ;

turnPhrase:
    direction turnSpec? modifier*
    ;

turnSpec:
    degree
    | NAWROT degree?
    ;

degree:
    JEDEN
    | DWA
    | TRZY
    | CZTERY
    | PIEC
    | MAKS
    ;

crestPhrase:
    SZCZYT modifier*
    ;

distancePhrase:
    INT PROSTO?
    ;

actionPhrase:
    (HAMUJ | PRZYHAMUJ | PELNE_HAMOWANIE) element?
    ;
positioningPhrase:
    DO_LEWEJ
    | DO_PRAWEJ
    | Z_DROGI
    ;
modifier:
    HALF
    | DNEM
    | PLUS
    | CIAC
    | NIE_CIAC
    | POZNO
    | WCZESNIE
    | SMIALO
    | CELUJ
    | ZACISK
    | PRZEZ
    | ZDUS
    ;
connector:
    DO
    | PRZED
    | NA
    ;
   direction:
   LEWY
   | PRAWY
   ;
