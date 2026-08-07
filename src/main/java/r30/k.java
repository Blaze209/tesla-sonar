package r30;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000eB+\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001f"}, d2 = {"Lr30/k;", "", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "packageName", "versionName", "timeZone", "<init>", "(Landroid/util/DisplayMetrics;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "", "a", "()Ljava/util/Map;", "Lr30/d;", "fraudDetectionData", "c", "(Lr30/d;)Ljava/util/Map;", "value", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/util/Map;", "b", "Landroid/util/DisplayMetrics;", "Ljava/lang/String;", "e", AnalyticsContext.Screen, "f", "androidVersionString", "g", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f106959g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DisplayMetrics displayMetrics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String versionName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String timeZone;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String screen;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String androidVersionString;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lr30/k$a;", "", "<init>", "()V", "", "b", "()Ljava/lang/String;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b() {
            int iConvert = (int) TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
            if (iConvert % 60 == 0) {
                return String.valueOf(iConvert / 60);
            }
            String string = new BigDecimal(iConvert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            s.j(string, "toString(...)");
            return string;
        }

        private a() {
        }
    }

    public k(DisplayMetrics displayMetrics, String packageName, String str, String timeZone) {
        s.k(displayMetrics, "displayMetrics");
        s.k(packageName, "packageName");
        s.k(timeZone, "timeZone");
        this.displayMetrics = displayMetrics;
        this.packageName = packageName;
        this.versionName = str;
        this.timeZone = timeZone;
        this.screen = displayMetrics.widthPixels + "w_" + displayMetrics.heightPixels + "h_" + displayMetrics.densityDpi + "dpi";
        this.androidVersionString = "Android " + Build.VERSION.RELEASE + " " + Build.VERSION.CODENAME + " " + Build.VERSION.SDK_INT;
    }

    private final Map<String, Object> a() {
        String string = Locale.getDefault().toString();
        s.j(string, "toString(...)");
        return v0.m(x.a("c", d(string)), x.a(DateTokenConverter.CONVERTER_KEY, d(this.androidVersionString)), x.a("f", d(this.screen)), x.a("g", d(this.timeZone)));
    }

    private final Map<String, Object> c(FraudDetectionData fraudDetectionData) {
        String muid = fraudDetectionData != null ? fraudDetectionData.getMuid() : null;
        if (muid == null) {
            muid = "";
        }
        Pair pairA = x.a(DateTokenConverter.CONVERTER_KEY, muid);
        String sid = fraudDetectionData != null ? fraudDetectionData.getSid() : null;
        Map mapM = v0.m(pairA, x.a("e", sid != null ? sid : ""), x.a("k", this.packageName), x.a("o", Build.VERSION.RELEASE), x.a("p", Integer.valueOf(Build.VERSION.SDK_INT)), x.a("q", Build.MANUFACTURER), x.a("r", Build.BRAND), x.a("s", Build.MODEL), x.a("t", Build.TAGS));
        String str = this.versionName;
        Map mapF = str != null ? v0.f(x.a("l", str)) : null;
        if (mapF == null) {
            mapF = v0.i();
        }
        return v0.r(mapM, mapF);
    }

    private final Map<String, Object> d(String value) {
        return v0.f(x.a("v", value));
    }

    public final /* synthetic */ Map b(FraudDetectionData fraudDetectionData) {
        return v0.m(x.a("v2", 1), x.a("tag", "20.52.3"), x.a("src", "android-sdk"), x.a("a", a()), x.a("b", c(fraudDetectionData)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context) {
        s.k(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        s.j(displayMetrics, "getDisplayMetrics(...)");
        String packageName = context.getPackageName();
        packageName = packageName == null ? "" : packageName;
        PackageInfo packageInfoA = z30.a.f126806a.a(context);
        this(displayMetrics, packageName, packageInfoA != null ? packageInfoA.versionName : null, f106959g.b());
    }
}
