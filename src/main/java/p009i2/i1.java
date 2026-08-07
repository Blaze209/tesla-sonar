package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k3.p1;
import k3.r1;
import p007h2.SelectionColors;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a*\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a2\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Li2/r;", "colors", "Lh2/l0;", "e", "(Li2/r;Lr2/l;I)Lh2/l0;", "Lk3/p1;", "selectionColor", "textColor", "backgroundColor", DateTokenConverter.CONVERTER_KEY, "(JJJ)J", "", "a", "(JJJ)F", "selectionColorAlpha", "c", "(JFJJ)F", "foreground", AppStateModule.APP_STATE_BACKGROUND, "b", "(JJ)F", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i1 {
    private static final float a(long j11, long j12, long j13) {
        int i11 = 0;
        float f11 = 0.2f;
        float f12 = 0.4f;
        float f13 = 0.4f;
        while (i11 < 7) {
            long j14 = j11;
            long j15 = j12;
            long j16 = j13;
            float fC = (c(j14, f12, j15, j16) / 4.5f) - 1.0f;
            if (BitmapDescriptorFactory.HUE_RED <= fC && fC <= 0.01f) {
                return f12;
            }
            if (fC < BitmapDescriptorFactory.HUE_RED) {
                f13 = f12;
            } else {
                f11 = f12;
            }
            f12 = (f13 + f11) / 2.0f;
            i11++;
            j11 = j14;
            j12 = j15;
            j13 = j16;
        }
        return f12;
    }

    public static final float b(long j11, long j12) {
        float fJ = r1.j(j11) + 0.05f;
        float fJ2 = r1.j(j12) + 0.05f;
        return Math.max(fJ, fJ2) / Math.min(fJ, fJ2);
    }

    private static final float c(long j11, float f11, long j12, long j13) {
        long jH = r1.h(p1.p(j11, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), j13);
        return b(r1.h(j12, jH), jH);
    }

    public static final long d(long j11, long j12, long j13) {
        float fA;
        float fC = c(j11, 0.4f, j12, j13);
        float fC2 = c(j11, 0.2f, j12, j13);
        if (fC >= 4.5f) {
            fA = 0.4f;
        } else {
            fA = fC2 < 4.5f ? 0.2f : a(j11, j12, j13);
        }
        return p1.p(j11, fA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    public static final SelectionColors e(Colors colors, l lVar, int i11) {
        if (o.J()) {
            o.S(-721696685, i11, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long j11 = colors.j();
        long jC = colors.c();
        lVar.o(1102762072);
        long jA = s.a(colors, jC);
        if (jA == 16) {
            jA = ((p1) lVar.U(z.a())).getValue();
        }
        long j12 = jA;
        lVar.l();
        long jP = p1.p(j12, x.f75438a.d(lVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
        boolean zS = lVar.s(j11) | lVar.s(jC) | lVar.s(jP);
        Object objI = lVar.I();
        if (zS || objI == l.INSTANCE.a()) {
            SelectionColors selectionColors = new SelectionColors(colors.j(), d(j11, jP, jC), null);
            lVar.B(selectionColors);
            objI = selectionColors;
        }
        SelectionColors selectionColors2 = (SelectionColors) objI;
        if (o.J()) {
            o.R();
        }
        return selectionColors2;
    }
}
