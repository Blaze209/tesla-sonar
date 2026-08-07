package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;

/* JADX INFO: loaded from: classes9.dex */
public class h extends io.realm.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final t0 f78931l;

    class a implements g0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g0 f78932a;

        a(g0 g0Var) {
            this.f78932a = g0Var;
        }

        @Override // io.realm.g0.b
        public void onResult(int i11) {
            if (i11 <= 0 && !this.f78932a.i().r() && OsObjectStore.c(h.this.f78899e) == -1) {
                h.this.f78899e.beginTransaction();
                if (OsObjectStore.c(h.this.f78899e) == -1) {
                    OsObjectStore.e(h.this.f78899e, -1L);
                }
                h.this.f78899e.commitTransaction();
            }
        }
    }

    private h(g0 g0Var, OsSharedRealm.a aVar) {
        super(g0Var, (OsSchemaInfo) null, aVar);
        g0.m(g0Var.i(), new a(g0Var));
        this.f78931l = new r(this);
    }

    static h k0(g0 g0Var, OsSharedRealm.a aVar) {
        return new h(g0Var, aVar);
    }

    static h n0(OsSharedRealm osSharedRealm) {
        return new h(osSharedRealm);
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ i0 I() {
        return super.I();
    }

    @Override // io.realm.a
    public t0 J() {
        return this.f78931l;
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean b0() {
        return super.b0();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean c0() {
        return super.c0();
    }

    @Override // io.realm.a, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ void e0() {
        super.e0();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ String getPath() {
        return super.getPath();
    }

    @Override // io.realm.a
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    private h(OsSharedRealm osSharedRealm) {
        super(osSharedRealm);
        this.f78931l = new r(this);
    }
}
