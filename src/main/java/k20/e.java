package k20;

import android.net.Uri;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b$\u0018\u0000 52\u00020\u00012\u00020\u0002:\u0001\nB\u001b\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0010¢\u0006\u0004\b\u0007\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R$\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R(\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u00101\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u00102\"\u0004\b.\u00103R$\u0010\u0006\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u00104\"\u0004\b5\u00106R(\u0010:\u001a\u0004\u0018\u00010\u00172\b\u00101\u001a\u0004\u0018\u00010\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u00107\"\u0004\b8\u00109R(\u0010>\u001a\u0004\u0018\u00010\u001b2\b\u00101\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010;\"\u0004\b<\u0010=R(\u0010@\u001a\u0004\u0018\u00010\u00032\b\u00101\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u00102\"\u0004\b?\u00103R(\u0010D\u001a\u0004\u0018\u00010!2\b\u00101\u001a\u0004\u0018\u00010!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010A\"\u0004\bB\u0010CR(\u0010H\u001a\u0004\u0018\u00010%2\b\u00101\u001a\u0004\u0018\u00010%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010E\"\u0004\bF\u0010GR(\u0010L\u001a\u0004\u0018\u00010)2\b\u00101\u001a\u0004\u0018\u00010)8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010I\"\u0004\bJ\u0010KR@\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010-2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010-8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010M\"\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lk20/e;", "", "Lk20/a;", "", "endpoint", "Lq20/c;", "method", "<init>", "(Ljava/lang/String;Lq20/c;)V", "()V", "a", "Lk20/e;", "getSourceConfig$snowplow_android_tracker_release", "()Lk20/e;", "m", "(Lk20/e;)V", "sourceConfig", "b", "Ljava/lang/String;", "_endpoint", "c", "Lq20/c;", "_method", "Lq20/g;", DateTokenConverter.CONVERTER_KEY, "Lq20/g;", "_protocol", "Lq20/d;", "e", "Lq20/d;", "_networkConnection", "f", "_customPostPath", "", "g", "Ljava/lang/Integer;", "_timeout", "Lokhttp3/OkHttpClient;", "h", "Lokhttp3/OkHttpClient;", "_okHttpClient", "Lokhttp3/CookieJar;", IntegerTokenConverter.CONVERTER_KEY, "Lokhttp3/CookieJar;", "_okHttpCookieJar", "", "j", "Ljava/util/Map;", "_requestHeaders", "value", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "()Lq20/c;", "k", "(Lq20/c;)V", "()Lq20/g;", "l", "(Lq20/g;)V", "protocol", "()Lq20/d;", "setNetworkConnection", "(Lq20/d;)V", "networkConnection", "setCustomPostPath", "customPostPath", "()Ljava/lang/Integer;", "setTimeout", "(Ljava/lang/Integer;)V", "timeout", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "okHttpClient", "()Lokhttp3/CookieJar;", "setOkHttpCookieJar", "(Lokhttp3/CookieJar;)V", "okHttpCookieJar", "()Ljava/util/Map;", "setRequestHeaders", "(Ljava/util/Map;)V", "requestHeaders", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f84664l = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private e sourceConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String _endpoint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private q20.c _method;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private q20.g _protocol;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private q20.d _networkConnection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String _customPostPath;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Integer _timeout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private OkHttpClient _okHttpClient;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private CookieJar _okHttpCookieJar;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Map<String, String> _requestHeaders;

    public e(String endpoint, q20.c method) {
        s.k(endpoint, "endpoint");
        s.k(method, "method");
        k(method);
        String scheme = Uri.parse(endpoint).getScheme();
        if (scheme == null) {
            l(q20.g.HTTPS);
            j("https://" + endpoint);
            return;
        }
        if (s.f(scheme, "https")) {
            l(q20.g.HTTPS);
            j(endpoint);
        } else {
            if (s.f(scheme, "http")) {
                l(q20.g.HTTP);
                j(endpoint);
                return;
            }
            l(q20.g.HTTPS);
            j("https://" + endpoint);
        }
    }

    public String a() {
        String str = this._customPostPath;
        if (str != null) {
            return str;
        }
        e eVar = this.sourceConfig;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public String b() {
        String str = this._endpoint;
        if (str != null) {
            return str;
        }
        e eVar = this.sourceConfig;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public q20.c c() {
        q20.c cVar = this._method;
        if (cVar != null) {
            return cVar;
        }
        e eVar = this.sourceConfig;
        q20.c cVarC = eVar != null ? eVar.c() : null;
        return cVarC == null ? z10.d.f126471a.h() : cVarC;
    }

    public q20.d d() {
        q20.d dVar = this._networkConnection;
        if (dVar != null) {
            return dVar;
        }
        e eVar = this.sourceConfig;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public OkHttpClient e() {
        OkHttpClient okHttpClient = this._okHttpClient;
        if (okHttpClient != null) {
            return okHttpClient;
        }
        e eVar = this.sourceConfig;
        if (eVar != null) {
            return eVar.e();
        }
        return null;
    }

    public CookieJar f() {
        CookieJar cookieJar = this._okHttpCookieJar;
        if (cookieJar != null) {
            return cookieJar;
        }
        e eVar = this.sourceConfig;
        if (eVar != null) {
            return eVar.f();
        }
        return null;
    }

    public q20.g g() {
        q20.g gVar = this._protocol;
        if (gVar != null) {
            return gVar;
        }
        e eVar = this.sourceConfig;
        q20.g gVarG = eVar != null ? eVar.g() : null;
        return gVarG == null ? z10.d.f126471a.i() : gVarG;
    }

    public Map<String, String> h() {
        Map<String, String> map = this._requestHeaders;
        if (map != null) {
            return map;
        }
        e eVar = this.sourceConfig;
        if (eVar != null) {
            return eVar.h();
        }
        return null;
    }

    public Integer i() {
        Integer num = this._timeout;
        if (num != null) {
            return num;
        }
        e eVar = this.sourceConfig;
        Integer numI = eVar != null ? eVar.i() : null;
        return numI == null ? Integer.valueOf(z10.d.f126471a.e()) : numI;
    }

    public void j(String str) {
        this._endpoint = str;
    }

    public void k(q20.c value) {
        s.k(value, "value");
        this._method = value;
    }

    public void l(q20.g gVar) {
        this._protocol = gVar;
    }

    public final void m(e eVar) {
        this.sourceConfig = eVar;
    }

    public e() {
    }
}
