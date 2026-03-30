lexer grammar RallyComLexer;

LEWY              : 'lewy' | 'L';
PRAWY             : 'prawy' | 'P';
NAWROT            : 'nawrot';
SZCZYT            : 'szczyt' | '^';
PROSTO            : 'prosto' | 'PR';

JEDEN             : 'jeden' | '1';
DWA               : 'dwa' | '2';
TRZY              : 'trzy' | '3';
CZTERY            : 'cztery' | '4';
PIEC              : 'pięć' | '5';
MAKS              : 'maks' | 'MAX';

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

