package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.camera.core.internal.utils.ImageUtil;
import c0.s0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface n extends AutoCloseable {

    public interface a {
        @NonNull
        ByteBuffer l();

        int m();

        int n();
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    a[] N0();

    @Override // java.lang.AutoCloseable
    void close();

    int getFormat();

    int getHeight();

    Image getImage();

    int getWidth();

    @NonNull
    default Bitmap q1() {
        return ImageUtil.b(this);
    }

    void r2(Rect rect);

    @NonNull
    s0 z();
}
