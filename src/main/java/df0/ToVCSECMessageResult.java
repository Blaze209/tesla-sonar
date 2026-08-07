package df0;

import ic0.h;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: df0.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Ldf0/d;", "", "Lic0/h;", "result", "", "commandId", "<init>", "(Lic0/h;Ljava/lang/Long;)V", "a", "()Lic0/h;", "b", "()Ljava/lang/Long;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lic0/h;", "getResult", "Ljava/lang/Long;", "getCommandId", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ToVCSECMessageResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h result;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long commandId;

    public ToVCSECMessageResult(h result, Long l11) {
        s.k(result, "result");
        this.result = result;
        this.commandId = l11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCommandId() {
        return this.commandId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToVCSECMessageResult)) {
            return false;
        }
        ToVCSECMessageResult toVCSECMessageResult = (ToVCSECMessageResult) other;
        return this.result == toVCSECMessageResult.result && s.f(this.commandId, toVCSECMessageResult.commandId);
    }

    public int hashCode() {
        int iHashCode = this.result.hashCode() * 31;
        Long l11 = this.commandId;
        return iHashCode + (l11 == null ? 0 : l11.hashCode());
    }

    public String toString() {
        return "ToVCSECMessageResult(result=" + this.result + ", commandId=" + this.commandId + ")";
    }
}
