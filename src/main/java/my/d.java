package my;

/* JADX INFO: loaded from: classes6.dex */
final class d {
    static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(b bVar, boolean z11) {
        int iD = z11 ? bVar.d() : bVar.e();
        int iE = z11 ? bVar.e() : bVar.d();
        byte[][] bArrC = bVar.c();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            byte b11 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < iE; i14++) {
                byte b12 = z11 ? bArrC[i12][i14] : bArrC[i14][i12];
                if (b12 == b11) {
                    i13++;
                } else {
                    if (i13 >= 5) {
                        i11 += i13 - 2;
                    }
                    i13 = 1;
                    b11 = b12;
                }
            }
            if (i13 >= 5) {
                i11 += i13 - 2;
            }
        }
        return i11;
    }

    static int c(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD - 1; i12++) {
            byte[] bArr = bArrC[i12];
            int i13 = 0;
            while (i13 < iE - 1) {
                byte b11 = bArr[i13];
                int i14 = i13 + 1;
                if (b11 == bArr[i14]) {
                    byte[] bArr2 = bArrC[i12 + 1];
                    if (b11 == bArr2[i13] && b11 == bArr2[i14]) {
                        i11++;
                    }
                }
                i13 = i14;
            }
        }
        return i11 * 3;
    }

    static int d(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            for (int i13 = 0; i13 < iE; i13++) {
                byte[] bArr = bArrC[i12];
                int i14 = i13 + 6;
                if (i14 < iE && bArr[i13] == 1 && bArr[i13 + 1] == 0 && bArr[i13 + 2] == 1 && bArr[i13 + 3] == 1 && bArr[i13 + 4] == 1 && bArr[i13 + 5] == 0 && bArr[i14] == 1 && (g(bArr, i13 - 4, i13) || g(bArr, i13 + 7, i13 + 11))) {
                    i11++;
                }
                int i15 = i12 + 6;
                if (i15 < iD && bArrC[i12][i13] == 1 && bArrC[i12 + 1][i13] == 0 && bArrC[i12 + 2][i13] == 1 && bArrC[i12 + 3][i13] == 1 && bArrC[i12 + 4][i13] == 1 && bArrC[i12 + 5][i13] == 0 && bArrC[i15][i13] == 1 && (h(bArrC, i13, i12 - 4, i12) || h(bArrC, i13, i12 + 7, i12 + 11))) {
                    i11++;
                }
            }
        }
        return i11 * 40;
    }

    static int e(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            byte[] bArr = bArrC[i12];
            for (int i13 = 0; i13 < iE; i13++) {
                if (bArr[i13] == 1) {
                    i11++;
                }
            }
        }
        int iD2 = bVar.d() * bVar.e();
        return ((Math.abs((i11 * 2) - iD2) * 10) / iD2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    static boolean f(int i11, int i12, int i13) {
        int i14;
        int i15;
        switch (i11) {
            case 0:
                i13 += i12;
                i14 = i13 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 1:
                i14 = i13 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 2:
                i14 = i12 % 3;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 3:
                i14 = (i13 + i12) % 3;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 4:
                i13 /= 2;
                i12 /= 3;
                i13 += i12;
                i14 = i13 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i16 = i13 * i12;
                i14 = (i16 & 1) + (i16 % 3);
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i17 = i13 * i12;
                i15 = (i17 & 1) + (i17 % 3);
                i14 = i15 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            case 7:
                i15 = ((i13 * i12) % 3) + ((i13 + i12) & 1);
                i14 = i15 & 1;
                if (i14 == 0) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: " + i11);
        }
    }

    private static boolean g(byte[] bArr, int i11, int i12) {
        if (i11 < 0 || bArr.length < i12) {
            return false;
        }
        while (i11 < i12) {
            if (bArr[i11] == 1) {
                return false;
            }
            i11++;
        }
        return true;
    }

    private static boolean h(byte[][] bArr, int i11, int i12, int i13) {
        if (i12 < 0 || bArr.length < i13) {
            return false;
        }
        while (i12 < i13) {
            if (bArr[i12][i11] == 1) {
                return false;
            }
            i12++;
        }
        return true;
    }
}
