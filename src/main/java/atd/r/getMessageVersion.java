package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AutoTimeZone;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMessageVersion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AutoTimeZone$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getDeviceData = 0;
        getSDKAppID = 1;
        getSDKTransactionID();
        new getSDKReferenceNumber((byte) 0);
        getDeviceData = (getSDKAppID + 91) % 128;
    }

    public /* synthetic */ getMessageVersion(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        float f11;
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
            int i16 = $11;
            f11 = BitmapDescriptorFactory.HUE_RED;
            $10 = (i16 + 53) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                try {
                    int i18 = i17;
                    Object[] objArr2 = {Integer.valueOf(cArr[i17])};
                    char[] cArr3 = cArr2;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2312, (char) TextUtils.getOffsetAfter("", 0), 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte b11 = (byte) 1;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr3[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i17 = i18 + 1;
                    cArr2 = cArr3;
                    i14 = i14;
                    length = length;
                    cArr = cArr;
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
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        Class<Object> cls5 = cls2;
        Integer num2 = num;
        int i19 = i14;
        int i21 = i15;
        char[] cArr4 = new char[i13];
        System.arraycopy(cArr, i12, cArr4, 0, i13);
        if (bArr != 0) {
            $10 = ($11 + 65) % 128;
            char[] cArr5 = new char[i13];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i22 = challengeResultError.getSDKAppID;
                if (i22 >= i13) {
                    break;
                }
                if (bArr[i22] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr4[i22]), Integer.valueOf(c11)};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 557, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5485), TextUtils.lastIndexOf("", '0', 0, 0) + 24);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr5[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    Object[] objArr6 = {Integer.valueOf(cArr4[i22]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - TextUtils.getOffsetAfter("", 0), (char) Color.blue(0), 24 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr5[i22] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr5[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Integer num3 = num2;
                Object method4 = map4.get(num3);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    float f12 = f11;
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTapTimeout() >> 16) + 854, (char) Drawable.resolveOpacity(0, 0), 24 - (TypedValue.complexToFraction(0, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(0, f12, f12) == f12 ? 0 : -1)));
                    byte b15 = (byte) 3;
                    byte b16 = (byte) (b15 - 3);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(num3, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                num2 = num3;
                cls5 = cls;
                cArr4 = cArr4;
                cArr5 = cArr5;
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            cArr4 = cArr5;
        }
        if (i21 > 0) {
            char[] cArr6 = new char[i13];
            i11 = 0;
            System.arraycopy(cArr4, 0, cArr6, 0, i13);
            int i23 = i13 - i21;
            System.arraycopy(cArr6, 0, cArr4, i23, i21);
            System.arraycopy(cArr6, i21, cArr4, 0, i23);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr7 = new char[i13];
            challengeResultError.getSDKAppID = i11;
            $10 = ($11 + 95) % 128;
            while (true) {
                int i24 = challengeResultError.getSDKAppID;
                if (i24 >= i13) {
                    break;
                }
                cArr7[i24] = cArr4[(i13 - i24) - 1];
                challengeResultError.getSDKAppID = i24 + 1;
            }
            cArr4 = cArr7;
        }
        if (i19 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i13) {
                    break;
                }
                $10 = ($11 + 75) % 128;
                cArr4[i25] = (char) (cArr4[i25] - iArr[2]);
                challengeResultError.getSDKAppID = i25 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            byte[] r1 = atd.r.getMessageVersion.$$a
            int r6 = r6 * 2
            int r6 = r6 + 98
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            r3 = -1
            if (r1 != 0) goto L1a
            r4 = r3
            r3 = r1
            r1 = r8
            goto L33
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
        L1d:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r4 = r1[r6]
            r5 = r1
            r1 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L33:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r1 + 1
            r1 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.getMessageVersion.b(short, byte, short, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new char[]{30734, 30805, 30794, 30799, 30809, 30807, 30800, 30805, 30807, 30812, 30802, 30794, 30800, 30807, 30747, 30844, 30720, 30844};
    }

    static void init$0() {
        $$a = new byte[]{81, 113, 124, -104};
        $$b = 94;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Boolean sDKReferenceNumber;
        getSDKAppID = (getDeviceData + 21) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        a("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{0, 14, 0, 0}, false, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null || (sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID)) == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        int i11 = getDeviceData + 29;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
        }
        DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
        throw null;
    }

    private getMessageVersion(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
