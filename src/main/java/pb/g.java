package pb;

import android.os.Build;
import androidx.work.a0;
import androidx.work.z;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import ob.NetworkState;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sb.m0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lpb/g;", "Lpb/b;", "Lob/h;", "Lqb/h;", "tracker", "<init>", "(Lqb/h;)V", "Lsb/m0;", "workSpec", "", "c", "(Lsb/m0;)Z", "value", "g", "(Lob/h;)Z", "", "b", "I", "e", "()I", AnalyticsAttribute.Reason, "a", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends b<NetworkState> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f102068c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f102069d;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpb/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        String strI = z.i("NetworkMeteredCtrlr");
        s.j(strI, "tagWithPrefix(...)");
        f102069d = strI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qb.h<NetworkState> tracker) {
        super(tracker);
        s.k(tracker, "tracker");
        this.reason = 7;
    }

    @Override // pb.e
    public boolean c(m0 workSpec) {
        s.k(workSpec, "workSpec");
        return workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiredNetworkType() == a0.METERED;
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
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.getIsConnected() && value.getIsMetered()) ? false : true;
        }
        z.e().a(f102069d, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !value.getIsConnected();
    }
}
