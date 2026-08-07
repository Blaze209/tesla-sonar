package atd.aa;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProviderFriendlyNameProvider;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "get", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusReceiver implements ChallengeResultTimeout {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final Application AuthenticationRequestParameters;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getDeviceData = new int[]{-127418001, -863100666, 1357705515, -1152641637, 1188974529, 857859345, 722016901, -77295266, -1157247973, -1443785407, 593851258, -563478953, 150725659, 1764399460, -2097163171, 356616742, 766237491, 534339523};
    }

    public ChallengeStatusReceiver(Application application) {
        s.k(application, "");
        this.AuthenticationRequestParameters = application;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x041c  */
    /* JADX WARN: Code duplicated, block: B:49:0x041d A[Catch: all -> 0x07c9, TryCatch #4 {all -> 0x07c9, blocks: (B:5:0x0072, B:9:0x00c6, B:8:0x008b, B:17:0x01b1, B:21:0x020d, B:34:0x02e7, B:38:0x0336, B:87:0x06a3, B:91:0x0705, B:90:0x06c0, B:95:0x0757, B:99:0x07b1, B:98:0x0773, B:46:0x0406, B:50:0x045e, B:49:0x041d, B:37:0x02f7, B:20:0x01ce, B:24:0x026c, B:28:0x02c2, B:27:0x0285), top: B:121:0x002d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v109 */
    /* JADX WARN: Type inference failed for: r5v110 */
    /* JADX WARN: Type inference failed for: r5v111 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v79, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v85, types: [int] */
    /* JADX WARN: Type inference failed for: r5v97, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v98 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r37, int r38, int r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeStatusReceiver.AuthenticationRequestParameters(android.content.Context, int, int):java.lang.Object[]");
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        long j11;
        Object method;
        Object method2;
        Integer num = 1109131256;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i12 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getDeviceData;
        Class cls = Integer.TYPE;
        if (iArr2 != null) {
            int i13 = $10;
            j11 = 0;
            $11 = (i13 + 61) % 128;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            $11 = (i13 + 47) % 128;
            int i14 = 0;
            while (i14 < length) {
                $10 = ($11 + 91) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1861, (char) Color.blue(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i14] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i14++;
                    cArr = cArr;
                    iArr2 = iArr2;
                    length = length;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        } else {
            j11 = 0;
        }
        char[] cArr3 = cArr;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getDeviceData;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i15 = 0;
            while (i15 < length3) {
                int i16 = $11 + 63;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1863, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 21 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        c(b13, b14, b14, objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr6[i15] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i15 >>= 1;
                } else {
                    num = num;
                    cArr2 = cArr2;
                    iArr5 = iArr5;
                    length3 = length3;
                    iArr6 = iArr6;
                    int i17 = i15;
                    Object[] objArr6 = {Integer.valueOf(iArr5[i17])};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - TextUtils.indexOf("", "", 0, 0), (char) View.getDefaultSize(0, 0), 22 - (SystemClock.elapsedRealtime() > j11 ? 1 : (SystemClock.elapsedRealtime() == j11 ? 0 : -1)));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        c(b15, b16, b16, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr6[i17] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    i15 = i17 + 1;
                }
                length3 = length3;
                iArr5 = iArr5;
                iArr6 = iArr6;
                cArr2 = cArr2;
                num = num;
            }
            iArr5 = iArr6;
        }
        Integer num2 = num;
        char[] cArr4 = cArr2;
        int i18 = 16;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        $11 = ($10 + 69) % 128;
        while (true) {
            int i19 = challengeResultCompleted.getDeviceData;
            if (i19 >= iArr.length) {
                break;
            }
            int i21 = iArr[i19];
            char c11 = (char) (i21 >> 16);
            cArr3[0] = c11;
            char c12 = (char) i21;
            cArr3[1] = c12;
            char c13 = (char) (iArr[i19 + 1] >> 16);
            cArr3[i12] = c13;
            char c14 = (char) iArr[i19 + 1];
            char c15 = 3;
            cArr3[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i22 = 0;
            while (i22 < i18) {
                int i23 = challengeResultCompleted.getSDKAppID ^ iArr4[i22];
                challengeResultCompleted.getSDKAppID = i23;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i23);
                Object[] objArr8 = new Object[4];
                objArr8[c15] = challengeResultCompleted;
                objArr8[i12] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(0) + 20) >> 6) + 1299, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8), ((Process.getThreadPriority(0) + 20) >> 6) + 33);
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr9 = new Object[1];
                    c(b17, b18, (byte) (b18 + 3), objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i22++;
                c15 = c15;
                i18 = 16;
            }
            char c16 = c15;
            int i24 = challengeResultCompleted.getSDKAppID;
            int i25 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i25;
            challengeResultCompleted.getSDKReferenceNumber = i24;
            i18 = 16;
            int i26 = i24 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i26;
            int i27 = i25 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i27;
            cArr3[0] = (char) (i27 >>> 16);
            cArr3[1] = (char) i27;
            cArr3[i12] = (char) (i26 >>> 16);
            cArr3[c16] = (char) i26;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i28 = challengeResultCompleted.getDeviceData;
            cArr4[i28 * 2] = cArr3[0];
            cArr4[(i28 * 2) + 1] = cArr3[1];
            cArr4[(i28 * 2) + 2] = cArr3[i12];
            cArr4[(i28 * 2) + 3] = cArr3[c16];
            Object[] objArr10 = new Object[i12];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object method5 = map5.get(num3);
            if (method5 == null) {
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2061, (char) KeyEvent.keyCodeFromString(""), 17 - Color.red(0));
                byte b19 = (byte) 0;
                byte b21 = b19;
                Object[] objArr11 = new Object[1];
                c(b19, b21, (byte) (b21 + 2), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(num3, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            num2 = num3;
            i12 = 2;
        }
        String str = new String(cArr4, 0, i11);
        int i29 = $10 + 75;
        $11 = i29 % 128;
        if (i29 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void b(byte b11, int i11, byte b12, Object[] objArr) {
        byte[] bArr = $$a;
        int i12 = (i11 * 2) + 4;
        int i13 = b11 + 65;
        byte[] bArr2 = new byte[31 - b12];
        int i14 = 30 - b12;
        int i15 = -1;
        if (bArr == null) {
            i13 = i14 + (-i13) + 6;
            i12++;
            bArr = bArr;
            i15 = -1;
        }
        while (true) {
            int i16 = i15 + 1;
            bArr2[i16] = (byte) i13;
            if (i16 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i13 = i13 + (-bArr[i12]) + 6;
            i12++;
            bArr = bArr;
            i15 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r0 = 1 - r5
            byte[] r1 = atd.aa.ChallengeStatusReceiver.$$d
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 + 117
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L17
            r7 = r5
            r3 = r6
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r6]
        L29:
            int r6 = r6 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeStatusReceiver.c(short, byte, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{103, 33, 110, -94, 8, -9, 39, 21, -1, -1, -13, 5, 7, -7, 19, -3, 17, 4, 29, -33, 14, 17, 3, -7, -46, 7, 18, 9, -3, 0, 17, 12, 8, -13, 17, 0, 7, 34, -13, -6, 2, 22, -8, 5, 42, -11, -11, 23, -6, 14, -9, 21, -7, 5, 8, -9, 39, 21, -1, Tnaf.POW_2_WIDTH, -41, 6, 45, 11, 1, 27, 39};
        $$b = 51;
    }

    static void init$1() {
        $$d = new byte[]{87, -6, 59, -47};
        $$e = 179;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        return r0.getPasspointProviderFriendlyName();
     */
    @Override // atd.aa.ChallengeResultTimeout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getDeviceData() throws java.lang.Throwable {
        /*
            r5 = this;
            android.app.Application r0 = r5.AuthenticationRequestParameters
            r1 = 1863169974(0x6f0db7b6, float:4.385948E28)
            r2 = 1804637764(0x6b909644, float:3.4958985E26)
            int[] r1 = new int[]{r1, r2}
            r2 = 0
            int r3 = android.view.Gravity.getAbsoluteGravity(r2, r2)
            int r3 = 4 - r3
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            a(r1, r3, r4)
            r1 = r4[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.net.wifi.WifiManager
            r3 = 0
            if (r1 == 0) goto L35
            int r1 = atd.aa.ChallengeStatusReceiver.getSDKAppID
            int r1 = r1 + 55
            int r1 = r1 % 128
            atd.aa.ChallengeStatusReceiver.getSDKTransactionID = r1
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0
            goto L36
        L35:
            r0 = r3
        L36:
            if (r0 == 0) goto L59
            int r1 = atd.aa.ChallengeStatusReceiver.getSDKAppID
            int r1 = r1 + 95
            int r4 = r1 % 128
            atd.aa.ChallengeStatusReceiver.getSDKTransactionID = r4
            int r1 = r1 % 2
            if (r1 != 0) goto L4e
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            r1 = 59
            int r1 = r1 / r2
            if (r0 == 0) goto L59
            goto L54
        L4e:
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            if (r0 == 0) goto L59
        L54:
            java.lang.String r0 = r0.getPasspointProviderFriendlyName()
            return r0
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.ChallengeStatusReceiver.getDeviceData():java.lang.String");
    }
}
