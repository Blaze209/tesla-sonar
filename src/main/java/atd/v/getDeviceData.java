package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AllowedGeolocationOrigins;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeviceData extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AllowedGeolocationOrigins$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        Color.argb(0, 0, 0, 0);
        new getSDKAppID((byte) 0);
        int i11 = getSDKReferenceNumber + 93;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getDeviceData(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = new int[]{-252268699, 1748673614, 419543950, -311173593, -1527637526, -323632961, -1937204710, -2136384981, -2084956858, 463405095, 1190326608, 2011072455, -755333598, -979467480, -1507202789, -1067241577, -1174661186, 986362462};
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        int length;
        int[] iArr2;
        Object method2;
        Integer num = 1109131256;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        int i13 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getDeviceData;
        Class cls = Integer.TYPE;
        int i14 = 0;
        if (iArr3 != null) {
            int i15 = $10 + 35;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i16 = 0;
            i12 = 16;
            while (i16 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i16])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - TextUtils.getCapsMode("", i14, i14), (char) (Color.rgb(i14, i14, i14) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), 21 - (ViewConfiguration.getEdgeSlop() >> 16));
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 3), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr2[i16] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i16++;
                    length = length;
                    iArr2 = iArr2;
                    cArr = cArr;
                    iArr3 = iArr3;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        } else {
            i12 = 16;
        }
        char[] cArr3 = cArr;
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getDeviceData;
        if (iArr5 != null) {
            $10 = ($11 + 99) % 128;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i17 = 0;
            while (i17 < length3) {
                int i18 = $10 + 25;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i17])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 20 - ExpandableListView.getPackedPositionChild(0L));
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 3);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 3), objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr6[i17] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i17 /= 0;
                } else {
                    num = num;
                    cArr2 = cArr2;
                    iArr5 = iArr5;
                    length3 = length3;
                    iArr6 = iArr6;
                    int i19 = i17;
                    Object[] objArr6 = {Integer.valueOf(iArr5[i19])};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - TextUtils.indexOf("", ""), (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 21 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 3), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr6[i19] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    i17 = i19 + 1;
                }
                $11 = ($10 + 67) % 128;
                length3 = length3;
                iArr5 = iArr5;
                iArr6 = iArr6;
                cArr2 = cArr2;
                num = num;
            }
            iArr5 = iArr6;
        }
        Integer num2 = num;
        char[] cArr4 = cArr2;
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i21 = challengeResultCompleted.getDeviceData;
            if (i21 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i22 = iArr[i21];
            char c12 = (char) (i22 >> 16);
            cArr3[c11] = c12;
            char c13 = (char) i22;
            cArr3[1] = c13;
            char c14 = (char) (iArr[i21 + 1] >> 16);
            cArr3[i13] = c14;
            char c15 = (char) iArr[i21 + 1];
            char c16 = 3;
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i23 = 0;
            while (i23 < i12) {
                int i24 = challengeResultCompleted.getSDKAppID ^ iArr4[i23];
                challengeResultCompleted.getSDKAppID = i24;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i24);
                Object[] objArr8 = new Object[4];
                objArr8[c16] = challengeResultCompleted;
                objArr8[i13] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1300 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), (Process.myPid() >> 22) + 33);
                    byte b17 = (byte) 0;
                    byte b18 = b17;
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, b18, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i23++;
                c16 = c16;
                i12 = 16;
            }
            char c17 = c16;
            int i25 = challengeResultCompleted.getSDKAppID;
            int i26 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i26;
            challengeResultCompleted.getSDKReferenceNumber = i25;
            int i27 = i25 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i27;
            int i28 = i26 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i28;
            cArr3[0] = (char) (i28 >>> 16);
            cArr3[1] = (char) i28;
            cArr3[i13] = (char) (i27 >>> 16);
            cArr3[c17] = (char) i27;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i29 = challengeResultCompleted.getDeviceData;
            cArr4[i29 * 2] = cArr3[0];
            cArr4[(i29 * 2) + 1] = cArr3[1];
            cArr4[(i29 * 2) + 2] = cArr3[i13];
            cArr4[(i29 * 2) + 3] = cArr3[c17];
            Object[] objArr10 = new Object[i13];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Integer num3 = num2;
            Object method5 = map5.get(num3);
            if (method5 != null) {
                i12 = 16;
            } else {
                i12 = 16;
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - Color.red(0), (char) KeyEvent.keyCodeFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 16);
                byte b19 = (byte) 0;
                byte b21 = (byte) (b19 + 1);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 1), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(num3, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            num2 = num3;
            c11 = 0;
            i13 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.v.getDeviceData.$$a
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r7 = 120 - r7
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r7 = r6
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.getDeviceData.b(byte, int, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{91, -6, 53, -91};
        $$b = 21;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0065, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006d, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0));
        atd.v.getDeviceData.getSDKAppID = (atd.v.getDeviceData.getSDKReferenceNumber + 1) % 128;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getDeviceData() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.v.getDeviceData.getSDKReferenceNumber
            int r0 = r0 + 85
            int r1 = r0 % 128
            atd.v.getDeviceData.getSDKAppID = r1
            int r0 = r0 % 2
            r1 = 14
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L34
            atd.q.AuthenticationRequestParameters r0 = r6.getSDKTransactionID
            int[] r1 = new int[r1]
            r1 = {x006e: FILL_ARRAY_DATA , data: [1722462081, -374227351, -654530805, -2072897884, -1044430040, -1792414924, 1821779674, 2134281150, -337152662, 363519297, -909827982, 1442088201, 705175066, 1715944603} // fill-array
            int r4 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r4 = r4 * 39
            r5 = 8
            int r5 = r5 / r4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            a(r1, r5, r4)
            r1 = r4[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L66
            goto L56
        L34:
            atd.q.AuthenticationRequestParameters r0 = r6.getSDKTransactionID
            int[] r1 = new int[r1]
            r1 = {x008e: FILL_ARRAY_DATA , data: [1722462081, -374227351, -654530805, -2072897884, -1044430040, -1792414924, 1821779674, 2134281150, -337152662, 363519297, -909827982, 1442088201, 705175066, 1715944603} // fill-array
            int r4 = android.view.ViewConfiguration.getScrollBarFadeDuration()
            int r4 = r4 >> 16
            int r4 = 27 - r4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r1, r4, r5)
            r1 = r5[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L66
        L56:
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(r0)
            int r1 = atd.v.getDeviceData.getSDKReferenceNumber
            int r1 = r1 + r3
            int r1 = r1 % 128
            atd.v.getDeviceData.getSDKAppID = r1
            return r0
        L66:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.getDeviceData.getDeviceData():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    private getDeviceData(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKTransactionID = authenticationRequestParameters;
    }
}
