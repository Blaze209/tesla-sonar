package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
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
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AndroidId;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isHexadecimalWith8bytes", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static long getSDKAppID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/AndroidId$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getSDKReferenceNumber();
        TextUtils.getCapsMode("", 0, 0);
        new getSDKTransactionID((byte) 0);
        int i11 = AuthenticationRequestParameters + 9;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ getSDKReferenceNumber(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12 = $10 + 107;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 17) % 128;
        } else {
            charArray = str;
        }
        atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
        char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(getSDKAppID ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i13 = getadditionaldetails.getDeviceData;
            if (i13 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            int i14 = i13 - 4;
            getadditionaldetails.getSDKTransactionID = i14;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i13] ^ deviceData[i13 % 4]), Long.valueOf(i14), Long.valueOf(getSDKAppID)};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + 2749, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 54838), 29 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionGroup(0L) + 1401, (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16690), 22 - Color.argb(0, 0, 0, 0));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r7 = r7 * 4
            int r7 = r7 + 101
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = atd.v.getSDKReferenceNumber.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2f:
            int r7 = r7 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.getSDKReferenceNumber.b(int, byte, int, java.lang.Object[]):void");
    }

    private static boolean getSDKReferenceNumber(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a("댓帟덈뼩䝻햐趬鹕혢ₖ⢷撝禞붭䈼쌧", ViewConfiguration.getMaximumFlingVelocity() >> 16, objArr);
        if (new q(((String) objArr[0]).intern()).i(str)) {
            int i11 = getDeviceData + 27;
            AuthenticationRequestParameters = i11 % 128;
            int i12 = i11 % 2;
            int length = str.length();
            if (i12 != 0 ? length == 16 : length == 89) {
                AuthenticationRequestParameters = (getDeviceData + 7) % 128;
                return true;
            }
        }
        return false;
    }

    static void init$0() {
        $$a = new byte[]{86, -59, -39, 110};
        $$b = 164;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    /* JADX WARN: Code duplicated, block: B:9:0x0043 A[PHI: r0
      0x0043: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v12 java.lang.String) binds: [B:8:0x0041, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        String sDKTransactionID;
        int i11 = getDeviceData + 121;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
            Object[] objArr = new Object[1];
            a("벋갇볪봋딽뤄过\uf28a\ud9b4틊⪗ࠗ療侗", View.resolveSize(0, 1), objArr);
            sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
            if (sDKTransactionID != null) {
                if (getSDKReferenceNumber(sDKTransactionID)) {
                    AuthenticationRequestParameters = (getDeviceData + 41) % 128;
                } else {
                    sDKTransactionID = null;
                }
                if (sDKTransactionID != null) {
                    return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
                }
            }
        } else {
            atd.q.AuthenticationRequestParameters authenticationRequestParameters2 = this.getSDKReferenceNumber;
            Object[] objArr2 = new Object[1];
            a("벋갇볪봋딽뤄过\uf28a\ud9b4틊⪗ࠗ療侗", View.resolveSize(0, 0), objArr2);
            sDKTransactionID = authenticationRequestParameters2.getSDKTransactionID(((String) objArr2[0]).intern());
            if (sDKTransactionID != null) {
                if (getSDKReferenceNumber(sDKTransactionID)) {
                    AuthenticationRequestParameters = (getDeviceData + 41) % 128;
                } else {
                    sDKTransactionID = null;
                }
                if (sDKTransactionID != null) {
                    return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
                }
            }
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = -895333690180580871L;
    }

    private getSDKReferenceNumber(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
