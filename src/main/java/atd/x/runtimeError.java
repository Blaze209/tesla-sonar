package atd.x;

import android.app.Application;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextShowPassword;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class runtimeError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/TextShowPassword$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        AuthenticationRequestParameters();
        ViewConfiguration.getLongPressTimeout();
        new getSDKTransactionID((byte) 0);
        getSDKReferenceNumber = (AuthenticationRequestParameters + 31) % 128;
    }

    public /* synthetic */ runtimeError(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    static void AuthenticationRequestParameters() {
        getSDKAppID = -2055078363210707789L;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b9  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        int i12;
        int i13;
        Object method;
        if (str != null) {
            $11 = ($10 + 27) % 128;
            charArray = str.toCharArray();
            $11 = ($10 + 125) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        int i14 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i15 = gettransactionstatus.getSDKTransactionID;
            if (i15 >= cArr.length) {
                break;
            }
            char c11 = cArr[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i14] = Integer.valueOf(c11);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(962978490);
                if (obj != null) {
                    i12 = i14;
                    i13 = 2;
                    method = obj;
                } else {
                    i12 = i14;
                    i13 = 2;
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 689, (char) ((TypedValue.complexToFloat(i12) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i12) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16022), 31 - TextUtils.lastIndexOf("", '0'));
                    byte b11 = $$a[2];
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKAppID ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[i13];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i16 = i12;
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 417, (char) (29017 - Color.argb(i16, i16, i16, i16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24)).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                jArr = jArr;
                i14 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i17 = gettransactionstatus.getSDKTransactionID;
            if (i17 >= cArr.length) {
                break;
            }
            int i18 = $10 + 15;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr2[i17] = (char) jArr2[i17];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - Color.green(0), (char) (ExpandableListView.getPackedPositionType(0L) + 29017), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i19 = 19 / 0;
            } else {
                cArr2[i17] = (char) jArr2[i17];
                Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method4 = map3.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((KeyEvent.getMaxKeyCode() >> 16) + 417, (char) (29017 - TextUtils.indexOf("", "")), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("A", Object.class, Object.class);
                    map3.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr6);
            }
        }
        String str2 = new String(cArr2);
        int i21 = $11 + 113;
        $10 = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r6 = 118 - r6
            byte[] r0 = atd.x.runtimeError.$$a
            int r5 = r5 * 2
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r5
            r6 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L2a
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L2a:
            r3 = r0[r6]
        L2c:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.runtimeError.b(byte, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{75, 34, 0, 64};
        $$b = 158;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 27) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKTransactionID;
        Object[] objArr = new Object[1];
        a("\ud97e\ue9ba룜䯧ᨮ\u2d26ﱖ轧徆溭㇔샪錝", KeyEvent.keyCodeFromString("") + 12511, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getSDKReferenceNumber = (AuthenticationRequestParameters + 107) % 128;
            Boolean sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID);
            if (sDKReferenceNumber != null) {
                int i11 = getSDKReferenceNumber + 105;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 != 0) {
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
                }
                int i12 = 4 / 0;
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(sDKReferenceNumber.booleanValue()));
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    private runtimeError(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKTransactionID = authenticationRequestParameters;
    }
}
