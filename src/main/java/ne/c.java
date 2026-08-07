package ne;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;
import jn0.m;
import jn0.x;
import me.Environment;
import okhttp3.OkHttpClient;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lne/c;", "", "<init>", "()V", "Lme/c;", AnalyticsAttribute.Environment, "Lne/a;", "b", "(Lme/c;)Lne/a;", "a", "", "", "Ljava/util/Map;", "defaultHeaders", "Lokhttp3/OkHttpClient;", "c", "Lkotlin/Lazy;", "()Lokhttp3/OkHttpClient;", "okHttpClient", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f93890a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, String> defaultHeaders = v0.f(x.a("Content-Type", "application/json"));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Lazy okHttpClient = m.b(a.f93893c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokhttp3/OkHttpClient;", "b", "()Lokhttp3/OkHttpClient;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<OkHttpClient> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f93893c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            return new OkHttpClient();
        }
    }

    private c() {
    }

    private final OkHttpClient c() {
        return (OkHttpClient) okHttpClient.getValue();
    }

    public final ne.a a(Environment environment) {
        s.k(environment, "environment");
        OkHttpClient okHttpClientC = c();
        String string = environment.getCheckoutAnalyticsBaseUrl().toString();
        s.j(string, "toString(...)");
        return new d(okHttpClientC, string, defaultHeaders);
    }

    public final ne.a b(Environment environment) {
        s.k(environment, "environment");
        OkHttpClient okHttpClientC = c();
        String string = environment.getCheckoutShopperBaseUrl().toString();
        s.j(string, "toString(...)");
        return new d(okHttpClientC, string, defaultHeaders);
    }
}
