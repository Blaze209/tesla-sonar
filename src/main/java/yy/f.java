package yy;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.AudioTrackSink;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyy/f;", "Lorg/webrtc/AudioTrackSink;", "<init>", "()V", "", "byteArray", "Ljn0/h0;", "a", "([B)V", "Ljava/nio/ByteBuffer;", "audioData", "", "bitsPerSample", "sampleRate", "numberOfChannels", "numberOfFrames", "", "absoluteCaptureTimestampMs", "onData", "(Ljava/nio/ByteBuffer;IIIIJ)V", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class f implements AudioTrackSink {
    public abstract void a(byte[] byteArray);

    @Override // org.webrtc.AudioTrackSink
    public void onData(ByteBuffer audioData, int bitsPerSample, int sampleRate, int numberOfChannels, int numberOfFrames, long absoluteCaptureTimestampMs) {
        byte[] bArrCopyOfRange;
        s.k(audioData, "audioData");
        if (audioData.hasArray()) {
            byte[] bArrArray = audioData.array();
            bArrCopyOfRange = Arrays.copyOfRange(bArrArray, audioData.arrayOffset(), bArrArray.length);
        } else {
            audioData.mark();
            audioData.position(0);
            byte[] bArr = new byte[audioData.remaining()];
            audioData.get(bArr);
            audioData.reset();
            bArrCopyOfRange = bArr;
        }
        a(bArrCopyOfRange);
    }
}
