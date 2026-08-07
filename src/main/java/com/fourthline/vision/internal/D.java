package com.fourthline.vision.internal;

import android.content.Context;
import android.view.Display;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4319y f37647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37648b;

    public D(C4319y c4319y, Provider provider) {
        this.f37647a = c4319y;
        this.f37648b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Display get() {
        return a(this.f37647a, (Context) this.f37648b.get());
    }

    public static D a(C4319y c4319y, Provider provider) {
        return new D(c4319y, provider);
    }

    public static Display a(C4319y c4319y, Context context) {
        return (Display) qj0.h.d(c4319y.provideDisplay(context));
    }
}
