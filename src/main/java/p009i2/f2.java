package p009i2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Li2/f2;", "", "<init>", "()V", "Lk3/p1;", "a", "(Lr2/l;I)J", "backgroundColor", "b", "primaryActionColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f74340a = new f2();

    private f2() {
    }

    public final long a(l lVar, int i11) {
        if (o.J()) {
            o.S(1630911716, i11, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:204)");
        }
        j1 j1Var = j1.f74525a;
        long jH = r1.h(p1.p(j1Var.a(lVar, 6).i(), 0.8f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j1Var.a(lVar, 6).n());
        if (o.J()) {
            o.R();
        }
        return jH;
    }

    public final long b(l lVar, int i11) {
        long jK;
        if (o.J()) {
            o.S(-810329402, i11, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:224)");
        }
        Colors colorsA = j1.f74525a.a(lVar, 6);
        if (colorsA.o()) {
            jK = r1.h(p1.p(colorsA.n(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), colorsA.j());
        } else {
            jK = colorsA.k();
        }
        if (o.J()) {
            o.R();
        }
        return jK;
    }
}
