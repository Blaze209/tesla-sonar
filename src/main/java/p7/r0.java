package p7;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f101451a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f101452b = s7.q0.N0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f101453c = s7.q0.N0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f101454d = s7.q0.N0(2);

    class a extends r0 {
        a() {
        }

        @Override // p7.r0
        public int f(Object obj) {
            return -1;
        }

        @Override // p7.r0
        public b k(int i11, b bVar, boolean z11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p7.r0
        public int m() {
            return 0;
        }

        @Override // p7.r0
        public Object q(int i11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p7.r0
        public d s(int i11, d dVar, long j11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // p7.r0
        public int t() {
            return 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f101455h = s7.q0.N0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f101456i = s7.q0.N0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f101457j = s7.q0.N0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f101458k = s7.q0.N0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f101459l = s7.q0.N0(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f101460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f101461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f101462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f101463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f101464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f101465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p7.b f101466g = p7.b.f101195g;

        public static b a(Bundle bundle) {
            int i11 = bundle.getInt(f101455h, 0);
            long j11 = bundle.getLong(f101456i, -9223372036854775807L);
            long j12 = bundle.getLong(f101457j, 0L);
            boolean z11 = bundle.getBoolean(f101458k, false);
            Bundle bundle2 = bundle.getBundle(f101459l);
            p7.b bVarA = bundle2 != null ? p7.b.a(bundle2) : p7.b.f101195g;
            b bVar = new b();
            bVar.v(null, null, i11, j11, j12, bVarA, z11);
            return bVar;
        }

        public int b(int i11) {
            return this.f101466g.b(i11).f101219b;
        }

        public long c(int i11, int i12) {
            p7.b.a aVarB = this.f101466g.b(i11);
            if (aVarB.f101219b != -1) {
                return aVarB.f101224g[i12];
            }
            return -9223372036854775807L;
        }

        public int d() {
            return this.f101466g.f101202b;
        }

        public int e(long j11) {
            return this.f101466g.c(j11, this.f101463d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (Objects.equals(this.f101460a, bVar.f101460a) && Objects.equals(this.f101461b, bVar.f101461b) && this.f101462c == bVar.f101462c && this.f101463d == bVar.f101463d && this.f101464e == bVar.f101464e && this.f101465f == bVar.f101465f && Objects.equals(this.f101466g, bVar.f101466g)) {
                    return true;
                }
            }
            return false;
        }

        public int f(long j11) {
            return this.f101466g.d(j11, this.f101463d);
        }

        public long g(int i11) {
            return this.f101466g.b(i11).f101218a;
        }

        public long h() {
            return this.f101466g.f101203c;
        }

        public int hashCode() {
            Object obj = this.f101460a;
            int iHashCode = (EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f101461b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f101462c) * 31;
            long j11 = this.f101463d;
            int i11 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f101464e;
            return ((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f101465f ? 1 : 0)) * 31) + this.f101466g.hashCode();
        }

        public int i(int i11, int i12) {
            p7.b.a aVarB = this.f101466g.b(i11);
            if (aVarB.f101219b != -1) {
                return aVarB.f101223f[i12];
            }
            return 0;
        }

        public long j(int i11) {
            return this.f101466g.b(i11).f101226i;
        }

        public long k() {
            return s7.q0.O1(this.f101463d);
        }

        public long l() {
            return this.f101463d;
        }

        public int m(int i11) {
            return this.f101466g.b(i11).d();
        }

        public int n(int i11, int i12) {
            return this.f101466g.b(i11).g(i12);
        }

        public long o() {
            return s7.q0.O1(this.f101464e);
        }

        public long p() {
            return this.f101464e;
        }

        public int q() {
            return this.f101466g.f101205e;
        }

        public boolean r(int i11) {
            return !this.f101466g.b(i11).h();
        }

        public boolean s(int i11) {
            return i11 == d() - 1 && this.f101466g.e(i11);
        }

        public boolean t(int i11) {
            return this.f101466g.b(i11).f101227j;
        }

        public b u(Object obj, Object obj2, int i11, long j11, long j12) {
            return v(obj, obj2, i11, j11, j12, p7.b.f101195g, false);
        }

        public b v(Object obj, Object obj2, int i11, long j11, long j12, p7.b bVar, boolean z11) {
            this.f101460a = obj;
            this.f101461b = obj2;
            this.f101462c = i11;
            this.f101463d = j11;
            this.f101464e = j12;
            this.f101466g = bVar;
            this.f101465f = z11;
            return this;
        }

        public Bundle w() {
            Bundle bundle = new Bundle();
            int i11 = this.f101462c;
            if (i11 != 0) {
                bundle.putInt(f101455h, i11);
            }
            long j11 = this.f101463d;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f101456i, j11);
            }
            long j12 = this.f101464e;
            if (j12 != 0) {
                bundle.putLong(f101457j, j12);
            }
            boolean z11 = this.f101465f;
            if (z11) {
                bundle.putBoolean(f101458k, z11);
            }
            if (!this.f101466g.equals(p7.b.f101195g)) {
                bundle.putBundle(f101459l, this.f101466g.g());
            }
            return bundle;
        }
    }

    public static final class c extends r0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.google.common.collect.x<d> f101467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.google.common.collect.x<b> f101468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int[] f101469g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f101470h;

        public c(com.google.common.collect.x<d> xVar, com.google.common.collect.x<b> xVar2, int[] iArr) {
            s7.a.a(xVar.size() == iArr.length);
            this.f101467e = xVar;
            this.f101468f = xVar2;
            this.f101469g = iArr;
            this.f101470h = new int[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                this.f101470h[iArr[i11]] = i11;
            }
        }

        @Override // p7.r0
        public int e(boolean z11) {
            if (u()) {
                return -1;
            }
            if (z11) {
                return this.f101469g[0];
            }
            return 0;
        }

        @Override // p7.r0
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // p7.r0
        public int g(boolean z11) {
            if (u()) {
                return -1;
            }
            return z11 ? this.f101469g[t() - 1] : t() - 1;
        }

        @Override // p7.r0
        public int i(int i11, int i12, boolean z11) {
            if (i12 == 1) {
                return i11;
            }
            if (i11 != g(z11)) {
                return z11 ? this.f101469g[this.f101470h[i11] + 1] : i11 + 1;
            }
            if (i12 == 2) {
                return e(z11);
            }
            return -1;
        }

        @Override // p7.r0
        public b k(int i11, b bVar, boolean z11) {
            b bVar2 = this.f101468f.get(i11);
            bVar.v(bVar2.f101460a, bVar2.f101461b, bVar2.f101462c, bVar2.f101463d, bVar2.f101464e, bVar2.f101466g, bVar2.f101465f);
            return bVar;
        }

        @Override // p7.r0
        public int m() {
            return this.f101468f.size();
        }

        @Override // p7.r0
        public int p(int i11, int i12, boolean z11) {
            if (i12 == 1) {
                return i11;
            }
            if (i11 != e(z11)) {
                return z11 ? this.f101469g[this.f101470h[i11] - 1] : i11 - 1;
            }
            if (i12 == 2) {
                return g(z11);
            }
            return -1;
        }

        @Override // p7.r0
        public Object q(int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // p7.r0
        public d s(int i11, d dVar, long j11) {
            d dVar2 = this.f101467e.get(i11);
            dVar.h(dVar2.f101481a, dVar2.f101483c, dVar2.f101484d, dVar2.f101485e, dVar2.f101486f, dVar2.f101487g, dVar2.f101488h, dVar2.f101489i, dVar2.f101490j, dVar2.f101492l, dVar2.f101493m, dVar2.f101494n, dVar2.f101495o, dVar2.f101496p);
            dVar.f101491k = dVar2.f101491k;
            return dVar;
        }

        @Override // p7.r0
        public int t() {
            return this.f101467e.size();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f101482b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f101484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f101485e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f101486f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f101487g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f101488h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f101489i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public y.g f101490j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f101491k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f101492l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f101493m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f101494n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f101495o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f101496p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Object f101471q = new Object();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final Object f101472r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final y f101473s = new y.c().c("androidx.media3.common.Timeline").i(Uri.EMPTY).a();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final String f101474t = s7.q0.N0(1);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f101475u = s7.q0.N0(2);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f101476v = s7.q0.N0(3);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f101477w = s7.q0.N0(4);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f101478x = s7.q0.N0(5);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f101479y = s7.q0.N0(6);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f101480z = s7.q0.N0(7);
        private static final String A = s7.q0.N0(8);
        private static final String B = s7.q0.N0(9);
        private static final String C = s7.q0.N0(10);
        private static final String D = s7.q0.N0(11);
        private static final String E = s7.q0.N0(12);
        private static final String F = s7.q0.N0(13);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f101481a = f101471q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y f101483c = f101473s;

        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f101474t);
            y yVarB = bundle2 != null ? y.b(bundle2) : y.f101674i;
            long j11 = bundle.getLong(f101475u, -9223372036854775807L);
            long j12 = bundle.getLong(f101476v, -9223372036854775807L);
            long j13 = bundle.getLong(f101477w, -9223372036854775807L);
            boolean z11 = bundle.getBoolean(f101478x, false);
            boolean z12 = bundle.getBoolean(f101479y, false);
            Bundle bundle3 = bundle.getBundle(f101480z);
            y.g gVarB = bundle3 != null ? y.g.b(bundle3) : null;
            boolean z13 = bundle.getBoolean(A, false);
            long j14 = bundle.getLong(B, 0L);
            long j15 = bundle.getLong(C, -9223372036854775807L);
            int i11 = bundle.getInt(D, 0);
            int i12 = bundle.getInt(E, 0);
            long j16 = bundle.getLong(F, 0L);
            d dVar = new d();
            dVar.h(f101472r, yVarB, null, j11, j12, j13, z11, z12, gVarB, j14, j15, i11, i12, j16);
            dVar.f101491k = z13;
            return dVar;
        }

        public long b() {
            return s7.q0.p0(this.f101487g);
        }

        public long c() {
            return s7.q0.O1(this.f101492l);
        }

        public long d() {
            return this.f101492l;
        }

        public long e() {
            return s7.q0.O1(this.f101493m);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (Objects.equals(this.f101481a, dVar.f101481a) && Objects.equals(this.f101483c, dVar.f101483c) && Objects.equals(this.f101484d, dVar.f101484d) && Objects.equals(this.f101490j, dVar.f101490j) && this.f101485e == dVar.f101485e && this.f101486f == dVar.f101486f && this.f101487g == dVar.f101487g && this.f101488h == dVar.f101488h && this.f101489i == dVar.f101489i && this.f101491k == dVar.f101491k && this.f101492l == dVar.f101492l && this.f101493m == dVar.f101493m && this.f101494n == dVar.f101494n && this.f101495o == dVar.f101495o && this.f101496p == dVar.f101496p) {
                    return true;
                }
            }
            return false;
        }

        public long f() {
            return this.f101496p;
        }

        public boolean g() {
            return this.f101490j != null;
        }

        public d h(Object obj, y yVar, Object obj2, long j11, long j12, long j13, boolean z11, boolean z12, y.g gVar, long j14, long j15, int i11, int i12, long j16) {
            y.h hVar;
            this.f101481a = obj;
            this.f101483c = yVar != null ? yVar : f101473s;
            this.f101482b = (yVar == null || (hVar = yVar.f101682b) == null) ? null : hVar.f101791i;
            this.f101484d = obj2;
            this.f101485e = j11;
            this.f101486f = j12;
            this.f101487g = j13;
            this.f101488h = z11;
            this.f101489i = z12;
            this.f101490j = gVar;
            this.f101492l = j14;
            this.f101493m = j15;
            this.f101494n = i11;
            this.f101495o = i12;
            this.f101496p = j16;
            this.f101491k = false;
            return this;
        }

        public int hashCode() {
            int iHashCode = (((EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE + this.f101481a.hashCode()) * 31) + this.f101483c.hashCode()) * 31;
            Object obj = this.f101484d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            y.g gVar = this.f101490j;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j11 = this.f101485e;
            int i11 = (iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f101486f;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f101487g;
            int i13 = (((((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f101488h ? 1 : 0)) * 31) + (this.f101489i ? 1 : 0)) * 31) + (this.f101491k ? 1 : 0)) * 31;
            long j14 = this.f101492l;
            int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.f101493m;
            int i15 = (((((i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + this.f101494n) * 31) + this.f101495o) * 31;
            long j16 = this.f101496p;
            return i15 + ((int) (j16 ^ (j16 >>> 32)));
        }

        public Bundle i() {
            Bundle bundle = new Bundle();
            if (!y.f101674i.equals(this.f101483c)) {
                bundle.putBundle(f101474t, this.f101483c.e());
            }
            long j11 = this.f101485e;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f101475u, j11);
            }
            long j12 = this.f101486f;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f101476v, j12);
            }
            long j13 = this.f101487g;
            if (j13 != -9223372036854775807L) {
                bundle.putLong(f101477w, j13);
            }
            boolean z11 = this.f101488h;
            if (z11) {
                bundle.putBoolean(f101478x, z11);
            }
            boolean z12 = this.f101489i;
            if (z12) {
                bundle.putBoolean(f101479y, z12);
            }
            y.g gVar = this.f101490j;
            if (gVar != null) {
                bundle.putBundle(f101480z, gVar.c());
            }
            boolean z13 = this.f101491k;
            if (z13) {
                bundle.putBoolean(A, z13);
            }
            long j14 = this.f101492l;
            if (j14 != 0) {
                bundle.putLong(B, j14);
            }
            long j15 = this.f101493m;
            if (j15 != -9223372036854775807L) {
                bundle.putLong(C, j15);
            }
            int i11 = this.f101494n;
            if (i11 != 0) {
                bundle.putInt(D, i11);
            }
            int i12 = this.f101495o;
            if (i12 != 0) {
                bundle.putInt(E, i12);
            }
            long j16 = this.f101496p;
            if (j16 != 0) {
                bundle.putLong(F, j16);
            }
            return bundle;
        }
    }

    protected r0() {
    }

    public static r0 b(Bundle bundle) {
        com.google.common.collect.x xVarC = c(new ou.h() { // from class: p7.p0
            @Override // ou.h
            public final Object apply(Object obj) {
                return r0.d.a((Bundle) obj);
            }
        }, bundle.getBinder(f101452b));
        com.google.common.collect.x xVarC2 = c(new ou.h() { // from class: p7.q0
            @Override // ou.h
            public final Object apply(Object obj) {
                return r0.b.a((Bundle) obj);
            }
        }, bundle.getBinder(f101453c));
        int[] intArray = bundle.getIntArray(f101454d);
        if (intArray == null) {
            intArray = d(xVarC.size());
        }
        return new c(xVarC, xVarC2, intArray);
    }

    private static <T> com.google.common.collect.x<T> c(ou.h<Bundle, T> hVar, IBinder iBinder) {
        return iBinder == null ? com.google.common.collect.x.r() : s7.i.d(hVar, g.a(iBinder));
    }

    private static int[] d(int i11) {
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = i12;
        }
        return iArr;
    }

    public final r0 a(int i11) {
        if (t() == 1) {
            return this;
        }
        d dVarS = s(i11, new d(), 0L);
        com.google.common.collect.x.a aVarK = com.google.common.collect.x.k();
        int i12 = dVarS.f101494n;
        while (true) {
            int i13 = dVarS.f101495o;
            if (i12 > i13) {
                dVarS.f101495o = i13 - dVarS.f101494n;
                dVarS.f101494n = 0;
                return new c(com.google.common.collect.x.s(dVarS), aVarK.k(), new int[]{0});
            }
            b bVarK = k(i12, new b(), true);
            bVarK.f101462c = 0;
            aVarK.a(bVarK);
            i12++;
        }
    }

    public int e(boolean z11) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int iG;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (r0Var.t() != t() || r0Var.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i11 = 0; i11 < t(); i11++) {
            if (!r(i11, dVar).equals(r0Var.r(i11, dVar2))) {
                return false;
            }
        }
        for (int i12 = 0; i12 < m(); i12++) {
            if (!k(i12, bVar, true).equals(r0Var.k(i12, bVar2, true))) {
                return false;
            }
        }
        int iE = e(true);
        if (iE != r0Var.e(true) || (iG = g(true)) != r0Var.g(true)) {
            return false;
        }
        while (iE != iG) {
            int i13 = i(iE, 0, true);
            if (i13 != r0Var.i(iE, 0, true)) {
                return false;
            }
            iE = i13;
        }
        return true;
    }

    public abstract int f(Object obj);

    public int g(boolean z11) {
        if (u()) {
            return -1;
        }
        return t() - 1;
    }

    public final int h(int i11, b bVar, d dVar, int i12, boolean z11) {
        int i13 = j(i11, bVar).f101462c;
        if (r(i13, dVar).f101495o != i11) {
            return i11 + 1;
        }
        int i14 = i(i13, i12, z11);
        if (i14 == -1) {
            return -1;
        }
        return r(i14, dVar).f101494n;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iT = EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE + t();
        for (int i11 = 0; i11 < t(); i11++) {
            iT = (iT * 31) + r(i11, dVar).hashCode();
        }
        int iM = (iT * 31) + m();
        for (int i12 = 0; i12 < m(); i12++) {
            iM = (iM * 31) + k(i12, bVar, true).hashCode();
        }
        int iE = e(true);
        while (iE != -1) {
            iM = (iM * 31) + iE;
            iE = i(iE, 0, true);
        }
        return iM;
    }

    public int i(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == g(z11)) {
                return -1;
            }
            return i11 + 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == g(z11) ? e(z11) : i11 + 1;
        }
        throw new IllegalStateException();
    }

    public final b j(int i11, b bVar) {
        return k(i11, bVar, false);
    }

    public abstract b k(int i11, b bVar, boolean z11);

    public b l(Object obj, b bVar) {
        return k(f(obj), bVar, true);
    }

    public abstract int m();

    public final Pair<Object, Long> n(d dVar, b bVar, int i11, long j11) {
        return (Pair) s7.a.f(o(dVar, bVar, i11, j11, 0L));
    }

    public final Pair<Object, Long> o(d dVar, b bVar, int i11, long j11, long j12) {
        s7.a.c(i11, 0, t());
        s(i11, dVar, j12);
        if (j11 == -9223372036854775807L) {
            j11 = dVar.d();
            if (j11 == -9223372036854775807L) {
                return null;
            }
        }
        int i12 = dVar.f101494n;
        j(i12, bVar);
        while (i12 < dVar.f101495o && bVar.f101464e != j11) {
            int i13 = i12 + 1;
            if (j(i13, bVar).f101464e > j11) {
                break;
            }
            i12 = i13;
        }
        k(i12, bVar, true);
        long jMin = j11 - bVar.f101464e;
        long j13 = bVar.f101463d;
        if (j13 != -9223372036854775807L) {
            jMin = Math.min(jMin, j13 - 1);
        }
        return Pair.create(s7.a.f(bVar.f101461b), Long.valueOf(Math.max(0L, jMin)));
    }

    public int p(int i11, int i12, boolean z11) {
        if (i12 == 0) {
            if (i11 == e(z11)) {
                return -1;
            }
            return i11 - 1;
        }
        if (i12 == 1) {
            return i11;
        }
        if (i12 == 2) {
            return i11 == e(z11) ? g(z11) : i11 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object q(int i11);

    public final d r(int i11, d dVar) {
        return s(i11, dVar, 0L);
    }

    public abstract d s(int i11, d dVar, long j11);

    public abstract int t();

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i11, b bVar, d dVar, int i12, boolean z11) {
        return h(i11, bVar, dVar, i12, z11) == -1;
    }

    public final Bundle w() {
        ArrayList arrayList = new ArrayList();
        int iT = t();
        d dVar = new d();
        for (int i11 = 0; i11 < iT; i11++) {
            arrayList.add(s(i11, dVar, 0L).i());
        }
        ArrayList arrayList2 = new ArrayList();
        int iM = m();
        b bVar = new b();
        for (int i12 = 0; i12 < iM; i12++) {
            arrayList2.add(k(i12, bVar, false).w());
        }
        int[] iArr = new int[iT];
        if (iT > 0) {
            iArr[0] = e(true);
        }
        for (int i13 = 1; i13 < iT; i13++) {
            iArr[i13] = i(iArr[i13 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        bundle.putBinder(f101452b, new g(arrayList));
        bundle.putBinder(f101453c, new g(arrayList2));
        bundle.putIntArray(f101454d, iArr);
        return bundle;
    }
}
