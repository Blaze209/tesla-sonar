package i1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.i1;
import androidx.camera.core.impl.j1;
import androidx.camera.core.impl.m2;
import androidx.camera.core.impl.r2;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.VideoQualityQuirk;
import java.util.HashMap;
import java.util.Map;
import z0.x;

/* JADX INFO: loaded from: classes.dex */
public class d implements i1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<Integer, x> f74046f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final i1 f74047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final i0 f74048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final r2 f74049e;

    static {
        HashMap map = new HashMap();
        f74046f = map;
        map.put(1, x.f126362f);
        map.put(8, x.f126360d);
        map.put(6, x.f126359c);
        map.put(5, x.f126358b);
        map.put(4, x.f126357a);
        map.put(0, x.f126361e);
    }

    public d(@NonNull i1 i1Var, @NonNull i0 i0Var, @NonNull r2 r2Var) {
        this.f74047c = i1Var;
        this.f74048d = i0Var;
        this.f74049e = r2Var;
    }

    private boolean c(int i11) {
        x xVar = f74046f.get(Integer.valueOf(i11));
        if (xVar == null) {
            return true;
        }
        for (VideoQualityQuirk videoQualityQuirk : this.f74049e.c(VideoQualityQuirk.class)) {
            if (videoQualityQuirk != null && videoQualityQuirk.f(this.f74048d, xVar) && !d(videoQualityQuirk)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(@NonNull m2 m2Var) {
        return (m2Var instanceof SurfaceProcessingQuirk) && ((SurfaceProcessingQuirk) m2Var).b();
    }

    @Override // androidx.camera.core.impl.i1
    public j1 a(int i11) {
        if (b(i11)) {
            return this.f74047c.a(i11);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.i1
    public boolean b(int i11) {
        return this.f74047c.b(i11) && c(i11);
    }
}
