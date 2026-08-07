package com.fourthline.vision.internal;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J {
    public static final InterfaceC4264q rememberCameraXEngine(c0.p cameraSelector, Integer num, p020r2.l lVar, int i11) {
        p013kotlin.jvm.internal.s.k(cameraSelector, "cameraSelector");
        lVar.o(990334590);
        if (p020r2.o.J()) {
            p020r2.o.S(990334590, i11, -1, "com.fourthline.visionx.internal.camera.rememberCameraXEngine (CameraXEngine.kt:346)");
        }
        Context context = (Context) lVar.U(AndroidCompositionLocals_androidKt.g());
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            Object a0Var = new p020r2.a0(Function0.k(EmptyCoroutineContext.INSTANCE, lVar));
            lVar.B(a0Var);
            objI = a0Var;
        }
        CoroutineScope coroutineScope = ((p020r2.a0) objI).getCoroutineScope();
        lVar.o(1612571565);
        Object objI2 = lVar.I();
        Object obj = objI2;
        if (objI2 == companion.a()) {
            I i12 = new I(context, cameraSelector, coroutineScope);
            if (num != null) {
                i12.setVideoRecordingBitrate(num.intValue());
            }
            lVar.B(i12);
            obj = i12;
        }
        I i13 = (I) obj;
        lVar.l();
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.l();
        return i13;
    }
}
