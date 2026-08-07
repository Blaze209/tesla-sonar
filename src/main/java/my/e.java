package my;

import com.google.zxing.WriterException;
import com.plaid.internal.EnumC4419g;

/* JADX INFO: loaded from: classes6.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[][] f92540a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[][] f92541b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f92542c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f92543d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(iy.a aVar, ly.a aVar2, ly.c cVar, int i11, b bVar) throws WriterException {
        c(bVar);
        d(cVar, bVar);
        l(aVar2, i11, bVar);
        s(cVar, bVar);
        f(aVar, i11, bVar);
    }

    static int b(int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i12);
        int iN2 = i11 << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i12 << (n(iN2) - iN);
        }
        return iN2;
    }

    static void c(b bVar) {
        bVar.a((byte) -1);
    }

    static void d(ly.c cVar, b bVar) throws WriterException {
        j(bVar);
        e(bVar);
        r(cVar, bVar);
        k(bVar);
    }

    private static void e(b bVar) throws WriterException {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new WriterException();
        }
        bVar.f(8, bVar.d() - 8, 1);
    }

    static void f(iy.a aVar, int i11, b bVar) throws WriterException {
        boolean zF;
        int iE = bVar.e() - 1;
        int iD = bVar.d() - 1;
        int i12 = 0;
        int i13 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < bVar.d()) {
                for (int i14 = 0; i14 < 2; i14++) {
                    int i15 = iE - i14;
                    if (o(bVar.b(i15, iD))) {
                        if (i12 < aVar.g()) {
                            zF = aVar.f(i12);
                            i12++;
                        } else {
                            zF = false;
                        }
                        if (i11 != -1 && d.f(i11, i15, iD)) {
                            zF = !zF;
                        }
                        bVar.g(i15, iD, zF);
                    }
                }
                iD += i13;
            }
            i13 = -i13;
            iD += i13;
            iE -= 2;
        }
        if (i12 == aVar.g()) {
            return;
        }
        throw new WriterException("Not all bits consumed: " + i12 + '/' + aVar.g());
    }

    private static void g(int i11, int i12, b bVar) throws WriterException {
        for (int i13 = 0; i13 < 8; i13++) {
            int i14 = i11 + i13;
            if (!o(bVar.b(i14, i12))) {
                throw new WriterException();
            }
            bVar.f(i14, i12, 0);
        }
    }

    private static void h(int i11, int i12, b bVar) {
        for (int i13 = 0; i13 < 5; i13++) {
            int[] iArr = f92541b[i13];
            for (int i14 = 0; i14 < 5; i14++) {
                bVar.f(i11 + i14, i12 + i13, iArr[i14]);
            }
        }
    }

    private static void i(int i11, int i12, b bVar) {
        for (int i13 = 0; i13 < 7; i13++) {
            int[] iArr = f92540a[i13];
            for (int i14 = 0; i14 < 7; i14++) {
                bVar.f(i11 + i14, i12 + i13, iArr[i14]);
            }
        }
    }

    private static void j(b bVar) throws WriterException {
        int length = f92540a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    private static void k(b bVar) {
        int i11 = 8;
        while (i11 < bVar.e() - 8) {
            int i12 = i11 + 1;
            int i13 = i12 % 2;
            if (o(bVar.b(i11, 6))) {
                bVar.f(i11, 6, i13);
            }
            if (o(bVar.b(6, i11))) {
                bVar.f(6, i11, i13);
            }
            i11 = i12;
        }
    }

    static void l(ly.a aVar, int i11, b bVar) throws WriterException {
        int iD;
        iy.a aVar2 = new iy.a();
        p(aVar, i11, aVar2);
        for (int i12 = 0; i12 < aVar2.g(); i12++) {
            boolean zF = aVar2.f((aVar2.g() - 1) - i12);
            int[] iArr = f92543d[i12];
            bVar.g(iArr[0], iArr[1], zF);
            int iE = 8;
            if (i12 < 8) {
                iD = 8;
                iE = (bVar.e() - i12) - 1;
            } else {
                iD = (bVar.d() - 7) + (i12 - 8);
            }
            bVar.g(iE, iD, zF);
        }
    }

    private static void m(int i11, int i12, b bVar) throws WriterException {
        for (int i13 = 0; i13 < 7; i13++) {
            int i14 = i12 + i13;
            if (!o(bVar.b(i11, i14))) {
                throw new WriterException();
            }
            bVar.f(i11, i14, 0);
        }
    }

    static int n(int i11) {
        return 32 - Integer.numberOfLeadingZeros(i11);
    }

    private static boolean o(int i11) {
        return i11 == -1;
    }

    static void p(ly.a aVar, int i11, iy.a aVar2) throws WriterException {
        if (!g.b(i11)) {
            throw new WriterException("Invalid mask pattern");
        }
        int bits = (aVar.getBits() << 3) | i11;
        aVar2.c(bits, 5);
        aVar2.c(b(bits, 1335), 10);
        iy.a aVar3 = new iy.a();
        aVar3.c(21522, 15);
        aVar2.k(aVar3);
        if (aVar2.g() == 15) {
            return;
        }
        throw new WriterException("should not happen but we got: " + aVar2.g());
    }

    static void q(ly.c cVar, iy.a aVar) throws WriterException {
        aVar.c(cVar.f(), 6);
        aVar.c(b(cVar.f(), 7973), 12);
        if (aVar.g() == 18) {
            return;
        }
        throw new WriterException("should not happen but we got: " + aVar.g());
    }

    private static void r(ly.c cVar, b bVar) {
        if (cVar.f() < 2) {
            return;
        }
        int[] iArr = f92542c[cVar.f() - 1];
        for (int i11 : iArr) {
            if (i11 >= 0) {
                for (int i12 : iArr) {
                    if (i12 >= 0 && o(bVar.b(i12, i11))) {
                        h(i12 - 2, i11 - 2, bVar);
                    }
                }
            }
        }
    }

    static void s(ly.c cVar, b bVar) throws WriterException {
        if (cVar.f() < 7) {
            return;
        }
        iy.a aVar = new iy.a();
        q(cVar, aVar);
        int i11 = 17;
        for (int i12 = 0; i12 < 6; i12++) {
            for (int i13 = 0; i13 < 3; i13++) {
                boolean zF = aVar.f(i11);
                i11--;
                bVar.g(i12, (bVar.d() - 11) + i13, zF);
                bVar.g((bVar.d() - 11) + i13, i12, zF);
            }
        }
    }
}
