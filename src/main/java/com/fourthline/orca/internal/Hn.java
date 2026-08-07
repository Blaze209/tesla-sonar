package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;

/* JADX INFO: loaded from: classes4.dex */
public final class Hn implements Gn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4104z8 f26130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Kp f26131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Cm f26132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Qn f26133d;

    public Hn(C4104z8 bundle, Kp personBundle, Cm resultToBundleMapper, Qn keyFactory) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(personBundle, "personBundle");
        p013kotlin.jvm.internal.s.k(resultToBundleMapper, "resultToBundleMapper");
        p013kotlin.jvm.internal.s.k(keyFactory, "keyFactory");
        this.f26130a = bundle;
        this.f26131b = personBundle;
        this.f26132c = resultToBundleMapper;
        this.f26133d = keyFactory;
    }

    @Override // com.fourthline.orca.internal.Gn
    public G5 a() {
        return this.f26130a.h();
    }

    @Override // com.fourthline.orca.internal.Gn
    public Jn b() {
        return this.f26133d.a(this.f26130a, this.f26131b);
    }

    @Override // com.fourthline.orca.internal.Gn
    public Am c() {
        return this.f26130a.j();
    }

    @Override // com.fourthline.orca.internal.Gn
    public DocumentType d() {
        return B8.b(this.f26130a).c();
    }

    @Override // com.fourthline.orca.internal.Gn
    public void a(Am am2) {
        C4104z8 c4104z8 = this.f26130a;
        if (am2 != null) {
            this.f26132c.a(am2, d());
        } else {
            am2 = null;
        }
        c4104z8.a(am2);
    }
}
