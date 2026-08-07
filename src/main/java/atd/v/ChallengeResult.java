package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/DefaultInputMethod;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResult extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/DefaultInputMethod$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        new AuthenticationRequestParameters((byte) 0);
        getDeviceData = (getSDKReferenceNumber + 25) % 128;
    }

    public /* synthetic */ ChallengeResult(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = new char[]{30732, 30807, 30805, 30800, 30802, 30807, 30808, 30807, 30794, 30796, 30801, 30805, 30810, 30807, 30798, 30798, 30805, 30813, 30811, 30810, 30750, 30726, 30733, 30730};
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        float f11;
        int i11;
        byte b11;
        char[] cArr;
        Class<Object> cls;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        int i12 = $11;
        $10 = (i12 + 19) % 128;
        Object bytes = str2;
        if (str2 != null) {
            $10 = (i12 + 23) % 128;
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        atd.az.ChallengeResultError challengeResultError = new atd.az.ChallengeResultError();
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr2 = AuthenticationRequestParameters;
        Class cls3 = Integer.TYPE;
        int i17 = 2;
        if (cArr2 != null) {
            f11 = BitmapDescriptorFactory.HUE_RED;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    byte[] bArr2 = bArr;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i18])};
                    int i19 = length;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2313, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24);
                        byte b12 = (byte) ($$b & 15);
                        byte b13 = (byte) (b12 - 2);
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, (byte) (b13 - 1), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr3[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    length = i19;
                    bArr = bArr2;
                    cArr2 = cArr2;
                    cArr3 = cArr3;
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
            cArr2 = cArr3;
        } else {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i21 = i15;
        int i22 = i16;
        char[] cArr4 = new char[i14];
        System.arraycopy(cArr2, i13, cArr4, 0, i14);
        if (bArr3 != null) {
            int i23 = $11 + 63;
            $10 = i23 % 128;
            if (i23 % 2 != 0) {
                cArr = new char[i14];
                b11 = 1;
                challengeResultError.getSDKAppID = 1;
            } else {
                b11 = 1;
                cArr = new char[i14];
                challengeResultError.getSDKAppID = 0;
            }
            char c11 = 0;
            while (true) {
                int i24 = challengeResultError.getSDKAppID;
                if (i24 >= i14) {
                    break;
                }
                char c12 = '0';
                if (bArr3[i24] == b11) {
                    char c13 = cArr4[i24];
                    Object[] objArr4 = new Object[i17];
                    objArr4[b11] = Integer.valueOf(c11);
                    objArr4[0] = Integer.valueOf(c13);
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(557 - ExpandableListView.getPackedPositionChild(0L), (char) (5486 - KeyEvent.getDeadChar(0, 0)), 22 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        byte b14 = (byte) 3;
                        byte b15 = (byte) (b14 - 3);
                        Object[] objArr5 = new Object[1];
                        b(b14, b15, (byte) (b15 - 1), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr[i24] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr4 = cArr4;
                    c12 = '0';
                    Object[] objArr6 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1)) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.indexOf("", "") + 24)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr[i24] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    float f12 = f11;
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID((PointF.length(f12, f12) > f12 ? 1 : (PointF.length(f12, f12) == f12 ? 0 : -1)) + 854, (char) ('0' - AndroidCharacter.getMirror(c12)), Color.alpha(0) + 24);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, (byte) (b17 - 1), objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr4 = cArr4;
                b11 = 1;
                i17 = 2;
                f11 = BitmapDescriptorFactory.HUE_RED;
            }
            $11 = ($10 + 5) % 128;
            cArr4 = cArr;
        }
        if (i22 > 0) {
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr4, 0, cArr5, 0, i14);
            int i25 = i14 - i22;
            System.arraycopy(cArr5, 0, cArr4, i25, i22);
            System.arraycopy(cArr5, i22, cArr4, 0, i25);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i14];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i26 = challengeResultError.getSDKAppID;
                if (i26 >= i14) {
                    break;
                }
                cArr6[i26] = cArr4[(i14 - i26) - 1];
                challengeResultError.getSDKAppID = i26 + 1;
            }
            cArr4 = cArr6;
        }
        if (i21 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i27 = challengeResultError.getSDKAppID;
                if (i27 >= i14) {
                    break;
                }
                cArr4[i27] = (char) (cArr4[i27] - iArr[2]);
                challengeResultError.getSDKAppID = i27 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            byte[] r0 = atd.v.ChallengeResult.$$a
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r5 = r5 * 2
            int r5 = 104 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.ChallengeResult.b(int, short, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{88, -76, 55, 74};
        $$b = 82;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        r1 = 83 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        atd.v.ChallengeResult.getSDKReferenceNumber = (atd.v.ChallengeResult.getDeviceData + 53) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0043, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0));
        r1 = atd.v.ChallengeResult.getSDKReferenceNumber + 101;
        atd.v.ChallengeResult.getDeviceData = r1 % 128;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getDeviceData() throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = atd.v.ChallengeResult.getSDKReferenceNumber
            int r0 = r0 + 55
            int r1 = r0 % 128
            atd.v.ChallengeResult.getDeviceData = r1
            int r0 = r0 % 2
            r1 = 20
            java.lang.String r2 = "\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2c
            atd.q.AuthenticationRequestParameters r0 = r6.getSDKTransactionID
            int[] r1 = new int[]{r4, r1, r4, r4}
            java.lang.Object[] r3 = new java.lang.Object[r3]
            a(r2, r1, r4, r3)
            r1 = r3[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L5d
            goto L45
        L2c:
            atd.q.AuthenticationRequestParameters r0 = r6.getSDKTransactionID
            int[] r1 = new int[]{r4, r1, r4, r4}
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r2, r1, r3, r5)
            r1 = r5[r4]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L5d
        L45:
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(r0)
            int r1 = atd.v.ChallengeResult.getSDKReferenceNumber
            int r1 = r1 + 101
            int r2 = r1 % 128
            atd.v.ChallengeResult.getDeviceData = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L5c
            r1 = 83
            int r1 = r1 / r4
        L5c:
            return r0
        L5d:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            int r1 = atd.v.ChallengeResult.getDeviceData
            int r1 = r1 + 53
            int r1 = r1 % 128
            atd.v.ChallengeResult.getSDKReferenceNumber = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.ChallengeResult.getDeviceData():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    private ChallengeResult(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKTransactionID = authenticationRequestParameters;
    }
}
