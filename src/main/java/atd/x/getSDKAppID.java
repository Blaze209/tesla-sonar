package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/AccelerometerRotation;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/AccelerometerRotation$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private AuthenticationRequestParameters() {
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        getSDKTransactionID();
        View.resolveSizeAndState(0, 0, 0);
        View.getDefaultSize(0, 0);
        AndroidCharacter.getMirror('0');
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKTransactionID + 9;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getSDKAppID(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x021b  */
    /* JADX WARN: Code duplicated, block: B:48:0x021c  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13;
        atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
        long[] jArr = new long[i12];
        int i14 = 0;
        buildConfig.getDeviceData = 0;
        $10 = ($11 + 91) % 128;
        while (true) {
            int i15 = buildConfig.getDeviceData;
            if (i15 >= i12) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(AuthenticationRequestParameters[i11 + i15])};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(1019086628);
                Class cls = Integer.TYPE;
                if (method != null) {
                    i13 = i14;
                } else {
                    Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 1774, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 32 - View.MeasureSpec.makeMeasureSpec(i14, i14));
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
                long j12 = getSDKAppID;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c11);
                objArr4[2] = Long.valueOf(j12);
                objArr4[1] = Long.valueOf(j11);
                objArr4[i13] = l11;
                Object method2 = map.get(-1106061844);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(441 - Color.alpha(i13), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 37 - ExpandableListView.getPackedPositionType(0L));
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
                    int i16 = i13;
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 1920, (char) TextUtils.getOffsetAfter("", i16), Color.alpha(i16) + 29);
                    byte b13 = (byte) i16;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 + 1), objArr6);
                    method3 = cls5.getMethod((String) objArr6[i16], Object.class, Object.class);
                    map.put(1947342796, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                jArr = jArr;
                i14 = 0;
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
        char[] cArr = new char[i12];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i17 = buildConfig.getDeviceData;
            if (i17 >= i12) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = $11 + 13;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr[i17] = (char) jArr2[i17];
                Object[] objArr7 = {buildConfig, buildConfig};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1947342796);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1918, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 29 - View.MeasureSpec.getSize(0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 + 1), objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(1947342796, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                throw null;
            }
            cArr[i17] = (char) jArr2[i17];
            Object[] objArr9 = {buildConfig, buildConfig};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method5 = map3.get(1947342796);
            if (method5 == null) {
                Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1919, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 28 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                byte b17 = (byte) 0;
                byte b18 = b17;
                Object[] objArr10 = new Object[1];
                b(b17, b18, (byte) (b18 + 1), objArr10);
                method5 = cls7.getMethod((String) objArr10[0], Object.class, Object.class);
                map3.put(1947342796, method5);
            }
            ((Method) method5).invoke(null, objArr9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r8 = r8 * 5
            int r8 = r8 + 108
            int r7 = r7 * 2
            int r0 = 1 - r7
            byte[] r1 = atd.x.getSDKAppID.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r1
            r4 = r2
            r1 = r7
            goto L32
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L32:
            int r8 = -r8
            int r8 = r8 + r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKAppID.b(byte, byte, byte, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = new char[]{25, 31393, 62831, 28723, 60156, 26047, 57430, 23297, 54725, 20631, 52040, 17891, 49330, 15189, 46630, 12529, 43948, 9795, 41240, 7135, 38559, 4436, 13378, 20105, 49486, 17428};
        getSDKAppID = 8113867770351352514L;
    }

    static void init$0() {
        $$a = new byte[]{36, -126, -49, 85};
        $$b = 113;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getDeviceData;
        Object[] objArr = new Object[1];
        a((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), ViewConfiguration.getTouchSlop() >> 8, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getSDKReferenceNumber = (getSDKTransactionID + 105) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                getSDKReferenceNumber = (getSDKTransactionID + 83) % 128;
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private getSDKAppID(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getDeviceData = authenticationRequestParameters;
    }
}
