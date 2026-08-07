package atd.ag;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.completed;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKReferenceNumber extends AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getDeviceData = 1;
        getMessageVersion();
        Process.getElapsedCpuTime();
        Process.getThreadPriority(0);
        Drawable.resolveOpacity(0, 0);
        SystemClock.uptimeMillis();
        Gravity.getAbsoluteGravity(0, 0);
        ExpandableListView.getPackedPositionForChild(0, 0);
        ViewConfiguration.getScrollBarSize();
        TextUtils.indexOf("", "");
        getSDKAppID = (getDeviceData + 89) % 128;
    }

    getSDKReferenceNumber() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        Object charArray;
        int i12;
        Object method;
        Class cls;
        Object method2;
        int i13 = $10 + 103;
        $11 = i13 % 128;
        char c11 = 2;
        int i14 = 0;
        if (i13 % 2 == 0) {
            int i15 = 72 / 0;
            if (str != null) {
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
        } else if (str != null) {
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = (char[]) charArray;
        completed completedVar = new completed();
        char[] cArr2 = AuthenticationRequestParameters;
        Class cls2 = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                    char c12 = c11;
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        cls = cls2;
                        method2 = obj;
                    } else {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2314 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) KeyEvent.getDeadChar(i14, i14), (Process.myTid() >> 22) + 24);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        cls = cls2;
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, (byte) (b13 - 1), objArr3);
                        method2 = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-1709775791, method2);
                    }
                    cArr3[i16] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i16++;
                    c11 = c12;
                    cArr = cArr;
                    cArr2 = cArr2;
                    cls2 = cls;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = cArr;
        char c13 = c11;
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(getSDKTransactionID)};
        Map map2 = getMessageVersion.timedout;
        Object method3 = map2.get(-1709775791);
        if (method3 == null) {
            Class cls5 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2313, (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24);
            byte b14 = (byte) 0;
            byte b15 = b14;
            Object[] objArr5 = new Object[1];
            b(b14, b15, (byte) (b15 - 1), objArr5);
            method3 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr5[i12] = (char) (cArr4[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            int i17 = $11 + 47;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i19 = completedVar.getSDKTransactionID;
                if (i19 >= i12) {
                    break;
                }
                char c14 = cArr4[i19];
                completedVar.getSDKAppID = c14;
                char c15 = cArr4[i19 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    int i21 = $10 + 1;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        cArr5[i19] = (char) (c14 + b11);
                        cArr5[0] = (char) (c15 % b11);
                    } else {
                        cArr5[i19] = (char) (c14 - b11);
                        cArr5[i19 + 1] = (char) (c15 - b11);
                    }
                    cCharValue = cCharValue;
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
                    Map map3 = getMessageVersion.timedout;
                    Object obj2 = map3.get(700818725);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1919 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 29 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        byte b16 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        b((byte) 55, b16, (byte) (b16 - 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls7 = Integer.TYPE;
                        method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                        map3.put(700818725, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i22 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i22) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[r15] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c13] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls8 = (Class) getMessageVersion.getSDKTransactionID(1722 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 48634), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25);
                            byte b17 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            b((byte) 6, b17, (byte) (b17 - 1), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls9 = Integer.TYPE;
                            method4 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i23 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i24 = completedVar.getSDKTransactionID;
                        cArr5[i24] = cArr2[iIntValue2];
                        cArr5[i24 + 1] = cArr2[i23];
                    } else {
                        int i25 = completedVar.getDeviceData;
                        int i26 = completedVar.AuthenticationRequestParameters;
                        if (i25 == i26) {
                            int i27 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i27;
                            int i28 = ((i22 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i28;
                            int i29 = (i26 * cCharValue) + i28;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr5[i31] = cArr2[(i25 * cCharValue) + i27];
                            cArr5[i31 + 1] = cArr2[i29];
                        } else {
                            int i32 = (i25 * cCharValue) + i22;
                            int i33 = (i26 * cCharValue) + completedVar.getMessageVersion;
                            int i34 = completedVar.getSDKTransactionID;
                            cArr5[i34] = cArr2[i32];
                            cArr5[i34 + 1] = cArr2[i33];
                        }
                        completedVar.getSDKTransactionID += 2;
                        cCharValue = cCharValue;
                    }
                }
                completedVar.getSDKTransactionID += 2;
                cCharValue = cCharValue;
            }
        }
        for (int i35 = 0; i35 < i11; i35++) {
            cArr5[i35] = (char) (cArr5[i35] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = r6 + 67
            byte[] r1 = atd.ag.getSDKReferenceNumber.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r6 = r7
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2d
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = r6 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.getSDKReferenceNumber.b(int, short, int, java.lang.Object[]):void");
    }

    static void getMessageVersion() {
        AuthenticationRequestParameters = new char[]{52467, 52415, 52380, 52465, 52478, 52476, 52378, 52463, 52460, 52454, 52373, 52403, 52413, 52368, 52379, 52377, 52365, 52366, 52477, 52375, 52459, 52381, 52456, 52383, 52374};
        getSDKTransactionID = (char) 63809;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        return getSDKTransactionID(objArr);
    }

    static void init$0() {
        $$a = new byte[]{76, 124, -43, -121};
        $$b = 121;
    }

    @Override // atd.ag.AuthenticationRequestParameters
    public final String AuthenticationRequestParameters() throws Throwable {
        getDeviceData = (getSDKAppID + 7) % 128;
        Object[] objArr = new Object[1];
        a(20 - TextUtils.getOffsetAfter("", 0), "\u0018\r\u0012\u0001\u0016\u0001\u0017\u0001\u000f\f\u0001\u0015\u0016\u000f\u0015\b\t\u0010\n\u0012", (byte) (144 - AndroidCharacter.getMirror('0')), objArr);
        String strIntern = ((String) objArr[0]).intern();
        getDeviceData = (getSDKAppID + 97) % 128;
        return strIntern;
    }

    @Override // atd.ag.AuthenticationRequestParameters
    public final String BuildConfig() throws Throwable {
        getSDKAppID = (getDeviceData + 61) % 128;
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0, 0) + 10, "\u0015\u000e\u0002\u000b\u0013\u0015\u0003\r\u0015\u0017", (byte) (View.resolveSizeAndState(0, 0, 0) + 79), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKAppID + 23;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // atd.ag.AuthenticationRequestParameters
    public final String getDeviceData() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 75;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(3 >> (ExpandableListView.getPackedPositionForChild(1, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 1L ? 0 : -1)), "\u0018\r㘢", (byte) ((ViewConfiguration.getEdgeSlop() / 72) * 99), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4, "\u0018\r㘢", (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 89), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // atd.ac.getSDKAppID
    public final String getSDKAppID() throws Throwable {
        getDeviceData = (getSDKAppID + 45) % 128;
        Object[] objArr = new Object[1];
        a(13 - ExpandableListView.getPackedPositionType(0L), "\u0016\b\t\u0005\u0016\u0001\u0014\u0001\u0015\u0013\u0005\u0017㘩", (byte) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 124), objArr);
        String strIntern = ((String) objArr[0]).intern();
        getSDKAppID = (getDeviceData + 55) % 128;
        return strIntern;
    }

    @Override // atd.ag.AuthenticationRequestParameters
    public final int getSDKEphemeralPublicKey() {
        int i11 = getDeviceData + 69;
        getSDKAppID = i11 % 128;
        return i11 % 2 != 0 ? 61 : 16;
    }

    @Override // atd.ag.AuthenticationRequestParameters
    public final int getSDKReferenceNumber() {
        getDeviceData = (getSDKAppID + 111) % 128;
        return 16;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        int i11 = (getSDKAppID + 69) % 128;
        getDeviceData = i11;
        int i12 = i11 + 41;
        getSDKAppID = i12 % 128;
        if (i12 % 2 == 0) {
            return 256;
        }
        throw null;
    }

    @Override // atd.ag.AuthenticationRequestParameters
    public final int getSDKTransactionID() {
        return ((Integer) getSDKTransactionID(new Object[]{this}, -2074275795, 2074275795, System.identityHashCode(this))).intValue();
    }
}
