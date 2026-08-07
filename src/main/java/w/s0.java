package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class s0 extends t0 {
    s0(@NonNull StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // w.r0.a
    public Size[] b(int i11) {
        return this.f120226a.getOutputSizes(i11);
    }
}
