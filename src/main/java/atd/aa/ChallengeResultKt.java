package atd.aa;

import android.app.Application;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", Kind.APPLICATION, "Landroid/app/Application;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "wifiManager", "Landroid/net/wifi/WifiManager;", "getWifiManager", "()Landroid/net/wifi/WifiManager;", "isWifiStatePermissionGranted", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChallengeResultKt extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int[] AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private final Application getDeviceData;
    private final PermissionChecker getSDKTransactionID;

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getSDKAppID = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters = new int[]{511063002, -2117810186, 1504016248, 1894365559, 275270293, -684623887, 323479741, -859399572, -11317357, 1760954431, -1701979695, -822763454, -1017060632, 401910628, 40230720, 1873480428, -1401787376, -1715027394};
        getSDKReferenceNumber = new char[]{30795, 30933, 30935, 30835, 30878, 30876, 30874, 30871, 30875, 30881, 30908, 30911, 30876, 30873, 30868, 30875, 30876, 30868, 30900, 30799, 30892, 30873, 30868, 30875, 30873, 30865, 30734, 30809, 30807, 30805, 30798, 30802, 30808, 30839, 30838, 30807, 30800, 30799, 30802, 30807, 30799, 30831, 30833, 30800, 30835, 30729, 30822, 30798, 30800, 30804, 30808, 30812, 30804, 30800, 30802, 30800, 30821, 30821, 30804, 30804, 30761, 30830, 30804, 30839, 30836, 30802, 30805, 30839, 30834, 30805, 30805, 30800, 30831, 30835, 30802, 30805, 30809, 30838, 30838, 30810, 30813, 30805, 30800, 30809, 30810, 30815, 30809, 30806, 30845, 30904, 30907, 30899, 30894, 30903, 30904, 30909, 30903, 30900, 30899, 30892, 30798, 30758};
    }

    public /* synthetic */ ChallengeResultKt(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        Object method;
        Object method2;
        int length;
        int[] iArr2;
        int i14;
        Object method3;
        Integer num = 1109131256;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i15 = 21;
        int i16 = 2;
        if (iArr3 != null) {
            int i17 = $11 + 3;
            i12 = 16;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i14 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i14 = 0;
            }
            int i18 = i14;
            i13 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i18])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method3 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1861 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 21 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        byte b11 = (byte) (-1);
                        Object[] objArr3 = new Object[1];
                        e((byte) 19, b11, (byte) (b11 + 1), objArr3);
                        method3 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method3);
                    }
                    iArr2[i18] = ((Integer) ((Method) method3).invoke(null, objArr2)).intValue();
                    i18++;
                    cArr = cArr;
                    length = length;
                    iArr3 = iArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        } else {
            i12 = 16;
            i13 = 0;
        }
        char[] cArr3 = cArr;
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AuthenticationRequestParameters;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i19 = i13;
            while (i19 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i19])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object obj2 = map2.get(2050190164);
                if (obj2 != null) {
                    method2 = obj2;
                } else {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getPressedStateDuration() >> 16) + 1862, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 21 - TextUtils.getOffsetBefore("", i13));
                    byte b12 = (byte) (-1);
                    Object[] objArr5 = new Object[1];
                    e((byte) 19, b12, (byte) (b12 + 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2050190164, method2);
                }
                iArr6[i19] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i19++;
                iArr6 = iArr6;
                iArr5 = iArr5;
                length3 = length3;
                cArr2 = cArr2;
                num = num;
                i13 = 0;
            }
            iArr5 = iArr6;
        }
        Integer num2 = num;
        char[] cArr4 = cArr2;
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i21 = challengeResultCompleted.getDeviceData;
            if (i21 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i22 = iArr[i21];
            char c12 = (char) (i22 >> 16);
            cArr3[c11] = c12;
            char c13 = (char) i22;
            cArr3[1] = c13;
            char c14 = (char) (iArr[i21 + 1] >> 16);
            cArr3[i16] = c14;
            char c15 = (char) iArr[i21 + 1];
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i23 = 0;
            while (i23 < i12) {
                int i24 = challengeResultCompleted.getSDKAppID ^ iArr4[i23];
                challengeResultCompleted.getSDKAppID = i24;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i24);
                Object[] objArr6 = new Object[4];
                objArr6[3] = challengeResultCompleted;
                objArr6[i16] = challengeResultCompleted;
                objArr6[1] = Integer.valueOf(sDKAppID);
                objArr6[0] = challengeResultCompleted;
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method4 = map3.get(929629307);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1299 - KeyEvent.normalizeMetaState(0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8), Color.argb(0, 0, 0, 0) + 33);
                    byte b13 = (byte) (-1);
                    Object[] objArr7 = new Object[1];
                    e((byte) 22, b13, (byte) (b13 + 1), objArr7);
                    method4 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                    map3.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i23++;
                i12 = 16;
            }
            int i25 = challengeResultCompleted.getSDKAppID;
            int i26 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i26;
            challengeResultCompleted.getSDKReferenceNumber = i25;
            int i27 = i25 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i27;
            int i28 = i26 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i28;
            cArr3[0] = (char) (i28 >>> 16);
            cArr3[1] = (char) i28;
            cArr3[i16] = (char) (i27 >>> 16);
            cArr3[3] = (char) i27;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i29 = challengeResultCompleted.getDeviceData;
            cArr4[i29 * 2] = cArr3[0];
            cArr4[(i29 * 2) + 1] = cArr3[1];
            cArr4[(i29 * 2) + 2] = cArr3[i16];
            cArr4[(i29 * 2) + 3] = cArr3[3];
            Object[] objArr8 = new Object[i16];
            objArr8[1] = challengeResultCompleted;
            objArr8[0] = challengeResultCompleted;
            Map map4 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object obj3 = map4.get(num3);
            if (obj3 != null) {
                method = obj3;
                i12 = 16;
            } else {
                i12 = 16;
                Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) View.combineMeasuredStates(0, 0), 17 - Color.green(0));
                byte b14 = (byte) (-1);
                Object[] objArr9 = new Object[1];
                e((byte) i15, b14, (byte) (b14 + 1), objArr9);
                method = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(num3, method);
            }
            ((Method) method).invoke(null, objArr8);
            $11 = ($10 + 89) % 128;
            num2 = num3;
            c11 = 0;
            i15 = 21;
            i16 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 17
            int r0 = 38 - r6
            byte[] r1 = atd.aa.ChallengeResultKt.$$d
            int r7 = r7 * 6
            int r7 = 103 - r7
            int r5 = r5 * 37
            int r5 = 41 - r5
            byte[] r0 = new byte[r0]
            int r6 = 37 - r6
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r5]
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r5 = r5 + 1
            int r7 = r7 + (-8)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeResultKt.b(byte, int, byte, java.lang.Object[]):void");
    }

    private static void c(boolean z11, String str, int[] iArr, Object[] objArr) throws Throwable {
        int i11;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Integer num = -399400818;
        Object bytes = str2;
        if (str2 != null) {
            $11 = ($10 + 57) % 128;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr = getSDKReferenceNumber;
        Class cls3 = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                int i17 = i16;
                $11 = ($10 + 77) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i17])};
                    char[] cArr3 = cArr2;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 2313, (char) TextUtils.indexOf("", ""), 23 - MotionEvent.axisFromString(""));
                        byte b11 = (byte) ($$h & 15);
                        byte b12 = (byte) (b11 - 3);
                        Object[] objArr3 = new Object[1];
                        e(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr3[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16 = i17 + 1;
                    cArr2 = cArr3;
                    i14 = i14;
                    length = length;
                    i15 = i15;
                    cArr = cArr;
                    cls2 = cls2;
                    num = num;
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
        Integer num2 = num;
        int i18 = i14;
        int i19 = i15;
        char[] cArr4 = new char[i13];
        System.arraycopy(cArr, i12, cArr4, 0, i13);
        if (bArr != 0) {
            $11 = ($10 + 53) % 128;
            char[] cArr5 = new char[i13];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i21 = challengeResultError.getSDKAppID;
                if (i21 >= i13) {
                    break;
                }
                $10 = ($11 + 1) % 128;
                long j11 = 0;
                if (bArr[i21] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr4[i21]), Integer.valueOf(c11)};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(558 - KeyEvent.getDeadChar(0, 0), (char) (5487 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 23 - Color.red(0));
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr5 = new Object[1];
                        e(b13, b14, (byte) (b14 + 1), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr5[i21] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    j11 = 0;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i21]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, (char) KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 25)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr5[i21] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                char c12 = cArr5[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Integer num3 = num2;
                Object method4 = map4.get(num3);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(855 - (ViewConfiguration.getZoomControlsTimeout() > j11 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j11 ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 24 - (ViewConfiguration.getScrollBarSize() >> 8));
                    byte b15 = (byte) (-1);
                    Object[] objArr8 = new Object[1];
                    e((byte) 6, b15, (byte) (b15 + 1), objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(num3, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                num2 = num3;
                cls5 = cls;
                c11 = c12;
                cArr4 = cArr4;
            }
            cArr4 = cArr5;
        }
        if (i19 > 0) {
            char[] cArr6 = new char[i13];
            i11 = 0;
            System.arraycopy(cArr4, 0, cArr6, 0, i13);
            int i22 = i13 - i19;
            System.arraycopy(cArr6, 0, cArr4, i22, i19);
            System.arraycopy(cArr6, i19, cArr4, 0, i22);
        } else {
            i11 = 0;
        }
        if (z11) {
            $10 = ($11 + 25) % 128;
            char[] cArr7 = new char[i13];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i13) {
                    break;
                }
                cArr7[i23] = cArr4[(i13 - i23) - 1];
                challengeResultError.getSDKAppID = i23 + 1;
            }
            cArr4 = cArr7;
        }
        if (i18 > 0) {
            int i24 = 0;
            while (true) {
                challengeResultError.getSDKAppID = i24;
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i13) {
                    break;
                }
                cArr4[i25] = (char) (cArr4[i25] - iArr[2]);
                i24 = i25 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 122 - r8
            byte[] r0 = atd.aa.ChallengeResultKt.$$a
            int r7 = 31 - r7
            int r9 = r9 * 2
            int r9 = 66 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r8 = r9
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + 6
            int r8 = r8 + 1
            r3 = r9
            r9 = r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeResultKt.d(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void e(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.aa.ChallengeResultKt.$$g
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r5 = r5 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r5
            r5 = r7
            r4 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r5 = r5 + r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeResultKt.e(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Failed to calculate best type for var: r15v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v12 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static java.lang.Object[] getSDKAppID(android.content.Context r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeResultKt.getSDKAppID(android.content.Context, int, int):java.lang.Object[]");
    }

    private static void getSDKTransactionID() throws Throwable {
        ChallengeResultCancelled = (getSDKAppID + 83) % 128;
        int i11 = $$e;
        byte[] bArr = $$d;
        byte b11 = bArr[36];
        Object[] objArr = new Object[1];
        b((byte) (i11 & 3), b11, (byte) (b11 + 1), objArr);
        Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
        ChallengeResultCancelled = (getSDKAppID + 123) % 128;
        byte b12 = (byte) (i11 & 3);
        try {
            byte b13 = bArr[36];
            Object[] objArr2 = new Object[1];
            b(b12, b13, (byte) (b13 + 1), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b14 = bArr[36];
            byte b15 = b14;
            Object[] objArr3 = new Object[1];
            b(b15, (byte) (b15 + 1), b14, objArr3);
            Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
            Object[] objArr4 = {atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null)};
            Object[] objArr5 = new Object[1];
            c(true, "\u0001\u0000\u0001", new int[]{0, 3, 135, 0}, objArr5);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    static void init$0() {
        $$a = new byte[]{81, -98, -48, -128, 8, -9, 39, 21, -1, -1, -13, 5, 7, -7, 19, -3, 17, 4, 29, -33, 14, 17, 3, -7, -46, 7, 18, 9, -3, 0, 17, 12, 8, -13, 17, 0, 7, 34, -13, -6, 2, 22, -8, 5, 42, -11, -11, 23, -6, 14, -9, 21, -7, 5, 8, -9, 39, 21, -1, Tnaf.POW_2_WIDTH, -41, 6, 45, 11, 1, 27, 39};
        $$b = 164;
    }

    static void init$1() {
        $$d = new byte[]{81, -98, -48, -128, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
        $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
    }

    static void init$2() {
        $$g = new byte[]{44, -5, -78, -40};
        $$h = EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
    }

    protected final boolean ChallengeResultCancelled() throws Throwable {
        PermissionChecker permissionChecker;
        Object obj;
        int i11 = getSDKAppID + 43;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 == 0) {
            permissionChecker = this.getSDKTransactionID;
            Object[] objArr = new Object[1];
            a(new int[]{1382512410, 1612972572, -679287452, 690430235, -190413707, 2050662255, -1567952899, 1713050196, -1713333366, 1749446267, -2018175095, -1385843058, -1163726445, -1088146514, 2029514185, -485074661, -375127542, 779232311}, 38 << TextUtils.getOffsetBefore("", 1), objArr);
            obj = objArr[0];
        } else {
            permissionChecker = this.getSDKTransactionID;
            Object[] objArr2 = new Object[1];
            a(new int[]{1382512410, 1612972572, -679287452, 690430235, -190413707, 2050662255, -1567952899, 1713050196, -1713333366, 1749446267, -2018175095, -1385843058, -1163726445, -1088146514, 2029514185, -485074661, -375127542, 779232311}, TextUtils.getOffsetBefore("", 0) + 36, objArr2);
            obj = objArr2[0];
        }
        return permissionChecker.getSDKAppID(((String) obj).intern());
    }

    public final WifiManager cI_() throws Throwable {
        Application application = this.getDeviceData;
        Object[] objArr = new Object[1];
        a(new int[]{1202124544, 2096980461}, TextUtils.lastIndexOf("", '0') + 5, objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        if (!(systemService instanceof WifiManager)) {
            ChallengeResultCancelled = (getSDKAppID + 47) % 128;
            return null;
        }
        int i11 = getSDKAppID + 111;
        ChallengeResultCancelled = i11 % 128;
        WifiManager wifiManager = (WifiManager) systemService;
        if (i11 % 2 != 0) {
            return wifiManager;
        }
        throw null;
    }

    public ChallengeResultKt(Application application, PermissionChecker permissionChecker) {
        s.k(application, "");
        s.k(permissionChecker, "");
        this.getDeviceData = application;
        this.getSDKTransactionID = permissionChecker;
    }
}
