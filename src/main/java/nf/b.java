package nf;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "scope", "Lkotlinx/coroutines/flow/Flow;", "Lkf/f;", "paymentMethodViewFlow", "genericActionViewFlow", "initialValue", "Lkotlinx/coroutines/flow/SharingStarted;", "started", "Lkotlinx/coroutines/flow/StateFlow;", "a", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkf/f;Lkotlinx/coroutines/flow/SharingStarted;)Lkotlinx/coroutines/flow/StateFlow;", "ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {
    public static final StateFlow<kf.f> a(CoroutineScope scope, Flow<? extends kf.f> paymentMethodViewFlow, Flow<? extends kf.f> genericActionViewFlow, kf.f fVar, SharingStarted started) {
        s.k(scope, "scope");
        s.k(paymentMethodViewFlow, "paymentMethodViewFlow");
        s.k(genericActionViewFlow, "genericActionViewFlow");
        s.k(started, "started");
        return le.f.b(scope, started, fVar, paymentMethodViewFlow, FlowKt.drop(genericActionViewFlow, 1));
    }

    public static /* synthetic */ StateFlow b(CoroutineScope coroutineScope, Flow flow, Flow flow2, kf.f fVar, SharingStarted sharingStarted, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            fVar = null;
        }
        if ((i11 & 16) != 0) {
            sharingStarted = SharingStarted.INSTANCE.getLazily();
        }
        return a(coroutineScope, flow, flow2, fVar, sharingStarted);
    }
}
