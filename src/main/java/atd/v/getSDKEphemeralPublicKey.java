package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledAccessibilityServices;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/EnabledAccessibilityServices$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKAppID = 1;
        getSDKTransactionID();
        Color.green(0);
        TextUtils.indexOf((CharSequence) "", '0', 0);
        TextUtils.indexOf("", "");
        new getSDKReferenceNumber((byte) 0);
        int i11 = AuthenticationRequestParameters + 57;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ getSDKEphemeralPublicKey(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x01bb  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        char[] charArray;
        int i14;
        Throwable cause;
        int i15;
        Object method;
        int i16 = 2;
        int i17 = 0;
        if (str != null) {
            int i18 = $10 + 57;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                charArray = str.toCharArray();
                int i19 = 97 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr2 = new char[i12];
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i21 = getmessageversion.getDeviceData;
            if (i21 >= i12) {
                break;
            }
            $11 = ($10 + 41) % 128;
            char c11 = cArr[i21];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr2[i21] = c12;
            try {
                Object[] objArr2 = new Object[i16];
                objArr2[1] = Integer.valueOf(getSDKTransactionID);
                objArr2[i17] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object obj = map.get(139968170);
                if (obj != null) {
                    method = obj;
                    i15 = i17;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1187 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ExpandableListView.getPackedPositionForChild(i17, i17) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i17, i17) == 0L ? 0 : -1)) + 1), 46 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte b11 = (byte) i17;
                    byte b12 = b11;
                    i15 = i17;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr2[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    int i22 = i15;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + 1721, (char) (48634 - View.MeasureSpec.getMode(i15)), TextUtils.getCapsMode("", i22, i22) + 24);
                    byte b13 = (byte) ($$b & 3);
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                cArr = cArr;
                i16 = 2;
                i17 = 0;
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
        if (i13 > 0) {
            $11 = ($10 + 47) % 128;
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr3 = new char[i12];
            i14 = 0;
            System.arraycopy(cArr2, 0, cArr3, 0, i12);
            int i23 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, 0, cArr2, i12 - i23, i23);
            int i24 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i24, cArr2, 0, i12 - i24);
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr4 = new char[i12];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i25 = getmessageversion.getDeviceData;
                if (i25 >= i12) {
                    break;
                }
                cArr4[i25] = cArr2[(i12 - i25) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 1722, (char) (48634 - TextUtils.getOffsetAfter("", 0)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                    byte b15 = (byte) ($$b & 3);
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            $10 = ($11 + 111) % 128;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 68 - r5
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = atd.v.getSDKEphemeralPublicKey.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r6
            r5 = r7
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            r4 = r0[r7]
        L29:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.getSDKEphemeralPublicKey.b(byte, byte, byte, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = 1029304959;
    }

    static void init$0() {
        $$a = new byte[]{29, -9, 65, -64};
        $$b = 13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0068, code lost:
    
        r1 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (r0.hasNext() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        r2 = atd.v.getSDKEphemeralPublicKey.getSDKAppID + 105;
        atd.v.getSDKEphemeralPublicKey.AuthenticationRequestParameters = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
    
        if ((r2 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0085, code lost:
    
        r2 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
    
        if (p013kotlin.text.t.y0((java.lang.String) r2) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
    
        r1.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        p013kotlin.text.t.y0((java.lang.String) r0.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        return com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m56boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m57constructorimpl(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
    
        if (r0 != null) goto L11;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getDeviceData() throws java.lang.Throwable {
        /*
            r15 = this;
            int r0 = atd.v.getSDKEphemeralPublicKey.AuthenticationRequestParameters
            int r0 = r0 + 25
            int r0 = r0 % 128
            atd.v.getSDKEphemeralPublicKey.getSDKAppID = r0
            atd.q.AuthenticationRequestParameters r0 = r15.getSDKReferenceNumber
            int r1 = android.os.Process.myPid()
            int r1 = r1 >> 22
            int r2 = r1 + 127
            long r3 = android.os.SystemClock.uptimeMillis()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r4 = 31 - r1
            r1 = 0
            int r3 = android.view.View.MeasureSpec.getSize(r1)
            int r6 = 26 - r3
            r8 = 1
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r3 = 0
            java.lang.String r5 = "\u0003￼\ufffb\ufff6\ufff8\ufffa\ufffa￼\n\n\u0000\ufff9\u0000\u0003\u0000\u000b\u0010\ufff6\n￼\t\r\u0000\ufffa￼\n￼\u0005\ufff8\ufff9"
            a(r2, r3, r4, r5, r6, r7)
            r2 = r7[r1]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            java.lang.String r9 = r0.getSDKTransactionID(r2)
            if (r9 == 0) goto Laa
            int r0 = atd.v.getSDKEphemeralPublicKey.AuthenticationRequestParameters
            int r0 = r0 + 57
            int r2 = r0 % 128
            atd.v.getSDKEphemeralPublicKey.getSDKAppID = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L58
            char[] r10 = new char[r8]
            r0 = 23
            r10[r8] = r0
            r13 = 114(0x72, float:1.6E-43)
            r14 = 0
            r11 = 0
            r12 = 0
            java.util.List r0 = p013kotlin.text.t.e1(r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto Laa
            goto L68
        L58:
            char[] r10 = new char[r8]
            r0 = 44
            r10[r1] = r0
            r13 = 6
            r14 = 0
            r11 = 0
            r12 = 0
            java.util.List r0 = p013kotlin.text.t.e1(r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto Laa
        L68:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L73:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La1
            int r2 = atd.v.getSDKEphemeralPublicKey.getSDKAppID
            int r2 = r2 + 105
            int r3 = r2 % 128
            atd.v.getSDKEphemeralPublicKey.AuthenticationRequestParameters = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L96
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = p013kotlin.text.t.y0(r3)
            if (r3 != 0) goto L73
            r1.add(r2)
            goto L73
        L96:
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            p013kotlin.text.t.y0(r0)
            r0 = 0
            throw r0
        La1:
            java.util.List r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m57constructorimpl(r1)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$StringsListValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.StringsListValue.m56boximpl(r0)
            return r0
        Laa:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.getSDKEphemeralPublicKey.getDeviceData():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    private getSDKEphemeralPublicKey(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
