package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.m2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v.v;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public class TorchFlashRequiredFor3aUpdateQuirk implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f3012b = Arrays.asList("PIXEL 6A", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7A", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final z f3013a;

    public TorchFlashRequiredFor3aUpdateQuirk(@NonNull z zVar) {
        this.f3013a = zVar;
    }

    private static boolean g(@NonNull z zVar) {
        return h() && k(zVar);
    }

    private static boolean h() {
        Iterator<String> it = f3012b.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean i(@NonNull z zVar) {
        return Build.VERSION.SDK_INT >= 28 && v.P(zVar, 5) == 5;
    }

    private static boolean k(@NonNull z zVar) {
        return ((Integer) zVar.a(CameraCharacteristics.LENS_FACING)).intValue() == 0;
    }

    static boolean l(@NonNull z zVar) {
        return g(zVar);
    }

    public boolean j() {
        return !i(this.f3013a);
    }
}
