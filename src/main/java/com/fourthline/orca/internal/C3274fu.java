package com.fourthline.orca.internal;

import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3274fu implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3146cu f31871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31872b;

    public C3274fu(C3146cu c3146cu, Provider provider) {
        this.f31871a = c3146cu;
        this.f31872b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3772rf get() {
        return a(this.f31871a, (Context) this.f31872b.get());
    }

    public static C3274fu a(C3146cu c3146cu, Provider provider) {
        return new C3274fu(c3146cu, provider);
    }

    public static InterfaceC3772rf a(C3146cu c3146cu, Context context) {
        return (InterfaceC3772rf) qj0.h.d(c3146cu.a(context));
    }
}
