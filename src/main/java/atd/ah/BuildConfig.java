package atd.ah;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultError;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final getDeviceData AuthenticationRequestParameters;
    public static final AuthenticationRequestParameters getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    public static final getSDKReferenceNumber getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKReferenceNumber();
        getDeviceData = new getSDKAppID();
        getSDKTransactionID = new getSDKTransactionID();
        AuthenticationRequestParameters = new getSDKEphemeralPublicKey();
        getSDKEphemeralPublicKey = (getSDKReferenceNumber + 105) % 128;
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        Class<Object> cls;
        int length;
        char[] cArr;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i13 = 0;
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        char[] cArr2 = getSDKAppID;
        Class cls3 = Integer.TYPE;
        int i18 = 2;
        if (cArr2 != null) {
            int i19 = $10 + 53;
            $11 = i19 % 128;
            if (i19 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i13 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            while (i13 < length) {
                try {
                    byte[] bArr2 = bArr;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    int i21 = i13;
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), 24 - View.getDefaultSize(0, 0));
                        byte b11 = (byte) 1;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13 = i21 + 1;
                    bArr = bArr2;
                    i16 = i16;
                    length = length;
                    cArr = cArr;
                    cArr2 = cArr2;
                    i17 = i17;
                    cls2 = cls2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i22 = i16;
        int i23 = i17;
        char[] cArr3 = new char[i15];
        System.arraycopy(cArr2, i14, cArr3, 0, i15);
        if (bArr3 != null) {
            char[] cArr4 = new char[i15];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i24 = challengeResultError.getSDKAppID;
                if (i24 >= i15) {
                    break;
                }
                if (bArr3[i24] == 1) {
                    $10 = ($11 + 51) % 128;
                    char c12 = cArr3[i24];
                    Object[] objArr4 = new Object[i18];
                    objArr4[1] = Integer.valueOf(c11);
                    objArr4[0] = Integer.valueOf(c12);
                    Map map2 = getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 558, (char) (5486 - (ViewConfiguration.getLongPressTimeout() >> 16)), 23 - ExpandableListView.getPackedPositionType(0L));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr4[i24] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr3 = cArr3;
                    cArr4 = cArr4;
                    Object[] objArr6 = {Integer.valueOf(cArr3[i24]), Integer.valueOf(c11)};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.getCapsMode("", 0, 0) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23 - TextUtils.lastIndexOf("", '0', 0))).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr4[i24] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) getMessageVersion.getSDKTransactionID(Color.argb(0, 0, 0, 0) + 854, (char) TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0') + 25);
                    byte b15 = (byte) 3;
                    byte b16 = (byte) (b15 - 3);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr3 = cArr3;
                cArr4 = cArr4;
                i18 = 2;
            }
            $10 = ($11 + 25) % 128;
            cArr3 = cArr4;
        }
        if (i23 > 0) {
            char[] cArr5 = new char[i15];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i15);
            int i25 = i15 - i23;
            System.arraycopy(cArr5, 0, cArr3, i25, i23);
            System.arraycopy(cArr5, i23, cArr3, 0, i25);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i15];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i15) {
                    break;
                }
                cArr6[i26] = cArr3[(i15 - i26) - 1];
                challengeResultError.getSDKAppID = i26 + 1;
            }
            cArr3 = cArr6;
        }
        if (i22 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i15) {
                    break;
                }
                int i28 = $11 + 97;
                $10 = i28 % 128;
                if (i28 % 2 != 0) {
                    cArr3[i27] = (char) (cArr3[i27] - iArr[2]);
                    i12 = i27 / 0;
                } else {
                    cArr3[i27] = (char) (cArr3[i27] - iArr[2]);
                    i12 = i27 + 1;
                }
                challengeResultError.getSDKAppID = i12;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 98
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r9 = r9 * 4
            int r9 = 3 - r9
            byte[] r0 = atd.ah.BuildConfig.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2e:
            int r3 = -r3
            int r9 = r9 + r3
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.BuildConfig.b(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return atd.ah.BuildConfig.getDeviceData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r0 = atd.ah.BuildConfig.getSDKTransactionID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0.getSDKAppID().equals(r4) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r0 = atd.ah.BuildConfig.AuthenticationRequestParameters;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r0.getSDKAppID().equals(r4) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        atd.ah.BuildConfig.getSDKEphemeralPublicKey = (atd.ah.BuildConfig.getSDKReferenceNumber + 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        r2 = new java.lang.Object[1];
        a("\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{0, 38, 153, 0}, false, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (atd.ah.BuildConfig.getDeviceData.getSDKAppID().equals(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (atd.ah.BuildConfig.getDeviceData.getSDKAppID().equals(r4) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static atd.ah.ChallengeResult getSDKReferenceNumber(java.lang.String r4) throws java.lang.Throwable {
        /*
            int r0 = atd.ah.BuildConfig.getSDKReferenceNumber
            int r0 = r0 + 97
            int r1 = r0 % 128
            atd.ah.BuildConfig.getSDKEphemeralPublicKey = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L1d
            atd.ah.AuthenticationRequestParameters r0 = atd.ah.BuildConfig.getDeviceData
            java.lang.String r0 = r0.getSDKAppID()
            boolean r0 = r0.equals(r4)
            r2 = 13
            int r2 = r2 / r1
            if (r0 == 0) goto L2c
            goto L29
        L1d:
            atd.ah.AuthenticationRequestParameters r0 = atd.ah.BuildConfig.getDeviceData
            java.lang.String r0 = r0.getSDKAppID()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L2c
        L29:
            atd.ah.AuthenticationRequestParameters r4 = atd.ah.BuildConfig.getDeviceData
            return r4
        L2c:
            atd.ah.getSDKReferenceNumber r0 = atd.ah.BuildConfig.getSDKTransactionID
            java.lang.String r2 = r0.getSDKAppID()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L39
            return r0
        L39:
            atd.ah.getDeviceData r0 = atd.ah.BuildConfig.AuthenticationRequestParameters
            java.lang.String r2 = r0.getSDKAppID()
            boolean r4 = r2.equals(r4)
            r2 = 1
            if (r4 == 0) goto L4e
            int r4 = atd.ah.BuildConfig.getSDKReferenceNumber
            int r4 = r4 + r2
            int r4 = r4 % 128
            atd.ah.BuildConfig.getSDKEphemeralPublicKey = r4
            return r0
        L4e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r0 = 38
            r3 = 153(0x99, float:2.14E-43)
            int[] r0 = new int[]{r1, r0, r3, r1}
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001"
            a(r3, r0, r1, r2)
            r0 = r2[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ah.BuildConfig.getSDKReferenceNumber(java.lang.String):atd.ah.ChallengeResult");
    }

    static void init$0() {
        $$a = new byte[]{80, -103, -98, -108};
        $$b = 58;
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = new char[]{30793, 30916, 31031, 31027, 31029, 31031, 31030, 31031, 31026, 31035, 30915, 30949, 30942, 31031, 30940, 30947, 31034, 31029, 31034, 30913, 31037, 30913, 30949, 30951, 30913, 31036, 31034, 31031, 31032, 31033, 31033, 31037, 30945, 30942, 31038, 31038, 31036, 30940};
    }
}
