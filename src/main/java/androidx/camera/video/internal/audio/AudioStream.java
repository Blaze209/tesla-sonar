package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface AudioStream {

    public static class AudioStreamException extends Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(@NonNull String str) {
            super(str);
        }

        public AudioStreamException(@NonNull Throwable th2) {
            super(th2);
        }
    }

    public interface a {
        default void a(boolean z11) {
        }
    }

    public static abstract class b {
        @NonNull
        public static b c(int i11, long j11) {
            return new e(i11, j11);
        }

        public abstract int a();

        public abstract long b();
    }

    void a(a aVar, Executor executor);

    @NonNull
    b read(@NonNull ByteBuffer byteBuffer);

    void release();

    void start();

    void stop();
}
