package u6;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002JF\u0010\n\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00032.\u0010\t\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u000f\u001a\u00020\u000e2(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lu6/j0;", "T", "Lu6/c;", "R", "Lkotlin/Function3;", "Lu6/b0;", "", "Lkotlin/coroutines/Continuation;", "", "block", DateTokenConverter.CONVERTER_KEY, "(Lwn0/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lu6/o0;", "Ljn0/h0;", "b", "(Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lu6/s;", "c", "()Lu6/s;", "coordinator", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface j0<T> extends c {
    Object b(wn0.p<? super o0<T>, ? super Continuation<? super jn0.h0>, ? extends Object> pVar, Continuation<? super jn0.h0> continuation);

    s c();

    <R> Object d(wn0.q<? super b0<T>, ? super Boolean, ? super Continuation<? super R>, ? extends Object> qVar, Continuation<? super R> continuation);
}
