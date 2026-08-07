package androidx.camera.core.impl;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface w0 {

    public static final class a implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final v0 f3339a = new v0.a().h();

        @Override // androidx.camera.core.impl.w0
        @NonNull
        public v0 a() {
            return this.f3339a;
        }

        @Override // androidx.camera.core.impl.w0
        public int getId() {
            return 0;
        }
    }

    @NonNull
    v0 a();

    int getId();
}
