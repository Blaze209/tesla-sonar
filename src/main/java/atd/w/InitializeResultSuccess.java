package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0004J\b\u0010\u000e\u001a\u00020\rH\u0004J\b\u0010\u000f\u001a\u00020\rH\u0004J\b\u0010\u0010\u001a\u00020\rH\u0004J\b\u0010\u0011\u001a\u00020\rH\u0004J\b\u0010\u0012\u001a\u00020\rH\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", Kind.APPLICATION, "Landroid/app/Application;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "telephonyManager", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "()Landroid/telephony/TelephonyManager;", "appHasCarrierPrivileges", "", "isNetworkCdma", "isReadPhoneStatePermissionGranted", "isReadSmsPermissionGranted", "isReadPrivilegedPhoneStatePermissionGranted", "isReadPhoneNumbersPermissionGranted", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class InitializeResultSuccess extends DeviceParameter {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static char[] getSDKTransactionID;
    private final Application getDeviceData;
    private final PermissionChecker getSDKAppID;
    private final TelephonyManager getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        getSDKTransactionID = new char[]{'\b', 37691, 9793, 47511, 19633, 25, 37693, 9802, 47499, 19643, 57286, 29470, 1659, 39248, 11422, 49060, 21196, 58901, 31012, 3153, 40852, 12967, 50637, 22864, 60443, 32609, 4798, 42382, 14586, 52256, 24323, 62057, 34239, 6281, 44024, 16161, 53785, 25945, 63655, 35723, 57175, 19571, 63748, 26309, 37877, 136, 44112, 55605, 17950, 62416, 24810, 36226, 14683, 42602, 54047, 16602, 60905, 6787, 34334, 13141, 41007, 52720, 31424, 59316, 4973, 32840, 11579, 1236, 38896, 8839, 48454, 18550, 56075, 30675, 694, 40349, 10323, 47977, 22017, 58072, 32233, 2204, 39769, 13930, 49408, 23965, 59606, 31660, 5747, 41283, 15415, 51437, 23508, 63138, 33130, 7240, 44838, 15354, 54983, 24976, 64634, 36700, 6660, 46833, 16845, 56473, 28541, 64082, 38149, 8687, 48333, 20357, 55935, 21242, 49630, 29865, 60264, 7768, 36133, 8701, 21656, 52147, 32381, 60743, '/', 46326, 11207, 24242, 52599, 24644, 38702, 2995, 48888, 11650, 16477, 63341, 27161, 40643, 3552, 41098, 55132, 19050, 63771, 28127, 33019, 14262, 43602, 55656, 19496, 57540};
        AuthenticationRequestParameters = -3517516969738136749L;
    }

    public /* synthetic */ InitializeResultSuccess(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x02df  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e0  */
    private static void c(int i11, int i12, char c11, Object[] objArr) throws Throwable {
        Throwable cause;
        Object method;
        int i13 = i11;
        atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
        long[] jArr = new long[i13];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i14 = buildConfig.getDeviceData;
            if (i14 >= i13) {
                break;
            }
            int i15 = $10 + 107;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i16 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(getSDKTransactionID[i12 * i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(1019086628);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionGroup(0L) + 1774, (char) ((-1) - MotionEvent.axisFromString("")), 32 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, b12, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(1019086628, method);
                    }
                    Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                    l11.longValue();
                    Object[] objArr4 = {l11, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(AuthenticationRequestParameters), Integer.valueOf(c11)};
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(0) + 442, (char) Color.alpha(0), 37 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("n", cls, cls, cls, cls2);
                        map.put(-1106061844, method2);
                    }
                    jArr[i14] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {buildConfig, buildConfig};
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (Process.myTid() >> 22), 29 - TextUtils.getOffsetAfter("", 0));
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr6 = new Object[1];
                        d(b13, b14, (byte) (b14 - 1), objArr6);
                        method3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                        map.put(1947342796, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                jArr = jArr;
                Object[] objArr7 = {Integer.valueOf(getSDKTransactionID[i12 + i14])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1019086628);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - TextUtils.getCapsMode("", 0, 0), (char) TextUtils.getOffsetBefore("", 0), 32 - TextUtils.getCapsMode("", 0, 0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    d(b15, b16, b16, objArr8);
                    method4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(1019086628, method4);
                }
                Long l12 = (Long) ((Method) method4).invoke(null, objArr7);
                l12.longValue();
                Object[] objArr9 = {l12, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(AuthenticationRequestParameters), Integer.valueOf(c11)};
                Object method5 = map2.get(-1106061844);
                if (method5 == null) {
                    method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(441 - ExpandableListView.getPackedPositionType(0L), (char) View.resolveSize(0, 0), 37 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("n", cls, cls, cls, cls2);
                    map2.put(-1106061844, method5);
                }
                jArr[i14] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {buildConfig, buildConfig};
                Object method6 = map2.get(1947342796);
                if (method6 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + 1919, (char) (ViewConfiguration.getTapTimeout() >> 16), 29 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte b17 = (byte) 0;
                    byte b18 = (byte) (b17 + 1);
                    Object[] objArr11 = new Object[1];
                    d(b17, b18, (byte) (b18 - 1), objArr11);
                    method6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1947342796, method6);
                }
                ((Method) method6).invoke(null, objArr10);
            }
            i13 = i11;
            jArr = jArr;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[i13];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i17 = buildConfig.getDeviceData;
            if (i17 >= i13) {
                break;
            }
            $10 = ($11 + 91) % 128;
            cArr[i17] = (char) jArr2[i17];
            Object[] objArr12 = {buildConfig, buildConfig};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method7 = map3.get(1947342796);
            if (method7 == null) {
                Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getPressedStateDuration() >> 16) + 1919, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 28 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                byte b19 = (byte) 0;
                byte b21 = (byte) (b19 + 1);
                Object[] objArr13 = new Object[1];
                d(b19, b21, (byte) (b21 - 1), objArr13);
                method7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1947342796, method7);
            }
            ((Method) method7).invoke(null, objArr12);
        }
        String str = new String(cArr);
        int i18 = $11 + 37;
        $10 = i18 % 128;
        if (i18 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i19 = 57 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r0 = atd.w.InitializeResultSuccess.$$d
            int r7 = r7 * 5
            int r7 = r7 + 108
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            r3 = -1
            if (r0 != 0) goto L19
            r4 = r7
            r7 = r6
            goto L2d
        L19:
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r0[r7]
        L2d:
            int r6 = r6 + r4
            int r7 = r7 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.w.InitializeResultSuccess.d(int, short, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        return getSDKAppID(objArr);
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) throws Throwable {
        InitializeResultSuccess initializeResultSuccess = (InitializeResultSuccess) objArr[0];
        BuildConfig = (ChallengeResult + 125) % 128;
        if (Build.VERSION.SDK_INT < 26) {
            int i11 = BuildConfig + 123;
            ChallengeResult = i11 % 128;
            if (i11 % 2 != 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        PermissionChecker permissionChecker = initializeResultSuccess.getSDKAppID;
        Object[] objArr2 = new Object[1];
        c(TextUtils.getTrimmedLength("") + 37, KeyEvent.getDeadChar(0, 0) + 113, (char) (21220 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr2);
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) objArr2[0]).intern());
        BuildConfig = (ChallengeResult + 105) % 128;
        return Boolean.valueOf(sDKAppID);
    }

    static void init$0() {
        $$d = new byte[]{20, 60, 106, 116};
        $$e = EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE;
    }

    protected final boolean BuildConfig() throws Throwable {
        PermissionChecker permissionChecker;
        Object obj;
        int i11 = BuildConfig + 83;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            permissionChecker = this.getSDKAppID;
            Object[] objArr = new Object[1];
            c(66 >>> (ViewConfiguration.getMaximumDrawingCacheSize() / 31), 2 >> TextUtils.indexOf("", "", 1, 1), (char) KeyEvent.normalizeMetaState(0), objArr);
            obj = objArr[0];
        } else {
            permissionChecker = this.getSDKAppID;
            Object[] objArr2 = new Object[1];
            c(35 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 5 - TextUtils.indexOf("", "", 0, 0), (char) KeyEvent.normalizeMetaState(0), objArr2);
            obj = objArr2[0];
        }
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) obj).intern());
        ChallengeResult = (BuildConfig + 11) % 128;
        return sDKAppID;
    }

    protected final boolean ChallengeResult() throws Throwable {
        PermissionChecker permissionChecker;
        Object obj;
        int i11 = ChallengeResult + 43;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            permissionChecker = this.getSDKAppID;
            Object[] objArr = new Object[1];
            c((ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)) * 19, 50 % KeyEvent.normalizeMetaState(1), (char) (Color.alpha(0) * 57166), objArr);
            obj = objArr[0];
        } else {
            permissionChecker = this.getSDKAppID;
            Object[] objArr2 = new Object[1];
            c((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27, KeyEvent.normalizeMetaState(0) + 40, (char) (57166 - Color.alpha(0)), objArr2);
            obj = objArr2[0];
        }
        return permissionChecker.getSDKAppID(((String) obj).intern());
    }

    protected final boolean ChallengeResultCancelled() {
        int i11 = BuildConfig;
        ChallengeResult = (i11 + 89) % 128;
        TelephonyManager telephonyManager = this.getSDKReferenceNumber;
        if (telephonyManager == null) {
            int i12 = i11 + 55;
            ChallengeResult = i12 % 128;
            if (i12 % 2 != 0) {
                return false;
            }
            throw null;
        }
        ChallengeResult = (i11 + 57) % 128;
        if (telephonyManager.getPhoneType() != 2) {
            return false;
        }
        int i13 = ChallengeResult + 5;
        BuildConfig = i13 % 128;
        return i13 % 2 == 0;
    }

    protected final boolean ChallengeResultCompleted() throws Throwable {
        PermissionChecker permissionChecker;
        Object obj;
        int i11 = BuildConfig + 107;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            permissionChecker = this.getSDKAppID;
            Object[] objArr = new Object[1];
            c(44 << (PointF.length(1.0f, 1.0f) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(1.0f, 1.0f) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 105 % TextUtils.lastIndexOf("", (char) 15, 0, 1), (char) (16731 >>> (ViewConfiguration.getLongPressTimeout() - 103)), objArr);
            obj = objArr[0];
        } else {
            permissionChecker = this.getSDKAppID;
            Object[] objArr2 = new Object[1];
            c(46 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 66 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (1229 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr2);
            obj = objArr2[0];
        }
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) obj).intern());
        ChallengeResult = (BuildConfig + 63) % 128;
        return sDKAppID;
    }

    protected final TelephonyManager cF_() {
        int i11 = (BuildConfig + 103) % 128;
        ChallengeResult = i11;
        TelephonyManager telephonyManager = this.getSDKReferenceNumber;
        BuildConfig = (i11 + 9) % 128;
        return telephonyManager;
    }

    protected final boolean getMessageVersion() {
        TelephonyManager telephonyManager = this.getSDKReferenceNumber;
        if (telephonyManager == null || !telephonyManager.hasCarrierPrivileges()) {
            return false;
        }
        ChallengeResult = (BuildConfig + 105) % 128;
        return true;
    }

    protected final boolean getTransactionStatus() {
        return ((Boolean) getDeviceData(new Object[]{this}, -1158112426, 1158112426, System.identityHashCode(this))).booleanValue();
    }

    public InitializeResultSuccess(Application application, PermissionChecker permissionChecker) throws Throwable {
        s.k(application, "");
        s.k(permissionChecker, "");
        this.getDeviceData = application;
        this.getSDKAppID = permissionChecker;
        Object[] objArr = new Object[1];
        c(TextUtils.lastIndexOf("", '0', 0) + 6, ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        this.getSDKReferenceNumber = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
    }
}
