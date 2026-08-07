package p2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p019p1.CubicBezierEasing;
import p019p1.d0;
import p019p1.f0;
import p019p1.o1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aA\u0010\u0007\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lp1/a;", "Lw4/h;", "target", "Lu1/i;", "from", "to", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lp1/a;FLu1/i;Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lp1/d0;", "a", "Lp1/d0;", "OutgoingSpecEasing", "Lp1/o1;", "b", "Lp1/o1;", "DefaultIncomingSpec", "c", "DefaultOutgoingSpec", "HoveredOutgoingSpec", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f100768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final o1<w4.h> f100769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final o1<w4.h> f100770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final o1<w4.h> f100771d;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f);
        f100768a = cubicBezierEasing;
        f100769b = new o1<>(120, 0, f0.c(), 2, null);
        f100770c = new o1<>(150, 0, cubicBezierEasing, 2, null);
        f100771d = new o1<>(120, 0, cubicBezierEasing, 2, null);
    }

    public static final Object d(p019p1.a<w4.h, ?> aVar, float f11, u1.i iVar, u1.i iVar2, Continuation<? super h0> continuation) {
        p019p1.i<w4.h> iVarB;
        if (iVar2 != null) {
            iVarB = b.f100767a.a(iVar2);
        } else {
            iVarB = iVar != null ? b.f100767a.b(iVar) : null;
        }
        p019p1.i<w4.h> iVar3 = iVarB;
        if (iVar3 != null) {
            Object objF = p019p1.a.f(aVar, w4.h.d(f11), iVar3, null, null, continuation, 12, null);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : h0.f84049a;
        }
        Object objT = aVar.t(w4.h.d(f11), continuation);
        return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : h0.f84049a;
    }
}
