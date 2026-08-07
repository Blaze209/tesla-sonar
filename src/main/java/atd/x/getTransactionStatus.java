package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightness;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTransactionStatus extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/ScreenBrightness$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MAX_VALUE", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        AuthenticationRequestParameters = 0;
        getDeviceData = 1;
        getSDKReferenceNumber();
        new getSDKReferenceNumber((byte) 0);
        int i11 = getDeviceData + 7;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getTransactionStatus(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0110  */
    /* JADX WARN: Code duplicated, block: B:32:0x0118 A[PHI: r13
      0x0118: PHI (r13v4 char) = (r13v3 char), (r13v12 char) binds: [B:31:0x0116, B:27:0x010d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0133  */
    /* JADX WARN: Code duplicated, block: B:36:0x0136 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:10:0x0054, B:14:0x00bc, B:13:0x0077, B:40:0x0186, B:44:0x01c9, B:47:0x01dd, B:51:0x0228, B:50:0x01f1, B:43:0x01a1, B:33:0x011c, B:37:0x0173, B:36:0x0136), top: B:76:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a1 A[Catch: all -> 0x0238, TryCatch #0 {all -> 0x0238, blocks: (B:10:0x0054, B:14:0x00bc, B:13:0x0077, B:40:0x0186, B:44:0x01c9, B:47:0x01dd, B:51:0x0228, B:50:0x01f1, B:43:0x01a1, B:33:0x011c, B:37:0x0173, B:36:0x0136), top: B:76:0x0054 }] */
    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
        char c11;
        Map map;
        Object method;
        Class<Object> cls;
        Map map2;
        Object method2;
        Object method3;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        $11 = ($10 + 41) % 128;
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
        char[] cArr = getSDKAppID;
        char c12 = '0';
        Class cls3 = Integer.TYPE;
        int i17 = 2;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            while (i12 < length) {
                try {
                    byte[] bArr2 = bArr;
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    int i18 = i12;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object obj = map3.get(-1708792688);
                    if (obj != null) {
                        method3 = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), AndroidCharacter.getMirror('0') - 24);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (-b12), objArr3);
                        method3 = cls4.getMethod((String) objArr3[0], cls3);
                        map3.put(-1708792688, method3);
                    }
                    cArr2[i18] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i12 = i18 + 1;
                    bArr = bArr2;
                    cArr = cArr;
                    cArr2 = cArr2;
                    length = length;
                    i15 = i15;
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
            cArr = cArr2;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i19 = i15;
        int i21 = i16;
        char[] cArr3 = new char[i14];
        System.arraycopy(cArr, i13, cArr3, 0, i14);
        if (bArr3 != null) {
            char[] cArr4 = new char[i14];
            challengeResultError.getSDKAppID = 0;
            char c13 = 0;
            while (true) {
                int i22 = challengeResultError.getSDKAppID;
                if (i22 >= i14) {
                    break;
                }
                int i23 = $11 + 119;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    c11 = 1;
                    if (bArr3[i22] == 1) {
                        char c14 = cArr3[i22];
                        Object[] objArr4 = new Object[i17];
                        objArr4[c11] = Integer.valueOf(c13);
                        objArr4[0] = Integer.valueOf(c14);
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(10570995);
                        if (method != null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(557 - TextUtils.lastIndexOf("", c12, 0, 0), (char) (5486 - (ViewConfiguration.getTapTimeout() >> 16)), Color.alpha(0) + 23);
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            b(b13, b14, (byte) (b14 - 1), objArr5);
                            method = cls6.getMethod((String) objArr5[0], cls3, cls3);
                            map.put(10570995, method);
                        }
                        cArr4[i22] = ((Character) ((Method) method).invoke(null, objArr4)).charValue();
                    } else {
                        cArr3 = cArr3;
                        Object[] objArr6 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c13)};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-502074319);
                        if (method2 != null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - ExpandableListView.getPackedPositionType(0L), (char) View.MeasureSpec.getSize(0), ImageFormat.getBitsPerPixel(0) + 25)).getMethod("a", cls3, cls3);
                            map2.put(-502074319, method2);
                        }
                        cArr4[i22] = ((Character) ((Method) method2).invoke(null, objArr6)).charValue();
                    }
                } else {
                    c11 = 1;
                    if (bArr3[i22] == 1) {
                        char c15 = cArr3[i22];
                        Object[] objArr7 = new Object[i17];
                        objArr7[c11] = Integer.valueOf(c13);
                        objArr7[0] = Integer.valueOf(c15);
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(10570995);
                        if (method != null) {
                            Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(557 - TextUtils.lastIndexOf("", c12, 0, 0), (char) (5486 - (ViewConfiguration.getTapTimeout() >> 16)), Color.alpha(0) + 23);
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr8 = new Object[1];
                            b(b15, b16, (byte) (b16 - 1), objArr8);
                            method = cls7.getMethod((String) objArr8[0], cls3, cls3);
                            map.put(10570995, method);
                        }
                        cArr4[i22] = ((Character) ((Method) method).invoke(null, objArr7)).charValue();
                    } else {
                        cArr3 = cArr3;
                        Object[] objArr9 = {Integer.valueOf(cArr3[i22]), Integer.valueOf(c13)};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-502074319);
                        if (method2 != null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(201 - ExpandableListView.getPackedPositionType(0L), (char) View.MeasureSpec.getSize(0), ImageFormat.getBitsPerPixel(0) + 25)).getMethod("a", cls3, cls3);
                            map2.put(-502074319, method2);
                        }
                        cArr4[i22] = ((Character) ((Method) method2).invoke(null, objArr9)).charValue();
                    }
                }
                c13 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr10 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(0) + 855, (char) Color.alpha(0), Color.alpha(0) + 24);
                    byte b17 = (byte) 0;
                    byte b18 = (byte) (b17 + 3);
                    Object[] objArr11 = new Object[1];
                    b(b17, b18, (byte) (b18 - 4), objArr11);
                    String str3 = (String) objArr11[0];
                    cls = cls5;
                    method4 = cls8.getMethod(str3, cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr10);
                cls5 = cls;
                cArr3 = cArr3;
                c12 = '0';
                i17 = 2;
            }
            cArr3 = cArr4;
        }
        if (i21 > 0) {
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i14);
            int i24 = i14 - i21;
            System.arraycopy(cArr5, 0, cArr3, i24, i21);
            System.arraycopy(cArr5, i21, cArr3, 0, i24);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i14];
            challengeResultError.getSDKAppID = i11;
            $11 = ($10 + 29) % 128;
            while (true) {
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i14) {
                    break;
                }
                cArr6[i25] = cArr3[(i14 - i25) - 1];
                challengeResultError.getSDKAppID = i25 + 1;
            }
            cArr3 = cArr6;
        }
        if (i19 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i14) {
                    break;
                }
                cArr3[i26] = (char) (cArr3[i26] - iArr[2]);
                challengeResultError.getSDKAppID = i26 + 1;
            }
        }
        objArr[0] = new String(cArr3);
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
    private static void b(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = atd.x.getTransactionStatus.$$a
            int r5 = r5 * 3
            int r1 = r5 + 1
            int r6 = r6 * 2
            int r6 = r6 + 98
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r4 = r0[r7]
            int r3 = r3 + 1
        L28:
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getTransactionStatus.b(short, short, int, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = new char[]{30727, 30805, 30804, 30805, 30811, 30807, 30808, 30814, 30804, 30803, 30806, 30809, 30800, 30799, 30807, 30802, 30797, 30759, 30735, 30735, 30727};
    }

    static void init$0() {
        $$a = new byte[]{13, -98, -57, -23};
        $$b = 121;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Integer numAuthenticationRequestParameters;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a("\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000", new int[]{0, 17, 0, 0}, false, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null && (numAuthenticationRequestParameters = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.AuthenticationRequestParameters(sDKTransactionID)) != null) {
            if (numAuthenticationRequestParameters.intValue() <= 255) {
                int i11 = getDeviceData + 71;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 != 0) {
                    getDeviceData = (AuthenticationRequestParameters + 77) % 128;
                    numAuthenticationRequestParameters = null;
                }
            } else {
                getDeviceData = (AuthenticationRequestParameters + 77) % 128;
                numAuthenticationRequestParameters = null;
            }
            if (numAuthenticationRequestParameters != null) {
                int i12 = getDeviceData + 101;
                AuthenticationRequestParameters = i12 % 128;
                if (i12 % 2 != 0) {
                    DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
                    throw null;
                }
                DeviceParameterResult.Success.IntValue intValueM35boximpl = DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(numAuthenticationRequestParameters.intValue()));
                int i13 = getDeviceData + 29;
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 == 0) {
                    return intValueM35boximpl;
                }
                throw null;
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private getTransactionStatus(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
