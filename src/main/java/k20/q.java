package k20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import s20.PlatformContextRetriever;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b8\b\u0016\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0010¢\u0006\u0004\b\u0005\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0013J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u0013J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u0013J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0013R\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0018\u0010/\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010'R\u0018\u00107\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010'R\u0018\u0010;\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010'R\u0018\u0010=\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010'R\u0018\u0010?\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010'R\u0018\u0010A\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010'R\u0018\u0010C\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010'R\u0018\u0010E\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010'R\u0018\u0010G\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010'R\u0018\u0010I\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010'R\u0018\u0010K\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010'R\u0018\u0010M\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010'R\u0018\u0010O\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u001fR\u001e\u0010T\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020\u00038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010Z\"\u0004\b[\u0010\u0006R$\u0010`\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010\t\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u0010a\"\u0004\bb\u0010cR$\u0010e\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b1\u0010]\"\u0004\bd\u0010_R$\u0010\r\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010f\"\u0004\bg\u0010hR(\u0010l\u001a\u0004\u0018\u0001002\b\u0010Y\u001a\u0004\u0018\u0001008V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010i\"\u0004\bj\u0010kR$\u0010n\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bV\u0010]\"\u0004\bm\u0010_R$\u0010p\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010]\"\u0004\bo\u0010_R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bF\u0010]\"\u0004\bq\u0010_R$\u0010\u0014\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b<\u0010]\"\u0004\br\u0010_R$\u0010t\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010]\"\u0004\bs\u0010_R$\u0010v\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010]\"\u0004\bu\u0010_R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u0010]\"\u0004\bw\u0010_R$\u0010y\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bN\u0010]\"\u0004\bx\u0010_R$\u0010\u0018\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010]\"\u0004\bz\u0010_R$\u0010\u001a\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010]\"\u0004\b{\u0010_R$\u0010\u001c\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u0010]\"\u0004\b|\u0010_R$\u0010~\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b8\u0010]\"\u0004\b}\u0010_R&\u0010\u0081\u0001\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010]\"\u0005\b\u0080\u0001\u0010_R+\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00032\b\u0010Y\u001a\u0004\u0018\u00010\u00038V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010Z\"\u0005\b\u0083\u0001\u0010\u0006R8\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010P2\u000e\u0010Y\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010P8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\bH\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R,\u0010\u008c\u0001\u001a\u0004\u0018\u00010U2\b\u0010Y\u001a\u0004\u0018\u00010U8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0005\bJ\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, d2 = {"Lk20/q;", "", "Lk20/a;", "", "appId", "<init>", "(Ljava/lang/String;)V", "()V", "Ls20/a;", "devicePlatform", "b", "(Ls20/a;)Lk20/q;", "Ls20/c;", "logLevel", "C", "(Ls20/c;)Lk20/q;", "", "platformContext", "D", "(Z)Lk20/q;", "geoLocationContext", DateTokenConverter.CONVERTER_KEY, "screenViewAutotracking", "E", "lifecycleAutotracking", "B", "installAutotracking", "z", "exceptionAutotracking", "c", "a", "Ljava/lang/String;", "_appId", "Lk20/q;", "getSourceConfig", "()Lk20/q;", Gender.NONE, "(Lk20/q;)V", "sourceConfig", "Ljava/lang/Boolean;", "_isPaused", "Ls20/a;", "_devicePlatform", "e", "_base64encoding", "f", "Ls20/c;", "_logLevel", "Ls20/d;", "g", "Ls20/d;", "_loggerDelegate", "h", "_sessionContext", IntegerTokenConverter.CONVERTER_KEY, "_applicationContext", "j", "_platformContext", "k", "_geoLocationContext", "l", "_deepLinkContext", "m", "_screenContext", "n", "_screenViewAutotracking", "o", "_screenEngagementAutotracking", "p", "_lifecycleAutotracking", "q", "_installAutotracking", "r", "_exceptionAutotracking", "s", "_diagnosticAutotracking", "t", "_userAnonymisation", "u", "_trackerVersionSuffix", "", "Lk20/f;", "v", "Ljava/util/List;", "_platformContextProperties", "Ls20/e;", "w", "Ls20/e;", "_platformContextRetriever", "value", "()Ljava/lang/String;", "setAppId", "A", "()Z", "setPaused$snowplow_android_tracker_release", "(Z)V", "isPaused", "()Ls20/a;", Gender.FEMALE, "(Ls20/a;)V", "setBase64encoding", "base64encoding", "()Ls20/c;", "K", "(Ls20/c;)V", "()Ls20/d;", "setLoggerDelegate", "(Ls20/d;)V", "loggerDelegate", "setSessionContext", "sessionContext", "setApplicationContext", "applicationContext", "L", "H", "setDeepLinkContext", "deepLinkContext", "setScreenContext", "screenContext", Gender.MALE, "setScreenEngagementAutotracking", "screenEngagementAutotracking", "J", "I", "G", "setDiagnosticAutotracking", "diagnosticAutotracking", "y", "setUserAnonymisation", "userAnonymisation", "x", "setTrackerVersionSuffix", "trackerVersionSuffix", "()Ljava/util/List;", "setPlatformContextProperties", "(Ljava/util/List;)V", "platformContextProperties", "()Ls20/e;", "setPlatformContextRetriever", "(Ls20/e;)V", "platformContextRetriever", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class q implements a {

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f84695y = q.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String _appId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private q sourceConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Boolean _isPaused;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private s20.a _devicePlatform;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Boolean _base64encoding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private s20.c _logLevel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private s20.d _loggerDelegate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Boolean _sessionContext;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Boolean _applicationContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Boolean _platformContext;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Boolean _geoLocationContext;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Boolean _deepLinkContext;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Boolean _screenContext;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Boolean _screenViewAutotracking;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Boolean _screenEngagementAutotracking;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Boolean _lifecycleAutotracking;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Boolean _installAutotracking;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Boolean _exceptionAutotracking;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Boolean _diagnosticAutotracking;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Boolean _userAnonymisation;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private String _trackerVersionSuffix;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private List<? extends f> _platformContextProperties;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private PlatformContextRetriever _platformContextRetriever;

    /* JADX INFO: renamed from: k20.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk20/q$a;", "", "<init>", "()V", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return q.f84695y;
        }

        private Companion() {
        }
    }

    public q(String appId) {
        s.k(appId, "appId");
        this._appId = appId;
    }

    public final boolean A() {
        Boolean bool = this._isPaused;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.A()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final q B(boolean lifecycleAutotracking) {
        J(lifecycleAutotracking);
        return this;
    }

    public final q C(s20.c logLevel) {
        s.k(logLevel, "logLevel");
        K(logLevel);
        return this;
    }

    public final q D(boolean platformContext) {
        L(platformContext);
        return this;
    }

    public final q E(boolean screenViewAutotracking) {
        M(screenViewAutotracking);
        return this;
    }

    public void F(s20.a value) {
        s.k(value, "value");
        this._devicePlatform = value;
    }

    public void G(boolean z11) {
        this._exceptionAutotracking = Boolean.valueOf(z11);
    }

    public void H(boolean z11) {
        this._geoLocationContext = Boolean.valueOf(z11);
    }

    public void I(boolean z11) {
        this._installAutotracking = Boolean.valueOf(z11);
    }

    public void J(boolean z11) {
        this._lifecycleAutotracking = Boolean.valueOf(z11);
    }

    public void K(s20.c value) {
        s.k(value, "value");
        this._logLevel = value;
    }

    public void L(boolean z11) {
        this._platformContext = Boolean.valueOf(z11);
    }

    public void M(boolean z11) {
        this._screenViewAutotracking = Boolean.valueOf(z11);
    }

    public final void N(q qVar) {
        this.sourceConfig = qVar;
    }

    public final q b(s20.a devicePlatform) {
        s.k(devicePlatform, "devicePlatform");
        F(devicePlatform);
        return this;
    }

    public final q c(boolean exceptionAutotracking) {
        G(exceptionAutotracking);
        return this;
    }

    public final q d(boolean geoLocationContext) {
        H(geoLocationContext);
        return this;
    }

    public String e() {
        String str = this._appId;
        if (str != null) {
            return str;
        }
        q qVar = this.sourceConfig;
        String strE = qVar != null ? qVar.e() : null;
        return strE == null ? "" : strE;
    }

    public boolean f() {
        Boolean bool = this._applicationContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.f()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.a();
    }

    public boolean g() {
        Boolean bool = this._base64encoding;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.g()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.c();
    }

    public boolean h() {
        Boolean bool = this._deepLinkContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.h()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.d();
    }

    public s20.a i() {
        s20.a aVar = this._devicePlatform;
        if (aVar != null) {
            return aVar;
        }
        q qVar = this.sourceConfig;
        s20.a aVarI = qVar != null ? qVar.i() : null;
        return aVarI == null ? h20.q.f70530a.e() : aVarI;
    }

    public boolean j() {
        Boolean bool = this._diagnosticAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.j()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.f();
    }

    public boolean k() {
        Boolean bool = this._exceptionAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.k()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.g();
    }

    public boolean l() {
        Boolean bool = this._geoLocationContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.l()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.i();
    }

    public boolean m() {
        Boolean bool = this._installAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.m()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.j();
    }

    public boolean n() {
        Boolean bool = this._lifecycleAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.n()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.k();
    }

    public s20.c o() {
        s20.c cVar = this._logLevel;
        if (cVar != null) {
            return cVar;
        }
        q qVar = this.sourceConfig;
        s20.c cVarO = qVar != null ? qVar.o() : null;
        return cVarO == null ? h20.q.f70530a.l() : cVarO;
    }

    public s20.d p() {
        s20.d dVar = this._loggerDelegate;
        if (dVar != null) {
            return dVar;
        }
        q qVar = this.sourceConfig;
        if (qVar != null) {
            return qVar.p();
        }
        return null;
    }

    public boolean q() {
        Boolean bool = this._platformContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.q()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.m();
    }

    public List<f> r() {
        List list = this._platformContextProperties;
        if (list != null) {
            return list;
        }
        q qVar = this.sourceConfig;
        if (qVar != null) {
            return qVar.r();
        }
        return null;
    }

    public PlatformContextRetriever s() {
        PlatformContextRetriever platformContextRetriever = this._platformContextRetriever;
        if (platformContextRetriever != null) {
            return platformContextRetriever;
        }
        q qVar = this.sourceConfig;
        if (qVar != null) {
            return qVar.s();
        }
        return null;
    }

    public boolean t() {
        Boolean bool = this._screenContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.t()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.n();
    }

    public boolean u() {
        Boolean bool = this._screenEngagementAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.u()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.o();
    }

    public boolean v() {
        Boolean bool = this._screenViewAutotracking;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.v()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.p();
    }

    public boolean w() {
        Boolean bool = this._sessionContext;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.w()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.q();
    }

    public String x() {
        String str = this._trackerVersionSuffix;
        if (str != null) {
            return str;
        }
        q qVar = this.sourceConfig;
        if (qVar != null) {
            return qVar.x();
        }
        return null;
    }

    public boolean y() {
        Boolean bool = this._userAnonymisation;
        if (bool != null) {
            return bool.booleanValue();
        }
        q qVar = this.sourceConfig;
        Boolean boolValueOf = qVar != null ? Boolean.valueOf(qVar.y()) : null;
        return boolValueOf != null ? boolValueOf.booleanValue() : h20.q.f70530a.s();
    }

    public final q z(boolean installAutotracking) {
        I(installAutotracking);
        return this;
    }

    public q() {
    }
}
