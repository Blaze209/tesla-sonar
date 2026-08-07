package w30;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: w30.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0007\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001\u0017B-\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R!\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010*\u001a\b\u0012\u0004\u0012\u00020\n0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b\u0016\u0010)R\u001a\u0010,\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b\u001c\u0010\t¨\u0006."}, d2 = {"Lw30/b;", "Lw30/k0;", "", "", "params", "headers", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/util/Map;", "h", "()Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "a", "e", "Ljava/lang/String;", SearchIntents.EXTRA_QUERY, "Lw30/k0$a;", "f", "Lw30/k0$a;", "b", "()Lw30/k0$a;", "method", "Lw30/k0$b;", "g", "Lw30/k0$b;", "getMimeType", "()Lw30/k0$b;", "mimeType", "", "Ljava/lang/Iterable;", "()Ljava/lang/Iterable;", "retryResponseCodes", IntegerTokenConverter.CONVERTER_KEY, ImagesContract.URL, "j", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsRequest extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, ?> params;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, String> headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String query;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k0.a method;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k0.b mimeType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Iterable<Integer> retryResponseCodes;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String url;

    public AnalyticsRequest(Map<String, ?> params, Map<String, String> headers) {
        p013kotlin.jvm.internal.s.k(params, "params");
        p013kotlin.jvm.internal.s.k(headers, "headers");
        this.params = params;
        this.headers = headers;
        String strC = y.f120698a.c(params);
        this.query = strC;
        this.method = k0.a.GET;
        this.mimeType = k0.b.Form;
        this.retryResponseCodes = new bo0.j(HttpStatusCode.TOO_MANY_REQUESTS_429, HttpStatusCode.TOO_MANY_REQUESTS_429);
        this.url = p013kotlin.collections.v.y0(p013kotlin.collections.v.r("https://q.stripe.com", strC.length() <= 0 ? null : strC), CallerData.NA, null, null, 0, null, null, 62, null);
    }

    @Override // w30.k0
    public Map<String, String> a() {
        return this.headers;
    }

    @Override // w30.k0
    /* JADX INFO: renamed from: b, reason: from getter */
    public k0.a getMethod() {
        return this.method;
    }

    @Override // w30.k0
    public Iterable<Integer> d() {
        return this.retryResponseCodes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsRequest)) {
            return false;
        }
        AnalyticsRequest analyticsRequest = (AnalyticsRequest) other;
        return p013kotlin.jvm.internal.s.f(this.params, analyticsRequest.params) && p013kotlin.jvm.internal.s.f(this.headers, analyticsRequest.headers);
    }

    @Override // w30.k0
    /* JADX INFO: renamed from: f, reason: from getter */
    public String getUrl() {
        return this.url;
    }

    public final Map<String, ?> h() {
        return this.params;
    }

    public int hashCode() {
        return (this.params.hashCode() * 31) + this.headers.hashCode();
    }

    public String toString() {
        return "AnalyticsRequest(params=" + this.params + ", headers=" + this.headers + ")";
    }
}
