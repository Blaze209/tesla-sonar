package io.realm;

import io.realm.internal.Table;
import io.realm.internal.Util;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Table> f79165a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<? extends n0>, Table> f79166b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<? extends n0>, r0> f79167c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, r0> f79168d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OsKeyPathMapping f79169e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final a f79170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final io.realm.internal.b f79171g;

    t0(a aVar, io.realm.internal.b bVar) {
        this.f79170f = aVar;
        this.f79171g = bVar;
    }

    private void a() {
        if (!k()) {
            throw new IllegalStateException("Attempt to use column key before set.");
        }
    }

    private boolean l(Class<? extends n0> cls, Class<? extends n0> cls2) {
        return cls.equals(cls2);
    }

    void b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(str2);
        }
    }

    public abstract r0 c(String str);

    public void d() {
        this.f79169e = new OsKeyPathMapping(this.f79170f.f78899e.getNativePtr());
    }

    final io.realm.internal.c e(Class<? extends n0> cls) {
        a();
        return this.f79171g.a(cls);
    }

    final OsKeyPathMapping f() {
        return this.f79169e;
    }

    r0 g(Class<? extends n0> cls) {
        r0 r0Var = this.f79167c.get(cls);
        if (r0Var != null) {
            return r0Var;
        }
        Class<? extends n0> clsC = Util.c(cls);
        if (l(clsC, cls)) {
            r0Var = this.f79167c.get(clsC);
        }
        if (r0Var == null) {
            m mVar = new m(this.f79170f, this, i(cls), e(clsC));
            this.f79167c.put(clsC, mVar);
            r0Var = mVar;
        }
        if (l(clsC, cls)) {
            this.f79167c.put(cls, r0Var);
        }
        return r0Var;
    }

    r0 h(String str) {
        String strQ = Table.q(str);
        r0 r0Var = this.f79168d.get(strQ);
        if (r0Var != null && r0Var.g().v() && r0Var.d().equals(str)) {
            return r0Var;
        }
        if (this.f79170f.T().hasTable(strQ)) {
            a aVar = this.f79170f;
            m mVar = new m(aVar, this, aVar.T().getTable(strQ));
            this.f79168d.put(strQ, mVar);
            return mVar;
        }
        throw new IllegalArgumentException("The class " + str + " doesn't exist in this Realm.");
    }

    Table i(Class<? extends n0> cls) {
        Table table = this.f79166b.get(cls);
        if (table != null) {
            return table;
        }
        Class<? extends n0> clsC = Util.c(cls);
        if (l(clsC, cls)) {
            table = this.f79166b.get(clsC);
        }
        if (table == null) {
            table = this.f79170f.T().getTable(Table.q(this.f79170f.I().n().l(clsC)));
            this.f79166b.put(clsC, table);
        }
        if (l(clsC, cls)) {
            this.f79166b.put(cls, table);
        }
        return table;
    }

    Table j(String str) {
        String strQ = Table.q(str);
        Table table = this.f79165a.get(strQ);
        if (table != null) {
            return table;
        }
        Table table2 = this.f79170f.T().getTable(strQ);
        this.f79165a.put(strQ, table2);
        return table2;
    }

    final boolean k() {
        return this.f79171g != null;
    }

    void m() {
        io.realm.internal.b bVar = this.f79171g;
        if (bVar != null) {
            bVar.b();
        }
        this.f79165a.clear();
        this.f79166b.clear();
        this.f79167c.clear();
        this.f79168d.clear();
    }
}
