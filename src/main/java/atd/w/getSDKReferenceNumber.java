package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/HasIccCard;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends InitializeResultSuccess {
    private static char AuthenticationRequestParameters = 0;
    private static char getDeviceData = 0;
    private static int getMessageVersion = 1;
    private static char getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX INFO: renamed from: atd.w.getSDKReferenceNumber$getSDKReferenceNumber, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/HasIccCard$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0269getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static final byte[] $$g = null;
        private static final int $$h = 0;
        private static int $10;
        private static int $11;
        private static int getDeviceData;
        private static char[] getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$2();
            $10 = 0;
            $11 = 1;
            init$1();
            init$0();
            getDeviceData = 0;
            getSDKTransactionID = 1;
            getSDKReferenceNumber = new char[]{30734, 30812, 30810, 30729, 30800, 30823, 30820, 30805, 30808, 30809, 30800, 30805, 30813, 30826, 30821, 30800, 30808, 30810, 30802, 30805, 30810, 30807, 30821, 30861, 30856, 30856, 30867, 30858, 30850, 30861, 30864, 30865, 30856, 30861, 30869, 30882, 30877, 30854, 30876, 30880, 30734, 30809, 30807, 30805, 30798, 30802, 30808, 30839, 30832, 30799, 30830, 30727, 30826, 30813, 30805, 30800, 30842, 30911, 30785, 30905, 30785, 30785, 30903, 30785, 30790, 30788, 30911, 30808, 30809, 30898, 30898, 30809, 30813, 30784, 30911, 30904, 30785, 30784, 30813, 30817, 30788, 30791, 30911, 30906, 30815, 30809, 30903, 30785, 30790, 30786, 30911, 30910, 30815, 30817, 30908, 30903, 30729, 30800, 30801, 30815, 30972, 30968, 30971, 30849, 30971, 30969, 30974, 30974, 30972, 30974, 30969, 30959, 30965, 30870, 30869, 30968, 30969, 30960, 30967, 30968, 30869, 30865, 30954, 30954, 30865, 30873, 30969, 30960, 30961, 30867, 30758, 30899, 31011, 31010, 30915, 31037, 31003, 31013, 31018, 31014, 31011, 31010, 31019, 31015, 31006, 31038, 31037, 30998, 30998, 31037, 30913, 31012, 31011, 31004, 31013, 31012, 30913, 30917, 31016, 31019, 31011, 31006, 30915, 31037, 31003, 31013, 31018};
        }

        private C0269getSDKReferenceNumber() {
        }

        public static void AuthenticationRequestParameters(long j11, long j12) throws Throwable {
            getDeviceData = (getSDKTransactionID + 9) % 128;
            int i11 = $$e;
            byte b11 = (byte) (i11 & 1);
            byte[] bArr = $$d;
            Object[] objArr = new Object[1];
            a(b11, b11, bArr[36], objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            getDeviceData = (getSDKTransactionID + 59) % 128;
            byte b12 = (byte) (i11 & 1);
            try {
                Object[] objArr2 = new Object[1];
                a(b12, b12, bArr[36], objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b13 = bArr[36];
                byte b14 = b13;
                Object[] objArr3 = new Object[1];
                a(b13, b14, (byte) (b14 + 1), objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null)};
                Object[] objArr5 = new Object[1];
                b("\u0001\u0001\u0000", new int[]{0, 3, 0, 0}, false, objArr5);
                getDeviceData = (getSDKTransactionID + 51) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 37
                int r6 = 41 - r6
                int r7 = r7 * 17
                int r0 = 38 - r7
                int r5 = r5 * 6
                int r5 = 103 - r5
                byte[] r1 = atd.w.getSDKReferenceNumber.C0269getSDKReferenceNumber.$$d
                byte[] r0 = new byte[r0]
                int r7 = 37 - r7
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r7
                r4 = r2
                goto L2a
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L28:
                r3 = r1[r6]
            L2a:
                int r3 = -r3
                int r5 = r5 + r3
                int r5 = r5 + (-8)
                int r6 = r6 + 1
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getSDKReferenceNumber.C0269getSDKReferenceNumber.a(byte, byte, short, java.lang.Object[]):void");
        }

        private static void b(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
            int i11;
            Class<Object> cls;
            Object method;
            String str2 = str;
            Class<Object> cls2 = Object.class;
            int i12 = 0;
            Object bytes = str2;
            if (str2 != null) {
                int i13 = $11 + 101;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 12 / 0;
                    bytes = str2.getBytes("ISO-8859-1");
                } else {
                    bytes = str2.getBytes("ISO-8859-1");
                }
            }
            byte[] bArr = (byte[]) bytes;
            atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
            int i15 = iArr[0];
            int i16 = iArr[1];
            int i17 = iArr[2];
            int i18 = iArr[3];
            char[] cArr = getSDKReferenceNumber;
            Class cls3 = Integer.TYPE;
            if (cArr != null) {
                $10 = ($11 + 17) % 128;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                while (i12 < length) {
                    try {
                        byte[] bArr2 = bArr;
                        Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                        int i19 = length;
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1708792688);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 24 - Color.argb(0, 0, 0, 0));
                            byte b11 = (byte) 0;
                            byte b12 = (byte) (b11 + 2);
                            Object[] objArr3 = new Object[1];
                            d(b11, b12, (byte) (b12 - 2), objArr3);
                            method = cls4.getMethod((String) objArr3[0], cls3);
                            map.put(-1708792688, method);
                        }
                        cArr2[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i12++;
                        length = i19;
                        bArr = bArr2;
                        i17 = i17;
                        cArr2 = cArr2;
                        cArr = cArr;
                        i18 = i18;
                        cls2 = cls2;
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
            byte[] bArr3 = bArr;
            Class<Object> cls5 = cls2;
            int i21 = i17;
            int i22 = i18;
            char[] cArr3 = new char[i16];
            System.arraycopy(cArr, i15, cArr3, 0, i16);
            if (bArr3 != null) {
                char[] cArr4 = new char[i16];
                challengeResultError.getSDKAppID = 0;
                char c11 = 0;
                while (true) {
                    int i23 = challengeResultError.getSDKAppID;
                    if (i23 >= i16) {
                        break;
                    }
                    if (bArr3[i23] == 1) {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c11)};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method2 = map2.get(10570995);
                        if (method2 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(558 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (Color.alpha(0) + 5486), 22 - ImageFormat.getBitsPerPixel(0));
                            byte b13 = (byte) 0;
                            byte b14 = (byte) (b13 + 3);
                            Object[] objArr5 = new Object[1];
                            d(b13, b14, (byte) (b14 - 3), objArr5);
                            method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                            map2.put(10570995, method2);
                        }
                        cArr4[i23] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    } else {
                        cArr3 = cArr3;
                        Object[] objArr6 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c11)};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(-502074319);
                        if (method3 == null) {
                            method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 202, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 24 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("a", cls3, cls3);
                            map3.put(-502074319, method3);
                        }
                        cArr4[i23] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    }
                    c11 = cArr4[challengeResultError.getSDKAppID];
                    Object[] objArr7 = {challengeResultError, challengeResultError};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-399400818);
                    if (method4 != null) {
                        cls = cls5;
                    } else {
                        Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(854 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 24 - (KeyEvent.getMaxKeyCode() >> 16));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        d(b15, b16, b16, objArr8);
                        cls = cls5;
                        method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                        map4.put(-399400818, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                    cls5 = cls;
                    cArr3 = cArr3;
                }
                $10 = ($11 + 33) % 128;
                cArr3 = cArr4;
            }
            if (i22 > 0) {
                char[] cArr5 = new char[i16];
                i11 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i16);
                int i24 = i16 - i22;
                System.arraycopy(cArr5, 0, cArr3, i24, i22);
                System.arraycopy(cArr5, i22, cArr3, 0, i24);
            } else {
                i11 = 0;
            }
            if (z11) {
                char[] cArr6 = new char[i16];
                challengeResultError.getSDKAppID = i11;
                while (true) {
                    int i25 = challengeResultError.getSDKAppID;
                    if (i25 >= i16) {
                        break;
                    }
                    cArr6[i25] = cArr3[(i16 - i25) - 1];
                    challengeResultError.getSDKAppID = i25 + 1;
                }
                cArr3 = cArr6;
            }
            if (i21 > 0) {
                challengeResultError.getSDKAppID = 0;
                $10 = ($11 + 89) % 128;
                while (true) {
                    int i26 = challengeResultError.getSDKAppID;
                    if (i26 >= i16) {
                        break;
                    }
                    cArr3[i26] = (char) (cArr3[i26] - iArr[2]);
                    challengeResultError.getSDKAppID = i26 + 1;
                }
            }
            objArr[0] = new String(cArr3);
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
        private static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 18
                int r8 = 21 - r8
                byte[] r0 = atd.w.getSDKReferenceNumber.C0269getSDKReferenceNumber.$$a
                int r6 = r6 * 2
                int r6 = 105 - r6
                int r7 = r7 * 20
                int r7 = 24 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r6 = r7
                r3 = r8
                r4 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r7]
            L29:
                int r7 = r7 + 1
                int r3 = -r3
                int r6 = r6 + r3
                int r6 = r6 + 3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getSDKReferenceNumber.C0269getSDKReferenceNumber.c(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r5, int r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = atd.w.getSDKReferenceNumber.C0269getSDKReferenceNumber.$$g
                int r6 = r6 * 2
                int r6 = 104 - r6
                int r7 = r7 * 2
                int r1 = 1 - r7
                int r5 = r5 * 4
                int r5 = 4 - r5
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L19
                r6 = r5
                r4 = r7
                r3 = r2
                goto L2b
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L27:
                r4 = r0[r5]
                int r3 = r3 + 1
            L2b:
                int r5 = r5 + 1
                int r6 = r6 + r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getSDKReferenceNumber.C0269getSDKReferenceNumber.d(int, int, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{104, -66, 51, -36, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10, -2, 24};
            $$b = 22;
        }

        static void init$1() {
            $$d = new byte[]{93, 9, 92, 99, -27, 8, 46, -59, -26, 61, -27, -60, -7, 4, -5, -17, -14, 3, -2, -6, -27, 3, -14, -7, 20, -27, -20, -12, 8, -22, -9, 28, -25, -25, 9, -20, 0, -23, 7, -21, -9, -6, -23, 25, 7, -15, -15, -27, -9, -7, -21, 5, -17, 3, -10, 15, -47, 0, 3, -11, -21};
            $$e = 111;
        }

        static void init$2() {
            $$g = new byte[]{79, -70, -97, 13};
            $$h = EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE;
        }

        public /* synthetic */ C0269getSDKReferenceNumber(byte b11) {
            this();
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] AuthenticationRequestParameters(int r36, int r37) {
            /*
                Method dump skipped, instruction units count: 2169
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getSDKReferenceNumber.C0269getSDKReferenceNumber.AuthenticationRequestParameters(int, int):java.lang.Object[]");
        }
    }

    static {
        getSDKReferenceNumber();
        Color.argb(0, 0, 0, 0);
        new C0269getSDKReferenceNumber((byte) 0);
        int i11 = getSDKTransactionID + 27;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKReferenceNumber(Application application) {
        super(application);
        s.k(application, "");
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = (char) 47031;
        getSDKReferenceNumber = (char) 19715;
        getSDKAppID = (char) 41698;
        getDeviceData = (char) 48230;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            getMessageVersion = (getSDKTransactionID + 109) % 128;
            return failure;
        }
        int i11 = getSDKTransactionID + 31;
        getMessageVersion = i11 % 128;
        int i12 = i11 % 2;
        DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(telephonyManagerCF_.hasIccCard()));
        if (i12 == 0) {
            int i13 = 4 / 0;
        }
        return booleanValueM14boximpl;
    }
}
