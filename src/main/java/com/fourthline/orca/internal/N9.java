package com.fourthline.orca.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class N9 implements P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3869tq f27031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3606nk f27032b;

    public N9(InterfaceC3869tq repository, InterfaceC3606nk nationalityValidator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(nationalityValidator, "nationalityValidator");
        this.f27031a = repository;
        this.f27032b = nationalityValidator;
    }

    @Override // com.fourthline.orca.internal.P0
    public P0.a a(InterfaceC3447jx selection) {
        Object next;
        String strC;
        p013kotlin.jvm.internal.s.k(selection, "selection");
        Iterator it = this.f27031a.b().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((G5) next).f(), selection.getName()));
        G5 g11 = (G5) next;
        if (g11 == null) {
            return new P0.a.C0511a(new Th.d());
        }
        if (!this.f27032b.a(g11, this.f27031a.e())) {
            return new P0.a.C0511a(new Th.b.C0521b(g11));
        }
        G5 g5D = this.f27031a.d();
        return (g5D == null || (strC = g5D.c()) == null) ? true : p013kotlin.jvm.internal.s.f(g11.c(), strC) ? P0.a.b.f27265a : new P0.a.C0511a(new Th.b.a(g11));
    }
}
