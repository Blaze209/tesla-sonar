package e0;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes.dex */
interface z0 {
    void a();

    void b(@NonNull Bitmap bitmap);

    void c(@NonNull ImageCaptureException imageCaptureException);

    void d(@NonNull androidx.camera.core.n nVar);

    void e();

    void f(@NonNull c0.r0.h hVar);

    void g(@NonNull ImageCaptureException imageCaptureException);

    boolean isAborted();

    void onCaptureProcessProgressed(int i11);
}
