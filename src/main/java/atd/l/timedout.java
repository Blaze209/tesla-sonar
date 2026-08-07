package atd.l;

import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZone;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZoneConverter;", "timeZoneConverter", "<init>", "(Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZoneConverter;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZoneConverter;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class timedout extends DeviceParameter {
    private static long AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getSDKReferenceNumber = 1;
    private final cancelled getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/TimeZone$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "MAX_VALUE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        ExpandableListView.getPackedPositionType(0L);
        new getSDKAppID((byte) 0);
        getDeviceData = (getSDKReferenceNumber + 51) % 128;
    }

    public /* synthetic */ timedout(byte b11) {
        this(new getDeviceData());
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = -8573446448984563988L;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        getDeviceData = (getSDKReferenceNumber + 91) % 128;
        Long lValueOf = Long.valueOf(this.getSDKTransactionID.getDeviceData());
        long jLongValue = lValueOf.longValue();
        if (-720 <= jLongValue) {
            int i11 = getDeviceData + 69;
            int i12 = i11 % 128;
            getSDKReferenceNumber = i12;
            if (i11 % 2 == 0) {
                int i13 = 20 / 0;
                if (jLongValue < 841) {
                    getDeviceData = (i12 + 121) % 128;
                } else {
                    lValueOf = null;
                }
            } else if (jLongValue < 841) {
                getDeviceData = (i12 + 121) % 128;
            } else {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        if (lValueOf == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i14 = getDeviceData + 33;
        getSDKReferenceNumber = i14 % 128;
        if (i14 % 2 != 0) {
            return DeviceParameterResult.Success.LongValue.m42boximpl(DeviceParameterResult.Success.LongValue.m43constructorimpl(lValueOf.longValue()));
        }
        int i15 = 2 / 0;
        return DeviceParameterResult.Success.LongValue.m42boximpl(DeviceParameterResult.Success.LongValue.m43constructorimpl(lValueOf.longValue()));
    }

    private timedout(cancelled cancelledVar) {
        s.k(cancelledVar, "");
        this.getSDKTransactionID = cancelledVar;
    }

    public timedout() {
        this((byte) 0);
    }
}
