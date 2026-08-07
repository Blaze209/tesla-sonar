package pb;

import android.os.Build;
import androidx.work.a0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ob.NetworkState;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sb.m0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lpb/i;", "Lpb/b;", "Lob/h;", "Lqb/h;", "tracker", "<init>", "(Lqb/h;)V", "Lsb/m0;", "workSpec", "", "c", "(Lsb/m0;)Z", "value", "g", "(Lob/h;)Z", "", "b", "I", "e", "()I", AnalyticsAttribute.Reason, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends b<NetworkState> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qb.h<NetworkState> tracker) {
        super(tracker);
        s.k(tracker, "tracker");
        this.reason = 7;
    }

    @Override // pb.e
    public boolean c(m0 workSpec) {
        s.k(workSpec, "workSpec");
        a0 requiredNetworkType = workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiredNetworkType();
        if (requiredNetworkType != a0.UNMETERED) {
            return Build.VERSION.SDK_INT >= 30 && requiredNetworkType == a0.TEMPORARILY_UNMETERED;
        }
        return true;
    }

    @Override // pb.b
    /* JADX INFO: renamed from: e, reason: from getter */
    protected int getReason() {
        return this.reason;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pb.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean f(NetworkState value) {
        s.k(value, "value");
        return !value.getIsConnected() || value.getIsMetered();
    }
}
