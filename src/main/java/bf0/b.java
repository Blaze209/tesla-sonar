package bf0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005¨\u0006\r"}, d2 = {"Lbf0/b;", "Lbf0/e;", "", "maxRetryTimes", "<init>", "(I)V", "", "c", "()J", "I", "e", "()I", "setMaxRetryTimes", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int maxRetryTimes;

    public b(int i11) {
        super(i11, 0, 2, null);
        this.maxRetryTimes = i11;
    }

    @Override // bf0.e
    public long c() {
        return 0L;
    }

    @Override // bf0.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getMaxRetryTimes() {
        return this.maxRetryTimes;
    }
}
