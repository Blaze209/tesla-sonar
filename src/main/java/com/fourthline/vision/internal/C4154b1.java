package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4154b1 implements P2 {
    @Override // com.fourthline.vision.internal.P2
    public C4165c4 performCorrection(C4165c4 maskDetectionArea, C4165c4 contentDetectionArea, C4165c4 matchArea) {
        p013kotlin.jvm.internal.s.k(maskDetectionArea, "maskDetectionArea");
        p013kotlin.jvm.internal.s.k(contentDetectionArea, "contentDetectionArea");
        p013kotlin.jvm.internal.s.k(matchArea, "matchArea");
        return maskDetectionArea.translate(matchArea.centerX() - contentDetectionArea.centerX(), matchArea.centerY() - contentDetectionArea.centerY());
    }
}
