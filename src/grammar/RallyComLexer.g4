lexer grammar RallyComLexer;

LEWY              : 'lewy';
PRAWY             : 'prawy';
NAWROT            : 'nawrot';
SZCZYT            : 'szczyt';
PROSTO            : 'prosto';

JEDEN             : 'jeden';
DWA               : 'dwa';
TRZY              : 'trzy';
CZTERY            : 'cztery';
PIEC              : 'pięć';
MAKS              : 'maks';

HALF              : 'pół';
DNEM              : 'dnem';
PLUS              : 'plus';

HAMUJ             : 'hamuj';
PRZYHAMUJ         : 'przyhamuj';
PELNE_HAMOWANIE   : 'pełne hamowanie';
ZDUS              : 'zduś';

DO_LEWEJ          : 'do lewej';
DO_PRAWEJ         : 'do prawej';
Z_DROGI           : 'z drogi';

CIAC              : 'ciąć';
NIE_CIAC          : 'nie ciąć';
POZNO             : 'późno';
WCZESNIE          : 'wcześnie';
SMIALO            : 'śmiało';
CELUJ             : 'celuj';
ZACISK            : 'zacisk';
PRZEZ             : 'przez';

DO                : 'do';
PRZED             : 'przed';
NA                : 'na';

COMMA             : ',';

NEWLINE           : [\r\n]+ -> channel(HIDDEN);

WS                : [ \t]+ -> channel(HIDDEN);

INT               : [0-9]+;

