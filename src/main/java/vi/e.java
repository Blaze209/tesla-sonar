package vi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0017\u0010\nR\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\nR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0006\u001a\u0004\b\u0005\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\u001e\u0010\nR\"\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\b\"\u0004\b%\u0010\nR$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00102\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\nR\"\u00109\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006:"}, d2 = {"Lvi/e;", "", "<init>", "()V", "", "a", "Z", "getHideSeekBar", "()Z", "n", "(Z)V", "hideSeekBar", "b", "getHideDuration", DateTokenConverter.CONVERTER_KEY, "hideDuration", "c", "getHidePosition", "k", "hidePosition", "getHidePlayPause", "j", "hidePlayPause", "e", "getHideForward", "hideForward", "f", "getHideRewind", "m", "hideRewind", "g", "getHideNext", "h", "hideNext", "getHidePrevious", "l", "hidePrevious", IntegerTokenConverter.CONVERTER_KEY, "hideFullscreen", "hideNavigationBarOnFullScreenMode", "hideNotificationBarOnFullScreenMode", "", "Ljava/lang/String;", "getLiveLabel", "()Ljava/lang/String;", "p", "(Ljava/lang/String;)V", "liveLabel", "getHideSettingButton", "o", "hideSettingButton", "", "I", "getSeekIncrementMS", "()I", "q", "(I)V", "seekIncrementMS", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hideSeekBar;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hideDuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hidePosition;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean hidePlayPause;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean hideForward;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hideRewind;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean hideNext;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hidePrevious;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean hideFullscreen;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String liveLabel;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean hideNavigationBarOnFullScreenMode = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean hideNotificationBarOnFullScreenMode = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean hideSettingButton = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int seekIncrementMS = 10000;

    /* JADX INFO: renamed from: vi.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lvi/e$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableMap;", "controlsConfig", "Lvi/e;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lvi/e;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(ReadableMap controlsConfig) {
            e eVar = new e();
            if (controlsConfig != null) {
                eVar.n(xi.b.b(controlsConfig, "hideSeekBar", false));
                eVar.d(xi.b.b(controlsConfig, "hideDuration", false));
                eVar.k(xi.b.b(controlsConfig, "hidePosition", false));
                eVar.j(xi.b.b(controlsConfig, "hidePlayPause", false));
                eVar.e(xi.b.b(controlsConfig, "hideForward", false));
                eVar.m(xi.b.b(controlsConfig, "hideRewind", false));
                eVar.h(xi.b.b(controlsConfig, "hideNext", false));
                eVar.l(xi.b.b(controlsConfig, "hidePrevious", false));
                eVar.f(xi.b.b(controlsConfig, "hideFullscreen", false));
                eVar.q(xi.b.e(controlsConfig, "seekIncrementMS", 10000));
                eVar.g(xi.b.b(controlsConfig, "hideNavigationBarOnFullScreenMode", true));
                eVar.i(xi.b.b(controlsConfig, "hideNotificationBarOnFullScreenMode", true));
                eVar.p(xi.b.h(controlsConfig, "liveLabel", null));
                eVar.o(xi.b.b(controlsConfig, "hideSettingButton", true));
            }
            return eVar;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHideFullscreen() {
        return this.hideFullscreen;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getHideNavigationBarOnFullScreenMode() {
        return this.hideNavigationBarOnFullScreenMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHideNotificationBarOnFullScreenMode() {
        return this.hideNotificationBarOnFullScreenMode;
    }

    public final void d(boolean z11) {
        this.hideDuration = z11;
    }

    public final void e(boolean z11) {
        this.hideForward = z11;
    }

    public final void f(boolean z11) {
        this.hideFullscreen = z11;
    }

    public final void g(boolean z11) {
        this.hideNavigationBarOnFullScreenMode = z11;
    }

    public final void h(boolean z11) {
        this.hideNext = z11;
    }

    public final void i(boolean z11) {
        this.hideNotificationBarOnFullScreenMode = z11;
    }

    public final void j(boolean z11) {
        this.hidePlayPause = z11;
    }

    public final void k(boolean z11) {
        this.hidePosition = z11;
    }

    public final void l(boolean z11) {
        this.hidePrevious = z11;
    }

    public final void m(boolean z11) {
        this.hideRewind = z11;
    }

    public final void n(boolean z11) {
        this.hideSeekBar = z11;
    }

    public final void o(boolean z11) {
        this.hideSettingButton = z11;
    }

    public final void p(String str) {
        this.liveLabel = str;
    }

    public final void q(int i11) {
        this.seekIncrementMS = i11;
    }
}
