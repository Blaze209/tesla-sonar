package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilitySpeakPassword;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static char[] getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilitySpeakPassword$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getSDKTransactionID();
        new getDeviceData((byte) 0);
        getSDKAppID = (getSDKReferenceNumber + 119) % 128;
    }

    public /* synthetic */ getSDKTransactionID(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        byte b11;
        char[] cArr;
        char c11;
        long j11;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr2 = getSDKTransactionID;
        Class cls3 = Integer.TYPE;
        int i17 = 2;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            while (i12 < length) {
                try {
                    byte[] bArr2 = bArr;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                    int i18 = i12;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.argb(0, 0, 0, 0) + 2313, (char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24);
                        byte b12 = (byte) (-1);
                        byte b13 = (byte) (b12 + 3);
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, (byte) (b13 - 2), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr3[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12 = i18 + 1;
                    bArr = bArr2;
                    cArr3 = cArr3;
                    length = length;
                    i15 = i15;
                    cArr2 = cArr2;
                    i16 = i16;
                    cls2 = cls2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i19 = i15;
        int i21 = i16;
        char[] cArr4 = new char[i14];
        System.arraycopy(cArr2, i13, cArr4, 0, i14);
        if (bArr3 != null) {
            int i22 = $10 + 15;
            $11 = i22 % 128;
            if (i22 % 2 == 0) {
                cArr = new char[i14];
                b11 = 1;
                challengeResultError.getSDKAppID = 1;
                c11 = 1;
            } else {
                b11 = 1;
                cArr = new char[i14];
                challengeResultError.getSDKAppID = 0;
                c11 = 0;
            }
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i14) {
                    break;
                }
                if (bArr3[i23] == b11) {
                    char c12 = cArr4[i23];
                    j11 = 0;
                    Object[] objArr4 = new Object[i17];
                    objArr4[b11] = Integer.valueOf(c11);
                    objArr4[0] = Integer.valueOf(c12);
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(557 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (5486 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 23);
                        byte b14 = (byte) (-1);
                        byte b15 = (byte) (b14 + 4);
                        Object[] objArr5 = new Object[1];
                        b(b14, b15, (byte) (b15 - 3), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr[i23] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    j11 = 0;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i23]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 200, (char) Color.red(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 24)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr[i23] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 854, (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1))), 24 - KeyEvent.normalizeMetaState(0));
                    byte b16 = (byte) (-1);
                    byte b17 = (byte) (b16 + 1);
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, b17, objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr4 = cArr4;
                i17 = 2;
                b11 = 1;
            }
            $10 = ($11 + 95) % 128;
            cArr4 = cArr;
        }
        if (i21 > 0) {
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i14);
            int i24 = i14 - i21;
            System.arraycopy(cArr5, 0, cArr4, i24, i21);
            System.arraycopy(cArr5, i21, cArr4, 0, i24);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i14];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i14) {
                    break;
                }
                cArr6[i25] = cArr4[(i14 - i25) - 1];
                challengeResultError.getSDKAppID = i25 + 1;
            }
            cArr4 = cArr6;
        }
        if (i19 > 0) {
            int i26 = $11 + 109;
            $10 = i26 % 128;
            int i27 = i26 % 2;
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i28 = challengeResultError.getSDKAppID;
                if (i28 >= i14) {
                    break;
                }
                cArr4[i28] = (char) (cArr4[i28] - iArr[2]);
                challengeResultError.getSDKAppID = i28 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 104 - r7
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = atd.v.getSDKTransactionID.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r8
            goto L30
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r1
            r1 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r7 = r7 + r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.getSDKTransactionID.b(int, int, int, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = new char[]{30727, 30799, 30804, 30813, 30808, 30811, 30809, 30806, 30804, 30797, 30795, 30797, 30798, 30805, 30895, 30894, 30900, 30885};
    }

    static void init$0() {
        $$a = new byte[]{67, 74, -88, -74};
        $$b = 94;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m14boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m15constructorimpl(r0.booleanValue()));
        atd.v.getSDKTransactionID.getSDKReferenceNumber = (atd.v.getSDKTransactionID.getSDKAppID + 41) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r0 != null) goto L11;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getDeviceData() throws java.lang.Throwable {
        /*
            r5 = this;
            atd.q.AuthenticationRequestParameters r0 = r5.AuthenticationRequestParameters
            r1 = 14
            r2 = 0
            int[] r1 = new int[]{r2, r1, r2, r2}
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000"
            a(r4, r1, r2, r3)
            r1 = r3[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L50
            int r1 = atd.v.getSDKTransactionID.getSDKReferenceNumber
            int r1 = r1 + 103
            int r3 = r1 % 128
            atd.v.getSDKTransactionID.getSDKAppID = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L35
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(r0)
            r1 = 89
            int r1 = r1 / r2
            if (r0 == 0) goto L50
            goto L3b
        L35:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(r0)
            if (r0 == 0) goto L50
        L3b:
            boolean r0 = r0.booleanValue()
            boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m15constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m14boximpl(r0)
            int r1 = atd.v.getSDKTransactionID.getSDKAppID
            int r1 = r1 + 41
            int r1 = r1 % 128
            atd.v.getSDKTransactionID.getSDKReferenceNumber = r1
            return r0
        L50:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.getSDKTransactionID.getDeviceData():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    private getSDKTransactionID(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
