package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import rj.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.j f20467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gj.d f20468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private gj.b f20469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private hj.h f20470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ij.a f20471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ij.a f20472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private hj.a.InterfaceC1535a f20473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private hj.i f20474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private rj.c f20475k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o.b f20478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ij.a f20479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f20480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<com.bumptech.glide.request.h<Object>> f20481q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f20465a = new androidx.collection.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f20466b = new f.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20476l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.bumptech.glide.c.a f20477m = new a();

    class a implements com.bumptech.glide.c.a {
        a() {
        }

        @Override // com.bumptech.glide.c.a
        @NonNull
        public com.bumptech.glide.request.i build() {
            return new com.bumptech.glide.request.i();
        }
    }

    static final class b {
        b() {
        }
    }

    public static final class c {
    }

    @NonNull
    com.bumptech.glide.c a(@NonNull Context context, List<sj.b> list, sj.a aVar) {
        if (this.f20471g == null) {
            this.f20471g = ij.a.i();
        }
        if (this.f20472h == null) {
            this.f20472h = ij.a.g();
        }
        if (this.f20479o == null) {
            this.f20479o = ij.a.e();
        }
        if (this.f20474j == null) {
            this.f20474j = new hj.i.a(context).a();
        }
        if (this.f20475k == null) {
            this.f20475k = new rj.e();
        }
        if (this.f20468d == null) {
            int iB = this.f20474j.b();
            if (iB > 0) {
                this.f20468d = new gj.j(iB);
            } else {
                this.f20468d = new gj.e();
            }
        }
        if (this.f20469e == null) {
            this.f20469e = new gj.i(this.f20474j.a());
        }
        if (this.f20470f == null) {
            this.f20470f = new hj.g(this.f20474j.d());
        }
        if (this.f20473i == null) {
            this.f20473i = new hj.f(context);
        }
        if (this.f20467c == null) {
            this.f20467c = new com.bumptech.glide.load.engine.j(this.f20470f, this.f20473i, this.f20472h, this.f20471g, ij.a.j(), this.f20479o, this.f20480p);
        }
        List<com.bumptech.glide.request.h<Object>> list2 = this.f20481q;
        if (list2 == null) {
            this.f20481q = Collections.EMPTY_LIST;
        } else {
            this.f20481q = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.c(context, this.f20467c, this.f20470f, this.f20468d, this.f20469e, new o(this.f20478n), this.f20475k, this.f20476l, this.f20477m, this.f20465a, this.f20481q, list, aVar, this.f20466b.b());
    }

    void b(o.b bVar) {
        this.f20478n = bVar;
    }
}
