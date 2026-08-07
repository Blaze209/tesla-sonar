package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilityDisplayInversionEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AccessibilityDisplayInversionEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private getSDKTransactionID() {
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKReferenceNumber();
        new getSDKTransactionID((byte) 0);
        getSDKAppID = (getDeviceData + 3) % 128;
    }

    public /* synthetic */ AuthenticationRequestParameters(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Integer num = -399400818;
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr = getSDKReferenceNumber;
        Class cls3 = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    int i17 = i16;
                    Object[] objArr2 = {Integer.valueOf(cArr[i16])};
                    int i18 = length;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2314 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        byte b11 = (byte) ($$b - 3);
                        byte b12 = (byte) (b11 + 2);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 3), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16 = i17 + 1;
                    length = i18;
                    i14 = i14;
                    cArr = cArr;
                    cArr2 = cArr2;
                    i15 = i15;
                    cls2 = cls2;
                    num = num;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Class<Object> cls5 = cls2;
        Integer num2 = num;
        int i19 = i14;
        int i21 = i15;
        char[] cArr3 = new char[i13];
        System.arraycopy(cArr, i12, cArr3, 0, i13);
        if (bArr != 0) {
            $10 = ($11 + 53) % 128;
            char[] cArr4 = new char[i13];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i22 = challengeResultError.getSDKAppID;
                if (i22 >= i13) {
                    break;
                }
                $11 = ($10 + 71) % 128;
                if (bArr[i22] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c11)};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0', 0, 0) + 559, (char) (5485 - ImageFormat.getBitsPerPixel(0)), 24 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        int i23 = $$b;
                        byte b13 = (byte) (i23 - 3);
                        byte b14 = (byte) i23;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 4), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr4[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr3 = cArr3;
                    Object[] objArr6 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - ExpandableListView.getPackedPositionGroup(0L), (char) Color.green(0), Gravity.getAbsoluteGravity(0, 0) + 24)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr4[i22] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                char c12 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Integer num3 = num2;
                Object method4 = map4.get(num3);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 853, (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25);
                    byte b15 = (byte) ($$b - 3);
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(num3, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                num2 = num3;
                cls5 = cls;
                cArr3 = cArr3;
                c11 = c12;
            }
            cArr3 = cArr4;
        }
        if (i21 > 0) {
            int i24 = $11 + 7;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                char[] cArr5 = new char[i13];
                i11 = 0;
                System.arraycopy(cArr3, 1, cArr5, 0, i13);
                System.arraycopy(cArr5, 0, cArr3, i13 - i21, i21);
                System.arraycopy(cArr5, i21, cArr3, 1, i13 >>> i21);
            } else {
                i11 = 0;
                char[] cArr6 = new char[i13];
                System.arraycopy(cArr3, 0, cArr6, 0, i13);
                int i25 = i13 - i21;
                System.arraycopy(cArr6, 0, cArr3, i25, i21);
                System.arraycopy(cArr6, i21, cArr3, 0, i25);
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr7 = new char[i13];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i13) {
                    break;
                }
                cArr7[i26] = cArr3[(i13 - i26) - 1];
                challengeResultError.getSDKAppID = i26 + 1;
            }
            $11 = ($10 + 63) % 128;
            cArr3 = cArr7;
        }
        if (i19 > 0) {
            $10 = ($11 + 61) % 128;
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i13) {
                    break;
                }
                cArr3[i27] = (char) (cArr3[i27] - iArr[2]);
                challengeResultError.getSDKAppID = i27 + 1;
            }
        }
        String str3 = new String(cArr3);
        $11 = ($10 + 21) % 128;
        objArr[0] = str3;
    }

    private static void b(int i11, byte b11, short s11, Object[] objArr) {
        int i12 = s11 + 4;
        byte[] bArr = $$a;
        int i13 = i11 * 2;
        int i14 = 104 - (b11 * 2);
        byte[] bArr2 = new byte[1 - i13];
        int i15 = 0 - i13;
        int i16 = -1;
        if (bArr == null) {
            i14 = i15 + (-i12);
            i12 = i12;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i14;
            if (i17 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i18 = i12 + 1;
            byte[] bArr3 = bArr;
            i14 += -bArr[i18];
            i12 = i18;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static void getSDKReferenceNumber() {
        getSDKReferenceNumber = new char[]{30732, 30810, 30806, 30809, 30815, 30809, 30807, 30812, 30808, 30800, 30802, 30800, 30796, 30805, 30803, 30796, 30805, 30810, 30802, 30803, 30808, 30800, 30799, 30800, 30808, 30815, 30802, 30792, 30800, 30804, 30804, 30811, 30811, 30800, 30797, 30802, 30810, 30813, 30812, 30743, 30836, 30843, 30841};
    }

    static void init$0() {
        $$a = new byte[]{32, 120, 5, 50};
        $$b = 3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051  */
    /* JADX WARN: Code duplicated, block: B:14:0x005b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0045 A[PHI: r0
      0x0045: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v14 java.lang.String) binds: [B:8:0x0043, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        return com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m14boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m15constructorimpl(r0.booleanValue()));
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getDeviceData() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.v.AuthenticationRequestParameters.getSDKAppID
            int r0 = r0 + 113
            int r1 = r0 % 128
            atd.v.AuthenticationRequestParameters.getDeviceData = r1
            int r0 = r0 % 2
            r1 = 39
            java.lang.String r2 = "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2c
            atd.q.AuthenticationRequestParameters r0 = r6.AuthenticationRequestParameters
            int[] r1 = new int[]{r4, r1, r4, r4}
            java.lang.Object[] r3 = new java.lang.Object[r3]
            a(r2, r1, r4, r3)
            r1 = r3[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L6e
            goto L45
        L2c:
            atd.q.AuthenticationRequestParameters r0 = r6.AuthenticationRequestParameters
            int[] r1 = new int[]{r4, r1, r4, r4}
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r2, r1, r3, r5)
            r1 = r5[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L6e
        L45:
            int r1 = atd.v.AuthenticationRequestParameters.getDeviceData
            int r1 = r1 + 3
            int r2 = r1 % 128
            atd.v.AuthenticationRequestParameters.getSDKAppID = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L5b
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(r0)
            r1 = 82
            int r1 = r1 / r4
            if (r0 == 0) goto L6e
            goto L61
        L5b:
            java.lang.Boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(r0)
            if (r0 == 0) goto L6e
        L61:
            boolean r0 = r0.booleanValue()
            boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m15constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m14boximpl(r0)
            return r0
        L6e:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.AuthenticationRequestParameters.getDeviceData():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    private AuthenticationRequestParameters(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
