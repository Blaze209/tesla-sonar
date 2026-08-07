package wk0;

import bl0.HttpMethod;
import bl0.k;
import bl0.k0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: wk0.d, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001c\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b#\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b\u0018\u0010)R$\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-¨\u0006/"}, d2 = {"Lwk0/d;", "", "Lbl0/k0;", ImagesContract.URL, "Lbl0/t;", "method", "Lbl0/k;", "headers", "Lcl0/b;", "body", "Lkotlinx/coroutines/Job;", "executionContext", "Ldl0/b;", "attributes", "<init>", "(Lbl0/k0;Lbl0/t;Lbl0/k;Lcl0/b;Lkotlinx/coroutines/Job;Ldl0/b;)V", "T", "Lrk0/d;", Action.KEY_ATTRIBUTE, "c", "(Lrk0/d;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "a", "Lbl0/k0;", "h", "()Lbl0/k0;", "b", "Lbl0/t;", "f", "()Lbl0/t;", "Lbl0/k;", "e", "()Lbl0/k;", DateTokenConverter.CONVERTER_KEY, "Lcl0/b;", "()Lcl0/b;", "Lkotlinx/coroutines/Job;", "()Lkotlinx/coroutines/Job;", "Ldl0/b;", "()Ldl0/b;", "", "g", "Ljava/util/Set;", "()Ljava/util/Set;", "requiredCapabilities", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HttpRequestData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final k0 url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HttpMethod method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k headers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cl0.b body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Job executionContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dl0.b attributes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Set<rk0.d<?>> requiredCapabilities;

    public HttpRequestData(k0 url, HttpMethod method, k headers, cl0.b body, Job executionContext, dl0.b attributes) {
        Set<rk0.d<?>> setKeySet;
        s.k(url, "url");
        s.k(method, "method");
        s.k(headers, "headers");
        s.k(body, "body");
        s.k(executionContext, "executionContext");
        s.k(attributes, "attributes");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = body;
        this.executionContext = executionContext;
        this.attributes = attributes;
        Map map = (Map) attributes.a(rk0.e.a());
        this.requiredCapabilities = (map == null || (setKeySet = map.keySet()) == null) ? d1.d() : setKeySet;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final dl0.b getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final cl0.b getBody() {
        return this.body;
    }

    public final <T> T c(rk0.d<T> key) {
        s.k(key, "key");
        Map map = (Map) this.attributes.a(rk0.e.a());
        if (map != null) {
            return (T) map.get(key);
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Job getExecutionContext() {
        return this.executionContext;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final k getHeaders() {
        return this.headers;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final HttpMethod getMethod() {
        return this.method;
    }

    public final Set<rk0.d<?>> g() {
        return this.requiredCapabilities;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final k0 getUrl() {
        return this.url;
    }

    public String toString() {
        return "HttpRequestData(url=" + this.url + ", method=" + this.method + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
