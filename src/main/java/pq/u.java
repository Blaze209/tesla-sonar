package pq;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile v f103629e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zq.a f103630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zq.a f103631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vq.e f103632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final wq.r f103633d;

    u(zq.a aVar, zq.a aVar2, vq.e eVar, wq.r rVar, wq.v vVar) {
        this.f103630a = aVar;
        this.f103631b = aVar2;
        this.f103632c = eVar;
        this.f103633d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a aVarG = i.a().i(this.f103630a.a()).o(this.f103631b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            aVarG.l(oVar.c().e().a());
        }
        oVar.c().b();
        return aVarG.d();
    }

    public static u c() {
        v vVar = f103629e;
        if (vVar != null) {
            return vVar.n();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<nq.c> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(nq.c.b("proto"));
    }

    public static void f(Context context) {
        if (f103629e == null) {
            synchronized (u.class) {
                try {
                    if (f103629e == null) {
                        f103629e = e.a().a(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // pq.t
    public void a(o oVar, nq.k kVar) {
        this.f103632c.a(oVar.f().f(oVar.c().d()), b(oVar), kVar);
    }

    public wq.r e() {
        return this.f103633d;
    }

    @Deprecated
    public nq.j g(String str) {
        return new q(d(null), p.a().b(str).a(), this);
    }

    public nq.j h(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
