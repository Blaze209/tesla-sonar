package t1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p019p1.m;
import p021s1.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lt1/l;", "Lt1/b;", "", "Lp1/m;", "Lp1/i;", "animationSpec", "<init>", "(Lp1/i;)V", "Ls1/u;", "scope", "offset", "velocity", "Lkotlin/Function1;", "Ljn0/h0;", "onAnimationStep", "Lt1/a;", "b", "(Ls1/u;FFLwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lp1/i;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class l implements b<Float, m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p019p1.i<Float> animationSpec;

    public l(p019p1.i<Float> iVar) {
        this.animationSpec = iVar;
    }

    @Override // t1.b
    public /* bridge */ /* synthetic */ Object a(u uVar, Float f11, Float f12, wn0.l<? super Float, h0> lVar, Continuation continuation) {
        return b(uVar, f11.floatValue(), f12.floatValue(), lVar, continuation);
    }

    public Object b(u uVar, float f11, float f12, wn0.l<? super Float, h0> lVar, Continuation<? super a<Float, m>> continuation) {
        Object objH = h.h(uVar, Math.abs(f11) * Math.signum(f12), f11, p019p1.l.c(BitmapDescriptorFactory.HUE_RED, f12, 0L, 0L, false, 28, null), this.animationSpec, lVar, continuation);
        return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : (a) objH;
    }
}
