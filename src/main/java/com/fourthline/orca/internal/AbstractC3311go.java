package com.fourthline.orca.internal;

import androidx.p002activity.ComponentActivity;
import p013kotlin.UninitializedPropertyAccessException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3311go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p020r2.g2 f32061a = p020r2.w.f(new wn0.a() { // from class: com.fourthline.orca.internal.m21
        @Override // wn0.a
        public final Object invoke() {
            return AbstractC3311go.a();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentActivity a() {
        throw new UninitializedPropertyAccessException("Local Activity not initialised.");
    }

    public static final p020r2.g2 b() {
        return f32061a;
    }
}
