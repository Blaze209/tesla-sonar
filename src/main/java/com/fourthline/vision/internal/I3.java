package com.fourthline.vision.internal;

import android.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public final class I3 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W0[] f37790a;

    public I3(W0... detectionCorrectors) {
        p013kotlin.jvm.internal.s.k(detectionCorrectors, "detectionCorrectors");
        this.f37790a = detectionCorrectors;
    }

    @Override // com.fourthline.vision.internal.W0
    public T0.c correct(T0.c source, Size detectionArea) {
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(detectionArea, "detectionArea");
        for (W0 w11 : this.f37790a) {
            source = w11.correct(source, detectionArea);
        }
        return source;
    }
}
