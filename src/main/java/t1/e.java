package t1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw4/d;", "", "velocity", "Lt1/d;", "a", "(Lw4/d;F)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final int a(w4.d dVar, float f11) {
        if (Math.abs(f11) < dVar.O1(h.k())) {
            return d.INSTANCE.a();
        }
        return f11 > BitmapDescriptorFactory.HUE_RED ? d.INSTANCE.b() : d.INSTANCE.c();
    }
}
