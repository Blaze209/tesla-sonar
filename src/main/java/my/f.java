package my;

import ch.qos.logback.core.CoreConstants;
import com.google.zxing.WriterException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f92544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f92545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final iy.d f92546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ly.a f92547d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f92549b;

        static {
            int[] iArr = new int[ly.b.values().length];
            f92549b = iArr;
            try {
                iArr[ly.b.KANJI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92549b[ly.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92549b[ly.b.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92549b[ly.b.BYTE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f92549b[ly.b.ECI.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[d.values().length];
            f92548a = iArr2;
            try {
                iArr2[d.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f92548a[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f92548a[d.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ly.b f92550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f92551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f92552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f92553d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f92554e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f92555f;

        /* synthetic */ b(f fVar, ly.b bVar, int i11, int i12, int i13, b bVar2, ly.c cVar, a aVar) {
            this(bVar, i11, i12, i13, bVar2, cVar);
        }

        private b(ly.b bVar, int i11, int i12, int i13, b bVar2, ly.c cVar) {
            this.f92550a = bVar;
            this.f92551b = i11;
            ly.b bVar3 = ly.b.BYTE;
            int i14 = (bVar == bVar3 || bVar2 == null) ? i12 : bVar2.f92552c;
            this.f92552c = i14;
            this.f92553d = i13;
            this.f92554e = bVar2;
            boolean z11 = false;
            int characterCountBits = bVar2 != null ? bVar2.f92555f : 0;
            if ((bVar == bVar3 && bVar2 == null && i14 != 0) || (bVar2 != null && i14 != bVar2.f92552c)) {
                z11 = true;
            }
            characterCountBits = (bVar2 == null || bVar != bVar2.f92550a || z11) ? characterCountBits + bVar.getCharacterCountBits(cVar) + 4 : characterCountBits;
            int i15 = a.f92549b[bVar.ordinal()];
            if (i15 == 1) {
                characterCountBits += 13;
            } else if (i15 == 2) {
                characterCountBits += i13 == 1 ? 6 : 11;
            } else if (i15 == 3) {
                characterCountBits += i13 != 1 ? i13 == 2 ? 7 : 10 : 4;
            } else if (i15 == 4) {
                characterCountBits += f.this.f92546c.b(f.this.f92544a.substring(i11, i13 + i11), i12).length * 8;
                if (z11) {
                    characterCountBits += 12;
                }
            }
            this.f92555f = characterCountBits;
        }
    }

    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<a> f92557a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ly.c f92558b;

        final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ly.b f92560a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f92561b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f92562c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final int f92563d;

            a(ly.b bVar, int i11, int i12, int i13) {
                this.f92560a = bVar;
                this.f92561b = i11;
                this.f92562c = i12;
                this.f92563d = i13;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d(iy.a aVar) {
                aVar.c(this.f92560a.getBits(), 4);
                if (this.f92563d > 0) {
                    aVar.c(e(), this.f92560a.getCharacterCountBits(c.this.f92558b));
                }
                if (this.f92560a == ly.b.ECI) {
                    aVar.c(f.this.f92546c.d(this.f92562c), 8);
                } else if (this.f92563d > 0) {
                    String str = f.this.f92544a;
                    int i11 = this.f92561b;
                    my.c.c(str.substring(i11, this.f92563d + i11), this.f92560a, aVar, f.this.f92546c.c(this.f92562c));
                }
            }

            private int e() {
                if (this.f92560a != ly.b.BYTE) {
                    return this.f92563d;
                }
                iy.d dVar = f.this.f92546c;
                String str = f.this.f92544a;
                int i11 = this.f92561b;
                return dVar.b(str.substring(i11, this.f92563d + i11), this.f92562c).length;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int f(ly.c cVar) {
                int iE;
                int characterCountBits = this.f92560a.getCharacterCountBits(cVar);
                int i11 = characterCountBits + 4;
                int i12 = a.f92549b[this.f92560a.ordinal()];
                if (i12 != 1) {
                    int i13 = 0;
                    if (i12 == 2) {
                        int i14 = this.f92563d;
                        return i11 + ((i14 / 2) * 11) + (i14 % 2 == 1 ? 6 : 0);
                    }
                    if (i12 == 3) {
                        int i15 = this.f92563d;
                        int i16 = i11 + ((i15 / 3) * 10);
                        int i17 = i15 % 3;
                        if (i17 == 1) {
                            i13 = 4;
                        } else if (i17 == 2) {
                            i13 = 7;
                        }
                        return i16 + i13;
                    }
                    if (i12 != 4) {
                        return i12 != 5 ? i11 : characterCountBits + 12;
                    }
                    iE = e() * 8;
                } else {
                    iE = this.f92563d * 13;
                }
                return i11 + iE;
            }

            private String g(String str) {
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < str.length(); i11++) {
                    if (str.charAt(i11) < ' ' || str.charAt(i11) > '~') {
                        sb2.append(CoreConstants.DOT);
                    } else {
                        sb2.append(str.charAt(i11));
                    }
                }
                return sb2.toString();
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f92560a);
                sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
                if (this.f92560a == ly.b.ECI) {
                    sb2.append(f.this.f92546c.c(this.f92562c).displayName());
                } else {
                    String str = f.this.f92544a;
                    int i11 = this.f92561b;
                    sb2.append(g(str.substring(i11, this.f92563d + i11)));
                }
                sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sb2.toString();
            }
        }

        c(ly.c cVar, b bVar) {
            int i11;
            int i12;
            int i13;
            b bVar2 = bVar;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                i11 = 1;
                if (bVar2 == null) {
                    break;
                }
                int i16 = i14 + bVar2.f92553d;
                b bVar3 = bVar2.f92554e;
                boolean z11 = (bVar2.f92550a == ly.b.BYTE && bVar3 == null && bVar2.f92552c != 0) || !(bVar3 == null || bVar2.f92552c == bVar3.f92552c);
                i11 = z11 ? 1 : i15;
                if (bVar3 == null || bVar3.f92550a != bVar2.f92550a || z11) {
                    this.f92557a.add(0, new a(bVar2.f92550a, bVar2.f92551b, bVar2.f92552c, i16));
                    i13 = 0;
                } else {
                    i13 = i16;
                }
                if (z11) {
                    this.f92557a.add(0, new a(ly.b.ECI, bVar2.f92551b, bVar2.f92552c, 0));
                }
                i15 = i11;
                bVar2 = bVar3;
                i14 = i13;
            }
            if (f.this.f92545b) {
                a aVar = this.f92557a.get(0);
                if (aVar != null) {
                    ly.b bVar4 = aVar.f92560a;
                    int i17 = i15;
                    ly.b bVar5 = ly.b.ECI;
                    if (bVar4 != bVar5 && i17 != 0) {
                        this.f92557a.add(0, new a(bVar5, 0, 0, 0));
                    }
                }
                this.f92557a.add(this.f92557a.get(0).f92560a == ly.b.ECI ? 1 : 0, new a(ly.b.FNC1_FIRST_POSITION, 0, 0, 0));
            }
            int iF = cVar.f();
            int i18 = a.f92548a[f.m(cVar).ordinal()];
            if (i18 == 1) {
                i12 = 9;
            } else if (i18 != 2) {
                i11 = 27;
                i12 = 40;
            } else {
                i11 = 10;
                i12 = 26;
            }
            int iD = d(cVar);
            while (iF < i12 && !my.c.v(iD, ly.c.e(iF), f.this.f92547d)) {
                iF++;
            }
            while (iF > i11 && my.c.v(iD, ly.c.e(iF - 1), f.this.f92547d)) {
                iF--;
            }
            this.f92558b = ly.c.e(iF);
        }

        private int d(ly.c cVar) {
            Iterator<a> it = this.f92557a.iterator();
            int iF = 0;
            while (it.hasNext()) {
                iF += it.next().f(cVar);
            }
            return iF;
        }

        void b(iy.a aVar) {
            Iterator<a> it = this.f92557a.iterator();
            while (it.hasNext()) {
                it.next().d(aVar);
            }
        }

        int c() {
            return d(this.f92558b);
        }

        ly.c e() {
            return this.f92558b;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            a aVar = null;
            for (a aVar2 : this.f92557a) {
                if (aVar != null) {
                    sb2.append(",");
                }
                sb2.append(aVar2.toString());
                aVar = aVar2;
            }
            return sb2.toString();
        }
    }

    private enum d {
        SMALL("version 1-9"),
        MEDIUM("version 10-26"),
        LARGE("version 27-40");

        private final String description;

        d(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    f(String str, Charset charset, boolean z11, ly.a aVar) {
        this.f92544a = str;
        this.f92545b = z11;
        this.f92546c = new iy.d(str, charset, -1);
        this.f92547d = aVar;
    }

    static c h(String str, ly.c cVar, Charset charset, boolean z11, ly.a aVar) {
        return new f(str, charset, z11, aVar).i(cVar);
    }

    static int k(ly.b bVar) {
        int i11;
        if (bVar == null || (i11 = a.f92549b[bVar.ordinal()]) == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 2;
        }
        if (i11 == 4) {
            return 3;
        }
        throw new IllegalStateException("Illegal mode " + bVar);
    }

    static ly.c l(d dVar) {
        int i11 = a.f92548a[dVar.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? ly.c.e(40) : ly.c.e(26);
        }
        return ly.c.e(9);
    }

    static d m(ly.c cVar) {
        if (cVar.f() <= 9) {
            return d.SMALL;
        }
        return cVar.f() <= 26 ? d.MEDIUM : d.LARGE;
    }

    static boolean n(char c11) {
        return my.c.p(c11) != -1;
    }

    static boolean o(char c11) {
        return my.c.s(String.valueOf(c11));
    }

    static boolean p(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    void e(b[][][] bVarArr, int i11, b bVar) {
        b[] bVarArr2 = bVarArr[i11 + bVar.f92553d][bVar.f92552c];
        int iK = k(bVar.f92550a);
        b bVar2 = bVarArr2[iK];
        if (bVar2 == null || bVar2.f92555f > bVar.f92555f) {
            bVarArr2[iK] = bVar;
        }
    }

    void f(ly.c cVar, b[][][] bVarArr, int i11, b bVar) {
        int i12;
        int iF = this.f92546c.f();
        int iE = this.f92546c.e();
        if (iE < 0 || !this.f92546c.a(this.f92544a.charAt(i11), iE)) {
            iE = 0;
        } else {
            iF = iE + 1;
        }
        int i13 = iF;
        for (int i14 = iE; i14 < i13; i14++) {
            if (this.f92546c.a(this.f92544a.charAt(i11), i14)) {
                e(bVarArr, i11, new b(this, ly.b.BYTE, i11, i14, 1, bVar, cVar, null));
            }
        }
        ly.b bVar2 = ly.b.KANJI;
        if (g(bVar2, this.f92544a.charAt(i11))) {
            e(bVarArr, i11, new b(this, bVar2, i11, 0, 1, bVar, cVar, null));
        }
        int length = this.f92544a.length();
        ly.b bVar3 = ly.b.ALPHANUMERIC;
        int i15 = 2;
        if (g(bVar3, this.f92544a.charAt(i11))) {
            int i16 = i11 + 1;
            e(bVarArr, i11, new b(this, bVar3, i11, 0, (i16 >= length || !g(bVar3, this.f92544a.charAt(i16))) ? 1 : 2, bVar, cVar, null));
        }
        ly.b bVar4 = ly.b.NUMERIC;
        if (g(bVar4, this.f92544a.charAt(i11))) {
            int i17 = i11 + 1;
            if (i17 >= length || !g(bVar4, this.f92544a.charAt(i17))) {
                i12 = 1;
            } else {
                int i18 = i11 + 2;
                if (i18 < length && g(bVar4, this.f92544a.charAt(i18))) {
                    i15 = 3;
                }
                i12 = i15;
            }
            e(bVarArr, i11, new b(this, bVar4, i11, 0, i12, bVar, cVar, null));
        }
    }

    boolean g(ly.b bVar, char c11) {
        int i11 = a.f92549b[bVar.ordinal()];
        if (i11 == 1) {
            return o(c11);
        }
        if (i11 == 2) {
            return n(c11);
        }
        if (i11 != 3) {
            return i11 == 4;
        }
        return p(c11);
    }

    c i(ly.c cVar) throws WriterException {
        if (cVar != null) {
            c cVarJ = j(cVar);
            if (my.c.v(cVarJ.c(), l(m(cVarJ.e())), this.f92547d)) {
                return cVarJ;
            }
            throw new WriterException("Data too big for version" + cVar);
        }
        ly.c[] cVarArr = {l(d.SMALL), l(d.MEDIUM), l(d.LARGE)};
        c[] cVarArr2 = {j(cVarArr[0]), j(cVarArr[1]), j(cVarArr[2])};
        int i11 = Integer.MAX_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < 3; i13++) {
            int iC = cVarArr2[i13].c();
            if (my.c.v(iC, cVarArr[i13], this.f92547d) && iC < i11) {
                i12 = i13;
                i11 = iC;
            }
        }
        if (i12 >= 0) {
            return cVarArr2[i12];
        }
        throw new WriterException("Data too big for any version");
    }

    c j(ly.c cVar) throws WriterException {
        int length = this.f92544a.length();
        b[][][] bVarArr = (b[][][]) Array.newInstance((Class<?>) b.class, length + 1, this.f92546c.f(), 4);
        f(cVar, bVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < this.f92546c.f(); i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    b bVar = bVarArr[i11][i12][i13];
                    if (bVar != null && i11 < length) {
                        f(cVar, bVarArr, i11, bVar);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        int i16 = -1;
        for (int i17 = 0; i17 < this.f92546c.f(); i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                b bVar2 = bVarArr[length][i17][i18];
                if (bVar2 != null && bVar2.f92555f < i15) {
                    i15 = bVar2.f92555f;
                    i14 = i17;
                    i16 = i18;
                }
            }
        }
        if (i14 >= 0) {
            return new c(cVar, bVarArr[length][i14][i16]);
        }
        throw new WriterException("Internal error: failed to encode \"" + this.f92544a + "\"");
    }
}
