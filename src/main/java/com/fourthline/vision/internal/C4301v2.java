package com.fourthline.vision.internal;

import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4301v2 implements P2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f39026a;

    public C4301v2() {
        this(false, 1, null);
    }

    @Override // com.fourthline.vision.internal.P2
    public C4165c4 performCorrection(C4165c4 maskDetectionArea, C4165c4 contentDetectionArea, C4165c4 matchArea) {
        p013kotlin.jvm.internal.s.k(maskDetectionArea, "maskDetectionArea");
        p013kotlin.jvm.internal.s.k(contentDetectionArea, "contentDetectionArea");
        p013kotlin.jvm.internal.s.k(matchArea, "matchArea");
        return contentDetectionArea.translate((this.f39026a ? -1 : 1) * (matchArea.centerX() - contentDetectionArea.centerX()), matchArea.centerY() - contentDetectionArea.centerY());
    }

    public C4301v2(boolean z11) {
        this.f39026a = z11;
    }

    public /* synthetic */ C4301v2(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
