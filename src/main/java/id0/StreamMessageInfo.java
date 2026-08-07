package id0;

import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: id0.e, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lid0/e;", "", "", "pongReceived", "Lorg/json/JSONObject;", "data", "<init>", "(ZLorg/json/JSONObject;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StreamMessageInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean pongReceived;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final JSONObject data;

    public StreamMessageInfo(boolean z11, JSONObject data) {
        s.k(data, "data");
        this.pongReceived = z11;
        this.data = data;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final JSONObject getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPongReceived() {
        return this.pongReceived;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StreamMessageInfo)) {
            return false;
        }
        StreamMessageInfo streamMessageInfo = (StreamMessageInfo) other;
        return this.pongReceived == streamMessageInfo.pongReceived && s.f(this.data, streamMessageInfo.data);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.pongReceived) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "StreamMessageInfo(pongReceived=" + this.pongReceived + ", data=" + this.data + ")";
    }
}
