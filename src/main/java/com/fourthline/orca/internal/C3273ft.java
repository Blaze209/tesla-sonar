package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3273ft implements InterfaceC3230et {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3187dt f31869a;

    public C3273ft(C3187dt bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        this.f31869a = bundle;
    }

    @Override // com.fourthline.orca.internal.InterfaceC3230et
    public void a(String title, String path) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(path, "path");
        this.f31869a.b(title);
        this.f31869a.a(path);
    }
}
