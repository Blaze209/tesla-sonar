package w30;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.core.exception.InvalidRequestException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import o30.ApiVersion;
import o30.AppInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0003F\" Ba\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010%R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b'\u00103R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010%R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010D\u001a\b\u0012\u0004\u0012\u00020\u00190@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b$\u0010CR&\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010(\u001a\u0004\bF\u0010*R0\u0010K\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bH\u0010(\u001a\u0004\b \u0010*\"\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010MR\u0014\u0010O\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0018¨\u0006Q"}, d2 = {"Lw30/l;", "Lw30/k0;", "Lw30/k0$a;", "method", "", "baseUrl", "", "params", "Lw30/l$c;", "options", "Lo30/c;", "appInfo", "apiVersion", "sdkVersion", "", "shouldCache", "<init>", "(Lw30/k0$a;Ljava/lang/String;Ljava/util/Map;Lw30/l$c;Lo30/c;Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/io/OutputStream;", "outputStream", "Ljn0/h0;", "g", "(Ljava/io/OutputStream;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Lw30/k0$a;", "b", "()Lw30/k0$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "h", "e", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "f", "Lw30/l$c;", "getOptions", "()Lw30/l$c;", "Lo30/c;", IntegerTokenConverter.CONVERTER_KEY, "j", "Z", "()Z", "k", SearchIntents.EXTRA_QUERY, "Lw30/c0$b;", "l", "Lw30/c0$b;", "headersFactory", "Lw30/k0$b;", "m", "Lw30/k0$b;", "getMimeType", "()Lw30/k0$b;", "mimeType", "", "n", "Ljava/lang/Iterable;", "()Ljava/lang/Iterable;", "retryResponseCodes", "o", "a", "headers", "p", "setPostHeaders", "(Ljava/util/Map;)V", "postHeaders", "", "()[B", "postBodyBytes", ImagesContract.URL, "q", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class l extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k0.a method;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String baseUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<String, ?> params;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Options options;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AppInfo appInfo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String apiVersion;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String sdkVersion;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldCache;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String query;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final c0.b headersFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k0.b mimeType;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Iterable<Integer> retryResponseCodes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> headers;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Map<String, String> postHeaders;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016¨\u0006\u0017"}, d2 = {"Lw30/l$b;", "", "Lo30/c;", "appInfo", "", "apiVersion", "sdkVersion", "<init>", "(Lo30/c;Ljava/lang/String;Ljava/lang/String;)V", ImagesContract.URL, "Lw30/l$c;", "options", "", "params", "", "shouldCache", "Lw30/l;", "a", "(Ljava/lang/String;Lw30/l$c;Ljava/util/Map;Z)Lw30/l;", "c", "Lo30/c;", "b", "Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final AppInfo appInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String apiVersion;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String sdkVersion;

        public b() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ l b(b bVar, String str, Options options, Map map, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return bVar.a(str, options, map, z11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ l d(b bVar, String str, Options options, Map map, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = null;
            }
            if ((i11 & 8) != 0) {
                z11 = false;
            }
            return bVar.c(str, options, map, z11);
        }

        public final l a(String url, Options options, Map<String, ?> params, boolean shouldCache) {
            p013kotlin.jvm.internal.s.k(url, "url");
            p013kotlin.jvm.internal.s.k(options, "options");
            return new l(k0.a.GET, url, params, options, this.appInfo, this.apiVersion, this.sdkVersion, shouldCache);
        }

        public final l c(String url, Options options, Map<String, ?> params, boolean shouldCache) {
            p013kotlin.jvm.internal.s.k(url, "url");
            p013kotlin.jvm.internal.s.k(options, "options");
            return new l(k0.a.POST, url, params, options, this.appInfo, this.apiVersion, this.sdkVersion, shouldCache);
        }

        public b(AppInfo cVar, String apiVersion, String sdkVersion) {
            p013kotlin.jvm.internal.s.k(apiVersion, "apiVersion");
            p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
            this.appInfo = cVar;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
        }

        public /* synthetic */ b(AppInfo cVar, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : cVar, (i11 & 2) != 0 ? ApiVersion.INSTANCE.a().b() : str, (i11 & 4) != 0 ? "AndroidBindings/20.52.3" : str2);
        }
    }

    public l(k0.a method, String baseUrl, Map<String, ?> map, Options options, AppInfo cVar, String apiVersion, String sdkVersion, boolean z11) {
        p013kotlin.jvm.internal.s.k(method, "method");
        p013kotlin.jvm.internal.s.k(baseUrl, "baseUrl");
        p013kotlin.jvm.internal.s.k(options, "options");
        p013kotlin.jvm.internal.s.k(apiVersion, "apiVersion");
        p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
        this.method = method;
        this.baseUrl = baseUrl;
        this.params = map;
        this.options = options;
        this.appInfo = cVar;
        this.apiVersion = apiVersion;
        this.sdkVersion = sdkVersion;
        this.shouldCache = z11;
        this.query = y.f120698a.c(map);
        c0.b bVar = new c0.b(options, cVar, null, apiVersion, sdkVersion, 4, null);
        this.headersFactory = bVar;
        this.mimeType = k0.b.Form;
        this.retryResponseCodes = w.a();
        this.headers = bVar.b();
        this.postHeaders = bVar.c();
    }

    private final byte[] i() throws InvalidRequestException {
        try {
            byte[] bytes = this.query.getBytes(p013kotlin.text.d.UTF_8);
            p013kotlin.jvm.internal.s.j(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e11) {
            throw new InvalidRequestException(null, null, 0, "Unable to encode parameters to " + p013kotlin.text.d.UTF_8.name() + ". Please contact support@stripe.com for assistance.", e11, 7, null);
        }
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
    public Map<String, String> c() {
        return this.postHeaders;
    }

    @Override // w30.k0
    public Iterable<Integer> d() {
        return this.retryResponseCodes;
    }

    @Override // w30.k0
    /* JADX INFO: renamed from: e, reason: from getter */
    public boolean getShouldCache() {
        return this.shouldCache;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return this.method == lVar.method && p013kotlin.jvm.internal.s.f(this.baseUrl, lVar.baseUrl) && p013kotlin.jvm.internal.s.f(this.params, lVar.params) && p013kotlin.jvm.internal.s.f(this.options, lVar.options) && p013kotlin.jvm.internal.s.f(this.appInfo, lVar.appInfo) && p013kotlin.jvm.internal.s.f(this.apiVersion, lVar.apiVersion) && p013kotlin.jvm.internal.s.f(this.sdkVersion, lVar.sdkVersion) && this.shouldCache == lVar.shouldCache;
    }

    @Override // w30.k0
    /* JADX INFO: renamed from: f */
    public String getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String() {
        if (k0.a.GET != getMethod() && k0.a.DELETE != getMethod()) {
            return this.baseUrl;
        }
        String str = this.baseUrl;
        String str2 = this.query;
        if (str2.length() <= 0) {
            str2 = null;
        }
        List listR = p013kotlin.collections.v.r(str, str2);
        String str3 = this.baseUrl;
        String str4 = CallerData.NA;
        if (p013kotlin.text.t.h0(str3, CallerData.NA, false, 2, null)) {
            str4 = "&";
        }
        return p013kotlin.collections.v.y0(listR, str4, null, null, 0, null, null, 62, null);
    }

    @Override // w30.k0
    public void g(OutputStream outputStream) throws IOException {
        p013kotlin.jvm.internal.s.k(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public int hashCode() {
        int iHashCode = ((this.method.hashCode() * 31) + this.baseUrl.hashCode()) * 31;
        Map<String, ?> map = this.params;
        int iHashCode2 = (((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + this.options.hashCode()) * 31;
        AppInfo cVar = this.appInfo;
        return ((((((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.apiVersion.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + Boolean.hashCode(this.shouldCache);
    }

    public String toString() {
        return getMethod().getCode() + " " + this.baseUrl;
    }

    /* JADX INFO: renamed from: w30.l$c, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0017\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b#\u0010\u000fR\u0011\u0010&\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lw30/l$c;", "Landroid/os/Parcelable;", "", "apiKey", "stripeAccount", "idempotencyKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "publishableKeyProvider", "stripeAccountIdProvider", "(Lwn0/a;Lwn0/a;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lw30/l$c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "b", "g", "f", "e", "()Z", "apiKeyIsUserKey", DateTokenConverter.CONVERTER_KEY, "apiKeyIsLiveMode", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Options implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String apiKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stripeAccount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String idempotencyKey;
        public static final Parcelable.Creator<Options> CREATOR = new b();

        /* JADX INFO: renamed from: w30.l$c$b */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Options> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Options createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Options(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Options[] newArray(int i11) {
                return new Options[i11];
            }
        }

        public Options(String apiKey, String str, String str2) {
            p013kotlin.jvm.internal.s.k(apiKey, "apiKey");
            this.apiKey = apiKey;
            this.stripeAccount = str;
            this.idempotencyKey = str2;
            new o30.a().b(apiKey);
        }

        public static /* synthetic */ Options b(Options options, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = options.apiKey;
            }
            if ((i11 & 2) != 0) {
                str2 = options.stripeAccount;
            }
            if ((i11 & 4) != 0) {
                str3 = options.idempotencyKey;
            }
            return options.a(str, str2, str3);
        }

        public final Options a(String apiKey, String stripeAccount, String idempotencyKey) {
            p013kotlin.jvm.internal.s.k(apiKey, "apiKey");
            return new Options(apiKey, stripeAccount, idempotencyKey);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getApiKey() {
            return this.apiKey;
        }

        public final boolean d() {
            return !p013kotlin.text.t.h0(this.apiKey, "test", false, 2, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean e() {
            return p013kotlin.text.t.b0(this.apiKey, "uk_", false, 2, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return p013kotlin.jvm.internal.s.f(this.apiKey, options.apiKey) && p013kotlin.jvm.internal.s.f(this.stripeAccount, options.stripeAccount) && p013kotlin.jvm.internal.s.f(this.idempotencyKey, options.idempotencyKey);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getStripeAccount() {
            return this.stripeAccount;
        }

        public int hashCode() {
            int iHashCode = this.apiKey.hashCode() * 31;
            String str = this.stripeAccount;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.idempotencyKey;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Options(apiKey=" + this.apiKey + ", stripeAccount=" + this.stripeAccount + ", idempotencyKey=" + this.idempotencyKey + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            p013kotlin.jvm.internal.s.k(parcel, "out");
            parcel.writeString(this.apiKey);
            parcel.writeString(this.stripeAccount);
            parcel.writeString(this.idempotencyKey);
        }

        public /* synthetic */ Options(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Options(wn0.a<String> publishableKeyProvider, wn0.a<String> stripeAccountIdProvider) {
            this(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke(), null, 4, null);
            p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
            p013kotlin.jvm.internal.s.k(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }
}
