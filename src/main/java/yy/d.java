package yy;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.oney.WebRTCModule.WebRTCModule;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import jn0.h0;
import org.webrtc.AudioTrack;
import org.webrtc.AudioTrackSink;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0017J%\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eRT\u0010#\u001aB\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b\u0012\f\u0012\n  *\u0004\u0018\u00010\u00060\u0006  * \u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b\u0012\f\u0012\n  *\u0004\u0018\u00010\u00060\u0006\u0018\u00010!0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"¨\u0006$"}, d2 = {"Lyy/d;", "", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "Lorg/webrtc/AudioTrackSink;", "sink", "", "e", "(Lorg/webrtc/AudioTrackSink;)Ljava/lang/String;", "reactTag", "Ljn0/h0;", "f", "(Ljava/lang/String;)V", "g", "(Lorg/webrtc/AudioTrackSink;)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Lorg/webrtc/AudioTrackSink;", "", "pcId", "trackId", "a", "(Lorg/webrtc/AudioTrackSink;ILjava/lang/String;)V", "c", "sinkReactTag", "b", "(Ljava/lang/String;ILjava/lang/String;)V", "Lcom/facebook/react/bridge/ReactContext;", "getReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Map;", "sinks", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactContext reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, AudioTrackSink> sinks;

    public d(ReactContext reactContext) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.sinks = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final void a(AudioTrackSink sink, int pcId, String trackId) {
        s.k(sink, "sink");
        s.k(trackId, "trackId");
        WebRTCModule webRTCModule = (WebRTCModule) this.reactContext.getNativeModule(WebRTCModule.class);
        if (webRTCModule == null) {
            throw new IllegalArgumentException("Couldn't find WebRTC module!");
        }
        MediaStreamTrack track = webRTCModule.getTrack(pcId, trackId);
        AudioTrack audioTrack = track instanceof AudioTrack ? (AudioTrack) track : null;
        if (audioTrack != null) {
            if (pcId == -1) {
                wy.b.f122420a.c().b(sink);
                return;
            } else {
                audioTrack.addSink(sink);
                return;
            }
        }
        throw new IllegalArgumentException("Couldn't find audio track for pcID:" + pcId + ", trackId:" + trackId);
    }

    public final void b(String sinkReactTag, int pcId, String trackId) {
        s.k(sinkReactTag, "sinkReactTag");
        s.k(trackId, "trackId");
        AudioTrackSink audioTrackSink = this.sinks.get(sinkReactTag);
        if (audioTrackSink != null) {
            c(audioTrackSink, pcId, trackId);
            return;
        }
        throw new IllegalArgumentException("Couldn't find audio sink for react tag: " + sinkReactTag);
    }

    public final void c(AudioTrackSink sink, int pcId, String trackId) {
        s.k(sink, "sink");
        s.k(trackId, "trackId");
        WebRTCModule webRTCModule = (WebRTCModule) this.reactContext.getNativeModule(WebRTCModule.class);
        if (webRTCModule == null) {
            throw new IllegalArgumentException("Couldn't find WebRTC module!");
        }
        MediaStreamTrack track = webRTCModule.getTrack(pcId, trackId);
        AudioTrack audioTrack = track instanceof AudioTrack ? (AudioTrack) track : null;
        if (audioTrack == null) {
            return;
        }
        if (pcId == -1) {
            wy.b.f122420a.c().c(sink);
        } else {
            audioTrack.removeSink(sink);
        }
    }

    public final AudioTrackSink d(String reactTag) {
        s.k(reactTag, "reactTag");
        return this.sinks.get(reactTag);
    }

    public final String e(AudioTrackSink sink) {
        s.k(sink, "sink");
        String string = UUID.randomUUID().toString();
        s.j(string, "toString(...)");
        Map<String, AudioTrackSink> sinks = this.sinks;
        s.j(sinks, "sinks");
        sinks.put(string, sink);
        return string;
    }

    public final void f(String reactTag) {
        s.k(reactTag, "reactTag");
        this.sinks.remove(reactTag);
    }

    public final void g(AudioTrackSink sink) {
        s.k(sink, "sink");
        Map<String, AudioTrackSink> sinks = this.sinks;
        s.j(sinks, "sinks");
        synchronized (sinks) {
            try {
                Map<String, AudioTrackSink> sinks2 = this.sinks;
                s.j(sinks2, "sinks");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, AudioTrackSink> entry : sinks2.entrySet()) {
                    if (s.f(entry.getValue(), sink)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.keySet().iterator();
                while (it.hasNext()) {
                    this.sinks.remove((String) it.next());
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
