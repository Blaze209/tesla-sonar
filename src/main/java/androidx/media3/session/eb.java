package androidx.media3.session;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
class eb extends ha.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ha.n f11638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s8 f11639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f<ha.n.b> f11640l;

    public eb(s8 s8Var) {
        this.f11638j = ha.n.a(s8Var.a0());
        this.f11639k = s8Var;
        this.f11640l = new f<>(s8Var);
    }

    public static /* synthetic */ void t(eb ebVar, AtomicReference atomicReference, t7.g gVar, s7.m mVar) {
        atomicReference.set(ebVar.f11639k.y0(gVar));
        mVar.f();
    }

    @Override // ha.g
    public ha.g.e g(String str, int i11, Bundle bundle) {
        ha.n.b bVarD = d();
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        final t7.g gVarU = u(bVarD, bundle);
        final AtomicReference atomicReference = new AtomicReference();
        final s7.m mVar = new s7.m();
        s7.q0.m1(this.f11639k.X(), new Runnable() { // from class: androidx.media3.session.db
            @Override // java.lang.Runnable
            public final void run() {
                eb.t(this.f11611a, atomicReference, gVarU, mVar);
            }
        });
        try {
            mVar.a();
            t7.e eVar = (t7.e) atomicReference.get();
            if (!eVar.f12380a) {
                return null;
            }
            this.f11640l.e(bVarD, gVarU, eVar.f12381b, eVar.f12382c);
            return me.f11983a;
        } catch (InterruptedException e11) {
            s7.t.e("MSSLegacyStub", "Couldn't get a result from onConnect", e11);
            return null;
        }
    }

    @Override // ha.g
    public void h(String str, ha.g.l<List<ha.e.h>> lVar) {
        lVar.g(null);
    }

    public t7.g u(ha.n.b bVar, Bundle bundle) {
        return new t7.g(bVar, 0, 0, this.f11638j.b(bVar), null, bundle, LegacyConversions.f0(bundle));
    }

    public final f<ha.n.b> v() {
        return this.f11640l;
    }

    public final ha.n w() {
        return this.f11638j;
    }

    public void x(ha.l.j jVar) {
        c(this.f11639k.a0());
        onCreate();
        s(jVar);
    }
}
