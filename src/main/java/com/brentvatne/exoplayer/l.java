package com.brentvatne.exoplayer;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001O\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001BB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u0016J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0016J\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\n¢\u0006\u0004\b$\u0010\fJ\r\u0010%\u001a\u00020\n¢\u0006\u0004\b%\u0010\fJ\u0015\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0006¢\u0006\u0004\b'\u0010\u0016J\u0015\u0010)\u001a\u00020\n2\u0006\u0010(\u001a\u00020 ¢\u0006\u0004\b)\u0010#J\u0015\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020 ¢\u0006\u0004\b+\u0010#J\u0017\u0010.\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020 ¢\u0006\u0004\b1\u0010#J\u0017\u00103\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u000102¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\n2\u0006\u0010-\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\n2\u0006\u00108\u001a\u00020 H\u0016¢\u0006\u0004\b9\u0010#J\u000f\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u0010\fJ7\u0010@\u001a\u00020\n2\u0006\u0010;\u001a\u00020 2\u0006\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0014¢\u0006\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010PR\u0014\u0010T\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010SR\u0011\u0010W\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/brentvatne/exoplayer/l;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ljn0/h0;", "j", "()V", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "setPlayer", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "Landroidx/media3/ui/PlayerView;", "getPlayerView", "()Landroidx/media3/ui/PlayerView;", "resizeMode", "setResizeMode", "(I)V", "Lvi/j;", "style", "setSubtitleStyle", "(Lvi/j;)V", "color", "setShutterColor", "viewType", "k", "f", "", "useController", "setUseController", "(Z)V", IntegerTokenConverter.CONVERTER_KEY, "e", "showTimeoutMs", "setControllerShowTimeoutMs", "autoShow", "setControllerAutoShow", "hideOnTouch", "setControllerHideOnTouch", "Landroidx/media3/ui/PlayerView$e;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setFullscreenButtonClickListener", "(Landroidx/media3/ui/PlayerView$e;)V", "show", "setShowSubtitleButton", "Landroidx/media3/ui/PlayerView$d;", "setControllerVisibilityListener", "(Landroidx/media3/ui/PlayerView$d;)V", "Landroid/view/View$OnLayoutChangeListener;", "addOnLayoutChangeListener", "(Landroid/view/View$OnLayoutChangeListener;)V", "focusable", "setFocusable", "requestLayout", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "a", "Lvi/j;", "localStyle", "b", "Ljava/lang/Integer;", "pendingResizeMode", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "liveBadge", DateTokenConverter.CONVERTER_KEY, "Landroidx/media3/ui/PlayerView;", "playerView", "com/brentvatne/exoplayer/l$b", "Lcom/brentvatne/exoplayer/l$b;", "playerListener", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "layoutRunnable", "g", "()Z", "isPlaying", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private vi.j localStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Integer pendingResizeMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextView liveBadge;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PlayerView playerView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b playerListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Runnable layoutRunnable;

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/brentvatne/exoplayer/l$b", "Lp7/j0$d;", "Lp7/r0;", "timeline", "", AnalyticsAttribute.Reason, "Ljn0/h0;", "a0", "(Lp7/r0;I)V", "Lp7/j0;", "player", "Lp7/j0$c;", "events", "V", "(Lp7/j0;Lp7/j0$c;)V", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p7.j0.d {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(l lVar) {
            lVar.playerView.requestLayout();
            Integer num = lVar.pendingResizeMode;
            if (num != null) {
                lVar.playerView.setResizeMode(num.intValue());
            }
        }

        @Override // p7.j0.d
        public void V(p7.j0 player, p7.j0.c events) {
            p013kotlin.jvm.internal.s.k(player, "player");
            p013kotlin.jvm.internal.s.k(events, "events");
            if (events.a(1) || events.a(7)) {
                l.this.j();
            }
            if (events.a(25)) {
                Integer num = l.this.pendingResizeMode;
                if (num != null) {
                    l lVar = l.this;
                    lVar.playerView.setResizeMode(num.intValue());
                }
                l.this.playerView.requestLayout();
                l.this.requestLayout();
            }
        }

        @Override // p7.j0.d
        public void a0(p7.r0 timeline, int reason) {
            p013kotlin.jvm.internal.s.k(timeline, "timeline");
            PlayerView playerView = l.this.playerView;
            final l lVar = l.this;
            playerView.post(new Runnable() { // from class: com.brentvatne.exoplayer.m
                @Override // java.lang.Runnable
                public final void run() {
                    l.b.q(lVar);
                }
            });
            l.this.j();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        this(context, null, 0, 6, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(l lVar) {
        lVar.measure(View.MeasureSpec.makeMeasureSpec(lVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(lVar.getHeight(), 1073741824));
        lVar.layout(lVar.getLeft(), lVar.getTop(), lVar.getRight(), lVar.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        p7.j0 player = this.playerView.getPlayer();
        if (player == null) {
            return;
        }
        boolean zT0 = player.t0();
        boolean zN0 = player.n0();
        this.liveBadge.setVisibility(zT0 ? 0 : 8);
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) this.playerView.findViewById(ia.t.I);
        if (defaultTimeBar != null) {
            defaultTimeBar.setEnabled(!zT0 || zN0);
        }
    }

    @Override // android.view.View
    public void addOnLayoutChangeListener(View.OnLayoutChangeListener listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.playerView.addOnLayoutChangeListener(listener);
    }

    public final void e() {
        this.playerView.F();
    }

    public final void f() {
        this.playerView.requestLayout();
        Integer num = this.pendingResizeMode;
        if (num != null) {
            this.playerView.setResizeMode(num.intValue());
        }
    }

    public final boolean g() {
        p7.j0 player = this.playerView.getPlayer();
        if (player != null) {
            return player.isPlaying();
        }
        return false;
    }

    public final PlayerView getPlayerView() {
        return this.playerView;
    }

    public final void i() {
        this.playerView.R();
    }

    public final void k(int viewType) {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        Integer num;
        super.onLayout(changed, left, top, right, bottom);
        if (!changed || (num = this.pendingResizeMode) == null) {
            return;
        }
        this.playerView.setResizeMode(num.intValue());
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.layoutRunnable);
    }

    public final void setControllerAutoShow(boolean autoShow) {
        this.playerView.setControllerAutoShow(autoShow);
    }

    public final void setControllerHideOnTouch(boolean hideOnTouch) {
        this.playerView.setControllerHideOnTouch(hideOnTouch);
    }

    public final void setControllerShowTimeoutMs(int showTimeoutMs) {
        this.playerView.setControllerShowTimeoutMs(showTimeoutMs);
    }

    public final void setControllerVisibilityListener(PlayerView.d listener) {
        this.playerView.setControllerVisibilityListener(listener);
    }

    @Override // android.view.View
    public void setFocusable(boolean focusable) {
        this.playerView.setFocusable(focusable);
    }

    public final void setFullscreenButtonClickListener(PlayerView.e listener) {
        this.playerView.setFullscreenButtonClickListener(listener);
    }

    public final void setPlayer(ExoPlayer player) {
        p7.j0 player2 = this.playerView.getPlayer();
        if (player2 != null) {
            player2.e0(this.playerListener);
        }
        this.playerView.setPlayer(player);
        if (player != null) {
            player.D0(this.playerListener);
            Integer num = this.pendingResizeMode;
            if (num != null) {
                this.playerView.setResizeMode(num.intValue());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0010 A[PHI: r1
      0x0010: PHI (r1v1 int) = (r1v0 int), (r1v2 int), (r1v3 int), (r1v4 int) binds: [B:5:0x0004, B:7:0x0007, B:9:0x000a, B:11:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    public final void setResizeMode(int resizeMode) {
        int i11 = 0;
        if (resizeMode != 0) {
            int i12 = 1;
            if (resizeMode != 1) {
                i12 = 2;
                if (resizeMode != 2) {
                    i12 = 3;
                    if (resizeMode != 3) {
                        i12 = 4;
                        if (resizeMode == 4) {
                            i11 = i12;
                        }
                    } else {
                        i11 = i12;
                    }
                } else {
                    i11 = i12;
                }
            } else {
                i11 = i12;
            }
        }
        this.playerView.setResizeMode(i11);
        this.pendingResizeMode = Integer.valueOf(i11);
        this.playerView.requestLayout();
        requestLayout();
    }

    public final void setShowSubtitleButton(boolean show) {
        this.playerView.setShowSubtitleButton(show);
    }

    public final void setShutterColor(int color) {
        this.playerView.setShutterBackgroundColor(color);
    }

    public final void setSubtitleStyle(vi.j style) {
        p013kotlin.jvm.internal.s.k(style, "style");
        SubtitleView subtitleView = this.playerView.getSubtitleView();
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
            if (style.getCom.fourthline.adapters.serialization.OrcaFlavourKeys.FONT_SIZE java.lang.String() > 0) {
                subtitleView.setFixedTextSize(2, style.getCom.fourthline.adapters.serialization.OrcaFlavourKeys.FONT_SIZE java.lang.String());
            }
            subtitleView.setPadding(style.getPaddingLeft(), style.getPaddingTop(), style.getPaddingRight(), style.getPaddingBottom());
            if (style.getOpacity() == BitmapDescriptorFactory.HUE_RED) {
                subtitleView.setVisibility(8);
            } else {
                subtitleView.setAlpha(style.getOpacity());
                subtitleView.setVisibility(0);
            }
        }
        this.localStyle = style;
    }

    public final void setUseController(boolean useController) {
        this.playerView.setUseController(useController);
        if (useController) {
            this.playerView.setControllerAutoShow(true);
            this.playerView.setControllerHideOnTouch(true);
            this.playerView.R();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.localStyle = new vi.j();
        TextView textView = new TextView(context);
        textView.setText("LIVE");
        textView.setTextColor(-1);
        textView.setTextSize(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-65536);
        gradientDrawable.setCornerRadius(6.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(12, 4, 12, 4);
        textView.setVisibility(8);
        this.liveBadge = textView;
        PlayerView playerView = new PlayerView(context);
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        playerView.setShutterBackgroundColor(0);
        playerView.setUseController(true);
        playerView.setControllerAutoShow(true);
        playerView.setControllerHideOnTouch(true);
        playerView.setControllerShowTimeoutMs(5000);
        playerView.setShowSubtitleButton(false);
        playerView.setUseArtwork(false);
        playerView.setDefaultArtwork(null);
        playerView.setResizeMode(0);
        this.playerView = playerView;
        addView(playerView, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(16, 16, 16, 16);
        addView(textView, layoutParams);
        this.playerListener = new b();
        this.layoutRunnable = new Runnable() { // from class: com.brentvatne.exoplayer.k
            @Override // java.lang.Runnable
            public final void run() {
                l.h(this.f20316a);
            }
        };
    }
}
