package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3189dv implements InterfaceC3147cv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3187dt f31250a;

    public C3189dv(C3187dt bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f31250a = bundle;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3147cv
    public String a() {
        String strA = this.f31250a.a();
        if (strA != null) {
            return strA;
        }
        throw new IllegalStateException("PDF path must be present at this moment!");
    }

    @Override // com.fourthline.orca.internal.InterfaceC3147cv
    public String b() {
        String strB = this.f31250a.b();
        if (strB != null) {
            return strB;
        }
        throw new IllegalStateException("PDF title must be present at this moment!");
    }
}
