package atd.r;

import android.app.Application;
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
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/UsbMassStorageEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAdditionalDetails extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/UsbMassStorageEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKReferenceNumber = 0;
        getDeviceData = 1;
        getSDKTransactionID();
        new AuthenticationRequestParameters((byte) 0);
        getDeviceData = (getSDKReferenceNumber + 63) % 128;
    }

    public /* synthetic */ getAdditionalDetails(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        char[] cArr;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Object bytes = str2;
        if (str2 != null) {
            $10 = ($11 + 71) % 128;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr2 = getSDKAppID;
        int i16 = 3;
        Class cls3 = Integer.TYPE;
        String str3 = "";
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    int i18 = i17;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                    char[] cArr4 = cArr3;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.getOffsetBefore(str3, 0), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        byte b11 = (byte) ($$b & 3);
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr4[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i17 = i18 + 1;
                    cArr3 = cArr4;
                    i14 = i14;
                    length = length;
                    cArr2 = cArr2;
                    str3 = str3;
                    i15 = i15;
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
        Class<Object> cls5 = cls2;
        String str4 = str3;
        int i19 = i14;
        int i21 = i15;
        char[] cArr5 = new char[i13];
        System.arraycopy(cArr2, i12, cArr5, 0, i13);
        if (bArr != 0) {
            $10 = ($11 + 65) % 128;
            char[] cArr6 = new char[i13];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i22 = challengeResultError.getSDKAppID;
                if (i22 >= i13) {
                    break;
                }
                if (bArr[i22] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr5[i22]), Integer.valueOf(c11)};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(559 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (5487 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), TextUtils.getTrimmedLength(str4) + 23);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr6[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr5 = cArr5;
                    Object[] objArr6 = {Integer.valueOf(cArr5[i22]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(202 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) TextUtils.getTrimmedLength(str4), 24 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr6[i22] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr6[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 855, (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - View.resolveSize(0, 0));
                    byte b15 = (byte) i16;
                    byte b16 = (byte) (b15 - 3);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr5 = cArr5;
                i16 = 3;
            }
            cArr5 = cArr6;
        }
        if (i21 > 0) {
            char[] cArr7 = new char[i13];
            System.arraycopy(cArr5, 0, cArr7, 0, i13);
            int i23 = i13 - i21;
            System.arraycopy(cArr7, 0, cArr5, i23, i21);
            System.arraycopy(cArr7, i21, cArr5, 0, i23);
        }
        if (z11) {
            int i24 = $11 + 45;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                cArr = new char[i13];
                challengeResultError.getSDKAppID = 1;
            } else {
                cArr = new char[i13];
                challengeResultError.getSDKAppID = 0;
            }
            while (true) {
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i13) {
                    break;
                }
                $11 = ($10 + 117) % 128;
                cArr[i25] = cArr5[(i13 - i25) - 1];
                challengeResultError.getSDKAppID = i25 + 1;
            }
            $11 = ($10 + 11) % 128;
            cArr5 = cArr;
        }
        if (i19 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i13) {
                    break;
                }
                int i27 = $11 + 63;
                $10 = i27 % 128;
                if (i27 % 2 != 0) {
                    cArr5[i26] = (char) (cArr5[i26] * iArr[5]);
                    i11 = i26 >> 1;
                } else {
                    cArr5[i26] = (char) (cArr5[i26] - iArr[2]);
                    i11 = i26 + 1;
                }
                challengeResultError.getSDKAppID = i11;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.r.getAdditionalDetails.$$a
            int r6 = r6 * 4
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r1 = r7 + 1
            int r5 = r5 * 2
            int r5 = r5 + 98
            byte[] r1 = new byte[r1]
            r2 = -1
            if (r0 != 0) goto L17
            r3 = r2
            r2 = r0
            r0 = r6
            goto L31
        L17:
            r4 = r6
            r6 = r5
            r5 = r4
        L1a:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            if (r2 != r7) goto L2a
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L2a:
            r3 = r0[r5]
            r4 = r0
            r0 = r5
            r5 = r3
            r3 = r2
            r2 = r4
        L31:
            int r6 = r6 + r5
            int r5 = r0 + 1
            r0 = r2
            r2 = r3
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.getAdditionalDetails.b(short, byte, byte, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKAppID = new char[]{30894, 31009, 31019, 31029, 31023, 31020, 31019, 31008, 31018, 31018, 31008, 31010, 31013, 31018, 31025, 31023, 31027, 31027, 31018, 31020, 31026, 31020, 31021, 31025, 30722, 30798, 30802, 30801};
    }

    static void init$0() {
        $$a = new byte[]{66, 42, -89, -4};
        $$b = 69;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0047 A[PHI: r0
      0x0047: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v12 java.lang.String) binds: [B:8:0x0045, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        String sDKTransactionID;
        Boolean sDKReferenceNumber;
        int i11 = getDeviceData + 105;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{0, 24, 171, 0}, false, objArr);
            sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
            if (sDKTransactionID != null) {
                sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                if (sDKReferenceNumber != null) {
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
            }
        } else {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters2 = this.AuthenticationRequestParameters;
            Object[] objArr2 = new Object[1];
            a("\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{0, 24, 171, 0}, false, objArr2);
            sDKTransactionID = authenticationRequestParameters2.getSDKTransactionID(((String) objArr2[0]).intern());
            if (sDKTransactionID != null) {
                sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
                if (sDKReferenceNumber != null) {
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getDeviceData = (getSDKReferenceNumber + 79) % 128;
        return failure;
    }

    private getAdditionalDetails(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
