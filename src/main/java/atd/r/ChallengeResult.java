package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DeviceProvisioned;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResult extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static long getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/DeviceProvisioned$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKAppID = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID();
        TextUtils.indexOf("", "", 0);
        TypedValue.complexToFloat(0);
        Color.green(0);
        new getSDKReferenceNumber((byte) 0);
        getSDKAppID = (AuthenticationRequestParameters + 59) % 128;
    }

    public /* synthetic */ ChallengeResult(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x02e3  */
    private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
        CharSequence charSequence;
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
            int i16 = $10 + 125;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i17 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(getDeviceData[i11 >>> i15])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(1019086628);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1775 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i14) == 0L ? 0 : -1)), (Process.myTid() >> 22) + 32);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(1019086628, method);
                    }
                    Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                    l11.longValue();
                    Object[] objArr4 = {l11, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getSDKReferenceNumber), Integer.valueOf(c11)};
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 440, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 37)).getMethod("n", cls, cls, cls, cls2);
                        map.put(-1106061844, method2);
                    }
                    jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {buildConfig, buildConfig};
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 1920, (char) (Process.myPid() >> 22), 29 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, b14, objArr6);
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
                Object[] objArr7 = {Integer.valueOf(getDeviceData[i11 + i15])};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1019086628);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1774 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) KeyEvent.normalizeMetaState(0), 32 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 + 1), objArr8);
                    method4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(1019086628, method4);
                }
                Long l12 = (Long) ((Method) method4).invoke(null, objArr7);
                l12.longValue();
                Object[] objArr9 = {l12, Long.valueOf(buildConfig.getDeviceData), Long.valueOf(getSDKReferenceNumber), Integer.valueOf(c11)};
                Object method5 = map2.get(-1106061844);
                if (method5 == null) {
                    method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(442 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 37 - View.MeasureSpec.getSize(0))).getMethod("n", cls, cls, cls, cls2);
                    map2.put(-1106061844, method5);
                }
                jArr[i15] = ((Long) ((Method) method5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {buildConfig, buildConfig};
                Object method6 = map2.get(1947342796);
                if (method6 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - (TypedValue.complexToFloat(0) > r7 ? 1 : (TypedValue.complexToFloat(0) == r7 ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > 0 ? 1 : (AudioTrack.getMinVolume() == 0 ? 0 : -1)) + 29);
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr11 = new Object[1];
                    b(b17, b18, b18, objArr11);
                    method6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
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
        CharSequence charSequence2 = "";
        char[] cArr = new char[i13];
        buildConfig.getDeviceData = 0;
        while (true) {
            int i18 = buildConfig.getDeviceData;
            if (i18 >= i13) {
                break;
            }
            cArr[i18] = (char) jArr2[i18];
            Object[] objArr12 = {buildConfig, buildConfig};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method7 = map3.get(1947342796);
            if (method7 != null) {
                charSequence = charSequence2;
            } else {
                charSequence = charSequence2;
                Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - ExpandableListView.getPackedPositionType(0L), (char) (KeyEvent.getMaxKeyCode() >> 16), 28 - TextUtils.indexOf(charSequence, '0', 0));
                byte b19 = (byte) 0;
                byte b21 = b19;
                Object[] objArr13 = new Object[1];
                b(b19, b21, b21, objArr13);
                method7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1947342796, method7);
            }
            ((Method) method7).invoke(null, objArr12);
            charSequence2 = charSequence;
        }
        String str = new String(cArr);
        int i19 = $11 + 89;
        $10 = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void b(short s11, int i11, int i12, Object[] objArr) {
        int i13 = s11 * 4;
        byte[] bArr = $$a;
        int i14 = 113 - (i12 * 5);
        int i15 = (i11 * 2) + 4;
        byte[] bArr2 = new byte[i13 + 1];
        int i16 = -1;
        if (bArr == null) {
            i14 = i13 + i14;
            i15++;
        }
        while (true) {
            i16++;
            bArr2[i16] = (byte) i14;
            if (i16 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i14 += bArr[i15];
                i15++;
            }
        }
    }

    static void getSDKTransactionID() {
        getDeviceData = new char[]{23523, 60049, 14615, 20407, 40488, 11485, 29546, 33234, 53357, 26339, 46479, 50207, 2704, 22841, 61346, 15956, 19666, 37696, '9', 45371, 25257, 5139};
        getSDKReferenceNumber = 1542718704567169291L;
    }

    static void init$0() {
        $$a = new byte[]{55, -88, -54, 122};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0079  */
    /* JADX WARN: Code duplicated, block: B:13:0x007f  */
    /* JADX WARN: Code duplicated, block: B:15:0x008b  */
    /* JADX WARN: Code duplicated, block: B:17:0x009b  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:9:0x006d A[PHI: r0
      0x006d: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v16 java.lang.String) binds: [B:8:0x006b, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        String sDKTransactionID;
        int i11;
        Boolean sDKReferenceNumber;
        int i12;
        int i13 = AuthenticationRequestParameters + 87;
        getSDKAppID = i13 % 128;
        if (i13 % 2 != 0) {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKTransactionID;
            Object[] objArr = new Object[1];
            a((char) (8386 - (Process.myPid() % 34)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, 94 - (ViewConfiguration.getScrollBarFadeDuration() + 92), objArr);
            sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
            if (sDKTransactionID != null) {
                i11 = AuthenticationRequestParameters + 27;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                    throw null;
                }
                sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                if (sDKReferenceNumber != null) {
                    i12 = getSDKAppID + 23;
                    AuthenticationRequestParameters = i12 % 128;
                    if (i12 % 2 == 0) {
                        return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                    }
                    int i14 = 65 / 0;
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
            }
        } else {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters2 = this.getSDKTransactionID;
            Object[] objArr2 = new Object[1];
            a((char) ((Process.myPid() >> 22) + 23551), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, objArr2);
            sDKTransactionID = authenticationRequestParameters2.getSDKTransactionID(((String) objArr2[0]).intern());
            if (sDKTransactionID != null) {
                i11 = AuthenticationRequestParameters + 27;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                    throw null;
                }
                sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                if (sDKReferenceNumber != null) {
                    i12 = getSDKAppID + 23;
                    AuthenticationRequestParameters = i12 % 128;
                    if (i12 % 2 == 0) {
                        return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                    }
                    int i15 = 65 / 0;
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private ChallengeResult(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKTransactionID = authenticationRequestParameters;
    }
}
