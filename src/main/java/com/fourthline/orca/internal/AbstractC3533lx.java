package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerResult;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3533lx {
    public static final void a(C3490kx c3490kx, SelfieScannerResult result) {
        p013kotlin.jvm.internal.s.k(c3490kx, "<this>");
        p013kotlin.jvm.internal.s.k(result, "result");
        c3490kx.a(result.getImage().getFull());
        c3490kx.a(Long.valueOf(result.getMetadata().getTimestamp().getTime()));
        c3490kx.a(result.getMetadata().getLocation());
        c3490kx.a(result.getVideoRecording());
    }
}
