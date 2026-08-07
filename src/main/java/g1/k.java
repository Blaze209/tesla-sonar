package g1;

import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface k {

    public interface a extends b, b1.c<f1> {
    }

    public interface b {
    }

    public interface c extends b {

        public interface a {
            void a(@NonNull Surface surface);
        }

        void a(@NonNull Executor executor, @NonNull a aVar);
    }

    void a(long j11);

    @NonNull
    b b();

    void c(@NonNull l lVar, @NonNull Executor executor);

    void d();

    @NonNull
    com.google.common.util.concurrent.s<Void> e();

    void f();

    int g();

    @NonNull
    d1 getEncoderInfo();

    void release();

    void start();
}
