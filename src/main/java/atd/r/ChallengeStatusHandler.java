package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WaitForDebugger;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusHandler extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int[] getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/WaitForDebugger$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID();
        Color.rgb(0, 0, 0);
        new getDeviceData((byte) 0);
        int i11 = AuthenticationRequestParameters + 31;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 8 / 0;
        }
    }

    public /* synthetic */ ChallengeStatusHandler(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        Integer num;
        char[] cArr;
        int i12;
        float f11;
        Object method;
        Object method2;
        Integer num2 = 1109131256;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr2 = new char[4];
        int i13 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = getSDKReferenceNumber;
        Class cls = Integer.TYPE;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i14 = 0;
            while (i14 < length) {
                $11 = ($10 + 97) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 1862, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 21 - KeyEvent.getDeadChar(0, 0));
                        byte b11 = (byte) ($$b & 11);
                        byte b12 = (byte) (b11 - 3);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 1), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr3[i14] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i14++;
                    cArr2 = cArr2;
                    iArr3 = iArr3;
                    iArr2 = iArr2;
                    length = length;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        char[] cArr4 = cArr2;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getSDKReferenceNumber;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            loop1: while (true) {
                int i15 = 0;
                while (true) {
                    if (i15 >= length3) {
                        break loop1;
                    }
                    int i16 = $10 + 13;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj2 = map2.get(2050190164);
                        if (obj2 != null) {
                            method = obj2;
                        } else {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1862, (char) TextUtils.getOffsetAfter("", 0), 21 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                            byte b13 = (byte) ($$b & 11);
                            byte b14 = (byte) (b13 - 3);
                            Object[] objArr5 = new Object[1];
                            b(b13, b14, (byte) (b14 - 1), objArr5);
                            method = cls3.getMethod((String) objArr5[0], cls);
                            map2.put(2050190164, method);
                        }
                        iArr6[i15] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                        iArr5 = iArr5;
                        iArr6 = iArr6;
                        length3 = length3;
                        cArr3 = cArr3;
                        num2 = num2;
                    } else {
                        Integer num3 = num2;
                        char[] cArr5 = cArr3;
                        int[] iArr7 = iArr5;
                        int i17 = length3;
                        int[] iArr8 = iArr6;
                        int i18 = i15;
                        Object[] objArr6 = {Integer.valueOf(iArr7[i18])};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(2050190164);
                        if (method3 == null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetBefore("", 0) + 1862, (char) View.resolveSize(0, 0), 20 - MotionEvent.axisFromString(""));
                            byte b15 = (byte) ($$b & 11);
                            byte b16 = (byte) (b15 - 3);
                            Object[] objArr7 = new Object[1];
                            b(b15, b16, (byte) (b16 - 1), objArr7);
                            method3 = cls4.getMethod((String) objArr7[0], cls);
                            map3.put(2050190164, method3);
                        }
                        iArr8[i18] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                        i15 = i18 + 1;
                        iArr5 = iArr7;
                        iArr6 = iArr8;
                        length3 = i17;
                        cArr3 = cArr5;
                        num2 = num3;
                    }
                }
            }
            num = num2;
            cArr = cArr3;
            i12 = 16;
            f11 = BitmapDescriptorFactory.HUE_RED;
            $11 = ($10 + 105) % 128;
            iArr5 = iArr6;
        } else {
            num = num2;
            cArr = cArr3;
            i12 = 16;
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i19 = challengeResultCompleted.getDeviceData;
            if (i19 >= iArr.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            int i21 = iArr[i19];
            char c12 = (char) (i21 >> 16);
            cArr4[c11] = c12;
            char c13 = (char) i21;
            cArr4[1] = c13;
            char c14 = (char) (iArr[i19 + 1] >> 16);
            cArr4[i13] = c14;
            char c15 = (char) iArr[i19 + 1];
            char c16 = 3;
            cArr4[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i22 = 0;
            while (i22 < i12) {
                int i23 = challengeResultCompleted.getSDKAppID ^ iArr4[i22];
                challengeResultCompleted.getSDKAppID = i23;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i23);
                Object[] objArr8 = new Object[4];
                objArr8[c16] = challengeResultCompleted;
                objArr8[i13] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1298, (char) (TextUtils.getCapsMode("", 0, 0) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32);
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, (byte) (b18 - 1), objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i22++;
                c16 = c16;
                i12 = 16;
            }
            char c17 = c16;
            int i24 = challengeResultCompleted.getSDKAppID;
            int i25 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i25;
            challengeResultCompleted.getSDKReferenceNumber = i24;
            int i26 = i24 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i26;
            int i27 = i25 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i27;
            cArr4[0] = (char) (i27 >>> 16);
            cArr4[1] = (char) i27;
            cArr4[i13] = (char) (i26 >>> 16);
            cArr4[c17] = (char) i26;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i28 = challengeResultCompleted.getDeviceData;
            cArr[i28 * 2] = cArr4[0];
            cArr[(i28 * 2) + 1] = cArr4[1];
            cArr[(i28 * 2) + 2] = cArr4[i13];
            cArr[(i28 * 2) + 3] = cArr4[c17];
            Object[] objArr10 = new Object[i13];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Integer num4 = num;
            Object method5 = map5.get(num4);
            if (method5 != null) {
                i12 = 16;
            } else {
                i12 = 16;
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.green(0) + 2061, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getScrollFriction() > f11 ? 1 : (ViewConfiguration.getScrollFriction() == f11 ? 0 : -1)) + 16);
                byte b19 = (byte) ($$b & 1);
                byte b21 = (byte) (b19 - 1);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 1), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(num4, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            num = num4;
            c11 = 0;
            i13 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.r.ChallengeStatusHandler.$$a
            int r6 = 120 - r6
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r8 = r8 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.ChallengeStatusHandler.b(byte, int, short, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = new int[]{1219929325, -1167904388, -1071392044, 597340436, 1634810201, -1834317600, -1925272293, 742000804, 459076921, -655718719, 1141966543, 1919243068, 1081253746, 1549387267, -1971117451, 1132933165, 317816054, 1015944134};
    }

    static void init$0() {
        $$a = new byte[]{91, -66, -77, -12};
        $$b = 55;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        a(new int[]{-268651358, 476501566, 915739605, 356899068, 225409794, -2054941818, 1290246003, -153461093, -655525594, 1374591934}, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 17, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getDeviceData = (AuthenticationRequestParameters + 41) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                int i11 = getDeviceData + 27;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 == 0) {
                    DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                    throw null;
                }
                DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                int i12 = AuthenticationRequestParameters + 47;
                getDeviceData = i12 % 128;
                if (i12 % 2 == 0) {
                    return booleanValueM14boximpl;
                }
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private ChallengeStatusHandler(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKTransactionID = authenticationRequestParameters;
    }
}
