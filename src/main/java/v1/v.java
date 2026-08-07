package v1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ+\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lv1/v;", "", "<init>", "()V", "", "Lz3/q;", "measurables", "", "availableHeight", "mainAxisSpacing", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;II)I", "h", "availableWidth", "c", "g", "b", "f", "a", "e", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f117585a = new v();

    private v() {
    }

    public final int a(List<? extends z3.q> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            z3.q qVar = measurables.get(i11);
            float fE = a0.e(a0.c(qVar));
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(qVar.t0(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, qVar.V(iMin2));
            } else if (fE > BitmapDescriptorFactory.HUE_RED) {
                f11 += fE;
            }
        }
        int iRound = f11 == BitmapDescriptorFactory.HUE_RED ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f11);
        int size2 = measurables.size();
        for (int i12 = 0; i12 < size2; i12++) {
            z3.q qVar2 = measurables.get(i12);
            float fE2 = a0.e(a0.c(qVar2));
            if (fE2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, qVar2.V(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int b(List<? extends z3.q> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i11 = 0;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z3.q qVar = measurables.get(i12);
            float fE = a0.e(a0.c(qVar));
            int iT0 = qVar.t0(availableHeight);
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                i11 += iT0;
            } else if (fE > BitmapDescriptorFactory.HUE_RED) {
                f11 += fE;
                iMax = Math.max(iMax, Math.round(iT0 / fE));
            }
        }
        return Math.round(iMax * f11) + i11 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int c(List<? extends z3.q> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableWidth);
        int size = measurables.size();
        int iMax = 0;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            z3.q qVar = measurables.get(i11);
            float fE = a0.e(a0.c(qVar));
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(qVar.t0(Integer.MAX_VALUE), availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableWidth - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, qVar.m0(iMin2));
            } else if (fE > BitmapDescriptorFactory.HUE_RED) {
                f11 += fE;
            }
        }
        int iRound = f11 == BitmapDescriptorFactory.HUE_RED ? 0 : availableWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableWidth - iMin, 0) / f11);
        int size2 = measurables.size();
        for (int i12 = 0; i12 < size2; i12++) {
            z3.q qVar2 = measurables.get(i12);
            float fE2 = a0.e(a0.c(qVar2));
            if (fE2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, qVar2.m0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int d(List<? extends z3.q> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i11 = 0;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z3.q qVar = measurables.get(i12);
            float fE = a0.e(a0.c(qVar));
            int iS0 = qVar.s0(availableHeight);
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                i11 += iS0;
            } else if (fE > BitmapDescriptorFactory.HUE_RED) {
                f11 += fE;
                iMax = Math.max(iMax, Math.round(iS0 / fE));
            }
        }
        return Math.round(iMax * f11) + i11 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int e(List<? extends z3.q> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i11 = 0;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z3.q qVar = measurables.get(i12);
            float fE = a0.e(a0.c(qVar));
            int iV = qVar.V(availableWidth);
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                i11 += iV;
            } else if (fE > BitmapDescriptorFactory.HUE_RED) {
                f11 += fE;
                iMax = Math.max(iMax, Math.round(iV / fE));
            }
        }
        return Math.round(iMax * f11) + i11 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int f(List<? extends z3.q> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            z3.q qVar = measurables.get(i11);
            float fE = a0.e(a0.c(qVar));
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(qVar.V(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, qVar.t0(iMin2));
            } else if (fE > BitmapDescriptorFactory.HUE_RED) {
                f11 += fE;
            }
        }
        int iRound = f11 == BitmapDescriptorFactory.HUE_RED ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f11);
        int size2 = measurables.size();
        for (int i12 = 0; i12 < size2; i12++) {
            z3.q qVar2 = measurables.get(i12);
            float fE2 = a0.e(a0.c(qVar2));
            if (fE2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, qVar2.t0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int g(List<? extends z3.q> measurables, int availableWidth, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int size = measurables.size();
        int iMax = 0;
        int i11 = 0;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < size; i12++) {
            z3.q qVar = measurables.get(i12);
            float fE = a0.e(a0.c(qVar));
            int iM0 = qVar.m0(availableWidth);
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                i11 += iM0;
            } else if (fE > BitmapDescriptorFactory.HUE_RED) {
                f11 += fE;
                iMax = Math.max(iMax, Math.round(iM0 / fE));
            }
        }
        return Math.round(iMax * f11) + i11 + ((measurables.size() - 1) * mainAxisSpacing);
    }

    public final int h(List<? extends z3.q> measurables, int availableHeight, int mainAxisSpacing) {
        if (measurables.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((measurables.size() - 1) * mainAxisSpacing, availableHeight);
        int size = measurables.size();
        int iMax = 0;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < size; i11++) {
            z3.q qVar = measurables.get(i11);
            float fE = a0.e(a0.c(qVar));
            if (fE == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(qVar.V(Integer.MAX_VALUE), availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : availableHeight - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, qVar.s0(iMin2));
            } else if (fE > BitmapDescriptorFactory.HUE_RED) {
                f11 += fE;
            }
        }
        int iRound = f11 == BitmapDescriptorFactory.HUE_RED ? 0 : availableHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(availableHeight - iMin, 0) / f11);
        int size2 = measurables.size();
        for (int i12 = 0; i12 < size2; i12++) {
            z3.q qVar2 = measurables.get(i12);
            float fE2 = a0.e(a0.c(qVar2));
            if (fE2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, qVar2.s0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fE2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }
}
