package com.fourthline.vision.internal;

import androidx.p002activity.result.ActivityResultRegistry;

/* JADX INFO: loaded from: classes4.dex */
public final class M implements qj0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L f37839a;

    public M(L l11) {
        this.f37839a = l11;
    }

    public static ActivityResultRegistry b(L l11) {
        return (ActivityResultRegistry) qj0.h.d(l11.provideActivityResultRegistry());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ActivityResultRegistry get() {
        return b(this.f37839a);
    }

    public static M a(L l11) {
        return new M(l11);
    }
}
