package u6;

import com.fourthline.analytics.internal.AnalyticsContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu6/k;", "T", "", "<init>", "()V", "Lu6/h0;", "newState", "c", "(Lu6/h0;)Lu6/h0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getCachedValue$annotations", "cachedValue", "()Lu6/h0;", "currentState", "Lkotlinx/coroutines/flow/Flow;", "b", "()Lkotlinx/coroutines/flow/Flow;", AnalyticsContext.Flow, "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<h0<T>> cachedValue;

    public k() {
        l0 l0Var = l0.f115647b;
        p013kotlin.jvm.internal.s.i(l0Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = StateFlowKt.MutableStateFlow(l0Var);
    }

    public final h0<T> a() {
        return this.cachedValue.getValue();
    }

    public final Flow<h0<T>> b() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    public final h0<T> c(h0<T> newState) {
        h0<T> value;
        h0<T> h0Var;
        p013kotlin.jvm.internal.s.k(newState, "newState");
        MutableStateFlow<h0<T>> mutableStateFlow = this.cachedValue;
        do {
            value = mutableStateFlow.getValue();
            h0Var = value;
            if (h0Var instanceof a0 ? true : p013kotlin.jvm.internal.s.f(h0Var, l0.f115647b)) {
                h0Var = newState;
            } else if (h0Var instanceof e) {
                if (newState.getVersion() > h0Var.getVersion()) {
                    h0Var = newState;
                }
            } else if (!(h0Var instanceof q)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!mutableStateFlow.compareAndSet(value, h0Var));
        return h0Var;
    }
}
