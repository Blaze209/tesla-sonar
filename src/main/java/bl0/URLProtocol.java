package bl0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: bl0.h0, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Lbl0/h0;", "", "", "name", "", "defaultPort", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "I", "c", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class URLProtocol {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final URLProtocol f17611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final URLProtocol f17612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final URLProtocol f17613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final URLProtocol f17614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final URLProtocol f17615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<String, URLProtocol> f17616i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int defaultPort;

    /* JADX INFO: renamed from: bl0.h0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lbl0/h0$a;", "", "<init>", "()V", "", "name", "Lbl0/h0;", "a", "(Ljava/lang/String;)Lbl0/h0;", "HTTP", "Lbl0/h0;", "c", "()Lbl0/h0;", "", "byName", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final URLProtocol a(String name) {
            p013kotlin.jvm.internal.s.k(name, "name");
            String strC = dl0.b0.c(name);
            URLProtocol uRLProtocol = URLProtocol.INSTANCE.b().get(strC);
            return uRLProtocol == null ? new URLProtocol(strC, 0) : uRLProtocol;
        }

        public final Map<String, URLProtocol> b() {
            return URLProtocol.f17616i;
        }

        public final URLProtocol c() {
            return URLProtocol.f17611d;
        }

        private Companion() {
        }
    }

    static {
        URLProtocol uRLProtocol = new URLProtocol("http", 80);
        f17611d = uRLProtocol;
        URLProtocol uRLProtocol2 = new URLProtocol("https", 443);
        f17612e = uRLProtocol2;
        URLProtocol uRLProtocol3 = new URLProtocol("ws", 80);
        f17613f = uRLProtocol3;
        URLProtocol uRLProtocol4 = new URLProtocol("wss", 443);
        f17614g = uRLProtocol4;
        URLProtocol uRLProtocol5 = new URLProtocol("socks", 1080);
        f17615h = uRLProtocol5;
        List listP = p013kotlin.collections.v.p(uRLProtocol, uRLProtocol2, uRLProtocol3, uRLProtocol4, uRLProtocol5);
        LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(p013kotlin.collections.v.y(listP, 10)), 16));
        for (Object obj : listP) {
            linkedHashMap.put(((URLProtocol) obj).name, obj);
        }
        f17616i = linkedHashMap;
    }

    public URLProtocol(String name, int i11) {
        p013kotlin.jvm.internal.s.k(name, "name");
        this.name = name;
        this.defaultPort = i11;
        for (int i12 = 0; i12 < name.length(); i12++) {
            if (!dl0.j.a(name.charAt(i12))) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDefaultPort() {
        return this.defaultPort;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof URLProtocol)) {
            return false;
        }
        URLProtocol uRLProtocol = (URLProtocol) other;
        return p013kotlin.jvm.internal.s.f(this.name, uRLProtocol.name) && this.defaultPort == uRLProtocol.defaultPort;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Integer.hashCode(this.defaultPort);
    }

    public String toString() {
        return "URLProtocol(name=" + this.name + ", defaultPort=" + this.defaultPort + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
