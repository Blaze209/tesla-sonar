package com.fourthline.nfc.internal;

import androidx.p002activity.result.ActivityResultRegistry;
import com.fourthline.core.location.LocationProvider;

/* JADX INFO: renamed from: com.fourthline.nfc.internal.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2812f0 implements qj0.e {
    public static LocationProvider a(C2802a0 c2802a0, ActivityResultRegistry activityResultRegistry) {
        return (LocationProvider) qj0.h.d(c2802a0.a(activityResultRegistry));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
