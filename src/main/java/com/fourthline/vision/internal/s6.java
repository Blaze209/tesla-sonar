package com.fourthline.vision.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s6 {
    public static final boolean isPortrait(r6 r6Var) {
        p013kotlin.jvm.internal.s.k(r6Var, "<this>");
        return r6Var.getOrientationHint() == 0 || r6Var.getOrientationHint() == 180;
    }
}
