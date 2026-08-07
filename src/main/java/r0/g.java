package r0;

import android.opengl.EGLSurface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    @NonNull
    public static g d(@NonNull EGLSurface eGLSurface, int i11, int i12) {
        return new c(eGLSurface, i11, i12);
    }

    @NonNull
    public abstract EGLSurface a();

    public abstract int b();

    public abstract int c();
}
