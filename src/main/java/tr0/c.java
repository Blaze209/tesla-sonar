package tr0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltr0/c;", "Ltr0/k;", "Ltr0/j;", "replaceData", "", "times", "<init>", "(Ltr0/j;I)V", "", "b", "()Ljava/lang/String;", "Ltr0/j;", "a", "()Ltr0/j;", "c", "I", "getTimes", "()I", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class c extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReplaceData replaceData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int times;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReplaceData replaceData, int i11) {
        super(null);
        p013kotlin.jvm.internal.s.k(replaceData, "replaceData");
        this.replaceData = replaceData;
        this.times = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public ReplaceData getReplaceData() {
        return this.replaceData;
    }

    @Override // wn0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String invoke() {
        return l.b(getReplaceData().getReplaceCandidate(), getReplaceData().getOldString(), getReplaceData().getNewString(), this.times);
    }
}
