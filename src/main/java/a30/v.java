package a30;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0007\u0010\u0005¨\u0006\u0013"}, d2 = {"La30/v;", "La30/t;", "", "initialValue", "<init>", "(Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_textValue", "Lkotlinx/coroutines/flow/Flow;", "b", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "onTextChanged", "value", "c", "()Ljava/lang/String;", "textValue", "wf1-core-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class v implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<String> _textValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Flow<String> onTextChanged;

    public v(String initialValue) {
        p013kotlin.jvm.internal.s.k(initialValue, "initialValue");
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(initialValue);
        this._textValue = MutableStateFlow;
        this.onTextChanged = FlowKt.drop(MutableStateFlow, 1);
    }

    @Override // a30.t
    public void a(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this._textValue.setValue(value);
    }

    @Override // a30.t
    public Flow<String> b() {
        return this.onTextChanged;
    }

    @Override // a30.t
    public String c() {
        return this._textValue.getValue();
    }
}
