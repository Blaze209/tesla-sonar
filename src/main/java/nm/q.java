package nm;

import java.util.concurrent.TimeUnit;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public class q implements pk.n<y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f95184a = TimeUnit.MINUTES.toMillis(5);

    private int b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return PKIFailureInfo.badCertTemplate;
        }
        if (iMin < 33554432) {
            return PKIFailureInfo.badSenderNonce;
        }
        return 4194304;
    }

    @Override // pk.n
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y get() {
        int iB = b();
        return new y(iB, Integer.MAX_VALUE, iB, Integer.MAX_VALUE, iB / 8, f95184a);
    }
}
