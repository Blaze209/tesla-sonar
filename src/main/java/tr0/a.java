package tr0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ltr0/a;", "Ltr0/k;", "Ltr0/j;", "replaceData", "<init>", "(Ltr0/j;)V", "", "b", "()Ljava/lang/String;", "Ltr0/j;", "a", "()Ltr0/j;", "c", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReplaceData replaceData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ReplaceData replaceData) {
        super(null);
        p013kotlin.jvm.internal.s.k(replaceData, "replaceData");
        this.replaceData = replaceData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public ReplaceData getReplaceData() {
        return this.replaceData;
    }

    @Override // wn0.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String invoke() {
        return p013kotlin.text.t.V(getReplaceData().getReplaceCandidate(), getReplaceData().getOldString(), getReplaceData().getNewString(), false, 4, null);
    }
}
