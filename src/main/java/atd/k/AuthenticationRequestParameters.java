package atd.k;

import android.app.Application;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/ScaledDensity;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/DisplayMetricsDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "getDeviceParameterResult-Ffr52qI", "()F", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends getSDKReferenceNumber {
    private static int AuthenticationRequestParameters = 1;
    private static char[] getDeviceData;
    private static long getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX INFO: renamed from: atd.k.AuthenticationRequestParameters$AuthenticationRequestParameters, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/ScaledDensity$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0265AuthenticationRequestParameters {
        private C0265AuthenticationRequestParameters() {
        }

        public /* synthetic */ C0265AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getScrollBarFadeDuration();
        AudioTrack.getMaxVolume();
        new C0265AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKTransactionID + 101;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthenticationRequestParameters(Application application) {
        super(application);
        s.k(application, "");
    }

    private float AuthenticationRequestParameters() {
        int i11 = AuthenticationRequestParameters + 25;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            DeviceParameterResult.Success.FloatValue.m29constructorimpl(cs_().scaledDensity);
            throw null;
        }
        float fM29constructorimpl = DeviceParameterResult.Success.FloatValue.m29constructorimpl(cs_().scaledDensity);
        getSDKTransactionID = (AuthenticationRequestParameters + 83) % 128;
        return fM29constructorimpl;
    }

    static void getSDKReferenceNumber() {
        getDeviceData = new char[]{24290, 51376, 29396, 40182};
        getSDKReferenceNumber = -4203454943104821670L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getSDKTransactionID = (AuthenticationRequestParameters + 41) % 128;
        DeviceParameterResult.Success.FloatValue floatValueM28boximpl = DeviceParameterResult.Success.FloatValue.m28boximpl(AuthenticationRequestParameters());
        getSDKTransactionID = (AuthenticationRequestParameters + 21) % 128;
        return floatValueM28boximpl;
    }
}
