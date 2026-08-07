package hr;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f73339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73340c;

        public a(String str, String[] strArr, int i11) {
            this.f73338a = str;
            this.f73339b = strArr;
            this.f73340c = i11;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f73341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73343c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73344d;

        public b(boolean z11, int i11, int i12, int i13) {
            this.f73341a = z11;
            this.f73342b = i11;
            this.f73343c = i12;
            this.f73344d = i13;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f73346b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f73347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f73348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f73349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f73350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f73351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f73352h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f73353i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f73354j;

        public c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, byte[] bArr) {
            this.f73345a = i11;
            this.f73346b = i12;
            this.f73347c = i13;
            this.f73348d = i14;
            this.f73349e = i15;
            this.f73350f = i16;
            this.f73351g = i17;
            this.f73352h = i18;
            this.f73353i = z11;
            this.f73354j = bArr;
        }
    }

    public static int a(int i11) {
        int i12 = 0;
        while (i11 > 0) {
            i12++;
            i11 >>>= 1;
        }
        return i12;
    }

    private static long b(long j11, long j12) {
        return (long) Math.floor(Math.pow(j11, 1.0d / j12));
    }

    public static ur.a c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = list.get(i11);
            String[] strArrQ0 = p0.Q0(str, "=");
            if (strArrQ0.length != 2) {
                ts.u.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrQ0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(xr.a.a(new ts.d0(Base64.decode(strArrQ0[1], 0))));
                } catch (RuntimeException e11) {
                    ts.u.j("VorbisUtil", "Failed to parse vorbis picture", e11);
                }
            } else {
                arrayList.add(new cs.a(strArrQ0[0], strArrQ0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ur.a(arrayList);
    }

    private static void d(d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = d0Var.d(16);
            if (iD2 == 0) {
                d0Var.e(8);
                d0Var.e(16);
                d0Var.e(16);
                d0Var.e(6);
                d0Var.e(8);
                int iD3 = d0Var.d(4) + 1;
                for (int i12 = 0; i12 < iD3; i12++) {
                    d0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw ParserException.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = d0Var.d(5);
                int[] iArr = new int[iD4];
                int i13 = -1;
                for (int i14 = 0; i14 < iD4; i14++) {
                    int iD5 = d0Var.d(4);
                    iArr[i14] = iD5;
                    if (iD5 > i13) {
                        i13 = iD5;
                    }
                }
                int i15 = i13 + 1;
                int[] iArr2 = new int[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    iArr2[i16] = d0Var.d(3) + 1;
                    int iD6 = d0Var.d(2);
                    if (iD6 > 0) {
                        d0Var.e(8);
                    }
                    for (int i17 = 0; i17 < (1 << iD6); i17++) {
                        d0Var.e(8);
                    }
                }
                d0Var.e(2);
                int iD7 = d0Var.d(4);
                int i18 = 0;
                int i19 = 0;
                for (int i21 = 0; i21 < iD4; i21++) {
                    i18 += iArr2[iArr[i21]];
                    while (i19 < i18) {
                        d0Var.e(iD7);
                        i19++;
                    }
                }
            }
        }
    }

    private static void e(int i11, d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            int iD2 = d0Var.d(16);
            if (iD2 != 0) {
                ts.u.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = d0Var.c() ? d0Var.d(4) + 1 : 1;
                if (d0Var.c()) {
                    int iD4 = d0Var.d(8) + 1;
                    for (int i13 = 0; i13 < iD4; i13++) {
                        int i14 = i11 - 1;
                        d0Var.e(a(i14));
                        d0Var.e(a(i14));
                    }
                }
                if (d0Var.d(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i15 = 0; i15 < i11; i15++) {
                        d0Var.e(4);
                    }
                }
                for (int i16 = 0; i16 < iD3; i16++) {
                    d0Var.e(8);
                    d0Var.e(8);
                    d0Var.e(8);
                }
            }
        }
    }

    private static b[] f(d0 d0Var) {
        int iD = d0Var.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            bVarArr[i11] = new b(d0Var.c(), d0Var.d(16), d0Var.d(16), d0Var.d(8));
        }
        return bVarArr;
    }

    private static void g(d0 d0Var) throws ParserException {
        int iD = d0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            if (d0Var.d(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            d0Var.e(24);
            d0Var.e(24);
            d0Var.e(24);
            int iD2 = d0Var.d(6) + 1;
            d0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i12 = 0; i12 < iD2; i12++) {
                iArr[i12] = ((d0Var.c() ? d0Var.d(5) : 0) * 8) + d0Var.d(3);
            }
            for (int i13 = 0; i13 < iD2; i13++) {
                for (int i14 = 0; i14 < 8; i14++) {
                    if ((iArr[i13] & (1 << i14)) != 0) {
                        d0Var.e(8);
                    }
                }
            }
        }
    }

    public static a h(ts.d0 d0Var) {
        return i(d0Var, true, true);
    }

    public static a i(ts.d0 d0Var, boolean z11, boolean z12) throws ParserException {
        if (z11) {
            m(3, d0Var, false);
        }
        String strE = d0Var.E((int) d0Var.x());
        int length = strE.length();
        long jX = d0Var.x();
        String[] strArr = new String[(int) jX];
        int length2 = length + 15;
        for (int i11 = 0; i11 < jX; i11++) {
            String strE2 = d0Var.E((int) d0Var.x());
            strArr[i11] = strE2;
            length2 = length2 + 4 + strE2.length();
        }
        if (z12 && (d0Var.H() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(strE, strArr, length2 + 1);
    }

    public static c j(ts.d0 d0Var) throws ParserException {
        m(1, d0Var, false);
        int iY = d0Var.y();
        int iH = d0Var.H();
        int iY2 = d0Var.y();
        int iU = d0Var.u();
        if (iU <= 0) {
            iU = -1;
        }
        int iU2 = d0Var.u();
        if (iU2 <= 0) {
            iU2 = -1;
        }
        int iU3 = d0Var.u();
        if (iU3 <= 0) {
            iU3 = -1;
        }
        int iH2 = d0Var.H();
        return new c(iY, iH, iY2, iU, iU2, iU3, (int) Math.pow(2.0d, iH2 & 15), (int) Math.pow(2.0d, (iH2 & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4), (d0Var.H() & 1) > 0, Arrays.copyOf(d0Var.e(), d0Var.g()));
    }

    public static b[] k(ts.d0 d0Var, int i11) throws ParserException {
        m(5, d0Var, false);
        int iH = d0Var.H() + 1;
        d0 d0Var2 = new d0(d0Var.e());
        d0Var2.e(d0Var.f() * 8);
        for (int i12 = 0; i12 < iH; i12++) {
            l(d0Var2);
        }
        int iD = d0Var2.d(6) + 1;
        for (int i13 = 0; i13 < iD; i13++) {
            if (d0Var2.d(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        d(d0Var2);
        g(d0Var2);
        e(i11, d0Var2);
        b[] bVarArrF = f(d0Var2);
        if (d0Var2.c()) {
            return bVarArrF;
        }
        throw ParserException.a("framing bit after modes not set as expected", null);
    }

    private static void l(d0 d0Var) throws ParserException {
        long jB;
        if (d0Var.d(24) != 5653314) {
            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + d0Var.b(), null);
        }
        int iD = d0Var.d(16);
        int iD2 = d0Var.d(24);
        int iD3 = 0;
        if (d0Var.c()) {
            d0Var.e(5);
            while (iD3 < iD2) {
                iD3 += d0Var.d(a(iD2 - iD3));
            }
        } else {
            boolean zC = d0Var.c();
            while (iD3 < iD2) {
                if (!zC) {
                    d0Var.e(5);
                } else if (d0Var.c()) {
                    d0Var.e(5);
                }
                iD3++;
            }
        }
        int iD4 = d0Var.d(4);
        if (iD4 > 2) {
            throw ParserException.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            d0Var.e(32);
            d0Var.e(32);
            int iD5 = d0Var.d(4) + 1;
            d0Var.e(1);
            if (iD4 == 1) {
                jB = iD != 0 ? b(iD2, iD) : 0L;
            } else {
                jB = ((long) iD) * ((long) iD2);
            }
            d0Var.e((int) (jB * ((long) iD5)));
        }
    }

    public static boolean m(int i11, ts.d0 d0Var, boolean z11) throws ParserException {
        if (d0Var.a() < 7) {
            if (z11) {
                return false;
            }
            throw ParserException.a("too short header: " + d0Var.a(), null);
        }
        if (d0Var.H() != i11) {
            if (z11) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i11), null);
        }
        if (d0Var.H() == 118 && d0Var.H() == 111 && d0Var.H() == 114 && d0Var.H() == 98 && d0Var.H() == 105 && d0Var.H() == 115) {
            return true;
        }
        if (z11) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
