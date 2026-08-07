package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4563w0 implements InterfaceC4418f7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4554v0 f48192a;

    public C4563w0(C4554v0 c4554v0) {
        this.f48192a = c4554v0;
    }

    @Override // com.plaid.internal.InterfaceC4418f7
    public final C4428h a(Object obj, C4500p c4500p) {
        try {
            InterfaceC4519r1 interfaceC4519r1A = ((B1) obj).a();
            return interfaceC4519r1A != null ? C4428h.a(interfaceC4519r1A) : C4428h.a(this.f48192a.a());
        } catch (C4509q e11) {
            return C4428h.a((Exception) e11);
        }
    }
}
