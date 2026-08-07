package atd.aa;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.wifi.WifiManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsP2pSupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey extends ChallengeResultKt {
    private static boolean AuthenticationRequestParameters = false;
    private static boolean getDeviceData = false;
    private static int getMessageVersion = 1;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/IsP2pSupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$g = null;
        private static final int $$h = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static char[] getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            AuthenticationRequestParameters = 0;
            getSDKTransactionID = 1;
            getSDKReferenceNumber = new char[]{30734, 30812, 30810, 30751, 30823, 30800, 30800, 30807, 30810, 30805, 30802, 30810, 30808, 30800, 30821, 30826, 30813, 30805, 30800, 30809, 30808, 30805, 30814, 30852, 30859, 30856, 30851, 30852, 30860, 30877, 30868, 30849, 30871, 30875, 30855, 30852, 30851, 30851, 30858, 30853, 30799, 30945, 30940, 30938, 30936, 30933, 30937, 30943, 30970, 30967, 30930, 30965, 30858, 30961, 30944, 30936, 30727, 30805, 30810, 30812, 30807, 30797, 30807, 30807, 30799, 30807, 30805, 30796, 30797, 30802, 30839, 30837, 30804, 30805, 30808, 30812, 30807, 30797, 30831, 30837, 30800, 30805, 30813, 30810, 30839, 30835, 30806, 30807, 30798, 30805, 30806, 30835, 30831, 30792, 30792, 30831, 30726, 30801, 30800, 30826, 30871, 30867, 30866, 30872, 30866, 30864, 30873, 30873, 30871, 30873, 30864, 30854, 30860, 30897, 30892, 30867, 30864, 30859, 30862, 30867, 30892, 30888, 30853, 30853, 30888, 30896, 30864, 30859, 30856, 30890, 30735, 30825, 30864, 30873, 30877, 30868, 30869, 30872, 30876, 30871, 30861, 30895, 30901, 30868, 30869, 30872, 30876, 30871, 30861, 30895, 30901, 30864, 30869, 30877, 30874, 30903, 30899, 30870, 30871, 30862, 30869, 30870, 30899, 30895, 30856, 30856, 30895};
        }

        private getSDKReferenceNumber() {
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(int r40, int r41) {
            /*
                Method dump skipped, instruction units count: 2011
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aa.getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(int, int):java.lang.Object[]");
        }

        private static void a(byte b11, int i11, short s11, Object[] objArr) {
            int i12 = 41 - (b11 * 37);
            int i13 = 103 - (s11 * 6);
            byte[] bArr = $$d;
            int i14 = i11 * 17;
            byte[] bArr2 = new byte[38 - i14];
            int i15 = 37 - i14;
            int i16 = -1;
            if (bArr == null) {
                i12++;
                i13 = (i12 + (-i15)) - 8;
            }
            while (true) {
                int i17 = i13;
                int i18 = i12;
                i16++;
                bArr2[i16] = (byte) i17;
                if (i16 == i15) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i12 = i18 + 1;
                    i13 = (i17 + (-bArr[i18])) - 8;
                }
            }
        }

        private static void b(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
            int i11;
            char[] cArr;
            char c11;
            Class<Object> cls;
            Object method;
            String str2 = str;
            Class<Object> cls2 = Object.class;
            int i12 = $11 + 103;
            $10 = i12 % 128;
            Object bytes = str2;
            if (i12 % 2 != 0) {
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
            int i18 = 2;
            Class cls3 = Integer.TYPE;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                while (i13 < length) {
                    bArr = bArr;
                    int i19 = $10 + 125;
                    length = length;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                            int i21 = i13;
                            Map map = atd.a.getMessageVersion.timedout;
                            Object obj = map.get(-1708792688);
                            if (obj != null) {
                                method = obj;
                            } else {
                                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2312 - Process.getGidForName(""), (char) Drawable.resolveOpacity(0, 0), 24 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                byte b11 = (byte) 0;
                                byte b12 = b11;
                                Object[] objArr3 = new Object[1];
                                d(b11, b12, (byte) (b12 + 2), objArr3);
                                method = cls4.getMethod((String) objArr3[0], cls3);
                                map.put(-1708792688, method);
                            }
                            cArr3[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                            i13 = i21;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        cls2 = cls2;
                        int i22 = i13;
                        cArr3 = cArr3;
                        i16 = i16;
                        i17 = i17;
                        cArr2 = cArr2;
                        Object[] objArr4 = {Integer.valueOf(cArr2[i22])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method2 = map2.get(-1708792688);
                        if (method2 == null) {
                            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - Gravity.getAbsoluteGravity(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 24 - TextUtils.indexOf("", "", 0, 0));
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            d(b13, b14, (byte) (b14 + 2), objArr5);
                            method2 = cls5.getMethod((String) objArr5[0], cls3);
                            map2.put(-1708792688, method2);
                        }
                        cArr3[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i13 = i22 + 1;
                    }
                    cArr3 = cArr3;
                    i16 = i16;
                    cArr2 = cArr2;
                    i17 = i17;
                    cls2 = cls2;
                }
                cArr2 = cArr3;
            }
            byte[] bArr2 = bArr;
            Class<Object> cls6 = cls2;
            int i23 = i16;
            int i24 = i17;
            char[] cArr4 = new char[i15];
            System.arraycopy(cArr2, i14, cArr4, 0, i15);
            if (bArr2 != null) {
                int i25 = $11 + 101;
                $10 = i25 % 128;
                if (i25 % 2 != 0) {
                    challengeResultError.getSDKAppID = 0;
                    cArr = new char[i15];
                    c11 = 1;
                } else {
                    challengeResultError.getSDKAppID = 0;
                    cArr = new char[i15];
                    c11 = 0;
                }
                while (true) {
                    int i26 = challengeResultError.getSDKAppID;
                    if (i26 >= i15) {
                        break;
                    }
                    if (bArr2[i26] == 1) {
                        char c12 = cArr4[i26];
                        Object[] objArr6 = new Object[i18];
                        objArr6[1] = Integer.valueOf(c11);
                        objArr6[0] = Integer.valueOf(c12);
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(10570995);
                        if (method3 == null) {
                            Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + 558, (char) (5486 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23);
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr7 = new Object[1];
                            d(b15, b16, (byte) (b16 + 3), objArr7);
                            method3 = cls7.getMethod((String) objArr7[0], cls3, cls3);
                            map3.put(10570995, method3);
                        }
                        cArr[i26] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    } else {
                        cArr4 = cArr4;
                        Object[] objArr8 = {Integer.valueOf(cArr4[i26]), Integer.valueOf(c11)};
                        Map map4 = atd.a.getMessageVersion.timedout;
                        Object method4 = map4.get(-502074319);
                        if (method4 == null) {
                            method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 200, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 24 - ExpandableListView.getPackedPositionType(0L))).getMethod("a", cls3, cls3);
                            map4.put(-502074319, method4);
                        }
                        cArr[i26] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                    }
                    c11 = cArr[challengeResultError.getSDKAppID];
                    Object[] objArr9 = {challengeResultError, challengeResultError};
                    Map map5 = atd.a.getMessageVersion.timedout;
                    Object method5 = map5.get(-399400818);
                    if (method5 != null) {
                        cls = cls6;
                    } else {
                        Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 854, (char) ('0' - AndroidCharacter.getMirror('0')), 24 - View.getDefaultSize(0, 0));
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr10 = new Object[1];
                        d(b17, b18, b18, objArr10);
                        String str3 = (String) objArr10[0];
                        cls = cls6;
                        method5 = cls8.getMethod(str3, cls, cls);
                        map5.put(-399400818, method5);
                    }
                    ((Method) method5).invoke(null, objArr9);
                    cls6 = cls;
                    cArr4 = cArr4;
                    i18 = 2;
                }
                cArr4 = cArr;
            }
            if (i24 > 0) {
                char[] cArr5 = new char[i15];
                i11 = 0;
                System.arraycopy(cArr4, 0, cArr5, 0, i15);
                int i27 = i15 - i24;
                System.arraycopy(cArr5, 0, cArr4, i27, i24);
                System.arraycopy(cArr5, i24, cArr4, 0, i27);
            } else {
                i11 = 0;
            }
            if (z11) {
                char[] cArr6 = new char[i15];
                challengeResultError.getSDKAppID = i11;
                while (true) {
                    int i28 = challengeResultError.getSDKAppID;
                    if (i28 >= i15) {
                        break;
                    }
                    cArr6[i28] = cArr4[(i15 - i28) - 1];
                    challengeResultError.getSDKAppID = i28 + 1;
                }
                cArr4 = cArr6;
            }
            if (i23 > 0) {
                challengeResultError.getSDKAppID = 0;
                $10 = ($11 + 51) % 128;
                while (true) {
                    int i29 = challengeResultError.getSDKAppID;
                    if (i29 >= i15) {
                        break;
                    }
                    cArr4[i29] = (char) (cArr4[i29] - iArr[2]);
                    challengeResultError.getSDKAppID = i29 + 1;
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
        private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r6 = 105 - r6
                byte[] r0 = atd.aa.getSDKEphemeralPublicKey.getSDKReferenceNumber.$$a
                int r7 = r7 * 20
                int r7 = 23 - r7
                int r8 = r8 * 18
                int r1 = r8 + 3
                byte[] r1 = new byte[r1]
                int r8 = r8 + 2
                r2 = 0
                if (r0 != 0) goto L1a
                r6 = r8
                r3 = r0
                r4 = r2
                r0 = r7
                goto L32
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2a
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2a:
                int r7 = r7 + 1
                r3 = r0[r7]
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r5
            L32:
                int r7 = -r7
                int r6 = r6 + r7
                int r6 = r6 + 3
                r7 = r0
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.aa.getSDKEphemeralPublicKey.getSDKReferenceNumber.c(short, int, byte, java.lang.Object[]):void");
        }

        private static void d(int i11, int i12, byte b11, Object[] objArr) {
            byte[] bArr = $$g;
            int i13 = 104 - (b11 * 2);
            int i14 = 4 - (i12 * 2);
            int i15 = i11 * 2;
            byte[] bArr2 = new byte[i15 + 1];
            int i16 = -1;
            if (bArr == null) {
                i14++;
                i13 += -i14;
            }
            while (true) {
                i16++;
                bArr2[i16] = (byte) i13;
                if (i16 == i15) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b12 = bArr[i14];
                    i14++;
                    i13 += -b12;
                }
            }
        }

        public static void getDeviceData(long j11, long j12) throws Throwable {
            int i11 = $$e;
            byte[] bArr = $$d;
            byte b11 = bArr[36];
            Object[] objArr = new Object[1];
            a((byte) (i11 & 5), b11, (byte) (b11 + 1), objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            AuthenticationRequestParameters = (getSDKTransactionID + 13) % 128;
            byte b12 = (byte) (i11 & 5);
            try {
                byte b13 = bArr[36];
                Object[] objArr2 = new Object[1];
                a(b12, b13, (byte) (b13 + 1), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b14 = bArr[36];
                byte b15 = b14;
                Object[] objArr3 = new Object[1];
                a(b15, (byte) (b15 + 1), b14, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getDeviceData.class.getField("getSDKAppID").get(null)};
                Object[] objArr5 = new Object[1];
                b("\u0001\u0001\u0000", new int[]{0, 3, 0, 0}, false, objArr5);
                AuthenticationRequestParameters = (getSDKTransactionID + 119) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{95, 124, -34, 103, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10, -2, 24};
            $$b = 40;
        }

        static void init$1() {
            $$d = new byte[]{100, 32, -64, -97, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
            $$e = 163;
        }

        static void init$2() {
            $$g = new byte[]{99, 39, 79, 89};
            $$h = 197;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        KeyEvent.getModifierMetaStateMask();
        new getSDKReferenceNumber((byte) 0);
        int i11 = getSDKReferenceNumber + 25;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 85 / 0;
        }
    }

    public /* synthetic */ getSDKEphemeralPublicKey(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{64673, 64688, 64687, 64685};
        getSDKTransactionID = -185467680;
        getDeviceData = true;
        AuthenticationRequestParameters = true;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        int i11 = getMessageVersion + 91;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            ChallengeResultCancelled();
            throw null;
        }
        if (!ChallengeResultCancelled()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        WifiManager wifiManagerCI_ = cI_();
        if (wifiManagerCI_ == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        getSDKReferenceNumber = (getMessageVersion + 35) % 128;
        DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(wifiManagerCI_.isP2pSupported()));
        getMessageVersion = (getSDKReferenceNumber + 47) % 128;
        return booleanValueM14boximpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getSDKEphemeralPublicKey(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
