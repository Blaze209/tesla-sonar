package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
class t0 implements r0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final StreamConfigurationMap f120226a;

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i11) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i11);
        }
    }

    t0(@NonNull StreamConfigurationMap streamConfigurationMap) {
        this.f120226a = streamConfigurationMap;
    }

    @Override // w.r0.a
    @NonNull
    public StreamConfigurationMap a() {
        return this.f120226a;
    }

    @Override // w.r0.a
    public int[] c() {
        try {
            return this.f120226a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e11) {
            y0.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e11);
            return null;
        }
    }

    @Override // w.r0.a
    public Size[] d(int i11) {
        return a.a(this.f120226a, i11);
    }
}
