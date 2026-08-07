package kotlinx.coroutines.flow;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class FlowKt__ZipKt$combine$5$1<T> implements wn0.a<T[]> {
    final /* synthetic */ Flow<T>[] $flows;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$5$1(Flow<? extends T>[] flowArr) {
        this.$flows = flowArr;
    }

    @Override // wn0.a
    public final T[] invoke() {
        int length = this.$flows.length;
        s.q(0, "T?");
        return (T[]) new Object[length];
    }
}
