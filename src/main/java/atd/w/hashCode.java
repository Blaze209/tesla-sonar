package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/VoiceMailAlphaTag;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "voiceMailAlphaTag", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class hashCode extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData;
    private static int getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/VoiceMailAlphaTag$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        Process.getElapsedCpuTime();
        CdmaCellLocation.convertQuartSecToDecDegrees(0);
        AudioTrack.getMaxVolume();
        new AuthenticationRequestParameters((byte) 0);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 57) % 128;
    }

    public /* synthetic */ hashCode(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static String cG_(TelephonyManager telephonyManager) {
        int i11 = getSDKReferenceNumber + 73;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            telephonyManager.getVoiceMailAlphaTag();
            throw null;
        }
        String voiceMailAlphaTag = telephonyManager.getVoiceMailAlphaTag();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 11) % 128;
        return voiceMailAlphaTag;
    }

    static void getSDKTransactionID() {
        getDeviceData = 1029305071;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 33) % 128;
        if (!BuildConfig()) {
            int i11 = AuthenticationRequestParameters + 51;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 != 0) {
                getMessageVersion();
                throw null;
            }
            if (!getMessageVersion()) {
                return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
            }
        }
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ != null) {
            getSDKReferenceNumber = (AuthenticationRequestParameters + 15) % 128;
            String strCG_ = cG_(telephonyManagerCF_);
            if (strCG_ != null) {
                DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCG_));
                int i12 = AuthenticationRequestParameters + 51;
                getSDKReferenceNumber = i12 % 128;
                if (i12 % 2 == 0) {
                    return stringValueM49boximpl;
                }
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private hashCode(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
