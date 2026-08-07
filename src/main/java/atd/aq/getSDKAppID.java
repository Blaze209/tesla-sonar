package atd.aq;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultError;
import atd.az.ChallengeResultTimeout;
import atd.az.completed;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001dB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\rJ8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/adyen/threeds2/internal/ui/Paddings;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "component1", "component2", "component3", "component4", "copy", "(IIII)Lcom/adyen/threeds2/internal/ui/Paddings;", "I", "getLeft", "getTop", "getRight", "getBottom", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static long ChallengeResultCancelled;
    private static int getMessageVersion;
    public static final AuthenticationRequestParameters getSDKAppID;
    private static char getSDKEphemeralPublicKey;
    private final int AuthenticationRequestParameters;
    private final int getDeviceData;
    private final int getSDKReferenceNumber;
    private final int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/ui/Paddings$Companion;", "", "<init>", "()V", "from", "Lcom/adyen/threeds2/internal/ui/Paddings;", "view", "Landroid/view/View;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] getSDKAppID;
        private static char getSDKReferenceNumber;
        private static char[] getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = new char[]{30744, 30835, 30819, 30784, 30900, 30902, 30907, 30909, 30903, 30907, 30909, 30902, 30908, 30902, 30902, 30903, 30798, 30803, 30903, 30911, 30903, 30894, 30900, 30901, 30893, 30798, 30810, 30902, 30895, 30901, 30806, 30798, 30797, 30833, 30835, 30834, 30814, 30813, 30751, 30846, 30839, 30826, 30721, 30723, 30840, 30721, 30825, 30807, 30805, 30798, 30802, 30808, 30838, 30729, 30838, 30843, 30721, 30825, 30807, 30805, 30798, 30802, 30808, 30844, 30732, 30826, 30813, 30805, 30800, 30818, 30849, 30975, 30973, 30966, 30970, 30848, 30879, 30878, 30975, 30968, 30967, 30970, 30975, 30967, 30871, 30894, 30863, 30968, 30967, 30970, 30968, 30960, 30733, 30808, 30802, 30812, 30822, 30812, 30809, 30808, 30810, 30808, 30823, 30825, 30809, 30809, 30810, 30808, 30805, 30742, 30812, 30802, 30808, 30808, 30807, 30809, 30825, 30823, 30808, 30810, 30808, 30809, 30812, 30746, 30821, 30804, 30804, 30805, 30808, 30802, 30812, 30822, 30812, 30809, 30808, 30810, 30808, 30731, 30808, 30810, 30808, 30825, 30821, 30804, 30804, 30806, 30809, 30807, 30805, 30798, 30802, 30808, 30839, 30838, 30807, 30800, 30799, 30802, 30807, 30799, 30831, 30833, 30800, 30835, 30721, 30822, 30812, 30819, 30856, 30858, 30861, 30971, 30732, 30810, 30806, 30809, 30804, 30797, 30798, 30821, 30816, 30802, 30808, 30793, 30922, 30920, 30918, 30915, 30919, 30925, 30952, 30955, 30920, 30917, 30912, 30919, 30920, 30912, 30944, 30946, 30917, 30948, 30963, 30933, 30923, 30921, 30922, 30921, 31039, 31038, 30918, 30906, 31025, 31015, 31038, 30917, 31018, 31015, 31022, 31026, 31019, 30914, 30727, 30805, 30807, 30807, 30808, 30808, 30802, 30804, 30812, 30808, 30809, 30809, 30800, 30797, 30805, 30826, 30826, 30802, 30804, 30733, 30800, 30802, 30810, 30806, 30807, 30807, 30798, 30795, 30803, 30824, 30846, 30728, 30730, 30838, 30843, 30829, 30795, 30803, 30808, 30836, 30827, 30790, 30798, 30801, 30795, 30800, 30808, 30800, 30828, 30839, 30803, 30803, 30809};
            getSDKTransactionID = new char[]{52366, 52372, 52405, 52368, 52362, 52381, 52360, 52375, 52358, 52408, 52395, 52391, 52401, 52409, 52412, 52400, 52376, 52397, 52402, 52396, 52410, 52398, 52369, 52370, 52413, 52394, 52392, 52407, 52451, 52464, 52404, 52378, 52462, 52373, 52403, 52363, 52415, 52382, 52371, 52374, 52367, 52478, 52383, 52380, 52411, 52365, 52459, 52466, 52361};
            getSDKReferenceNumber = (char) 63811;
        }

        private AuthenticationRequestParameters() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 3
                int r9 = r9 + 103
                int r8 = r8 * 3
                int r8 = 3 - r8
                int r7 = r7 * 2
                int r7 = 21 - r7
                byte[] r0 = atd.aq.getSDKAppID.AuthenticationRequestParameters.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L18
                r9 = r8
                r3 = r0
                r4 = r2
                r0 = r7
                goto L31
            L18:
                r3 = r2
            L19:
                int r8 = r8 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L31:
                int r8 = -r8
                int r0 = r0 + r8
                int r8 = r0 + 3
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aq.getSDKAppID.AuthenticationRequestParameters.a(int, short, byte, java.lang.Object[]):void");
        }

        private static void b(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
            int i11;
            String str2;
            Class<Object> cls;
            Object method;
            String str3 = str;
            Class<Object> cls2 = Object.class;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            ChallengeResultError challengeResultError = new ChallengeResultError();
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = iArr[3];
            char[] cArr = getSDKAppID;
            Class cls3 = Integer.TYPE;
            String str4 = "";
            int i16 = 1;
            if (cArr != null) {
                int i17 = $11;
                $10 = (i17 + 15) % 128;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                $10 = (i17 + 101) % 128;
                int i18 = 0;
                while (i18 < length) {
                    try {
                        int i19 = i18;
                        Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                        char[] cArr3 = cArr2;
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(-1708792688);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2312 - TextUtils.lastIndexOf(str4, '0', 0, 0), (char) (ImageFormat.getBitsPerPixel(0) + 1), (Process.myTid() >> 22) + 24);
                            byte b11 = (byte) 0;
                            Object[] objArr3 = new Object[i16];
                            d((byte) 33, b11, b11, objArr3);
                            method = cls4.getMethod((String) objArr3[0], cls3);
                            map.put(-1708792688, method);
                        }
                        cArr3[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i18 = i19 + 1;
                        cArr2 = cArr3;
                        length = length;
                        i14 = i14;
                        i15 = i15;
                        cArr = cArr;
                        cls2 = cls2;
                        str4 = str4;
                        i16 = 1;
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
            Class<Object> cls5 = cls2;
            String str5 = str4;
            int i21 = i14;
            int i22 = i15;
            char[] cArr4 = new char[i13];
            System.arraycopy(cArr, i12, cArr4, 0, i13);
            if (bArr != 0) {
                char[] cArr5 = new char[i13];
                challengeResultError.getSDKAppID = 0;
                char c11 = 0;
                while (true) {
                    int i23 = challengeResultError.getSDKAppID;
                    if (i23 >= i13) {
                        break;
                    }
                    int i24 = $10;
                    $11 = (i24 + 19) % 128;
                    if (bArr[i23] == 1) {
                        $11 = (i24 + 43) % 128;
                        Object[] objArr4 = {Integer.valueOf(cArr4[i23]), Integer.valueOf(c11)};
                        Map map2 = getMessageVersion.timedout;
                        Object method2 = map2.get(10570995);
                        if (method2 == null) {
                            Class cls6 = (Class) getMessageVersion.getSDKTransactionID(558 - (KeyEvent.getMaxKeyCode() >> 16), (char) (5486 - View.getDefaultSize(0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22);
                            byte b12 = (byte) 0;
                            Object[] objArr5 = new Object[1];
                            d((byte) 31, b12, b12, objArr5);
                            method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                            map2.put(10570995, method2);
                        }
                        cArr5[i23] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    } else {
                        cArr4 = cArr4;
                        Object[] objArr6 = {Integer.valueOf(cArr4[i23]), Integer.valueOf(c11)};
                        Map map3 = getMessageVersion.timedout;
                        Object method3 = map3.get(-502074319);
                        if (method3 == null) {
                            method3 = ((Class) getMessageVersion.getSDKTransactionID(201 - View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getPressedStateDuration() >> 16), (-16777192) - Color.rgb(0, 0, 0))).getMethod("a", cls3, cls3);
                            map3.put(-502074319, method3);
                        }
                        cArr5[i23] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    }
                    c11 = cArr5[challengeResultError.getSDKAppID];
                    Object[] objArr7 = {challengeResultError, challengeResultError};
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(-399400818);
                    if (method4 != null) {
                        cls = cls5;
                        str2 = str5;
                    } else {
                        str2 = str5;
                        Class cls7 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 853, (char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf(str2, str2, 0) + 24);
                        byte b13 = (byte) 0;
                        Object[] objArr8 = new Object[1];
                        d((byte) 37, b13, b13, objArr8);
                        cls = cls5;
                        method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                        map4.put(-399400818, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                    cls5 = cls;
                    str5 = str2;
                    cArr4 = cArr4;
                    cArr5 = cArr5;
                }
                cArr4 = cArr5;
            }
            if (i22 > 0) {
                char[] cArr6 = new char[i13];
                i11 = 0;
                System.arraycopy(cArr4, 0, cArr6, 0, i13);
                int i25 = i13 - i22;
                System.arraycopy(cArr6, 0, cArr4, i25, i22);
                System.arraycopy(cArr6, i22, cArr4, 0, i25);
            } else {
                i11 = 0;
            }
            if (z11) {
                $10 = ($11 + 121) % 128;
                char[] cArr7 = new char[i13];
                challengeResultError.getSDKAppID = i11;
                while (true) {
                    int i26 = challengeResultError.getSDKAppID;
                    if (i26 >= i13) {
                        break;
                    }
                    cArr7[i26] = cArr4[(i13 - i26) - 1];
                    challengeResultError.getSDKAppID = i26 + 1;
                }
                cArr4 = cArr7;
            }
            if (i21 > 0) {
                int i27 = $10 + 25;
                $11 = i27 % 128;
                challengeResultError.getSDKAppID = i27 % 2 == 0 ? 1 : 0;
                while (true) {
                    int i28 = challengeResultError.getSDKAppID;
                    if (i28 >= i13) {
                        break;
                    }
                    cArr4[i28] = (char) (cArr4[i28] - iArr[2]);
                    challengeResultError.getSDKAppID = i28 + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private static void c(byte b11, String str, int i11, Object[] objArr) throws Throwable {
            int i12;
            char c11;
            Object method;
            Class cls;
            Object method2;
            char[] charArray = str != null ? str.toCharArray() : str;
            completed completedVar = new completed();
            char[] cArr = getSDKTransactionID;
            Class cls2 = Integer.TYPE;
            String str2 = "";
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i13 = 0;
                while (i13 < length) {
                    $11 = ($10 + 77) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(-1709775791);
                        if (obj != null) {
                            cls = cls2;
                            method2 = obj;
                        } else {
                            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString(str2) + 2314, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            cls = cls2;
                            Object[] objArr3 = new Object[1];
                            d(b12, b13, b13, objArr3);
                            method2 = cls3.getMethod((String) objArr3[0], cls);
                            map.put(-1709775791, method2);
                        }
                        cArr2[i13] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                        i13++;
                        cArr = cArr;
                        charArray = charArray;
                        cls2 = cls;
                        str2 = str2;
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
            Class cls4 = cls2;
            String str3 = str2;
            Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(-1709775791);
            if (method3 == null) {
                Class cls5 = (Class) getMessageVersion.getSDKTransactionID(2313 - Color.green(0), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 24);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr5 = new Object[1];
                d(b14, b15, b15, objArr5);
                method3 = cls5.getMethod((String) objArr5[0], cls4);
                map2.put(-1709775791, method3);
            }
            char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i11];
            char c12 = 2;
            if (i11 % 2 != 0) {
                int i14 = $10 + 45;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    i12 = i11 + 121;
                    cArr4[i12] = (char) (cArr3[i12] / b11);
                } else {
                    i12 = i11 - 1;
                    cArr4[i12] = (char) (cArr3[i12] - b11);
                }
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
                    char c13 = cArr3[i15];
                    completedVar.getSDKAppID = c13;
                    char c14 = cArr3[i15 + 1];
                    completedVar.getSDKReferenceNumber = c14;
                    if (c13 == c14) {
                        cArr4[i15] = (char) (c13 - b11);
                        cArr4[i15 + 1] = (char) (c14 - b11);
                        $10 = ($11 + 57) % 128;
                        c11 = c12;
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
                        objArr6[c12] = Integer.valueOf(cCharValue);
                        objArr6[1] = completedVar;
                        objArr6[0] = completedVar;
                        c11 = c12;
                        Map map3 = getMessageVersion.timedout;
                        Object obj2 = map3.get(700818725);
                        if (obj2 != null) {
                            method = obj2;
                        } else {
                            Class cls6 = (Class) getMessageVersion.getSDKTransactionID(Process.getGidForName(str3) + 1920, (char) TextUtils.getTrimmedLength(str3), ((byte) KeyEvent.getModifierMetaStateMask()) + 30);
                            byte b16 = (byte) 0;
                            Object[] objArr7 = new Object[1];
                            d((byte) 55, b16, b16, objArr7);
                            String str4 = (String) objArr7[0];
                            Class cls7 = Integer.TYPE;
                            method = cls6.getMethod(str4, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                            map3.put(700818725, method);
                        }
                        int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        int i16 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i16) {
                            Object[] objArr8 = new Object[11];
                            objArr8[10] = completedVar;
                            objArr8[9] = Integer.valueOf(cCharValue);
                            objArr8[8] = completedVar;
                            objArr8[7] = Integer.valueOf(cCharValue);
                            objArr8[r14] = Integer.valueOf(cCharValue);
                            objArr8[5] = completedVar;
                            objArr8[4] = completedVar;
                            objArr8[3] = Integer.valueOf(cCharValue);
                            objArr8[c11] = Integer.valueOf(cCharValue);
                            objArr8[1] = completedVar;
                            objArr8[0] = completedVar;
                            Object method4 = map3.get(-248084636);
                            if (method4 == null) {
                                Class cls8 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > r9 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == r9 ? 0 : -1)) + 1722, (char) (48633 - ((byte) KeyEvent.getModifierMetaStateMask())), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 23);
                                byte b17 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                d((byte) 6, b17, b17, objArr9);
                                String str5 = (String) objArr9[0];
                                Class cls9 = Integer.TYPE;
                                method4 = cls8.getMethod(str5, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                                map3.put(-248084636, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                            int i17 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i18 = completedVar.getSDKTransactionID;
                            cArr4[i18] = cArr[iIntValue2];
                            cArr4[i18 + 1] = cArr[i17];
                        } else {
                            int i19 = completedVar.getDeviceData;
                            int i21 = completedVar.AuthenticationRequestParameters;
                            if (i19 == i21) {
                                $10 = ($11 + 65) % 128;
                                int i22 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i22;
                                int i23 = ((i16 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i23;
                                int i24 = (i21 * cCharValue) + i23;
                                int i25 = completedVar.getSDKTransactionID;
                                cArr4[i25] = cArr[(i19 * cCharValue) + i22];
                                cArr4[i25 + 1] = cArr[i24];
                            } else {
                                int i26 = (i19 * cCharValue) + i16;
                                int i27 = (i21 * cCharValue) + completedVar.getMessageVersion;
                                int i28 = completedVar.getSDKTransactionID;
                                cArr4[i28] = cArr[i26];
                                cArr4[i28 + 1] = cArr[i27];
                            }
                            completedVar.getSDKTransactionID += 2;
                            c12 = c11;
                        }
                    }
                    completedVar.getSDKTransactionID += 2;
                    c12 = c11;
                }
            }
            for (int i29 = 0; i29 < i11; i29++) {
                cArr4[i29] = (char) (cArr4[i29] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(byte r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 4
                int r6 = r6 + 4
                int r7 = r7 * 2
                int r0 = 1 - r7
                byte[] r1 = atd.aq.getSDKAppID.AuthenticationRequestParameters.$$d
                int r5 = r5 + 67
                byte[] r0 = new byte[r0]
                r2 = 0
                int r7 = 0 - r7
                if (r1 != 0) goto L16
                r4 = r7
                r3 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                int r3 = r3 + 1
                r4 = r1[r6]
            L28:
                int r6 = r6 + 1
                int r5 = r5 + r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aq.getSDKAppID.AuthenticationRequestParameters.d(byte, short, int, java.lang.Object[]):void");
        }

        public static getSDKAppID getDeviceData(View view) {
            return new getSDKAppID(view != null ? view.getPaddingLeft() : 0, view != null ? view.getPaddingTop() : 0, view != null ? view.getPaddingRight() : 0, view != null ? view.getPaddingBottom() : 0);
        }

        static void init$0() {
            $$a = new byte[]{2, 58, 30, 104, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10};
            $$b = 125;
        }

        static void init$1() {
            $$d = new byte[]{43, -27, -101, 53};
            $$e = 200;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(android.content.Context r29, int r30, int r31) {
            /*
                Method dump skipped, instruction units count: 1523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aq.getSDKAppID.AuthenticationRequestParameters.getDeviceData(android.content.Context, int, int):java.lang.Object[]");
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeResult = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters();
        getSDKAppID = new AuthenticationRequestParameters((byte) 0);
        int i11 = ChallengeResult + 13;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 68 / 0;
        }
    }

    public getSDKAppID(int i11, int i12, int i13, int i14) {
        this.getSDKReferenceNumber = i11;
        this.getDeviceData = i12;
        this.AuthenticationRequestParameters = i13;
        this.getSDKTransactionID = i14;
    }

    static void AuthenticationRequestParameters() {
        ChallengeResultCancelled = -4201337076207898698L;
        getMessageVersion = 1458778038;
        getSDKEphemeralPublicKey = (char) 64916;
    }

    private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        char[] charArray3;
        long j11;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        int i12 = 2;
        if (str3 != null) {
            int i13 = $10 + 43;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if (str2 != null) {
            int i14 = $10 + 33;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray2 = str2.toCharArray();
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        if (str != null) {
            int i15 = $10 + 107;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray3 = str.toCharArray();
        } else {
            charArray3 = str;
        }
        char[] cArr3 = charArray3;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        int i16 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c11);
        cArr5[2] = (char) (cArr5[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        $10 = ($11 + 49) % 128;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = getMessageVersion.timedout;
                Object method = map.get(num2);
                int i17 = i12;
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(i16) + 1863, (char) View.MeasureSpec.getSize(i16), 21 - KeyEvent.normalizeMetaState(i16));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 != null) {
                    j11 = 0;
                } else {
                    j11 = 0;
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) TextUtils.getOffsetAfter("", 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i18 = cArr4[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i17] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[1] = Integer.valueOf(i18);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2447 - (ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1)), (char) ((-16777216) - Color.rgb(0, 0, 0)), 17 - ExpandableListView.getPackedPositionChild(j11));
                    byte b13 = (byte) 1;
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i19 = cArr4[iIntValue2] * 32718;
                char c12 = cArr5[iIntValue];
                i12 = i17;
                Object[] objArr7 = new Object[i12];
                objArr7[1] = Integer.valueOf(c12);
                objArr7[0] = Integer.valueOf(i19);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID(2969 - (Process.myPid() >> 22), (char) (TextUtils.indexOf((CharSequence) "", '0') + 9914), 37 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c13 = challengeResultTimeout.getDeviceData;
                cArr4[iIntValue2] = c13;
                int i21 = challengeResultTimeout.getSDKTransactionID;
                cArr6[i21] = (char) (((((long) (c13 ^ cArr[i21])) ^ (ChallengeResultCancelled ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getMessageVersion) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKEphemeralPublicKey) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i21 + 1;
                cArr = cArr;
                length3 = length3;
                cArr4 = cArr4;
                num2 = num2;
                num = num;
                i16 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 4 - r9
            int r7 = r7 * 4
            int r7 = r7 + 102
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r0 = atd.aq.getSDKAppID.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r8
            r3 = r0
            r5 = r2
            r0 = r9
            goto L2e
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L2e:
            int r7 = r7 + r9
            int r9 = r0 + 1
            r0 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aq.getSDKAppID.b(int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        return getSDKReferenceNumber(objArr);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = ChallengeResult + 65;
        BuildConfig = i11 % 128;
        int i12 = i11 % 2;
        int i13 = getsdkappid.AuthenticationRequestParameters;
        if (i12 != 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    static void init$0() {
        $$a = new byte[]{81, 93, -56, -49};
        $$b = 224;
    }

    public final boolean equals(Object other) {
        int i11 = BuildConfig;
        int i12 = i11 + 103;
        int i13 = i12 % 128;
        ChallengeResult = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (this == other) {
            int i14 = i11 + 85;
            ChallengeResult = i14 % 128;
            if (i14 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof getSDKAppID)) {
            BuildConfig = (i13 + 71) % 128;
            return false;
        }
        getSDKAppID getsdkappid = (getSDKAppID) other;
        if (this.getSDKReferenceNumber != getsdkappid.getSDKReferenceNumber || this.getDeviceData != getsdkappid.getDeviceData) {
            return false;
        }
        if (this.AuthenticationRequestParameters == getsdkappid.AuthenticationRequestParameters) {
            return this.getSDKTransactionID == getsdkappid.getSDKTransactionID;
        }
        ChallengeResult = (i11 + 31) % 128;
        return false;
    }

    public final int getSDKAppID() {
        int i11 = (ChallengeResult + 17) % 128;
        BuildConfig = i11;
        int i12 = this.getDeviceData;
        ChallengeResult = (i11 + 59) % 128;
        return i12;
    }

    public final int getSDKTransactionID() {
        int i11;
        int i12 = ChallengeResult;
        int i13 = i12 + 77;
        BuildConfig = i13 % 128;
        if (i13 % 2 == 0) {
            i11 = this.getSDKTransactionID;
            int i14 = 78 / 0;
        } else {
            i11 = this.getSDKTransactionID;
        }
        BuildConfig = (i12 + 31) % 128;
        return i11;
    }

    public final int hashCode() {
        int i11 = ChallengeResult + 35;
        BuildConfig = i11 % 128;
        return i11 % 2 == 0 ? (((((Integer.hashCode(this.getSDKReferenceNumber) >> 61) >> Integer.hashCode(this.getDeviceData)) >> 15) - Integer.hashCode(this.AuthenticationRequestParameters)) + 42) >>> Integer.hashCode(this.getSDKTransactionID) : (((((Integer.hashCode(this.getSDKReferenceNumber) * 31) + Integer.hashCode(this.getDeviceData)) * 31) + Integer.hashCode(this.AuthenticationRequestParameters)) * 31) + Integer.hashCode(this.getSDKTransactionID);
    }

    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("뫂Ꚁ繈꿊", "\u0000\u0000\u0000\u0000", (char) (51838 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\ue1e2\uf7a0ἅ裸맔㭭啞앷䬴䞩⣂玜崐覆", KeyEvent.keyCodeFromString(""), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.getSDKReferenceNumber);
        Object[] objArr2 = new Object[1];
        a("긆ᾅ꼸䅮", "\u0000\u0000\u0000\u0000", (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 28335), "\ued23婮곯許\u242f첳", TextUtils.getCapsMode("", 0, 0), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(this.getDeviceData);
        Object[] objArr3 = new Object[1];
        a("㪦\u008bꓙ䫂", "\u0000\u0000\u0000\u0000", (char) TextUtils.indexOf("", "", 0), "竕塳潡\u0b80\udf1d\ued65穥᯲", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(this.AuthenticationRequestParameters);
        Object[] objArr4 = new Object[1];
        a("뤱\uecb8\ua7e9\ue672", "\u0000\u0000\u0000\u0000", (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "뮒罉뚇\ud83d菤\uea7d莗됚竅", (ViewConfiguration.getPressedStateDuration() >> 16) - 370362183, objArr4);
        sb2.append(((String) objArr4[0]).intern());
        sb2.append(this.getSDKTransactionID);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String string = sb2.toString();
        int i11 = BuildConfig + 43;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 77 / 0;
        }
        return string;
    }

    public final int getDeviceData() {
        int i11 = BuildConfig + 5;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            return this.getSDKReferenceNumber;
        }
        throw null;
    }

    public final int getSDKReferenceNumber() {
        return ((Integer) getDeviceData(new Object[]{this}, 2040244595, -2040244595, System.identityHashCode(this))).intValue();
    }
}
