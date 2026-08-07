package rf0;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrf0/e;", "", "<init>", "()V", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusChangeListener", "", "focusMode", "audioAttributeUsageType", "audioAttributeContentType", "Landroid/media/AudioFocusRequest;", "a", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;III)Landroid/media/AudioFocusRequest;", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
public final class e {
    @SuppressLint({"NewApi"})
    public final AudioFocusRequest a(AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, int focusMode, int audioAttributeUsageType, int audioAttributeContentType) {
        s.k(audioFocusChangeListener, "audioFocusChangeListener");
        AudioFocusRequest audioFocusRequestBuild = q7.a.a(focusMode).setAudioAttributes(new AudioAttributes.Builder().setUsage(audioAttributeUsageType).setContentType(audioAttributeContentType).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(audioFocusChangeListener).build();
        s.j(audioFocusRequestBuild, "AudioFocusRequest.Builde…ner)\n            .build()");
        return audioFocusRequestBuild;
    }
}
