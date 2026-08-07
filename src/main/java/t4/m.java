package t4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.e0;
import k3.h1;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u0003*\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"Lt4/n;", "start", "stop", "", "fraction", "b", "(Lt4/n;Lt4/n;F)Lt4/n;", "Lk3/p1;", "alpha", "c", "(JF)J", "Lkotlin/Function0;", "block", DateTokenConverter.CONVERTER_KEY, "(FLwn0/a;)F", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {
    public static final n b(n nVar, n nVar2, float f11) {
        boolean z11 = nVar instanceof BrushStyle;
        if (z11 || (nVar2 instanceof BrushStyle)) {
            return (z11 && (nVar2 instanceof BrushStyle)) ? n.INSTANCE.a((h1) e0.d(((BrushStyle) nVar).e(), ((BrushStyle) nVar2).e(), f11), y4.b.b(nVar.getAlpha(), nVar2.getAlpha(), f11)) : (n) e0.d(nVar, nVar2, f11);
        }
        return n.INSTANCE.b(r1.i(nVar.getValue(), nVar2.getValue(), f11));
    }

    public static final long c(long j11, float f11) {
        return (Float.isNaN(f11) || f11 >= 1.0f) ? j11 : p1.p(j11, p1.s(j11) * f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f11, wn0.a<Float> aVar) {
        return Float.isNaN(f11) ? aVar.invoke().floatValue() : f11;
    }
}
