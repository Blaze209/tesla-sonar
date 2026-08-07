package androidx.camera.core;

import androidx.annotation.NonNull;
import c0.e0;
import c0.f0;

/* JADX INFO: loaded from: classes.dex */
public interface CameraControl {

    public static final class OperationCanceledException extends Exception {
        public OperationCanceledException(@NonNull String str) {
            super(str);
        }
    }

    @NonNull
    com.google.common.util.concurrent.s<Void> c(boolean z11);

    @NonNull
    com.google.common.util.concurrent.s<Void> e(float f11);

    @NonNull
    com.google.common.util.concurrent.s<f0> g(@NonNull e0 e0Var);

    @NonNull
    com.google.common.util.concurrent.s<Integer> j(int i11);

    @NonNull
    com.google.common.util.concurrent.s<Void> k();
}
