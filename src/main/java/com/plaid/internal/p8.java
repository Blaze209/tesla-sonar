package com.plaid.internal;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes6.dex */
public abstract class p8 extends androidx.p003lifecycle.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m8 f48043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J4 f48044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4547u2 f48045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC4542t6 f48046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C4575x3 f48047e;

    public p8(m8 paneId, J4 paneHostComponent) {
        p013kotlin.jvm.internal.s.k(paneId, "paneId");
        p013kotlin.jvm.internal.s.k(paneHostComponent, "paneHostComponent");
        this.f48043a = paneId;
        this.f48044b = paneHostComponent;
    }

    public final C4575x3 a() {
        C4575x3 c4575x3 = this.f48047e;
        if (c4575x3 != null) {
            return c4575x3;
        }
        p013kotlin.jvm.internal.s.B("linkWorkflowAnalytics");
        return null;
    }

    public final InterfaceC4542t6 b() {
        InterfaceC4542t6 interfaceC4542t6 = this.f48046d;
        if (interfaceC4542t6 != null) {
            return interfaceC4542t6;
        }
        p013kotlin.jvm.internal.s.B("paneStore");
        return null;
    }

    public final Object a(m8 m8Var, C4466l1.a aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new n8(this, m8Var, null), aVar);
    }
}
