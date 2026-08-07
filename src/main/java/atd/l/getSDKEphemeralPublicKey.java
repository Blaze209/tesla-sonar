package atd.l;

import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DeviceModel;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int[] getSDKAppID;
    private static int getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/DeviceModel$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        AuthenticationRequestParameters = 0;
        getSDKReferenceNumber = 1;
        getSDKTransactionID();
        Process.getGidForName("");
        new getSDKTransactionID((byte) 0);
        AuthenticationRequestParameters = (getSDKReferenceNumber + 19) % 128;
    }

    private static String AuthenticationRequestParameters() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Build.MANUFACTURER);
        Object[] objArr = new Object[1];
        a(new int[]{-1002884359, 456436876}, 2 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(Build.MODEL);
        String strM50constructorimpl = DeviceParameterResult.Success.StringValue.m50constructorimpl(sb2.toString());
        int i11 = AuthenticationRequestParameters + 15;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return strM50constructorimpl;
        }
        throw null;
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        long j11;
        int length;
        int[] iArr2;
        Object method;
        Object method2;
        atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getSDKAppID;
        Class cls = Integer.TYPE;
        if (iArr3 != null) {
            j11 = 0;
            $10 = ($11 + 89) % 128;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            i12 = 2;
            int i13 = 0;
            while (i13 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getMode(0) + 21);
                        byte b11 = (byte) ($$a[2] + 1);
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method2);
                    }
                    iArr4[i13] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i13++;
                    cArr = cArr;
                    iArr3 = iArr3;
                    length2 = length2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        } else {
            i12 = 2;
            j11 = 0;
        }
        char[] cArr3 = cArr;
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getSDKAppID;
        if (iArr6 != null) {
            int i14 = $11 + 59;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i15 = 0;
            while (i15 < length) {
                int i16 = $11 + 23;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i15])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 1862, (char) (ViewConfiguration.getTapTimeout() >> 16), Color.blue(0) + 21);
                        byte b13 = (byte) ($$a[i12] + 1);
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr2[i15] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i15--;
                } else {
                    cArr2 = cArr2;
                    iArr6 = iArr6;
                    length = length;
                    iArr2 = iArr2;
                    int i17 = i15;
                    Object[] objArr6 = {Integer.valueOf(iArr6[i17])};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - KeyEvent.normalizeMetaState(0), (char) View.MeasureSpec.getMode(0), 21 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        byte b15 = (byte) ($$a[i12] + 1);
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, b16, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr2[i17] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    i15 = i17 + 1;
                }
                iArr2 = iArr2;
                iArr6 = iArr6;
                length = length;
                cArr2 = cArr2;
            }
            iArr6 = iArr2;
        }
        char[] cArr4 = cArr2;
        int i18 = 16;
        char c11 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i19 = challengeResultCompleted.getDeviceData;
            if (i19 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i21 = iArr[i19];
            char c12 = (char) (i21 >> 16);
            cArr3[c11] = c12;
            char c13 = (char) i21;
            cArr3[1] = c13;
            char c14 = (char) (iArr[i19 + 1] >> 16);
            cArr3[i12] = c14;
            char c15 = (char) iArr[i19 + 1];
            char c16 = 3;
            cArr3[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr5);
            int i22 = 0;
            while (i22 < i18) {
                int i23 = challengeResultCompleted.getSDKAppID ^ iArr5[i22];
                challengeResultCompleted.getSDKAppID = i23;
                int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i23);
                Object[] objArr8 = new Object[4];
                objArr8[c16] = challengeResultCompleted;
                objArr8[i12] = challengeResultCompleted;
                objArr8[1] = Integer.valueOf(sDKAppID);
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(929629307);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1299 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (View.resolveSizeAndState(0, 0, 0) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    byte b17 = (byte) ($$a[i12] + 1);
                    byte b18 = (byte) (b17 + 3);
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, (byte) (b18 - 3), objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                    map4.put(929629307, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i22++;
                c16 = c16;
                i18 = 16;
            }
            char c17 = c16;
            int i24 = challengeResultCompleted.getSDKAppID;
            int i25 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i25;
            challengeResultCompleted.getSDKReferenceNumber = i24;
            i18 = 16;
            int i26 = i24 ^ iArr5[16];
            challengeResultCompleted.getSDKReferenceNumber = i26;
            int i27 = i25 ^ iArr5[17];
            challengeResultCompleted.getSDKAppID = i27;
            cArr3[0] = (char) (i27 >>> 16);
            cArr3[1] = (char) i27;
            cArr3[i12] = (char) (i26 >>> 16);
            cArr3[c17] = (char) i26;
            atd.az.ChallengeResultCompleted.getSDKAppID(iArr5);
            int i28 = challengeResultCompleted.getDeviceData;
            cArr4[i28 * 2] = cArr3[0];
            cArr4[(i28 * 2) + 1] = cArr3[1];
            cArr4[(i28 * 2) + 2] = cArr3[i12];
            cArr4[(i28 * 2) + 3] = cArr3[c17];
            Object[] objArr10 = new Object[i12];
            objArr10[1] = challengeResultCompleted;
            objArr10[0] = challengeResultCompleted;
            Map map5 = atd.a.getMessageVersion.timedout;
            Object method5 = map5.get(1109131256);
            if (method5 != null) {
                i12 = 2;
            } else {
                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.elapsedRealtime() > j11 ? 1 : (SystemClock.elapsedRealtime() == j11 ? 0 : -1)) + 2060, (char) ExpandableListView.getPackedPositionType(j11), View.getDefaultSize(0, 0) + 17);
                i12 = 2;
                byte b19 = (byte) ($$a[2] + 1);
                byte b21 = (byte) (b19 + 2);
                Object[] objArr11 = new Object[1];
                b(b19, b21, (byte) (b21 - 2), objArr11);
                method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                map5.put(1109131256, method5);
            }
            ((Method) method5).invoke(null, objArr10);
            c11 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 + 117
            byte[] r0 = atd.l.getSDKEphemeralPublicKey.$$a
            int r5 = r5 * 3
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r7]
            int r3 = r3 + 1
        L28:
            int r7 = r7 + 1
            int r6 = r6 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.getSDKEphemeralPublicKey.b(int, int, byte, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKAppID = new int[]{-1592609610, -431497480, -1002953489, 337108624, -1862481373, -275105957, -1176465829, 792917361, 761583496, -534992328, 382004840, 1982646712, -1200864685, 1205317358, 1781972142, -233129575, 333657136, 261950445};
    }

    static void init$0() {
        $$a = new byte[]{31, -124, -1, 73};
        $$b = 48;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getSDKReferenceNumber = (AuthenticationRequestParameters + 49) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(AuthenticationRequestParameters());
        getSDKReferenceNumber = (AuthenticationRequestParameters + 39) % 128;
        return stringValueM49boximpl;
    }
}
