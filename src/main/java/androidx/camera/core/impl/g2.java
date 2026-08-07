package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface g2<T> {

    public interface a<T> {
        void a(T t11);

        void onError(@NonNull Throwable th2);
    }

    @NonNull
    com.google.common.util.concurrent.s<T> b();

    void c(@NonNull Executor executor, @NonNull a<? super T> aVar);

    void d(@NonNull a<? super T> aVar);
}
