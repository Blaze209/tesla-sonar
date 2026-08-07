package p7;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f101231h = new e().a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f101232i = s7.q0.N0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f101233j = s7.q0.N0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f101234k = s7.q0.N0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f101235l = s7.q0.N0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f101236m = s7.q0.N0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f101237n = s7.q0.N0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f101238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f101240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f101242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f101243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C2151d f101244g;

    private static final class b {
        @SuppressLint({"WrongConstant"})
        public static void a(AudioAttributes.Builder builder, int i11) {
            builder.setAllowedCapturePolicy(i11);
        }
    }

    private static final class c {
        public static void a(AudioAttributes.Builder builder, boolean z11) {
            builder.setIsContentSpatialized(z11);
        }

        @SuppressLint({"WrongConstant"})
        public static void b(AudioAttributes.Builder builder, int i11) {
            builder.setSpatializationBehavior(i11);
        }
    }

    /* JADX INFO: renamed from: p7.d$d, reason: collision with other inner class name */
    public static final class C2151d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f101245a;

        private C2151d(d dVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(dVar.f101238a).setFlags(dVar.f101239b).setUsage(dVar.f101240c);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                b.a(usage, dVar.f101241d);
            }
            if (i11 >= 32) {
                c.b(usage, dVar.f101242e);
                c.a(usage, dVar.f101243f);
            }
            this.f101245a = usage.build();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f101246a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f101247b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f101248c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f101249d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f101250e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f101251f = false;

        public d a() {
            return new d(this.f101246a, this.f101247b, this.f101248c, this.f101249d, this.f101250e, this.f101251f);
        }

        public e b(int i11) {
            this.f101249d = i11;
            return this;
        }

        public e c(int i11) {
            this.f101246a = i11;
            return this;
        }

        public e d(int i11) {
            this.f101247b = i11;
            return this;
        }

        public e e(boolean z11) {
            this.f101251f = z11;
            return this;
        }

        public e f(int i11) {
            this.f101250e = i11;
            return this;
        }

        public e g(int i11) {
            this.f101248c = i11;
            return this;
        }
    }

    public static d a(Bundle bundle) {
        e eVar = new e();
        String str = f101232i;
        if (bundle.containsKey(str)) {
            eVar.c(bundle.getInt(str));
        }
        String str2 = f101233j;
        if (bundle.containsKey(str2)) {
            eVar.d(bundle.getInt(str2));
        }
        String str3 = f101234k;
        if (bundle.containsKey(str3)) {
            eVar.g(bundle.getInt(str3));
        }
        String str4 = f101235l;
        if (bundle.containsKey(str4)) {
            eVar.b(bundle.getInt(str4));
        }
        String str5 = f101236m;
        if (bundle.containsKey(str5)) {
            eVar.f(bundle.getInt(str5));
        }
        String str6 = f101237n;
        if (bundle.containsKey(str6)) {
            eVar.e(bundle.getBoolean(str6));
        }
        return eVar.a();
    }

    public C2151d b() {
        if (this.f101244g == null) {
            this.f101244g = new C2151d();
        }
        return this.f101244g;
    }

    public int c() {
        if ((this.f101239b & 1) == 1) {
            return 1;
        }
        switch (this.f101240c) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 12:
            default:
                return 3;
            case 13:
                return 1;
        }
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putInt(f101232i, this.f101238a);
        bundle.putInt(f101233j, this.f101239b);
        bundle.putInt(f101234k, this.f101240c);
        bundle.putInt(f101235l, this.f101241d);
        bundle.putInt(f101236m, this.f101242e);
        bundle.putBoolean(f101237n, this.f101243f);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f101238a == dVar.f101238a && this.f101239b == dVar.f101239b && this.f101240c == dVar.f101240c && this.f101241d == dVar.f101241d && this.f101242e == dVar.f101242e && this.f101243f == dVar.f101243f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((527 + this.f101238a) * 31) + this.f101239b) * 31) + this.f101240c) * 31) + this.f101241d) * 31) + this.f101242e) * 31) + (this.f101243f ? 1 : 0);
    }

    private d(int i11, int i12, int i13, int i14, int i15, boolean z11) {
        this.f101238a = i11;
        this.f101239b = i12;
        this.f101240c = i13;
        this.f101241d = i14;
        this.f101242e = i15;
        this.f101243f = z11;
    }
}
