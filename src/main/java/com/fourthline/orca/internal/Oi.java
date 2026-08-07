package com.fourthline.orca.internal;

import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class Oi implements InterfaceC3131cf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ND f27165a;

    public Oi(ND viewNavigator) {
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        this.f27165a = viewNavigator;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPrimaryClicked(InterfaceC3807sD intent, AbstractC3502l8.d error, String source, wn0.a retryBlock) {
        MD cVar;
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        ND nd2 = this.f27165a;
        AbstractC3641oc abstractC3641ocA = error.a();
        if (p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.a.f34194a) || p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.e.f34198a) || p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.d.f34197a)) {
            cVar = InterfaceC2937Ta.a.e.f27877a;
        } else if (p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.g.f34200a) || p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.i.f34202a)) {
            cVar = InterfaceC2937Ta.a.b.f27874a;
        } else {
            if (!p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.j.f34203a)) {
                if (!p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.f.f34199a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.c.f34196a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.b.f34195a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.h.f34201a)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(("Document PostProcessing doesn't handle this error: " + error).toString());
            }
            cVar = new InterfaceC2937Ta.a.c(error);
        }
        nd2.a(cVar);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3131cf
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onSecondaryClicked(InterfaceC3807sD intent, AbstractC3502l8.d error, String source, wn0.a retryBlock) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(retryBlock, "retryBlock");
        AbstractC3641oc abstractC3641ocA = error.a();
        if (!p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.j.f34203a) && !p013kotlin.jvm.internal.s.f(abstractC3641ocA, AbstractC3641oc.d.f34197a)) {
            this.f27165a.a(new InterfaceC2937Ta.a.c(error));
            return;
        }
        throw new IllegalStateException(("The " + error + " state should not have a secondary button").toString());
    }
}
