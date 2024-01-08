$0 = 1;
i = $0;
L0:
$1 = 10;
if (i < $1) goto L4;
$2 = 0;
goto L5;
L4:
$2 = 1;
L5:
if ($2 == 1) goto L1;
goto L3;
L2:
$3 = 1;
$4 = i + $3;
i = $4;
goto L0;
L1:
$5 = x + i;
x = $5;
goto L2;
L3:
print x;
