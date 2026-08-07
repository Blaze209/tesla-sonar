package r30;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lr30/l;", "", "Lr30/d;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fraudDetectionData", "Ljn0/h0;", "b", "(Lr30/d;)V", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface l {
    Object a(Continuation<? super FraudDetectionData> continuation);

    void b(FraudDetectionData fraudDetectionData);
}
