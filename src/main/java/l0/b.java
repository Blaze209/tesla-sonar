package l0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class b {
    static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    @NonNull
    static Image b(@NonNull ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    @NonNull
    static ImageWriter c(@NonNull Surface surface, int i11) {
        return ImageWriter.newInstance(surface, i11);
    }

    static void d(@NonNull ImageWriter imageWriter, @NonNull Image image) {
        imageWriter.queueInputImage(image);
    }
}
