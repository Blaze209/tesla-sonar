package n0;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.x2;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import c0.h1;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f92630a;

    public g() {
        this.f92630a = androidx.camera.core.internal.compat.quirk.a.b(SurfaceOrderQuirk.class) != null;
    }

    public static /* synthetic */ int a(g gVar, x2.f fVar, x2.f fVar2) {
        gVar.getClass();
        return gVar.b(fVar.f()) - gVar.b(fVar2.f());
    }

    private int b(@NonNull DeferrableSurface deferrableSurface) {
        if (deferrableSurface.g() == MediaCodec.class) {
            return 2;
        }
        return deferrableSurface.g() == h1.class ? 0 : 1;
    }

    public void c(@NonNull List<x2.f> list) {
        if (this.f92630a) {
            Collections.sort(list, new Comparator() { // from class: n0.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.a(this.f92629a, (x2.f) obj, (x2.f) obj2);
                }
            });
        }
    }
}
