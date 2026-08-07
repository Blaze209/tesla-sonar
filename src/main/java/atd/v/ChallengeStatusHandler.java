package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.telephony.cdma.CdmaCellLocation;
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
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultRate;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusHandler extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsDefaultRate$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private getSDKReferenceNumber() {
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getScrollBarSize();
        ExpandableListView.getPackedPositionGroup(0L);
        ViewConfiguration.getGlobalActionKeyTimeout();
        new getSDKReferenceNumber((byte) 0);
        getSDKReferenceNumber = (getSDKTransactionID + 95) % 128;
    }

    public /* synthetic */ ChallengeStatusHandler(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = new char[]{28013, 8707, 62390, 33548, 20677, 57434, 45547, 16762, 5660, 42923, 30497, 1276, 54339, 26094, 13673, 51726, '9', 20262, 40604, 60931};
        getDeviceData = -1795013383005122794L;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e4  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        Object method;
        int i13 = i12;
        atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
        long[] jArr = new long[i13];
        int i14 = 0;
        buildConfig.getDeviceData = 0;
        while (true) {
            int i15 = buildConfig.getDeviceData;
            if (i15 >= i13) {
                break;
            }
            int i16 = $10 + 17;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            Class cls = Integer.TYPE;
            if (i17 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(AuthenticationRequestParameters[i11 % i15])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(1019086628);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) View.MeasureSpec.getMode(i14), 32 - (ViewConfiguration.getScrollBarSize() >> 8));
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(1019086628, method);
                    }
                    Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                    l11.longValue();
                    Object[] objArr4 = {l11, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getDeviceData), Integer.valueOf(c11)};
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(441 - TextUtils.indexOf("", ""), (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 37);
                        Class cls4 = Long.TYPE;
                        method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                        map.put(-1106061844, method2);
                    }
                    jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {buildConfig, buildConfig};
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(0) + 1919, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 29 - View.combineMeasuredStates(0, 0));
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
                Object[] objArr7 = {Integer.valueOf(AuthenticationRequestParameters[i11 + i15])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1019086628);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-16777184) - Color.rgb(0, 0, 0));
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
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getMode(0) + 441, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) + 38);
                    Class cls8 = Long.TYPE;
                    method5 = cls7.getMethod("n", cls8, cls8, cls8, cls);
                    map2.put(-1106061844, method5);
                }
                jArr[i15] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {buildConfig, buildConfig};
                Object method6 = map2.get(1947342796);
                if (method6 == null) {
                    Class cls9 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (KeyEvent.getMaxKeyCode() >> 16), (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 29);
                    byte b17 = (byte) ($$b & 7);
                    byte b18 = (byte) (b17 - 1);
                    Object[] objArr11 = new Object[1];
                    b(b17, b18, b18, objArr11);
                    method6 = cls9.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1947342796, method6);
                }
                ((Method) method6).invoke(null, objArr10);
            }
            i13 = i12;
            jArr = jArr;
            i14 = 0;
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
            int i18 = buildConfig.getDeviceData;
            if (i18 >= i13) {
                objArr[0] = new String(cArr);
                return;
            }
            $10 = ($11 + 87) % 128;
            cArr[i18] = (char) jArr2[i18];
            Object[] objArr12 = {buildConfig, buildConfig};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method7 = map3.get(1947342796);
            if (method7 == null) {
                Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + 1919, (char) Drawable.resolveOpacity(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 29);
                byte b19 = (byte) ($$b & 7);
                byte b21 = (byte) (b19 - 1);
                Object[] objArr13 = new Object[1];
                b(b19, b21, b21, objArr13);
                method7 = cls10.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1947342796, method7);
            }
            ((Method) method7).invoke(null, objArr12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.v.ChallengeStatusHandler.$$a
            int r7 = r7 * 3
            int r1 = r7 + 1
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r6 = r6 * 5
            int r6 = r6 + 108
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r7
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L30:
            int r0 = r0 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.ChallengeStatusHandler.b(byte, byte, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{8, 93, 113, 60};
        $$b = 9;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        getSDKReferenceNumber = (getSDKTransactionID + 69) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a((char) ((KeyEvent.getMaxKeyCode() >> 16) + 28001), View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 17, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getSDKReferenceNumber = (getSDKTransactionID + 67) % 128;
            Integer numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID);
            if (numAuthenticationRequestParameters != null) {
                int i11 = getSDKTransactionID + 113;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 != 0) {
                    return DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
                }
                DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private ChallengeStatusHandler(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
