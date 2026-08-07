package c0;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface o1 extends Closeable {

    public static abstract class a {
        @NonNull
        public static a f(@NonNull Size size, @NonNull Rect rect, androidx.camera.core.impl.j0 j0Var, int i11, boolean z11) {
            return new e(size, rect, j0Var, i11, z11);
        }

        public abstract androidx.camera.core.impl.j0 a();

        @NonNull
        public abstract Rect b();

        @NonNull
        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    public static abstract class b {
        b() {
        }

        @NonNull
        public static b c(int i11, @NonNull o1 o1Var) {
            return new f(i11, o1Var);
        }

        public abstract int a();

        @NonNull
        public abstract o1 b();
    }

    @NonNull
    Surface L2(@NonNull Executor executor, @NonNull Consumer<b> consumer);

    void S0(@NonNull float[] fArr, @NonNull float[] fArr2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    default int getFormat() {
        return 34;
    }

    @NonNull
    Size getSize();

    default void R1(@NonNull float[] fArr, @NonNull float[] fArr2, boolean z11) {
    }
}
