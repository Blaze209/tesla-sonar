package atd.as;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.BuildConfig;
import ch.qos.logback.core.CoreConstants;
import com.adyen.threeds2.Warning;
import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/adyen/threeds2/internal/security/SecurityChecks;", "", "Landroid/content/Context;", "applicationContext", "Lcom/adyen/threeds2/parameters/ConfigParameters;", "configParameters", "Lcom/adyen/threeds2/internal/security/checker/SecurityChecker;", "securityChecker", "<init>", "(Landroid/content/Context;Lcom/adyen/threeds2/parameters/ConfigParameters;Lcom/adyen/threeds2/internal/security/checker/SecurityChecker;)V", "", "Lcom/adyen/threeds2/Warning;", "getSecurityWarnings", "()Ljava/util/List;", "", "securityWarnings", "Ljava/util/Set;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static long getDeviceData;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    public static final getDeviceData getSDKReferenceNumber;
    private static Set<Warning> getSDKTransactionID;
    private final Set<Warning> AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/adyen/threeds2/internal/security/SecurityChecks$Companion;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/adyen/threeds2/parameters/ConfigParameters;", "configParameters", "Lcom/adyen/threeds2/internal/security/checker/SecurityChecker;", "securityChecker", "Lcom/adyen/threeds2/internal/security/SecurityChecks;", "newInstance", "(Landroid/content/Context;Lcom/adyen/threeds2/parameters/ConfigParameters;Lcom/adyen/threeds2/internal/security/checker/SecurityChecker;)Lcom/adyen/threeds2/internal/security/SecurityChecks;", "", "info", "Ljn0/h0;", "rootCallback", "(J)V", "hookCallback", "debugCallback", "memoryScanningCallback", "emulatorCallback", "virtualEnvironmentCallback", "", "Lcom/adyen/threeds2/Warning;", "raspWarnings", "Ljava/util/Set;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static int getSDKAppID = 1;
        private static int getSDKReferenceNumber;

        private getDeviceData() {
        }

        public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
            Context context = (Context) objArr[0];
            ConfigParameters configParameters = (ConfigParameters) objArr[1];
            atd.ar.getSDKAppID getsdkappid = (atd.ar.getSDKAppID) objArr[2];
            s.k(context, "");
            s.k(configParameters, "");
            s.k(getsdkappid, "");
            Context applicationContext = context.getApplicationContext();
            s.j(applicationContext, "");
            AuthenticationRequestParameters authenticationRequestParameters = new AuthenticationRequestParameters(applicationContext, configParameters, getsdkappid, (byte) 0);
            int i14 = getSDKAppID;
            getSDKReferenceNumber = ((((i14 ^ 121) | (i14 & 121)) << 1) - (((~i14) & 121) | (i14 & (-122)))) % 128;
            return authenticationRequestParameters;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }

        public static AuthenticationRequestParameters AuthenticationRequestParameters(Context context, ConfigParameters configParameters, atd.ar.getSDKAppID getsdkappid) {
            return (AuthenticationRequestParameters) AuthenticationRequestParameters(new Object[]{context, configParameters, getsdkappid}, 180126703, -180126703, (int) System.currentTimeMillis());
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getMessageVersion = 1;
        getSDKAppID();
        getSDKReferenceNumber = new getDeviceData((byte) 0);
        getSDKTransactionID = new LinkedHashSet();
        getMessageVersion = (BuildConfig + 29) % 128;
    }

    private AuthenticationRequestParameters(Context context, ConfigParameters configParameters, atd.ar.getSDKAppID getsdkappid) {
        this.AuthenticationRequestParameters = new LinkedHashSet();
        for (atd.as.getDeviceData getdevicedata : v.p(new getSDKTransactionID(AdyenConfigParameters.getParamValue(configParameters, AdyenConfigParameters.SECURITY_APP_SIGNATURE), AdyenConfigParameters.getParamValues(configParameters, AdyenConfigParameters.SECURITY_TRUSTED_APP_STORES), getsdkappid), new getSDKAppID(getsdkappid), new getSDKReferenceNumber(getsdkappid))) {
            Warning warning = (Warning) atd.as.getDeviceData.getSDKAppID(new Object[]{getdevicedata, context}, -1689566357, 1689566357, System.identityHashCode(getdevicedata));
            if (warning != null) {
                this.AuthenticationRequestParameters.add(warning);
            }
        }
    }

    private static void BuildConfig() throws Throwable {
        int i11 = getMessageVersion + 107;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKReferenceNumber();
            atd.ap.AuthenticationRequestParameters.class.getField("getSDKReferenceNumber").get(null);
            throw null;
        }
        Set sDKReferenceNumber = getSDKReferenceNumber();
        Object obj = atd.ap.AuthenticationRequestParameters.class.getField("getSDKReferenceNumber").get(null);
        getMessageVersion = (BuildConfig + 13) % 128;
        try {
            Object[] objArr = new Object[1];
            a((char) (TextUtils.getOffsetAfter("", 0) + 46628), ViewConfiguration.getFadingEdgeLength() >> 16, View.combineMeasuredStates(0, 0) + 3, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static void ChallengeResult() throws Throwable {
        int i11 = BuildConfig + 105;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            getSDKReferenceNumber();
            atd.ap.getDeviceData.class.getField("getSDKAppID").get(null);
            throw null;
        }
        Set sDKReferenceNumber = getSDKReferenceNumber();
        try {
            Object[] objArr = {atd.ap.getDeviceData.class.getField("getSDKAppID").get(null)};
            Object[] objArr2 = new Object[1];
            a((char) (TextUtils.getTrimmedLength("") + 46628), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, 4 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr2);
            int i12 = getMessageVersion + 37;
            BuildConfig = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static void ChallengeResultCancelled() throws Throwable {
        int i11 = BuildConfig + 77;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            getSDKReferenceNumber();
            atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null);
            throw null;
        }
        Set sDKReferenceNumber = getSDKReferenceNumber();
        try {
            Object[] objArr = {atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null)};
            Object[] objArr2 = new Object[1];
            a((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 46628), TextUtils.getOffsetBefore("", 0), 3 - Color.blue(0), objArr2);
            int i12 = BuildConfig + 81;
            getMessageVersion = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 57 / 0;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x033c  */
    /* JADX WARN: Code duplicated, block: B:68:0x033d  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        Object method;
        BuildConfig buildConfig = new BuildConfig();
        long[] jArr = new long[i12];
        int i14 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i15 = buildConfig.getDeviceData;
            if (i15 >= i12) {
                break;
            }
            int i16 = $11 + 13;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            Class cls = Integer.TYPE;
            if (i17 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(getSDKAppID[i11 + i15])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(1019086628);
                    if (obj != null) {
                        i13 = i14;
                        method = obj;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(i14, i14, i14) + 1774, (char) (TextUtils.indexOf((CharSequence) "", '0', i14, i14) + 1), 32 - ExpandableListView.getPackedPositionType(0L));
                        byte b11 = (byte) i14;
                        byte b12 = b11;
                        i13 = i14;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i13], cls);
                        map.put(1019086628, method);
                    }
                    Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                    l11.longValue();
                    long j11 = buildConfig.getDeviceData;
                    long j12 = getDeviceData;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c11);
                    objArr4[2] = Long.valueOf(j12);
                    objArr4[1] = Long.valueOf(j11);
                    objArr4[i13] = l11;
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 441, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 37);
                        Class cls4 = Long.TYPE;
                        method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                        map.put(-1106061844, method2);
                    }
                    jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = new Object[2];
                    objArr5[1] = buildConfig;
                    objArr5[i13] = buildConfig;
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        int i18 = i13;
                        Class cls5 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(i18, i18) + 1919, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i18) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i18) == 0.0d ? 0 : -1)), 29 - (ViewConfiguration.getLongPressTimeout() >> 16));
                        byte b13 = (byte) ($$b & 7);
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, b14, objArr6);
                        method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
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
                Object[] objArr7 = {Integer.valueOf(getSDKAppID[i11 + i15])};
                Map map2 = getMessageVersion.timedout;
                Object method4 = map2.get(1019086628);
                if (method4 == null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1774 - View.getDefaultSize(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 32);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], cls);
                    map2.put(1019086628, method4);
                }
                Long l12 = (Long) ((Method) method4).invoke(null, objArr7);
                l12.longValue();
                Object[] objArr9 = {l12, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getDeviceData), Integer.valueOf(c11)};
                Object method5 = map2.get(-1106061844);
                if (method5 == null) {
                    Class cls7 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 441, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) + 38);
                    Class cls8 = Long.TYPE;
                    method5 = cls7.getMethod("n", cls8, cls8, cls8, cls);
                    map2.put(-1106061844, method5);
                }
                jArr[i15] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {buildConfig, buildConfig};
                Object method6 = map2.get(1947342796);
                if (method6 == null) {
                    Class cls9 = (Class) getMessageVersion.getSDKTransactionID((Process.myPid() >> 22) + 1919, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 30);
                    byte b17 = (byte) ($$b & 7);
                    byte b18 = (byte) (b17 - 1);
                    Object[] objArr11 = new Object[1];
                    b(b17, b18, b18, objArr11);
                    method6 = cls9.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1947342796, method6);
                }
                ((Method) method6).invoke(null, objArr10);
            }
            jArr = jArr;
            i14 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[i12];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i19 = buildConfig.getDeviceData;
            if (i19 >= i12) {
                objArr[0] = new String(cArr);
                return;
            }
            int i21 = $10 + 11;
            $11 = i21 % 128;
            if (i21 % 2 == 0) {
                cArr[i19] = (char) jArr2[i19];
                Object[] objArr12 = {buildConfig, buildConfig};
                Map map3 = getMessageVersion.timedout;
                Object method7 = map3.get(1947342796);
                if (method7 == null) {
                    Class cls10 = (Class) getMessageVersion.getSDKTransactionID(1919 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) TextUtils.indexOf("", "", 0, 0), 28 - TextUtils.lastIndexOf("", '0'));
                    byte b19 = (byte) ($$b & 7);
                    byte b21 = (byte) (b19 - 1);
                    Object[] objArr13 = new Object[1];
                    b(b19, b21, b21, objArr13);
                    method7 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                    map3.put(1947342796, method7);
                }
                ((Method) method7).invoke(null, objArr12);
                int i22 = 53 / 0;
            } else {
                cArr[i19] = (char) jArr2[i19];
                Object[] objArr14 = {buildConfig, buildConfig};
                Map map4 = getMessageVersion.timedout;
                Object method8 = map4.get(1947342796);
                if (method8 == null) {
                    Class cls11 = (Class) getMessageVersion.getSDKTransactionID(1919 - View.getDefaultSize(0, 0), (char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 29);
                    byte b22 = (byte) ($$b & 7);
                    byte b23 = (byte) (b22 - 1);
                    Object[] objArr15 = new Object[1];
                    b(b22, b23, b23, objArr15);
                    method8 = cls11.getMethod((String) objArr15[0], Object.class, Object.class);
                    map4.put(1947342796, method8);
                }
                ((Method) method8).invoke(null, objArr14);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = atd.as.AuthenticationRequestParameters.$$a
            int r5 = r5 * 5
            int r5 = r5 + 108
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r4 = r5
            r5 = r7
            r3 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L29:
            r4 = r1[r6]
            int r3 = r3 + 1
        L2d:
            int r5 = r5 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.AuthenticationRequestParameters.b(byte, byte, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
        return AuthenticationRequestParameters(objArr);
    }

    static void getSDKAppID() {
        getSDKAppID = new char[]{46653, 8297, 39578};
        getDeviceData = 5561906625000412713L;
    }

    private static void getSDKEphemeralPublicKey() {
        getDeviceData(new Object[0], 1242804423, -1242804423, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ Set getSDKReferenceNumber() {
        int i11 = BuildConfig;
        Set<Warning> set = getSDKTransactionID;
        int i12 = i11 + 37;
        getMessageVersion = i12 % 128;
        if (i12 % 2 != 0) {
            return set;
        }
        throw null;
    }

    private static void getSDKTransactionID() throws Throwable {
        getMessageVersion = (BuildConfig + 7) % 128;
        Set sDKReferenceNumber = getSDKReferenceNumber();
        Object obj = atd.ap.getDeviceData.class.getField("getSDKAppID").get(null);
        getMessageVersion = (BuildConfig + 85) % 128;
        try {
            Object[] objArr = new Object[1];
            a((char) (46627 - MotionEvent.axisFromString("")), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    static void init$0() {
        $$a = new byte[]{30, 69, 82, 95};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE;
    }

    public final List<Warning> AuthenticationRequestParameters() {
        ArrayList arrayList = new ArrayList(d1.n(this.AuthenticationRequestParameters, getSDKTransactionID));
        int i11 = getMessageVersion + 107;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        getMessageVersion = (BuildConfig + 89) % 128;
        Set sDKReferenceNumber = getSDKReferenceNumber();
        Object obj = atd.ap.getSDKTransactionID.class.getField("getDeviceData").get(null);
        getMessageVersion = (BuildConfig + 117) % 128;
        try {
            Object[] objArr2 = new Object[1];
            a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 46627), ViewConfiguration.getMaximumFlingVelocity() >> 16, 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            return null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    private static void getDeviceData() throws Throwable {
        getMessageVersion = (BuildConfig + 29) % 128;
        Set sDKReferenceNumber = getSDKReferenceNumber();
        Object obj = atd.ap.getSDKReferenceNumber.class.getField("AuthenticationRequestParameters").get(null);
        getMessageVersion = (BuildConfig + 25) % 128;
        try {
            Object[] objArr = new Object[1];
            a((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 46628), KeyEvent.getMaxKeyCode() >> 16, (ViewConfiguration.getJumpTapTimeout() >> 16) + 3, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static final AuthenticationRequestParameters getSDKReferenceNumber(Context context, ConfigParameters configParameters, atd.ar.getSDKAppID getsdkappid) {
        int i11 = getMessageVersion + 111;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) getDeviceData.AuthenticationRequestParameters(new Object[]{context, configParameters, getsdkappid}, 180126703, -180126703, (int) System.currentTimeMillis());
        BuildConfig = (getMessageVersion + 61) % 128;
        return authenticationRequestParameters;
    }

    public /* synthetic */ AuthenticationRequestParameters(Context context, ConfigParameters configParameters, atd.ar.getSDKAppID getsdkappid, byte b11) {
        this(context, configParameters, getsdkappid);
    }
}
