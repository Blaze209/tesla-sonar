package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f40076e = new b(0).e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f40077f = ts.p0.t0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f40078g = ts.p0.t0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f40079h = ts.p0.t0(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f40080i = ts.p0.t0(3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g.a<j> f40081j = new g.a() { // from class: br.g
        @Override // com.google.android.exoplayer2.g.a
        public final com.google.android.exoplayer2.g a(Bundle bundle) {
            return com.google.android.exoplayer2.j.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f40085d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f40086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f40087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f40089d;

        public b(int i11) {
            this.f40086a = i11;
        }

        public j e() {
            ts.a.a(this.f40087b <= this.f40088c);
            return new j(this);
        }

        public b f(int i11) {
            this.f40088c = i11;
            return this;
        }

        public b g(int i11) {
            this.f40087b = i11;
            return this;
        }

        public b h(String str) {
            ts.a.a(this.f40086a != 0 || str == null);
            this.f40089d = str;
            return this;
        }
    }

    public static /* synthetic */ j a(Bundle bundle) {
        int i11 = bundle.getInt(f40077f, 0);
        int i12 = bundle.getInt(f40078g, 0);
        int i13 = bundle.getInt(f40079h, 0);
        return new b(i11).g(i12).f(i13).h(bundle.getString(f40080i)).e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f40082a == jVar.f40082a && this.f40083b == jVar.f40083b && this.f40084c == jVar.f40084c && ts.p0.c(this.f40085d, jVar.f40085d);
    }

    public int hashCode() {
        int i11 = (((((527 + this.f40082a) * 31) + this.f40083b) * 31) + this.f40084c) * 31;
        String str = this.f40085d;
        return i11 + (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i11 = this.f40082a;
        if (i11 != 0) {
            bundle.putInt(f40077f, i11);
        }
        int i12 = this.f40083b;
        if (i12 != 0) {
            bundle.putInt(f40078g, i12);
        }
        int i13 = this.f40084c;
        if (i13 != 0) {
            bundle.putInt(f40079h, i13);
        }
        String str = this.f40085d;
        if (str != null) {
            bundle.putString(f40080i, str);
        }
        return bundle;
    }

    private j(b bVar) {
        this.f40082a = bVar.f40086a;
        this.f40083b = bVar.f40087b;
        this.f40084c = bVar.f40088c;
        this.f40085d = bVar.f40089d;
    }
}
