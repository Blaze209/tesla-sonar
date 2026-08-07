package com.fourthline.orca.internal;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class Y1 implements C3991wi.e, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f29796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4011x1 f29797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W0 f29798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC4044xs f29799d;

    public Y1(C4011x1 flowConfig, W0 dataBundle, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f29796a = coroutineScope;
        this.f29797b = flowConfig;
        this.f29798c = dataBundle;
        this.f29799d = popupHandler;
    }

    private final BavPaymentMethod b() {
        Object next;
        Iterator it = this.f29797b.getSupportedPaymentMethods().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BavPaymentMethod) next).getName() != H2.Online);
        BavPaymentMethod bavPaymentMethod = (BavPaymentMethod) next;
        return bavPaymentMethod == null ? new BavPaymentMethod(H2.Online, false, 0) : bavPaymentMethod;
    }

    @Override // com.fourthline.orca.internal.C3991wi.e
    public void a(C3991wi c3991wi) {
        p013kotlin.jvm.internal.s.k(c3991wi, "<this>");
        this.f29798c.a(b());
        if (Co.f25256a.a() || this.f29797b.getBavStrategy().a(W1.f29385a.a())) {
            return;
        }
        this.f29799d.a(C3453k2.f32877a);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f29796a.getCoroutineContext();
    }
}
