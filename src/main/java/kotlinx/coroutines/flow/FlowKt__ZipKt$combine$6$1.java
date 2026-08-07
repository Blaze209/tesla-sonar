package kotlinx.coroutines.flow;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class FlowKt__ZipKt$combine$6$1<T> implements wn0.a<T[]> {
    final /* synthetic */ Flow<T>[] $flowArray;

    public FlowKt__ZipKt$combine$6$1(Flow<T>[] flowArr) {
        this.$flowArray = flowArr;
    }

    @Override // wn0.a
    public final T[] invoke() {
        int length = this.$flowArray.length;
        s.q(0, "T?");
        return (T[]) new Object[length];
    }
}
