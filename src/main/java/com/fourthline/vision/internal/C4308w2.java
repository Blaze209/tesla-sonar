package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.List;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.fourthline.vision.internal.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4308w2 implements Q2 {
    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((List<? extends AbstractC4273r2>) obj, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    public Object process(List<? extends AbstractC4273r2> list, Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        return list.isEmpty() ? p013kotlin.collections.v.e(SelfieScannerWarning.FACE_NOT_DETECTED) : p013kotlin.collections.v.m();
    }
}
