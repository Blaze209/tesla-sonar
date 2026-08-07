package atd.l;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Platform;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class completed extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/Platform$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static long getDeviceData;
        private static int getSDKAppID;
        private static char getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            getSDKTransactionID = 1;
            getDeviceData = 230918054337398574L;
            AuthenticationRequestParameters = 1458778038;
            getSDKReferenceNumber = (char) 12214;
        }

        private getDeviceData() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 2
                int r7 = 65 - r7
                byte[] r0 = atd.l.completed.getDeviceData.$$a
                int r5 = r5 + 65
                int r1 = 31 - r6
                byte[] r1 = new byte[r1]
                int r6 = 30 - r6
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r6
                r5 = r7
                r3 = r2
                goto L2c
            L15:
                r3 = r7
                r7 = r5
                r5 = r3
                r3 = r2
            L19:
                byte r4 = (byte) r7
                int r5 = r5 + 1
                r1[r3] = r4
                if (r3 != r6) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r4 = r0[r5]
                int r3 = r3 + 1
            L2c:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + 6
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.completed.getDeviceData.a(byte, short, byte, java.lang.Object[]):void");
        }

        private static void b(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            char[] charArray2;
            Integer num = -2032575242;
            Integer num2 = 262890898;
            $10 = ($11 + 111) % 128;
            char[] charArray3 = str3 != null ? str3.toCharArray() : str3;
            int i12 = 2;
            int i13 = 0;
            if (str2 != null) {
                int i14 = $10 + 29;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    charArray = str2.toCharArray();
                    int i15 = 39 / 0;
                } else {
                    charArray = str2.toCharArray();
                }
            } else {
                charArray = str2;
            }
            char[] cArr = charArray;
            if (str != null) {
                int i16 = $10 + 71;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    charArray2 = str.toCharArray();
                    int i17 = 92 / 0;
                } else {
                    charArray2 = str.toCharArray();
                }
            } else {
                charArray2 = str;
            }
            char[] cArr2 = charArray2;
            atd.az.ChallengeResultTimeout challengeResultTimeout = new atd.az.ChallengeResultTimeout();
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int length2 = cArr.length;
            char[] cArr4 = new char[length2];
            System.arraycopy(cArr2, 0, cArr3, 0, length);
            System.arraycopy(cArr, 0, cArr4, 0, length2);
            cArr3[0] = (char) (cArr3[0] ^ c11);
            cArr4[2] = (char) (cArr4[2] + ((char) i11));
            int length3 = charArray3.length;
            char[] cArr5 = new char[length3];
            challengeResultTimeout.getSDKTransactionID = 0;
            while (challengeResultTimeout.getSDKTransactionID < length3) {
                $11 = ($10 + 53) % 128;
                try {
                    Object[] objArr2 = {challengeResultTimeout};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(num2);
                    int i18 = i12;
                    int i19 = i13;
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(AndroidCharacter.getMirror('0') + 1814, (char) (ImageFormat.getBitsPerPixel(i19) + 1), TextUtils.getOffsetAfter("", i19) + 21);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 1);
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, (byte) (b12 - 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Object.class);
                        map.put(num2, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    Object[] objArr4 = {challengeResultTimeout};
                    Object method2 = map.get(num);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(224 - TextUtils.indexOf((CharSequence) "", '0'), (char) TextUtils.getTrimmedLength(""), View.MeasureSpec.getMode(0) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                        map.put(num, method2);
                    }
                    int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    int i21 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                    char c12 = cArr4[iIntValue];
                    Object[] objArr5 = new Object[3];
                    objArr5[i18] = Integer.valueOf(c12);
                    objArr5[1] = Integer.valueOf(i21);
                    objArr5[0] = challengeResultTimeout;
                    Object method3 = map.get(484986213);
                    Class cls2 = Integer.TYPE;
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2446 - TextUtils.getOffsetAfter("", 0), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "", 0, 0) + 18);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        c(b13, b14, b14, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                        map.put(484986213, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    int i22 = cArr3[iIntValue2] * 32718;
                    char c13 = cArr4[iIntValue];
                    Object[] objArr7 = new Object[i18];
                    objArr7[1] = Integer.valueOf(c13);
                    objArr7[0] = Integer.valueOf(i22);
                    Object method4 = map.get(-919285918);
                    if (method4 == null) {
                        method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2969 - (Process.myPid() >> 22), (char) (ImageFormat.getBitsPerPixel(0) + 9914), TextUtils.lastIndexOf("", '0') + 38)).getMethod("g", cls2, cls2);
                        map.put(-919285918, method4);
                    }
                    cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                    char c14 = challengeResultTimeout.getDeviceData;
                    cArr3[iIntValue2] = c14;
                    int i23 = challengeResultTimeout.getSDKTransactionID;
                    cArr5[i23] = (char) (((((long) (c14 ^ charArray3[i23])) ^ (getDeviceData ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) AuthenticationRequestParameters) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getSDKReferenceNumber) ^ (-4201337076207898698L)))));
                    challengeResultTimeout.getSDKTransactionID = i23 + 1;
                    length3 = length3;
                    i12 = i18;
                    charArray3 = charArray3;
                    cArr3 = cArr3;
                    cArr4 = cArr4;
                    num = num;
                    num2 = num2;
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            objArr[0] = new String(cArr5);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(int r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 4
                int r7 = 1 - r7
                byte[] r0 = atd.l.completed.getDeviceData.$$d
                int r9 = r9 * 3
                int r9 = 4 - r9
                int r8 = r8 * 4
                int r8 = 106 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r0
                r4 = r2
                r0 = r9
                r9 = r7
                goto L2f
            L18:
                r3 = r2
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L2f:
                int r8 = -r8
                int r8 = r8 + r9
                int r9 = r0 + 1
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.completed.getDeviceData.c(int, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:47:0x043a A[PHI: r14
          0x043a: PHI (r14v7 ??) = (r14v29 ??), (r14v30 ??) binds: [B:39:0x03af, B:43:0x03fa] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:49:0x0440  */
        /* JADX WARN: Code duplicated, block: B:52:0x049c  */
        /* JADX WARN: Code duplicated, block: B:53:0x049d A[Catch: all -> 0x0878, TryCatch #1 {all -> 0x0878, blocks: (B:5:0x006c, B:9:0x00c2, B:8:0x0085, B:17:0x01eb, B:21:0x0248, B:33:0x030a, B:37:0x035e, B:92:0x0745, B:96:0x07a3, B:95:0x0761, B:100:0x0801, B:104:0x0861, B:103:0x081d, B:50:0x0484, B:54:0x04d9, B:53:0x049d, B:36:0x031d, B:20:0x0208, B:24:0x0294, B:28:0x02ed, B:27:0x02ad), top: B:120:0x0024 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r14v10 */
        /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r14v12 */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v17 */
        /* JADX WARN: Type inference failed for: r14v18 */
        /* JADX WARN: Type inference failed for: r14v22 */
        /* JADX WARN: Type inference failed for: r14v23 */
        /* JADX WARN: Type inference failed for: r14v24 */
        /* JADX WARN: Type inference failed for: r14v25 */
        /* JADX WARN: Type inference failed for: r14v26 */
        /* JADX WARN: Type inference failed for: r14v27 */
        /* JADX WARN: Type inference failed for: r14v28 */
        /* JADX WARN: Type inference failed for: r14v29 */
        /* JADX WARN: Type inference failed for: r14v30 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r14v9 */
        /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r6v100 */
        /* JADX WARN: Type inference failed for: r6v57 */
        /* JADX WARN: Type inference failed for: r6v58 */
        /* JADX WARN: Type inference failed for: r6v59 */
        /* JADX WARN: Type inference failed for: r6v78, types: [int] */
        /* JADX WARN: Type inference failed for: r6v79 */
        /* JADX WARN: Type inference failed for: r6v80 */
        /* JADX WARN: Type inference failed for: r6v88, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r6v90, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v91 */
        /* JADX WARN: Type inference failed for: r6v98 */
        /* JADX WARN: Type inference failed for: r6v99 */
        /* JADX WARN: Type inference failed for: r8v72, types: [java.lang.reflect.Method] */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        public static java.lang.Object[] getSDKAppID(android.content.Context r35, int r36, int r37) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2186
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.l.completed.getDeviceData.getSDKAppID(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{114, -98, 117, -42, 8, -9, 39, 21, -1, -1, -13, 5, 7, -7, 19, -3, 17, 4, 29, -33, 14, 17, 3, -7, -46, 7, 18, 9, -3, 0, 17, 12, 8, -13, 17, 0, 7, 34, -13, -6, 2, 22, -8, 5, 42, -11, -11, 23, -6, 14, -9, 21, -7, 5, 8, -9, 39, 21, -1, Tnaf.POW_2_WIDTH, -41, 6, 45, 11, 1, 27, 39};
            $$b = 179;
        }

        static void init$1() {
            $$d = new byte[]{25, -44, -28, 70};
            $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters();
        new getDeviceData((byte) 0);
        int i11 = getSDKAppID + 5;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{30750, 30825, 30807, 30805, 30798, 30802, 30808, 30744, 30845, 30724, 30724};
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        char[] cArr;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        int i12 = $10 + 7;
        $11 = i12 % 128;
        Object bytes = str2;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i13 = 0;
        int i14 = iArr[0];
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        char[] cArr2 = getSDKReferenceNumber;
        Class cls3 = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i18 = 0;
            while (i13 < length) {
                byte[] bArr2 = bArr;
                $11 = ($10 + 81) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    int i19 = length;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        int i21 = i18;
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2314 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) View.MeasureSpec.getMode(i18), 24 - View.MeasureSpec.makeMeasureSpec(i21, i21));
                        int i22 = $$b;
                        byte b11 = (byte) (i22 - 1);
                        byte b12 = (byte) (-i22);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 3), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr3[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    length = i19;
                    bArr = bArr2;
                    cArr3 = cArr3;
                    i16 = i16;
                    cArr2 = cArr2;
                    i17 = i17;
                    cls2 = cls2;
                    i18 = 0;
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
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i23 = i16;
        int i24 = i17;
        char[] cArr4 = new char[i15];
        System.arraycopy(cArr2, i14, cArr4, 0, i15);
        if (bArr3 != null) {
            char[] cArr5 = new char[i15];
            challengeResultError.getSDKAppID = 0;
            $10 = ($11 + 19) % 128;
            char c11 = 0;
            while (true) {
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i15) {
                    break;
                }
                if (bArr3[i25] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr4[i25]), Integer.valueOf(c11)};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 558, (char) (Color.argb(0, 0, 0, 0) + 5486), 22 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        int i26 = $$b;
                        byte b13 = (byte) (i26 - 1);
                        byte b14 = (byte) (-i26);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 + 4), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr5[i25] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i25]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 23 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr5[i25] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    $10 = ($11 + 101) % 128;
                }
                c11 = cArr5[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(854 - Color.blue(0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - View.combineMeasuredStates(0, 0));
                    int i27 = $$b;
                    byte b15 = (byte) (i27 - 1);
                    byte b16 = (byte) (-i27);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 + 1), objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr4 = cArr4;
            }
            cArr4 = cArr5;
        }
        if (i24 > 0) {
            int i28 = $10 + 35;
            $11 = i28 % 128;
            if (i28 % 2 == 0) {
                char[] cArr6 = new char[i15];
                System.arraycopy(cArr4, 0, cArr6, 1, i15);
                int i29 = i15 << i24;
                System.arraycopy(cArr6, 1, cArr4, i29, i24);
                System.arraycopy(cArr6, i24, cArr4, 1, i29);
            } else {
                char[] cArr7 = new char[i15];
                System.arraycopy(cArr4, 0, cArr7, 0, i15);
                int i31 = i15 - i24;
                System.arraycopy(cArr7, 0, cArr4, i31, i24);
                System.arraycopy(cArr7, i24, cArr4, 0, i31);
            }
        }
        if (z11) {
            int i32 = $11 + 91;
            $10 = i32 % 128;
            if (i32 % 2 != 0) {
                cArr = new char[i15];
                i11 = 0;
            } else {
                i11 = 0;
                cArr = new char[i15];
            }
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i33 = challengeResultError.getSDKAppID;
                if (i33 >= i15) {
                    break;
                }
                cArr[i33] = cArr4[(i15 - i33) - 1];
                challengeResultError.getSDKAppID = i33 + 1;
            }
            cArr4 = cArr;
        }
        if (i23 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i34 = challengeResultError.getSDKAppID;
                if (i34 >= i15) {
                    break;
                }
                cArr4[i34] = (char) (cArr4[i34] - iArr[2]);
                challengeResultError.getSDKAppID = i34 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = atd.l.completed.$$a
            int r8 = r8 * 2
            int r8 = 104 - r8
            int r6 = r6 * 3
            int r1 = 1 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r7
            goto L32
        L17:
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r5
        L32:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.completed.b(int, short, short, java.lang.Object[]):void");
    }

    private static String getSDKTransactionID() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 77;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{0, 7, 0, 0}, true, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("\u0001\u0001\u0000\u0000\u0001\u0000\u0001", new int[]{0, 7, 0, 0}, false, objArr2);
            obj = objArr2[0];
        }
        return DeviceParameterResult.Success.StringValue.m50constructorimpl(((String) obj).intern());
    }

    static void init$0() {
        $$a = new byte[]{93, 88, 36, -92};
        $$b = 1;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getSDKTransactionID = (getSDKAppID + 13) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(getSDKTransactionID());
        getSDKAppID = (getSDKTransactionID + 97) % 128;
        return stringValueM49boximpl;
    }
}
