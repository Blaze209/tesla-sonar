package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lr2/q0;", "", "", "slotIndex", "nodeIndex", "nodeCount", "<init>", "(III)V", "a", "I", "c", "()I", "f", "(I)V", "b", "e", DateTokenConverter.CONVERTER_KEY, "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int slotIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    public q0(int i11, int i12, int i13) {
        this.slotIndex = i11;
        this.nodeIndex = i12;
        this.nodeCount = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNodeCount() {
        return this.nodeCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void d(int i11) {
        this.nodeCount = i11;
    }

    public final void e(int i11) {
        this.nodeIndex = i11;
    }

    public final void f(int i11) {
        this.slotIndex = i11;
    }
}
