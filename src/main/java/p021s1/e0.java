package p021s1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j3.g;
import java.util.List;
import p013kotlin.Metadata;
import v3.PointerInputChange;
import v3.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lv3/m;", "", DateTokenConverter.CONVERTER_KEY, "(Lv3/m;)F", "Lj3/g;", "c", "(Lv3/m;)J", "", "useCurrent", "b", "(Lv3/m;Z)F", "a", "(Lv3/m;Z)J", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e0 {
    public static final long a(m mVar, boolean z11) {
        long jC = g.INSTANCE.c();
        List<PointerInputChange> listC = mVar.c();
        int size = listC.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            PointerInputChange pointerInputChange = listC.get(i12);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                jC = g.r(jC, z11 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition());
                i11++;
            }
        }
        return i11 == 0 ? g.INSTANCE.b() : g.h(jC, i11);
    }

    public static final float b(m mVar, boolean z11) {
        long jA = a(mVar, z11);
        boolean zJ = g.j(jA, g.INSTANCE.b());
        float fK = BitmapDescriptorFactory.HUE_RED;
        if (zJ) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        List<PointerInputChange> listC = mVar.c();
        int size = listC.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            PointerInputChange pointerInputChange = listC.get(i12);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                fK += g.k(g.q(z11 ? pointerInputChange.getPosition() : pointerInputChange.getPreviousPosition(), jA));
                i11++;
            }
        }
        return fK / i11;
    }

    public static final long c(m mVar) {
        long jA = a(mVar, true);
        g.Companion companion = g.INSTANCE;
        return g.j(jA, companion.b()) ? companion.c() : g.q(jA, a(mVar, false));
    }

    public static final float d(m mVar) {
        float fB = b(mVar, true);
        float fB2 = b(mVar, false);
        if (fB == BitmapDescriptorFactory.HUE_RED || fB2 == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return fB / fB2;
    }
}
