package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvo0/q1;", "Lvo0/p0;", "Lto0/f;", "primitive", "<init>", "(Lto0/f;)V", "", "c", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "serialName", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q1 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(to0.f primitive) {
        super(primitive, null);
        p013kotlin.jvm.internal.s.k(primitive, "primitive");
        this.serialName = primitive.getSerialName() + "Array";
    }

    @Override // to0.f
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }
}
