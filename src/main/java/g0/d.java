package g0;

import android.media.CamcorderProfile;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class d {
    @NonNull
    public static j1 a(@NonNull CamcorderProfile camcorderProfile) {
        return j1.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    @NonNull
    private static List<j1.a> b(@NonNull CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i11 = camcorderProfile.audioCodec;
        arrayList.add(j1.a.a(i11, j1.g(i11), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, j1.a(camcorderProfile.audioCodec)));
        return arrayList;
    }

    @NonNull
    private static List<j1.c> c(@NonNull CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i11 = camcorderProfile.videoCodec;
        arrayList.add(j1.c.a(i11, j1.f(i11), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
