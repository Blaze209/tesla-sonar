package us;

import android.os.Bundle;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements com.google.android.exoplayer2.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f116536f = new c(1, 2, 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f116537g = new b().c(1).b(1).d(2).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f116538h = p0.t0(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f116539i = p0.t0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f116540j = p0.t0(2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f116541k = p0.t0(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.exoplayer2.g.a<c> f116542l = new com.google.android.exoplayer2.g.a() { // from class: us.b
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return c.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f116545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f116546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f116547e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f116548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f116549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f116550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f116551d;

        public c a() {
            return new c(this.f116548a, this.f116549b, this.f116550c, this.f116551d);
        }

        public b b(int i11) {
            this.f116549b = i11;
            return this;
        }

        public b c(int i11) {
            this.f116548a = i11;
            return this;
        }

        public b d(int i11) {
            this.f116550c = i11;
            return this;
        }

        public b() {
            this.f116548a = -1;
            this.f116549b = -1;
            this.f116550c = -1;
        }

        private b(c cVar) {
            this.f116548a = cVar.f116543a;
            this.f116549b = cVar.f116544b;
            this.f116550c = cVar.f116545c;
            this.f116551d = cVar.f116546d;
        }
    }

    @Deprecated
    public c(int i11, int i12, int i13, byte[] bArr) {
        this.f116543a = i11;
        this.f116544b = i12;
        this.f116545c = i13;
        this.f116546d = bArr;
    }

    public static /* synthetic */ c a(Bundle bundle) {
        return new c(bundle.getInt(f116538h, -1), bundle.getInt(f116539i, -1), bundle.getInt(f116540j, -1), bundle.getByteArray(f116541k));
    }

    private static String c(int i11) {
        if (i11 == -1) {
            return "Unset color range";
        }
        if (i11 != 1) {
            return i11 != 2 ? "Undefined color range" : "Limited range";
        }
        return "Full range";
    }

    private static String d(int i11) {
        if (i11 == -1) {
            return "Unset color space";
        }
        if (i11 == 6) {
            return "BT2020";
        }
        if (i11 != 1) {
            return i11 != 2 ? "Undefined color space" : "BT601";
        }
        return "BT709";
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
        if (i11 != 6) {
            return i11 != 7 ? "Undefined color transfer" : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean f(c cVar) {
        if (cVar == null) {
            return false;
        }
        int i11 = cVar.f116545c;
        return i11 == 7 || i11 == 6;
    }

    @Pure
    public static int h(int i11) {
        if (i11 == 1) {
            return 1;
        }
        if (i11 != 9) {
            return (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int i(int i11) {
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

    public b b() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f116543a == cVar.f116543a && this.f116544b == cVar.f116544b && this.f116545c == cVar.f116545c && Arrays.equals(this.f116546d, cVar.f116546d)) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return (this.f116543a == -1 || this.f116544b == -1 || this.f116545c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f116547e == 0) {
            this.f116547e = ((((((527 + this.f116543a) * 31) + this.f116544b) * 31) + this.f116545c) * 31) + Arrays.hashCode(this.f116546d);
        }
        return this.f116547e;
    }

    public String j() {
        return !g() ? "NA" : p0.B("%s/%s/%s", d(this.f116543a), c(this.f116544b), e(this.f116545c));
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f116538h, this.f116543a);
        bundle.putInt(f116539i, this.f116544b);
        bundle.putInt(f116540j, this.f116545c);
        bundle.putByteArray(f116541k, this.f116546d);
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f116543a));
        sb2.append(", ");
        sb2.append(c(this.f116544b));
        sb2.append(", ");
        sb2.append(e(this.f116545c));
        sb2.append(", ");
        sb2.append(this.f116546d != null);
        sb2.append(")");
        return sb2.toString();
    }
}
