package x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import androidx.annotation.NonNull;
import c0.b0;
import java.util.Set;
import w.z;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f122450a;

    interface a {
        DynamicRangeProfiles a();

        @NonNull
        Set<b0> b();

        @NonNull
        Set<b0> c(@NonNull b0 b0Var);
    }

    f(@NonNull a aVar) {
        this.f122450a = aVar;
    }

    @NonNull
    public static f a(@NonNull z zVar) {
        f fVarE = Build.VERSION.SDK_INT >= 33 ? e(e.a(zVar.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) : null;
        return fVarE == null ? h.f122452a : fVarE;
    }

    public static f e(DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        u5.h.j(Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new f(new g(dynamicRangeProfiles));
    }

    @NonNull
    public Set<b0> b(@NonNull b0 b0Var) {
        return this.f122450a.c(b0Var);
    }

    @NonNull
    public Set<b0> c() {
        return this.f122450a.b();
    }

    public DynamicRangeProfiles d() {
        u5.h.j(Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f122450a.a();
    }
}
