package atd.x;

import android.app.Application;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Ringtone;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCompleted extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/system/Ringtone$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        getSDKTransactionID();
        Process.myPid();
        new AuthenticationRequestParameters((byte) 0);
        getSDKAppID = (getSDKReferenceNumber + 47) % 128;
    }

    public /* synthetic */ ChallengeResultCompleted(Application application) {
        this(application, new atd.q.getSDKAppID(application));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0240  */
    /* JADX WARN: Code duplicated, block: B:53:0x0241  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        Throwable cause;
        char c11;
        int i12;
        Object method;
        char c12 = 1;
        if (str != null) {
            $10 = ($11 + 1) % 128;
            charArray = str.toCharArray();
            $10 = ($11 + 123) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = cArr.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        $11 = ($10 + 99) % 128;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= cArr.length) {
                break;
            }
            int i15 = $11 + 53;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            Class cls = Integer.TYPE;
            if (i16 != 0) {
                char c13 = cArr[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = gettransactionstatus;
                    objArr2[c12] = gettransactionstatus;
                    objArr2[i13] = Integer.valueOf(c13);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(962978490);
                    if (obj != null) {
                        method = obj;
                        c11 = '0';
                        i12 = i13;
                    } else {
                        c11 = '0';
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(690 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 16022), 32 - (TypedValue.complexToFraction(i13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i13, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKTransactionID - 2227742522694838850L);
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        int i17 = i12;
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(465 - AndroidCharacter.getMirror(c11), (char) (29017 - KeyEvent.getDeadChar(i17, i17)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24)).getMethod("A", Object.class, Object.class);
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
                Object[] objArr5 = {Integer.valueOf(cArr[i14]), gettransactionstatus, gettransactionstatus};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(962978490);
                if (method3 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getOffsetAfter("", 0) + 689, (char) (16021 - TextUtils.lastIndexOf("", '0', 0)), 32 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], cls, Object.class, Object.class);
                    map2.put(962978490, method3);
                }
                jArr2[i14] = ((Long) ((Method) method3).invoke(null, objArr5)).longValue() ^ (getSDKTransactionID ^ (-2227742522694838850L));
                Object[] objArr7 = {gettransactionstatus, gettransactionstatus};
                Object method4 = map2.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0) + 417, (char) (29016 - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionGroup(0L) + 24)).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                jArr = jArr2;
                cArr = cArr;
            }
            c12 = 1;
            i13 = 0;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr2 = cArr;
        long[] jArr3 = jArr;
        char[] cArr3 = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i18 = gettransactionstatus.getSDKTransactionID;
            char[] cArr4 = cArr2;
            if (i18 >= cArr4.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i18] = (char) jArr3[i18];
            Object[] objArr8 = {gettransactionstatus, gettransactionstatus};
            Map map3 = atd.a.getMessageVersion.timedout;
            Object method5 = map3.get(-46730980);
            if (method5 == null) {
                method5 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (29017 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23)).getMethod("A", Object.class, Object.class);
                map3.put(-46730980, method5);
            }
            ((Method) method5).invoke(null, objArr8);
            $10 = ($11 + 35) % 128;
            cArr2 = cArr4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.x.ChallengeResultCompleted.$$a
            int r8 = r8 * 2
            int r8 = 118 - r8
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r7 = r7 * 2
            int r1 = 1 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L1a
            r8 = r6
            r3 = r0
            r4 = r2
            r0 = r7
            goto L32
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L32:
            int r6 = -r6
            int r6 = r6 + r0
            int r8 = r8 + 1
            r0 = r8
            r8 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.x.ChallengeResultCompleted.b(int, int, byte, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        getSDKTransactionID = 108918605757979110L;
    }

    static void init$0() {
        $$a = new byte[]{68, 46, 5, 3};
        $$b = 26;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        getSDKAppID = (getSDKReferenceNumber + 109) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getDeviceData;
        Object[] objArr = new Object[1];
        a("䰪ꖐ齴\uf0dc\ueaa8\udc12㗰⽚", 59809 - View.MeasureSpec.getMode(0), objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null) {
            getSDKReferenceNumber = (getSDKAppID + 9) % 128;
            return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(sDKTransactionID));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getSDKReferenceNumber = (getSDKAppID + 61) % 128;
        return failure;
    }

    private ChallengeResultCompleted(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getDeviceData = authenticationRequestParameters;
    }
}
