package atd.l;

import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DefaultTimeZoneConverter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZoneConverter;", "<init>", "()V", "getTimeZoneInMinutes", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData implements cancelled {
    private static int getSDKAppID = 0;
    private static int getSDKReferenceNumber = 1;

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        int i14 = getSDKReferenceNumber + 74;
        getSDKAppID = ((i14 ^ (-1)) + (i14 << 1)) % 128;
        long jConvert = TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
        int i15 = getSDKReferenceNumber;
        getSDKAppID = ((((i15 ^ 45) | (i15 & 45)) << 1) - (((~i15) & 45) | (i15 & (-46)))) % 128;
        return Long.valueOf(jConvert);
    }

    @Override // atd.l.cancelled
    public final long getDeviceData() {
        return ((Long) getDeviceData(new Object[]{this}, -1969382302, 1969382302, System.identityHashCode(this))).longValue();
    }
}
