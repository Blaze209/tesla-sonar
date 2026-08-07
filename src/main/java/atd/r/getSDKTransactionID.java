package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AirplaneModeRadios;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int[] AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKAppID;
    private final atd.q.AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AirplaneModeRadios$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getDeviceData = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters();
        View.resolveSize(0, 0);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKAppID + 75;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getSDKTransactionID(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = new int[]{89130762, 92840188, 1487771718, -1275031136, -2105127098, 1920988801, 1960744926, -1698354228, 1242249790, 1211771739, -702493462, 1817820769, -128999140, 1068035910, 959700342, -834574691, -1882822567, -1340525956};
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        Object method;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        int i13 = 2;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i14 = 0;
            i12 = 16;
            while (i14 < length) {
                int i15 = $10 + 99;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(2050190164);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(0) + 1862, (char) ExpandableListView.getPackedPositionType(0L), 21 - ((Process.getThreadPriority(0) + 20) >> 6));
                            byte b11 = (byte) (-1);
                            byte b12 = (byte) (b11 + 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, b12, objArr3);
                            method = cls2.getMethod((String) objArr3[0], cls);
                            map.put(2050190164, method);
                        }
                        iArr3[i14] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    iArr3 = iArr3;
                    cArr = cArr;
                    length = length;
                    iArr2 = iArr2;
                    Object[] objArr4 = {Integer.valueOf(iArr2[i14])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(2050190164);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getEdgeSlop() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 20);
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method2);
                    }
                    iArr3[i14] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    i14++;
                }
                iArr3 = iArr3;
                cArr = cArr;
                length = length;
                iArr2 = iArr2;
            }
            iArr2 = iArr3;
        } else {
            i12 = 16;
        }
        char[] cArr3 = cArr;
        int i16 = 0;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AuthenticationRequestParameters;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i17 = 0;
            while (i17 < length3) {
                Object[] objArr6 = {Integer.valueOf(iArr5[i17])};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(2050190164);
                if (method3 == null) {
                    int i18 = i16;
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) Color.red(i16), View.resolveSizeAndState(i18, i18, i18) + 21);
                    byte b15 = (byte) (-1);
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], cls);
                    map3.put(2050190164, method3);
                }
                iArr6[i17] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                i17++;
                $10 = ($11 + 39) % 128;
                iArr5 = iArr5;
                length3 = length3;
                iArr6 = iArr6;
                cArr2 = cArr2;
                i16 = 0;
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr2;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i19 = challengeResultCompleted.getDeviceData;
            if (i19 >= iArr.length) {
                break;
            }
            $10 = ($11 + 9) % 128;
            int i21 = iArr[i19];
            char c11 = (char) (i21 >> 16);
            cArr3[0] = c11;
            char c12 = (char) i21;
            cArr3[1] = c12;
            char c13 = (char) (iArr[i19 + 1] >> 16);
            cArr3[i13] = c13;
            char c14 = (char) iArr[i19 + 1];
            char c15 = 3;
            cArr3[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i22 = 0;
            while (i22 < i12) {
                int i23 = challengeResultCompleted.getSDKAppID ^ iArr4[i22];
                challengeResultCompleted.getSDKAppID = i23;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i23);
                Object[] objArr8 = new Object[4];
                objArr8[c15] = challengeResultCompleted;
                objArr8[i13] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0, 0) + 1299, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), 32 - TextUtils.lastIndexOf("", '0'));
                    byte b17 = (byte) (-1);
                    byte b18 = (byte) (b17 + 4);
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, (byte) (b18 - 3), objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i22++;
                c15 = c15;
                i12 = 16;
            }
            char c16 = c15;
            int i24 = challengeResultCompleted.getSDKAppID;
            int i25 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i25;
            challengeResultCompleted.getSDKReferenceNumber = i24;
            int i26 = i24 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i26;
            int i27 = i25 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i27;
            cArr3[0] = (char) (i27 >>> 16);
            cArr3[1] = (char) i27;
            cArr3[i13] = (char) (i26 >>> 16);
            cArr3[c16] = (char) i26;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
            int i28 = challengeResultCompleted.getDeviceData;
            cArr4[i28 * 2] = cArr3[0];
            cArr4[(i28 * 2) + 1] = cArr3[1];
            cArr4[(i28 * 2) + 2] = cArr3[i13];
            cArr4[(i28 * 2) + 3] = cArr3[c16];
            Object[] objArr10 = new Object[i13];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Object method5 = map5.get(1109131256);
            if (method5 != null) {
                i12 = 16;
            } else {
                i12 = 16;
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2061, (char) Color.blue(0), KeyEvent.keyCodeFromString("") + 17);
                byte b19 = (byte) (-1);
                byte b21 = (byte) (b19 + 3);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 2), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(1109131256, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            i13 = 2;
        }
        String str = new String(cArr4, 0, i11);
        int i29 = $10 + 121;
        $11 = i29 % 128;
        if (i29 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i31 = 44 / 0;
            objArr[0] = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.r.getSDKTransactionID.$$a
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 + 117
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
        L2a:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKTransactionID.b(int, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{5, -65, 35, -69};
        $$b = 91;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        getDeviceData = (getSDKAppID + 17) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        a(new int[]{1937280494, -451408161, -568395230, -91024796, 2012996123, -1893946932, -1519314312, 929425608, 1926247294, 1884994442}, 20 - View.resolveSizeAndState(0, 0, 0), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
        getDeviceData = (getSDKAppID + 105) % 128;
        return stringValueM49boximpl;
    }

    private getSDKTransactionID(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKTransactionID = authenticationRequestParameters;
    }
}
