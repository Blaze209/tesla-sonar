package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f*\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/GroupIdentifierLevelOne;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "kotlin.jvm.PlatformType", "groupIdLevel1", "(Landroid/telephony/TelephonyManager;)Ljava/lang/String;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/GroupIdentifierLevelOne$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        SystemClock.elapsedRealtimeNanos();
        new getSDKAppID((byte) 0);
        int i11 = getSDKTransactionID + 95;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ AuthenticationRequestParameters(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static String cv_(TelephonyManager telephonyManager) {
        AuthenticationRequestParameters = (getSDKTransactionID + 87) % 128;
        String groupIdLevel1 = telephonyManager.getGroupIdLevel1();
        int i11 = getSDKTransactionID + 33;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return groupIdLevel1;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = 1029305037;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        String strCv_;
        AuthenticationRequestParameters = (getSDKTransactionID + 39) % 128;
        if (!BuildConfig() && !getMessageVersion()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ != null && (strCv_ = cv_(telephonyManagerCF_)) != null) {
            return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(strCv_));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i11 = getSDKTransactionID + 105;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return failure;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AuthenticationRequestParameters(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
