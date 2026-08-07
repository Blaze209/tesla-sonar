package nc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: nc.p, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJM\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001f\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lnc/p;", "", "", "code", "", "requestMillis", "responseMillis", "Lnc/m;", "headers", "Lnc/q;", "body", "delegate", "<init>", "(IJJLnc/m;Lnc/q;Ljava/lang/Object;)V", "a", "(IJJLnc/m;Lnc/q;Ljava/lang/Object;)Lnc/p;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "I", DateTokenConverter.CONVERTER_KEY, "b", "J", "f", "()J", "c", "g", "Lnc/m;", "e", "()Lnc/m;", "Lnc/q;", "()Lnc/q;", "Ljava/lang/Object;", "getDelegate", "()Ljava/lang/Object;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NetworkResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long requestMillis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long responseMillis;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final NetworkHeaders headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q body;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object delegate;

    public NetworkResponse() {
        this(0, 0L, 0L, null, null, null, 63, null);
    }

    public static /* synthetic */ NetworkResponse b(NetworkResponse networkResponse, int i11, long j11, long j12, NetworkHeaders networkHeaders, q qVar, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            i11 = networkResponse.code;
        }
        if ((i12 & 2) != 0) {
            j11 = networkResponse.requestMillis;
        }
        if ((i12 & 4) != 0) {
            j12 = networkResponse.responseMillis;
        }
        if ((i12 & 8) != 0) {
            networkHeaders = networkResponse.headers;
        }
        if ((i12 & 16) != 0) {
            qVar = networkResponse.body;
        }
        if ((i12 & 32) != 0) {
            obj = networkResponse.delegate;
        }
        Object obj3 = obj;
        NetworkHeaders networkHeaders2 = networkHeaders;
        long j13 = j12;
        return networkResponse.a(i11, j11, j13, networkHeaders2, qVar, obj3);
    }

    public final NetworkResponse a(int code, long requestMillis, long responseMillis, NetworkHeaders headers, q body, Object delegate) {
        return new NetworkResponse(code, requestMillis, responseMillis, headers, body, delegate);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final q getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final NetworkHeaders getHeaders() {
        return this.headers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkResponse)) {
            return false;
        }
        NetworkResponse networkResponse = (NetworkResponse) other;
        return this.code == networkResponse.code && this.requestMillis == networkResponse.requestMillis && this.responseMillis == networkResponse.responseMillis && s.f(this.headers, networkResponse.headers) && s.f(this.body, networkResponse.body) && s.f(this.delegate, networkResponse.delegate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getRequestMillis() {
        return this.requestMillis;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getResponseMillis() {
        return this.responseMillis;
    }

    public int hashCode() {
        int iHashCode = ((((((this.code * 31) + Long.hashCode(this.requestMillis)) * 31) + Long.hashCode(this.responseMillis)) * 31) + this.headers.hashCode()) * 31;
        q qVar = this.body;
        int iHashCode2 = (iHashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.delegate;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(code=" + this.code + ", requestMillis=" + this.requestMillis + ", responseMillis=" + this.responseMillis + ", headers=" + this.headers + ", body=" + this.body + ", delegate=" + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public NetworkResponse(int i11, long j11, long j12, NetworkHeaders networkHeaders, q qVar, Object obj) {
        this.code = i11;
        this.requestMillis = j11;
        this.responseMillis = j12;
        this.headers = networkHeaders;
        this.body = qVar;
        this.delegate = obj;
    }

    public /* synthetic */ NetworkResponse(int i11, long j11, long j12, NetworkHeaders networkHeaders, q qVar, Object obj, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 200 : i11, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? 0L : j12, (i12 & 8) != 0 ? NetworkHeaders.f93763c : networkHeaders, (i12 & 16) != 0 ? null : qVar, (i12 & 32) != 0 ? null : obj);
    }
}
