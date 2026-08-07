package atd.w;

import android.annotation.SuppressLint;
import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f*\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkType;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/telephony/TelephonyManager;", "", "dataNetworkType", "(Landroid/telephony/TelephonyManager;)I", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeStatusReceiver extends InitializeResultSuccess {
    private static int AuthenticationRequestParameters = 0;
    private static byte[] getDeviceData = null;
    private static int getMessageVersion = 1;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/NetworkType$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int getDeviceData;
        private static long getSDKReferenceNumber;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            AuthenticationRequestParameters = 1;
            getSDKReferenceNumber = 2647351916860878301L;
        }

        private AuthenticationRequestParameters() {
        }

        public static void AuthenticationRequestParameters(long j11, long j12) throws Throwable {
            int i11 = AuthenticationRequestParameters + 59;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                byte b11 = $$a[36];
                byte b12 = b11;
                Object[] objArr = new Object[1];
                a(b11, b12, b12, objArr);
                Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
                throw null;
            }
            byte[] bArr = $$a;
            byte b13 = bArr[36];
            byte b14 = b13;
            Object[] objArr2 = new Object[1];
            a(b13, b14, b14, objArr2);
            Class.forName((String) objArr2[0]).getField("getSDKReferenceNumber").get(null);
            try {
                byte b15 = bArr[36];
                byte b16 = b15;
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                byte b17 = (byte) (bArr[18] - 1);
                byte b18 = b17;
                Object[] objArr4 = new Object[1];
                a(b17, b18, b18, objArr4);
                Object objInvoke = cls.getMethod((String) objArr4[0], null).invoke(null, null);
                Object[] objArr5 = {atd.ap.getDeviceData.class.getField("getSDKAppID").get(null)};
                Object[] objArr6 = new Object[1];
                b("Ḳ᪄짂\ue37fṓ\ue790㍆", View.getDefaultSize(0, 0), objArr6);
                int i12 = getDeviceData + 7;
                AuthenticationRequestParameters = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 31 / 0;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
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
        private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 6
                int r8 = r8 + 97
                int r7 = r7 * 37
                int r7 = r7 + 4
                int r6 = r6 * 17
                int r0 = 38 - r6
                byte[] r1 = atd.w.ChallengeStatusReceiver.AuthenticationRequestParameters.$$a
                byte[] r0 = new byte[r0]
                int r6 = 37 - r6
                r2 = 0
                if (r1 != 0) goto L1a
                r8 = r7
                r3 = r1
                r4 = r2
                r1 = r6
                goto L32
            L1a:
                r3 = r2
            L1b:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L28:
                r4 = r1[r7]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r1
                r1 = r5
            L32:
                int r1 = r1 + r7
                int r7 = r8 + 1
                int r8 = r1 + (-8)
                r1 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeStatusReceiver.AuthenticationRequestParameters.a(int, int, short, java.lang.Object[]):void");
        }

        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12 = ($11 + 37) % 128;
            $10 = i12;
            if (str != null) {
                int i13 = i12 + 91;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
            char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(getSDKReferenceNumber ^ 4326518537449951405L, charArray, i11);
            getadditionaldetails.getDeviceData = 4;
            while (true) {
                int i14 = getadditionaldetails.getDeviceData;
                if (i14 >= deviceData.length) {
                    objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                    return;
                }
                int i15 = i14 - 4;
                getadditionaldetails.getSDKTransactionID = i15;
                try {
                    Object[] objArr2 = {Long.valueOf(deviceData[i14] ^ deviceData[i14 % 4]), Long.valueOf(i15), Long.valueOf(getSDKReferenceNumber)};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(-1024136788);
                    if (method == null) {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2749, (char) (54837 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 29);
                        Class cls2 = Long.TYPE;
                        method = cls.getMethod("c", cls2, cls2, cls2);
                        map.put(-1024136788, method);
                    }
                    deviceData[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                    Object method2 = map.get(-719904898);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1400, (char) (16690 - (AudioTrack.getMinVolume() > 0 ? 1 : (AudioTrack.getMinVolume() == 0 ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 22);
                        byte b11 = (byte) (-1);
                        byte b12 = (byte) (b11 + 1);
                        Object[] objArr4 = new Object[1];
                        c(b11, b12, b12, objArr4);
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 4
                int r8 = r8 * 2
                int r0 = 1 - r8
                int r7 = r7 * 2
                int r7 = r7 + 101
                byte[] r1 = atd.w.ChallengeStatusReceiver.AuthenticationRequestParameters.$$d
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L17
                r3 = r1
                r4 = r2
                r1 = r8
                goto L30
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r6 = r6 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r1
                r1 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L30:
                int r7 = -r7
                int r7 = r7 + r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.ChallengeStatusReceiver.AuthenticationRequestParameters.c(byte, byte, short, java.lang.Object[]):void");
        }

        public static void getDeviceData(long j11, long j12) throws Throwable {
            getDeviceData = (AuthenticationRequestParameters + 21) % 128;
            byte[] bArr = $$a;
            byte b11 = bArr[36];
            byte b12 = b11;
            Object[] objArr = new Object[1];
            a(b11, b12, b12, objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            AuthenticationRequestParameters = (getDeviceData + 95) % 128;
            try {
                byte b13 = bArr[36];
                byte b14 = b13;
                Object[] objArr2 = new Object[1];
                a(b13, b14, b14, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b15 = (byte) (bArr[18] - 1);
                byte b16 = b15;
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getSDKReferenceNumber.class.getField("AuthenticationRequestParameters").get(null)};
                Object[] objArr5 = new Object[1];
                b("Ḳ᪄짂\ue37fṓ\ue790㍆", 1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr5);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }

        static void init$0() {
            $$a = new byte[]{29, 18, Tnaf.POW_2_WIDTH, -56, 27, -8, -46, 59, 26, -61, 27, 60, 7, -4, 5, 17, 14, -3, 2, 6, 27, -3, 14, 7, -20, 27, 20, 12, -8, 22, 9, -28, 25, 25, -9, 20, 0, 23, -7, 21, 9, 6, 23, -25, -7, 15, 15, 27, 9, 7, 21, -5, 17, -3, 10, -15, 47, 0, -3, 11, 21};
            $$b = 64;
        }

        static void init$1() {
            $$d = new byte[]{126, 51, 71, 77};
            $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        getSDKTransactionID();
        Process.getThreadPriority(0);
        TextUtils.getCapsMode("", 0, 0);
        Color.green(0);
        KeyEvent.keyCodeFromString("");
        TextUtils.indexOf("", "", 0, 0);
        new AuthenticationRequestParameters((byte) 0);
        AuthenticationRequestParameters = (getMessageVersion + 33) % 128;
    }

    public /* synthetic */ ChallengeStatusReceiver(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    @SuppressLint({"MissingPermission"})
    private static int cC_(TelephonyManager telephonyManager) {
        AuthenticationRequestParameters = (getMessageVersion + 55) % 128;
        int dataNetworkType = telephonyManager.getDataNetworkType();
        int i11 = getMessageVersion + 31;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return dataNetworkType;
        }
        throw null;
    }

    static void getSDKTransactionID() {
        getSDKReferenceNumber = -2113445761;
        getSDKTransactionID = -1568969994;
        getSDKAppID = -1375991325;
        getDeviceData = new byte[]{-68, -67, 83, -2};
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        int i11 = AuthenticationRequestParameters + 39;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0 && Build.VERSION.SDK_INT < 42) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
        if (!BuildConfig() && !getMessageVersion()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        AuthenticationRequestParameters = (getMessageVersion + 115) % 128;
        DeviceParameterResult.Success.IntValue intValueM35boximpl = DeviceParameterResult.Success.IntValue.m35boximpl(DeviceParameterResult.Success.IntValue.m36constructorimpl(cC_(telephonyManagerCF_)));
        int i12 = getMessageVersion + 9;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            return intValueM35boximpl;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ChallengeStatusReceiver(Application application, PermissionChecker permissionChecker) {
        super(application, permissionChecker);
        s.k(application, "");
        s.k(permissionChecker, "");
    }
}
