package cy;

import android.graphics.Matrix;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.p003lifecycle.w;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import java.io.Closeable;

/* JADX INFO: loaded from: classes5.dex */
public interface a<DetectionResultT> extends Closeable, w {
    @KeepForSdk
    int getDetectorType();

    @NonNull
    @KeepForSdk
    Task<DetectionResultT> process(@NonNull Image image, int i11, @NonNull Matrix matrix);
}
