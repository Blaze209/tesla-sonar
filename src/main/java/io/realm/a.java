package io.realm;

import android.content.Context;
import io.realm.exceptions.RealmException;
import io.realm.internal.CheckedRow;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.log.RealmLog;
import java.io.Closeable;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
abstract class a implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static volatile Context f78891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final bn0.a f78892i = bn0.a.d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bn0.a f78893j = bn0.a.e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f78894k = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f78895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f78896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final i0 f78897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g0 f78898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OsSharedRealm f78899e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f78900f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OsSharedRealm.SchemaChangedCallback f78901g;

    /* JADX INFO: renamed from: io.realm.a$a, reason: collision with other inner class name */
    class C1681a implements OsSharedRealm.SchemaChangedCallback {
        C1681a() {
        }

        @Override // io.realm.internal.OsSharedRealm.SchemaChangedCallback
        public void onSchemaChanged() {
            t0 t0VarJ = a.this.J();
            if (t0VarJ != null) {
                t0VarJ.m();
            }
            if (a.this instanceof c0) {
                t0VarJ.d();
            }
        }
    }

    class b implements OsSharedRealm.MigrationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f78903a;

        b(m0 m0Var) {
            this.f78903a = m0Var;
        }

        @Override // io.realm.internal.OsSharedRealm.MigrationCallback
        public void onMigrationNeeded(OsSharedRealm osSharedRealm, long j11, long j12) {
            this.f78903a.a(h.n0(osSharedRealm), j11, j12);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f78904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private io.realm.internal.q f78905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private io.realm.internal.c f78906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f78907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List<String> f78908e;

        public void a() {
            this.f78904a = null;
            this.f78905b = null;
            this.f78906c = null;
            this.f78907d = false;
            this.f78908e = null;
        }

        public boolean b() {
            return this.f78907d;
        }

        public io.realm.internal.c c() {
            return this.f78906c;
        }

        public List<String> d() {
            return this.f78908e;
        }

        a e() {
            return this.f78904a;
        }

        public io.realm.internal.q f() {
            return this.f78905b;
        }

        public void g(a aVar, io.realm.internal.q qVar, io.realm.internal.c cVar, boolean z11, List<String> list) {
            this.f78904a = aVar;
            this.f78905b = qVar;
            this.f78906c = cVar;
            this.f78907d = z11;
            this.f78908e = list;
        }
    }

    static final class d extends ThreadLocal<c> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c initialValue() {
            return new c();
        }
    }

    a(g0 g0Var, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        this(g0Var.i(), osSchemaInfo, aVar);
        this.f78898d = g0Var;
    }

    private static OsSharedRealm.MigrationCallback p(m0 m0Var) {
        return new b(m0Var);
    }

    <E extends n0> E B(Class<E> cls, long j11, boolean z11, List<String> list) {
        return (E) this.f78897c.n().q(cls, this, J().i(cls).r(j11), J().e(cls), z11, list);
    }

    <E extends n0> E C(Class<E> cls, String str, long j11) {
        boolean z11 = str != null;
        Table tableJ = z11 ? J().j(str) : J().i(cls);
        if (z11) {
            return new j(this, j11 != -1 ? tableJ.f(j11) : io.realm.internal.f.INSTANCE);
        }
        return (E) this.f78897c.n().q(cls, this, j11 != -1 ? tableJ.r(j11) : io.realm.internal.f.INSTANCE, J().e(cls), false, Collections.EMPTY_LIST);
    }

    <E extends n0> E H(Class<E> cls, String str, UncheckedRow uncheckedRow) {
        return str != null ? new j(this, CheckedRow.e(uncheckedRow)) : (E) this.f78897c.n().q(cls, this, uncheckedRow, J().e(cls), false, Collections.EMPTY_LIST);
    }

    public i0 I() {
        return this.f78897c;
    }

    public abstract t0 J();

    OsSharedRealm T() {
        return this.f78899e;
    }

    public boolean b0() {
        OsSharedRealm osSharedRealm = this.f78899e;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        return this.f78895a;
    }

    public void beginTransaction() {
        n();
        this.f78899e.beginTransaction();
    }

    protected void c() {
        if (T().capabilities.a() && !I().q()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }

    public boolean c0() {
        n();
        return this.f78899e.isInTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f78895a && this.f78896b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        g0 g0Var = this.f78898d;
        if (g0Var != null) {
            g0Var.o(this);
        } else {
            t();
        }
    }

    public void e0() {
        n();
        c();
        if (c0()) {
            throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
        }
        this.f78899e.refresh();
    }

    protected void finalize() throws Throwable {
        OsSharedRealm osSharedRealm;
        if (this.f78900f && (osSharedRealm = this.f78899e) != null && !osSharedRealm.isClosed()) {
            RealmLog.g("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.f78897c.k());
            g0 g0Var = this.f78898d;
            if (g0Var != null) {
                g0Var.n();
            }
        }
        super.finalize();
    }

    public String getPath() {
        return this.f78897c.k();
    }

    public boolean isClosed() {
        if (!this.f78895a && this.f78896b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
        OsSharedRealm osSharedRealm = this.f78899e;
        return osSharedRealm == null || osSharedRealm.isClosed();
    }

    protected void n() {
        OsSharedRealm osSharedRealm = this.f78899e;
        if (osSharedRealm == null || osSharedRealm.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        if (!this.f78895a && this.f78896b != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
    }

    public void o() {
        n();
        this.f78899e.commitTransaction();
    }

    void t() {
        this.f78898d = null;
        OsSharedRealm osSharedRealm = this.f78899e;
        if (osSharedRealm == null || !this.f78900f) {
            return;
        }
        osSharedRealm.close();
        this.f78899e = null;
    }

    a(i0 i0Var, OsSchemaInfo osSchemaInfo, OsSharedRealm.a aVar) {
        this.f78901g = new C1681a();
        this.f78896b = Thread.currentThread().getId();
        this.f78897c = i0Var;
        this.f78898d = null;
        OsSharedRealm.MigrationCallback migrationCallbackP = (osSchemaInfo == null || i0Var.i() == null) ? null : p(i0Var.i());
        i0Var.g();
        OsSharedRealm osSharedRealm = OsSharedRealm.getInstance(new OsRealmConfig.b(i0Var).c(new File(f78891h.getFilesDir(), ".realm.temp")).a(true).e(migrationCallbackP).f(osSchemaInfo).d(null), aVar);
        this.f78899e = osSharedRealm;
        this.f78895a = osSharedRealm.isFrozen();
        this.f78900f = true;
        this.f78899e.registerSchemaChangedCallback(this.f78901g);
    }

    a(OsSharedRealm osSharedRealm) {
        this.f78901g = new C1681a();
        this.f78896b = Thread.currentThread().getId();
        this.f78897c = osSharedRealm.getConfiguration();
        this.f78898d = null;
        this.f78899e = osSharedRealm;
        this.f78895a = osSharedRealm.isFrozen();
        this.f78900f = false;
    }
}
