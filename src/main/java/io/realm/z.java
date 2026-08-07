package io.realm;

import io.realm.internal.OsObject;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.UncheckedRow;
import io.realm.n0;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class z<E extends n0> implements io.realm.internal.l.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static b f79193i = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private E f79194a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private io.realm.internal.q f79196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OsObject f79197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.realm.a f79198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f79199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f79200g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f79195b = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.realm.internal.j<OsObject.b> f79201h = new io.realm.internal.j<>();

    private static class b implements io.realm.internal.j.a<OsObject.b> {
        private b() {
        }

        @Override // io.realm.internal.j.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(OsObject.b bVar, Object obj) {
            bVar.a((n0) obj, null);
        }
    }

    public z(E e11) {
        this.f79194a = e11;
    }

    private void f() {
        this.f79201h.c(f79193i);
    }

    private void g() {
        OsSharedRealm osSharedRealm = this.f79198e.f78899e;
        if (osSharedRealm == null || osSharedRealm.isClosed() || !this.f79196c.isValid() || this.f79197d != null) {
            return;
        }
        OsObject osObject = new OsObject(this.f79198e.f78899e, (UncheckedRow) this.f79196c);
        this.f79197d = osObject;
        osObject.setObserverPairs(this.f79201h);
        this.f79201h = null;
    }

    @Override // io.realm.internal.l.a
    public void a(io.realm.internal.q qVar) {
        this.f79196c = qVar;
        f();
        if (qVar.isValid()) {
            g();
        }
    }

    public boolean b() {
        return this.f79199f;
    }

    public io.realm.a c() {
        return this.f79198e;
    }

    public io.realm.internal.q d() {
        return this.f79196c;
    }

    public boolean e() {
        return this.f79195b;
    }

    public void h(boolean z11) {
        this.f79199f = z11;
    }

    public void i() {
        this.f79195b = false;
        this.f79200g = null;
    }

    public void j(List<String> list) {
        this.f79200g = list;
    }

    public void k(io.realm.a aVar) {
        this.f79198e = aVar;
    }

    public void l(io.realm.internal.q qVar) {
        this.f79196c = qVar;
    }
}
