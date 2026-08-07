package com.plaid.internal;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;

/* JADX INFO: renamed from: com.plaid.internal.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4549u4 implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H1 f48159a;

    public C4549u4(H1 outOfProcessComponent) {
        p013kotlin.jvm.internal.s.k(outOfProcessComponent, "outOfProcessComponent");
        this.f48159a = outOfProcessComponent;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* bridge */ /* synthetic */ androidx.p003lifecycle.c1 create(co0.d dVar, CreationExtras creationExtras) {
        return super.create(dVar, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* bridge */ /* synthetic */ androidx.p003lifecycle.c1 create(Class cls, CreationExtras creationExtras) {
        return super.create(cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass) throws B2 {
        p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(C4594z4.class)) {
            return new C4594z4(this.f48159a);
        }
        throw new B2("Unsupported ViewModel");
    }
}
