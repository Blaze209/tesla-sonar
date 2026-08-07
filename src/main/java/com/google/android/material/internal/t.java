package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public class t implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f42353a;

    public t(@NonNull TimeInterpolator timeInterpolator) {
        this.f42353a = timeInterpolator;
    }

    @NonNull
    public static TimeInterpolator a(boolean z11, @NonNull TimeInterpolator timeInterpolator) {
        return z11 ? timeInterpolator : new t(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        return 1.0f - this.f42353a.getInterpolation(f11);
    }
}
