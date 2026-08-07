package atd.b;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import atd.az.completed;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class getSDKEphemeralPublicKey extends getSDKTransactionID {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$m = null;
    private static final int $$n = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static char[] getSDKTransactionID;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKTransactionID = new char[]{63813, 52410, 63814, 52415};
        getSDKReferenceNumber = (char) 63814;
    }

    public getSDKEphemeralPublicKey(String str) {
        super(str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 17
            int r0 = r6 + 21
            int r8 = r8 * 6
            int r8 = r8 + 97
            byte[] r1 = atd.b.getSDKEphemeralPublicKey.$$d
            int r7 = r7 * 37
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 20
            r2 = 0
            if (r1 != 0) goto L1a
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r7
            goto L32
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L32:
            int r7 = -r7
            int r8 = r8 + 1
            int r1 = r1 + r7
            int r7 = r1 + (-8)
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKEphemeralPublicKey.c(byte, int, int, java.lang.Object[]):void");
    }

    private static void d(byte b11, String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        Class cls;
        Object method2;
        int i13 = $10 + 115;
        $11 = i13 % 128;
        char c11 = 2;
        if (i13 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = getSDKTransactionID;
        Class cls2 = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    char c12 = c11;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        cls = cls2;
                        method2 = obj;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 2313, (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        cls = cls2;
                        Object[] objArr3 = new Object[1];
                        h(b12, b13, b13, objArr3);
                        method2 = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-1709775791, method2);
                    }
                    cArr2[i14] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i14++;
                    c11 = c12;
                    charArray = charArray;
                    cArr = cArr;
                    cls2 = cls;
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
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method3 = map2.get(-1709775791);
        if (method3 == null) {
            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 2313, (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 24);
            byte b14 = (byte) 0;
            byte b15 = b14;
            Object[] objArr5 = new Object[1];
            h(b14, b15, b15, objArr5);
            method3 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
            $11 = ($10 + 45) % 128;
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i15 = completedVar.getSDKTransactionID;
                if (i15 >= i12) {
                    break;
                }
                char c14 = cArr3[i15];
                completedVar.getSDKAppID = c14;
                char c15 = cArr3[i15 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    int i16 = $10 + 1;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        cArr4[i15] = (char) (c14 << b11);
                        cArr4[i15 + 1] = (char) (c15 - b11);
                    } else {
                        cArr4[i15] = (char) (c14 - b11);
                        cArr4[i15 + 1] = (char) (c15 - b11);
                    }
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
                    Object obj2 = map3.get(700818725);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        Object[] objArr7 = new Object[1];
                        h(b16, b17, (byte) (b17 | 55), objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls7 = Integer.TYPE;
                        method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                        map3.put(700818725, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i17 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i17) {
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
                            Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 1722, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 48633), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            byte b18 = (byte) 0;
                            byte b19 = b18;
                            Object[] objArr9 = new Object[1];
                            h(b18, b19, (byte) (b19 | 6), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls9 = Integer.TYPE;
                            method4 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i18 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i19 = completedVar.getSDKTransactionID;
                        cArr4[i19] = cArr[iIntValue2];
                        cArr4[i19 + 1] = cArr[i18];
                    } else {
                        int i21 = completedVar.getDeviceData;
                        int i22 = completedVar.AuthenticationRequestParameters;
                        if (i21 == i22) {
                            $11 = ($10 + 97) % 128;
                            int i23 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i23;
                            int i24 = ((i17 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i24;
                            int i25 = (i22 * cCharValue) + i24;
                            int i26 = completedVar.getSDKTransactionID;
                            cArr4[i26] = cArr[(i21 * cCharValue) + i23];
                            cArr4[i26 + 1] = cArr[i25];
                        } else {
                            int i27 = (i21 * cCharValue) + i17;
                            int i28 = (i22 * cCharValue) + completedVar.getMessageVersion;
                            int i29 = completedVar.getSDKTransactionID;
                            cArr4[i29] = cArr[i27];
                            cArr4[i29 + 1] = cArr[i28];
                        }
                        completedVar.getSDKTransactionID += 2;
                        $10 = ($11 + 25) % 128;
                    }
                }
                completedVar.getSDKTransactionID += 2;
                $10 = ($11 + 25) % 128;
            }
        }
        for (int i31 = 0; i31 < i11; i31++) {
            $11 = ($10 + 81) % 128;
            cArr4[i31] = (char) (cArr4[i31] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public static void getDeviceData(long j11, long j12) throws Throwable {
        int i11 = getSDKAppID + 53;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            byte b11 = (byte) ($$e - 4);
            byte b12 = $$d[36];
            Object[] objArr = new Object[1];
            c(b11, b12, b12, objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            int i12 = 33 / 0;
        } else {
            byte b13 = (byte) ($$e - 4);
            byte b14 = $$d[36];
            Object[] objArr2 = new Object[1];
            c(b13, b14, b14, objArr2);
            Class.forName((String) objArr2[0]).getField("getSDKReferenceNumber").get(null);
        }
        getDeviceData = (getSDKAppID + 99) % 128;
        try {
            byte b15 = (byte) ($$e - 4);
            byte[] bArr = $$d;
            byte b16 = bArr[36];
            Object[] objArr3 = new Object[1];
            c(b15, b16, b16, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b17 = bArr[36];
            byte b18 = (byte) (b17 + 1);
            Object[] objArr4 = new Object[1];
            c(b17, b18, b18, objArr4);
            Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(null, null);
            Object[] objArr5 = {atd.ap.AuthenticationRequestParameters.class.getField("getSDKReferenceNumber").get(null)};
            Object[] objArr6 = new Object[1];
            d((byte) (103 - ((byte) KeyEvent.getModifierMetaStateMask())), "\u0001\u0003㙦", 3 - (Process.myPid() >> 22), objArr6);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = atd.b.getSDKEphemeralPublicKey.$$m
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r8 = r8 + 67
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + 1
            int r8 = r8 + r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.getSDKEphemeralPublicKey.h(byte, byte, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$d = new byte[]{76, 124, -43, -121, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
        $$e = 5;
    }

    static void init$1() {
        $$m = new byte[]{103, 33, 110, -94};
        $$n = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
    }
}
