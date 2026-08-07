package io.realm;

import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.Util;

/* JADX INFO: loaded from: classes9.dex */
public class RealmQuery<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Table f78883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f78884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TableQuery f78885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r0 f78886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Class<E> f78887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f78888f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f78889g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.realm.internal.k f78890h;

    private RealmQuery(c0 c0Var, Class<E> cls) {
        this.f78884b = c0Var;
        this.f78887e = cls;
        boolean zN = n(cls);
        this.f78889g = !zN;
        if (!zN) {
            throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
        }
        r0 r0VarG = c0Var.J().g(cls);
        this.f78886d = r0VarG;
        Table tableG = r0VarG.g();
        this.f78883a = tableG;
        this.f78890h = null;
        this.f78885c = tableG.E();
    }

    static <E extends n0> RealmQuery<E> e(c0 c0Var, Class<E> cls) {
        return new RealmQuery<>(c0Var, cls);
    }

    static <E> RealmQuery<E> f(s0<E> s0Var) {
        Class<E> cls = s0Var.f79177b;
        return cls == null ? new RealmQuery<>((s0<j>) s0Var, s0Var.f79178c) : new RealmQuery<>(s0Var, cls);
    }

    private s0<E> g(TableQuery tableQuery, boolean z11) {
        OsResults osResultsF = OsResults.f(this.f78884b.f78899e, tableQuery);
        s0<E> s0Var = o() ? new s0<>(this.f78884b, osResultsF, this.f78888f) : new s0<>(this.f78884b, osResultsF, this.f78887e);
        if (z11) {
            s0Var.j();
        }
        return s0Var;
    }

    private static boolean n(Class<?> cls) {
        return n0.class.isAssignableFrom(cls);
    }

    private static native String nativeSerializeQuery(long j11);

    private boolean o() {
        return this.f78888f != null;
    }

    public RealmQuery<E> a() {
        this.f78884b.n();
        this.f78885c.a();
        return this;
    }

    public RealmQuery<E> b(String str, d0 d0Var, d dVar) {
        this.f78884b.n();
        if (dVar == d.SENSITIVE) {
            this.f78885c.c(this.f78884b.J().f(), str, d0Var);
            return this;
        }
        this.f78885c.d(this.f78884b.J().f(), str, d0Var);
        return this;
    }

    public RealmQuery<E> c(String str, String str2) {
        return d(str, str2, d.SENSITIVE);
    }

    public RealmQuery<E> d(String str, String str2, d dVar) {
        Util.b(str2, "value");
        this.f78884b.n();
        b(str, d0.b(str2), dVar);
        return this;
    }

    public RealmQuery<E> h(String str, d0 d0Var, d dVar) {
        this.f78884b.n();
        if (dVar == d.SENSITIVE) {
            this.f78885c.f(this.f78884b.J().f(), str, d0Var);
            return this;
        }
        this.f78885c.g(this.f78884b.J().f(), str, d0Var);
        return this;
    }

    public RealmQuery<E> i(String str, String str2) {
        return j(str, str2, d.SENSITIVE);
    }

    public RealmQuery<E> j(String str, String str2, d dVar) {
        this.f78884b.n();
        h(str, d0.b(str2), dVar);
        return this;
    }

    public s0<E> k() {
        this.f78884b.n();
        this.f78884b.c();
        return g(this.f78885c, true);
    }

    public RealmQuery<E> l(String str, String[] strArr) {
        return m(str, strArr, d.SENSITIVE);
    }

    public RealmQuery<E> m(String str, String[] strArr, d dVar) {
        this.f78884b.n();
        if (strArr == null || strArr.length == 0) {
            a();
            return this;
        }
        d0[] d0VarArr = new d0[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String str2 = strArr[i11];
            if (str2 != null) {
                d0VarArr[i11] = d0.b(str2);
            } else {
                d0VarArr[i11] = null;
            }
        }
        if (dVar == d.SENSITIVE) {
            this.f78885c.j(this.f78884b.J().f(), str, d0VarArr);
            return this;
        }
        this.f78885c.k(this.f78884b.J().f(), str, d0VarArr);
        return this;
    }

    public RealmQuery<E> p() {
        this.f78884b.n();
        this.f78885c.m();
        return this;
    }

    private RealmQuery(s0<E> s0Var, Class<E> cls) {
        a aVar = s0Var.f79176a;
        this.f78884b = aVar;
        this.f78887e = cls;
        boolean zN = n(cls);
        this.f78889g = !zN;
        if (zN) {
            this.f78886d = aVar.J().g(cls);
            this.f78883a = s0Var.f();
            this.f78890h = null;
            this.f78885c = s0Var.e().s();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    private RealmQuery(s0<j> s0Var, String str) {
        a aVar = s0Var.f79176a;
        this.f78884b = aVar;
        this.f78888f = str;
        this.f78889g = false;
        r0 r0VarH = aVar.J().h(str);
        this.f78886d = r0VarH;
        this.f78883a = r0VarH.g();
        this.f78885c = s0Var.e().s();
        this.f78890h = null;
    }
}
