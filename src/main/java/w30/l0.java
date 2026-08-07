package w30;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ,*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0017B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u001a\b\u0002\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR)\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010&\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b&\u0010\"R\u0019\u0010+\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001f\u0010*¨\u0006-"}, d2 = {"Lw30/l0;", "ResponseBody", "", "", "code", "body", "", "", "", "headers", "<init>", "(ILjava/lang/Object;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", Action.KEY_ATTRIBUTE, "c", "(Ljava/lang/String;)Ljava/util/List;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Ljava/util/Map;", "getHeaders", "()Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "Z", "f", "()Z", "isOk", "e", "isError", "isRateLimited", "Lw30/d0;", "g", "Lw30/d0;", "()Lw30/d0;", "requestId", "h", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class l0<ResponseBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ResponseBody body;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<String>> headers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isOk;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isError;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isRateLimited;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d0 requestId;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(int i11, ResponseBody responsebody, Map<String, ? extends List<String>> headers) {
        p013kotlin.jvm.internal.s.k(headers, "headers");
        this.code = i11;
        this.body = responsebody;
        this.headers = headers;
        this.isOk = i11 == 200;
        this.isError = i11 < 200 || i11 >= 300;
        this.isRateLimited = i11 == 429;
        d0.Companion companion = d0.INSTANCE;
        List<String> listC = c("Request-Id");
        this.requestId = companion.a(listC != null ? (String) p013kotlin.collections.v.q0(listC) : null);
    }

    public final ResponseBody a() {
        return this.body;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final List<String> c(String key) {
        Object next;
        p013kotlin.jvm.internal.s.k(key, "key");
        Iterator<T> it = this.headers.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.text.t.M((String) ((Map.Entry) next).getKey(), key, true));
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (List) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d0 getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) other;
        return this.code == l0Var.code && p013kotlin.jvm.internal.s.f(this.body, l0Var.body) && p013kotlin.jvm.internal.s.f(this.headers, l0Var.headers);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsOk() {
        return this.isOk;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        ResponseBody responsebody = this.body;
        return ((iHashCode + (responsebody == null ? 0 : responsebody.hashCode())) * 31) + this.headers.hashCode();
    }

    public String toString() {
        return "Request-Id: " + this.requestId + ", Status Code: " + this.code;
    }
}
