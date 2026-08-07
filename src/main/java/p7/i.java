package p7;

import android.os.Bundle;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f101355h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final i f101356i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f101357j = s7.q0.N0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f101358k = s7.q0.N0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f101359l = s7.q0.N0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f101360m = s7.q0.N0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f101361n = s7.q0.N0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f101362o = s7.q0.N0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f101366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f101368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f101369g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f101370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f101371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f101372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f101373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f101374e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f101375f;

        public i a() {
            return new i(this.f101370a, this.f101371b, this.f101372c, this.f101373d, this.f101374e, this.f101375f);
        }

        public b b(int i11) {
            this.f101375f = i11;
            return this;
        }

        public b c(int i11) {
            this.f101371b = i11;
            return this;
        }

        public b d(int i11) {
            this.f101370a = i11;
            return this;
        }

        public b e(int i11) {
            this.f101372c = i11;
            return this;
        }

        public b f(byte[] bArr) {
            this.f101373d = bArr;
            return this;
        }

        public b g(int i11) {
            this.f101374e = i11;
            return this;
        }

        public b() {
            this.f101370a = -1;
            this.f101371b = -1;
            this.f101372c = -1;
            this.f101374e = -1;
            this.f101375f = -1;
        }

        private b(i iVar) {
            this.f101370a = iVar.f101363a;
            this.f101371b = iVar.f101364b;
            this.f101372c = iVar.f101365c;
            this.f101373d = iVar.f101366d;
            this.f101374e = iVar.f101367e;
            this.f101375f = iVar.f101368f;
        }
    }

    private static String b(int i11) {
        if (i11 == -1) {
            return "NA";
        }
        return i11 + "bit Chroma";
    }

    private static String c(int i11) {
        if (i11 == -1) {
            return "Unset color range";
        }
        if (i11 == 1) {
            return "Full range";
        }
        if (i11 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i11;
    }

    private static String d(int i11) {
        if (i11 == -1) {
            return "Unset color space";
        }
        if (i11 == 6) {
            return "BT2020";
        }
        if (i11 == 1) {
            return "BT709";
        }
        if (i11 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i11;
    }

    private static String e(int i11) {
        if (i11 == -1) {
            return "Unset color transfer";
        }
        if (i11 == 10) {
            return "Gamma 2.2";
        }
        if (i11 == 1) {
            return "Linear";
        }
        if (i11 == 2) {
            return "sRGB";
        }
        if (i11 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i11 == 6) {
            return "ST2084 PQ";
        }
        if (i11 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i11;
    }

    public static i f(Bundle bundle) {
        return new i(bundle.getInt(f101357j, -1), bundle.getInt(f101358k, -1), bundle.getInt(f101359l, -1), bundle.getByteArray(f101360m), bundle.getInt(f101361n, -1), bundle.getInt(f101362o, -1));
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    public static boolean i(i iVar) {
        if (iVar == null) {
            return true;
        }
        int i11 = iVar.f101363a;
        if (i11 != -1 && i11 != 1 && i11 != 2) {
            return false;
        }
        int i12 = iVar.f101364b;
        if (i12 != -1 && i12 != 2) {
            return false;
        }
        int i13 = iVar.f101365c;
        if ((i13 != -1 && i13 != 3) || iVar.f101366d != null) {
            return false;
        }
        int i14 = iVar.f101368f;
        if (i14 != -1 && i14 != 8) {
            return false;
        }
        int i15 = iVar.f101367e;
        return i15 == -1 || i15 == 8;
    }

    @Pure
    public static int k(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 9) {
            return (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int l(int i11) {
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 4) {
            return 10;
        }
        if (i11 == 13) {
            return 2;
        }
        if (i11 == 16) {
            return 6;
        }
        if (i11 != 18) {
            return (i11 == 6 || i11 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String m(int i11) {
        if (i11 == -1) {
            return "NA";
        }
        return i11 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f101363a == iVar.f101363a && this.f101364b == iVar.f101364b && this.f101365c == iVar.f101365c && Arrays.equals(this.f101366d, iVar.f101366d) && this.f101367e == iVar.f101367e && this.f101368f == iVar.f101368f) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return (this.f101367e == -1 || this.f101368f == -1) ? false : true;
    }

    public boolean h() {
        return (this.f101363a == -1 || this.f101364b == -1 || this.f101365c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f101369g == 0) {
            this.f101369g = ((((((((((527 + this.f101363a) * 31) + this.f101364b) * 31) + this.f101365c) * 31) + Arrays.hashCode(this.f101366d)) * 31) + this.f101367e) * 31) + this.f101368f;
        }
        return this.f101369g;
    }

    public boolean j() {
        return g() || h();
    }

    public Bundle n() {
        Bundle bundle = new Bundle();
        bundle.putInt(f101357j, this.f101363a);
        bundle.putInt(f101358k, this.f101364b);
        bundle.putInt(f101359l, this.f101365c);
        bundle.putByteArray(f101360m, this.f101366d);
        bundle.putInt(f101361n, this.f101367e);
        bundle.putInt(f101362o, this.f101368f);
        return bundle;
    }

    public String o() {
        String str;
        String strJ = h() ? s7.q0.J("%s/%s/%s", d(this.f101363a), c(this.f101364b), e(this.f101365c)) : "NA/NA/NA";
        if (g()) {
            str = this.f101367e + "/" + this.f101368f;
        } else {
            str = "NA/NA";
        }
        return strJ + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f101363a));
        sb2.append(", ");
        sb2.append(c(this.f101364b));
        sb2.append(", ");
        sb2.append(e(this.f101365c));
        sb2.append(", ");
        sb2.append(this.f101366d != null);
        sb2.append(", ");
        sb2.append(m(this.f101367e));
        sb2.append(", ");
        sb2.append(b(this.f101368f));
        sb2.append(")");
        return sb2.toString();
    }

    private i(int i11, int i12, int i13, byte[] bArr, int i14, int i15) {
        this.f101363a = i11;
        this.f101364b = i12;
        this.f101365c = i13;
        this.f101366d = bArr;
        this.f101367e = i14;
        this.f101368f = i15;
    }
}
