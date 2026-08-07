package kotlinx.coroutines.rx3;

import jn0.h0;
import kotlinx.coroutines.selects.SelectInstance;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class RxObservableCoroutine$onSend$1 extends p implements q<RxObservableCoroutine<?>, SelectInstance<?>, Object, h0> {
    public static final RxObservableCoroutine$onSend$1 INSTANCE = new RxObservableCoroutine$onSend$1();

    RxObservableCoroutine$onSend$1() {
        super(3, RxObservableCoroutine.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ h0 invoke(RxObservableCoroutine<?> rxObservableCoroutine, SelectInstance<?> selectInstance, Object obj) {
        invoke2(rxObservableCoroutine, selectInstance, obj);
        return h0.f84049a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RxObservableCoroutine<?> rxObservableCoroutine, SelectInstance<?> selectInstance, Object obj) {
        rxObservableCoroutine.registerSelectForSend(selectInstance, obj);
    }
}
