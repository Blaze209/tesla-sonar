package s30;

import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ls30/d;", "", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "b", "()Lkotlin/coroutines/CoroutineContext;", "a", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {
    public final CoroutineContext a() {
        return Dispatchers.getMain();
    }

    public final CoroutineContext b() {
        return Dispatchers.getIO();
    }
}
