package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.nfc.NfcScannerComposableKt;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3686pe implements InterfaceC3643oe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2899Lc f34510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f34511b;

    public C3686pe(C2899Lc bundle, Context context) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.f34510a = bundle;
        this.f34511b = context;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3643oe
    public void a(EnumC2894Kc value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.f34510a.a(value);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3643oe
    public boolean b() {
        return NfcScannerComposableKt.isNfcEnabled(this.f34511b);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3643oe
    public String c() {
        return AbstractC2904Mc.b(this.f34510a);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3643oe
    public EnumC2894Kc d() {
        return this.f34510a.b();
    }

    @Override // com.fourthline.orca.internal.InterfaceC3643oe
    public void a(String pin) {
        p013kotlin.jvm.internal.s.k(pin, "pin");
        this.f34510a.b(pin);
    }

    @Override // com.fourthline.orca.internal.InterfaceC3643oe
    public void b(String url) {
        p013kotlin.jvm.internal.s.k(url, "url");
        this.f34510a.d(url);
    }
}
