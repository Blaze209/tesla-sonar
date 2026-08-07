package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionRequestedChecker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/InstallNonMarketApps;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/PackageManager;", "packageManager", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/PackageManager;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/PackageManager;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAdditionalDetails extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getDeviceData;
    private static byte[] getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private final PermissionChecker getSDKAppID;
    private final ChallengeResultCompleted getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/InstallNonMarketApps$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static char getDeviceData;
        private static int getMessageVersion;
        private static int getSDKAppID;
        private static char getSDKReferenceNumber;
        private static char getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKAppID = 0;
            getMessageVersion = 1;
            getSDKReferenceNumber = (char) 56223;
            AuthenticationRequestParameters = (char) 11151;
            getDeviceData = (char) 30091;
            getSDKTransactionID = (char) 63702;
        }

        private getDeviceData() {
        }

        /* JADX WARN: Code duplicated, block: B:45:0x03be  */
        /* JADX WARN: Code duplicated, block: B:47:0x03c4  */
        /* JADX WARN: Code duplicated, block: B:50:0x0426  */
        /* JADX WARN: Code duplicated, block: B:51:0x0427 A[Catch: all -> 0x07bf, TryCatch #5 {all -> 0x07bf, blocks: (B:7:0x0073, B:11:0x00c7, B:10:0x008c, B:19:0x01ab, B:23:0x0206, B:35:0x02cc, B:39:0x02e0, B:40:0x0326, B:89:0x069a, B:93:0x06f3, B:92:0x06b6, B:97:0x074e, B:101:0x07a7, B:100:0x076a, B:48:0x040f, B:52:0x0461, B:51:0x0427, B:22:0x01c8, B:26:0x025a, B:30:0x02af, B:29:0x0273), top: B:126:0x0030 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r7v100 */
        /* JADX WARN: Type inference failed for: r7v101 */
        /* JADX WARN: Type inference failed for: r7v44 */
        /* JADX WARN: Type inference failed for: r7v45 */
        /* JADX WARN: Type inference failed for: r7v46 */
        /* JADX WARN: Type inference failed for: r7v61 */
        /* JADX WARN: Type inference failed for: r7v62 */
        /* JADX WARN: Type inference failed for: r7v63 */
        /* JADX WARN: Type inference failed for: r7v65, types: [int] */
        /* JADX WARN: Type inference failed for: r7v77, types: [java.lang.reflect.Method] */
        /* JADX WARN: Type inference failed for: r7v78 */
        /* JADX WARN: Type inference failed for: r7v99 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException
            */
        public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r38, int r39, int r40) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2003
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.v.getAdditionalDetails.getDeviceData.AuthenticationRequestParameters(android.content.Context, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(int r5, byte r6, short r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 2
                int r7 = 66 - r7
                int r0 = r6 + 2
                byte[] r1 = atd.v.getAdditionalDetails.getDeviceData.$$a
                int r5 = 122 - r5
                byte[] r0 = new byte[r0]
                int r6 = r6 + 1
                r2 = -1
                if (r1 != 0) goto L15
                r3 = r2
                r2 = r1
                r1 = r7
                goto L2f
            L15:
                r4 = r7
                r7 = r5
                r5 = r4
            L18:
                int r2 = r2 + 1
                byte r3 = (byte) r7
                r0[r2] = r3
                if (r2 != r6) goto L28
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r0, r6)
                r8[r6] = r5
                return
            L28:
                r3 = r1[r5]
                r4 = r1
                r1 = r5
                r5 = r3
                r3 = r2
                r2 = r4
            L2f:
                int r5 = -r5
                int r7 = r7 + r5
                int r7 = r7 + 6
                int r5 = r1 + 1
                r1 = r2
                r2 = r3
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.v.getAdditionalDetails.getDeviceData.a(int, byte, short, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            if (str != null) {
                charArray = str.toCharArray();
                $10 = ($11 + 81) % 128;
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
            char[] cArr2 = new char[cArr.length];
            int i13 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            int i14 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i15 = challengeStatusHandler.getSDKReferenceNumber;
                if (i15 >= cArr.length) {
                    break;
                }
                cArr3[i13] = cArr[i15];
                int i16 = 1;
                cArr3[1] = cArr[i15 + 1];
                int i17 = 58224;
                int i18 = i13;
                while (i18 < 16) {
                    char c11 = cArr3[i16];
                    char c12 = cArr3[i13];
                    int i19 = i14;
                    int i21 = i18;
                    int i22 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                    int i23 = c12 >>> 5;
                    int i24 = i16;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKTransactionID);
                        objArr2[i19] = Integer.valueOf(i23);
                        objArr2[i24] = Integer.valueOf(i22);
                        objArr2[i13] = Integer.valueOf(c11);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i13;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - Color.red(i13), (char) (16682 - Color.red(i13)), 29 - TextUtils.indexOf("", "", i13, i13));
                            byte b11 = (byte) i13;
                            byte b12 = (byte) (b11 + 1);
                            i12 = i13;
                            Object[] objArr3 = new Object[i24];
                            c(b11, b12, (byte) (-b12), objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i12];
                        int i25 = i17;
                        int i26 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                        int i27 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                        objArr4[i19] = Integer.valueOf(i27);
                        objArr4[1] = Integer.valueOf(i26);
                        objArr4[i12] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', i12) + 16683), MotionEvent.axisFromString("") + 30);
                            byte b13 = (byte) 0;
                            byte b14 = (byte) (b13 + 1);
                            Object[] objArr5 = new Object[1];
                            c(b13, b14, (byte) (-b14), objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i17 = i25 - FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i18 = i21 + 1;
                        i14 = i19;
                        cArr = cArr;
                        cArr3 = cArr3;
                        i13 = 0;
                        i16 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = cArr;
                int i28 = i14;
                char[] cArr5 = cArr3;
                int i29 = challengeStatusHandler.getSDKReferenceNumber;
                cArr2[i29] = cArr5[0];
                cArr2[i29 + 1] = cArr5[1];
                Object[] objArr6 = new Object[i28];
                objArr6[1] = challengeStatusHandler;
                objArr6[0] = challengeStatusHandler;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1596, (char) (27823 - MotionEvent.axisFromString("")), TextUtils.getOffsetBefore("", 0) + 25);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    c(b15, b16, (byte) (b16 - 1), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                cArr = cArr4;
                cArr3 = cArr5;
                i13 = 0;
                i14 = 2;
            }
            String str2 = new String(cArr2, 0, i11);
            int i31 = $11 + 75;
            $10 = i31 % 128;
            if (i31 % 2 != 0) {
                throw null;
            }
            objArr[0] = str2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0025  */
        /* JADX WARN: Code duplicated, block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.v.getAdditionalDetails.getDeviceData.$$d
                int r7 = r7 * 4
                int r7 = 116 - r7
                int r6 = r6 * 4
                int r1 = r6 + 1
                int r8 = r8 + 4
                byte[] r1 = new byte[r1]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r6
                r7 = r8
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r8 = r8 + 1
                r3 = r0[r8]
                r5 = r8
                r8 = r7
                r7 = r5
            L2c:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.v.getAdditionalDetails.getDeviceData.c(short, short, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{33, -44, 93, -79, 8, -9, 39, 21, -1, -1, -13, 5, 7, -7, 19, -3, 17, 4, 29, -33, 14, 17, 3, -7, -46, 7, 18, 9, -3, 0, 17, 12, 8, -13, 17, 0, 7, 34, -13, -6, 2, 22, -8, 5, 42, -11, -11, 23, -6, 14, -9, 21, -7, 5, 8, -9, 39, 21, -1, Tnaf.POW_2_WIDTH, -41, 6, 45, 11, 1, 27, 39};
            $$b = 224;
        }

        static void init$1() {
            $$d = new byte[]{11, 12, 68, 127};
            $$e = EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        BuildConfig = 1;
        getSDKReferenceNumber();
        ExpandableListView.getPackedPositionForChild(0, 0);
        View.combineMeasuredStates(0, 0);
        View.getDefaultSize(0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        new getDeviceData((byte) 0);
        int i11 = getSDKEphemeralPublicKey + 13;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getAdditionalDetails(Application application) {
        this(application, new ChallengeResultCancelled(application), new atd.q.getDeviceData(application), new PermissionRequestedChecker(application));
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        boolean z11;
        Object method;
        atd.az.ChallengeResultKt challengeResultKt = new atd.az.ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(AuthenticationRequestParameters)};
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 == null) {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + 2105, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21994), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 32);
                byte b12 = (byte) ($$b & 7);
                byte b13 = (byte) (b12 - 1);
                Object[] objArr3 = new Object[1];
                b(b12, b13, b13, objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i14 = iIntValue == -1 ? 1 : 0;
            char c11 = '0';
            if (i14 != 0) {
                $10 = ($11 + 95) % 128;
                byte[] bArr = getMessageVersion;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i15 = 0;
                    while (i15 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr[i15])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", c11, 0, 0) + 2937, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 33)).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr2[i15] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i15++;
                        bArr2 = bArr2;
                        bArr = bArr;
                        c11 = '0';
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = getMessageVersion;
                    Object[] objArr5 = {Integer.valueOf(i13), Integer.valueOf(getDeviceData)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 2106, (char) (View.combineMeasuredStates(0, 0) + 21995), (ViewConfiguration.getScrollBarSize() >> 8) + 31);
                        byte b14 = (byte) ($$b & 7);
                        byte b15 = (byte) (b14 - 1);
                        Object[] objArr6 = new Object[1];
                        b(b14, b15, b15, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ (-671853308956415234L))) + ((int) (((long) AuthenticationRequestParameters) ^ (-671853308956415234L))));
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResult[i13 + ((int) (((long) getDeviceData) ^ (-671853308956415234L)))]) ^ (-671853308956415234L))) + ((int) (((long) AuthenticationRequestParameters) ^ (-671853308956415234L))));
                }
            }
            if (iIntValue > 0) {
                challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getDeviceData) ^ (-671853308956415234L))) + i14;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(ChallengeResultCancelled), sb2};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2135 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, b17, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr4 = getMessageVersion;
                if (bArr4 != null) {
                    $11 = ($10 + 39) % 128;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i16 = 0; i16 < length2; i16++) {
                        int i17 = $11 + 77;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            bArr5[i16] = (byte) (((long) bArr4[i16]) - (-671853308956415234L));
                        } else {
                            bArr5[i16] = (byte) (((long) bArr4[i16]) ^ (-671853308956415234L));
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    $11 = ($10 + 83) % 128;
                    z11 = true;
                } else {
                    z11 = false;
                }
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    if (z11) {
                        byte[] bArr6 = getMessageVersion;
                        int i18 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i18 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i18]) ^ (-671853308956415234L))) + s11)) ^ b11));
                    } else {
                        short[] sArr = ChallengeResult;
                        int i19 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i19 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i19]) ^ (-671853308956415234L))) + s11)) ^ b11));
                    }
                    sb2.append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    challengeResultKt.getSDKReferenceNumber++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static void b(byte b11, int i11, byte b12, Object[] objArr) {
        byte[] bArr = $$a;
        int i12 = 121 - (b11 * 7);
        int i13 = 4 - (b12 * 2);
        int i14 = i11 * 4;
        byte[] bArr2 = new byte[i14 + 1];
        int i15 = -1;
        if (bArr == null) {
            i12 += i14;
            i13++;
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i12;
            if (i15 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i12 += bArr[i13];
                i13++;
            }
        }
    }

    static void getSDKReferenceNumber() {
        getDeviceData = -166494975;
        AuthenticationRequestParameters = -1568970041;
        ChallengeResultCancelled = -384082499;
        getMessageVersion = new byte[]{36, 41, 24, 39, 60, 24, 47, 46, 22, 53, 27, 54, 40, 38, 24, 52, 41, 28, 58, 38, 34, 34, 107, 123, 115, -125, 113, 119, -122, -122, 100, 121, 108, -118, 118, 114, 114, -113, 108, 118, 107, -119, 117, 109, -124, 85, -71, 120, 115, -125, 121, 111, 125, 124, 106, -126, 55, -81, 124, 127, 122, 107, -125, 106, -28, -36, -12, -2, -2, -2};
    }

    static void init$0() {
        $$a = new byte[]{67, 74, -88, -74};
        $$b = 17;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        if (Build.VERSION.SDK_INT >= 26) {
            PermissionChecker permissionChecker = this.getSDKAppID;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getPressedStateDuration() >> 16) - 14, View.MeasureSpec.getMode(0) - 1264596706, (short) (TextUtils.lastIndexOf("", '0', 0) + 122), (-1416108009) + ((Process.getThreadPriority(0) + 20) >> 6), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr);
            return permissionChecker.getSDKAppID(((String) objArr[0]).intern()) ? DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(this.getSDKReferenceNumber.getSDKReferenceNumber())) : new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        getSDKEphemeralPublicKey = (BuildConfig + 109) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKTransactionID;
        Object[] objArr2 = new Object[1];
        a((-34) - (ViewConfiguration.getFadingEdgeLength() >> 16), (-1264596698) - (KeyEvent.getMaxKeyCode() >> 16), (short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 41), (-1416108031) - Color.blue(0), (byte) (Process.myTid() >> 22), objArr2);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr2[0]).intern());
        if (sDKTransactionID != null) {
            getSDKEphemeralPublicKey = (BuildConfig + 89) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                int i11 = BuildConfig + 111;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
                DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                throw null;
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        int i12 = getSDKEphemeralPublicKey + 29;
        BuildConfig = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 36 / 0;
        }
        return failure;
    }

    private getAdditionalDetails(Application application, ChallengeResultCompleted challengeResultCompleted, atd.q.AuthenticationRequestParameters authenticationRequestParameters, PermissionChecker permissionChecker) {
        s.k(application, "");
        s.k(challengeResultCompleted, "");
        s.k(authenticationRequestParameters, "");
        s.k(permissionChecker, "");
        this.getSDKReferenceNumber = challengeResultCompleted;
        this.getSDKTransactionID = authenticationRequestParameters;
        this.getSDKAppID = permissionChecker;
    }
}
