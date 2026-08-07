package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f9001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9002b;

    public AudioAttributesImplApi21() {
        this.f9002b = -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f9001a.equals(((AudioAttributesImplApi21) obj).f9001a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9001a.hashCode();
    }

    @NonNull
    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f9001a;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i11) {
        this.f9001a = audioAttributes;
        this.f9002b = i11;
    }
}
