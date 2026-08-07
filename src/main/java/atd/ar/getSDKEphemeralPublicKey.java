package atd.ar;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusReceiver;
import atd.json.ChallengeResultCancelled;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static boolean getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKTransactionID();
        TextUtils.indexOf("", "", 0, 0);
        int i11 = getSDKAppID + 125;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 52 / 0;
        }
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        Class cls;
        Object method;
        String str3 = str2;
        $11 = ($10 + 91) % 128;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        int i12 = 2;
        if (str != null) {
            int i13 = $10 + 75;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr2 = getSDKTransactionID;
        Class cls2 = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                int i15 = $10 + 61;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(508097192);
                        if (obj != null) {
                            cls = cls2;
                            method = obj;
                        } else {
                            cls = cls2;
                            method = ((Class) getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, (char) View.MeasureSpec.getMode(0), 32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("o", cls);
                            map.put(508097192, method);
                        }
                        cArr3[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        length = length;
                        i14 = i14;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    int i16 = i14;
                    cArr2 = cArr2;
                    cls = cls2;
                    Object[] objArr3 = {Integer.valueOf(cArr2[i16])};
                    Map map2 = getMessageVersion.timedout;
                    Object method2 = map2.get(508097192);
                    if (method2 == null) {
                        method2 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, (char) TextUtils.getTrimmedLength(""), 31 - TextUtils.indexOf((CharSequence) "", '0', 0))).getMethod("o", cls);
                        map2.put(508097192, method2);
                    }
                    cArr3[i16] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i14 = i16 + 1;
                }
                cArr2 = cArr2;
                length = length;
                cls2 = cls;
            }
            cArr2 = cArr3;
        }
        Class cls3 = cls2;
        Object[] objArr4 = {Integer.valueOf(getDeviceData)};
        Map map3 = getMessageVersion.timedout;
        Object method3 = map3.get(-852383591);
        if (method3 == null) {
            Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2061 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16);
            byte b11 = (byte) 0;
            byte b12 = b11;
            Object[] objArr5 = new Object[1];
            b(b11, b12, b12, objArr5);
            method3 = cls4.getMethod((String) objArr5[0], cls3);
            map3.put(-852383591, method3);
        }
        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
        if (getSDKReferenceNumber) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr4 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i17 = challengeStatusReceiver.getDeviceData;
                int i18 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i17] = (char) (cArr2[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                Object[] objArr6 = new Object[i12];
                objArr6[1] = challengeStatusReceiver;
                objArr6[0] = challengeStatusReceiver;
                Map map4 = getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 1107, (char) Color.blue(0), 50 - KeyEvent.normalizeMetaState(0));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr7 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr7);
                    method4 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                i12 = 2;
            }
        } else if (AuthenticationRequestParameters) {
            int length3 = cArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr5 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i19 = challengeStatusReceiver.getDeviceData;
                int i21 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i19] = (char) (cArr2[cArr[(i21 - 1) - i19] - i11] - iIntValue);
                Object[] objArr8 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map5 = getMessageVersion.timedout;
                Object method5 = map5.get(-249860496);
                if (method5 == null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 1108, (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (Process.myTid() >> 22) + 50);
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr9 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr9);
                    method5 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map5.put(-249860496, method5);
                }
                ((Method) method5).invoke(null, objArr8);
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr6 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i22 = challengeStatusReceiver.getDeviceData;
                int i23 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i22] = (char) (cArr2[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i22 + 1;
                }
            }
        }
    }

    private static void b(byte b11, byte b12, short s11, Object[] objArr) {
        int i11 = s11 * 4;
        int i12 = (b12 * 2) + 107;
        int i13 = 3 - (b11 * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i11];
        int i14 = 0 - i11;
        int i15 = -1;
        if (bArr == null) {
            i12 = i13 + i12;
            i13 = i13;
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i12;
            int i16 = i13 + 1;
            if (i15 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i12 += bArr[i16];
                i13 = i16;
            }
        }
    }

    public static List<String> getSDKAppID() throws Throwable {
        getSDKAppID = (getSDKEphemeralPublicKey + 61) % 128;
        Object[] objArr = new Object[1];
        a(null, null, 127 - (ViewConfiguration.getTapTimeout() >> 16), "£¢\u0089¡\u0086\u0091 \u0098\u009f\u0089\u0081\u009e\u0086\u0081\u008c\u009d\u0097\u0096\u0081\u009c\u0090\u0089\u008d\u0097\u008b\u009b\u008b\u009a\u0099\u0098\u0093\u0097\u0090\u0096\u008c\u0095\u0083\u0081\u0094\u0082\u0086\u008b\u0093\u0092\u0083\u0091\u0090\u008f\u008e\u008b\u008d\u0089\u008b\u008b\u008c\u0083\u008b\u0083\u008a\u0089\u0083\u0088\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        List<String> listAsList = Arrays.asList(getSDKAppID(((String) objArr[0]).intern()));
        int i11 = getSDKEphemeralPublicKey + 73;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            return listAsList;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{64842, 64807, 64859, 64877, 64838, 64821, 64845, 64841, 64840, 64830, 64843, 64844, 64831, 64839, 64863, 64847, 64823, 64857, 64850, 64846, 64862, 64881, 64851, 64818, 64854, 64808, 64820, 64806, 64856, 64813, 64855, 64826, 64861, 64819, 64828};
        getDeviceData = -185467487;
        AuthenticationRequestParameters = true;
        getSDKReferenceNumber = true;
    }

    static void init$0() {
        $$a = new byte[]{79, 66, 87, 20};
        $$b = 99;
    }

    private static String getSDKAppID(String str) throws Throwable {
        int i11 = getSDKAppID + 39;
        getSDKEphemeralPublicKey = i11 % 128;
        int i12 = i11 % 2;
        String sDKReferenceNumber = ChallengeResultCancelled.getSDKReferenceNumber(str);
        if (i12 == 0) {
            int i13 = 2 / 0;
        }
        int i14 = getSDKAppID + 21;
        getSDKEphemeralPublicKey = i14 % 128;
        if (i14 % 2 != 0) {
            return sDKReferenceNumber;
        }
        throw null;
    }
}
