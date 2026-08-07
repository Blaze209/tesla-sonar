package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.g2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g2 implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g2 f39962b = new g2(com.google.common.collect.x.r());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f39963c = ts.p0.t0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g.a<g2> f39964d = new g.a() { // from class: br.r0
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return g2.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.collect.x<a> f39965a;

    public static final class a implements g {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final String f39966f = ts.p0.t0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f39967g = ts.p0.t0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f39968h = ts.p0.t0(3);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f39969i = ts.p0.t0(4);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final g.a<a> f39970j = new g.a() { // from class: br.s0
            @Override // com.google.android.exoplayer2.g.a
            public final com.google.android.exoplayer2.g a(Bundle bundle) {
                return g2.a.a(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f39971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final es.u f39972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f39973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f39974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean[] f39975e;

        public a(es.u uVar, boolean z11, int[] iArr, boolean[] zArr) {
            int i11 = uVar.f63205a;
            this.f39971a = i11;
            boolean z12 = false;
            ts.a.a(i11 == iArr.length && i11 == zArr.length);
            this.f39972b = uVar;
            if (z11 && i11 > 1) {
                z12 = true;
            }
            this.f39973c = z12;
            this.f39974d = (int[]) iArr.clone();
            this.f39975e = (boolean[]) zArr.clone();
        }

        public static /* synthetic */ a a(Bundle bundle) {
            es.u uVar = (es.u) es.u.f63204h.a((Bundle) ts.a.e(bundle.getBundle(f39966f)));
            return new a(uVar, bundle.getBoolean(f39969i, false), (int[]) ou.j.a(bundle.getIntArray(f39967g), new int[uVar.f63205a]), (boolean[]) ou.j.a(bundle.getBooleanArray(f39968h), new boolean[uVar.f63205a]));
        }

        public es.u b() {
            return this.f39972b;
        }

        public u0 c(int i11) {
            return this.f39972b.c(i11);
        }

        public int d() {
            return this.f39972b.f63207c;
        }

        public boolean e() {
            return ru.a.a(this.f39975e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f39973c == aVar.f39973c && this.f39972b.equals(aVar.f39972b) && Arrays.equals(this.f39974d, aVar.f39974d) && Arrays.equals(this.f39975e, aVar.f39975e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean f(boolean z11) {
            for (int i11 = 0; i11 < this.f39974d.length; i11++) {
                if (i(i11, z11)) {
                    return true;
                }
            }
            return false;
        }

        public boolean g(int i11) {
            return this.f39975e[i11];
        }

        public boolean h(int i11) {
            return i(i11, false);
        }

        public int hashCode() {
            return (((((this.f39972b.hashCode() * 31) + (this.f39973c ? 1 : 0)) * 31) + Arrays.hashCode(this.f39974d)) * 31) + Arrays.hashCode(this.f39975e);
        }

        public boolean i(int i11, boolean z11) {
            int i12 = this.f39974d[i11];
            if (i12 != 4) {
                return z11 && i12 == 3;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f39966f, this.f39972b.toBundle());
            bundle.putIntArray(f39967g, this.f39974d);
            bundle.putBooleanArray(f39968h, this.f39975e);
            bundle.putBoolean(f39969i, this.f39973c);
            return bundle;
        }
    }

    public g2(List<a> list) {
        this.f39965a = com.google.common.collect.x.n(list);
    }

    public static /* synthetic */ g2 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f39963c);
        return new g2(parcelableArrayList == null ? com.google.common.collect.x.r() : ts.c.d(a.f39970j, parcelableArrayList));
    }

    public com.google.common.collect.x<a> b() {
        return this.f39965a;
    }

    public boolean c() {
        return this.f39965a.isEmpty();
    }

    public boolean d(int i11) {
        for (int i12 = 0; i12 < this.f39965a.size(); i12++) {
            a aVar = this.f39965a.get(i12);
            if (aVar.e() && aVar.d() == i11) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i11) {
        return f(i11, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g2.class != obj.getClass()) {
            return false;
        }
        return this.f39965a.equals(((g2) obj).f39965a);
    }

    public boolean f(int i11, boolean z11) {
        for (int i12 = 0; i12 < this.f39965a.size(); i12++) {
            if (this.f39965a.get(i12).d() == i11 && this.f39965a.get(i12).f(z11)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f39965a.hashCode();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f39963c, ts.c.i(this.f39965a));
        return bundle;
    }
}
