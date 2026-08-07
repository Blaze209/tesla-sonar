package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.fourthline.orca.internal.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3159d6 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y5 f31066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f31067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f31068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider f31069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider f31070e;

    public C3159d6(Y5 y11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f31066a = y11;
        this.f31067b = provider;
        this.f31068c = provider2;
        this.f31069d = provider3;
        this.f31070e = provider4;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public H6 get() {
        return a(this.f31066a, (Context) this.f31067b.get(), (Activity) this.f31068c.get(), (E6) this.f31069d.get(), (AndroidDataCollectorHelper) this.f31070e.get());
    }

    public static C3159d6 a(Y5 y11, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new C3159d6(y11, provider, provider2, provider3, provider4);
    }

    public static H6 a(Y5 y11, Context context, Activity activity, E6 e11, AndroidDataCollectorHelper androidDataCollectorHelper) {
        return (H6) qj0.h.d(y11.a(context, activity, e11, androidDataCollectorHelper));
    }
}
