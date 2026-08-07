package atd.v;

import android.app.Application;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsEnabledPlugins;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class runtimeError extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/TtsEnabledPlugins$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        getSDKTransactionID();
        ExpandableListView.getPackedPositionType(0L);
        new getSDKTransactionID((byte) 0);
        getSDKAppID = (getSDKTransactionID + 123) % 128;
    }

    public /* synthetic */ runtimeError(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0162  */
    /* JADX WARN: Code duplicated, block: B:36:0x0163  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        $10 = ($11 + 43) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= charArray.length) {
                break;
            }
            $11 = ($10 + 57) % 128;
            char c11 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(962978490);
                if (method != null) {
                    i12 = i13;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(689 - Drawable.resolveOpacity(i13, i13), (char) (16022 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31);
                    byte b11 = (byte) i13;
                    byte b12 = b11;
                    i12 = i13;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (AuthenticationRequestParameters ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i15 = i12;
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 417, (char) (29016 - (ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24)).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                jArr = jArr;
                i13 = 0;
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
        char[] cArr = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            $10 = ($11 + 101) % 128;
            cArr[i16] = (char) jArr2[i16];
            Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(-46730980);
            if (method3 == null) {
                method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + 417, (char) (29017 - View.MeasureSpec.makeMeasureSpec(0, 0)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24)).getMethod("A", Object.class, Object.class);
                map2.put(-46730980, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            $11 = ($10 + 111) % 128;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 118 - r7
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = atd.v.runtimeError.$$a
            int r6 = r6 * 3
            int r6 = 4 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L1a
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r8
            goto L31
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L31:
            int r6 = r6 + r1
            int r7 = r7 + 1
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.runtimeError.b(short, int, short, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = 4918416653584386902L;
    }

    static void init$0() {
        $$a = new byte[]{118, -75, 74, 48};
        $$b = 50;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0058, code lost:
    
        if ((r1 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        return com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        r1 = atd.v.runtimeError.getSDKAppID + 119;
        atd.v.runtimeError.getSDKTransactionID = r1 % 128;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getDeviceData() throws java.lang.Throwable {
        /*
            r8 = this;
            int r0 = atd.v.runtimeError.getSDKTransactionID
            int r0 = r0 + 41
            int r1 = r0 % 128
            atd.v.runtimeError.getSDKAppID = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            java.lang.String r4 = "麜쟗Ⰽ镖ﮡ\u20f1襋\uef87哜봮\ue262䢎넜ᙋ粇ꗪ\u0a31獽\ud9dd"
            r5 = 0
            if (r0 != 0) goto L31
            atd.q.AuthenticationRequestParameters r0 = r8.getDeviceData
            double r6 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r5)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            r3 = 207(0xcf, float:2.9E-43)
            int r3 = r3 / r2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            a(r4, r3, r1)
            r1 = r1[r5]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L6c
            goto L4e
        L31:
            atd.q.AuthenticationRequestParameters r0 = r8.getDeviceData
            double r6 = android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(r5)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            int r2 = r2 + 22859
            java.lang.Object[] r1 = new java.lang.Object[r1]
            a(r4, r2, r1)
            r1 = r1[r5]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            java.lang.String r0 = r0.getSDKTransactionID(r1)
            if (r0 == 0) goto L6c
        L4e:
            int r1 = atd.v.runtimeError.getSDKAppID
            int r1 = r1 + 119
            int r2 = r1 % 128
            atd.v.runtimeError.getSDKTransactionID = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L63
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(r0)
            return r0
        L63:
            java.lang.String r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m50constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringValue.m49boximpl(r0)
            r0 = 0
            throw r0
        L6c:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.runtimeError.getDeviceData():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    private runtimeError(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getDeviceData = authenticationRequestParameters;
    }
}
