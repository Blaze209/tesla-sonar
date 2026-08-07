package atd.k;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeResultTimeout;
import atd.az.completed;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/displaymetrics/DisplayMetricsDeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static char[] getDeviceData;
    private static char getMessageVersion;
    private static int getSDKAppID;
    private static long getSDKTransactionID;
    private final DisplayMetrics getSDKReferenceNumber;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID = -4201337076207898698L;
        getSDKAppID = 1458778038;
        AuthenticationRequestParameters = (char) 3662;
        getDeviceData = new char[]{52410, 52464, 52397, 53061, 53060, 52405, 52393, 52465, 52402, 52353, 52395, 52396, 52378, 52411, 52463, 52407, 52413, 52415, 52391, 52401, 52376, 52394, 52400, 52409, 52412};
        getMessageVersion = (char) 63809;
    }

    public getSDKReferenceNumber(Application application) {
        s.k(application, "");
        DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
        s.j(displayMetrics, "");
        this.getSDKReferenceNumber = displayMetrics;
    }

    private static void a(char c11, String str, String str2, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        int i12 = 2;
        if (str2 != null) {
            int i13 = $11 + 73;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        int i14 = 0;
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c11);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $11 = ($10 + 89) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(num2);
                int i15 = i12;
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - View.combineMeasuredStates(i14, i14), (char) View.resolveSizeAndState(i14, i14, i14), 21 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b11 = (byte) (-1);
                    Object[] objArr3 = new Object[1];
                    d(b11, (byte) (b11 & 35), (byte) 0, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(225 - (Process.myPid() >> 22), (char) KeyEvent.getDeadChar(0, 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i16 = cArr2[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i15] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[1] = Integer.valueOf(i16);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2446 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) ExpandableListView.getPackedPositionType(0L), 18 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte b12 = (byte) (-1);
                    Object[] objArr6 = new Object[1];
                    d(b12, (byte) (b12 & 39), (byte) 0, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i17 = cArr2[iIntValue2] * 32718;
                Object[] objArr7 = new Object[i15];
                objArr7[1] = Integer.valueOf(cArr3[iIntValue]);
                objArr7[0] = Integer.valueOf(i17);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2970 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 9913), 36 - MotionEvent.axisFromString(""))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = challengeResultTimeout.getDeviceData;
                cArr2[iIntValue2] = c12;
                int i18 = challengeResultTimeout.getSDKTransactionID;
                cArr4[i18] = (char) (((((long) (c12 ^ charArray2[i18])) ^ (getSDKTransactionID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKAppID) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i18 + 1;
                length3 = length3;
                i12 = i15;
                charArray2 = charArray2;
                cArr2 = cArr2;
                num = num;
                num2 = num2;
                i14 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static void b(byte b11, int i11, String str, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        char c11;
        int length;
        char[] cArr;
        int i13;
        Object method;
        if (str != null) {
            $11 = ($10 + 81) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr2 = charArray;
        completed completedVar = new completed();
        char[] cArr3 = getDeviceData;
        Class cls = Integer.TYPE;
        int i14 = 2;
        int i15 = -1;
        if (cArr3 != null) {
            int i16 = $10 + 111;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
                i13 = 1;
            } else {
                length = cArr3.length;
                cArr = new char[length];
                i13 = 0;
            }
            while (i13 < length) {
                int i17 = $11 + 125;
                $10 = i17 % 128;
                if (i17 % i14 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i13])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1709775791);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 2313, (char) (Process.myTid() >> 22), 24 - (ViewConfiguration.getLongPressTimeout() >> 16));
                            byte b12 = (byte) i15;
                            byte b13 = (byte) (b12 + 1);
                            Object[] objArr3 = new Object[1];
                            d(b12, b13, b13, objArr3);
                            method = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-1709775791, method);
                        }
                        cArr[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    cArr2 = cArr2;
                    int i18 = i15;
                    Object[] objArr4 = {Integer.valueOf(cArr3[i13])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(-1709775791);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getCapsMode("", 0, 0) + 2313, (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 23 - TextUtils.lastIndexOf("", '0', 0, 0));
                        byte b14 = (byte) i18;
                        byte b15 = (byte) (b14 + 1);
                        Object[] objArr5 = new Object[1];
                        d(b14, b15, b15, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-1709775791, method2);
                    }
                    cArr[i13] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                }
                i13++;
                i14 = i14;
                cArr2 = cArr2;
                i15 = -1;
            }
            cArr3 = cArr;
        }
        char[] cArr4 = cArr2;
        int i19 = i14;
        Object[] objArr6 = {Integer.valueOf(getMessageVersion)};
        Map map3 = atd.a.getMessageVersion.timedout;
        Object method3 = map3.get(-1709775791);
        char c12 = '\b';
        if (method3 == null) {
            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - Color.alpha(0), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 24 - Drawable.resolveOpacity(0, 0));
            byte b16 = (byte) (-1);
            byte b17 = (byte) (b16 + 1);
            Object[] objArr7 = new Object[1];
            d(b16, b17, b17, objArr7);
            method3 = cls4.getMethod((String) objArr7[0], cls);
            map3.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
        char[] cArr5 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr5[i12] = (char) (cArr4[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            completedVar.getSDKTransactionID = 0;
            while (true) {
                int i21 = completedVar.getSDKTransactionID;
                if (i21 >= i12) {
                    break;
                }
                char c13 = cArr4[i21];
                completedVar.getSDKAppID = c13;
                char c14 = cArr4[i21 + 1];
                completedVar.getSDKReferenceNumber = c14;
                if (c13 == c14) {
                    cArr5[i21] = (char) (c13 - b11);
                    cArr5[i21 + 1] = (char) (c14 - b11);
                    c11 = c12;
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = completedVar;
                    objArr8[11] = Integer.valueOf(cCharValue);
                    objArr8[10] = completedVar;
                    objArr8[9] = completedVar;
                    objArr8[c12] = Integer.valueOf(cCharValue);
                    objArr8[7] = completedVar;
                    objArr8[6] = completedVar;
                    objArr8[5] = Integer.valueOf(cCharValue);
                    objArr8[4] = completedVar;
                    objArr8[3] = completedVar;
                    objArr8[i19] = Integer.valueOf(cCharValue);
                    objArr8[1] = completedVar;
                    objArr8[0] = completedVar;
                    c11 = c12;
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(700818725);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), 29 - Gravity.getAbsoluteGravity(0, 0));
                        Object[] objArr9 = new Object[1];
                        d((byte) (-1), (byte) $$e, (byte) 0, objArr9);
                        String str2 = (String) objArr9[0];
                        Class cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
                        map4.put(700818725, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    int i22 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i22) {
                        Object[] objArr10 = new Object[11];
                        objArr10[10] = completedVar;
                        objArr10[9] = Integer.valueOf(cCharValue);
                        objArr10[c11] = completedVar;
                        objArr10[7] = Integer.valueOf(cCharValue);
                        objArr10[6] = Integer.valueOf(cCharValue);
                        objArr10[5] = completedVar;
                        objArr10[4] = completedVar;
                        objArr10[3] = Integer.valueOf(cCharValue);
                        objArr10[i19] = Integer.valueOf(cCharValue);
                        objArr10[1] = completedVar;
                        objArr10[0] = completedVar;
                        Object method5 = map4.get(-248084636);
                        if (method5 == null) {
                            Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 1722, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 48634), ExpandableListView.getPackedPositionType(0L) + 24);
                            byte b18 = (byte) (-1);
                            Object[] objArr11 = new Object[1];
                            d(b18, (byte) (b18 & 6), (byte) 0, objArr11);
                            String str3 = (String) objArr11[0];
                            Class cls8 = Integer.TYPE;
                            method5 = cls7.getMethod(str3, Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                            map4.put(-248084636, method5);
                        }
                        int iIntValue2 = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                        int i23 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i24 = completedVar.getSDKTransactionID;
                        cArr5[i24] = cArr3[iIntValue2];
                        cArr5[i24 + 1] = cArr3[i23];
                    } else {
                        int i25 = completedVar.getDeviceData;
                        int i26 = completedVar.AuthenticationRequestParameters;
                        if (i25 == i26) {
                            $11 = ($10 + 49) % 128;
                            int i27 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i27;
                            int i28 = ((i22 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i28;
                            int i29 = (i26 * cCharValue) + i28;
                            int i31 = completedVar.getSDKTransactionID;
                            cArr5[i31] = cArr3[(i25 * cCharValue) + i27];
                            cArr5[i31 + 1] = cArr3[i29];
                        } else {
                            int i32 = (i25 * cCharValue) + i22;
                            int i33 = (i26 * cCharValue) + completedVar.getMessageVersion;
                            int i34 = completedVar.getSDKTransactionID;
                            cArr5[i34] = cArr3[i32];
                            cArr5[i34 + 1] = cArr3[i33];
                        }
                    }
                }
                completedVar.getSDKTransactionID += 2;
                c12 = c11;
            }
        }
        for (int i35 = 0; i35 < i11; i35++) {
            cArr5[i35] = (char) (cArr5[i35] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 20
            int r6 = 24 - r6
            byte[] r0 = atd.k.getSDKReferenceNumber.$$a
            int r7 = r7 * 18
            int r7 = 21 - r7
            int r8 = r8 * 2
            int r8 = r8 + 103
            byte[] r1 = new byte[r7]
            r2 = 0
            r3 = r8
            if (r0 != 0) goto L17
            r4 = r2
            r8 = r6
            goto L2b
        L17:
            r8 = r6
            r6 = r3
            r3 = r2
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
        L2b:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + 3
            int r8 = r8 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getSDKReferenceNumber.c(int, byte, short, java.lang.Object[]):void");
    }

    private static void d(byte b11, short s11, int i11, Object[] objArr) {
        int i12 = s11 + 67;
        int i13 = i11 * 2;
        byte[] bArr = $$d;
        int i14 = b11 + 4;
        byte[] bArr2 = new byte[1 - i13];
        int i15 = 0 - i13;
        int i16 = -1;
        if (bArr == null) {
            i12 = i14 + (-i15);
            i14 = i14;
        }
        while (true) {
            i16++;
            int i17 = i14 + 1;
            bArr2[i16] = (byte) i12;
            if (i16 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i12 += -bArr[i17];
                i14 = i17;
            }
        }
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] getSDKReferenceNumber(int r41, int r42) {
        /*
            Method dump skipped, instruction units count: 2106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.k.getSDKReferenceNumber.getSDKReferenceNumber(int, int):java.lang.Object[]");
    }

    static void init$0() {
        $$a = new byte[]{120, -2, 118, Tnaf.POW_2_WIDTH, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10, -2, 24};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE;
    }

    static void init$1() {
        $$d = new byte[]{17, -107, -57, -94};
        $$e = 55;
    }

    public final DisplayMetrics cs_() {
        int i11 = (ChallengeResultCancelled + 119) % 128;
        BuildConfig = i11;
        DisplayMetrics displayMetrics = this.getSDKReferenceNumber;
        int i12 = i11 + 75;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            return displayMetrics;
        }
        throw null;
    }
}
