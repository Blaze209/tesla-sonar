package c0;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    static final class a implements androidx.camera.core.impl.u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<androidx.camera.core.impl.w0> f18469a;

        a(List<androidx.camera.core.impl.w0> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f18469a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // androidx.camera.core.impl.u0
        public List<androidx.camera.core.impl.w0> a() {
            return this.f18469a;
        }
    }

    @NonNull
    static androidx.camera.core.impl.u0 a(@NonNull androidx.camera.core.impl.w0... w0VarArr) {
        return new a(Arrays.asList(w0VarArr));
    }

    @NonNull
    public static androidx.camera.core.impl.u0 b() {
        return a(new androidx.camera.core.impl.w0.a());
    }
}
