package atd.w;

import android.app.Application;
import android.telephony.TelephonyManager;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsHearingAidCompatibilitySupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends InitializeResultSuccess {
    private static int[] AuthenticationRequestParameters = null;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;

    /* JADX INFO: renamed from: atd.w.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsHearingAidCompatibilitySupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0270getSDKTransactionID {
        private C0270getSDKTransactionID() {
        }

        public /* synthetic */ C0270getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        ViewConfiguration.getDoubleTapTimeout();
        new C0270getSDKTransactionID((byte) 0);
        int i11 = getSDKReferenceNumber + 93;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKTransactionID(Application application) {
        super(application);
        s.k(application, "");
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = new int[]{1281563636, -223320117, 69907761, 1198458092, -2101953830, 779679406, -1481758026, 1737772256, -1813734799, -1480644214, -1299005252, 148610523, 1358678524, -1551905671, -1844188107, -1934399423, 469881475, 1284566619};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        getSDKReferenceNumber = (getSDKAppID + 89) % 128;
        DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(telephonyManagerCF_.isHearingAidCompatibilitySupported()));
        getSDKAppID = (getSDKReferenceNumber + 101) % 128;
        return booleanValueM14boximpl;
    }
}
