package pi0;

import java.util.List;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import oi0.Option;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0007R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR#\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lpi0/l;", "", "", "Loi0/e4;", "initialValue", "<init>", "(Ljava/util/List;)V", "(Loi0/e4;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_selectedOptionsValue", "Lkotlinx/coroutines/flow/Flow;", "b", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "onChanged", "value", "()Ljava/util/List;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<List<Option>> _selectedOptionsValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Flow<List<Option>> onChanged;

    public l(List<Option> initialValue) {
        s.k(initialValue, "initialValue");
        MutableStateFlow<List<Option>> MutableStateFlow = StateFlowKt.MutableStateFlow(initialValue);
        this._selectedOptionsValue = MutableStateFlow;
        this.onChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    public final Flow<List<Option>> a() {
        return this.onChanged;
    }

    public final List<Option> b() {
        return this._selectedOptionsValue.getValue();
    }

    public final void c(List<Option> value) {
        s.k(value, "value");
        this._selectedOptionsValue.setValue(value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(Option option) {
        List listE;
        if (option == null) {
            listE = v.m();
        } else {
            listE = v.e(option);
        }
        this((List<Option>) listE);
    }
}
