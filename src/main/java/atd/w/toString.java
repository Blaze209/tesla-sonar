package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n*\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriberId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "subscriberId", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class toString extends InitializeResultSuccess {
    private static char AuthenticationRequestParameters = 0;
    private static char getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/SubscriberId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        SystemClock.elapsedRealtime();
        new getDeviceData((byte) 0);
        int i11 = getSDKAppID + 111;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toString(Application application) {
        super(application);
        s.k(application, "");
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    private static String cE_(TelephonyManager telephonyManager) {
        int i11 = getSDKAppID + 111;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return telephonyManager.getSubscriberId();
        }
        telephonyManager.getSubscriberId();
        throw null;
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = (char) 49309;
        AuthenticationRequestParameters = (char) 26533;
        getSDKReferenceNumber = (char) 59430;
        getDeviceData = (char) 44545;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d A[Catch: SecurityException -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x003d, blocks: (B:2:0x0000, B:5:0x000e, B:8:0x001c, B:10:0x002d), top: B:15:0x0000 }] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        DeviceParameterResult failure;
        try {
            TelephonyManager telephonyManagerCF_ = cF_();
            if (telephonyManagerCF_ != null) {
                getSDKAppID = (getSDKEphemeralPublicKey + 75) % 128;
                String strCE_ = cE_(telephonyManagerCF_);
                if (strCE_ != null) {
                    getSDKAppID = (getSDKEphemeralPublicKey + 23) % 128;
                    failure = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCE_));
                    getSDKEphemeralPublicKey = (getSDKAppID + 43) % 128;
                } else {
                    failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
                }
            } else {
                failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            }
            getSDKEphemeralPublicKey = (getSDKAppID + 123) % 128;
            return failure;
        } catch (SecurityException unused) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
    }
}
