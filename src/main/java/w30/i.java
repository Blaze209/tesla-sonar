package w30;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0015B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00042\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lw30/i;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "clientId", "origin", "pluginType", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "c", "()Ljava/util/Map;", "", "b", "()Ljava/lang/CharSequence;", "eventName", "additionalParams", "", "includeSDKParams", "Lw30/g;", "a", "(Ljava/lang/String;Ljava/util/Map;Z)Lw30/g;", "Ljava/lang/String;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "appContext", "e", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String clientId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String origin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String pluginType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    public i(Context context, String clientId, String origin, String pluginType) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(clientId, "clientId");
        p013kotlin.jvm.internal.s.k(origin, "origin");
        p013kotlin.jvm.internal.s.k(pluginType, "pluginType");
        this.clientId = clientId;
        this.origin = origin;
        this.pluginType = pluginType;
        this.appContext = context.getApplicationContext();
    }

    private final CharSequence b() {
        ApplicationInfo applicationInfo;
        z30.a aVar = z30.a.f126806a;
        Context appContext = this.appContext;
        p013kotlin.jvm.internal.s.j(appContext, "appContext");
        PackageInfo packageInfoA = aVar.a(appContext);
        CharSequence charSequence = null;
        CharSequence charSequenceLoadLabel = (packageInfoA == null || (applicationInfo = packageInfoA.applicationInfo) == null) ? null : applicationInfo.loadLabel(this.appContext.getPackageManager());
        if (charSequenceLoadLabel != null && !p013kotlin.text.t.y0(charSequenceLoadLabel)) {
            charSequence = charSequenceLoadLabel;
        }
        if (charSequence != null) {
            return charSequence;
        }
        String packageName = this.appContext.getPackageName();
        p013kotlin.jvm.internal.s.j(packageName, "getPackageName(...)");
        return packageName;
    }

    private final Map<String, Object> c() {
        Pair pairA = jn0.x.a("os_version", Integer.valueOf(Build.VERSION.SDK_INT));
        Pair pairA2 = jn0.x.a("sdk_platform", "android");
        Pair pairA3 = jn0.x.a("sdk_version", "20.52.3");
        Pair pairA4 = jn0.x.a("device_type", Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL);
        Pair pairA5 = jn0.x.a("app_name", b());
        z30.a aVar = z30.a.f126806a;
        Context appContext = this.appContext;
        p013kotlin.jvm.internal.s.j(appContext, "appContext");
        PackageInfo packageInfoA = aVar.a(appContext);
        return v0.m(pairA, pairA2, pairA3, pairA4, pairA5, jn0.x.a("app_version", packageInfoA != null ? Integer.valueOf(packageInfoA.versionCode) : null), jn0.x.a(AnalyticsAttribute.PluginType, this.pluginType), jn0.x.a("platform_info", v0.f(jn0.x.a("package_name", this.appContext.getPackageName()))));
    }

    public final AnalyticsRequestV2 a(String eventName, Map<String, ? extends Object> additionalParams, boolean includeSDKParams) {
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(additionalParams, "additionalParams");
        AnalyticsRequestV2.Companion companion = AnalyticsRequestV2.INSTANCE;
        String str = this.clientId;
        String str2 = this.origin;
        if (includeSDKParams) {
            additionalParams = v0.r(additionalParams, c());
        }
        return companion.a(eventName, str, str2, additionalParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(Context context, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 8) != 0 && (str3 = z30.f.f126810a.a()) == null) {
            str3 = "native";
        }
        this(context, str, str2, str3);
    }
}
