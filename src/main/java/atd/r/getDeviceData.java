package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AdbEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKAppID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AdbEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        AuthenticationRequestParameters = 1;
        AuthenticationRequestParameters();
        ExpandableListView.getPackedPositionType(0L);
        new getSDKReferenceNumber((byte) 0);
        int i11 = AuthenticationRequestParameters + 111;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getDeviceData(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = 4343423204041944057L;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        Object method;
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
            $10 = ($11 + 23) % 128;
            char c11 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(962978490);
                if (obj != null) {
                    i12 = i13;
                    method = obj;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(689 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (16022 - KeyEvent.normalizeMetaState(i13)), 32 - ((Process.getThreadPriority(i13) + 20) >> 6));
                    byte b11 = (byte) i13;
                    byte b12 = b11;
                    i12 = i13;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getDeviceData ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i15 = i12;
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - Color.green(i12), (char) (TextUtils.indexOf("", "", i15, i15) + 29017), Color.argb(i15, i15, i15, i15) + 24)).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                jArr = jArr;
                i13 = 0;
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
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = $10 + 93;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr[i16] = (char) jArr2[i16];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - TextUtils.getOffsetAfter("", 0), (char) (ImageFormat.getBitsPerPixel(0) + 29018), 24 - TextUtils.getCapsMode("", 0, 0))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                throw null;
            }
            cArr[i16] = (char) jArr2[i16];
            Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method4 = map3.get(-46730980);
            if (method4 == null) {
                method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 416, (char) (29018 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), Color.blue(0) + 24)).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method4);
            }
            ((Method) method4).invoke(null, objArr6);
        }
    }

    private static void b(byte b11, byte b12, short s11, Object[] objArr) {
        int i11 = (b12 * 3) + 118;
        int i12 = s11 * 2;
        int i13 = (b11 * 3) + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i12 + 1];
        int i14 = -1;
        if (bArr == null) {
            i13++;
            i11 = i13 + (-i11);
        }
        while (true) {
            i14++;
            bArr2[i14] = (byte) i11;
            if (i14 == i12) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i13++;
                i11 += -bArr[i13];
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{77, -102, -36, 111};
        $$b = 78;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    /* JADX WARN: Code duplicated, block: B:9:0x0051 A[PHI: r0
      0x0051: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v12 java.lang.String) binds: [B:8:0x004f, B:5:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        String sDKTransactionID;
        Boolean sDKReferenceNumber;
        int i11 = getSDKTransactionID + 89;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
            Object[] objArr = new Object[1];
            a("㸦㊐❃᠁೮Ŗ爔曀害䱩䃝", 16564 << (ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)), objArr);
            sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
            if (sDKTransactionID != null) {
                sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                if (sDKReferenceNumber != null) {
                    getSDKTransactionID = (AuthenticationRequestParameters + 43) % 128;
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
            }
        } else {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters2 = this.getSDKAppID;
            Object[] objArr2 = new Object[1];
            a("㸦㊐❃᠁೮Ŗ爔曀害䱩䃝", 3252 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
            sDKTransactionID = authenticationRequestParameters2.getSDKTransactionID(((String) objArr2[0]).intern());
            if (sDKTransactionID != null) {
                sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                if (sDKReferenceNumber != null) {
                    getSDKTransactionID = (AuthenticationRequestParameters + 43) % 128;
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private getDeviceData(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKAppID = authenticationRequestParameters;
    }
}
