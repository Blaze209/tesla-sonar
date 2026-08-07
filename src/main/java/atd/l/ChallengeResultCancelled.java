package atd.l;

import android.app.Application;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Locale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ApplicationLocale;", "applicationLocale", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ApplicationLocale;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ApplicationLocale;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCancelled extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private final AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Locale$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getDoubleTapTimeout();
        new getSDKTransactionID((byte) 0);
        int i11 = getMessageVersion + 55;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ ChallengeResultCancelled(Application application) {
        this(application, new atd.l.getSDKTransactionID(application));
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = new char[]{64709, 64726, 64723};
        AuthenticationRequestParameters = -185467642;
        getSDKReferenceNumber = true;
        getSDKAppID = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        getMessageVersion = (BuildConfig + 21) % 128;
        BuildConfig = (getMessageVersion + 81) % 128;
        Locale sDKTransactionID = this.getSDKTransactionID.getSDKTransactionID();
        String language = sDKTransactionID.getLanguage();
        String country = sDKTransactionID.getCountry();
        s.h(language);
        if (language.length() == 0) {
            getMessageVersion = (BuildConfig + 105) % 128;
        } else {
            s.h(country);
            if (country.length() != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(language);
                sb2.append(CoreConstants.DASH_CHAR);
                sb2.append(country);
                return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sb2.toString()));
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i11 = BuildConfig + 117;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            return failure;
        }
        throw null;
    }

    private ChallengeResultCancelled(Application application, AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKTransactionID = authenticationRequestParameters;
    }
}
