package w;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class p0 extends o0 {
    p0(@NonNull Context context) {
        super(context);
    }

    @Override // w.q0, w.m0.b
    @NonNull
    public Set<Set<String>> e() throws CameraAccessExceptionCompat {
        try {
            return this.f120211a.getConcurrentCameraIds();
        } catch (CameraAccessException e11) {
            throw CameraAccessExceptionCompat.e(e11);
        }
    }
}
