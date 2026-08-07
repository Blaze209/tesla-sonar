package q1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J6\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lq1/n0;", "", "Lj3/g;", "delta", "Lu3/e;", "source", "Lkotlin/Function1;", "performScroll", "a", "(JILwn0/l;)J", "Lw4/y;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "performFling", "Ljn0/h0;", "b", "(JLwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "c", "()Z", "isInProgress", "Landroidx/compose/ui/d;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/compose/ui/d;", "effectModifier", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface n0 {
    long a(long delta, int source, wn0.l<? super j3.g, j3.g> performScroll);

    Object b(long j11, wn0.p<? super w4.y, ? super Continuation<? super w4.y>, ? extends Object> pVar, Continuation<? super jn0.h0> continuation);

    boolean c();

    androidx.compose.ui.d d();
}
