package fd0;

import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import vc0.e3;

/* JADX INFO: renamed from: fd0.q, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001a"}, d2 = {"Lfd0/q;", "", "Lvc0/e3;", "unsignedMessage", "", "additionalData", "<init>", "(Lvc0/e3;[B)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "()Lvc0/e3;", "b", "()[B", "", "toString", "()Ljava/lang/String;", "Lvc0/e3;", "getUnsignedMessage", "[B", "getAdditionalData", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VCSECMessageBuildResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final e3 unsignedMessage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final byte[] additionalData;

    public VCSECMessageBuildResult(e3 unsignedMessage, byte[] bArr) {
        s.k(unsignedMessage, "unsignedMessage");
        this.unsignedMessage = unsignedMessage;
        this.additionalData = bArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e3 getUnsignedMessage() {
        return this.unsignedMessage;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getAdditionalData() {
        return this.additionalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(VCSECMessageBuildResult.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.i(other, "null cannot be cast to non-null type com.tesla.messagebuilder.VCSECMessageBuildResult");
        VCSECMessageBuildResult vCSECMessageBuildResult = (VCSECMessageBuildResult) other;
        return s.f(this.unsignedMessage, vCSECMessageBuildResult.unsignedMessage) && Arrays.equals(this.additionalData, vCSECMessageBuildResult.additionalData);
    }

    public int hashCode() {
        return (this.unsignedMessage.hashCode() * 31) + Arrays.hashCode(this.additionalData);
    }

    public String toString() {
        return "VCSECMessageBuildResult(unsignedMessage=" + this.unsignedMessage + ", additionalData=" + Arrays.toString(this.additionalData) + ")";
    }
}
