package atd.ae;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getDeviceData {
    private static int ChallengeResult = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static AuthenticationRequestParameters getSDKTransactionID = new getSDKReferenceNumber();
    private static AuthenticationRequestParameters getSDKReferenceNumber = new getSDKAppID();
    private static AuthenticationRequestParameters getSDKAppID = new getSDKTransactionID();
    public static List<AuthenticationRequestParameters> getDeviceData = Arrays.asList(getSDKTransactionID, getSDKReferenceNumber);
    public static List<AuthenticationRequestParameters> AuthenticationRequestParameters = Arrays.asList(getSDKReferenceNumber, getSDKAppID);

    static {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = i11 ^ 121;
        int i13 = ((i11 & 121) | i12) << 1;
        int i14 = -i12;
        ChallengeResult = ((i13 ^ i14) + ((i13 & i14) << 1)) % 128;
    }

    public static AuthenticationRequestParameters AuthenticationRequestParameters(String str, List<AuthenticationRequestParameters> list) {
        return (AuthenticationRequestParameters) getSDKAppID(new Object[]{str, list}, 911371195, -911371195, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        String str = (String) objArr[0];
        List list = (List) objArr[1];
        int i11 = ChallengeResult + 24;
        getSDKEphemeralPublicKey = ((i11 ^ (-1)) + (i11 << 1)) % 128;
        Iterator it = list.iterator();
        int i12 = ChallengeResult;
        getSDKEphemeralPublicKey = ((((i12 ^ 113) | (i12 & 113)) << 1) - (((~i12) & 113) | (i12 & (-114)))) % 128;
        while (it.hasNext()) {
            int i13 = ChallengeResult;
            int i14 = (i13 ^ 17) + ((i13 & 17) << 1);
            getSDKEphemeralPublicKey = i14 % 128;
            if (i14 % 2 == 0) {
                ((AuthenticationRequestParameters) it.next()).getSDKAppID().equals(str);
                throw null;
            }
            AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) it.next();
            if (authenticationRequestParameters.getSDKAppID().equals(str)) {
                int i15 = ChallengeResult;
                int i16 = i15 ^ 67;
                int i17 = -(-((i15 & 67) << 1));
                int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                getSDKEphemeralPublicKey = i18 % 128;
                if (i18 % 2 == 0) {
                    int i19 = 15 / 0;
                }
                return authenticationRequestParameters;
            }
            int i21 = getSDKEphemeralPublicKey;
            int i22 = i21 & 35;
            ChallengeResult = (i22 + ((i21 ^ 35) | i22)) % 128;
        }
        throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        return getDeviceData(objArr);
    }
}
