package com.mrousavy.camera.frameprocessors;

import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import dz.i;

/* JADX INFO: loaded from: classes6.dex */
public class VisionCameraScheduler {

    @Keep
    @in.a
    private final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    @in.a
    private void scheduleTrigger() {
        i.INSTANCE.c().getHandler().post(new Runnable() { // from class: com.mrousavy.camera.frameprocessors.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f45667a.trigger();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void trigger();
}
