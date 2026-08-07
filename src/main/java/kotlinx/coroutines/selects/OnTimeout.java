package kotlinx.coroutines.selects;

import jn0.h0;
import kotlinx.coroutines.DelayKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8F¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/selects/OnTimeout;", "", "", "timeMillis", "<init>", "(J)V", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "ignoredParam", "Ljn0/h0;", "register", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", "J", "Lkotlinx/coroutines/selects/SelectClause0;", "getSelectClause", "()Lkotlinx/coroutines/selects/SelectClause0;", "getSelectClause$annotations", "()V", "selectClause", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class OnTimeout {
    private final long timeMillis;

    public OnTimeout(long j11) {
        this.timeMillis = j11;
    }

    public static /* synthetic */ void getSelectClause$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void register(final SelectInstance<?> select, Object ignoredParam) {
        if (this.timeMillis <= 0) {
            select.selectInRegistrationPhase(h0.f84049a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.a
            @Override // java.lang.Runnable
            public final void run() {
                OnTimeout.register$lambda$0(select, this);
            }
        };
        s.i(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        SelectImplementation selectImplementation = (SelectImplementation) select;
        CoroutineContext context = selectImplementation.getContext();
        selectImplementation.disposeOnCompletion(DelayKt.getDelay(context).invokeOnTimeout(this.timeMillis, runnable, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(SelectInstance selectInstance, OnTimeout onTimeout) {
        selectInstance.trySelect(onTimeout, h0.f84049a);
    }

    public final SelectClause0 getSelectClause() {
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.INSTANCE;
        s.i(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new SelectClause0Impl(this, (q) u0.g(onTimeout$selectClause$1, 3), null, 4, null);
    }
}
