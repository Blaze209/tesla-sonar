package com.fourthline.vision.internal;

import android.renderscript.RenderScript;

/* JADX INFO: loaded from: classes4.dex */
public abstract class U implements qj0.e {
    public static I2 a(L l11, RenderScript renderScript, r6 r6Var) {
        return (I2) qj0.h.d(l11.provideImageConverter(renderScript, r6Var));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
