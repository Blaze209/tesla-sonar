package p024x1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p021s1.u;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\ba\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\u000b\u0010\fJ4\u0010\u0010\u001a\u00020\u00062\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lx1/h;", "", "Ls1/u;", "", "index", "scrollOffset", "Ljn0/h0;", "b", "(Ls1/u;II)V", "targetIndex", "", "f", "(I)F", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "c", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()I", "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "e", "lastVisibleItemIndex", "a", "itemCount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface h {
    int a();

    void b(u uVar, int i11, int i12);

    Object c(p<? super u, ? super Continuation<? super h0>, ? extends Object> pVar, Continuation<? super h0> continuation);

    int d();

    int e();

    float f(int targetIndex);

    int g();
}
