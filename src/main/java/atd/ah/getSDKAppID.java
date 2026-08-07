package atd.ah;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKAppID extends AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getMessageVersion = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getScrollFriction();
        getSDKAppID = (getMessageVersion + 83) % 128;
    }

    getSDKAppID() {
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12 = $10;
        int i13 = i12 + 3;
        $11 = i13 % 128;
        int i14 = 2;
        if (i13 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            int i15 = i12 + 67;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        int i16 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i17 = challengeStatusHandler.getSDKReferenceNumber;
            if (i17 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            cArr3[i16] = cArr[i17];
            cArr3[1] = cArr[i17 + 1];
            int i18 = 58224;
            int i19 = i16;
            while (i19 < 16) {
                $11 = ($10 + 51) % 128;
                char c11 = cArr3[1];
                char c12 = cArr3[i16];
                int i21 = i16;
                char[] cArr4 = cArr3;
                int i22 = (c12 + i18) ^ ((c12 << 4) + ((char) (((long) AuthenticationRequestParameters) ^ (-2881362678149017980L))));
                int i23 = c12 >>> 5;
                int i24 = i14;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKReferenceNumber);
                    objArr2[i24] = Integer.valueOf(i23);
                    objArr2[1] = Integer.valueOf(i22);
                    objArr2[i21] = Integer.valueOf(c11);
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method == null) {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 1745, (char) (16682 - Color.blue(i21)), (CdmaCellLocation.convertQuartSecToDecDegrees(i21) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i21) == 0.0d ? 0 : -1)) + 29);
                        byte b11 = (byte) 1;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i21], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    char c13 = cArr4[i21];
                    int i25 = (cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                    int i26 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(getSDKTransactionID);
                    objArr4[i24] = Integer.valueOf(i26);
                    objArr4[1] = Integer.valueOf(i25);
                    objArr4[i21] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1745 - ((Process.getThreadPriority(i21) + 20) >> 6), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 16682), 29 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b13 = (byte) 1;
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i21], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr4[i21] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i19++;
                    i14 = i24;
                    i16 = i21;
                    cArr3 = cArr4;
                    cArr = cArr;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr;
            int i27 = i14;
            int i28 = i16;
            char[] cArr6 = cArr3;
            int i29 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i29] = cArr6[i28];
            cArr2[i29 + 1] = cArr6[1];
            Object[] objArr6 = new Object[i27];
            objArr6[1] = challengeStatusHandler;
            objArr6[i28] = challengeStatusHandler;
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1596 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (27825 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 25 - Color.alpha(i28));
                byte b15 = (byte) i28;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                b(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[i28], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i27;
            cArr3 = cArr6;
            cArr = cArr5;
            i16 = 0;
        }
    }

    private static void b(short s11, byte b11, byte b12, Object[] objArr) {
        int i11 = 116 - (s11 * 4);
        byte[] bArr = $$a;
        int i12 = b12 * 3;
        int i13 = 3 - (b11 * 4);
        byte[] bArr2 = new byte[i12 + 1];
        int i14 = -1;
        if (bArr == null) {
            int i15 = i13 + i12;
            i13 = i13;
            i11 = i15;
        }
        while (true) {
            i14++;
            bArr2[i14] = (byte) i11;
            int i16 = i13 + 1;
            if (i14 == i12) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i13 = i16;
            i11 += bArr[i16];
        }
    }

    static void init$0() {
        $$a = new byte[]{34, -58, -116, -81};
        $$b = 106;
    }

    @Override // atd.ac.getSDKAppID
    public final String getSDKAppID() throws Throwable {
        getMessageVersion = (getSDKAppID + 7) % 128;
        Object[] objArr = new Object[1];
        a("ミ鞓\ueaef졾", TextUtils.indexOf("", "") + 3, objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKAppID + 111;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // atd.ah.ChallengeResult
    public final atd.ag.getDeviceData getSDKReferenceNumber(atd.ai.getSDKEphemeralPublicKey getsdkephemeralpublickey, atd.af.AuthenticationRequestParameters authenticationRequestParameters) {
        int i11 = getSDKAppID + 61;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            atd.af.AuthenticationRequestParameters.getDeviceData(authenticationRequestParameters, atd.af.getSDKReferenceNumber.class);
            return getSDKAppID(getsdkephemeralpublickey.getSDKAppID(), ((atd.af.getSDKReferenceNumber) authenticationRequestParameters).AuthenticationRequestParameters());
        }
        atd.af.AuthenticationRequestParameters.getDeviceData(authenticationRequestParameters, atd.af.getSDKReferenceNumber.class);
        getSDKAppID(getsdkephemeralpublickey.getSDKAppID(), ((atd.af.getSDKReferenceNumber) authenticationRequestParameters).AuthenticationRequestParameters());
        throw null;
    }

    @Override // atd.ah.AuthenticationRequestParameters
    public final atd.ag.getDeviceData getSDKAppID(atd.ag.AuthenticationRequestParameters authenticationRequestParameters, byte[] bArr) {
        authenticationRequestParameters.getSDKTransactionID();
        atd.ag.getDeviceData getdevicedata = new atd.ag.getDeviceData(Arrays.copyOfRange(bArr, 0, 32), authenticationRequestParameters);
        getMessageVersion = (getSDKAppID + 49) % 128;
        return getdevicedata;
    }

    static void getSDKReferenceNumber() {
        getDeviceData = (char) 16897;
        getSDKTransactionID = (char) 12885;
        AuthenticationRequestParameters = (char) 24099;
        getSDKReferenceNumber = (char) 19998;
    }
}
