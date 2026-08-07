package w30;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw30/k;", "", "Lw30/g;", "request", "", "b", "(Lw30/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface k {
    Object a(String str, Continuation<? super AnalyticsRequestV2> continuation);

    Object b(AnalyticsRequestV2 analyticsRequestV2, Continuation<? super String> continuation);
}
