package yy;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.webrtc.AudioTrackSink;
import org.webrtc.audio.JavaAudioDeviceModule;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R8\u0010\u0016\u001a&\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\b0\b \u0013*\u0012\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\b0\b\u0018\u00010\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, d2 = {"Lyy/c;", "Lorg/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;", "<init>", "()V", "", "audioFormat", "a", "(I)I", "Lorg/webrtc/AudioTrackSink;", "sink", "Ljn0/h0;", "b", "(Lorg/webrtc/AudioTrackSink;)V", "c", "Lorg/webrtc/audio/JavaAudioDeviceModule$AudioSamples;", "samples", "onWebRtcAudioRecordSamplesReady", "(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioSamples;)V", "", "kotlin.jvm.PlatformType", "", "Ljava/util/Set;", "sinks", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c implements JavaAudioDeviceModule.SamplesReadyCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<AudioTrackSink> sinks = Collections.synchronizedSet(new LinkedHashSet());

    private final int a(int audioFormat) {
        if (audioFormat == 0) {
            throw new IllegalArgumentException("Bad audio format " + audioFormat);
        }
        int i11 = 1;
        if (audioFormat != 1 && audioFormat != 2) {
            if (audioFormat != 3) {
                i11 = 4;
                if (audioFormat != 4) {
                    if (audioFormat != 13) {
                        throw new IllegalArgumentException("Bad audio format " + audioFormat);
                    }
                }
            }
            return i11;
        }
        return 2;
    }

    public final synchronized void b(AudioTrackSink sink) {
        s.k(sink, "sink");
        this.sinks.add(sink);
    }

    public final synchronized void c(AudioTrackSink sink) {
        s.k(sink, "sink");
        this.sinks.remove(sink);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public synchronized void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples samples) {
        s.k(samples, "samples");
        int iA = a(samples.getAudioFormat()) * 8;
        int sampleRate = samples.getSampleRate() / 100;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<AudioTrackSink> it = this.sinks.iterator();
        while (it.hasNext()) {
            it.next().onData(ByteBuffer.wrap(samples.getData()), iA, samples.getSampleRate(), samples.getChannelCount(), sampleRate, jElapsedRealtime);
        }
    }
}
