package atd.h;

import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters {
    private static int getSDKReferenceNumber = 1;
    private static int getSDKTransactionID;

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        ConfigParameters configParameters = (ConfigParameters) objArr[0];
        int i11 = getSDKReferenceNumber;
        int i12 = (i11 & 29) + (i11 | 29);
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 == 0) {
            return AdyenConfigParameters.getParamValues(configParameters, AdyenConfigParameters.DEVICE_PARAMETER_BLOCK_LIST);
        }
        int i13 = 92 / 0;
        return AdyenConfigParameters.getParamValues(configParameters, AdyenConfigParameters.DEVICE_PARAMETER_BLOCK_LIST);
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        return getDeviceData(objArr);
    }

    public static Collection<String> getSDKTransactionID(ConfigParameters configParameters) {
        return (Collection) getSDKAppID(new Object[]{configParameters}, 374901766, -374901766, (int) System.currentTimeMillis());
    }
}
