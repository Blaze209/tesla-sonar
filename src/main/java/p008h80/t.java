package p008h80;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.h;
import jn0.h0;
import jn0.s;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import wn0.l;
import wn0.p;
import wn0.q;
import x30.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0001\tJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lh80/t;", "Lh80/n;", "Ljn0/h0;", "close", "()V", "", "n", "()Z", "isLiveMode", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface t extends n {

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0099\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042$\u0010\u000b\u001a \b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2.\u0010\u000f\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H&¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lh80/t$a;", "", "Lcom/stripe/android/model/v0;", "initialPaymentMethod", "Lkotlin/Function1;", "Lh80/n$a;", "Ljn0/h0;", "eventHandler", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "removeExecutor", "Lkotlin/Function3;", "Lcom/stripe/android/model/h;", "Ljn0/s;", "updateExecutor", "Lx30/c;", "displayName", "", "canRemove", "isLiveMode", "Lh80/t;", "a", "(Lcom/stripe/android/model/v0;Lwn0/l;Lwn0/p;Lwn0/q;Lx30/c;ZZ)Lh80/t;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        t a(PaymentMethod initialPaymentMethod, l<? super n.a, h0> eventHandler, p<? super PaymentMethod, ? super Continuation<? super Throwable>, ? extends Object> removeExecutor, q<? super PaymentMethod, ? super h, ? super Continuation<? super s<PaymentMethod>>, ? extends Object> updateExecutor, c displayName, boolean canRemove, boolean isLiveMode);
    }

    void close();

    /* JADX INFO: renamed from: n */
    boolean getIsLiveMode();
}
