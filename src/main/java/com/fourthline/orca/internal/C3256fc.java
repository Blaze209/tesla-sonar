package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3256fc implements Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4071yc f31713a;

    public C3256fc(InterfaceC4071yc documentVersionRepository) {
        p013kotlin.jvm.internal.s.k(documentVersionRepository, "documentVersionRepository");
        this.f31713a = documentVersionRepository;
    }

    private final boolean b() {
        return this.f31713a.a().size() > 1;
    }

    @Override // com.fourthline.orca.internal.Qf
    public List a() {
        return p013kotlin.collections.v.e(b() ? InterfaceC3726qb.b.f34792a : new InterfaceC3726qb.c(null, 1, null));
    }
}
