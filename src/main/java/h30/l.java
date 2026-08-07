package h30;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.AccountRange;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lh30/l;", "Lh30/d;", "Lh30/e;", PlaceTypes.STORE, "<init>", "(Lh30/e;)V", "Lh30/f$b;", "cardNumber", "", "Lcom/stripe/android/model/a;", "c", "(Lh30/f$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lh30/e;", "Lkotlinx/coroutines/flow/StateFlow;", "", "b", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e store;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading;

    public l(e store) {
        s.k(store, "store");
        this.store = store;
        this.loading = r90.g.n(Boolean.FALSE);
    }

    @Override // h30.d
    public StateFlow<Boolean> b() {
        return this.loading;
    }

    @Override // h30.d
    public Object c(f.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        a bin = unvalidated.getBin();
        if (bin == null) {
            return null;
        }
        Object objB = this.store.b(bin, continuation);
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : (List) objB;
    }
}
