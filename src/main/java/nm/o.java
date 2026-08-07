package nm;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class o implements pk.n<y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f95180b = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityManager f95181a;

    public o(ActivityManager activityManager) {
        this.f95181a = activityManager;
    }

    private int b() {
        int iMin = Math.min(this.f95181a.getMemoryClass() * PKIFailureInfo.badCertTemplate, Integer.MAX_VALUE);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }

    @Override // pk.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        return new y(b(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f95180b);
    }
}
