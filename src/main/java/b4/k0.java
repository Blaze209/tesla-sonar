package b4;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lb4/g0;", "Lb4/j1;", "b", "(Lb4/g0;)Lb4/j1;", "Lw4/d;", "a", "Lw4/d;", "DefaultDensity", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w4.d f16119a = w4.f.b(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);

    public static final j1 b(g0 g0Var) {
        j1 owner = g0Var.getOwner();
        if (owner != null) {
            return owner;
        }
        y3.a.c("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
