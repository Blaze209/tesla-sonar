package atd.w;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierIdName;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class runtimeError extends InitializeResultSuccess {
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SimCarrierIdName$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        Process.getThreadPriority(0);
        new getDeviceData((byte) 0);
        int i11 = getSDKReferenceNumber + 111;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 60 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public runtimeError(Application application) {
        super(application);
        s.k(application, "");
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = 9142011047969454352L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        if (Build.VERSION.SDK_INT < 28) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ != null) {
            int i11 = getSDKReferenceNumber + 43;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                telephonyManagerCF_.getSimCarrierIdName();
                throw null;
            }
            CharSequence simCarrierIdName = telephonyManagerCF_.getSimCarrierIdName();
            if (simCarrierIdName != null) {
                getSDKReferenceNumber = (getSDKAppID + 25) % 128;
                String string = simCarrierIdName.toString();
                if (string != null) {
                    int i12 = getSDKReferenceNumber + 61;
                    getSDKAppID = i12 % 128;
                    int i13 = i12 % 2;
                    String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(string);
                    if (i13 != 0) {
                        return DeviceParameterResult.Success.StringValue.m49boximpl(strM50constructorimpl);
                    }
                    DeviceParameterResult.Success.StringValue.m49boximpl(strM50constructorimpl);
                    throw null;
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }
}
