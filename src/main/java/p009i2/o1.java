package p009i2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import k3.p1;
import p013kotlin.Metadata;
import p019p1.f0;
import p019p1.i;
import p019p1.j;
import p020r2.l;
import p020r2.o;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00108Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Li2/o1;", "", "<init>", "()V", "Lw4/h;", "b", Gender.FEMALE, "()F", "Elevation", "Lp1/i;", "", "c", "Lp1/i;", "a", "()Lp1/i;", "AnimationSpec", "Lk3/p1;", "(Lr2/l;I)J", "scrimColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f74773a = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float Elevation = h.g(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final i<Float> AnimationSpec = j.l(300, 0, f0.c(), 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f74776d = 8;

    private o1() {
    }

    public final i<Float> a() {
        return AnimationSpec;
    }

    public final float b() {
        return Elevation;
    }

    public final long c(l lVar, int i11) {
        if (o.J()) {
            o.S(-112572414, i11, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:539)");
        }
        long jP = p1.p(j1.f74525a.a(lVar, 6).i(), 0.32f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        if (o.J()) {
            o.R();
        }
        return jP;
    }
}
