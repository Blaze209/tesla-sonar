package com.plaid.internal;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;

/* JADX INFO: renamed from: com.plaid.internal.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4467l2 implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4344a3 f47833a;

    public C4467l2(InterfaceC4344a3 tokenComponent) {
        p013kotlin.jvm.internal.s.k(tokenComponent, "tokenComponent");
        this.f47833a = tokenComponent;
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
    public final <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass) {
        p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
        return new C4449j2(this.f47833a);
    }
}
