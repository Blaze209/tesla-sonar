package org.webrtc.audio;

import android.media.AudioAttributes;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lorg/webrtc/audio/WebRtcAudioTrackHelper;", "", "<init>", "()V", "Lorg/webrtc/audio/JavaAudioDeviceModule;", "adm", "Landroid/media/AudioAttributes;", "getAudioOutputAttributes", "(Lorg/webrtc/audio/JavaAudioDeviceModule;)Landroid/media/AudioAttributes;", "audioAttributes", "Ljn0/h0;", "setAudioOutputAttributes", "(Lorg/webrtc/audio/JavaAudioDeviceModule;Landroid/media/AudioAttributes;)V", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WebRtcAudioTrackHelper {
    public static final WebRtcAudioTrackHelper INSTANCE = new WebRtcAudioTrackHelper();

    private WebRtcAudioTrackHelper() {
    }

    public final AudioAttributes getAudioOutputAttributes(JavaAudioDeviceModule adm) {
        s.k(adm, "adm");
        AudioAttributes audioAttributes = adm.audioOutput.audioAttributes;
        if (audioAttributes != null) {
            return audioAttributes;
        }
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
        s.j(audioAttributesBuild, "build(...)");
        return audioAttributesBuild;
    }

    public final void setAudioOutputAttributes(JavaAudioDeviceModule adm, AudioAttributes audioAttributes) {
        s.k(adm, "adm");
        s.k(audioAttributes, "audioAttributes");
        adm.audioOutput.audioAttributes = audioAttributes;
    }
}
