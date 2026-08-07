package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b0 f3162a = new a();

    static final class a implements b0 {
        private final n1 K = n1.a(new Object());

        a() {
        }

        @Override // androidx.camera.core.impl.b0
        @NonNull
        public n1 E() {
            return this.K;
        }

        @Override // androidx.camera.core.impl.s2
        @NonNull
        public x0 getConfig() {
            return i2.a0();
        }
    }

    @NonNull
    public static b0 a() {
        return f3162a;
    }
}
