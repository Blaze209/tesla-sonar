package androidx.camera.core;

import android.media.ImageReader;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.s1;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    @NonNull
    public static s1 a(int i11, int i12, int i13, int i14) {
        return new d(ImageReader.newInstance(i11, i12, i13, i14));
    }
}
