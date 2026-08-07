package l0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static void a(@NonNull ImageWriter imageWriter) {
        b.a(imageWriter);
    }

    @NonNull
    public static Image b(@NonNull ImageWriter imageWriter) {
        return b.b(imageWriter);
    }

    @NonNull
    public static ImageWriter c(@NonNull Surface surface, int i11) {
        return b.c(surface, i11);
    }

    public static void d(@NonNull ImageWriter imageWriter, @NonNull Image image) {
        b.d(imageWriter, image);
    }
}
