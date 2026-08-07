package com.plaid.internal;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: renamed from: com.plaid.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4349b implements InterfaceC4519r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4392d f46874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4400d7 f46875b;

    public C4349b(C4424g4 c4424g4) {
        this.f46874a = new C4392d(c4424g4);
        this.f46875b = new C4400d7(c4424g4);
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final void a() {
        this.f46874a.a();
        this.f46875b.a();
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final EnumC4589z isConnected() {
        return this.f46874a.isConnected();
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final InterfaceC4519r1.b a(InterfaceC4519r1.a aVar) {
        boolean zEquals;
        try {
            zEquals = new URL(aVar.f48078a).getProtocol().equals("https");
        } catch (MalformedURLException unused) {
            zEquals = false;
        }
        if (zEquals) {
            return this.f46874a.a(aVar);
        }
        return this.f46875b.a(aVar);
    }
}
