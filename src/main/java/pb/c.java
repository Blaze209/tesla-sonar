package pb;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sb.m0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0014X\u0094D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lpb/c;", "Lpb/b;", "", "Lqb/h;", "tracker", "<init>", "(Lqb/h;)V", "Lsb/m0;", "workSpec", "c", "(Lsb/m0;)Z", "value", "g", "(Z)Z", "", "b", "I", "e", "()I", AnalyticsAttribute.Reason, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends b<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qb.h<Boolean> tracker) {
        super(tracker);
        s.k(tracker, "tracker");
        this.reason = 6;
    }

    @Override // pb.e
    public boolean c(m0 workSpec) {
        s.k(workSpec, "workSpec");
        return workSpec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String.getRequiresCharging();
    }

    @Override // pb.b
    /* JADX INFO: renamed from: e, reason: from getter */
    protected int getReason() {
        return this.reason;
    }

    @Override // pb.b
    public /* bridge */ /* synthetic */ boolean f(Boolean bool) {
        return g(bool.booleanValue());
    }

    protected boolean g(boolean value) {
        return !value;
    }
}
