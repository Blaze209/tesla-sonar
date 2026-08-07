package com.brentvatne.exoplayer;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0012\u0018\u0000 ]2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001^B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010%\u001a\u00020!H\u0007¢\u0006\u0004\b&\u0010$J!\u0010(\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b(\u0010\u001dJ!\u0010*\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b*\u0010\u001dJ!\u0010,\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b,\u0010\u001dJ\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010-\u001a\u00020!H\u0007¢\u0006\u0004\b.\u0010$J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010/\u001a\u00020!H\u0007¢\u0006\u0004\b0\u0010$J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00101\u001a\u00020!H\u0007¢\u0006\u0004\b2\u0010$J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0007H\u0007¢\u0006\u0004\b4\u0010 J\u001f\u00107\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00106\u001a\u000205H\u0007¢\u0006\u0004\b7\u00108J\u001f\u0010:\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u00109\u001a\u000205H\u0007¢\u0006\u0004\b:\u00108J\u001f\u0010<\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010;\u001a\u00020!H\u0007¢\u0006\u0004\b<\u0010$J\u001f\u0010>\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010=\u001a\u000205H\u0007¢\u0006\u0004\b>\u00108J\u001f\u0010@\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010?\u001a\u000205H\u0007¢\u0006\u0004\b@\u00108J\u001f\u0010B\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010A\u001a\u00020!H\u0007¢\u0006\u0004\bB\u0010$J\u001f\u0010D\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010C\u001a\u00020!H\u0007¢\u0006\u0004\bD\u0010$J\u001f\u0010F\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010E\u001a\u00020!H\u0007¢\u0006\u0004\bF\u0010$J\u001f\u0010H\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010G\u001a\u00020\u0007H\u0007¢\u0006\u0004\bH\u0010 J\u001f\u0010J\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010I\u001a\u00020!H\u0007¢\u0006\u0004\bJ\u0010$J\u001f\u0010L\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010K\u001a\u00020!H\u0007¢\u0006\u0004\bL\u0010$J\u001f\u0010O\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010N\u001a\u00020MH\u0007¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010Q\u001a\u00020!H\u0007¢\u0006\u0004\bR\u0010$J!\u0010S\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\bS\u0010\u001dJ\u001f\u0010U\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010T\u001a\u00020MH\u0007¢\u0006\u0004\bU\u0010PJ\u001f\u0010W\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010V\u001a\u00020!H\u0007¢\u0006\u0004\bW\u0010$J!\u0010Y\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010X\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\bY\u0010\u001dJ!\u0010[\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010Z\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0004\b[\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\\¨\u0006_"}, d2 = {"Lcom/brentvatne/exoplayer/ReactExoplayerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/brentvatne/exoplayer/p0;", "Lcom/brentvatne/exoplayer/y;", "config", "<init>", "(Lcom/brentvatne/exoplayer/y;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/v0;", "themedReactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/v0;)Lcom/brentvatne/exoplayer/p0;", "view", "Ljn0/h0;", "onDropViewInstance", "(Lcom/brentvatne/exoplayer/p0;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "reactContext", "addEventEmitters", "(Lcom/facebook/react/uimanager/v0;Lcom/brentvatne/exoplayer/p0;)V", "videoView", "Lcom/facebook/react/bridge/ReadableMap;", ReactExoplayerViewManager.PROP_SRC, "setSrc", "(Lcom/brentvatne/exoplayer/p0;Lcom/facebook/react/bridge/ReadableMap;)V", ReactExoplayerViewManager.PROP_RESIZE_MODE, "setResizeMode", "(Lcom/brentvatne/exoplayer/p0;Ljava/lang/String;)V", "", ReactExoplayerViewManager.PROP_REPEAT, "setRepeat", "(Lcom/brentvatne/exoplayer/p0;Z)V", "preventsSleep", "setPreventsDisplaySleepDuringVideoPlayback", ReactExoplayerViewManager.PROP_SELECTED_VIDEO_TRACK, "setSelectedVideoTrack", ReactExoplayerViewManager.PROP_SELECTED_AUDIO_TRACK, "setSelectedAudioTrack", ReactExoplayerViewManager.PROP_SELECTED_TEXT_TRACK, "setSelectedTextTrack", ReactExoplayerViewManager.PROP_PAUSED, "setPaused", ReactExoplayerViewManager.PROP_MUTED, "setMuted", ReactExoplayerViewManager.PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE, "setEnterPictureInPictureOnLeave", ReactExoplayerViewManager.PROP_AUDIO_OUTPUT, "setAudioOutput", "", ReactExoplayerViewManager.PROP_VOLUME, "setVolume", "(Lcom/brentvatne/exoplayer/p0;F)V", ReactExoplayerViewManager.PROP_PROGRESS_UPDATE_INTERVAL, "setProgressUpdateInterval", ReactExoplayerViewManager.PROP_REPORT_BANDWIDTH, "setReportBandwidth", ReactExoplayerViewManager.PROP_RATE, "setRate", ReactExoplayerViewManager.PROP_MAXIMUM_BIT_RATE, "setMaxBitRate", ReactExoplayerViewManager.PROP_PLAY_IN_BACKGROUND, "setPlayInBackground", ReactExoplayerViewManager.PROP_DISABLE_FOCUS, "setDisableFocus", ReactExoplayerViewManager.PROP_FOCUSABLE, "setFocusable", ReactExoplayerViewManager.PROP_BUFFERING_STRATEGY, "setBufferingStrategy", ReactExoplayerViewManager.PROP_DISABLE_DISCONNECT_ERROR, "setDisableDisconnectError", ReactExoplayerViewManager.PROP_FULLSCREEN, "setFullscreen", "", ReactExoplayerViewManager.PROP_VIEW_TYPE, "setViewType", "(Lcom/brentvatne/exoplayer/p0;I)V", ReactExoplayerViewManager.PROP_CONTROLS, "setControls", "setSubtitleStyle", "color", "setShutterColor", ReactExoplayerViewManager.PROP_SHOW_NOTIFICATION_CONTROLS, "setShowNotificationControls", "debugConfig", "setDebug", ReactExoplayerViewManager.PROP_CONTROLS_STYLES, "setControlsStyles", "Lcom/brentvatne/exoplayer/y;", "Companion", "a", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReactExoplayerViewManager extends ViewGroupManager<p0> {
    private static final String PROP_AUDIO_OUTPUT = "audioOutput";
    private static final String PROP_BUFFERING_STRATEGY = "bufferingStrategy";
    private static final String PROP_CONTROLS = "controls";
    private static final String PROP_CONTROLS_STYLES = "controlsStyles";
    private static final String PROP_DEBUG = "debug";
    private static final String PROP_DISABLE_DISCONNECT_ERROR = "disableDisconnectError";
    private static final String PROP_DISABLE_FOCUS = "disableFocus";
    private static final String PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE = "enterPictureInPictureOnLeave";
    private static final String PROP_FOCUSABLE = "focusable";
    private static final String PROP_FULLSCREEN = "fullscreen";
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";
    private static final String PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK = "preventsDisplaySleepDuringVideoPlayback";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";
    private static final String PROP_RESIZE_MODE = "resizeMode";
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";
    private static final String PROP_SHOW_NOTIFICATION_CONTROLS = "showNotificationControls";
    private static final String PROP_SHUTTER_COLOR = "shutterColor";
    private static final String PROP_SRC = "src";
    private static final String PROP_SUBTITLE_STYLE = "subtitleStyle";
    private static final String PROP_VIEW_TYPE = "viewType";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RCTVideo";
    private static final String TAG = "ExoViewManager";
    private final y config;

    public ReactExoplayerViewManager(y config) {
        p013kotlin.jvm.internal.s.k(config, "config");
        this.config = config;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return wi.a.INSTANCE.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.h
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @no.a(name = PROP_AUDIO_OUTPUT)
    public final void setAudioOutput(p0 videoView, String audioOutput) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        p013kotlin.jvm.internal.s.k(audioOutput, "audioOutput");
        videoView.setAudioOutput(a.INSTANCE.a(audioOutput));
    }

    @no.a(name = PROP_BUFFERING_STRATEGY)
    public final void setBufferingStrategy(p0 videoView, String bufferingStrategy) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        p013kotlin.jvm.internal.s.k(bufferingStrategy, "bufferingStrategy");
        videoView.setBufferingStrategy(vi.c.INSTANCE.a(bufferingStrategy));
    }

    @no.a(defaultBoolean = false, name = PROP_CONTROLS)
    public final void setControls(p0 videoView, boolean controls) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setControls(controls);
    }

    @no.a(name = PROP_CONTROLS_STYLES)
    public final void setControlsStyles(p0 videoView, ReadableMap controlsStyles) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setControlsStyles(vi.e.INSTANCE.a(controlsStyles));
    }

    @no.a(defaultBoolean = false, name = PROP_DEBUG)
    public final void setDebug(p0 videoView, ReadableMap debugConfig) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        boolean zB = xi.b.b(debugConfig, "enable", false);
        boolean zB2 = xi.b.b(debugConfig, "thread", false);
        if (zB) {
            xi.a.e(2, zB2);
        } else {
            xi.a.e(5, zB2);
        }
        videoView.setDebug(zB);
    }

    @no.a(defaultBoolean = false, name = PROP_DISABLE_DISCONNECT_ERROR)
    public final void setDisableDisconnectError(p0 videoView, boolean disableDisconnectError) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setDisableDisconnectError(disableDisconnectError);
    }

    @no.a(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public final void setDisableFocus(p0 videoView, boolean disableFocus) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setDisableFocus(disableFocus);
    }

    @no.a(defaultBoolean = false, name = PROP_ENTER_PICTURE_IN_PICTURE_ON_LEAVE)
    public final void setEnterPictureInPictureOnLeave(p0 videoView, boolean enterPictureInPictureOnLeave) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setEnterPictureInPictureOnLeave(enterPictureInPictureOnLeave);
    }

    @no.a(defaultBoolean = true, name = PROP_FOCUSABLE)
    public final void setFocusable(p0 videoView, boolean focusable) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setFocusable(focusable);
    }

    @no.a(defaultBoolean = false, name = PROP_FULLSCREEN)
    public final void setFullscreen(p0 videoView, boolean fullscreen) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setFullscreen(fullscreen);
    }

    @no.a(name = PROP_MAXIMUM_BIT_RATE)
    public final void setMaxBitRate(p0 videoView, float maxBitRate) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setMaxBitRateModifier((int) maxBitRate);
    }

    @no.a(defaultBoolean = false, name = PROP_MUTED)
    public final void setMuted(p0 videoView, boolean muted) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setMutedModifier(muted);
    }

    @no.a(defaultBoolean = false, name = PROP_PAUSED)
    public final void setPaused(p0 videoView, boolean paused) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setPausedModifier(paused);
    }

    @no.a(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public final void setPlayInBackground(p0 videoView, boolean playInBackground) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setPlayInBackground(playInBackground);
    }

    @no.a(defaultBoolean = false, name = PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK)
    public final void setPreventsDisplaySleepDuringVideoPlayback(p0 videoView, boolean preventsSleep) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setPreventsDisplaySleepDuringVideoPlayback(preventsSleep);
    }

    @no.a(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public final void setProgressUpdateInterval(p0 videoView, float progressUpdateInterval) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setProgressUpdateInterval(progressUpdateInterval);
    }

    @no.a(name = PROP_RATE)
    public final void setRate(p0 videoView, float rate) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setRateModifier(rate);
    }

    @no.a(defaultBoolean = false, name = PROP_REPEAT)
    public final void setRepeat(p0 videoView, boolean repeat) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setRepeatModifier(repeat);
    }

    @no.a(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public final void setReportBandwidth(p0 videoView, boolean reportBandwidth) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setReportBandwidth(reportBandwidth);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r5.equals("none") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r4.setResizeModeModifier(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r5.equals("contain") == false) goto L19;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @no.a(name = com.brentvatne.exoplayer.ReactExoplayerViewManager.PROP_RESIZE_MODE)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setResizeMode(com.brentvatne.exoplayer.p0 r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "videoView"
            p013kotlin.jvm.internal.s.k(r4, r0)
            java.lang.String r0 = "resizeMode"
            p013kotlin.jvm.internal.s.k(r5, r0)
            int r0 = r5.hashCode()
            r1 = 0
            switch(r0) {
                case -1881872635: goto L36;
                case 3387192: goto L2a;
                case 94852023: goto L1c;
                case 951526612: goto L13;
                default: goto L12;
            }
        L12:
            goto L3e
        L13:
            java.lang.String r0 = "contain"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L32
            goto L3e
        L1c:
            java.lang.String r0 = "cover"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L25
            goto L3e
        L25:
            r5 = 4
            r4.setResizeModeModifier(r5)
            return
        L2a:
            java.lang.String r0 = "none"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L3e
        L32:
            r4.setResizeModeModifier(r1)
            return
        L36:
            java.lang.String r0 = "stretch"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5d
        L3e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unsupported resize mode: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = " - falling back to fit"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "ExoViewManager"
            xi.a.f(r0, r5)
            r4.setResizeModeModifier(r1)
            return
        L5d:
            r5 = 3
            r4.setResizeModeModifier(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.ReactExoplayerViewManager.setResizeMode(com.brentvatne.exoplayer.p0, java.lang.String):void");
    }

    @no.a(name = PROP_SELECTED_AUDIO_TRACK)
    public final void setSelectedAudioTrack(p0 videoView, ReadableMap selectedAudioTrack) {
        String strG;
        String strG2;
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        if (selectedAudioTrack != null) {
            strG = xi.b.g(selectedAudioTrack, "type");
            strG2 = xi.b.g(selectedAudioTrack, "value");
        } else {
            strG = null;
            strG2 = null;
        }
        videoView.setSelectedAudioTrack(strG, strG2);
    }

    @no.a(name = PROP_SELECTED_TEXT_TRACK)
    public final void setSelectedTextTrack(p0 videoView, ReadableMap selectedTextTrack) {
        String strG;
        String strG2;
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        if (selectedTextTrack != null) {
            strG = xi.b.g(selectedTextTrack, "type");
            strG2 = xi.b.g(selectedTextTrack, "value");
        } else {
            strG = null;
            strG2 = null;
        }
        videoView.setSelectedTextTrack(strG, strG2);
    }

    @no.a(name = PROP_SELECTED_VIDEO_TRACK)
    public final void setSelectedVideoTrack(p0 videoView, ReadableMap selectedVideoTrack) {
        String strG;
        String strG2;
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        if (selectedVideoTrack != null) {
            strG = xi.b.g(selectedVideoTrack, "type");
            strG2 = xi.b.g(selectedVideoTrack, "value");
        } else {
            strG = null;
            strG2 = null;
        }
        videoView.setSelectedVideoTrack(strG, strG2);
    }

    @no.a(name = PROP_SHOW_NOTIFICATION_CONTROLS)
    public final void setShowNotificationControls(p0 videoView, boolean showNotificationControls) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setShowNotificationControls(showNotificationControls);
    }

    @no.a(defaultInt = -16777216, name = PROP_SHUTTER_COLOR)
    public final void setShutterColor(p0 videoView, int color) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setShutterColor(Integer.valueOf(color));
    }

    @no.a(name = PROP_SRC)
    public final void setSrc(p0 videoView, ReadableMap src) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        Context applicationContext = videoView.getContext().getApplicationContext();
        vi.i.Companion companion = vi.i.INSTANCE;
        p013kotlin.jvm.internal.s.h(applicationContext);
        videoView.setSrc(companion.c(src, applicationContext));
    }

    @no.a(name = PROP_SUBTITLE_STYLE)
    public final void setSubtitleStyle(p0 videoView, ReadableMap src) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setSubtitleStyle(vi.j.INSTANCE.a(src));
    }

    @no.a(defaultInt = 1, name = PROP_VIEW_TYPE)
    public final void setViewType(p0 videoView, int viewType) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setViewType(viewType);
    }

    @no.a(defaultFloat = 1.0f, name = PROP_VOLUME)
    public final void setVolume(p0 videoView, float volume) {
        p013kotlin.jvm.internal.s.k(videoView, "videoView");
        videoView.setVolumeModifier(volume);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(com.facebook.react.uimanager.v0 reactContext, p0 view) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        p013kotlin.jvm.internal.s.k(view, "view");
        super.addEventEmitters(reactContext, view);
        view.f20354a.T(reactContext, view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public p0 createViewInstance(com.facebook.react.uimanager.v0 themedReactContext) {
        p013kotlin.jvm.internal.s.k(themedReactContext, "themedReactContext");
        yi.c.INSTANCE.a().k(this);
        return new p0(themedReactContext, this.config);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(p0 view) {
        p013kotlin.jvm.internal.s.k(view, "view");
        view.I0();
        view.S0();
        yi.c.INSTANCE.a().l(this);
    }
}
