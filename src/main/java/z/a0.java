package z;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.v0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f126030a;

    public a0() {
        this.f126030a = androidx.camera.camera2.internal.compat.quirk.b.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    @NonNull
    public v0 a(@NonNull v0 v0Var) {
        v0.a aVar = new v0.a();
        aVar.v(v0Var.k());
        Iterator<DeferrableSurface> it = v0Var.i().iterator();
        while (it.hasNext()) {
            aVar.f(it.next());
        }
        aVar.e(v0Var.g());
        u.a.C2464a c2464a = new u.a.C2464a();
        c2464a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c2464a.a());
        return aVar.h();
    }

    public boolean b(@NonNull List<CaptureRequest> list, boolean z11) {
        if (!this.f126030a || !z11) {
            return false;
        }
        Iterator<CaptureRequest> it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }
}
