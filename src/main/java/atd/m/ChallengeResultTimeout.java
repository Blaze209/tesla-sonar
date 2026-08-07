package atd.m;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/SocModel;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultTimeout extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static long getDeviceData = 0;
    private static int getSDKAppID = 0;
    private static char getSDKReferenceNumber = 0;
    private static int getSDKTransactionID = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/SocModel$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static char[] getSDKAppID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            AuthenticationRequestParameters = 1;
            getSDKAppID = new char[]{30729, 30800, 30807, 30838, 30839, 30808, 30802, 30798, 30805, 30807, 30809, 30804, 30792, 30800, 30802, 30799, 30800, 30823, 30726, 30831, 30799, 30807, 30802, 30789, 30924, 30924, 30941, 30941, 30920, 30922, 30920, 30924, 30932, 30928, 30924, 30920, 30918, 30942, 30940, 30922, 30928, 30734, 30809, 30807, 30805, 30798, 30802, 30808, 30839, 30838, 30807, 30800, 30799, 30802, 30807, 30799, 30831, 30833, 30800, 30835, 30729, 30822, 30798, 30800, 30804, 30808, 30812, 30804, 30800, 30802, 30800, 30821, 30821, 30804, 30804, 30727, 30803, 30810, 30808, 30807, 30761, 30836, 30802, 30805, 30839, 30834, 30805, 30805, 30800, 30831, 30835, 30802, 30805, 30809, 30838, 30838, 30810, 30813, 30805, 30800, 30809, 30810, 30815, 30809, 30806, 30839, 30830, 30804, 30834, 30889, 30795, 30798, 30901, 30900, 30892, 30891, 30896, 30901, 30902, 30896, 30897, 30758};
        }

        private getSDKReferenceNumber() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r0 = 31 - r5
                int r6 = r6 + 4
                int r7 = r7 + 65
                byte[] r1 = atd.m.ChallengeResultTimeout.getSDKReferenceNumber.$$a
                byte[] r0 = new byte[r0]
                int r5 = 30 - r5
                r2 = 0
                if (r1 != 0) goto L12
                r3 = r5
                r4 = r2
                goto L26
            L12:
                r3 = r2
            L13:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L24:
                r3 = r1[r6]
            L26:
                int r3 = -r3
                int r7 = r7 + r3
                int r7 = r7 + 6
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultTimeout.getSDKReferenceNumber.a(byte, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0034  */
        private static void b(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
            int i11;
            char[] cArr;
            char c11;
            Class<Object> cls;
            Object method;
            String str2 = str;
            Class<Object> cls2 = Object.class;
            Integer num = -399400818;
            int i12 = $11 + 87;
            $10 = i12 % 128;
            Object bytes = str2;
            if (i12 % 2 != 0) {
                int i13 = 4 / 0;
                if (str2 != null) {
                    bytes = str2;
                    bytes = str2.getBytes("ISO-8859-1");
                }
            } else if (str2 != null) {
                bytes = str2;
                bytes = str2.getBytes("ISO-8859-1");
            }
            bytes = str2;
            byte[] bArr = (byte[]) bytes;
            atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
            int i14 = iArr[0];
            int i15 = iArr[1];
            int i16 = iArr[2];
            int i17 = iArr[3];
            char[] cArr2 = getSDKAppID;
            int i18 = 2;
            Class cls3 = Integer.TYPE;
            if (cArr2 != null) {
                $10 = ($11 + 61) % 128;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i19 = 0;
                while (i19 < length) {
                    try {
                        int i21 = i19;
                        Object[] objArr2 = {Integer.valueOf(cArr2[i19])};
                        char[] cArr4 = cArr3;
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1708792688);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + 2313, (char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25);
                            byte b11 = (byte) 0;
                            byte b12 = (byte) (b11 + 1);
                            Object[] objArr3 = new Object[1];
                            c(b11, b12, (byte) (b12 - 1), objArr3);
                            method = cls4.getMethod((String) objArr3[0], cls3);
                            map.put(-1708792688, method);
                        }
                        cArr4[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i19 = i21 + 1;
                        cArr3 = cArr4;
                        cArr2 = cArr2;
                        i16 = i16;
                        length = length;
                        i17 = i17;
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
                cArr2 = cArr3;
            }
            Class<Object> cls5 = cls2;
            Integer num2 = num;
            int i22 = i16;
            int i23 = i17;
            char[] cArr5 = new char[i15];
            System.arraycopy(cArr2, i14, cArr5, 0, i15);
            if (bArr != 0) {
                int i24 = $10 + 87;
                $11 = i24 % 128;
                if (i24 % 2 == 0) {
                    challengeResultError.getSDKAppID = 1;
                    cArr = new char[i15];
                    c11 = 1;
                } else {
                    challengeResultError.getSDKAppID = 0;
                    cArr = new char[i15];
                    c11 = 0;
                }
                while (true) {
                    int i25 = challengeResultError.getSDKAppID;
                    if (i25 >= i15) {
                        break;
                    }
                    int i26 = $10;
                    int i27 = i26 + 37;
                    $11 = i27 % 128;
                    if (i27 % 2 != 0 ? bArr[i25] != 1 : bArr[i25] != 1) {
                        cArr5 = cArr5;
                        Object[] objArr4 = {Integer.valueOf(cArr5[i25]), Integer.valueOf(c11)};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method2 = map2.get(-502074319);
                        if (method2 == null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(0, 0) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 23 - Process.getGidForName(""))).getMethod("a", cls3, cls3);
                            map2.put(-502074319, method2);
                        }
                        cArr[i25] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    } else {
                        $11 = (i26 + 41) % 128;
                        char c12 = cArr5[i25];
                        Object[] objArr5 = new Object[i18];
                        objArr5[1] = Integer.valueOf(c11);
                        objArr5[0] = Integer.valueOf(c12);
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(10570995);
                        if (method3 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(557 - MotionEvent.axisFromString(""), (char) (5485 - Process.getGidForName("")), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22);
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr6 = new Object[1];
                            c(b13, b14, b14, objArr6);
                            method3 = cls6.getMethod((String) objArr6[0], cls3, cls3);
                            map3.put(10570995, method3);
                        }
                        cArr[i25] = ((Character) ((Method) method3).invoke(null, objArr5)).charValue();
                    }
                    char c13 = cArr[challengeResultError.getSDKAppID];
                    Object[] objArr7 = {challengeResultError, challengeResultError};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Integer num3 = num2;
                    Object method4 = map4.get(num3);
                    if (method4 != null) {
                        cls = cls5;
                    } else {
                        Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + 854, (char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr8 = new Object[1];
                        c(b15, b16, (byte) (b16 - 3), objArr8);
                        cls = cls5;
                        method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                        map4.put(num3, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                    num2 = num3;
                    cls5 = cls;
                    cArr5 = cArr5;
                    c11 = c13;
                    i18 = 2;
                }
                cArr5 = cArr;
            }
            if (i23 > 0) {
                char[] cArr6 = new char[i15];
                i11 = 0;
                System.arraycopy(cArr5, 0, cArr6, 0, i15);
                int i28 = i15 - i23;
                System.arraycopy(cArr6, 0, cArr5, i28, i23);
                System.arraycopy(cArr6, i23, cArr5, 0, i28);
            } else {
                i11 = 0;
            }
            if (z11) {
                $11 = ($10 + 91) % 128;
                char[] cArr7 = new char[i15];
                challengeResultError.getSDKAppID = i11;
                while (true) {
                    int i29 = challengeResultError.getSDKAppID;
                    if (i29 >= i15) {
                        break;
                    }
                    $11 = ($10 + 21) % 128;
                    cArr7[i29] = cArr5[(i15 - i29) - 1];
                    challengeResultError.getSDKAppID = i29 + 1;
                }
                cArr5 = cArr7;
            }
            if (i22 > 0) {
                challengeResultError.getSDKAppID = 0;
                while (true) {
                    int i31 = challengeResultError.getSDKAppID;
                    if (i31 >= i15) {
                        break;
                    }
                    int i32 = $11;
                    $10 = (i32 + 67) % 128;
                    cArr5[i31] = (char) (cArr5[i31] - iArr[2]);
                    challengeResultError.getSDKAppID = i31 + 1;
                    $10 = (i32 + 45) % 128;
                }
            }
            objArr[0] = new String(cArr5);
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
        private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 3
                int r0 = r6 + 1
                int r7 = r7 * 2
                int r7 = r7 + 98
                int r8 = r8 * 3
                int r8 = 3 - r8
                byte[] r1 = atd.m.ChallengeResultTimeout.getSDKReferenceNumber.$$d
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r1
                r4 = r2
                r1 = r8
                r8 = r6
                goto L31
            L18:
                r3 = r2
            L19:
                int r8 = r8 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2a:
                r3 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L31:
                int r7 = -r7
                int r7 = r7 + r8
                r8 = r1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultTimeout.getSDKReferenceNumber.c(short, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:50:0x040b  */
        /* JADX WARN: Code duplicated, block: B:52:0x0411  */
        /* JADX WARN: Code duplicated, block: B:55:0x046f  */
        /* JADX WARN: Code duplicated, block: B:56:0x0470 A[Catch: all -> 0x0839, TryCatch #3 {all -> 0x0839, blocks: (B:5:0x006b, B:9:0x00c1, B:8:0x0084, B:17:0x019e, B:21:0x01fd, B:36:0x02ce, B:40:0x0328, B:93:0x06f8, B:97:0x0758, B:96:0x0715, B:101:0x07be, B:105:0x0821, B:104:0x07db, B:53:0x0457, B:57:0x04ad, B:56:0x0470, B:39:0x02e0, B:20:0x01bb, B:24:0x024c, B:28:0x02a4, B:27:0x0265), top: B:124:0x0026 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r5v36 */
        /* JADX WARN: Type inference failed for: r5v37 */
        /* JADX WARN: Type inference failed for: r5v38 */
        /* JADX WARN: Type inference failed for: r5v64, types: [int] */
        /* JADX WARN: Type inference failed for: r5v65 */
        /* JADX WARN: Type inference failed for: r5v66 */
        /* JADX WARN: Type inference failed for: r5v70, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r5v72, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r5v73 */
        /* JADX WARN: Type inference failed for: r5v81 */
        /* JADX WARN: Type inference failed for: r5v82 */
        /* JADX WARN: Type inference failed for: r5v83 */
        /* JADX WARN: Type inference failed for: r9v64, types: [java.lang.reflect.Method] */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        public static java.lang.Object[] getSDKAppID(android.content.Context r38, int r39, int r40) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2123
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultTimeout.getSDKReferenceNumber.getSDKAppID(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{85, -48, -99, -78, 8, -9, 39, 21, -1, -1, -13, 5, 7, -7, 19, -3, 17, 4, 29, -33, 14, 17, 3, -7, -46, 7, 18, 9, -3, 0, 17, 12, 8, -13, 17, 0, 7, 34, -13, -6, 2, 22, -8, 5, 42, -11, -11, 23, -6, 14, -9, 21, -7, 5, 8, -9, 39, 21, -1, Tnaf.POW_2_WIDTH, -41, 6, 45, 11, 1, 27, 39};
            $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE;
        }

        static void init$1() {
            $$d = new byte[]{29, -91, 33, -72};
            $$e = 58;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        Color.red(0);
        ViewConfiguration.getEdgeSlop();
        new getSDKReferenceNumber((byte) 0);
        getSDKTransactionID = (AuthenticationRequestParameters + 49) % 128;
    }

    static void getSDKReferenceNumber() {
        getDeviceData = -2685785751894978046L;
        getSDKAppID = 1458778038;
        getSDKReferenceNumber = (char) 12214;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        int i11 = getSDKTransactionID + 81;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0 ? Build.VERSION.SDK_INT >= 31 : Build.VERSION.SDK_INT >= 48) {
            String str = Build.SOC_MODEL;
            s.j(str, "");
            return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(str));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        getSDKTransactionID = (AuthenticationRequestParameters + 49) % 128;
        return failure;
    }
}
