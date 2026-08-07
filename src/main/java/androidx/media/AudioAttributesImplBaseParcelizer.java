package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f9003a = versionedParcel.p(audioAttributesImplBase.f9003a, 1);
        audioAttributesImplBase.f9004b = versionedParcel.p(audioAttributesImplBase.f9004b, 2);
        audioAttributesImplBase.f9005c = versionedParcel.p(audioAttributesImplBase.f9005c, 3);
        audioAttributesImplBase.f9006d = versionedParcel.p(audioAttributesImplBase.f9006d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.f9003a, 1);
        versionedParcel.F(audioAttributesImplBase.f9004b, 2);
        versionedParcel.F(audioAttributesImplBase.f9005c, 3);
        versionedParcel.F(audioAttributesImplBase.f9006d, 4);
    }
}
