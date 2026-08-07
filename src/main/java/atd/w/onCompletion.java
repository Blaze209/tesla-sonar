package atd.w;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/PhoneCount;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCompletion extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKAppID = 1;
    private static int[] getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/PhoneCount$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MINIMUM", "", "MAXIMUM", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        Process.getElapsedCpuTime();
        new getDeviceData((byte) 0);
        AuthenticationRequestParameters = (getSDKAppID + 31) % 128;
    }

    public /* synthetic */ onCompletion(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new int[]{1911661118, 113580042, -846048083, -1693252545, -2053335178, -1751484394, 896821810, -1540229779, 798305152, -1479668234, 846543032, 2129752994, -932882060, 799391256, 640554599, 1953167846, 1280722012, 68811801};
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        Integer numValueOf;
        Integer num = null;
        if (Build.VERSION.SDK_INT >= 30) {
            TelephonyManager telephonyManagerCF_ = cF_();
            if (telephonyManagerCF_ != null) {
                numValueOf = Integer.valueOf(telephonyManagerCF_.getActiveModemCount());
            } else {
                numValueOf = null;
            }
        } else {
            TelephonyManager telephonyManagerCF_2 = cF_();
            if (telephonyManagerCF_2 != null) {
                numValueOf = Integer.valueOf(telephonyManagerCF_2.getPhoneCount());
                getSDKAppID = (AuthenticationRequestParameters + 41) % 128;
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (iIntValue >= 0) {
                AuthenticationRequestParameters = (getSDKAppID + 75) % 128;
                if (iIntValue < 6) {
                    num = numValueOf;
                }
            }
            if (num != null) {
                int i11 = AuthenticationRequestParameters + 99;
                getSDKAppID = i11 % 128;
                if (i11 % 2 != 0) {
                    return DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(num.intValue()));
                }
                int i12 = 87 / 0;
                return DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(num.intValue()));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private onCompletion(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
