package com.google.gson.internal.bind;

import bx.h0;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class n<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r<T> f44940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.gson.k<T> f44941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final com.google.gson.f f44942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.gson.reflect.a<T> f44943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f44944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n<T>.b f44945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f44946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile x<T> f44947h;

    private final class b implements q, com.google.gson.j {
        private b() {
        }

        @Override // com.google.gson.q
        public com.google.gson.l a(Object obj) {
            return n.this.f44942c.y(obj);
        }
    }

    private static final class c implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.google.gson.reflect.a<?> f44949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f44950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<?> f44951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final r<?> f44952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.google.gson.k<?> f44953e;

        c(Object obj, com.google.gson.reflect.a<?> aVar, boolean z11, Class<?> cls) {
            r<?> rVar = obj instanceof r ? (r) obj : null;
            this.f44952d = rVar;
            com.google.gson.k<?> kVar = obj instanceof com.google.gson.k ? (com.google.gson.k) obj : null;
            this.f44953e = kVar;
            if (rVar != null || kVar != null) {
                this.f44949a = aVar;
                this.f44950b = z11;
                this.f44951c = cls;
            } else {
                Objects.requireNonNull(obj);
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            boolean zIsAssignableFrom;
            com.google.gson.reflect.a<?> aVar2 = this.f44949a;
            if (aVar2 != null) {
                zIsAssignableFrom = aVar2.equals(aVar) || (this.f44950b && this.f44949a.getType() == aVar.getRawType());
            } else {
                zIsAssignableFrom = this.f44951c.isAssignableFrom(aVar.getRawType());
            }
            if (zIsAssignableFrom) {
                return new n(this.f44952d, this.f44953e, fVar, aVar, this);
            }
            return null;
        }
    }

    public n(r<T> rVar, com.google.gson.k<T> kVar, com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar, y yVar, boolean z11) {
        this.f44945f = new b();
        this.f44940a = rVar;
        this.f44941b = kVar;
        this.f44942c = fVar;
        this.f44943d = aVar;
        this.f44944e = yVar;
        this.f44946g = z11;
    }

    private x<T> f() {
        x<T> xVar = this.f44947h;
        if (xVar != null) {
            return xVar;
        }
        x<T> xVarN = this.f44942c.n(this.f44944e, this.f44943d);
        this.f44947h = xVarN;
        return xVarN;
    }

    public static y g(com.google.gson.reflect.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.getType() == aVar.getRawType(), null);
    }

    @Override // com.google.gson.x
    public T b(ex.a aVar) {
        if (this.f44941b == null) {
            return f().b(aVar);
        }
        com.google.gson.l lVarA = h0.a(aVar);
        if (this.f44946g && lVarA.h()) {
            return null;
        }
        return this.f44941b.deserialize(lVarA, this.f44943d.getType(), this.f44945f);
    }

    @Override // com.google.gson.x
    public void d(ex.c cVar, T t11) throws IOException {
        r<T> rVar = this.f44940a;
        if (rVar == null) {
            f().d(cVar, t11);
        } else if (this.f44946g && t11 == null) {
            cVar.k0();
        } else {
            h0.b(rVar.serialize(t11, this.f44943d.getType(), this.f44945f), cVar);
        }
    }

    @Override // com.google.gson.internal.bind.m
    public x<T> e() {
        return this.f44940a != null ? this : f();
    }

    public n(r<T> rVar, com.google.gson.k<T> kVar, com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar, y yVar) {
        this(rVar, kVar, fVar, aVar, yVar, true);
    }
}
