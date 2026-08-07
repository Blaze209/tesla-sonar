package wi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0010$\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002(\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ+\u0010\u000f\u001a\u00020\u00072\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\rH\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u008a\u0001\u0010.\u001aj\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\r\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\r\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u0004j\b\u0012\u0004\u0012\u00020\n`\r\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u001a0%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R>\u00108\u001a\u001e\u0012\u0004\u0012\u00020'\u0012\b\u0012\u000600j\u0002`1\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a0/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R@\u0010A\u001a \u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001a098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@RB\u0010E\u001a\"\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020\u001a098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R4\u0010N\u001a\u0014\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u001a0F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR4\u0010R\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001a0F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bO\u0010I\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR(\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010\u001f\u001a\u0004\bT\u0010!\"\u0004\bU\u0010#R(\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010\u001f\u001a\u0004\bX\u0010!\"\u0004\bY\u0010#R(\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\u001f\u001a\u0004\b\\\u0010!\"\u0004\b]\u0010#R(\u0010b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010\u001f\u001a\u0004\b`\u0010!\"\u0004\ba\u0010#R(\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010\u001f\u001a\u0004\bd\u0010!\"\u0004\be\u0010#R(\u0010j\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bg\u0010\u001f\u001a\u0004\bh\u0010!\"\u0004\bi\u0010#R.\u0010r\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR.\u0010v\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bs\u0010m\u001a\u0004\bt\u0010o\"\u0004\bu\u0010qR(\u0010z\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bw\u0010\u001f\u001a\u0004\bx\u0010!\"\u0004\by\u0010#R>\u0010\u007f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020{0\u0004j\b\u0012\u0004\u0012\u00020{`\r\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b|\u0010m\u001a\u0004\b}\u0010o\"\u0004\b~\u0010qR,\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010\u001f\u001a\u0005\b\u0081\u0001\u0010!\"\u0005\b\u0082\u0001\u0010#R2\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010m\u001a\u0005\b\u0085\u0001\u0010o\"\u0005\b\u0086\u0001\u0010qR3\u0010\u008c\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010m\u001a\u0005\b\u008a\u0001\u0010o\"\u0005\b\u008b\u0001\u0010qR3\u0010\u0090\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0088\u0001\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010m\u001a\u0005\b\u008e\u0001\u0010o\"\u0005\b\u008f\u0001\u0010qRF\u0010\u0094\u0001\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\r\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010m\u001a\u0005\b\u0092\u0001\u0010o\"\u0005\b\u0093\u0001\u0010qRF\u0010\u0098\u0001\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\r\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010m\u001a\u0005\b\u0096\u0001\u0010o\"\u0005\b\u0097\u0001\u0010qRF\u0010\u009c\u0001\u001a\"\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\r\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010m\u001a\u0005\b\u009a\u0001\u0010o\"\u0005\b\u009b\u0001\u0010qR2\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010m\u001a\u0005\b\u009e\u0001\u0010o\"\u0005\b\u009f\u0001\u0010qRK\u0010¥\u0001\u001a'\u0012\u0004\u0012\u00020'\u0012\u0017\u0012\u0015\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00010'\u0018\u00010¡\u0001\u0012\u0004\u0012\u00020\u001a0F8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¢\u0001\u0010I\u001a\u0005\b£\u0001\u0010K\"\u0005\b¤\u0001\u0010MR2\u0010©\u0001\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u001a0k8\u0006@\u0006X\u0086.¢\u0006\u0015\n\u0005\b¦\u0001\u0010m\u001a\u0005\b§\u0001\u0010o\"\u0005\b¨\u0001\u0010q¨\u0006ª\u0001"}, d2 = {"Lwi/u0;", "", "<init>", "()V", "Ljava/util/ArrayList;", "Lvi/l;", "audioTracks", "Lcom/facebook/react/bridge/WritableArray;", "O0", "(Ljava/util/ArrayList;)Lcom/facebook/react/bridge/WritableArray;", "Lvi/m;", "videoTracks", "r1", "Lkotlin/collections/ArrayList;", "textTracks", "q1", "", "videoWidth", "videoHeight", "Lcom/facebook/react/bridge/WritableMap;", "N0", "(II)Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/uimanager/v0;", "reactContext", "Lcom/brentvatne/exoplayer/p0;", "view", "Ljn0/h0;", "T", "(Lcom/facebook/react/uimanager/v0;Lcom/brentvatne/exoplayer/p0;)V", "Lkotlin/Function0;", "a", "Lwn0/a;", "getOnVideoLoadStart", "()Lwn0/a;", "k1", "(Lwn0/a;)V", "onVideoLoadStart", "Lkotlin/Function8;", "", "", "b", "Lwn0/v;", "getOnVideoLoad", "()Lwn0/v;", "j1", "(Lwn0/v;)V", "onVideoLoad", "Lkotlin/Function3;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "c", "Lwn0/q;", "getOnVideoError", "()Lwn0/q;", "d1", "(Lwn0/q;)V", "onVideoError", "Lkotlin/Function4;", "", DateTokenConverter.CONVERTER_KEY, "Lwn0/r;", "getOnVideoProgress", "()Lwn0/r;", "m1", "(Lwn0/r;)V", "onVideoProgress", "e", "getOnVideoBandwidthUpdate", "a1", "onVideoBandwidthUpdate", "Lkotlin/Function2;", "", "f", "Lwn0/p;", "getOnVideoPlaybackStateChanged", "()Lwn0/p;", "l1", "(Lwn0/p;)V", "onVideoPlaybackStateChanged", "g", "getOnVideoSeek", "n1", "onVideoSeek", "h", "getOnVideoEnd", "c1", "onVideoEnd", IntegerTokenConverter.CONVERTER_KEY, "getOnVideoFullscreenPlayerWillPresent", "h1", "onVideoFullscreenPlayerWillPresent", "j", "getOnVideoFullscreenPlayerDidPresent", "f1", "onVideoFullscreenPlayerDidPresent", "k", "getOnVideoFullscreenPlayerWillDismiss", "g1", "onVideoFullscreenPlayerWillDismiss", "l", "getOnVideoFullscreenPlayerDidDismiss", "e1", "onVideoFullscreenPlayerDidDismiss", "m", "getOnReadyForDisplay", "U0", "onReadyForDisplay", "Lkotlin/Function1;", "n", "Lwn0/l;", "getOnVideoBuffer", "()Lwn0/l;", "b1", "(Lwn0/l;)V", "onVideoBuffer", "o", "getOnControlsVisibilityChange", "R0", "onControlsVisibilityChange", "p", "getOnVideoIdle", "i1", "onVideoIdle", "Lvi/k;", "q", "getOnTimedMetadata", "Y0", "onTimedMetadata", "r", "getOnVideoAudioBecomingNoisy", "Z0", "onVideoAudioBecomingNoisy", "s", "getOnAudioFocusChanged", "P0", "onAudioFocusChanged", "", "t", "getOnPlaybackRateChange", "T0", "onPlaybackRateChange", "u", "getOnVolumeChange", "p1", "onVolumeChange", "v", "getOnAudioTracks", "Q0", "onAudioTracks", "w", "getOnTextTracks", "X0", "onTextTracks", "x", "getOnVideoTracks", "o1", "onVideoTracks", "y", "getOnTextTrackDataChanged", "W0", "onTextTrackDataChanged", "", "z", "getOnReceiveAdEvent", "V0", "onReceiveAdEvent", "A", "getOnPictureInPictureStatusChanged", "S0", "onPictureInPictureStatusChanged", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public wn0.l<? super Boolean, jn0.h0> onPictureInPictureStatusChanged;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onVideoLoadStart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public wn0.v<? super Long, ? super Long, ? super Integer, ? super Integer, ? super ArrayList<vi.l>, ? super ArrayList<vi.l>, ? super ArrayList<vi.m>, ? super String, jn0.h0> onVideoLoad;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public wn0.q<? super String, ? super Exception, ? super String, jn0.h0> onVideoError;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public wn0.r<? super Long, ? super Long, ? super Long, ? super Double, jn0.h0> onVideoProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public wn0.r<? super Long, ? super Integer, ? super Integer, ? super String, jn0.h0> onVideoBandwidthUpdate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public wn0.p<? super Boolean, ? super Boolean, jn0.h0> onVideoPlaybackStateChanged;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public wn0.p<? super Long, ? super Long, jn0.h0> onVideoSeek;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onVideoEnd;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onVideoFullscreenPlayerWillPresent;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onVideoFullscreenPlayerDidPresent;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onVideoFullscreenPlayerWillDismiss;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onVideoFullscreenPlayerDidDismiss;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onReadyForDisplay;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super Boolean, jn0.h0> onVideoBuffer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super Boolean, jn0.h0> onControlsVisibilityChange;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onVideoIdle;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super ArrayList<vi.k>, jn0.h0> onTimedMetadata;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public wn0.a<jn0.h0> onVideoAudioBecomingNoisy;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super Boolean, jn0.h0> onAudioFocusChanged;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super Float, jn0.h0> onPlaybackRateChange;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super Float, jn0.h0> onVolumeChange;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super ArrayList<vi.l>, jn0.h0> onAudioTracks;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super ArrayList<vi.l>, jn0.h0> onTextTracks;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super ArrayList<vi.m>, jn0.h0> onVideoTracks;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public wn0.l<? super String, jn0.h0> onTextTrackDataChanged;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public wn0.p<? super String, ? super Map<String, String>, jn0.h0> onReceiveAdEvent;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\u000f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwi/u0$a;", "", "", "surfaceId", "viewId", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "dispatcher", "<init>", "(IILcom/facebook/react/uimanager/events/EventDispatcher;)V", "Lwi/a;", "event", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/WritableMap;", "Ljn0/h0;", "paramsSetter", "a", "(Lwi/a;Lwn0/l;)V", "I", "b", "c", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int surfaceId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int viewId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final EventDispatcher dispatcher;

        public a(int i11, int i12, EventDispatcher dispatcher) {
            p013kotlin.jvm.internal.s.k(dispatcher, "dispatcher");
            this.surfaceId = i11;
            this.viewId = i12;
            this.dispatcher = dispatcher;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(a aVar, wi.a aVar2, wn0.l lVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                lVar = null;
            }
            aVar.a(aVar2, lVar);
        }

        public final void a(wi.a event, wn0.l<? super WritableMap, jn0.h0> paramsSetter) {
            p013kotlin.jvm.internal.s.k(event, "event");
            this.dispatcher.h(new b(this.surfaceId, this.viewId, event, paramsSetter));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lwi/u0$b;", "Lcom/facebook/react/uimanager/events/d;", "", "surfaceId", "viewId", "Lwi/a;", "event", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/WritableMap;", "Ljn0/h0;", "paramsSetter", "<init>", "(IILwi/a;Lwn0/l;)V", "", "getEventName", "()Ljava/lang/String;", "getEventData", "()Lcom/facebook/react/bridge/WritableMap;", "a", "Lwi/a;", "b", "Lwn0/l;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class b extends com.facebook.react.uimanager.events.d<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wi.a event;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final wn0.l<WritableMap, jn0.h0> paramsSetter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i11, int i12, wi.a event, wn0.l<? super WritableMap, jn0.h0> lVar) {
            super(i11, i12);
            p013kotlin.jvm.internal.s.k(event, "event");
            this.event = event;
            this.paramsSetter = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(WritableMap writableMap) {
            p013kotlin.jvm.internal.s.k(writableMap, "<this>");
            return jn0.h0.f84049a;
        }

        @Override // com.facebook.react.uimanager.events.d
        /* JADX INFO: renamed from: getEventData */
        protected WritableMap getData() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            wn0.l<WritableMap, jn0.h0> lVar = this.paramsSetter;
            if (lVar == null) {
                lVar = new wn0.l() { // from class: wi.v0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return u0.b.b((WritableMap) obj);
                    }
                };
            }
            lVar.invoke(writableMapCreateMap);
            return writableMapCreateMap;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return "top" + p013kotlin.text.t.T0(this.event.getEventName(), DebugKt.DEBUG_PROPERTY_VALUE_ON);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 A0(float f11, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putDouble("volume", f11);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 B0(a aVar, final u0 u0Var, final ArrayList arrayList) {
        aVar.a(wi.a.EVENT_AUDIO_TRACKS, new wn0.l() { // from class: wi.z
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.C0(this.f121973a, arrayList, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 C0(u0 u0Var, ArrayList arrayList, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putArray("audioTracks", u0Var.O0(arrayList));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 D0(a aVar, final u0 u0Var, final ArrayList arrayList) {
        aVar.a(wi.a.EVENT_TEXT_TRACKS, new wn0.l() { // from class: wi.e0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.E0(this.f121890a, arrayList, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 E0(u0 u0Var, ArrayList arrayList, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putArray("textTracks", u0Var.q1(arrayList));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 F0(a aVar, final u0 u0Var, final ArrayList arrayList) {
        aVar.a(wi.a.EVENT_VIDEO_TRACKS, new wn0.l() { // from class: wi.m0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.G0(this.f121915a, arrayList, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 G0(u0 u0Var, ArrayList arrayList, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putArray("videoTracks", u0Var.r1(arrayList));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 H0(a aVar, final String textTrackData) {
        p013kotlin.jvm.internal.s.k(textTrackData, "textTrackData");
        aVar.a(wi.a.EVENT_TEXT_TRACK_DATA_CHANGED, new wn0.l() { // from class: wi.w
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.I0(textTrackData, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 I0(String str, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putString("subtitleTracks", str);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 J0(a aVar, final String adEvent, final Map map) {
        p013kotlin.jvm.internal.s.k(adEvent, "adEvent");
        aVar.a(wi.a.EVENT_ON_RECEIVE_AD_EVENT, new wn0.l() { // from class: wi.l0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.K0(adEvent, map, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 K0(String str, Map map, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putString("event", str);
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                p013kotlin.jvm.internal.s.h(str2);
                writableMapCreateMap.putString(str2, str3);
            }
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        dispatch.putMap("data", writableMapCreateMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 L0(a aVar, final boolean z11) {
        aVar.a(wi.a.EVENT_PICTURE_IN_PICTURE_STATUS_CHANGED, new wn0.l() { // from class: wi.a0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.M0(z11, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 M0(boolean z11, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putBoolean("isActive", z11);
        return jn0.h0.f84049a;
    }

    private final WritableMap N0(int videoWidth, int videoHeight) {
        String str;
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (videoWidth > 0) {
            writableMapCreateMap.putInt(Snapshot.WIDTH, videoWidth);
        }
        if (videoHeight > 0) {
            writableMapCreateMap.putInt(Snapshot.HEIGHT, videoHeight);
        }
        if (videoWidth > videoHeight) {
            str = "landscape";
        } else {
            str = videoWidth < videoHeight ? "portrait" : "square";
        }
        writableMapCreateMap.putString("orientation", str);
        p013kotlin.jvm.internal.s.j(writableMapCreateMap, "apply(...)");
        return writableMapCreateMap;
    }

    private final WritableArray O0(ArrayList<vi.l> audioTracks) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (audioTracks != null) {
            int i11 = 0;
            for (Object obj : audioTracks) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p013kotlin.collections.v.x();
                }
                vi.l lVar = (vi.l) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("index", i11);
                writableMapCreateMap.putString("title", lVar.getTitle());
                String mimeType = lVar.getMimeType();
                if (mimeType != null) {
                    writableMapCreateMap.putString("type", mimeType);
                }
                String language = lVar.getLanguage();
                if (language != null) {
                    writableMapCreateMap.putString("language", language);
                }
                if (lVar.getBitrate() > 0) {
                    writableMapCreateMap.putInt("bitrate", lVar.getBitrate());
                }
                writableMapCreateMap.putBoolean("selected", lVar.getIsSelected());
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i11 = i12;
            }
        }
        p013kotlin.jvm.internal.s.j(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 U(a aVar) {
        a.b(aVar, wi.a.EVENT_LOAD_START, null, 2, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V(a aVar, final String errorString, final Exception exception, final String errorCode) {
        p013kotlin.jvm.internal.s.k(errorString, "errorString");
        p013kotlin.jvm.internal.s.k(exception, "exception");
        p013kotlin.jvm.internal.s.k(errorCode, "errorCode");
        aVar.a(wi.a.EVENT_ERROR, new wn0.l() { // from class: wi.n0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.W(exception, errorString, errorCode, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 W(Exception exc, String str, String str2, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        WritableMap writableMapCreateMap = Arguments.createMap();
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        writableMapCreateMap.putString("errorString", str);
        writableMapCreateMap.putString("errorException", exc.toString());
        writableMapCreateMap.putString("errorCode", str2);
        writableMapCreateMap.putString("errorStackTrace", string);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("name", exc.getClass().getSimpleName());
        String message = exc.getMessage();
        if (message != null) {
            writableMapCreateMap2.putString("message", message);
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        StackTraceElement[] stackTrace = exc.getStackTrace();
        p013kotlin.jvm.internal.s.j(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            WritableMap writableMapCreateMap3 = Arguments.createMap();
            writableMapCreateMap3.putString("className", stackTraceElement.getClassName());
            writableMapCreateMap3.putString("fileName", stackTraceElement.getFileName());
            writableMapCreateMap3.putInt("lineNumber", stackTraceElement.getLineNumber());
            writableMapCreateMap3.putString("methodName", stackTraceElement.getMethodName());
            writableArrayCreateArray.pushMap(writableMapCreateMap3);
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        writableMapCreateMap2.putArray("stackElements", writableArrayCreateArray);
        writableMapCreateMap.putMap("cause", writableMapCreateMap2);
        dispatch.putMap(AnalyticsAttribute.Error, writableMapCreateMap);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 X(a aVar, final long j11, final long j12, final long j13, final double d11) {
        aVar.a(wi.a.EVENT_PROGRESS, new wn0.l() { // from class: wi.y
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.Y(j11, j12, j13, d11, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Y(long j11, long j12, long j13, double d11, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putDouble("currentTime", j11 / 1000.0d);
        dispatch.putDouble("playableDuration", j12 / 1000.0d);
        dispatch.putDouble("seekableDuration", j13 / 1000.0d);
        dispatch.putDouble("currentPlaybackTime", d11);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Z(a aVar, final long j11, final int i11, final int i12, final String str) {
        aVar.a(wi.a.EVENT_BANDWIDTH, new wn0.l() { // from class: wi.j0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.a0(j11, i12, i11, str, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a0(long j11, int i11, int i12, String str, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putDouble("bitrate", j11);
        if (i11 > 0) {
            dispatch.putInt(Snapshot.WIDTH, i11);
        }
        if (i12 > 0) {
            dispatch.putInt(Snapshot.HEIGHT, i12);
        }
        if (str != null) {
            dispatch.putString("trackId", str);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b0(a aVar, final boolean z11, final boolean z12) {
        aVar.a(wi.a.EVENT_PLAYBACK_STATE_CHANGED, new wn0.l() { // from class: wi.k0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.c0(z11, z12, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c0(boolean z11, boolean z12, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putBoolean("isPlaying", z11);
        dispatch.putBoolean("isSeeking", z12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d0(a aVar, final long j11, final long j12) {
        aVar.a(wi.a.EVENT_SEEK, new wn0.l() { // from class: wi.v
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.e0(j11, j12, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e0(long j11, long j12, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putDouble("currentTime", j11 / 1000.0d);
        dispatch.putDouble("seekTime", j12 / 1000.0d);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f0(a aVar) {
        a.b(aVar, wi.a.EVENT_END, null, 2, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g0(a aVar) {
        a.b(aVar, wi.a.EVENT_FULLSCREEN_WILL_PRESENT, null, 2, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h0(a aVar) {
        a.b(aVar, wi.a.EVENT_FULLSCREEN_DID_PRESENT, null, 2, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i0(a aVar) {
        a.b(aVar, wi.a.EVENT_FULLSCREEN_WILL_DISMISS, null, 2, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j0(a aVar) {
        a.b(aVar, wi.a.EVENT_FULLSCREEN_DID_DISMISS, null, 2, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k0(a aVar) {
        a.b(aVar, wi.a.EVENT_READY, null, 2, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l0(a aVar, final boolean z11) {
        aVar.a(wi.a.EVENT_BUFFER, new wn0.l() { // from class: wi.b0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.m0(z11, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m0(boolean z11, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putBoolean("isBuffering", z11);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n0(a aVar, final u0 u0Var, final long j11, final long j12, final int i11, final int i12, final ArrayList audioTracks, final ArrayList textTracks, final ArrayList videoTracks, final String str) {
        p013kotlin.jvm.internal.s.k(audioTracks, "audioTracks");
        p013kotlin.jvm.internal.s.k(textTracks, "textTracks");
        p013kotlin.jvm.internal.s.k(videoTracks, "videoTracks");
        aVar.a(wi.a.EVENT_LOAD, new wn0.l() { // from class: wi.d0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.o0(j11, j12, u0Var, i11, i12, str, videoTracks, audioTracks, textTracks, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 o0(long j11, long j12, u0 u0Var, int i11, int i12, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putDouble("duration", j11 / 1000.0d);
        dispatch.putDouble("currentTime", j12 / 1000.0d);
        dispatch.putMap("naturalSize", u0Var.N0(i11, i12));
        if (str != null) {
            dispatch.putString("trackId", str);
        }
        dispatch.putArray("videoTracks", u0Var.r1(arrayList));
        dispatch.putArray("audioTracks", u0Var.O0(arrayList2));
        dispatch.putArray("textTracks", u0Var.q1(arrayList3));
        dispatch.putBoolean("canPlayFastForward", true);
        dispatch.putBoolean("canPlaySlowForward", true);
        dispatch.putBoolean("canPlaySlowReverse", true);
        dispatch.putBoolean("canPlayReverse", true);
        dispatch.putBoolean("canPlayFastForward", true);
        dispatch.putBoolean("canStepBackward", true);
        dispatch.putBoolean("canStepForward", true);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p0(a aVar, final boolean z11) {
        aVar.a(wi.a.EVENT_CONTROLS_VISIBILITY_CHANGE, new wn0.l() { // from class: wi.h0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.q0(z11, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q0(boolean z11, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putBoolean("isVisible", z11);
        return jn0.h0.f84049a;
    }

    private final WritableArray q1(ArrayList<vi.l> textTracks) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (textTracks != null) {
            int i11 = 0;
            for (Object obj : textTracks) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p013kotlin.collections.v.x();
                }
                vi.l lVar = (vi.l) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt("index", i11);
                writableMapCreateMap.putString("title", lVar.getTitle());
                writableMapCreateMap.putString("type", lVar.getMimeType());
                writableMapCreateMap.putString("language", lVar.getLanguage());
                writableMapCreateMap.putBoolean("selected", lVar.getIsSelected());
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i11 = i12;
            }
        }
        p013kotlin.jvm.internal.s.j(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 r0(a aVar) {
        a.b(aVar, wi.a.EVENT_IDLE, null, 2, null);
        return jn0.h0.f84049a;
    }

    private final WritableArray r1(ArrayList<vi.m> videoTracks) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (videoTracks != null) {
            int i11 = 0;
            for (Object obj : videoTracks) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    p013kotlin.collections.v.x();
                }
                vi.m mVar = (vi.m) obj;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putInt(Snapshot.WIDTH, mVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String());
                writableMapCreateMap.putInt(Snapshot.HEIGHT, mVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String());
                writableMapCreateMap.putInt("bitrate", mVar.getBitrate());
                writableMapCreateMap.putString("codecs", mVar.getCodecs());
                writableMapCreateMap.putString("trackId", mVar.getTrackId());
                writableMapCreateMap.putInt("index", mVar.getIndex());
                writableMapCreateMap.putBoolean("selected", mVar.getIsSelected());
                writableMapCreateMap.putInt("rotation", mVar.getRotation());
                writableArrayCreateArray.pushMap(writableMapCreateMap);
                i11 = i12;
            }
        }
        p013kotlin.jvm.internal.s.j(writableArrayCreateArray, "apply(...)");
        return writableArrayCreateArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 s0(a aVar, final ArrayList metadataArrayList) {
        p013kotlin.jvm.internal.s.k(metadataArrayList, "metadataArrayList");
        if (metadataArrayList.size() == 0) {
            return jn0.h0.f84049a;
        }
        aVar.a(wi.a.EVENT_TIMED_METADATA, new wn0.l() { // from class: wi.f0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.t0(metadataArrayList, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 t0(ArrayList arrayList, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        int i11 = 0;
        for (Object obj : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            vi.k kVar = (vi.k) obj;
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("identifier", kVar.getIdentifier());
            writableMapCreateMap.putString("value", kVar.getValue());
            writableArrayCreateArray.pushMap(writableMapCreateMap);
            i11 = i12;
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        dispatch.putArray(OrcaKeys.METADATA, writableArrayCreateArray);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u0(a aVar) {
        a.b(aVar, wi.a.EVENT_AUDIO_BECOMING_NOISY, null, 2, null);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v0(a aVar, final boolean z11) {
        aVar.a(wi.a.EVENT_AUDIO_FOCUS_CHANGE, new wn0.l() { // from class: wi.g0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.w0(z11, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 w0(boolean z11, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putBoolean("hasAudioFocus", z11);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 x0(a aVar, final float f11) {
        aVar.a(wi.a.EVENT_PLAYBACK_RATE_CHANGE, new wn0.l() { // from class: wi.u
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.y0(f11, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 y0(float f11, WritableMap dispatch) {
        p013kotlin.jvm.internal.s.k(dispatch, "$this$dispatch");
        dispatch.putDouble("playbackRate", f11);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 z0(a aVar, final float f11) {
        aVar.a(wi.a.EVENT_VOLUME_CHANGE, new wn0.l() { // from class: wi.c0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return u0.A0(f11, (WritableMap) obj);
            }
        });
        return jn0.h0.f84049a;
    }

    public final void P0(wn0.l<? super Boolean, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onAudioFocusChanged = lVar;
    }

    public final void Q0(wn0.l<? super ArrayList<vi.l>, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onAudioTracks = lVar;
    }

    public final void R0(wn0.l<? super Boolean, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onControlsVisibilityChange = lVar;
    }

    public final void S0(wn0.l<? super Boolean, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onPictureInPictureStatusChanged = lVar;
    }

    public final void T(com.facebook.react.uimanager.v0 reactContext, com.brentvatne.exoplayer.p0 view) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        p013kotlin.jvm.internal.s.k(view, "view");
        EventDispatcher eventDispatcherC = b1.c(reactContext, view.getId());
        int iE = b1.e(reactContext);
        if (eventDispatcherC != null) {
            final a aVar = new a(iE, view.getId(), eventDispatcherC);
            k1(new wn0.a() { // from class: wi.b
                @Override // wn0.a
                public final Object invoke() {
                    return u0.U(aVar);
                }
            });
            j1(new wn0.v() { // from class: wi.d
                @Override // wn0.v
                public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                    return u0.n0(aVar, this, ((Long) obj).longValue(), ((Long) obj2).longValue(), ((Integer) obj3).intValue(), ((Integer) obj4).intValue(), (ArrayList) obj5, (ArrayList) obj6, (ArrayList) obj7, (String) obj8);
                }
            });
            d1(new wn0.q() { // from class: wi.l
                @Override // wn0.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return u0.V(aVar, (String) obj, (Exception) obj2, (String) obj3);
                }
            });
            m1(new wn0.r() { // from class: wi.n
                @Override // wn0.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return u0.X(aVar, ((Long) obj).longValue(), ((Long) obj2).longValue(), ((Long) obj3).longValue(), ((Double) obj4).doubleValue());
                }
            });
            a1(new wn0.r() { // from class: wi.o
                @Override // wn0.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return u0.Z(aVar, ((Long) obj).longValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue(), (String) obj4);
                }
            });
            l1(new wn0.p() { // from class: wi.p
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return u0.b0(aVar, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                }
            });
            n1(new wn0.p() { // from class: wi.q
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return u0.d0(aVar, ((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            });
            c1(new wn0.a() { // from class: wi.r
                @Override // wn0.a
                public final Object invoke() {
                    return u0.f0(aVar);
                }
            });
            h1(new wn0.a() { // from class: wi.s
                @Override // wn0.a
                public final Object invoke() {
                    return u0.g0(aVar);
                }
            });
            f1(new wn0.a() { // from class: wi.t
                @Override // wn0.a
                public final Object invoke() {
                    return u0.h0(aVar);
                }
            });
            g1(new wn0.a() { // from class: wi.m
                @Override // wn0.a
                public final Object invoke() {
                    return u0.i0(aVar);
                }
            });
            e1(new wn0.a() { // from class: wi.x
                @Override // wn0.a
                public final Object invoke() {
                    return u0.j0(aVar);
                }
            });
            U0(new wn0.a() { // from class: wi.i0
                @Override // wn0.a
                public final Object invoke() {
                    return u0.k0(aVar);
                }
            });
            b1(new wn0.l() { // from class: wi.o0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.l0(aVar, ((Boolean) obj).booleanValue());
                }
            });
            R0(new wn0.l() { // from class: wi.p0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.p0(aVar, ((Boolean) obj).booleanValue());
                }
            });
            i1(new wn0.a() { // from class: wi.q0
                @Override // wn0.a
                public final Object invoke() {
                    return u0.r0(aVar);
                }
            });
            Y0(new wn0.l() { // from class: wi.r0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.s0(aVar, (ArrayList) obj);
                }
            });
            Z0(new wn0.a() { // from class: wi.s0
                @Override // wn0.a
                public final Object invoke() {
                    return u0.u0(aVar);
                }
            });
            P0(new wn0.l() { // from class: wi.t0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.v0(aVar, ((Boolean) obj).booleanValue());
                }
            });
            T0(new wn0.l() { // from class: wi.c
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.x0(aVar, ((Float) obj).floatValue());
                }
            });
            p1(new wn0.l() { // from class: wi.e
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.z0(aVar, ((Float) obj).floatValue());
                }
            });
            Q0(new wn0.l() { // from class: wi.f
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.B0(aVar, this, (ArrayList) obj);
                }
            });
            X0(new wn0.l() { // from class: wi.g
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.D0(aVar, this, (ArrayList) obj);
                }
            });
            o1(new wn0.l() { // from class: wi.h
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.F0(aVar, this, (ArrayList) obj);
                }
            });
            W0(new wn0.l() { // from class: wi.i
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.H0(aVar, (String) obj);
                }
            });
            V0(new wn0.p() { // from class: wi.j
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return u0.J0(aVar, (String) obj, (Map) obj2);
                }
            });
            S0(new wn0.l() { // from class: wi.k
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return u0.L0(aVar, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public final void T0(wn0.l<? super Float, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onPlaybackRateChange = lVar;
    }

    public final void U0(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onReadyForDisplay = aVar;
    }

    public final void V0(wn0.p<? super String, ? super Map<String, String>, jn0.h0> pVar) {
        p013kotlin.jvm.internal.s.k(pVar, "<set-?>");
        this.onReceiveAdEvent = pVar;
    }

    public final void W0(wn0.l<? super String, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onTextTrackDataChanged = lVar;
    }

    public final void X0(wn0.l<? super ArrayList<vi.l>, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onTextTracks = lVar;
    }

    public final void Y0(wn0.l<? super ArrayList<vi.k>, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onTimedMetadata = lVar;
    }

    public final void Z0(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onVideoAudioBecomingNoisy = aVar;
    }

    public final void a1(wn0.r<? super Long, ? super Integer, ? super Integer, ? super String, jn0.h0> rVar) {
        p013kotlin.jvm.internal.s.k(rVar, "<set-?>");
        this.onVideoBandwidthUpdate = rVar;
    }

    public final void b1(wn0.l<? super Boolean, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onVideoBuffer = lVar;
    }

    public final void c1(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onVideoEnd = aVar;
    }

    public final void d1(wn0.q<? super String, ? super Exception, ? super String, jn0.h0> qVar) {
        p013kotlin.jvm.internal.s.k(qVar, "<set-?>");
        this.onVideoError = qVar;
    }

    public final void e1(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onVideoFullscreenPlayerDidDismiss = aVar;
    }

    public final void f1(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onVideoFullscreenPlayerDidPresent = aVar;
    }

    public final void g1(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onVideoFullscreenPlayerWillDismiss = aVar;
    }

    public final void h1(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onVideoFullscreenPlayerWillPresent = aVar;
    }

    public final void i1(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onVideoIdle = aVar;
    }

    public final void j1(wn0.v<? super Long, ? super Long, ? super Integer, ? super Integer, ? super ArrayList<vi.l>, ? super ArrayList<vi.l>, ? super ArrayList<vi.m>, ? super String, jn0.h0> vVar) {
        p013kotlin.jvm.internal.s.k(vVar, "<set-?>");
        this.onVideoLoad = vVar;
    }

    public final void k1(wn0.a<jn0.h0> aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<set-?>");
        this.onVideoLoadStart = aVar;
    }

    public final void l1(wn0.p<? super Boolean, ? super Boolean, jn0.h0> pVar) {
        p013kotlin.jvm.internal.s.k(pVar, "<set-?>");
        this.onVideoPlaybackStateChanged = pVar;
    }

    public final void m1(wn0.r<? super Long, ? super Long, ? super Long, ? super Double, jn0.h0> rVar) {
        p013kotlin.jvm.internal.s.k(rVar, "<set-?>");
        this.onVideoProgress = rVar;
    }

    public final void n1(wn0.p<? super Long, ? super Long, jn0.h0> pVar) {
        p013kotlin.jvm.internal.s.k(pVar, "<set-?>");
        this.onVideoSeek = pVar;
    }

    public final void o1(wn0.l<? super ArrayList<vi.m>, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onVideoTracks = lVar;
    }

    public final void p1(wn0.l<? super Float, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.onVolumeChange = lVar;
    }
}
