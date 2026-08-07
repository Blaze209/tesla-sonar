package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface s1 {

    public interface a {
        void a(@NonNull s1 s1Var);
    }

    int a();

    int b();

    androidx.camera.core.n c();

    void close();

    androidx.camera.core.n d();

    void f();

    void g(@NonNull a aVar, @NonNull Executor executor);

    int getHeight();

    Surface getSurface();

    int getWidth();
}
