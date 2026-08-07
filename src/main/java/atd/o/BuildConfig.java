package atd.o;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isMacAddress", "", "", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getDeviceData;
    private static int getMessageVersion;
    private static boolean getSDKAppID;
    private static int getSDKReferenceNumber;
    private static boolean getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getMessageVersion = 1;
        getDeviceData = new char[]{64732, 64683, 64724, 64729, 64717, 64677, 64670, 64709, 64702, 64681, 64651, 64722, 64649, 64714, 64733, 64721};
        AuthenticationRequestParameters = -185467644;
        getSDKTransactionID = true;
        getSDKAppID = true;
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char[] cArr;
        char[] cArr2;
        int i14;
        int i15;
        float f11;
        Class cls;
        Object method;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr3 = getDeviceData;
        Class cls2 = Integer.TYPE;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (cArr3 != null) {
            i12 = 2;
            int i16 = $10 + 55;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                int length = cArr3.length;
                cArr2 = new char[length];
                i14 = length;
                i15 = 1;
            } else {
                int length2 = cArr3.length;
                cArr2 = new char[length2];
                i14 = length2;
                i15 = 0;
            }
            while (i15 < i14) {
                $10 = ($11 + 15) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i15])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj != null) {
                        f11 = f12;
                        method = obj;
                        cls = cls2;
                    } else {
                        f11 = f12;
                        cls = cls2;
                        method = ((Class) getMessageVersion.getSDKTransactionID((PointF.length(f12, f12) > f11 ? 1 : (PointF.length(f12, f12) == f11 ? 0 : -1)) + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 31 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getMethod("o", cls);
                        map.put(508097192, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i15++;
                    cls2 = cls;
                    f12 = f11;
                    cArr3 = cArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        } else {
            i12 = 2;
        }
        Class cls3 = cls2;
        float f13 = f12;
        Object[] objArr3 = {Integer.valueOf(AuthenticationRequestParameters)};
        Map map2 = getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 != null) {
            i13 = 0;
        } else {
            Class cls4 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0, 0) + 2062, (char) View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 18);
            byte b11 = (byte) 1;
            byte b12 = (byte) (b11 - 1);
            i13 = 0;
            Object[] objArr4 = new Object[1];
            b(b11, b12, b12, objArr4);
            method2 = cls4.getMethod((String) objArr4[0], cls3);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (getSDKAppID) {
            int i17 = $11 + 51;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                int length3 = bArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length3;
                cArr = new char[length3];
            } else {
                int length4 = bArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length4;
                cArr = new char[length4];
            }
            challengeStatusReceiver.getDeviceData = i13;
            while (true) {
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr);
                    return;
                }
                $11 = ($10 + 91) % 128;
                cArr[i18] = (char) (cArr3[bArr[(i19 - 1) - i18] + i11] - iIntValue);
                Object[] objArr5 = new Object[i12];
                objArr5[1] = challengeStatusReceiver;
                objArr5[0] = challengeStatusReceiver;
                Map map3 = getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    float f14 = f13;
                    Class cls5 = (Class) getMessageVersion.getSDKTransactionID(1108 - (PointF.length(f14, f14) > f14 ? 1 : (PointF.length(f14, f14) == f14 ? 0 : -1)), (char) (Process.myTid() >> 22), Color.blue(0) + 50);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                i12 = 2;
                f13 = BitmapDescriptorFactory.HUE_RED;
            }
        } else {
            int i21 = i13;
            if (!getSDKTransactionID) {
                int length5 = iArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length5;
                char[] cArr4 = new char[length5];
                challengeStatusReceiver.getDeviceData = i21;
                while (true) {
                    int i22 = challengeStatusReceiver.getDeviceData;
                    int i23 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i22 >= i23) {
                        break;
                    }
                    $11 = ($10 + 53) % 128;
                    cArr4[i22] = (char) (cArr3[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i22 + 1;
                }
                String str4 = new String(cArr4);
                int i24 = $11 + 125;
                $10 = i24 % 128;
                if (i24 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            int length6 = charArray.length;
            challengeStatusReceiver.getSDKReferenceNumber = length6;
            char[] cArr5 = new char[length6];
            challengeStatusReceiver.getDeviceData = i21;
            while (true) {
                int i25 = challengeStatusReceiver.getDeviceData;
                int i26 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i25 >= i26) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                int i27 = $11 + 37;
                $10 = i27 % 128;
                if (i27 % 2 != 0) {
                    cArr5[i25] = (char) (cArr3[charArray[(i26 - 1) >>> i25] - i11] << iIntValue);
                    Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(-249860496);
                    if (method4 == null) {
                        Class cls6 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 1108, (char) Color.red(0), ImageFormat.getBitsPerPixel(0) + 51);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        b(b15, b16, b16, objArr8);
                        method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                        map4.put(-249860496, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                } else {
                    cArr5[i25] = (char) (cArr3[charArray[(i26 - 1) - i25] - i11] - iIntValue);
                    Object[] objArr9 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map5 = getMessageVersion.timedout;
                    Object method5 = map5.get(-249860496);
                    if (method5 == null) {
                        Class cls7 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "") + 1108, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 50 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr10 = new Object[1];
                        b(b17, b18, b18, objArr10);
                        method5 = cls7.getMethod((String) objArr10[0], Object.class, Object.class);
                        map5.put(-249860496, method5);
                    }
                    ((Method) method5).invoke(null, objArr9);
                }
            }
        }
    }

    private static void b(int i11, int i12, int i13, Object[] objArr) {
        byte[] bArr = $$a;
        int i14 = i13 * 3;
        int i15 = 3 - (i12 * 2);
        int i16 = 109 - (i11 * 2);
        byte[] bArr2 = new byte[i14 + 1];
        int i17 = -1;
        if (bArr == null) {
            i16 += -i15;
            i15 = i15;
            bArr = bArr;
            i17 = -1;
        }
        while (true) {
            int i18 = i17 + 1;
            bArr2[i18] = (byte) i16;
            if (i18 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i19 = i15 + 1;
            byte[] bArr3 = bArr;
            i16 += -bArr[i19];
            i15 = i19;
            bArr = bArr3;
            i17 = i18;
        }
    }

    public static final boolean getSDKAppID(String str) throws Throwable {
        s.k(str, "");
        Object[] objArr = new Object[1];
        a(null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, "\u008d\u008c\u008b\u008a\u0089\u0084\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u008d\u0090\u008b\u008f\u008e\u008d\u008c\u008b\u008a\u0089\u0084\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        boolean zI = new q(((String) objArr[0]).intern()).i(str);
        getMessageVersion = (getSDKReferenceNumber + 111) % 128;
        return zI;
    }

    static void init$0() {
        $$a = new byte[]{19, -37, -35, -50};
        $$b = EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
    }
}
