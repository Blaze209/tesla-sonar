package atd.x;

import android.app.Application;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/HapticFeedbackEnabled;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static char[] getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/HapticFeedbackEnabled$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKTransactionID = 0;
        getDeviceData = 1;
        getSDKReferenceNumber();
        new getSDKReferenceNumber((byte) 0);
        getDeviceData = (getSDKTransactionID + 7) % 128;
    }

    public /* synthetic */ getSDKEphemeralPublicKey(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
        int i11;
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
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        char[] cArr = getSDKAppID;
        Class cls3 = Integer.TYPE;
        int i16 = 2;
        if (cArr != null) {
            $10 = ($11 + 111) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i17 = 0;
            while (i17 < length) {
                byte[] bArr2 = bArr;
                int i18 = $10 + 57;
                int i19 = i17;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i19])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1708792688);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getMode(0) + 24);
                            byte b11 = (byte) (-1);
                            byte b12 = (byte) (b11 + 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, (byte) (b12 + 1), objArr3);
                            method = cls4.getMethod((String) objArr3[0], cls3);
                            map.put(-1708792688, method);
                        }
                        cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i17 = i19;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    cls2 = cls2;
                    cArr2 = cArr2;
                    length = length;
                    i14 = i14;
                    i15 = i15;
                    cArr = cArr;
                    Object[] objArr4 = {Integer.valueOf(cArr[i19])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(-1708792688);
                    if (method2 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 2313, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 24 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 + 1), objArr5);
                        method2 = cls5.getMethod((String) objArr5[0], cls3);
                        map2.put(-1708792688, method2);
                    }
                    cArr2[i19] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17 = i19 + 1;
                }
                bArr = bArr2;
                cArr = cArr;
                cArr2 = cArr2;
                length = length;
                i14 = i14;
                i15 = i15;
                cls2 = cls2;
            }
            cArr = cArr2;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls6 = cls2;
        int i21 = i14;
        int i22 = i15;
        char[] cArr3 = new char[i13];
        System.arraycopy(cArr, i12, cArr3, 0, i13);
        if (bArr3 != null) {
            char[] cArr4 = new char[i13];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i13) {
                    break;
                }
                $11 = ($10 + 5) % 128;
                if (bArr3[i23] == 1) {
                    char c12 = cArr3[i23];
                    Object[] objArr6 = new Object[i16];
                    objArr6[1] = Integer.valueOf(c11);
                    objArr6[0] = Integer.valueOf(c12);
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(10570995);
                    if (method3 == null) {
                        Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 558, (char) (5486 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.getOffsetAfter("", 0) + 23);
                        byte b15 = (byte) (-1);
                        byte b16 = (byte) (b15 + 1);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, b16, objArr7);
                        method3 = cls7.getMethod((String) objArr7[0], cls3, cls3);
                        map3.put(10570995, method3);
                    }
                    cArr4[i23] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                } else {
                    cArr3 = cArr3;
                    cArr4 = cArr4;
                    Object[] objArr8 = {Integer.valueOf(cArr3[i23]), Integer.valueOf(c11)};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-502074319);
                    if (method4 == null) {
                        method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(200 - ExpandableListView.getPackedPositionChild(0L), (char) KeyEvent.keyCodeFromString(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24)).getMethod("a", cls3, cls3);
                        map4.put(-502074319, method4);
                    }
                    cArr4[i23] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                }
                c11 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr9 = {challengeResultError, challengeResultError};
                Map map5 = atd.a.getMessageVersion.timedout;
                Object method5 = map5.get(-399400818);
                if (method5 != null) {
                    cls = cls6;
                } else {
                    Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(854 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) KeyEvent.normalizeMetaState(0), 24 - TextUtils.getOffsetBefore("", 0));
                    byte b17 = (byte) (-1);
                    byte b18 = (byte) (b17 + 1);
                    Object[] objArr10 = new Object[1];
                    b(b17, b18, (byte) (b18 + 3), objArr10);
                    cls = cls6;
                    method5 = cls8.getMethod((String) objArr10[0], cls, cls);
                    map5.put(-399400818, method5);
                }
                ((Method) method5).invoke(null, objArr9);
                cls6 = cls;
                cArr3 = cArr3;
                cArr4 = cArr4;
                i16 = 2;
            }
            cArr3 = cArr4;
        }
        if (i22 > 0) {
            char[] cArr5 = new char[i13];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i13);
            int i24 = i13 - i22;
            System.arraycopy(cArr5, 0, cArr3, i24, i22);
            System.arraycopy(cArr5, i22, cArr3, 0, i24);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i13];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i13) {
                    break;
                }
                int i26 = $11 + 31;
                int i27 = i26 % 128;
                $10 = i27;
                if (i26 % 2 != 0) {
                    cArr6[i25] = cArr3[i13 + i25 + 1];
                } else {
                    cArr6[i25] = cArr3[(i13 - i25) - 1];
                    i25++;
                }
                challengeResultError.getSDKAppID = i25;
                $11 = (i27 + 33) % 128;
            }
            cArr3 = cArr6;
        }
        if (i21 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i28 = challengeResultError.getSDKAppID;
                if (i28 >= i13) {
                    break;
                }
                cArr3[i28] = (char) (cArr3[i28] - iArr[2]);
                challengeResultError.getSDKAppID = i28 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r8 = r8 + 98
            byte[] r1 = atd.x.getSDKEphemeralPublicKey.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.getSDKEphemeralPublicKey.b(int, short, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = new char[]{30898, 31014, 31010, 31013, 31019, 31013, 31011, 31016, 31015, 31013, 31016, 31019, 31017, 31014, 31015, 31015, 31016, 31019, 31012, 31004, 31000, 31010, 31014, 30785, 30790, 30791, 30903};
    }

    static void init$0() {
        $$a = new byte[]{33, -29, 53, -35};
        $$b = 166;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        int i11 = getDeviceData + 9;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0 ? Build.VERSION.SDK_INT >= 33 : Build.VERSION.SDK_INT >= 31) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
            getDeviceData = (getSDKTransactionID + 107) % 128;
            return failure;
        }
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a("\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{0, 23, 180, 0}, true, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getDeviceData = (getSDKTransactionID + 59) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private getSDKEphemeralPublicKey(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
