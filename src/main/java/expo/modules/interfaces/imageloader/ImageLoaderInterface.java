package expo.modules.interfaces.imageloader;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes8.dex */
public interface ImageLoaderInterface {

    public interface ResultListener {
        void onFailure(Throwable th2);

        void onSuccess(@NonNull Bitmap bitmap);
    }

    Future<Bitmap> loadImageForDisplayFromURL(@NonNull String str);

    void loadImageForDisplayFromURL(@NonNull String str, ResultListener resultListener);

    Future<Bitmap> loadImageForManipulationFromURL(@NonNull String str);

    void loadImageForManipulationFromURL(@NonNull String str, ResultListener resultListener);
}
