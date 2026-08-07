package pi0;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR(\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0012"}, d2 = {"Lpi0/j;", "", "", "initialValue", "<init>", "(Ljava/lang/Number;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_value", "Lkotlinx/coroutines/flow/Flow;", "b", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "onChanged", "value", "()Ljava/lang/Number;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Number> _value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Flow<Number> onChanged;

    public j(Number number) {
        MutableStateFlow<Number> MutableStateFlow = StateFlowKt.MutableStateFlow(number);
        this._value = MutableStateFlow;
        this.onChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    public final Flow<Number> a() {
        return this.onChanged;
    }

    public final Number b() {
        return this._value.getValue();
    }

    public final void c(Number number) {
        this._value.setValue(number);
    }
}
