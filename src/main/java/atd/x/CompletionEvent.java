package atd.x;

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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/UserRotation;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "", "isValid", "(Ljava/lang/String;)Z", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompletionEvent extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private final atd.q.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/UserRotation$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKReferenceNumber = 0;
        getDeviceData = 1;
        getSDKTransactionID();
        ExpandableListView.getPackedPositionForGroup(0);
        new getSDKAppID((byte) 0);
        int i11 = getSDKReferenceNumber + 75;
        getDeviceData = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public /* synthetic */ CompletionEvent(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0227  */
    /* JADX WARN: Code duplicated, block: B:52:0x0228  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        $10 = ($11 + 105) % 128;
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
            int i15 = $10 + 31;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            Class cls = Integer.TYPE;
            if (i16 == 0) {
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
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(690 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (16022 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 31);
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() | (getSDKAppID / (-2227742522694838850L));
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        int i17 = i12;
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (Color.alpha(i12) + 29017), Color.argb(i17, i17, i17, i17) + 24)).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    jArr = jArr;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                long[] jArr2 = jArr;
                Object[] objArr5 = {Integer.valueOf(charArray[i14]), gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(962978490);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 688, (char) (16022 - View.resolveSize(0, 0)), TextUtils.getCapsMode("", 0, 0) + 32);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], cls, Object.class, Object.class);
                    map2.put(962978490, method3);
                }
                jArr2[i14] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (getSDKAppID ^ (-2227742522694838850L));
                Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                Object method4 = map2.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetBefore("", 0) + 417, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 29017), 24 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                jArr = jArr2;
                charArray = charArray;
            }
            i13 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = charArray;
        long[] jArr3 = jArr;
        char[] cArr2 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        $10 = ($11 + 37) % 128;
        while (true) {
            int i18 = gettransactionstatus.getSDKTransactionID;
            char[] cArr3 = cArr;
            if (i18 >= cArr3.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            cArr2[i18] = (char) jArr3[i18];
            Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method5 = map3.get(-46730980);
            if (method5 == null) {
                method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 418, (char) (29018 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 24)).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method5);
            }
            ((Method) method5).invoke(null, objArr8);
            cArr = cArr3;
        }
    }

    private static void b(byte b11, int i11, int i12, Object[] objArr) {
        int i13 = (i11 * 3) + 118;
        int i14 = i12 * 2;
        byte[] bArr = $$a;
        int i15 = (b11 * 4) + 4;
        byte[] bArr2 = new byte[i14 + 1];
        int i16 = -1;
        if (bArr == null) {
            i15++;
            i13 = i14 + i15;
        }
        while (true) {
            i16++;
            bArr2[i16] = (byte) i13;
            if (i16 == i14) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b12 = bArr[i15];
                i15++;
                i13 += b12;
            }
        }
    }

    private static boolean getSDKAppID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a("\u05cb䋫謷큃ᢏ憺", 18252 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
        boolean zI = new q(((String) objArr[0]).intern()).i(str);
        int i11 = getDeviceData + 17;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return zI;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        getSDKAppID = 2530039786955132974L;
    }

    static void init$0() {
        $$a = new byte[]{86, -59, -39, 110};
        $$b = 95;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        getSDKReferenceNumber = (getDeviceData + 63) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        a("ץ遬⻫앏右\uee29蒥ግꦉ䟣퉯棚݊", (ViewConfiguration.getLongPressTimeout() >> 16) + 38287, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            if (!getSDKAppID(sDKTransactionID)) {
                sDKTransactionID = null;
            }
            if (sDKTransactionID != null) {
                DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
                getDeviceData = (getSDKReferenceNumber + 47) % 128;
                return stringValueM49boximpl;
            }
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getSDKReferenceNumber = (getDeviceData + 43) % 128;
        return failure;
    }

    private CompletionEvent(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.AuthenticationRequestParameters = authenticationRequestParameters;
    }
}
