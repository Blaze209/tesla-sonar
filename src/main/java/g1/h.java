package g1;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface h extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    @NonNull
    MediaCodec.BufferInfo f0();

    @NonNull
    ByteBuffer g();

    boolean j0();

    long size();

    long x0();
}
