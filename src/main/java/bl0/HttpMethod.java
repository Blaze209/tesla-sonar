package bl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bl0.t, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0013"}, d2 = {"Lbl0/t;", "", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HttpMethod {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HttpMethod f17707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HttpMethod f17708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HttpMethod f17709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HttpMethod f17710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final HttpMethod f17711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HttpMethod f17712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final HttpMethod f17713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final List<HttpMethod> f17714j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String value;

    /* JADX INFO: renamed from: bl0.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lbl0/t$a;", "", "<init>", "()V", "Lbl0/t;", "Get", "Lbl0/t;", "a", "()Lbl0/t;", "Post", "c", "Put", DateTokenConverter.CONVERTER_KEY, "Head", "b", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HttpMethod a() {
            return HttpMethod.f17707c;
        }

        public final HttpMethod b() {
            return HttpMethod.f17712h;
        }

        public final HttpMethod c() {
            return HttpMethod.f17708d;
        }

        public final HttpMethod d() {
            return HttpMethod.f17709e;
        }

        private Companion() {
        }
    }

    static {
        HttpMethod httpMethod = new HttpMethod("GET");
        f17707c = httpMethod;
        HttpMethod httpMethod2 = new HttpMethod("POST");
        f17708d = httpMethod2;
        HttpMethod httpMethod3 = new HttpMethod("PUT");
        f17709e = httpMethod3;
        HttpMethod httpMethod4 = new HttpMethod("PATCH");
        f17710f = httpMethod4;
        HttpMethod httpMethod5 = new HttpMethod("DELETE");
        f17711g = httpMethod5;
        HttpMethod httpMethod6 = new HttpMethod("HEAD");
        f17712h = httpMethod6;
        HttpMethod httpMethod7 = new HttpMethod("OPTIONS");
        f17713i = httpMethod7;
        f17714j = p013kotlin.collections.v.p(httpMethod, httpMethod2, httpMethod3, httpMethod4, httpMethod5, httpMethod6, httpMethod7);
    }

    public HttpMethod(String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.value = value;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HttpMethod) && p013kotlin.jvm.internal.s.f(this.value, ((HttpMethod) other).value);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return "HttpMethod(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
