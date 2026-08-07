package bf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lbf0/f;", "Lbf0/e;", "", "maxRetryTimes", "<init>", "(I)V", "", "c", "()J", "I", "e", "()I", "setMaxRetryTimes", DateTokenConverter.CONVERTER_KEY, "J", "equidistant", "", "[Ljava/lang/Long;", "getDelayDurations", "()[Ljava/lang/Long;", "setDelayDurations", "([Ljava/lang/Long;)V", "delayDurations", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int maxRetryTimes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long equidistant;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Long[] delayDurations;

    public f(int i11) {
        super(i11, 0, 2, null);
        this.maxRetryTimes = i11;
        this.equidistant = 1000L;
        this.delayDurations = new Long[]{100L, 200L, 500L, 1000L, 2000L};
    }

    @Override // bf0.e
    public long c() {
        if (get_counter() >= getMaxRetryTimes()) {
            return -1L;
        }
        int i11 = get_counter();
        Long[] lArr = this.delayDurations;
        return i11 < lArr.length ? lArr[get_counter()].longValue() : lArr[lArr.length - 1].longValue() + (((long) ((get_counter() - this.delayDurations.length) + 1)) * this.equidistant);
    }

    @Override // bf0.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public int getMaxRetryTimes() {
        return this.maxRetryTimes;
    }
}
