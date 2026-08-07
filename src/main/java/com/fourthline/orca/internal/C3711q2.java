package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: renamed from: com.fourthline.orca.internal.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3711q2 implements Cs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Ds f34705a = C3668p2.f34427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4001ws f34706b;

    public C3711q2(int i11) {
        QA.a aVar = QA.f27433a;
        this.f34706b = new InterfaceC4001ws.c(QA.a.a(aVar, R.string.shared_dialog_info_sepa_mandate_header, 0, 2, null), QA.a.a(aVar, R.string.shared_dialog_info_sepa_mandate_message, 0, 2, null), null, InterfaceC3807sD.b.f35235a, false, aVar.a(R.string.shared_dialog_info_sepa_mandate_hint, "0." + i11), 20, null);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public Ds b() {
        return this.f34705a;
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void c() {
        Cs.b.a.a(this);
    }

    @Override // com.fourthline.orca.internal.Cs.b
    public void d() {
        Cs.b.a.b(this);
    }

    @Override // com.fourthline.orca.internal.Cs
    public InterfaceC4001ws getState() {
        return this.f34706b;
    }
}
