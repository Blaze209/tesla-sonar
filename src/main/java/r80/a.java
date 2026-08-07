package r80;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.stripe3ds2.transaction.o;
import ezvcard.property.Kind;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0016\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0003-/\u001dBU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010$\u001a\u00020 H\u0001¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0013H\u0001¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00132\u0006\u0010$\u001a\u00020 H\u0001¢\u0006\u0004\b*\u0010'J\u000f\u0010+\u001a\u00020\fH\u0001¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00104R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00104R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105¨\u00066"}, d2 = {"Lr80/a;", "Lr80/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr80/a$b;", "config", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lcom/stripe/android/stripe3ds2/transaction/o;", "logger", "Lr80/d;", "sentryConfig", "", AnalyticsAttribute.Environment, "localeCountry", "", "osVersion", "<init>", "(Landroid/content/Context;Lr80/a$b;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/o;Lr80/d;Ljava/lang/String;Ljava/lang/String;I)V", "Lorg/json/JSONObject;", "requestBody", "Ljn0/h0;", "k", "(Lorg/json/JSONObject;)V", "Ljavax/net/ssl/HttpsURLConnection;", "connection", "responseCode", "h", "(Ljavax/net/ssl/HttpsURLConnection;I)V", "c", "()Ljavax/net/ssl/HttpsURLConnection;", "j", "", "exception", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;)V", "t", "Y0", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;)Lorg/json/JSONObject;", "e", "()Lorg/json/JSONObject;", "f", "g", "()Ljava/lang/String;", "a", "Landroid/content/Context;", "b", "Lr80/a$b;", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/stripe3ds2/transaction/o;", "Lr80/d;", "Ljava/lang/String;", "I", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements r80.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final C2282a f107286i = new C2282a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f107287j = StandardCharsets.UTF_8.name();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b config;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o logger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final r80.d sentryConfig;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String environment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String localeCountry;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int osVersion;

    /* JADX INFO: renamed from: r80.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lr80/a$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "CHARSET", "Ljava/lang/String;", "CONTENT_TYPE", "HEADER_CONTENT_TYPE", "HEADER_SENTRY_AUTH", "HEADER_USER_AGENT", "HOST", "HTTP_METHOD", "USER_AGENT", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class C2282a {
        public /* synthetic */ C2282a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2282a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lr80/a$b;", "", "", "", "a", "()Ljava/util/Map;", "customTags", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        Map<String, String> a();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lr80/a$c;", "Lr80/a$b;", "<init>", "()V", "", "", "b", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "customTags", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f107296a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Map<String, String> customTags = v0.i();

        private c() {
        }

        @Override // r80.a.b
        public Map<String, String> a() {
            return customTags;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "", "a", "(Lkotlin/Pair;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements l<Pair<? extends String, ? extends String>, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f107298c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Pair<String, String> pair) {
            s.k(pair, "<name for destructuring parameter 0>");
            return pair.a() + "=" + pair.b();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$reportError$1", f = "DefaultErrorReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f107299n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f107300o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Throwable f107302q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Throwable th2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f107302q = th2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = a.this.new e(this.f107302q, continuation);
            eVar.f107300o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f107299n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            a aVar = a.this;
            Throwable th2 = this.f107302q;
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                aVar.k(aVar.d(th2));
                objB = jn0.s.b(h0.f84049a);
            } catch (Throwable th3) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th3));
            }
            a aVar2 = a.this;
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                aVar2.i(thE);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(Context context, b config, CoroutineContext workContext, o logger, r80.d sentryConfig, String environment, String localeCountry, int i11) {
        s.k(context, "context");
        s.k(config, "config");
        s.k(workContext, "workContext");
        s.k(logger, "logger");
        s.k(sentryConfig, "sentryConfig");
        s.k(environment, "environment");
        s.k(localeCountry, "localeCountry");
        this.context = context;
        this.config = config;
        this.workContext = workContext;
        this.logger = logger;
        this.sentryConfig = sentryConfig;
        this.environment = environment;
        this.localeCountry = localeCountry;
        this.osVersion = i11;
    }

    private final HttpsURLConnection c() throws ProtocolException {
        HttpsURLConnection httpsURLConnectionJ = j();
        httpsURLConnectionJ.setRequestMethod("POST");
        httpsURLConnectionJ.setDoOutput(true);
        for (Map.Entry entry : v0.m(x.a("Content-Type", "application/json; charset=utf-8"), x.a("User-Agent", "Android3ds2Sdk 6.1.8"), x.a("X-Sentry-Auth", g())).entrySet()) {
            httpsURLConnectionJ.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return httpsURLConnectionJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(Throwable exception) {
        this.logger.a("Failed to send error report.", exception);
    }

    private final HttpsURLConnection j() {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://errors.stripe.com/api/" + this.sentryConfig.b() + "/store/").openConnection());
        s.i(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) uRLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(JSONObject requestBody) throws IOException {
        HttpsURLConnection httpsURLConnectionC = c();
        OutputStream outputStream = httpsURLConnectionC.getOutputStream();
        try {
            s.h(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            s.j(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(requestBody.toString());
                outputStreamWriter.flush();
                h0 h0Var = h0.f84049a;
                sn0.b.a(outputStreamWriter, null);
                sn0.b.a(outputStream, null);
                httpsURLConnectionC.connect();
                h(httpsURLConnectionC, httpsURLConnectionC.getResponseCode());
                httpsURLConnectionC.disconnect();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(outputStreamWriter, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                sn0.b.a(outputStream, th4);
                throw th5;
            }
        }
    }

    @Override // r80.c
    public void Y0(Throwable t11) {
        s.k(t11, "t");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new e(t11, null), 3, null);
    }

    public final /* synthetic */ JSONObject d(Throwable t11) throws JSONException {
        s.k(t11, "t");
        JSONObject jSONObjectPut = new JSONObject().put("release", "com.stripe.android.stripe3ds2@6.1.8+25");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectPut2 = new JSONObject().put("type", t11.getClass().getCanonicalName());
        String message = t11.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject jSONObjectPut3 = jSONObjectPut.put("exception", jSONObject.put("values", jSONArray.put(jSONObjectPut2.put("value", message).put("stacktrace", f(t11)))));
        JSONObject jSONObjectPut4 = new JSONObject().put("locale", this.localeCountry).put(AnalyticsAttribute.Environment, this.environment).put("android_os_version", this.osVersion);
        for (Map.Entry<String, String> entry : this.config.a().entrySet()) {
            jSONObjectPut4.put(entry.getKey(), entry.getValue());
        }
        h0 h0Var = h0.f84049a;
        JSONObject jSONObjectPut5 = jSONObjectPut3.put("tags", jSONObjectPut4).put("contexts", e());
        s.j(jSONObjectPut5, "put(...)");
        return jSONObjectPut5;
    }

    public final /* synthetic */ JSONObject e() throws JSONException {
        Object objB;
        ApplicationInfo applicationInfo;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        PackageInfo packageInfo = (PackageInfo) objB;
        CharSequence charSequenceLoadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(this.context.getPackageManager());
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectPut = new JSONObject().put("app_identifier", this.context.getPackageName()).put("app_name", charSequenceLoadLabel);
        String str = packageInfo != null ? packageInfo.versionName : null;
        if (str == null) {
            str = "";
        }
        JSONObject jSONObjectPut2 = jSONObject.put("app", jSONObjectPut.put("app_version", str));
        JSONObject jSONObjectPut3 = new JSONObject().put("name", "Android").put("version", Build.VERSION.RELEASE);
        String str2 = Build.TYPE;
        JSONObject jSONObjectPut4 = jSONObjectPut2.put("os", jSONObjectPut3.put("type", str2).put("build", Build.DISPLAY));
        JSONObject jSONObjectPut5 = new JSONObject().put("model_id", Build.ID).put("model", Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str2);
        JSONArray jSONArray = new JSONArray();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        s.j(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        for (String str3 : SUPPORTED_ABIS) {
            jSONArray.put(str3);
        }
        h0 h0Var = h0.f84049a;
        JSONObject jSONObjectPut6 = jSONObjectPut4.put(Kind.DEVICE, jSONObjectPut5.put("archs", jSONArray));
        s.j(jSONObjectPut6, "put(...)");
        return jSONObjectPut6;
    }

    public final /* synthetic */ JSONObject f(Throwable t11) throws JSONException {
        s.k(t11, "t");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = t11.getStackTrace();
        s.j(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : n.c1(stackTrace)) {
            jSONArray.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        h0 h0Var = h0.f84049a;
        JSONObject jSONObjectPut = jSONObject.put("frames", jSONArray);
        s.j(jSONObjectPut, "put(...)");
        return jSONObjectPut;
    }

    public final /* synthetic */ String g() {
        return v.y0(v.p("Sentry", v.y0(v.p(x.a("sentry_key", this.sentryConfig.getKey()), x.a("sentry_version", this.sentryConfig.getVersion()), x.a("sentry_timestamp", this.sentryConfig.a()), x.a("sentry_client", "Android3ds2Sdk 6.1.8"), x.a("sentry_secret", this.sentryConfig.getSecret())), ", ", null, null, 0, null, d.f107298c, 30, null)), " ", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(Context context, b bVar, CoroutineContext coroutineContext, o oVar, r80.d dVar, String str, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        String country;
        b bVar2 = (i12 & 2) != 0 ? c.f107296a : bVar;
        CoroutineContext io2 = (i12 & 4) != 0 ? Dispatchers.getIO() : coroutineContext;
        o oVar2 = (i12 & 8) != 0 ? o.b.f54054b : oVar;
        r80.d dVar2 = (i12 & 16) != 0 ? r80.b.f107303a : dVar;
        String str3 = (i12 & 32) != 0 ? "release" : str;
        if ((i12 & 64) != 0) {
            country = Locale.getDefault().getCountry();
            s.j(country, "getCountry(...)");
        } else {
            country = str2;
        }
        this(context, bVar2, io2, oVar2, dVar2, str3, country, (i12 & 128) != 0 ? Build.VERSION.SDK_INT : i11);
    }

    private final void h(HttpsURLConnection connection, int responseCode) {
    }
}
