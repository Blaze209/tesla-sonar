package kotlinx.coroutines.rx3;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* synthetic */ class RxObservableCoroutine$onSend$2 extends p implements q<RxObservableCoroutine<?>, Object, Object, Object> {
    public static final RxObservableCoroutine$onSend$2 INSTANCE = new RxObservableCoroutine$onSend$2();

    RxObservableCoroutine$onSend$2() {
        super(3, RxObservableCoroutine.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // wn0.q
    public final Object invoke(RxObservableCoroutine<?> rxObservableCoroutine, Object obj, Object obj2) {
        return rxObservableCoroutine.processResultSelectSend(obj, obj2);
    }
}
