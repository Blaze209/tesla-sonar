package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class LE implements KE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26754b;

    public LE(C3765rE bundle, String languageCode) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(languageCode, "languageCode");
        this.f26753a = languageCode;
        this.f26754b = bundle.b();
    }

    @Override // com.fourthline.orca.internal.KE
    public String a() {
        return this.f26754b;
    }

    @Override // com.fourthline.orca.internal.KE
    public String b() {
        return this.f26753a;
    }
}
