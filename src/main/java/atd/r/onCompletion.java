package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WifiNetworksAvailableNotificationOn;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCompletion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WifiNetworksAvailableNotificationOn$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static int getDeviceData;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKTransactionID = 0;
            getDeviceData = 1;
            AuthenticationRequestParameters = 4478537790139686565L;
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
        private static void a(byte r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 6
                int r9 = r9 + 97
                int r7 = r7 * 17
                int r7 = r7 + 21
                byte[] r0 = atd.r.onCompletion.AuthenticationRequestParameters.$$a
                int r8 = r8 * 37
                int r8 = 40 - r8
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
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                int r8 = r8 + 1
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
                int r0 = r0 + r8
                int r8 = r0 + (-8)
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.r.onCompletion.AuthenticationRequestParameters.a(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:60:0x027b  */
        /* JADX WARN: Code duplicated, block: B:61:0x027c  */
        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            Throwable cause;
            int i12;
            Object method;
            int i13 = $11 + 97;
            $10 = i13 % 128;
            int i14 = 2;
            if (i13 % 2 != 0) {
                throw null;
            }
            if (str != null) {
                charArray = str.toCharArray();
                $10 = ($11 + 61) % 128;
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
            gettransactionstatus.getSDKAppID = i11;
            int length = cArr.length;
            long[] jArr = new long[length];
            int i15 = 0;
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i16 = gettransactionstatus.getSDKTransactionID;
                if (i16 >= cArr.length) {
                    break;
                }
                int i17 = $11 + 57;
                $10 = i17 % 128;
                int i18 = i17 % i14;
                Class cls = Integer.TYPE;
                if (i18 != 0) {
                    char c11 = cArr[i16];
                    try {
                        Object[] objArr2 = new Object[3];
                        objArr2[i14] = gettransactionstatus;
                        objArr2[1] = gettransactionstatus;
                        objArr2[i15] = Integer.valueOf(c11);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(962978490);
                        if (obj != null) {
                            method = obj;
                            i12 = i15;
                        } else {
                            i12 = i15;
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionType(0L) + 689, (char) (16021 - ((byte) KeyEvent.getModifierMetaStateMask())), 32 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                            byte b11 = $$d[i12];
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            c(b11, b12, (byte) (b12 - 1), objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, Object.class, Object.class);
                            map.put(962978490, method);
                        }
                        jArr[i16] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() - (AuthenticationRequestParameters - (-2227742522694838850L));
                        Object[] objArr4 = new Object[2];
                        objArr4[1] = gettransactionstatus;
                        objArr4[i12] = gettransactionstatus;
                        Object method2 = map.get(-46730980);
                        if (method2 == null) {
                            int i19 = i12;
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - Color.argb(i19, i19, i19, i19), (char) (29017 - TextUtils.getTrimmedLength("")), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("A", Object.class, Object.class);
                            map.put(-46730980, method2);
                        }
                        ((Method) method2).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    jArr = jArr;
                    Object[] objArr5 = {Integer.valueOf(cArr[i16]), gettransactionstatus, gettransactionstatus};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(962978490);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.blue(0) + 689, (char) (16021 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16777248);
                        byte b13 = $$d[0];
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        c(b13, b14, (byte) (b14 - 1), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], cls, Object.class, Object.class);
                        map2.put(962978490, method3);
                    }
                    jArr[i16] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                    Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                    Object method4 = map2.get(-46730980);
                    if (method4 == null) {
                        method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 418, (char) (29017 - (ViewConfiguration.getJumpTapTimeout() >> 16)), ((Process.getThreadPriority(0) + 20) >> 6) + 24)).getMethod("A", Object.class, Object.class);
                        map2.put(-46730980, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                }
                jArr = jArr;
                i14 = 2;
                i15 = 0;
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            long[] jArr2 = jArr;
            char[] cArr2 = new char[length];
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i21 = gettransactionstatus.getSDKTransactionID;
                if (i21 >= cArr.length) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                int i22 = $10 + 15;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr2[i21] = (char) jArr2[i21];
                    Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method5 = map3.get(-46730980);
                    if (method5 == null) {
                        method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 417, (char) (29017 - (ViewConfiguration.getEdgeSlop() >> 16)), KeyEvent.normalizeMetaState(0) + 24)).getMethod("A", Object.class, Object.class);
                        map3.put(-46730980, method5);
                    }
                    ((Method) method5).invoke(null, objArr8);
                    int i23 = 25 / 0;
                } else {
                    cArr2[i21] = (char) jArr2[i21];
                    Object[] objArr9 = {gettransactionstatus, gettransactionstatus};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method6 = map4.get(-46730980);
                    if (method6 == null) {
                        method6 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 417, (char) (29017 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23)).getMethod("A", Object.class, Object.class);
                        map4.put(-46730980, method6);
                    }
                    ((Method) method6).invoke(null, objArr9);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 4
                byte[] r0 = atd.r.onCompletion.AuthenticationRequestParameters.$$d
                int r6 = r6 * 3
                int r6 = r6 + 118
                int r7 = r7 * 2
                int r1 = 1 - r7
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2e
            L17:
                r3 = r2
            L18:
                int r8 = r8 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r0[r8]
                r5 = r8
                r8 = r6
                r6 = r5
            L2e:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r8
                r8 = r6
                r6 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.r.onCompletion.AuthenticationRequestParameters.c(byte, byte, int, java.lang.Object[]):void");
        }

        private static void getSDKTransactionID() throws Throwable {
            int i11 = getSDKTransactionID + 99;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                byte b11 = (byte) ($$b & 3);
                Object[] objArr = new Object[1];
                a(b11, b11, $$a[3], objArr);
                Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
                throw null;
            }
            int i12 = $$b;
            byte b12 = (byte) (i12 & 3);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(b12, b12, bArr[3], objArr2);
            Class.forName((String) objArr2[0]).getField("getSDKReferenceNumber").get(null);
            byte b13 = (byte) (i12 & 3);
            try {
                Object[] objArr3 = new Object[1];
                a(b13, b13, bArr[3], objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b14 = bArr[3];
                byte b15 = b14;
                Object[] objArr4 = new Object[1];
                a(b14, b15, (byte) (b15 + 1), objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(null, null);
                Object[] objArr5 = {atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null)};
                Object[] objArr6 = new Object[1];
                b("譺䩔ऩ", 49450 - TextUtils.lastIndexOf("", '0', 0), objArr6);
                getDeviceData = (getSDKTransactionID + 15) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{25, 11, 21, 0, 27, -8, -46, 59, 26, -61, 27, 60, 7, -4, 5, 17, 14, -3, 2, 6, 27, -3, 14, 7, -20, 27, 20, 12, -8, 22, 9, -28, 25, 25, -9, 20, 0, 23, -7, 21, 9, 6, 23, -25, -7, 15, 15, 27, 9, 7, 21, -5, 17, -3, 10, -15, 47, 0, -3, 11, 21};
            $$b = 181;
        }

        static void init$1() {
            $$d = new byte[]{0, -124, -15, -20};
            $$e = 71;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber();
        Process.getThreadPriority(0);
        Color.alpha(0);
        Color.alpha(0);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getDeviceData + 67;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ onCompletion(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x01a8  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        int i14;
        Object method;
        if (str != null) {
            $10 = ($11 + 121) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr2 = new char[i12];
        int i15 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i16 = getmessageversion.getDeviceData;
            if (i16 >= i12) {
                break;
            }
            char c11 = cArr[i16];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr2[i16] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getSDKReferenceNumber);
                objArr2[i15] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    i14 = i15;
                    method = obj;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1186 - Color.alpha(i15), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 46 - Color.green(i15));
                    byte b11 = (byte) i15;
                    byte b12 = b11;
                    i14 = i15;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str2 = (String) objArr3[i14];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i14] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - Color.blue(i14), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 48634), TextUtils.indexOf("", "") + 24);
                    byte b13 = (byte) ($$b & 5);
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[i14], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i15 = i14;
                cArr = cArr;
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
        int i17 = i15;
        if (i13 > 0) {
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr3 = new char[i12];
            System.arraycopy(cArr2, i17, cArr3, i17, i12);
            int i18 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i17, cArr2, i12 - i18, i18);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i19, cArr2, i17, i12 - i19);
            $10 = ($11 + 27) % 128;
        }
        if (z11) {
            $10 = ($11 + 121) % 128;
            char[] cArr4 = new char[i12];
            getmessageversion.getDeviceData = 0;
            while (true) {
                int i21 = getmessageversion.getDeviceData;
                if (i21 >= i12) {
                    break;
                }
                cArr4[i21] = cArr2[(i12 - i21) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - TextUtils.indexOf((CharSequence) "", '0'), (char) (48634 - View.resolveSizeAndState(0, 0, 0)), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    byte b15 = (byte) ($$b & 5);
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
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
    private static void b(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 68 - r5
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = atd.r.onCompletion.$$a
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r5
            r5 = r7
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r3 = r1[r6]
        L2b:
            int r5 = r5 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.onCompletion.b(short, int, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKReferenceNumber = 1029304929;
    }

    static void init$0() {
        $$a = new byte[]{99, 39, 79, 89};
        $$b = 179;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        AuthenticationRequestParameters = (getDeviceData + 95) % 128;
        if (Build.VERSION.SDK_INT > 27) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 114, true, 39 - (ViewConfiguration.getEdgeSlop() >> 16), "\ufff5\t\u0001\b\u0005\r\n\ufffb\u0004\ufff5\uffff￼\uffff\r\u0004\u0005\ufff5\u0004\u0005\uffff\n\ufff7\ufff9\uffff￼\uffff\n\u0005\u0004\ufff5\ufffb\u0002\ufff8\ufff7\u0002\uffff\ufff7\f\ufff7", KeyEvent.keyCodeFromString("") + 14, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getDeviceData = (AuthenticationRequestParameters + 95) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                AuthenticationRequestParameters = (getDeviceData + 17) % 128;
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getDeviceData = (AuthenticationRequestParameters + 13) % 128;
        return failure;
    }

    private onCompletion(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
