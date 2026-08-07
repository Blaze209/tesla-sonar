package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p019p1.CubicBezierEasing;
import p019p1.a;
import p019p1.f0;
import p019p1.o1;
import u1.i;
import w4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lp1/a;", "Lw4/h;", "target", "Lu1/i;", "from", "to", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lp1/a;FLu1/i;Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/o1;", "a", "Lp1/o1;", "DefaultIncomingSpec", "b", "DefaultOutgoingSpec", "c", "HoveredOutgoingSpec", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o1<h> f75074a = new o1<>(120, 0, f0.c(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o1<h> f75075b = new o1<>(150, 0, new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f), 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o1<h> f75076c = new o1<>(120, 0, new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f), 2, null);

    public static final Object d(a<h, ?> aVar, float f11, i iVar, i iVar2, Continuation<? super h0> continuation) {
        p019p1.i<h> iVarB;
        if (iVar2 != null) {
            iVarB = q0.f74973a.a(iVar2);
        } else {
            iVarB = iVar != null ? q0.f74973a.b(iVar) : null;
        }
        p019p1.i<h> iVar3 = iVarB;
        if (iVar3 != null) {
            Object objF = a.f(aVar, h.d(f11), iVar3, null, null, continuation, 12, null);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
        }
        Object objT = aVar.t(h.d(f11), continuation);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : h0.f84049a;
    }
}
