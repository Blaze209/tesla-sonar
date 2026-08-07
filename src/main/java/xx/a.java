package xx;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final GmsLogger f124043c = new GmsLogger("StreamingFormatChecker", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedList f124044a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f124045b = -1;

    @KeepForSdk
    public void a(@NonNull wx.a aVar) {
        if (aVar.h() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f124044a.add(Long.valueOf(jElapsedRealtime));
        if (this.f124044a.size() > 5) {
            this.f124044a.removeFirst();
        }
        if (this.f124044a.size() != 5 || jElapsedRealtime - ((Long) Preconditions.checkNotNull((Long) this.f124044a.peekFirst())).longValue() >= DeviceOrientationRequest.OUTPUT_PERIOD_FAST) {
            return;
        }
        long j11 = this.f124045b;
        if (j11 == -1 || jElapsedRealtime - j11 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f124045b = jElapsedRealtime;
            f124043c.w("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
