package w30;

import android.os.Build;
import android.system.Os;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import o30.ApiVersion;
import o30.AppInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0005\u000b\u0006\b\n\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u0004¢\u0006\u0004\b\n\u0010\u0007R.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0007\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lw30/c0;", "", "<init>", "()V", "", "", "b", "()Ljava/util/Map;", "c", "", DateTokenConverter.CONVERTER_KEY, "a", "Ljava/util/Map;", "f", "setPostHeaders", "(Ljava/util/Map;)V", "postHeaders", "g", "()Ljava/lang/String;", "userAgent", "e", "extraHeaders", "h", "xStripeUserAgent", "Lw30/c0$a;", "Lw30/c0$c;", "Lw30/c0$e;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f120565c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Map<String, String> postHeaders;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0006R&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00138\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000f\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0006¨\u0006\u001a"}, d2 = {"Lw30/c0$a;", "Lw30/c0;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "g", "userAgent", "", "f", "Ljava/util/Map;", "()Ljava/util/Map;", "extraHeaders", "h", "xStripeUserAgent", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f120567d = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final String userAgent = c0.INSTANCE.b("AndroidBindings/20.52.3");

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Map<String, String> extraHeaders = v0.i();

        private a() {
            super(null);
        }

        @Override // w30.c0
        protected Map<String, String> e() {
            return extraHeaders;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        @Override // w30.c0
        /* JADX INFO: renamed from: g */
        protected String getUserAgent() {
            return userAgent;
        }

        @Override // w30.c0
        protected String h() {
            Map<String, String> mapD = d();
            ArrayList arrayList = new ArrayList(mapD.size());
            for (Map.Entry<String, String> entry : mapD.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + p013kotlin.collections.v.y0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }

        public int hashCode() {
            return -334358835;
        }

        public String toString() {
            return "Analytics";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001bR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010 ¨\u0006\""}, d2 = {"Lw30/c0$c;", "Lw30/c0;", "Lkotlin/Function0;", "Lw30/l$c;", "optionsProvider", "Lo30/c;", "appInfo", "Ljava/util/Locale;", "locale", "", "apiVersion", "sdkVersion", "<init>", "(Lwn0/a;Lo30/c;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "e", "Lo30/c;", "f", "Ljava/util/Locale;", "g", "Ljava/lang/String;", "h", "Lw30/h0;", IntegerTokenConverter.CONVERTER_KEY, "Lw30/h0;", "stripeClientUserAgentHeaderFactory", "()Ljava/lang/String;", "languageTag", "userAgent", "xStripeUserAgent", "", "()Ljava/util/Map;", "extraHeaders", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class c extends c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<l.Options> optionsProvider;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final AppInfo appInfo;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final Locale locale;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final String apiVersion;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final String sdkVersion;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final h0 stripeClientUserAgentHeaderFactory;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(wn0.a<l.Options> optionsProvider, AppInfo cVar, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            p013kotlin.jvm.internal.s.k(optionsProvider, "optionsProvider");
            p013kotlin.jvm.internal.s.k(locale, "locale");
            p013kotlin.jvm.internal.s.k(apiVersion, "apiVersion");
            p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
            this.optionsProvider = optionsProvider;
            this.appInfo = cVar;
            this.locale = locale;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
            this.stripeClientUserAgentHeaderFactory = new h0(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        }

        private final String i() {
            String languageTag = this.locale.toLanguageTag();
            p013kotlin.jvm.internal.s.h(languageTag);
            if (p013kotlin.text.t.y0(languageTag) || p013kotlin.jvm.internal.s.f(languageTag, "und")) {
                return null;
            }
            return languageTag;
        }

        @Override // w30.c0
        protected Map<String, String> e() {
            l.Options optionsInvoke = this.optionsProvider.invoke();
            Map mapR = v0.r(v0.r(v0.m(jn0.x.a("Accept", "application/json"), jn0.x.a("Stripe-Version", this.apiVersion), jn0.x.a("Authorization", "Bearer " + optionsInvoke.getApiKey())), this.stripeClientUserAgentHeaderFactory.a(this.appInfo)), optionsInvoke.e() ? v0.f(jn0.x.a("Stripe-Livemode", String.valueOf(!p013kotlin.jvm.internal.s.f(Os.getenv("Stripe-Livemode"), "false")))) : v0.i());
            String stripeAccount = optionsInvoke.getStripeAccount();
            Map mapF = stripeAccount != null ? v0.f(jn0.x.a("Stripe-Account", stripeAccount)) : null;
            if (mapF == null) {
                mapF = v0.i();
            }
            Map mapR2 = v0.r(mapR, mapF);
            String idempotencyKey = optionsInvoke.getIdempotencyKey();
            Map mapF2 = idempotencyKey != null ? v0.f(jn0.x.a("Idempotency-Key", idempotencyKey)) : null;
            if (mapF2 == null) {
                mapF2 = v0.i();
            }
            Map mapR3 = v0.r(mapR2, mapF2);
            String strI = i();
            Map mapF3 = strI != null ? v0.f(jn0.x.a("Accept-Language", strI)) : null;
            if (mapF3 == null) {
                mapF3 = v0.i();
            }
            return v0.r(mapR3, mapF3);
        }

        @Override // w30.c0
        /* JADX INFO: renamed from: g */
        protected String getUserAgent() {
            String strB = c0.INSTANCE.b(this.sdkVersion);
            AppInfo cVar = this.appInfo;
            return p013kotlin.collections.v.y0(p013kotlin.collections.v.r(strB, cVar != null ? cVar.c() : null), " ", null, null, 0, null, null, 62, null);
        }

        @Override // w30.c0
        protected String h() {
            Map<String, String> mapD = d();
            AppInfo cVar = this.appInfo;
            if (cVar != null) {
                mapD.putAll(cVar.b());
            }
            ArrayList arrayList = new ArrayList(mapD.size());
            for (Map.Entry<String, String> entry : mapD.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + p013kotlin.collections.v.y0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    /* JADX INFO: renamed from: w30.c0$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lw30/c0$d;", "", "<init>", "()V", "", "sdkVersion", "b", "(Ljava/lang/String;)Ljava/lang/String;", "CHARSET", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "KOTLIN", "LANG", "MODEL", "TYPE", "UNDETERMINED_LANGUAGE", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String c(Companion companion, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = "AndroidBindings/20.52.3";
            }
            return companion.b(str);
        }

        public final String a() {
            return c0.f120565c;
        }

        public final String b(String sdkVersion) {
            p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
            return "Stripe/v1 " + sdkVersion;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0011\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0017"}, d2 = {"Lw30/c0$e;", "Lw30/c0;", "", "guid", "<init>", "(Ljava/lang/String;)V", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "e", "()Ljava/util/Map;", "extraHeaders", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "userAgent", "f", "setPostHeaders", "(Ljava/util/Map;)V", "postHeaders", "h", "xStripeUserAgent", "a", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends c0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Map<String, String> extraHeaders;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String userAgent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Map<String, String> postHeaders;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String guid) {
            super(null);
            p013kotlin.jvm.internal.s.k(guid, "guid");
            this.extraHeaders = v0.f(jn0.x.a("Cookie", "m=" + guid));
            Companion companion = c0.INSTANCE;
            this.userAgent = companion.b("AndroidBindings/20.52.3");
            this.postHeaders = v0.f(jn0.x.a("Content-Type", k0.b.Json.getCode() + "; charset=" + companion.a()));
        }

        @Override // w30.c0
        protected Map<String, String> e() {
            return this.extraHeaders;
        }

        @Override // w30.c0
        protected Map<String, String> f() {
            return this.postHeaders;
        }

        @Override // w30.c0
        /* JADX INFO: renamed from: g, reason: from getter */
        protected String getUserAgent() {
            return this.userAgent;
        }

        @Override // w30.c0
        protected String h() {
            Map<String, String> mapD = d();
            ArrayList arrayList = new ArrayList(mapD.size());
            for (Map.Entry<String, String> entry : mapD.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            return "{" + p013kotlin.collections.v.y0(arrayList, ",", null, null, 0, null, null, 62, null) + "}";
        }
    }

    static {
        String strName = p013kotlin.text.d.UTF_8.name();
        p013kotlin.jvm.internal.s.j(strName, "name(...)");
        f120565c = strName;
    }

    public /* synthetic */ c0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Map<String, String> b() {
        return v0.r(e(), v0.m(jn0.x.a("User-Agent", getUserAgent()), jn0.x.a("Accept-Charset", f120565c), jn0.x.a("X-Stripe-User-Agent", h())));
    }

    public final Map<String, String> c() {
        return f();
    }

    protected final Map<String, String> d() {
        Pair pairA = jn0.x.a("lang", "kotlin");
        Pair pairA2 = jn0.x.a("bindings_version", "20.52.3");
        Pair pairA3 = jn0.x.a("os_version", String.valueOf(Build.VERSION.SDK_INT));
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        return v0.o(pairA, pairA2, pairA3, jn0.x.a("type", str + "_" + str2 + "_" + str3), jn0.x.a("model", str3));
    }

    protected abstract Map<String, String> e();

    protected Map<String, String> f() {
        return this.postHeaders;
    }

    /* JADX INFO: renamed from: g */
    protected abstract String getUserAgent();

    protected abstract String h();

    private c0() {
        this.postHeaders = v0.i();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\r8\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lw30/c0$b;", "Lw30/c0$c;", "Lw30/l$c;", "options", "Lo30/c;", "appInfo", "Ljava/util/Locale;", "locale", "", "apiVersion", "sdkVersion", "<init>", "(Lw30/l$c;Lo30/c;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "", "j", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "postHeaders", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends c {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Map<String, String> postHeaders;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lw30/l$c;", "b", "()Lw30/l$c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<l.Options> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l.Options f120571c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l.Options options) {
                super(0);
                this.f120571c = options;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l.Options invoke() {
                return this.f120571c;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(l.Options options, AppInfo cVar, Locale locale, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            AppInfo cVar2 = (i11 & 2) != 0 ? null : cVar;
            if ((i11 & 4) != 0) {
                locale = Locale.getDefault();
                p013kotlin.jvm.internal.s.j(locale, "getDefault(...)");
            }
            this(options, cVar2, locale, (i11 & 8) != 0 ? ApiVersion.INSTANCE.a().b() : str, (i11 & 16) != 0 ? "AndroidBindings/20.52.3" : str2);
        }

        @Override // w30.c0
        protected Map<String, String> f() {
            return this.postHeaders;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l.Options options, AppInfo cVar, Locale locale, String apiVersion, String sdkVersion) {
            super(new a(options), cVar, locale, apiVersion, sdkVersion);
            p013kotlin.jvm.internal.s.k(options, "options");
            p013kotlin.jvm.internal.s.k(locale, "locale");
            p013kotlin.jvm.internal.s.k(apiVersion, "apiVersion");
            p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
            this.postHeaders = v0.f(jn0.x.a("Content-Type", k0.b.Form.getCode() + "; charset=" + c0.INSTANCE.a()));
        }
    }
}
