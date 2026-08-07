package atd.b;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.completed;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResult extends getSDKReferenceNumber<String> {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getDeviceData = 1;
        AuthenticationRequestParameters = new char[]{52391, 52359, 52409, 52368, 52379, 52396, 52385, 52401, 52402, 52411, 52400, 52413, 52394, 52406, 52415, 52384};
        getSDKReferenceNumber = (char) 63808;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChallengeResult() throws Throwable {
        Object[] objArr = new Object[1];
        a(Color.alpha(0) + 16, "\t\u000f\f\n\t\n\u000e\u0006\u000b\u0001\u0004\u0005\b\u000e\u0004\u0001", (byte) (44 - Color.alpha(0)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getJumpTapTimeout() >> 16) + 1, "㗆", (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 3), objArr2);
        super(strIntern, ((String) objArr2[0]).intern());
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        Object method;
        int i14 = $10 + 105;
        $11 = i14 % 128;
        char c11 = 2;
        if (i14 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i15 = 55;
        int i16 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    char c12 = c11;
                    Object[] objArr2 = {Integer.valueOf(cArr[i17])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        i13 = i16;
                        method = obj;
                    } else {
                        i13 = i16;
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 2313, (char) TextUtils.indexOf("", ""), Color.argb(i16, i16, i16, i16) + 24);
                        byte b12 = (byte) i15;
                        byte b13 = (byte) (-1);
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, (byte) (b13 + 1), objArr3);
                        method = cls2.getMethod((String) objArr3[i13], cls);
                        map.put(-1709775791, method);
                    }
                    cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i17++;
                    c11 = c12;
                    i16 = i13;
                    charArray = charArray;
                    cArr = cArr;
                    i15 = 55;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = charArray;
        char c13 = c11;
        int i18 = i16;
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-1709775791);
        if (method2 == null) {
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(i18, i18) + 2313, (char) KeyEvent.normalizeMetaState(i18), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23);
            byte b14 = (byte) (-1);
            Object[] objArr5 = new Object[1];
            b((byte) 55, b14, (byte) (b14 + 1), objArr5);
            method2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-1709775791, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
            $11 = ($10 + 37) % 128;
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            int i19 = 0;
            while (true) {
                completedVar.getSDKTransactionID = i19;
                int i21 = completedVar.getSDKTransactionID;
                if (i21 >= i12) {
                    break;
                }
                $10 = ($11 + 83) % 128;
                char c14 = cArr3[i21];
                completedVar.getSDKAppID = c14;
                char c15 = cArr3[i21 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    cArr4[i21] = (char) (c14 - b11);
                    cArr4[i21 + 1] = (char) (c15 - b11);
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = completedVar;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = completedVar;
                    objArr6[9] = completedVar;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = completedVar;
                    objArr6[6] = completedVar;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = completedVar;
                    objArr6[3] = completedVar;
                    objArr6[c13] = Integer.valueOf(cCharValue);
                    objArr6[1] = completedVar;
                    objArr6[0] = completedVar;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(700818725);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (KeyEvent.getMaxKeyCode() >> 16), 29 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 + 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(700818725, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i22 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i22) {
                        $10 = ($11 + 83) % 128;
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[6] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c13] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - TextUtils.indexOf((CharSequence) "", '0'), (char) (View.MeasureSpec.getSize(0) + 48634), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24);
                            byte b17 = (byte) (-1);
                            Object[] objArr9 = new Object[1];
                            b((byte) 49, b17, (byte) (b17 + 1), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls7 = Integer.TYPE;
                            method4 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i23 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i24 = completedVar.getSDKTransactionID;
                        cArr4[i24] = cArr[iIntValue2];
                        cArr4[i24 + 1] = cArr[i23];
                    } else {
                        int i25 = completedVar.getDeviceData;
                        int i26 = completedVar.AuthenticationRequestParameters;
                        if (i25 == i26) {
                            int i27 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i27;
                            int i28 = ((i22 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i28;
                            int i29 = (i25 * cCharValue) + i27;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr4[i31] = cArr[i29];
                            cArr4[i31 + 1] = cArr[(i26 * cCharValue) + i28];
                            $10 = ($11 + 17) % 128;
                        } else {
                            int i32 = (i26 * cCharValue) + completedVar.getMessageVersion;
                            int i33 = completedVar.getSDKTransactionID;
                            cArr4[i33] = cArr[(i25 * cCharValue) + i22];
                            cArr4[i33 + 1] = cArr[i32];
                            $10 = ($11 + 27) % 128;
                        }
                        i19 = completedVar.getSDKTransactionID + 2;
                    }
                }
                i19 = completedVar.getSDKTransactionID + 2;
            }
        }
        for (int i34 = 0; i34 < i11; i34++) {
            cArr4[i34] = (char) (cArr4[i34] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    private static void b(int i11, short s11, int i12, Object[] objArr) {
        int i13 = s11 + 4;
        int i14 = 122 - i11;
        int i15 = i12 * 2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i15 + 1];
        int i16 = -1;
        if (bArr == null) {
            i14 += -i13;
            i13 = i13;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i14;
            if (i17 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i18 = i13 + 1;
            byte[] bArr3 = bArr;
            i14 += -bArr[i18];
            i13 = i18;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static void init$0() {
        $$d = new byte[]{93, 88, 36, -92};
        $$e = 169;
    }

    @Override // atd.b.getSDKReferenceNumber
    final /* bridge */ /* synthetic */ boolean getSDKReferenceNumber(String str) {
        int i11 = getDeviceData + 69;
        getSDKAppID = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }
}
