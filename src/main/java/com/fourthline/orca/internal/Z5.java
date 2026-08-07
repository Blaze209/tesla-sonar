package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class Z5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f29993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f29994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f29995c;

    public Z5(Y5 y11, Provider provider, Provider provider2) {
        this.f29993a = y11;
        this.f29994b = provider;
        this.f29995c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AndroidDataCollectorHelper get() {
        return a(this.f29993a, (Context) this.f29994b.get(), (CoroutineScope) this.f29995c.get());
    }

    public static Z5 a(Y5 y11, Provider provider, Provider provider2) {
        return new Z5(y11, provider, provider2);
    }

    public static AndroidDataCollectorHelper a(Y5 y11, Context context, CoroutineScope coroutineScope) {
        return (AndroidDataCollectorHelper) qj0.h.d(y11.a(context, coroutineScope));
    }
}
