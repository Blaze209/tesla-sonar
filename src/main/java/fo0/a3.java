package fo0;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class a3 extends p013kotlin.jvm.internal.p0 {
    private static c1 l(p013kotlin.jvm.internal.f fVar) {
        co0.g owner = fVar.getOwner();
        return owner instanceof c1 ? (c1) owner : k.f66175d;
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.h a(p013kotlin.jvm.internal.o oVar) {
        return new h1(l(oVar), oVar.getName(), oVar.getSignature(), oVar.getBoundReceiver());
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.d b(Class cls) {
        return h.m(cls);
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.g c(Class cls, String str) {
        return h.n(cls);
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.j d(p013kotlin.jvm.internal.w wVar) {
        return new j1(l(wVar), wVar.getName(), wVar.getSignature(), wVar.getBoundReceiver());
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.k e(p013kotlin.jvm.internal.y yVar) {
        return new l1(l(yVar), yVar.getName(), yVar.getSignature(), yVar.getBoundReceiver());
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.n f(p013kotlin.jvm.internal.c0 c0Var) {
        return new a2(l(c0Var), c0Var.getName(), c0Var.getSignature(), c0Var.getBoundReceiver());
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.o g(p013kotlin.jvm.internal.e0 e0Var) {
        return new d2(l(e0Var), e0Var.getName(), e0Var.getSignature(), e0Var.getBoundReceiver());
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.p h(p013kotlin.jvm.internal.g0 g0Var) {
        return new g2(l(g0Var), g0Var.getName(), g0Var.getSignature());
    }

    @Override // p013kotlin.jvm.internal.p0
    public String i(p013kotlin.jvm.internal.n nVar) {
        h1 h1VarC;
        co0.h hVarA = eo0.d.a(nVar);
        return (hVarA == null || (h1VarC = i3.c(hVarA)) == null) ? super.i(nVar) : d3.f66112a.h(h1VarC.U());
    }

    @Override // p013kotlin.jvm.internal.p0
    public String j(p013kotlin.jvm.internal.u uVar) {
        return i(uVar);
    }

    @Override // p013kotlin.jvm.internal.p0
    public co0.q k(co0.f fVar, List<co0.s> list, boolean z11) {
        return fVar instanceof p013kotlin.jvm.internal.h ? h.k(((p013kotlin.jvm.internal.h) fVar).a(), list, z11) : do0.d.b(fVar, list, z11, Collections.EMPTY_LIST);
    }
}
