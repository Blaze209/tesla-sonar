package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Nv implements Mv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3104bu f27098a;

    public Nv(C3104bu bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f27098a = bundle;
    }

    @Override // com.fourthline.orca.internal.Mv
    public String a() {
        return this.f27098a.d();
    }

    @Override // com.fourthline.orca.internal.Mv
    public InterfaceC3746qv.a.C0603a.c b() {
        InterfaceC3746qv.a.C0603a.c cVarB = this.f27098a.b();
        if (cVarB != null) {
            return cVarB;
        }
        throw new IllegalStateException("Otp Settings must be present at this moment!");
    }

    @Override // com.fourthline.orca.internal.Mv
    public String c() {
        String strA = this.f27098a.a();
        if (strA != null) {
            return strA;
        }
        throw new IllegalStateException("Phone number must be present at this moment!");
    }

    @Override // com.fourthline.orca.internal.Mv
    public List d() {
        List listC = this.f27098a.c();
        if (listC != null) {
            return listC;
        }
        throw new IllegalStateException("SignDocumentNames must be present at this moment!");
    }
}
