package atd.ai;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultCancelled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long BuildConfig;
    private static int ChallengeResult;
    private static int getMessageVersion;
    private getSDKAppID AuthenticationRequestParameters;
    private getDeviceData getDeviceData;
    private ChallengeResult getSDKAppID;
    private AuthenticationRequestParameters getSDKReferenceNumber;
    private getSDKEphemeralPublicKey getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        getSDKEphemeralPublicKey();
        KeyEvent.keyCodeFromString("");
        int i11 = ChallengeResult + 93;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public ChallengeResultCancelled(getSDKEphemeralPublicKey getsdkephemeralpublickey, getSDKAppID getsdkappid, ChallengeResult challengeResult, AuthenticationRequestParameters authenticationRequestParameters, getDeviceData getdevicedata) {
        this.getSDKTransactionID = getsdkephemeralpublickey;
        this.AuthenticationRequestParameters = getsdkappid;
        this.getSDKAppID = challengeResult;
        this.getSDKReferenceNumber = authenticationRequestParameters;
        this.getDeviceData = getdevicedata;
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return getSDKReferenceNumber(objArr);
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        $11 = ($10 + 93) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(BuildConfig ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                break;
            }
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(BuildConfig)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2748, (char) (54838 - ExpandableListView.getPackedPositionType(0L)), 29 - View.getDefaultSize(0, 0));
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1401 - View.resolveSize(0, 0), (char) (16690 - ExpandableListView.getPackedPositionType(0L)), 22 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str2 = new String(deviceData, 4, deviceData.length - 4);
        int i14 = $11 + 17;
        $10 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private static void b(byte b11, int i11, int i12, Object[] objArr) {
        byte[] bArr = $$a;
        int i13 = (b11 * 2) + 101;
        int i14 = (i11 * 3) + 4;
        int i15 = i12 * 3;
        byte[] bArr2 = new byte[i15 + 1];
        int i16 = -1;
        if (bArr == null) {
            i13 = i15 + (-i14);
            i14++;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i13;
            if (i17 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i13 += -bArr[i14];
            i14++;
            bArr = bArr;
            i16 = i17;
        }
    }

    static void getSDKEphemeralPublicKey() {
        BuildConfig = -1626148821404338613L;
    }

    public static ChallengeResultCancelled getSDKReferenceNumber(String str) throws Throwable {
        ChallengeResult = (getMessageVersion + 3) % 128;
        Object[] objArr = new Object[1];
        a("渮湲廢렪ሚ踥", ViewConfiguration.getTouchSlop() >> 8, objArr);
        String[] strArrSplit = str.split(((String) objArr[0]).intern());
        if (strArrSplit.length == 5) {
            ChallengeResultCancelled challengeResultCancelled = new ChallengeResultCancelled(new getSDKEphemeralPublicKey(strArrSplit[0]), new getSDKAppID(strArrSplit[1]), new ChallengeResult(strArrSplit[2]), new AuthenticationRequestParameters(strArrSplit[3]), new getDeviceData(strArrSplit[4]));
            getMessageVersion = (ChallengeResult + 13) % 128;
            return challengeResultCancelled;
        }
        int i11 = getMessageVersion + 19;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
        }
        int i12 = 22 / 0;
        throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
    }

    static void init$0() {
        $$a = new byte[]{99, 39, 79, 89};
        $$b = 7;
    }

    public final String getDeviceData() throws Throwable {
        getMessageVersion = (ChallengeResult + 73) % 128;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        a("襈襭欻趮\uf68f㭭㼵ኣ订\u0ffe鿎\udb9b빖鎝\uf200恮宥㑳", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        String str = String.format(locale, ((String) objArr[0]).intern(), this.getSDKTransactionID.getSDKReferenceNumber(), this.AuthenticationRequestParameters.getSDKReferenceNumber(), this.getSDKAppID.getSDKReferenceNumber(), this.getSDKReferenceNumber.getSDKReferenceNumber(), this.getDeviceData.getSDKReferenceNumber());
        int i11 = getMessageVersion + 11;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final getDeviceData getMessageVersion() {
        int i11 = ChallengeResult + 63;
        int i12 = i11 % 128;
        getMessageVersion = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        getDeviceData getdevicedata = this.getDeviceData;
        ChallengeResult = (i12 + 65) % 128;
        return getdevicedata;
    }

    public final ChallengeResult getSDKAppID() {
        int i11 = (getMessageVersion + 39) % 128;
        ChallengeResult = i11;
        ChallengeResult challengeResult = this.getSDKAppID;
        getMessageVersion = (i11 + 75) % 128;
        return challengeResult;
    }

    public final void getSDKTransactionID() {
        getSDKEphemeralPublicKey getsdkephemeralpublickey = this.getSDKTransactionID;
        if (getsdkephemeralpublickey != null) {
            getsdkephemeralpublickey.getDeviceData();
            this.getSDKTransactionID = null;
        }
        getSDKAppID getsdkappid = this.AuthenticationRequestParameters;
        if (getsdkappid != null) {
            getsdkappid.getDeviceData();
            this.AuthenticationRequestParameters = null;
        }
        ChallengeResult challengeResult = this.getSDKAppID;
        if (challengeResult != null) {
            challengeResult.getDeviceData();
            this.getSDKAppID = null;
        }
        AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        if (authenticationRequestParameters != null) {
            ChallengeResult = (getMessageVersion + 99) % 128;
            authenticationRequestParameters.getDeviceData();
            this.getSDKReferenceNumber = null;
        }
        getDeviceData getdevicedata = this.getDeviceData;
        if (getdevicedata != null) {
            getdevicedata.getDeviceData();
            this.getDeviceData = null;
            ChallengeResult = (getMessageVersion + 29) % 128;
        }
    }

    public final AuthenticationRequestParameters AuthenticationRequestParameters() {
        return (AuthenticationRequestParameters) AuthenticationRequestParameters(new Object[]{this}, -1877461695, 1877461695, System.identityHashCode(this));
    }

    public final getSDKEphemeralPublicKey getSDKReferenceNumber() {
        int i11 = getMessageVersion + 57;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getSDKTransactionID;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[0];
        int i11 = getMessageVersion + 3;
        int i12 = i11 % 128;
        ChallengeResult = i12;
        int i13 = i11 % 2;
        AuthenticationRequestParameters authenticationRequestParameters = challengeResultCancelled.getSDKReferenceNumber;
        if (i13 == 0) {
            int i14 = 76 / 0;
        }
        getMessageVersion = (i12 + 15) % 128;
        return authenticationRequestParameters;
    }
}
