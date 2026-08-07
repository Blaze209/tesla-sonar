package com.fourthline.vision.internal;

import android.content.Context;
import androidx.p002activity.result.ActivityResultRegistry;
import com.fourthline.core.location.LocationProvider;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
public final class B5 implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4297u5 f37636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider f37637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider f37638c;

    public B5(C4297u5 c4297u5, Provider provider, Provider provider2) {
        this.f37636a = c4297u5;
        this.f37637b = provider;
        this.f37638c = provider2;
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LocationProvider get() {
        return a(this.f37636a, (Context) this.f37637b.get(), (ActivityResultRegistry) this.f37638c.get());
    }

    public static B5 a(C4297u5 c4297u5, Provider provider, Provider provider2) {
        return new B5(c4297u5, provider, provider2);
    }

    public static LocationProvider a(C4297u5 c4297u5, Context context, ActivityResultRegistry activityResultRegistry) {
        return (LocationProvider) qj0.h.d(c4297u5.provideLocationProvider(context, activityResultRegistry));
    }
}
