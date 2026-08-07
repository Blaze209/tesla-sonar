package w30;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.inject.Provider;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 \u001d2\u00020\u0001:\u0001 BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J!\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0010H\u0000¢\u0006\u0004\b\u001f\u0010\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006("}, d2 = {"Lw30/e;", "", "Landroid/content/pm/PackageManager;", "packageManager", "Landroid/content/pm/PackageInfo;", "packageInfo", "", "packageName", "Ljavax/inject/Provider;", "publishableKeyProvider", "networkTypeProvider", "pluginTypeProvider", "<init>", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "Lw30/a;", "event", "", "f", "(Lw30/a;)Ljava/util/Map;", "j", "l", "()Ljava/util/Map;", IntegerTokenConverter.CONVERTER_KEY, "k", "", "h", "(Landroid/content/pm/PackageInfo;Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;", "additionalParams", "Lw30/b;", "g", "(Lw30/a;Ljava/util/Map;)Lw30/b;", "e", "a", "Landroid/content/pm/PackageManager;", "b", "Landroid/content/pm/PackageInfo;", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljavax/inject/Provider;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class e {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile UUID f120585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f120586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Provider<String> f120587j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PackageManager packageManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PackageInfo packageInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Provider<String> publishableKeyProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Provider<String> networkTypeProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Provider<String> pluginTypeProvider;

    /* JADX INFO: renamed from: w30.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lw30/e$a;", "", "<init>", "()V", "Ljava/util/UUID;", "id", "Ljn0/h0;", "b", "(Ljava/util/UUID;)V", "<set-?>", "sessionId", "Ljava/util/UUID;", "a", "()Ljava/util/UUID;", "", "ANALYTICS_NAME", "Ljava/lang/String;", "ANALYTICS_PREFIX", "ANALYTICS_UA", "ANALYTICS_VERSION", "DEVICE_TYPE", "Ljavax/inject/Provider;", "PLUGIN_TYPE_PROVIDER", "Ljavax/inject/Provider;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UUID a() {
            return e.f120585h;
        }

        public final void b(UUID id2) {
            p013kotlin.jvm.internal.s.k(id2, "id");
            e.f120585h = id2;
        }

        private Companion() {
        }
    }

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        p013kotlin.jvm.internal.s.j(uuidRandomUUID, "randomUUID(...)");
        f120585h = uuidRandomUUID;
        f120586i = Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL;
        f120587j = new Provider() { // from class: w30.d
            @Override // javax.inject.Provider
            public final Object get() {
                return e.b();
            }
        };
    }

    public e(PackageManager packageManager, PackageInfo packageInfo, String packageName, Provider<String> publishableKeyProvider, Provider<String> networkTypeProvider, Provider<String> pluginTypeProvider) {
        p013kotlin.jvm.internal.s.k(packageName, "packageName");
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(networkTypeProvider, "networkTypeProvider");
        p013kotlin.jvm.internal.s.k(pluginTypeProvider, "pluginTypeProvider");
        this.packageManager = packageManager;
        this.packageInfo = packageInfo;
        this.packageName = packageName;
        this.publishableKeyProvider = publishableKeyProvider;
        this.networkTypeProvider = networkTypeProvider;
        this.pluginTypeProvider = pluginTypeProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String b() {
        return z30.f.f126810a.a();
    }

    private final Map<String, Object> f(a event) {
        return v0.r(v0.r(l(), e()), j(event));
    }

    private final CharSequence h(PackageInfo packageInfo, PackageManager packageManager) {
        ApplicationInfo applicationInfo;
        CharSequence charSequence = null;
        CharSequence charSequenceLoadLabel = (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? null : applicationInfo.loadLabel(packageManager);
        if (charSequenceLoadLabel != null && !p013kotlin.text.t.y0(charSequenceLoadLabel)) {
            charSequence = charSequenceLoadLabel;
        }
        return charSequence == null ? this.packageName : charSequence;
    }

    private final Map<String, String> i() {
        String str = this.networkTypeProvider.get();
        return str == null ? v0.i() : v0.f(jn0.x.a("network_type", str));
    }

    private final Map<String, String> j(a aVar) {
        return v0.f(jn0.x.a("event", aVar.getEventName()));
    }

    private final Map<String, String> k() {
        Map<String, String> mapF;
        String str = this.pluginTypeProvider.get();
        return (str == null || (mapF = v0.f(jn0.x.a(AnalyticsAttribute.PluginType, str))) == null) ? v0.i() : mapF;
    }

    private final Map<String, Object> l() {
        Object objB;
        Pair pairA = jn0.x.a("analytics_ua", "analytics.stripe_android-1.0");
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(this.publishableKeyProvider.get());
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = "pk_undefined";
        }
        return v0.r(v0.r(v0.m(pairA, jn0.x.a("publishable_key", objB), jn0.x.a("os_name", Build.VERSION.CODENAME), jn0.x.a("os_release", Build.VERSION.RELEASE), jn0.x.a("os_version", Integer.valueOf(Build.VERSION.SDK_INT)), jn0.x.a("device_type", f120586i), jn0.x.a("bindings_version", "20.52.3"), jn0.x.a("is_development", Boolean.FALSE), jn0.x.a("session_id", f120585h), jn0.x.a("locale", Locale.getDefault().toString())), i()), k());
    }

    public final Map<String, Object> e() {
        PackageInfo packageInfo;
        PackageManager packageManager = this.packageManager;
        return (packageManager == null || (packageInfo = this.packageInfo) == null) ? v0.i() : v0.m(jn0.x.a("app_name", h(packageInfo, packageManager)), jn0.x.a("app_version", Integer.valueOf(this.packageInfo.versionCode)));
    }

    public final AnalyticsRequest g(a event, Map<String, ? extends Object> additionalParams) {
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(additionalParams, "additionalParams");
        return new AnalyticsRequest(v0.r(f(event), additionalParams), c0.a.f120567d.b());
    }

    public /* synthetic */ e(PackageManager packageManager, PackageInfo packageInfo, String str, Provider provider, Provider provider2, Provider provider3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, packageInfo, str, provider, provider2, (i11 & 32) != 0 ? f120587j : provider3);
    }
}
