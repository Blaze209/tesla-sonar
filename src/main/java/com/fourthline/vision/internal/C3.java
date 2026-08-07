package com.fourthline.vision.internal;

import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C3 {
    public static final boolean isMissingModelsException(Throwable th2) {
        p013kotlin.jvm.internal.s.k(th2, "<this>");
        return (th2 instanceof MlKitException) && ((MlKitException) th2).a() == 14;
    }
}
