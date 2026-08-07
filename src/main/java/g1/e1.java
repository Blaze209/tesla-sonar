package g1;

import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodecInfo f66883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final MediaCodecInfo.CodecCapabilities f66884b;

    e1(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws InvalidConfigException {
        this.f66883a = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.f66884b = capabilitiesForType;
        } catch (RuntimeException e11) {
            throw new InvalidConfigException("Unable to get CodecCapabilities for mime: " + str, e11);
        }
    }
}
