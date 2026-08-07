package pi0;

import java.util.Set;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR#\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0011\"\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lpi0/m;", "", "", "", "initialValue", "<init>", "(Ljava/util/Set;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_stringSetValue", "Lkotlinx/coroutines/flow/Flow;", "b", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "onChanged", "value", "()Ljava/util/Set;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Set<String>> _stringSetValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Flow<Set<String>> onChanged;

    public m(Set<String> initialValue) {
        s.k(initialValue, "initialValue");
        MutableStateFlow<Set<String>> MutableStateFlow = StateFlowKt.MutableStateFlow(initialValue);
        this._stringSetValue = MutableStateFlow;
        this.onChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    public final Flow<Set<String>> a() {
        return this.onChanged;
    }

    public final Set<String> b() {
        return this._stringSetValue.getValue();
    }

    public final void c(Set<String> value) {
        s.k(value, "value");
        this._stringSetValue.setValue(value);
    }
}
