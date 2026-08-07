package com.brentvatne.exoplayer;

import android.R;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.ref.WeakReference;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010#\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u00020\u0010H\u0014¢\u0006\u0004\b'\u0010\u0012J\u000f\u0010(\u001a\u00020\u0010H\u0014¢\u0006\u0004\b(\u0010\u0012J\r\u0010)\u001a\u00020\u0010¢\u0006\u0004\b)\u0010\u0012J\u000f\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b*\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0018\u00104\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010F\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010C¨\u0006G"}, d2 = {"Lcom/brentvatne/exoplayer/n;", "Landroid/app/Dialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/brentvatne/exoplayer/l;", "exoPlayerView", "Lcom/brentvatne/exoplayer/p0;", "reactExoplayerView", "Landroidx/media3/ui/c;", "playerControlView", "Landroidx/activity/b0;", "onBackPressedCallback", "Lvi/e;", "controlsConfig", "<init>", "(Landroid/content/Context;Lcom/brentvatne/exoplayer/l;Lcom/brentvatne/exoplayer/p0;Landroidx/media3/ui/c;Landroidx/activity/b0;Lvi/e;)V", "Ljn0/h0;", "e", "()V", "Landroid/widget/FrameLayout$LayoutParams;", "c", "()Landroid/widget/FrameLayout$LayoutParams;", "Landroidx/core/view/WindowInsetsControllerCompat;", "inset", "", "type", "", "shouldHide", "initialVisibility", "systemBarsBehavior", "f", "(Landroidx/core/view/WindowInsetsControllerCompat;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Landroid/view/Window;", "window", "hideNavigationBarOnFullScreenMode", "hideNotificationBarOnFullScreenMode", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/view/Window;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "h", "onStart", "onStop", DateTokenConverter.CONVERTER_KEY, "onAttachedToWindow", "a", "Lcom/brentvatne/exoplayer/l;", "b", "Lcom/brentvatne/exoplayer/p0;", "Landroidx/media3/ui/c;", "Landroidx/activity/b0;", "Lvi/e;", "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", "parent", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "containerView", "Landroid/os/Handler;", "Landroid/os/Handler;", "mKeepScreenOnHandler", "Lcom/brentvatne/exoplayer/n$a;", "Lcom/brentvatne/exoplayer/n$a;", "mKeepScreenOnUpdater", "j", "Ljava/lang/Integer;", "initialSystemBarsBehavior", "k", "Ljava/lang/Boolean;", "initialNavigationBarIsVisible", "l", "initialNotificationBarIsVisible", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"PrivateResource"})
public final class n extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l exoPlayerView;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0 reactExoplayerView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.media3.ui.c playerControlView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.p002activity.b0 onBackPressedCallback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vi.e controlsConfig;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ViewGroup parent;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final FrameLayout containerView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Handler mKeepScreenOnHandler;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a mKeepScreenOnUpdater;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Integer initialSystemBarsBehavior;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Boolean initialNavigationBarIsVisible;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Boolean initialNotificationBarIsVisible;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/brentvatne/exoplayer/n$a;", "Ljava/lang/Runnable;", "Lcom/brentvatne/exoplayer/n;", "fullScreenPlayerView", "<init>", "(Lcom/brentvatne/exoplayer/n;)V", "Ljn0/h0;", "run", "()V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/ref/WeakReference;", "mFullscreenPlayer", "b", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final WeakReference<n> mFullscreenPlayer;

        public a(n fullScreenPlayerView) {
            p013kotlin.jvm.internal.s.k(fullScreenPlayerView, "fullScreenPlayerView");
            this.mFullscreenPlayer = new WeakReference<>(fullScreenPlayerView);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                n nVar = this.mFullscreenPlayer.get();
                if (nVar != null) {
                    Window window = nVar.getWindow();
                    if (window != null) {
                        if (nVar.exoPlayerView.g()) {
                            window.addFlags(128);
                        } else {
                            window.clearFlags(128);
                        }
                    }
                    nVar.mKeepScreenOnHandler.postDelayed(this, 200L);
                }
            } catch (Exception e11) {
                xi.a.b("ExoPlayer Exception", "Failed to flag FLAG_KEEP_SCREEN_ON on fullscreen.");
                xi.a.b("ExoPlayer Exception", e11.toString());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, l exoPlayerView, p0 reactExoplayerView, androidx.media3.ui.c cVar, androidx.p002activity.b0 onBackPressedCallback, vi.e controlsConfig) {
        super(context, R.style.Theme.Black.NoTitleBar);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(exoPlayerView, "exoPlayerView");
        p013kotlin.jvm.internal.s.k(reactExoplayerView, "reactExoplayerView");
        p013kotlin.jvm.internal.s.k(onBackPressedCallback, "onBackPressedCallback");
        p013kotlin.jvm.internal.s.k(controlsConfig, "controlsConfig");
        this.exoPlayerView = exoPlayerView;
        this.reactExoplayerView = reactExoplayerView;
        this.playerControlView = cVar;
        this.onBackPressedCallback = onBackPressedCallback;
        this.controlsConfig = controlsConfig;
        FrameLayout frameLayout = new FrameLayout(context);
        this.containerView = frameLayout;
        this.mKeepScreenOnHandler = new Handler(Looper.getMainLooper());
        this.mKeepScreenOnUpdater = new a(this);
        setContentView(frameLayout, c());
        Window window = getWindow();
        if (window != null) {
            this.initialSystemBarsBehavior = Integer.valueOf(new WindowInsetsControllerCompat(window, window.getDecorView()).b());
            WindowInsetsCompat windowInsetsCompatH = ViewCompat.H(window.getDecorView());
            boolean z11 = false;
            this.initialNavigationBarIsVisible = Boolean.valueOf(windowInsetsCompatH != null && windowInsetsCompatH.q(WindowInsetsCompat.n.f()));
            WindowInsetsCompat windowInsetsCompatH2 = ViewCompat.H(window.getDecorView());
            if (windowInsetsCompatH2 != null && windowInsetsCompatH2.q(WindowInsetsCompat.n.g())) {
                z11 = true;
            }
            this.initialNotificationBarIsVisible = Boolean.valueOf(z11);
        }
    }

    private final FrameLayout.LayoutParams c() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        return layoutParams;
    }

    private final void e() {
        Window window = getWindow();
        if (window != null) {
            i(window, this.initialNavigationBarIsVisible, this.initialNotificationBarIsVisible, this.initialSystemBarsBehavior);
        }
    }

    private final void f(WindowInsetsControllerCompat inset, int type, Boolean shouldHide, Boolean initialVisibility, Integer systemBarsBehavior) {
        if (shouldHide != null) {
            if (p013kotlin.jvm.internal.s.f(shouldHide, initialVisibility)) {
                shouldHide = null;
            }
            if (shouldHide != null) {
                if (!shouldHide.booleanValue()) {
                    inset.i(type);
                    return;
                }
                inset.c(type);
                if (systemBarsBehavior != null) {
                    inset.h(systemBarsBehavior.intValue());
                }
            }
        }
    }

    static /* synthetic */ void g(n nVar, WindowInsetsControllerCompat windowInsetsControllerCompat, int i11, Boolean bool, Boolean bool2, Integer num, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            num = null;
        }
        nVar.f(windowInsetsControllerCompat, i11, bool, bool2, num);
    }

    private final void h() {
        Window window = getWindow();
        if (window != null) {
            i(window, Boolean.valueOf(this.controlsConfig.getHideNavigationBarOnFullScreenMode()), Boolean.valueOf(this.controlsConfig.getHideNotificationBarOnFullScreenMode()), 2);
        }
    }

    private final void i(Window window, Boolean hideNavigationBarOnFullScreenMode, Boolean hideNotificationBarOnFullScreenMode, Integer systemBarsBehavior) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        f(windowInsetsControllerCompat, WindowInsetsCompat.n.f(), hideNavigationBarOnFullScreenMode, this.initialNavigationBarIsVisible, systemBarsBehavior);
        g(this, windowInsetsControllerCompat, WindowInsetsCompat.n.g(), hideNotificationBarOnFullScreenMode, this.initialNotificationBarIsVisible, null, 16, null);
    }

    public final void d() {
        int childCount = this.containerView.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (this.containerView.getChildAt(i11) != this.exoPlayerView) {
                this.containerView.getChildAt(i11).setVisibility(8);
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.reactExoplayerView.getPreventsDisplaySleepDuringVideoPlayback()) {
            this.mKeepScreenOnHandler.post(this.mKeepScreenOnUpdater);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        ViewGroup viewGroup = (ViewGroup) this.exoPlayerView.getParent();
        this.parent = viewGroup;
        if (viewGroup != null) {
            viewGroup.removeView(this.exoPlayerView);
        }
        this.containerView.addView(this.exoPlayerView, c());
        androidx.media3.ui.c cVar = this.playerControlView;
        if (cVar != null) {
            ViewGroup viewGroup2 = this.parent;
            if (viewGroup2 != null) {
                viewGroup2.removeView(cVar);
            }
            this.containerView.addView(cVar, c());
        }
        h();
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        this.mKeepScreenOnHandler.removeCallbacks(this.mKeepScreenOnUpdater);
        this.containerView.removeView(this.exoPlayerView);
        ViewGroup viewGroup = this.parent;
        if (viewGroup != null) {
            viewGroup.addView(this.exoPlayerView, c());
        }
        androidx.media3.ui.c cVar = this.playerControlView;
        if (cVar != null) {
            this.containerView.removeView(cVar);
            ViewGroup viewGroup2 = this.parent;
            if (viewGroup2 != null) {
                viewGroup2.addView(cVar, c());
            }
        }
        ViewGroup viewGroup3 = this.parent;
        if (viewGroup3 != null) {
            viewGroup3.requestLayout();
        }
        this.parent = null;
        this.onBackPressedCallback.handleOnBackPressed();
        e();
    }
}
