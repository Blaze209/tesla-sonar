package g1;

import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b extends e1 implements d1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaCodecInfo.AudioCapabilities f66835c;

    b(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.AudioCapabilities audioCapabilities = this.f66884b.getAudioCapabilities();
        Objects.requireNonNull(audioCapabilities);
        this.f66835c = audioCapabilities;
    }
}
