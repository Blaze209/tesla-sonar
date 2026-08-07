package com.fourthline.vision.internal;

import android.content.Context;
import android.renderscript.RenderScript;

/* JADX INFO: renamed from: com.fourthline.vision.internal.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4153b0 implements qj0.e {
    public static RenderScript a(L l11, Context context) {
        return (RenderScript) qj0.h.d(l11.provideRenderScript(context));
    }

    @Override // javax.inject.Provider
    public abstract /* synthetic */ Object get();
}
