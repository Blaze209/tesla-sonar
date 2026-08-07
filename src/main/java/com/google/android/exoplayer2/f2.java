package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.exoplayer2.f2;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class f2 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f39911a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f39912b = ts.p0.t0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f39913c = ts.p0.t0(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f39914d = ts.p0.t0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g.a<f2> f39915e = new g.a() { // from class: br.o0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return f2.b(bundle);
        }
    };

    class a extends f2 {
        a() {
        }

        @Override // com.google.android.exoplayer2.f2
        public int f(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.f2
        public b k(int i11, b bVar, boolean z11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.f2
        public int m() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.f2
        public Object q(int i11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.f2
        public d s(int i11, d dVar, long j11) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.f2
        public int t() {
            return 0;
        }
    }

    public static final class b implements g {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f39916h = ts.p0.t0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f39917i = ts.p0.t0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f39918j = ts.p0.t0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f39919k = ts.p0.t0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f39920l = ts.p0.t0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final g.a<b> f39921m = new g.a() { // from class: br.p0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return f2.b.c(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f39922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f39923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f39925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f39926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f39927f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private fs.c f39928g = fs.c.f66525g;

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Bundle bundle) {
            int i11 = bundle.getInt(f39916h, 0);
            long j11 = bundle.getLong(f39917i, -9223372036854775807L);
            long j12 = bundle.getLong(f39918j, 0L);
            boolean z11 = bundle.getBoolean(f39919k, false);
            Bundle bundle2 = bundle.getBundle(f39920l);
            fs.c cVar = bundle2 != null ? (fs.c) fs.c.f66531m.a(bundle2) : fs.c.f66525g;
            b bVar = new b();
            bVar.w(null, null, i11, j11, j12, cVar, z11);
            return bVar;
        }

        public int d(int i11) {
            return this.f39928g.c(i11).f66548b;
        }

        public long e(int i11, int i12) {
            fs.c.a aVarC = this.f39928g.c(i11);
            if (aVarC.f66548b != -1) {
                return aVarC.f66552f[i12];
            }
            return -9223372036854775807L;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (ts.p0.c(this.f39922a, bVar.f39922a) && ts.p0.c(this.f39923b, bVar.f39923b) && this.f39924c == bVar.f39924c && this.f39925d == bVar.f39925d && this.f39926e == bVar.f39926e && this.f39927f == bVar.f39927f && ts.p0.c(this.f39928g, bVar.f39928g)) {
                    return true;
                }
            }
            return false;
        }

        public int f() {
            return this.f39928g.f66533b;
        }

        public int g(long j11) {
            return this.f39928g.d(j11, this.f39925d);
        }

        public int h(long j11) {
            return this.f39928g.e(j11, this.f39925d);
        }

        public int hashCode() {
            Object obj = this.f39922a;
            int iHashCode = (EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f39923b;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f39924c) * 31;
            long j11 = this.f39925d;
            int i11 = (iHashCode2 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f39926e;
            return ((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f39927f ? 1 : 0)) * 31) + this.f39928g.hashCode();
        }

        public long i(int i11) {
            return this.f39928g.c(i11).f66547a;
        }

        public long j() {
            return this.f39928g.f66534c;
        }

        public int k(int i11, int i12) {
            fs.c.a aVarC = this.f39928g.c(i11);
            if (aVarC.f66548b != -1) {
                return aVarC.f66551e[i12];
            }
            return 0;
        }

        public long l(int i11) {
            return this.f39928g.c(i11).f66553g;
        }

        public long m() {
            return this.f39925d;
        }

        public int n(int i11) {
            return this.f39928g.c(i11).f();
        }

        public int o(int i11, int i12) {
            return this.f39928g.c(i11).g(i12);
        }

        public long p() {
            return ts.p0.Z0(this.f39926e);
        }

        public long q() {
            return this.f39926e;
        }

        public int r() {
            return this.f39928g.f66536e;
        }

        public boolean s(int i11) {
            return !this.f39928g.c(i11).h();
        }

        public boolean t(int i11) {
            return i11 == f() - 1 && this.f39928g.f(i11);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i11 = this.f39924c;
            if (i11 != 0) {
                bundle.putInt(f39916h, i11);
            }
            long j11 = this.f39925d;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f39917i, j11);
            }
            long j12 = this.f39926e;
            if (j12 != 0) {
                bundle.putLong(f39918j, j12);
            }
            boolean z11 = this.f39927f;
            if (z11) {
                bundle.putBoolean(f39919k, z11);
            }
            if (!this.f39928g.equals(fs.c.f66525g)) {
                bundle.putBundle(f39920l, this.f39928g.toBundle());
            }
            return bundle;
        }

        public boolean u(int i11) {
            return this.f39928g.c(i11).f66554h;
        }

        public b v(Object obj, Object obj2, int i11, long j11, long j12) {
            return w(obj, obj2, i11, j11, j12, fs.c.f66525g, false);
        }

        public b w(Object obj, Object obj2, int i11, long j11, long j12, fs.c cVar, boolean z11) {
            this.f39922a = obj;
            this.f39923b = obj2;
            this.f39924c = i11;
            this.f39925d = j11;
            this.f39926e = j12;
            this.f39928g = cVar;
            this.f39927f = z11;
            return this;
        }
    }

    public static final class c extends f2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final com.google.common.collect.x<d> f39929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final com.google.common.collect.x<b> f39930g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int[] f39931h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int[] f39932i;

        public c(com.google.common.collect.x<d> xVar, com.google.common.collect.x<b> xVar2, int[] iArr) {
            ts.a.a(xVar.size() == iArr.length);
            this.f39929f = xVar;
            this.f39930g = xVar2;
            this.f39931h = iArr;
            this.f39932i = new int[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                this.f39932i[iArr[i11]] = i11;
            }
        }

        @Override // com.google.android.exoplayer2.f2
        public int e(boolean z11) {
            if (u()) {
                return -1;
            }
            if (z11) {
                return this.f39931h[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.f2
        public int f(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.f2
        public int g(boolean z11) {
            if (u()) {
                return -1;
            }
            return z11 ? this.f39931h[t() - 1] : t() - 1;
        }

        @Override // com.google.android.exoplayer2.f2
        public int i(int i11, int i12, boolean z11) {
            if (i12 == 1) {
                return i11;
            }
            if (i11 != g(z11)) {
                return z11 ? this.f39931h[this.f39932i[i11] + 1] : i11 + 1;
            }
            if (i12 == 2) {
                return e(z11);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.f2
        public b k(int i11, b bVar, boolean z11) {
            b bVar2 = this.f39930g.get(i11);
            bVar.w(bVar2.f39922a, bVar2.f39923b, bVar2.f39924c, bVar2.f39925d, bVar2.f39926e, bVar2.f39928g, bVar2.f39927f);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.f2
        public int m() {
            return this.f39930g.size();
        }

        @Override // com.google.android.exoplayer2.f2
        public int p(int i11, int i12, boolean z11) {
            if (i12 == 1) {
                return i11;
            }
            if (i11 != e(z11)) {
                return z11 ? this.f39931h[this.f39932i[i11] - 1] : i11 - 1;
            }
            if (i12 == 2) {
                return g(z11);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.f2
        public Object q(int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.f2
        public d s(int i11, d dVar, long j11) {
            d dVar2 = this.f39929f.get(i11);
            dVar.i(dVar2.f39942a, dVar2.f39944c, dVar2.f39945d, dVar2.f39946e, dVar2.f39947f, dVar2.f39948g, dVar2.f39949h, dVar2.f39950i, dVar2.f39952k, dVar2.f39954m, dVar2.f39955n, dVar2.f39956o, dVar2.f39957p, dVar2.f39958q);
            dVar.f39953l = dVar2.f39953l;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.f2
        public int t() {
            return this.f39929f.size();
        }
    }

    public static final class d implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public Object f39943b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f39945d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f39946e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f39947f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f39948g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f39949h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f39950i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Deprecated
        public boolean f39951j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public x0.g f39952k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f39953l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f39954m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f39955n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f39956o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f39957p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f39958q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final Object f39933r = new Object();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final Object f39934s = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final x0 f39935t = new x0.c().c("com.google.android.exoplayer2.Timeline").f(Uri.EMPTY).a();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final String f39936u = ts.p0.t0(1);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final String f39937v = ts.p0.t0(2);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final String f39938w = ts.p0.t0(3);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final String f39939x = ts.p0.t0(4);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final String f39940y = ts.p0.t0(5);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final String f39941z = ts.p0.t0(6);
        private static final String A = ts.p0.t0(7);
        private static final String B = ts.p0.t0(8);
        private static final String C = ts.p0.t0(9);
        private static final String D = ts.p0.t0(10);
        private static final String E = ts.p0.t0(11);
        private static final String F = ts.p0.t0(12);
        private static final String G = ts.p0.t0(13);
        public static final g.a<d> H = new g.a() { // from class: br.q0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return f2.d.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f39942a = f39933r;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public x0 f39944c = f39935t;

        /* JADX INFO: Access modifiers changed from: private */
        public static d b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f39936u);
            x0 x0Var = bundle2 != null ? (x0) x0.f41165p.a(bundle2) : x0.f41158i;
            long j11 = bundle.getLong(f39937v, -9223372036854775807L);
            long j12 = bundle.getLong(f39938w, -9223372036854775807L);
            long j13 = bundle.getLong(f39939x, -9223372036854775807L);
            boolean z11 = bundle.getBoolean(f39940y, false);
            boolean z12 = bundle.getBoolean(f39941z, false);
            Bundle bundle3 = bundle.getBundle(A);
            x0.g gVar = bundle3 != null ? (x0.g) x0.g.f41245l.a(bundle3) : null;
            boolean z13 = bundle.getBoolean(B, false);
            long j14 = bundle.getLong(C, 0L);
            long j15 = bundle.getLong(D, -9223372036854775807L);
            int i11 = bundle.getInt(E, 0);
            int i12 = bundle.getInt(F, 0);
            long j16 = bundle.getLong(G, 0L);
            d dVar = new d();
            dVar.i(f39934s, x0Var, null, j11, j12, j13, z11, z12, gVar, j14, j15, i11, i12, j16);
            dVar.f39953l = z13;
            return dVar;
        }

        public long c() {
            return ts.p0.Z(this.f39948g);
        }

        public long d() {
            return ts.p0.Z0(this.f39954m);
        }

        public long e() {
            return this.f39954m;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (ts.p0.c(this.f39942a, dVar.f39942a) && ts.p0.c(this.f39944c, dVar.f39944c) && ts.p0.c(this.f39945d, dVar.f39945d) && ts.p0.c(this.f39952k, dVar.f39952k) && this.f39946e == dVar.f39946e && this.f39947f == dVar.f39947f && this.f39948g == dVar.f39948g && this.f39949h == dVar.f39949h && this.f39950i == dVar.f39950i && this.f39953l == dVar.f39953l && this.f39954m == dVar.f39954m && this.f39955n == dVar.f39955n && this.f39956o == dVar.f39956o && this.f39957p == dVar.f39957p && this.f39958q == dVar.f39958q) {
                    return true;
                }
            }
            return false;
        }

        public long f() {
            return ts.p0.Z0(this.f39955n);
        }

        public long g() {
            return this.f39958q;
        }

        public boolean h() {
            ts.a.g(this.f39951j == (this.f39952k != null));
            return this.f39952k != null;
        }

        public int hashCode() {
            int iHashCode = (((EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE + this.f39942a.hashCode()) * 31) + this.f39944c.hashCode()) * 31;
            Object obj = this.f39945d;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            x0.g gVar = this.f39952k;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j11 = this.f39946e;
            int i11 = (iHashCode3 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f39947f;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f39948g;
            int i13 = (((((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f39949h ? 1 : 0)) * 31) + (this.f39950i ? 1 : 0)) * 31) + (this.f39953l ? 1 : 0)) * 31;
            long j14 = this.f39954m;
            int i14 = (i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
            long j15 = this.f39955n;
            int i15 = (((((i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31) + this.f39956o) * 31) + this.f39957p) * 31;
            long j16 = this.f39958q;
            return i15 + ((int) (j16 ^ (j16 >>> 32)));
        }

        public d i(Object obj, x0 x0Var, Object obj2, long j11, long j12, long j13, boolean z11, boolean z12, x0.g gVar, long j14, long j15, int i11, int i12, long j16) {
            x0.h hVar;
            this.f39942a = obj;
            this.f39944c = x0Var != null ? x0Var : f39935t;
            this.f39943b = (x0Var == null || (hVar = x0Var.f41167b) == null) ? null : hVar.f41272i;
            this.f39945d = obj2;
            this.f39946e = j11;
            this.f39947f = j12;
            this.f39948g = j13;
            this.f39949h = z11;
            this.f39950i = z12;
            this.f39951j = gVar != null;
            this.f39952k = gVar;
            this.f39954m = j14;
            this.f39955n = j15;
            this.f39956o = i11;
            this.f39957p = i12;
            this.f39958q = j16;
            this.f39953l = false;
            return this;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!x0.f41158i.equals(this.f39944c)) {
                bundle.putBundle(f39936u, this.f39944c.toBundle());
            }
            long j11 = this.f39946e;
            if (j11 != -9223372036854775807L) {
                bundle.putLong(f39937v, j11);
            }
            long j12 = this.f39947f;
            if (j12 != -9223372036854775807L) {
                bundle.putLong(f39938w, j12);
            }
            long j13 = this.f39948g;
            if (j13 != -9223372036854775807L) {
                bundle.putLong(f39939x, j13);
            }
            boolean z11 = this.f39949h;
            if (z11) {
                bundle.putBoolean(f39940y, z11);
            }
            boolean z12 = this.f39950i;
            if (z12) {
                bundle.putBoolean(f39941z, z12);
            }
            x0.g gVar = this.f39952k;
            if (gVar != null) {
                bundle.putBundle(A, gVar.toBundle());
            }
            boolean z13 = this.f39953l;
            if (z13) {
                bundle.putBoolean(B, z13);
            }
            long j14 = this.f39954m;
            if (j14 != 0) {
                bundle.putLong(C, j14);
            }
            long j15 = this.f39955n;
            if (j15 != -9223372036854775807L) {
                bundle.putLong(D, j15);
            }
            int i11 = this.f39956o;
            if (i11 != 0) {
                bundle.putInt(E, i11);
            }
            int i12 = this.f39957p;
            if (i12 != 0) {
                bundle.putInt(F, i12);
            }
            long j16 = this.f39958q;
            if (j16 != 0) {
                bundle.putLong(G, j16);
            }
            return bundle;
        }
    }

    protected f2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static f2 b(Bundle bundle) {
        com.google.common.collect.x xVarC = c(d.H, ts.b.a(bundle, f39912b));
        com.google.common.collect.x xVarC2 = c(b.f39921m, ts.b.a(bundle, f39913c));
        int[] intArray = bundle.getIntArray(f39914d);
        if (intArray == null) {
            intArray = d(xVarC.size());
        }
        return new c(xVarC, xVarC2, intArray);
    }

    private static <T extends g> com.google.common.collect.x<T> c(g.a<T> aVar, IBinder iBinder) {
        if (iBinder == null) {
            return com.google.common.collect.x.r();
        }
        com.google.common.collect.x.a aVar2 = new com.google.common.collect.x.a();
        com.google.common.collect.x<Bundle> xVarA = br.c.a(iBinder);
        for (int i11 = 0; i11 < xVarA.size(); i11++) {
            aVar2.a(aVar.a(xVarA.get(i11)));
        }
        return aVar2.k();
    }

    private static int[] d(int i11) {
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = i12;
        }
        return iArr;
    }

    public int e(boolean z11) {
        return u() ? -1 : 0;
    }

    public boolean equals(Object obj) {
        int iG;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        if (f2Var.t() != t() || f2Var.m() != m()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i11 = 0; i11 < t(); i11++) {
            if (!r(i11, dVar).equals(f2Var.r(i11, dVar2))) {
                return false;
            }
        }
        for (int i12 = 0; i12 < m(); i12++) {
            if (!k(i12, bVar, true).equals(f2Var.k(i12, bVar2, true))) {
                return false;
            }
        }
        int iE = e(true);
        if (iE != f2Var.e(true) || (iG = g(true)) != f2Var.g(true)) {
            return false;
        }
        while (iE != iG) {
            int i13 = i(iE, 0, true);
            if (i13 != f2Var.i(iE, 0, true)) {
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
        int i13 = j(i11, bVar).f39924c;
        if (r(i13, dVar).f39957p != i11) {
            return i11 + 1;
        }
        int i14 = i(i13, i12, z11);
        if (i14 == -1) {
            return -1;
        }
        return r(i14, dVar).f39956o;
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
        return (Pair) ts.a.e(o(dVar, bVar, i11, j11, 0L));
    }

    public final Pair<Object, Long> o(d dVar, b bVar, int i11, long j11, long j12) {
        ts.a.c(i11, 0, t());
        s(i11, dVar, j12);
        if (j11 == -9223372036854775807L) {
            j11 = dVar.e();
            if (j11 == -9223372036854775807L) {
                return null;
            }
        }
        int i12 = dVar.f39956o;
        j(i12, bVar);
        while (i12 < dVar.f39957p && bVar.f39926e != j11) {
            int i13 = i12 + 1;
            if (j(i13, bVar).f39926e > j11) {
                break;
            }
            i12 = i13;
        }
        k(i12, bVar, true);
        long jMin = j11 - bVar.f39926e;
        long j13 = bVar.f39925d;
        if (j13 != -9223372036854775807L) {
            jMin = Math.min(jMin, j13 - 1);
        }
        return Pair.create(ts.a.e(bVar.f39923b), Long.valueOf(Math.max(0L, jMin)));
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

    @Override // com.google.android.exoplayer2.g
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int iT = t();
        d dVar = new d();
        for (int i11 = 0; i11 < iT; i11++) {
            arrayList.add(s(i11, dVar, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int iM = m();
        b bVar = new b();
        for (int i12 = 0; i12 < iM; i12++) {
            arrayList2.add(k(i12, bVar, false).toBundle());
        }
        int[] iArr = new int[iT];
        if (iT > 0) {
            iArr[0] = e(true);
        }
        for (int i13 = 1; i13 < iT; i13++) {
            iArr[i13] = i(iArr[i13 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        ts.b.c(bundle, f39912b, new br.c(arrayList));
        ts.b.c(bundle, f39913c, new br.c(arrayList2));
        bundle.putIntArray(f39914d, iArr);
        return bundle;
    }

    public final boolean u() {
        return t() == 0;
    }

    public final boolean v(int i11, b bVar, d dVar, int i12, boolean z11) {
        return h(i11, bVar, dVar, i12, z11) == -1;
    }
}
