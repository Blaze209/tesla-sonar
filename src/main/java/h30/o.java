package h30;

import com.stripe.android.model.AccountRange;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lh30/o;", "Lh30/d;", "Lh30/p;", "accountRanges", "<init>", "(Lh30/p;)V", "Lh30/f$b;", "cardNumber", "", "Lcom/stripe/android/model/a;", "c", "(Lh30/f$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lh30/p;", "Lkotlinx/coroutines/flow/StateFlow;", "", "b", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "loading", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p accountRanges;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<Boolean> loading;

    public o(p accountRanges) {
        s.k(accountRanges, "accountRanges");
        this.accountRanges = accountRanges;
        this.loading = r90.g.n(Boolean.FALSE);
    }

    @Override // h30.d
    public StateFlow<Boolean> b() {
        return this.loading;
    }

    @Override // h30.d
    public Object c(f.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        return this.accountRanges.a(unvalidated);
    }

    public /* synthetic */ o(p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new k() : pVar);
    }
}
