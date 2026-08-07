package jc;

import android.graphics.Bitmap;
import ch.qos.logback.core.CoreConstants;
import ec.BitmapImage;
import ec.n;
import ec.u;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import rc.Options;
import rc.i;
import yc.g0;
import yc.h;
import yc.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lec/n;", "image", "Lrc/n;", "options", "", "Lwc/a;", "transformations", "Lyc/t;", "logger", "Landroid/graphics/Bitmap;", "a", "(Lec/n;Lrc/n;Ljava/util/List;Lyc/t;)Landroid/graphics/Bitmap;", "coil-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final Bitmap a(n nVar, Options options, List<? extends wc.a> list, t tVar) {
        if (nVar instanceof BitmapImage) {
            Bitmap bitmap = ((BitmapImage) nVar).getBitmap();
            Bitmap.Config configC = yc.b.c(bitmap);
            if (p013kotlin.collections.n.e0(g0.f(), configC)) {
                return bitmap;
            }
            if (tVar != null) {
                t.a aVar = t.a.Info;
                if (tVar.b().compareTo(aVar) <= 0) {
                    tVar.a("EngineInterceptor", aVar, "Converting bitmap with config " + configC + " to apply transformations: " + list + CoreConstants.DOT, null);
                }
            }
        } else if (tVar != null) {
            t.a aVar2 = t.a.Info;
            if (tVar.b().compareTo(aVar2) <= 0) {
                tVar.a("EngineInterceptor", aVar2, "Converting image of type " + o0.b(nVar.getClass()).c() + " to apply transformations: " + list + CoreConstants.DOT, null);
            }
        }
        return h.f125348a.a(u.a(nVar, options.getContext().getResources()), i.h(options), options.getSize(), options.getScale(), options.getPrecision() == sc.c.INEXACT);
    }
}
