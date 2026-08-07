package com.plaid.internal;

/* JADX INFO: renamed from: com.plaid.internal.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4446j implements B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4491o f47754a;

    public C4446j(C4491o c4491o) {
        this.f47754a = c4491o;
    }

    @Override // com.plaid.internal.B1
    public final InterfaceC4519r1 a() {
        C4561v7 c4561v7 = this.f47754a.f47951f;
        C4561v7.a aVar = c4561v7.f48183a;
        if (aVar == null) {
            C4561v7.f48182d.a(W3.DEBUG, "no cached http client available", new Object[0]);
            return null;
        }
        if (aVar.f48186a.isConnected() == EnumC4589z.YES) {
            C4561v7.f48182d.a(W3.DEBUG, "use cached http client (still connected)", new Object[0]);
            return c4561v7.f48183a.f48186a;
        }
        C4561v7.f48182d.a(W3.DEBUG, "discard cached http client (disconnected)", new Object[0]);
        return null;
    }
}
