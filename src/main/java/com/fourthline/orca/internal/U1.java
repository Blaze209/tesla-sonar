package com.fourthline.orca.internal;

import androidx.p002activity.result.ActivityResultRegistry;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class U1 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4097z1 f27990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f27991b;

    public U1(C4097z1 c4097z1, Provider provider) {
        this.f27990a = c4097z1;
        this.f27991b = provider;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public YD get() {
        return a(this.f27990a, (ActivityResultRegistry) this.f27991b.get());
    }

    public static U1 a(C4097z1 c4097z1, Provider provider) {
        return new U1(c4097z1, provider);
    }

    public static YD a(C4097z1 c4097z1, ActivityResultRegistry activityResultRegistry) {
        return (YD) qj0.h.d(c4097z1.a(activityResultRegistry));
    }
}
