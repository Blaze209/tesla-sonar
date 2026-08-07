package p009i2;

import a2.a;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import k3.g4;
import k3.p1;
import p013kotlin.Metadata;
import p019p1.o1;
import p020r2.l;
import p020r2.o;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Li2/l0;", "", "<init>", "()V", "Lp1/o1;", "", "b", "Lp1/o1;", "getAnimationSpec", "()Lp1/o1;", "AnimationSpec", "Lw4/h;", "c", Gender.FEMALE, "()F", "Elevation", "Lk3/p1;", "a", "(Lr2/l;I)J", "backgroundColor", "Lk3/g4;", DateTokenConverter.CONVERTER_KEY, "(Lr2/l;I)Lk3/g4;", "shape", "scrimColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f74627a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final o1<Float> AnimationSpec = new o1<>(256, 0, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = h.g(16);

    private l0() {
    }

    public final long a(l lVar, int i11) {
        if (o.J()) {
            o.S(-788676020, i11, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:758)");
        }
        long jN = j1.f74525a.a(lVar, 6).n();
        if (o.J()) {
            o.R();
        }
        return jN;
    }

    public final float b() {
        return Elevation;
    }

    public final long c(l lVar, int i11) {
        if (o.J()) {
            o.S(617225966, i11, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:777)");
        }
        long jP = p1.p(j1.f74525a.a(lVar, 6).i(), 0.32f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        if (o.J()) {
            o.R();
        }
        return jP;
    }

    public final g4 d(l lVar, int i11) {
        if (o.J()) {
            o.S(2041803618, i11, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:770)");
        }
        a large = j1.f74525a.b(lVar, 6).getLarge();
        if (o.J()) {
            o.R();
        }
        return large;
    }
}
