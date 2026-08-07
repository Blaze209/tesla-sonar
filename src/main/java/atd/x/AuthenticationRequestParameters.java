package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
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
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DateFormat;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isValidFormat", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static char getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/DateFormat$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MONTH_DAY_YEAR", "DAY_MONTH_YEAR", "YEAR_MONTH_DAY", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static long AuthenticationRequestParameters;
        private static int getSDKAppID;
        private static int getSDKReferenceNumber;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            getSDKReferenceNumber = 1;
            AuthenticationRequestParameters = 1644789350289411865L;
        }

        private getSDKAppID() {
        }

        private static void a(byte b11, short s11, int i11, Object[] objArr) {
            byte[] bArr = $$a;
            int i12 = s11 + 65;
            int i13 = (i11 * 2) + 4;
            byte[] bArr2 = new byte[31 - b11];
            int i14 = 30 - b11;
            int i15 = -1;
            if (bArr == null) {
                i12 = i13 + (-i12) + 6;
                i13++;
                bArr = bArr;
                i15 = -1;
            }
            while (true) {
                int i16 = i15 + 1;
                bArr2[i16] = (byte) i12;
                if (i16 == i14) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i12 = i12 + (-bArr[i13]) + 6;
                i13++;
                bArr = bArr;
                i15 = i16;
            }
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12 = ($10 + 27) % 128;
            $11 = i12;
            if (str != null) {
                int i13 = i12 + 71;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
            char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(AuthenticationRequestParameters ^ 4326518537449951405L, charArray, i11);
            getadditionaldetails.getDeviceData = 4;
            while (true) {
                int i14 = getadditionaldetails.getDeviceData;
                if (i14 >= deviceData.length) {
                    objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                    return;
                }
                int i15 = i14 - 4;
                getadditionaldetails.getSDKTransactionID = i15;
                try {
                    Object[] objArr2 = {Long.valueOf(deviceData[i14] ^ deviceData[i14 % 4]), Long.valueOf(i15), Long.valueOf(AuthenticationRequestParameters)};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(-1024136788);
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(2749 - Drawable.resolveOpacity(0, 0), (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 54838), 29 - (ViewConfiguration.getTouchSlop() >> 8));
                        Class cls2 = Long.TYPE;
                        method = cls.getMethod("c", cls2, cls2, cls2);
                        map.put(-1024136788, method);
                    }
                    deviceData[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                    Object method2 = map.get(-719904898);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > 0 ? 1 : (AudioTrack.getMinVolume() == 0 ? 0 : -1)) + 1401, (char) (16690 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr4 = new Object[1];
                        c(b11, b12, b12, objArr4);
                        method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(-719904898, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                    $10 = ($11 + 19) % 128;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
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
        private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r6 = r6 + 101
                byte[] r0 = atd.x.AuthenticationRequestParameters.getSDKAppID.$$d
                int r8 = r8 * 2
                int r8 = r8 + 1
                int r7 = r7 * 4
                int r7 = 3 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r3 = r0[r7]
            L2a:
                int r3 = -r3
                int r6 = r6 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.AuthenticationRequestParameters.getSDKAppID.c(int, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:42:0x03be A[PHI: r7 r15
          0x03be: PHI (r7v37 java.lang.String) = (r7v115 java.lang.String), (r7v116 java.lang.String) binds: [B:39:0x0371, B:41:0x03bc] A[DONT_GENERATE, DONT_INLINE]
          0x03be: PHI (r15v7 ??) = (r15v35 ??), (r15v36 ??) binds: [B:39:0x0371, B:41:0x03bc] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x03c4  */
        /* JADX WARN: Code duplicated, block: B:47:0x0429  */
        /* JADX WARN: Code duplicated, block: B:48:0x042a A[Catch: all -> 0x07c0, TryCatch #0 {all -> 0x07c0, blocks: (B:5:0x007e, B:9:0x00d0, B:8:0x0097, B:17:0x01ac, B:21:0x020c, B:33:0x02d8, B:37:0x0329, B:87:0x06a6, B:91:0x06ff, B:90:0x06c2, B:95:0x074d, B:99:0x07a8, B:98:0x0769, B:45:0x0411, B:49:0x046c, B:48:0x042a, B:36:0x02e8, B:20:0x01c9, B:24:0x0260, B:28:0x02bb, B:27:0x0279), top: B:113:0x002f }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v10 */
        /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r15v15 */
        /* JADX WARN: Type inference failed for: r15v30 */
        /* JADX WARN: Type inference failed for: r15v31 */
        /* JADX WARN: Type inference failed for: r15v32 */
        /* JADX WARN: Type inference failed for: r15v33 */
        /* JADX WARN: Type inference failed for: r15v34 */
        /* JADX WARN: Type inference failed for: r15v35 */
        /* JADX WARN: Type inference failed for: r15v36 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r2v34 */
        /* JADX WARN: Type inference failed for: r2v35 */
        /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r2v41, types: [int] */
        /* JADX WARN: Type inference failed for: r2v42 */
        /* JADX WARN: Type inference failed for: r2v43 */
        /* JADX WARN: Type inference failed for: r2v48 */
        /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r2v53 */
        /* JADX WARN: Type inference failed for: r2v63 */
        /* JADX WARN: Type inference failed for: r2v64 */
        /* JADX WARN: Type inference failed for: r2v65 */
        /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r5v68, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r7v108 */
        /* JADX WARN: Type inference failed for: r7v109 */
        /* JADX WARN: Type inference failed for: r7v110 */
        /* JADX WARN: Type inference failed for: r7v111 */
        /* JADX WARN: Type inference failed for: r7v112 */
        /* JADX WARN: Type inference failed for: r7v113 */
        /* JADX WARN: Type inference failed for: r7v114 */
        /* JADX WARN: Type inference failed for: r7v50 */
        /* JADX WARN: Type inference failed for: r7v51 */
        /* JADX WARN: Type inference failed for: r7v52 */
        /* JADX WARN: Type inference failed for: r7v53 */
        /* JADX WARN: Type inference failed for: r7v71 */
        /* JADX WARN: Type inference failed for: r7v72 */
        /* JADX WARN: Type inference failed for: r7v73, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r7v85 */
        /* JADX WARN: Type inference failed for: r7v86 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        public static java.lang.Object[] getSDKTransactionID(android.content.Context r40, int r41, int r42) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2002
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.x.AuthenticationRequestParameters.getSDKAppID.getSDKTransactionID(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{126, 51, 71, 77, 8, -9, 39, 21, -1, -1, -13, 5, 7, -7, 19, -3, 17, 4, 29, -33, 14, 17, 3, -7, -46, 7, 18, 9, -3, 0, 17, 12, 8, -13, 17, 0, 7, 34, -13, -6, 2, 22, -8, 5, 42, -11, -11, 23, -6, 14, -9, 21, -7, 5, 8, -9, 39, 21, -1, Tnaf.POW_2_WIDTH, -41, 6, 45, 11, 1, 27, 39};
            $$b = 180;
        }

        static void init$1() {
            $$d = new byte[]{36, 7, 47, 54};
            $$e = 159;
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getLongPressTimeout();
        SystemClock.elapsedRealtime();
        ViewConfiguration.getMaximumDrawingCacheSize();
        TextUtils.lastIndexOf("", '0', 0);
        ViewConfiguration.getKeyRepeatTimeout();
        ViewConfiguration.getTouchSlop();
        Color.argb(0, 0, 0, 0);
        ViewConfiguration.getTouchSlop();
        new getSDKAppID((byte) 0);
        int i11 = getSDKTransactionID + 119;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ AuthenticationRequestParameters(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    private static boolean AuthenticationRequestParameters(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionChild(0L) + 33, "㘰㘰\b\u0002\u0002\b㘜㘜㘜㘜\u0004\u0001\u0002\b㘰㘰\u000b\t㘜㘜\t\u0004㘜㘜㘜㘜\u000e\n\n\u000e㘷㘷", (byte) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 56), objArr);
        boolean zI = new q(((String) objArr[0]).intern()).i(str);
        getSDKTransactionID = (getDeviceData + 13) % 128;
        return zI;
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        float f11;
        int length;
        char[] cArr;
        char c11;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.completed completedVar = new atd.az.completed();
        char[] cArr2 = getSDKAppID;
        Class cls = Integer.TYPE;
        char c12 = 2;
        if (cArr2 != null) {
            int i13 = $11 + 71;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(-1709775791);
                    if (method != null) {
                        c11 = c12;
                    } else {
                        c11 = c12;
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 24 - (KeyEvent.getMaxKeyCode() >> 16));
                        byte b12 = (byte) (-$$a[c11]);
                        byte b13 = (byte) (b12 + 1);
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, b13, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-1709775791, method);
                    }
                    cArr[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    c12 = c11;
                    charArray = charArray;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = charArray;
        char c13 = c12;
        Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-1709775791);
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (method2 == null) {
            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTapTimeout() >> 16) + 2313, (char) TextUtils.indexOf("", ""), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
            byte b14 = (byte) (-$$a[c13]);
            byte b15 = (byte) (b14 + 1);
            Object[] objArr5 = new Object[1];
            b(b14, b15, b15, objArr5);
            method2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-1709775791, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            completedVar.getSDKTransactionID = 0;
            $10 = ($11 + 97) % 128;
            while (true) {
                int i15 = completedVar.getSDKTransactionID;
                if (i15 >= i12) {
                    break;
                }
                $11 = ($10 + 61) % 128;
                char c14 = cArr3[i15];
                completedVar.getSDKAppID = c14;
                char c15 = cArr3[i15 + 1];
                completedVar.getSDKReferenceNumber = c15;
                if (c14 == c15) {
                    cArr4[i15] = (char) (c14 - b11);
                    cArr4[i15 + 1] = (char) (c15 - b11);
                    f11 = f12;
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
                    objArr6[c13] = Integer.valueOf(cCharValue);
                    objArr6[1] = completedVar;
                    objArr6[0] = completedVar;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    f11 = f12;
                    Object method3 = map3.get(700818725);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 1920, (char) ExpandableListView.getPackedPositionGroup(0L), 30 - (ViewConfiguration.getScrollFriction() > f11 ? 1 : (ViewConfiguration.getScrollFriction() == f11 ? 0 : -1)));
                        byte b16 = (byte) (-$$a[c13]);
                        byte b17 = (byte) (b16 + 1);
                        Object[] objArr7 = new Object[1];
                        b(b16, b17, (byte) (b17 | 55), objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(700818725, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i16 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i16) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[6] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c13] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1720, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48634), View.resolveSizeAndState(0, 0, 0) + 24);
                            byte b18 = (byte) (-$$a[c13]);
                            byte b19 = (byte) (b18 + 1);
                            Object[] objArr9 = new Object[1];
                            b(b18, b19, (byte) (b19 | 6), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls7 = Integer.TYPE;
                            method4 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i17 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i18 = completedVar.getSDKTransactionID;
                        cArr4[i18] = cArr2[iIntValue2];
                        cArr4[i18 + 1] = cArr2[i17];
                    } else {
                        int i19 = completedVar.getDeviceData;
                        int i21 = completedVar.AuthenticationRequestParameters;
                        if (i19 == i21) {
                            $11 = ($10 + 93) % 128;
                            int i22 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i22;
                            int i23 = ((i16 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i23;
                            int i24 = (i21 * cCharValue) + i23;
                            int i25 = completedVar.getSDKTransactionID;
                            cArr4[i25] = cArr2[(i19 * cCharValue) + i22];
                            cArr4[i25 + 1] = cArr2[i24];
                        } else {
                            int i26 = (i19 * cCharValue) + i16;
                            int i27 = (i21 * cCharValue) + completedVar.getMessageVersion;
                            int i28 = completedVar.getSDKTransactionID;
                            cArr4[i28] = cArr2[i26];
                            cArr4[i28 + 1] = cArr2[i27];
                            $11 = ($10 + 71) % 128;
                        }
                    }
                }
                completedVar.getSDKTransactionID += 2;
                f12 = f11;
            }
        }
        for (int i29 = 0; i29 < i11; i29++) {
            cArr4[i29] = (char) (cArr4[i29] ^ 13722);
        }
        objArr[0] = new String(cArr4);
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
    private static void b(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 67
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = atd.x.AuthenticationRequestParameters.$$a
            int r6 = r6 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.AuthenticationRequestParameters.b(short, byte, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{108, 44, 1, -44};
        $$b = 106;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        if (Build.VERSION.SDK_INT >= 31) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        a(12 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0002\f\b\n\u0007\u0000\u0001\u0005\n\u0002㘰", (byte) (66 - View.combineMeasuredStates(0, 0)), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            if (AuthenticationRequestParameters(sDKTransactionID)) {
                int i11 = (getSDKTransactionID + 9) % 128;
                getDeviceData = i11;
                getSDKTransactionID = (i11 + 109) % 128;
            } else {
                sDKTransactionID = null;
            }
            if (sDKTransactionID != null) {
                return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = new char[]{52410, 52396, 52462, 52408, 52353, 52386, 52403, 52463, 52391, 52411, 52465, 52394, 52383, 52401, 52415, 52460};
        getSDKReferenceNumber = (char) 63808;
    }

    private AuthenticationRequestParameters(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
