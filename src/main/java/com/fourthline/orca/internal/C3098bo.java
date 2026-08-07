package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3098bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3654op f30688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f30689b;

    public C3098bo(InterfaceC3654op orcaSubcomponent) {
        p013kotlin.jvm.internal.s.k(orcaSubcomponent, "orcaSubcomponent");
        this.f30688a = orcaSubcomponent;
        this.f30689b = new ArrayList();
    }

    public final Do a() {
        return (Do) p013kotlin.collections.v.C0(this.f30689b);
    }

    public final boolean b(Do flow) {
        p013kotlin.jvm.internal.s.k(flow, "flow");
        InterfaceC3654op interfaceC3654op = this.f30688a;
        p011ja.r rVarD = interfaceC3654op.C().H().D(flow.e());
        if (rVarD != null) {
            interfaceC3654op.C().H().M(rVarD);
        }
        return this.f30689b.remove(flow);
    }

    public final Do a(Rf flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        Do doA = a();
        if (p013kotlin.jvm.internal.s.f(doA != null ? doA.c() : null, flowConfig)) {
            return a();
        }
        Do doA2 = a(this.f30688a, flowConfig);
        if (doA2 == null) {
            return null;
        }
        this.f30689b.add(doA2);
        return doA2;
    }

    public final Do a(InterfaceC3949vk interfaceC3949vk) {
        if (interfaceC3949vk instanceof InterfaceC3949vk.j) {
            while (!this.f30689b.isEmpty() && !(p013kotlin.collections.v.A0(this.f30689b) instanceof C3683pb)) {
                b((Do) p013kotlin.collections.v.A0(this.f30689b));
            }
        } else {
            b((Do) p013kotlin.collections.v.A0(this.f30689b));
        }
        return (Do) p013kotlin.collections.v.C0(this.f30689b);
    }

    public final void a(Do flow) {
        p013kotlin.jvm.internal.s.k(flow, "flow");
        InterfaceC3654op interfaceC3654op = this.f30688a;
        if (interfaceC3654op.C().H().D(flow.e()) != null) {
            return;
        }
        p011ja.w wVarC = interfaceC3654op.C();
        String strE = flow.e();
        String strA = flow.b().b().a();
        wn0.l lVarD = flow.d();
        p011ja.u uVar = new p011ja.u(wVarC.get_navigatorProvider(), strA, strE);
        lVarD.invoke(uVar);
        interfaceC3654op.C().H().A(uVar.b());
    }

    private final Do a(InterfaceC3654op interfaceC3654op, Rf rf2) {
        Do doA;
        try {
            doA = rf2.a();
        } catch (jn0.q unused) {
            doA = null;
        }
        if (doA != null) {
            doA.a(interfaceC3654op);
        }
        return doA;
    }
}
