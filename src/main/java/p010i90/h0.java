package p010i90;

import kotlinx.coroutines.flow.StateFlow;
import n90.FormFieldEntry;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Li90/h0;", "Li90/l1;", "", "rawValue", "Ljn0/h0;", "t", "(Ljava/lang/String;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "isComplete", "()Lkotlinx/coroutines/flow/StateFlow;", "Ln90/a;", "m", "formFieldValue", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface h0 extends l1 {
    StateFlow<Boolean> isComplete();

    StateFlow<FormFieldEntry> m();

    void t(String rawValue);
}
