package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class j2 {
    @NonNull
    public static j2 a(@NonNull Surface surface, @NonNull Size size, int i11) {
        return new i(surface, size, i11);
    }

    public abstract int b();

    @NonNull
    public abstract Size c();

    @NonNull
    public abstract Surface d();
}
