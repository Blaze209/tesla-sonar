package jo;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u000f\"\u0004\b\u0012\u0010\u0016R\u001d\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00188F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0019¨\u0006\u001c"}, d2 = {"Ljo/d;", "", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "a", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "b", "Landroid/content/SharedPreferences;", "preferences", "", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "packageName", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map;", "_additionalOptionsForPackager", "host", "(Ljava/lang/String;)V", "debugServerHost", "", "()Ljava/util/Map;", "additionalOptionsForPackager", "e", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f84095e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f84096f = d.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences preferences;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> _additionalOptionsForPackager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Ljo/d$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "PREFS_DEBUG_SERVER_HOST_KEY", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(Context appContext) {
        s.k(appContext, "appContext");
        this.appContext = appContext;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(appContext);
        s.j(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.preferences = defaultSharedPreferences;
        String packageName = appContext.getPackageName();
        s.j(packageName, "getPackageName(...)");
        this.packageName = packageName;
        this._additionalOptionsForPackager = new LinkedHashMap();
    }

    public final Map<String, String> a() {
        return this._additionalOptionsForPackager;
    }

    public String b() {
        String string = this.preferences.getString("debug_http_host", null);
        if (string != null && string.length() > 0) {
            return string;
        }
        String strH = com.facebook.react.modules.systeminfo.a.h(this.appContext);
        if (s.f(strH, "localhost")) {
            qk.a.I(f84096f, "You seem to be running on device. Run '" + com.facebook.react.modules.systeminfo.a.b(this.appContext) + "' to forward the debug server's port to the device.");
        }
        return strH;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    public void d(String host) {
        s.k(host, "host");
        this.preferences.edit().putString("debug_http_host", host).apply();
    }
}
