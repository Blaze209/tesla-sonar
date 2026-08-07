package atd.a;

import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/SdkTransactionIdentifier;", "", "<init>", "()V", "Ljn0/h0;", "generate", "destroy", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "_value", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "", "getValue", "()Ljava/lang/String;", "value", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig {
    private static atd.json.AuthenticationRequestParameters AuthenticationRequestParameters = null;
    private static int getDeviceData = 1;
    public static final BuildConfig getSDKAppID = new BuildConfig();
    private static int getSDKTransactionID;

    static {
        int i11 = getDeviceData;
        int i12 = i11 & 121;
        int i13 = i12 + ((i11 ^ 121) | i12);
        getSDKTransactionID = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    private BuildConfig() {
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws ChallengeResultCancelled {
        String str;
        int i11 = getDeviceData;
        int i12 = ((i11 | 51) << 1) - (i11 ^ 51);
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        try {
            atd.json.AuthenticationRequestParameters authenticationRequestParameters = AuthenticationRequestParameters;
            if (authenticationRequestParameters == null || (str = (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters))) == null) {
                throw new ChallengeResultCancelled();
            }
            int i13 = getSDKTransactionID;
            int i14 = i13 & 57;
            int i15 = -(-((i13 ^ 57) | i14));
            int i16 = ((i14 & i15) + (i15 | i14)) % 128;
            getDeviceData = i16;
            int i17 = (i16 & (-66)) | ((~i16) & 65);
            int i18 = -(-((i16 & 65) << 1));
            int i19 = (i17 ^ i18) + ((i17 & i18) << 1);
            getSDKTransactionID = i19 % 128;
            if (i19 % 2 != 0) {
                int i21 = 65 / 0;
            }
            return str;
        } catch (atd.json.getSDKTransactionID unused) {
            throw new ChallengeResultCancelled();
        }
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        String string = UUID.randomUUID().toString();
        s.j(string, "");
        AuthenticationRequestParameters = new atd.json.AuthenticationRequestParameters(string);
        int i11 = getDeviceData + 13;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 52 / 0;
        }
        return null;
    }

    public static void getSDKAppID() {
        getSDKReferenceNumber(new Object[0], 2063923340, -2063923338, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * 471) + (i12 * 471) + ((i11 | i12) * (-470));
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (~(i15 | i16)) | (~(i16 | i13));
        int i18 = ~(i12 | (~i13) | i11);
        int i19 = i14 + ((i17 | i18) * (-470)) + (((~(i11 | i16 | i13)) | i18) * 470);
        if (i19 != 1) {
            return i19 != 2 ? AuthenticationRequestParameters(objArr) : getDeviceData(objArr);
        }
        return getSDKReferenceNumber(objArr);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        int i11 = getSDKTransactionID;
        getDeviceData = ((((i11 | 22) << 1) - (i11 ^ 22)) - 1) % 128;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters = AuthenticationRequestParameters;
        if (authenticationRequestParameters != null) {
            int i12 = ((i11 & 3) - (~(-(-(i11 | 3))))) - 1;
            getDeviceData = i12 % 128;
            if (i12 % 2 == 0) {
                atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters));
                throw null;
            }
            atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters));
            System.currentTimeMillis();
            System.currentTimeMillis();
        } else {
            int i13 = i11 & 29;
            getDeviceData = (((((i11 ^ 29) | i13) << 1) - (~(-((i11 | 29) & (~i13))))) - 1) % 128;
        }
        AuthenticationRequestParameters = null;
        int i14 = getSDKTransactionID;
        int i15 = (i14 ^ 68) + ((i14 & 68) << 1);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        getDeviceData = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 79 / 0;
        }
        return null;
    }

    public static String getDeviceData() {
        return (String) getSDKReferenceNumber(new Object[0], -1879293315, 1879293315, (int) System.currentTimeMillis());
    }

    public static void AuthenticationRequestParameters() {
        getSDKReferenceNumber(new Object[0], 2103620319, -2103620318, (int) System.currentTimeMillis());
    }
}
