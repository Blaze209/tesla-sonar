package w8;

import android.util.Base64;
import androidx.media3.common.ParserException;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f121401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f121402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121403c;

        public a(String str, String[] strArr, int i11) {
            this.f121401a = str;
            this.f121402b = strArr;
            this.f121403c = i11;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f121404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f121407d;

        public b(boolean z11, int i11, int i12, int i13) {
            this.f121404a = z11;
            this.f121405b = i11;
            this.f121406c = i12;
            this.f121407d = i13;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f121408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f121409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f121410c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f121411d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f121412e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f121413f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f121414g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f121415h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f121416i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f121417j;

        public c(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, byte[] bArr) {
            this.f121408a = i11;
            this.f121409b = i12;
            this.f121410c = i13;
            this.f121411d = i14;
            this.f121412e = i15;
            this.f121413f = i16;
            this.f121414g = i17;
            this.f121415h = i18;
            this.f121416i = z11;
            this.f121417j = bArr;
        }
    }

    public static int[] a(int i11) {
        if (i11 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i11 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i11 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i11 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i11 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i11) {
        int i12 = 0;
        while (i11 > 0) {
            i12++;
            i11 >>>= 1;
        }
        return i12;
    }

    private static long c(long j11, long j12) {
        return (long) Math.floor(Math.pow(j11, 1.0d / j12));
    }

    public static p7.f0 d(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = list.get(i11);
            String[] strArrF1 = s7.q0.F1(str, "=");
            if (strArrF1.length != 2) {
                s7.t.i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrF1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(i9.a.a(new s7.c0(Base64.decode(strArrF1[1], 0))));
                } catch (RuntimeException e11) {
                    s7.t.j("VorbisUtil", "Failed to parse vorbis picture", e11);
                }
            } else {
                arrayList.add(new n9.a(strArrF1[0], strArrF1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new p7.f0(arrayList);
    }

    public static com.google.common.collect.x<byte[]> e(byte[] bArr) {
        s7.c0 c0Var = new s7.c0(bArr);
        c0Var.c0(1);
        int i11 = 0;
        while (c0Var.a() > 0 && c0Var.n() == 255) {
            i11 += 255;
            c0Var.c0(1);
        }
        int iM = i11 + c0Var.M();
        int i12 = 0;
        while (c0Var.a() > 0 && c0Var.n() == 255) {
            i12 += 255;
            c0Var.c0(1);
        }
        int iM2 = i12 + c0Var.M();
        byte[] bArr2 = new byte[iM];
        int iG = c0Var.g();
        System.arraycopy(bArr, iG, bArr2, 0, iM);
        int i13 = iG + iM + iM2;
        int length = bArr.length - i13;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i13, bArr3, 0, length);
        return com.google.common.collect.x.t(bArr2, bArr3);
    }

    private static void f(q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = q0Var.d(16);
            if (iD2 == 0) {
                q0Var.e(8);
                q0Var.e(16);
                q0Var.e(16);
                q0Var.e(6);
                q0Var.e(8);
                int iD3 = q0Var.d(4) + 1;
                for (int i12 = 0; i12 < iD3; i12++) {
                    q0Var.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw ParserException.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = q0Var.d(5);
                int[] iArr = new int[iD4];
                int i13 = -1;
                for (int i14 = 0; i14 < iD4; i14++) {
                    int iD5 = q0Var.d(4);
                    iArr[i14] = iD5;
                    if (iD5 > i13) {
                        i13 = iD5;
                    }
                }
                int i15 = i13 + 1;
                int[] iArr2 = new int[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    iArr2[i16] = q0Var.d(3) + 1;
                    int iD6 = q0Var.d(2);
                    if (iD6 > 0) {
                        q0Var.e(8);
                    }
                    for (int i17 = 0; i17 < (1 << iD6); i17++) {
                        q0Var.e(8);
                    }
                }
                q0Var.e(2);
                int iD7 = q0Var.d(4);
                int i18 = 0;
                int i19 = 0;
                for (int i21 = 0; i21 < iD4; i21++) {
                    i18 += iArr2[iArr[i21]];
                    while (i19 < i18) {
                        q0Var.e(iD7);
                        i19++;
                    }
                }
            }
        }
    }

    private static void g(int i11, q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            int iD2 = q0Var.d(16);
            if (iD2 != 0) {
                s7.t.d("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = q0Var.c() ? q0Var.d(4) + 1 : 1;
                if (q0Var.c()) {
                    int iD4 = q0Var.d(8) + 1;
                    for (int i13 = 0; i13 < iD4; i13++) {
                        int i14 = i11 - 1;
                        q0Var.e(b(i14));
                        q0Var.e(b(i14));
                    }
                }
                if (q0Var.d(2) != 0) {
                    throw ParserException.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i15 = 0; i15 < i11; i15++) {
                        q0Var.e(4);
                    }
                }
                for (int i16 = 0; i16 < iD3; i16++) {
                    q0Var.e(8);
                    q0Var.e(8);
                    q0Var.e(8);
                }
            }
        }
    }

    private static b[] h(q0 q0Var) {
        int iD = q0Var.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            bVarArr[i11] = new b(q0Var.c(), q0Var.d(16), q0Var.d(16), q0Var.d(8));
        }
        return bVarArr;
    }

    private static void i(q0 q0Var) throws ParserException {
        int iD = q0Var.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            if (q0Var.d(16) > 2) {
                throw ParserException.a("residueType greater than 2 is not decodable", null);
            }
            q0Var.e(24);
            q0Var.e(24);
            q0Var.e(24);
            int iD2 = q0Var.d(6) + 1;
            q0Var.e(8);
            int[] iArr = new int[iD2];
            for (int i12 = 0; i12 < iD2; i12++) {
                iArr[i12] = ((q0Var.c() ? q0Var.d(5) : 0) * 8) + q0Var.d(3);
            }
            for (int i13 = 0; i13 < iD2; i13++) {
                for (int i14 = 0; i14 < 8; i14++) {
                    if ((iArr[i13] & (1 << i14)) != 0) {
                        q0Var.e(8);
                    }
                }
            }
        }
    }

    public static a j(s7.c0 c0Var) {
        return k(c0Var, true, true);
    }

    public static a k(s7.c0 c0Var, boolean z11, boolean z12) throws ParserException {
        if (z11) {
            o(3, c0Var, false);
        }
        String strJ = c0Var.J((int) c0Var.C());
        int length = strJ.length();
        long jC = c0Var.C();
        String[] strArr = new String[(int) jC];
        int length2 = length + 15;
        for (int i11 = 0; i11 < jC; i11++) {
            String strJ2 = c0Var.J((int) c0Var.C());
            strArr[i11] = strJ2;
            length2 = length2 + 4 + strJ2.length();
        }
        if (z12 && (c0Var.M() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new a(strJ, strArr, length2 + 1);
    }

    public static c l(s7.c0 c0Var) throws ParserException {
        o(1, c0Var, false);
        int iD = c0Var.D();
        int iM = c0Var.M();
        int iD2 = c0Var.D();
        int iZ = c0Var.z();
        if (iZ <= 0) {
            iZ = -1;
        }
        int iZ2 = c0Var.z();
        if (iZ2 <= 0) {
            iZ2 = -1;
        }
        int iZ3 = c0Var.z();
        if (iZ3 <= 0) {
            iZ3 = -1;
        }
        int iM2 = c0Var.M();
        return new c(iD, iM, iD2, iZ, iZ2, iZ3, (int) Math.pow(2.0d, iM2 & 15), (int) Math.pow(2.0d, (iM2 & EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) >> 4), (c0Var.M() & 1) > 0, Arrays.copyOf(c0Var.f(), c0Var.j()));
    }

    public static b[] m(s7.c0 c0Var, int i11) throws ParserException {
        o(5, c0Var, false);
        int iM = c0Var.M() + 1;
        q0 q0Var = new q0(c0Var.f());
        q0Var.e(c0Var.g() * 8);
        for (int i12 = 0; i12 < iM; i12++) {
            n(q0Var);
        }
        int iD = q0Var.d(6) + 1;
        for (int i13 = 0; i13 < iD; i13++) {
            if (q0Var.d(16) != 0) {
                throw ParserException.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q0Var);
        i(q0Var);
        g(i11, q0Var);
        b[] bVarArrH = h(q0Var);
        if (q0Var.c()) {
            return bVarArrH;
        }
        throw ParserException.a("framing bit after modes not set as expected", null);
    }

    private static void n(q0 q0Var) throws ParserException {
        long jC;
        if (q0Var.d(24) != 5653314) {
            throw ParserException.a("expected code book to start with [0x56, 0x43, 0x42] at " + q0Var.b(), null);
        }
        int iD = q0Var.d(16);
        int iD2 = q0Var.d(24);
        int iD3 = 0;
        if (q0Var.c()) {
            q0Var.e(5);
            while (iD3 < iD2) {
                iD3 += q0Var.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = q0Var.c();
            while (iD3 < iD2) {
                if (!zC) {
                    q0Var.e(5);
                } else if (q0Var.c()) {
                    q0Var.e(5);
                }
                iD3++;
            }
        }
        int iD4 = q0Var.d(4);
        if (iD4 > 2) {
            throw ParserException.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            q0Var.e(32);
            q0Var.e(32);
            int iD5 = q0Var.d(4) + 1;
            q0Var.e(1);
            if (iD4 == 1) {
                jC = iD != 0 ? c(iD2, iD) : 0L;
            } else {
                jC = ((long) iD) * ((long) iD2);
            }
            q0Var.e((int) (jC * ((long) iD5)));
        }
    }

    public static boolean o(int i11, s7.c0 c0Var, boolean z11) throws ParserException {
        if (c0Var.a() < 7) {
            if (z11) {
                return false;
            }
            throw ParserException.a("too short header: " + c0Var.a(), null);
        }
        if (c0Var.M() != i11) {
            if (z11) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i11), null);
        }
        if (c0Var.M() == 118 && c0Var.M() == 111 && c0Var.M() == 114 && c0Var.M() == 98 && c0Var.M() == 105 && c0Var.M() == 115) {
            return true;
        }
        if (z11) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }
}
