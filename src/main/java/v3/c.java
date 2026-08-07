package v3;

import androidx.compose.ui.platform.e3;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.RestrictsSuspension;

/* JADX INFO: loaded from: classes.dex */
@RestrictsSuspension
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JD\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00118&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00158VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lv3/c;", "Lw4/d;", "Lv3/o;", "pass", "Lv3/m;", "S0", "(Lv3/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "block", "v0", "(JLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o0", "Lw4/r;", "e", "()J", "size", "Lj3/m;", "f1", "extendedTouchPadding", "s1", "()Lv3/m;", "currentEvent", "Landroidx/compose/ui/platform/e3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/e3;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface c extends w4.d {
    static /* synthetic */ <T> Object I0(c cVar, long j11, wn0.p<? super c, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return pVar.invoke(cVar, continuation);
    }

    static /* synthetic */ <T> Object r1(c cVar, long j11, wn0.p<? super c, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return pVar.invoke(cVar, continuation);
    }

    static /* synthetic */ Object w1(c cVar, o oVar, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i11 & 1) != 0) {
            oVar = o.Main;
        }
        return cVar.S0(oVar, continuation);
    }

    Object S0(o oVar, Continuation<? super m> continuation);

    long e();

    default long f1() {
        return j3.m.INSTANCE.b();
    }

    e3 getViewConfiguration();

    default <T> Object o0(long j11, wn0.p<? super c, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return I0(this, j11, pVar, continuation);
    }

    m s1();

    default <T> Object v0(long j11, wn0.p<? super c, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super T> continuation) {
        return r1(this, j11, pVar, continuation);
    }
}
