package h20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b-\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u0005\u0010\u001e\"\u0004\b#\u0010 R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\"\u00102\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0006\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR\"\u00109\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b8\u0010\nR\"\u0010<\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b:\u0010\b\"\u0004\b;\u0010\nR\"\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0006\u001a\u0004\b=\u0010\b\"\u0004\b>\u0010\nR\"\u0010A\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0006\u001a\u0004\b&\u0010\b\"\u0004\b@\u0010\nR\"\u0010D\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\u0006\u001a\u0004\b\"\u0010\b\"\u0004\bC\u0010\nR\"\u0010G\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u0006\u001a\u0004\b7\u0010\b\"\u0004\bF\u0010\nR\"\u0010I\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0006\u001a\u0004\bE\u0010\b\"\u0004\bH\u0010\nR\"\u0010K\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0006\u001a\u0004\bB\u0010\b\"\u0004\bJ\u0010\nR\"\u0010N\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u0006\u001a\u0004\b3\u0010\b\"\u0004\bM\u0010\nR\"\u0010Q\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u0006\u001a\u0004\bL\u0010\b\"\u0004\bP\u0010\n¨\u0006R"}, d2 = {"Lh20/q;", "", "<init>", "()V", "", "b", "Z", "c", "()Z", "setBase64Encoded", "(Z)V", "base64Encoded", "Ls20/a;", "Ls20/a;", "e", "()Ls20/a;", "setDevicePlatform", "(Ls20/a;)V", "devicePlatform", "Ls20/c;", DateTokenConverter.CONVERTER_KEY, "Ls20/c;", "l", "()Ls20/c;", "setLogLevel", "(Ls20/c;)V", "logLevel", "", "J", "h", "()J", "setForegroundTimeout", "(J)V", "foregroundTimeout", "f", "setBackgroundTimeout", "backgroundTimeout", "Ljava/util/concurrent/TimeUnit;", "g", "Ljava/util/concurrent/TimeUnit;", "r", "()Ljava/util/concurrent/TimeUnit;", "setTimeUnit", "(Ljava/util/concurrent/TimeUnit;)V", "timeUnit", "q", "setSessionContext", "sessionContext", IntegerTokenConverter.CONVERTER_KEY, "setGeoLocationContext", "geoLocationContext", "j", "m", "setPlatformContext", "platformContext", "k", "setDeepLinkContext", "deepLinkContext", "n", "setScreenContext", "screenContext", "a", "setApplicationContext", "applicationContext", "setExceptionAutotracking", "exceptionAutotracking", "o", "setDiagnosticAutotracking", "diagnosticAutotracking", "p", "setLifecycleAutotracking", "lifecycleAutotracking", "setScreenViewAutotracking", "screenViewAutotracking", "setScreenEngagementAutotracking", "screenEngagementAutotracking", "s", "setInstallAutotracking", "installAutotracking", "t", "setUserAnonymisation", "userAnonymisation", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static boolean geoLocationContext;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static boolean diagnosticAutotracking;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static boolean userAnonymisation;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f70530a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean base64Encoded = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static s20.a devicePlatform = s20.a.Mobile;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static s20.c logLevel = s20.c.OFF;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static long foregroundTimeout = 1800;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static long backgroundTimeout = 1800;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static TimeUnit timeUnit = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static boolean sessionContext = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static boolean platformContext = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static boolean deepLinkContext = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static boolean screenContext = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static boolean applicationContext = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static boolean exceptionAutotracking = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static boolean lifecycleAutotracking = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static boolean screenViewAutotracking = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static boolean screenEngagementAutotracking = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static boolean installAutotracking = true;

    private q() {
    }

    public final boolean a() {
        return applicationContext;
    }

    public final long b() {
        return backgroundTimeout;
    }

    public final boolean c() {
        return base64Encoded;
    }

    public final boolean d() {
        return deepLinkContext;
    }

    public final s20.a e() {
        return devicePlatform;
    }

    public final boolean f() {
        return diagnosticAutotracking;
    }

    public final boolean g() {
        return exceptionAutotracking;
    }

    public final long h() {
        return foregroundTimeout;
    }

    public final boolean i() {
        return geoLocationContext;
    }

    public final boolean j() {
        return installAutotracking;
    }

    public final boolean k() {
        return lifecycleAutotracking;
    }

    public final s20.c l() {
        return logLevel;
    }

    public final boolean m() {
        return platformContext;
    }

    public final boolean n() {
        return screenContext;
    }

    public final boolean o() {
        return screenEngagementAutotracking;
    }

    public final boolean p() {
        return screenViewAutotracking;
    }

    public final boolean q() {
        return sessionContext;
    }

    public final TimeUnit r() {
        return timeUnit;
    }

    public final boolean s() {
        return userAnonymisation;
    }
}
