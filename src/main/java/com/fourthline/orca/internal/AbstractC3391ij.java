package com.fourthline.orca.internal;

import p013kotlin.UninitializedPropertyAccessException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3391ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p020r2.g2 f32551a = p020r2.w.f(new wn0.a() { // from class: com.fourthline.orca.internal.x41
        @Override // wn0.a
        public final Object invoke() {
            return AbstractC3391ij.a();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final A4 a() {
        throw new UninitializedPropertyAccessException("Compose UI Feature Config is not initialised.");
    }

    public static final p020r2.g2 b() {
        return f32551a;
    }
}
