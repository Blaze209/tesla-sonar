package bv;

import fv.p;

/* JADX INFO: loaded from: classes5.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yv.a<tw.a> f18127a;

    public k(yv.a<tw.a> aVar) {
        this.f18127a = aVar;
    }

    public static /* synthetic */ void a(e eVar, yv.b bVar) {
        ((tw.a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void b(p pVar) {
        if (pVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(pVar);
            this.f18127a.a(new yv.a.InterfaceC2735a() { // from class: bv.j
                @Override // yv.a.InterfaceC2735a
                public final void a(yv.b bVar) {
                    k.a(eVar, bVar);
                }
            });
        }
    }
}
