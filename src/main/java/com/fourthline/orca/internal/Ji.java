package com.fourthline.orca.internal;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class Ji implements Fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p011ja.w f26471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26472b;

    public Ji(p011ja.w navHostController) {
        p013kotlin.jvm.internal.s.k(navHostController, "navHostController");
        this.f26471a = navHostController;
        this.f26472b = Ji.class.getSimpleName();
    }

    @Override // com.fourthline.orca.internal.Fk
    public void a(ja.n.c listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.f26471a.r(listener);
    }

    @Override // com.fourthline.orca.internal.Fk
    public p011ja.r a() {
        return this.f26471a.F();
    }

    @Override // com.fourthline.orca.internal.Fk
    public boolean b() {
        return this.f26471a.Y();
    }

    @Override // com.fourthline.orca.internal.Fk
    public boolean a(InterfaceC3949vk destination, boolean z11) {
        Integer numValueOf;
        Object next;
        p011ja.r destination2;
        p013kotlin.jvm.internal.s.k(destination, "destination");
        p011ja.w wVar = this.f26471a;
        String strA = destination.a();
        Iterator it = p013kotlin.collections.v.V(wVar.C().getValue()).iterator();
        do {
            numValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((p011ja.k) next).getDestination().getRoute(), strA));
        p011ja.k kVar = (p011ja.k) next;
        if (kVar != null && (destination2 = kVar.getDestination()) != null) {
            numValueOf = Integer.valueOf(destination2.getId());
        }
        if (numValueOf != null) {
            destination.toString();
            return wVar.Z(numValueOf.intValue(), z11);
        }
        b(destination);
        return false;
    }

    private final void b(InterfaceC3949vk interfaceC3949vk) {
        p011ja.r rVarA = a();
        String strA = rVarA != null ? AbstractC3993wk.a(rVarA) : null;
        if (strA != null) {
            int iHashCode = strA.hashCode();
            if (iHashCode != -2103697634) {
                if (iHashCode != -1930722121) {
                    if (iHashCode != 1186133026 || !strA.equals("document_capture")) {
                        return;
                    }
                } else if (!strA.equals("document_processing")) {
                    return;
                }
            } else if (!strA.equals("document_details")) {
                return;
            }
            String strB = interfaceC3949vk.b();
            int iHashCode2 = strB.hashCode();
            if (iHashCode2 != 985156020) {
                if (iHashCode2 != 1585573854) {
                    if (iHashCode2 != 1591379058 || !strB.equals(AnalyticsAttribute.DocumentCountry)) {
                        return;
                    }
                } else if (!strB.equals(AnalyticsAttribute.DocumentType)) {
                    return;
                }
            } else if (!strB.equals("document_version")) {
                return;
            }
            a((InterfaceC3949vk) new InterfaceC3949vk.h.b(null, 1, null), true);
            InterfaceC3949vk.j.a aVar = new InterfaceC3949vk.j.a(null, 1, null);
            D4 d11 = interfaceC3949vk instanceof D4 ? (D4) interfaceC3949vk : null;
            a(aVar, d11 != null ? d11.getConfig() : null);
        }
    }

    @Override // com.fourthline.orca.internal.Fk
    public void a(InterfaceC3949vk destination) {
        p013kotlin.jvm.internal.s.k(destination, "destination");
        D4 d11 = destination instanceof D4 ? (D4) destination : null;
        a(destination, d11 != null ? d11.getConfig() : null);
    }

    @Override // com.fourthline.orca.internal.Fk
    public void a(InterfaceC3949vk destination, final C3906uk c3906uk) {
        p013kotlin.jvm.internal.s.k(destination, "destination");
        p011ja.w wVar = this.f26471a;
        destination.a();
        wVar.U(destination.a(), new wn0.l() { // from class: com.fourthline.orca.internal.dg0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return Ji.a(c3906uk, (p011ja.z) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3906uk c3906uk, p011ja.z navigate) {
        p013kotlin.jvm.internal.s.k(navigate, "$this$navigate");
        if (c3906uk != null) {
            navigate.e(c3906uk.d());
            navigate.h(c3906uk.c());
            final C3743qs c3743qsB = c3906uk.b();
            if (c3743qsB != null) {
                navigate.d(c3743qsB.a().a(), new wn0.l() { // from class: com.fourthline.orca.internal.eg0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Ji.a(c3743qsB, (p011ja.g0) obj);
                    }
                });
            }
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3743qs c3743qs, p011ja.g0 popUpTo) {
        p013kotlin.jvm.internal.s.k(popUpTo, "$this$popUpTo");
        popUpTo.c(c3743qs.b());
        popUpTo.d(c3743qs.c());
        return jn0.h0.f84049a;
    }
}
