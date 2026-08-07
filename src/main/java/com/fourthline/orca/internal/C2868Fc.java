package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2868Fc implements Z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC3289g8 f25804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Z7 f25805b;

    public C2868Fc(InterfaceC3289g8 repository) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        this.f25804a = repository;
        this.f25805b = new C3973w6();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    private final Z7 d() {
        boolean z11;
        G5 g5A = this.f25804a.a();
        if (p013kotlin.jvm.internal.s.f(g5A != null ? g5A.c() : null, "ESP")) {
            X7 x7E = this.f25804a.e();
            if ((x7E != null ? x7E.c() : null) == DocumentType.ID_CARD) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (z11 && !(this.f25805b instanceof Iy)) {
            this.f25805b = new Iy(this.f25804a);
        } else if (!z11 && !(this.f25805b instanceof C3973w6)) {
            this.f25805b = new C3973w6();
        }
        return this.f25805b;
    }

    @Override // com.fourthline.orca.internal.Z7
    public C3033a8 a() {
        return d().a();
    }

    @Override // com.fourthline.orca.internal.Z7
    public Gh b() {
        return d().b();
    }

    @Override // com.fourthline.orca.internal.Z7
    public QA c() {
        return d().c();
    }
}
