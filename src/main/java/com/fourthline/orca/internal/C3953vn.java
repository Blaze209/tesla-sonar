package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DocumentType;
import com.fourthline.nfc.NfcScannerComposableKt;

/* JADX INFO: renamed from: com.fourthline.orca.internal.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3953vn implements InterfaceC3909un {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4104z8 f36270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f36271b;

    public C3953vn(C4104z8 bundle, Context context) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f36270a = bundle;
        this.f36271b = context;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3909un
    public G5 a() {
        return this.f36270a.h();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3909un
    public boolean b() {
        return NfcScannerComposableKt.isNfcEnabled(this.f36271b);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3909un
    public void c() {
        this.f36270a.a((Am) null);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3909un
    public DocumentType d() {
        return B8.b(this.f36270a).c();
    }
}
