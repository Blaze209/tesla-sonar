package n70;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln70/r;", "", "", "isGooglePayAvailable", "isLinkAvailable", "Lw70/m;", "b", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savedSelection", "a", "(Lw70/m;)Z", "Lw70/j;", "paymentSelection", "Ljn0/h0;", "c", "(Lw70/j;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface r {
    boolean a(w70.m savedSelection);

    Object b(boolean z11, boolean z12, Continuation<? super w70.m> continuation);

    void c(w70.j paymentSelection);
}
