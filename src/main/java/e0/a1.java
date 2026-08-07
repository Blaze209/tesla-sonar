package e0;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes.dex */
public interface a1 {

    public static abstract class a {
        static a c(int i11, @NonNull ImageCaptureException imageCaptureException) {
            return new h(i11, imageCaptureException);
        }

        @NonNull
        abstract ImageCaptureException a();

        abstract int b();
    }

    public interface b {
        @NonNull
        a1 a(@NonNull c0 c0Var);
    }

    void d();

    void i();

    void j();

    void k(@NonNull d0 d0Var);

    void l(@NonNull k1 k1Var);
}
