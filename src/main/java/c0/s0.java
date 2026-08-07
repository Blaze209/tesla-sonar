package c0;

import android.graphics.Matrix;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.g3;

/* JADX INFO: loaded from: classes.dex */
public interface s0 {
    long a();

    void b(@NonNull h0.i.b bVar);

    @NonNull
    g3 c();

    int d();

    @NonNull
    default Matrix e() {
        return new Matrix();
    }
}
