package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public interface j0 extends c0.i, c0.a2.b {

    public enum a {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        a(boolean z11) {
            this.mHoldsCameraSlot = z11;
        }

        boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    @NonNull
    g2<a> a();

    @Override // c0.i
    @NonNull
    default CameraControl b() {
        return l();
    }

    @Override // c0.i
    @NonNull
    default c0.n c() {
        return e();
    }

    @NonNull
    i0 e();

    default boolean g() {
        return c().f() == 0;
    }

    default void h(b0 b0Var) {
    }

    default void i(boolean z11) {
    }

    @NonNull
    CameraControlInternal l();

    @NonNull
    default b0 m() {
        return e0.a();
    }

    default void n(boolean z11) {
    }

    void o(@NonNull Collection<c0.a2> collection);

    void p(@NonNull Collection<c0.a2> collection);

    default boolean q() {
        return true;
    }

    @NonNull
    com.google.common.util.concurrent.s<Void> release();
}
