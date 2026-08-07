package q1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lq1/k0;", "Lq1/n0;", "<init>", "()V", "Lj3/g;", "delta", "Lu3/e;", "source", "Lkotlin/Function1;", "performScroll", "a", "(JILwn0/l;)J", "Lw4/y;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "Ljn0/h0;", "b", "(JLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "()Z", "isInProgress", "Landroidx/compose/ui/d;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/compose/ui/d;", "effectModifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f104294a = new k0();

    private k0() {
    }

    @Override // q1.n0
    public long a(long delta, int source, wn0.l<? super j3.g, j3.g> performScroll) {
        return performScroll.invoke(j3.g.d(delta)).getPackedValue();
    }

    @Override // q1.n0
    public Object b(long j11, wn0.p<? super w4.y, ? super Continuation<? super w4.y>, ? extends Object> pVar, Continuation<? super jn0.h0> continuation) {
        Object objInvoke = pVar.invoke(w4.y.b(j11), continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : jn0.h0.f84049a;
    }

    @Override // q1.n0
    public boolean c() {
        return false;
    }

    @Override // q1.n0
    public androidx.compose.ui.d d() {
        return androidx.compose.ui.d.INSTANCE;
    }
}
