package wi;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b$\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006&"}, d2 = {"Lwi/a;", "", "", "eventName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getEventName", "()Ljava/lang/String;", "Companion", "a", "EVENT_LOAD_START", "EVENT_LOAD", "EVENT_ERROR", "EVENT_PROGRESS", "EVENT_BANDWIDTH", "EVENT_CONTROLS_VISIBILITY_CHANGE", "EVENT_SEEK", "EVENT_END", "EVENT_FULLSCREEN_WILL_PRESENT", "EVENT_FULLSCREEN_DID_PRESENT", "EVENT_FULLSCREEN_WILL_DISMISS", "EVENT_FULLSCREEN_DID_DISMISS", "EVENT_READY", "EVENT_BUFFER", "EVENT_PLAYBACK_STATE_CHANGED", "EVENT_IDLE", "EVENT_TIMED_METADATA", "EVENT_AUDIO_BECOMING_NOISY", "EVENT_AUDIO_FOCUS_CHANGE", "EVENT_PLAYBACK_RATE_CHANGE", "EVENT_VOLUME_CHANGE", "EVENT_AUDIO_TRACKS", "EVENT_TEXT_TRACKS", "EVENT_TEXT_TRACK_DATA_CHANGED", "EVENT_VIDEO_TRACKS", "EVENT_ON_RECEIVE_AD_EVENT", "EVENT_PICTURE_IN_PICTURE_STATUS_CHANGED", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum a {
    EVENT_LOAD_START("onVideoLoadStart"),
    EVENT_LOAD("onVideoLoad"),
    EVENT_ERROR("onVideoError"),
    EVENT_PROGRESS("onVideoProgress"),
    EVENT_BANDWIDTH("onVideoBandwidthUpdate"),
    EVENT_CONTROLS_VISIBILITY_CHANGE("onControlsVisibilityChange"),
    EVENT_SEEK("onVideoSeek"),
    EVENT_END("onVideoEnd"),
    EVENT_FULLSCREEN_WILL_PRESENT("onVideoFullscreenPlayerWillPresent"),
    EVENT_FULLSCREEN_DID_PRESENT("onVideoFullscreenPlayerDidPresent"),
    EVENT_FULLSCREEN_WILL_DISMISS("onVideoFullscreenPlayerWillDismiss"),
    EVENT_FULLSCREEN_DID_DISMISS("onVideoFullscreenPlayerDidDismiss"),
    EVENT_READY("onReadyForDisplay"),
    EVENT_BUFFER("onVideoBuffer"),
    EVENT_PLAYBACK_STATE_CHANGED("onVideoPlaybackStateChanged"),
    EVENT_IDLE("onVideoIdle"),
    EVENT_TIMED_METADATA("onTimedMetadata"),
    EVENT_AUDIO_BECOMING_NOISY("onVideoAudioBecomingNoisy"),
    EVENT_AUDIO_FOCUS_CHANGE("onAudioFocusChanged"),
    EVENT_PLAYBACK_RATE_CHANGE("onPlaybackRateChange"),
    EVENT_VOLUME_CHANGE("onVolumeChange"),
    EVENT_AUDIO_TRACKS("onAudioTracks"),
    EVENT_TEXT_TRACKS("onTextTracks"),
    EVENT_TEXT_TRACK_DATA_CHANGED("onTextTrackDataChanged"),
    EVENT_VIDEO_TRACKS("onVideoTracks"),
    EVENT_ON_RECEIVE_AD_EVENT("onReceiveAdEvent"),
    EVENT_PICTURE_IN_PICTURE_STATUS_CHANGED("onPictureInPictureStatusChanged");

    private final String eventName;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: wi.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwi/a$a;", "", "<init>", "()V", "", "", "a", "()Ljava/util/Map;", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<String, Object> a() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (a aVar : p013kotlin.collections.n.w1(a.values())) {
                linkedHashMap.put("top" + p013kotlin.text.t.T0(aVar.getEventName(), DebugKt.DEBUG_PROPERTY_VALUE_ON), p013kotlin.collections.v0.k(jn0.x.a("registrationName", aVar.getEventName())));
            }
            return linkedHashMap;
        }

        private Companion() {
        }
    }

    a(String str) {
        this.eventName = str;
    }

    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public final String getEventName() {
        return this.eventName;
    }
}
