package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoReplace;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCompletion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextAutoReplace$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getSDKAppID;
        private static long getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            AuthenticationRequestParameters = 1;
            getSDKTransactionID = -6913046068029853864L;
        }

        private getSDKTransactionID() {
        }

        /* JADX WARN: Code duplicated, block: B:35:0x014e  */
        /* JADX WARN: Code duplicated, block: B:36:0x014f  */
        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            Throwable cause;
            int i12;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
            gettransactionstatus.getSDKAppID = i11;
            int length = charArray.length;
            long[] jArr = new long[length];
            int i13 = 0;
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i14 = gettransactionstatus.getSDKTransactionID;
                if (i14 >= charArray.length) {
                    break;
                }
                char c11 = charArray[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i13] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(962978490);
                    if (method != null) {
                        i12 = i13;
                    } else {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(i13) + 689, (char) (ExpandableListView.getPackedPositionChild(0L) + 16023), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31);
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKTransactionID ^ (-2227742522694838850L));
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + 417, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 29018), 24 - Color.alpha(i12))).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    i13 = i12;
                    jArr = jArr;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            long[] jArr2 = jArr;
            char[] cArr = new char[length];
            gettransactionstatus.getSDKTransactionID = i13;
            $11 = ($10 + 21) % 128;
            while (true) {
                int i15 = gettransactionstatus.getSDKTransactionID;
                if (i15 >= charArray.length) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i15] = (char) jArr2[i15];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 29017), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24)).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                $10 = ($11 + 33) % 128;
            }
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
        private static void b(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 * 18
                int r8 = 21 - r8
                int r9 = r9 * 20
                int r9 = r9 + 4
                byte[] r0 = atd.x.onCompletion.getSDKTransactionID.$$a
                int r7 = r7 * 2
                int r7 = 105 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r0
                r4 = r2
                r0 = r9
                r9 = r8
                goto L2f
            L18:
                r3 = r2
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r8) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r0[r9]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r0
                r0 = r6
            L2f:
                int r7 = -r7
                int r9 = r9 + r7
                int r7 = r9 + 3
                int r9 = r0 + 1
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.onCompletion.getSDKTransactionID.b(int, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.x.onCompletion.getSDKTransactionID.$$d
                int r6 = r6 * 2
                int r1 = r6 + 1
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r7 = r7 * 2
                int r7 = r7 + 118
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r8
                goto L31
            L17:
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r2
            L1b:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L31:
                int r8 = r8 + r7
                int r7 = r0 + 1
                r0 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.onCompletion.getSDKTransactionID.c(byte, short, byte, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(int r38, int r39) {
            /*
                Method dump skipped, instruction units count: 2046
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.onCompletion.getSDKTransactionID.getDeviceData(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{81, 33, -107, -119, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10, -2, 24};
            $$b = 165;
        }

        static void init$1() {
            $$d = new byte[]{98, -9, 35, 31};
            $$e = 193;
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        getSDKTransactionID();
        ViewConfiguration.getScrollBarFadeDuration();
        new getSDKTransactionID((byte) 0);
        getSDKTransactionID = (getSDKAppID + 113) % 128;
    }

    public /* synthetic */ onCompletion(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        Object method;
        int i12;
        Object method2;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i13 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AuthenticationRequestParameters;
        String str = "";
        Class cls = Integer.TYPE;
        int i14 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i15 = 0;
            while (i15 < length2) {
                int i16 = $11 + 87;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i15])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(2050190164);
                        if (obj != null) {
                            method2 = obj;
                            i12 = i14;
                        } else {
                            i12 = i14;
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(i14, i14) + 1862, (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 21);
                            byte length3 = (byte) $$a.length;
                            byte b11 = (byte) (length3 - 3);
                            Object[] objArr3 = new Object[1];
                            b(length3, b11, b11, objArr3);
                            method2 = cls2.getMethod((String) objArr3[i12], cls);
                            map.put(2050190164, method2);
                        }
                        iArr4[i15] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        i15 = i15;
                        iArr4 = iArr4;
                        i14 = i12;
                        cArr = cArr;
                        iArr3 = iArr3;
                        length2 = length2;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    int i17 = i15;
                    char[] cArr3 = cArr;
                    int[] iArr5 = iArr4;
                    int[] iArr6 = iArr3;
                    int i18 = i14;
                    int i19 = length2;
                    Object[] objArr4 = {Integer.valueOf(iArr6[i17])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(2050190164);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 1862, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 20 - TextUtils.indexOf((CharSequence) "", '0', i18));
                        byte length4 = (byte) $$a.length;
                        byte b12 = (byte) (length4 - 3);
                        Object[] objArr5 = new Object[1];
                        b(length4, b12, b12, objArr5);
                        method3 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method3);
                    }
                    iArr5[i17] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                    i15 = i17 + 1;
                    iArr4 = iArr5;
                    cArr = cArr3;
                    iArr3 = iArr6;
                    length2 = i19;
                    i14 = 0;
                }
            }
            iArr3 = iArr4;
        }
        char[] cArr4 = cArr;
        int length5 = iArr3.length;
        int[] iArr7 = new int[length5];
        int[] iArr8 = AuthenticationRequestParameters;
        if (iArr8 != null) {
            int i21 = $10;
            int i22 = i21 + 11;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                length = iArr8.length;
                iArr2 = new int[length];
            } else {
                length = iArr8.length;
                iArr2 = new int[length];
            }
            $11 = (i21 + 37) % 128;
            int i23 = 0;
            while (i23 < length) {
                Object[] objArr6 = {Integer.valueOf(iArr8[i23])};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object obj2 = map3.get(2050190164);
                if (obj2 != null) {
                    method = obj2;
                } else {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + 1862, (char) TextUtils.indexOf(str, str, 0), 21 - TextUtils.getCapsMode(str, 0, 0));
                    byte length6 = (byte) $$a.length;
                    byte b13 = (byte) (length6 - 3);
                    Object[] objArr7 = new Object[1];
                    b(length6, b13, b13, objArr7);
                    method = cls4.getMethod((String) objArr7[0], cls);
                    map3.put(2050190164, method);
                }
                iArr2[i23] = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                i23++;
                iArr8 = iArr8;
                length = length;
                iArr2 = iArr2;
                str = str;
                cArr2 = cArr2;
            }
            iArr8 = iArr2;
        }
        char[] cArr5 = cArr2;
        char c11 = 0;
        System.arraycopy(iArr8, 0, iArr7, 0, length5);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i24 = challengeResultCompleted.getDeviceData;
            if (i24 >= iArr.length) {
                objArr[0] = new String(cArr5, 0, i11);
                return;
            }
            int i25 = iArr[i24];
            char c12 = (char) (i25 >> 16);
            cArr4[c11] = c12;
            char c13 = (char) i25;
            cArr4[1] = c13;
            int i26 = 16;
            char c14 = (char) (iArr[i24 + 1] >> 16);
            cArr4[i13] = c14;
            char c15 = (char) iArr[i24 + 1];
            char c16 = 3;
            cArr4[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr7);
            $11 = ($10 + 85) % 128;
            int i27 = 0;
            while (i27 < i26) {
                int i28 = challengeResultCompleted.getSDKAppID ^ iArr7[i27];
                challengeResultCompleted.getSDKAppID = i28;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i28);
                Object[] objArr8 = new Object[4];
                objArr8[c16] = challengeResultCompleted;
                objArr8[i13] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1298, (char) ((ViewConfiguration.getFadingEdgeLength() >> i26) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), View.getDefaultSize(0, 0) + 33);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr9 = new Object[1];
                    b(b14, b15, b15, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i27++;
                i26 = i26;
                c16 = c16;
            }
            char c17 = c16;
            int i29 = challengeResultCompleted.getSDKAppID;
            int i31 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i31;
            challengeResultCompleted.getSDKReferenceNumber = i29;
            int i32 = i29 ^ iArr7[i26];
            challengeResultCompleted.getSDKReferenceNumber = i32;
            int i33 = i31 ^ iArr7[17];
            challengeResultCompleted.getSDKAppID = i33;
            cArr4[0] = (char) (i33 >>> 16);
            cArr4[1] = (char) i33;
            cArr4[i13] = (char) (i32 >>> 16);
            cArr4[c17] = (char) i32;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr7);
            int i34 = challengeResultCompleted.getDeviceData;
            cArr5[i34 * 2] = cArr4[0];
            cArr5[(i34 * 2) + 1] = cArr4[1];
            cArr5[(i34 * 2) + 2] = cArr4[i13];
            cArr5[(i34 * 2) + 3] = cArr4[c17];
            int i35 = i13;
            Object[] objArr10 = new Object[i35];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Object method5 = map5.get(1109131256);
            if (method5 == null) {
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2062 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 17);
                byte b16 = (byte) ($$b & 5);
                byte b17 = (byte) (b16 - 1);
                Object[] objArr11 = new Object[1];
                b(b16, b17, b17, objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(1109131256, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            i13 = i35;
            c11 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = atd.x.onCompletion.$$a
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r6 = 120 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r7
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.onCompletion.b(short, byte, int, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = new int[]{-1150748603, 885808630, -1194788871, 692950653, -1222572342, 2142118159, -917154366, -444449939, 2055237388, -893639421, -1642294952, 1641603583, -620840257, -327085517, 1881982822, -6717456, -1507431739, 1826204139};
    }

    static void init$0() {
        $$a = new byte[]{83, -124, 59};
        $$b = 83;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a(new int[]{-1087798135, -1106753152, -1453014595, 1985351230, 1883361076, 1992898322}, TextUtils.indexOf("", "", 0, 0) + 12, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getSDKTransactionID = (getSDKAppID + 21) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                int i11 = getSDKTransactionID + 9;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
                DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                throw null;
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getSDKTransactionID = (getSDKAppID + 97) % 128;
        return failure;
    }

    private onCompletion(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
