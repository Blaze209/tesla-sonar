package z;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Size f126059b = new Size(320, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator<Size> f126060c = new h0.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RepeatingStreamConstraintForVideoRecordingQuirk f126061a = (RepeatingStreamConstraintForVideoRecordingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    @NonNull
    public Size[] a(@NonNull Size[] sizeArr) {
        if (this.f126061a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.g()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f126060c.compare(size, f126059b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
