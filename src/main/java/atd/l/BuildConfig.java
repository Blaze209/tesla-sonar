package atd.l;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u000e*\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/IpAddress;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "permissionChecker", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "findIpAddress", "()Ljava/lang/String;", "", "areInternetPermissionsGranted", "()Z", "Ljava/net/InetAddress;", "isPhysicalAddress", "(Ljava/net/InetAddress;)Z", "isInet4Or6Address", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildConfig extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static char getSDKAppID;
    private static char getSDKReferenceNumber;
    private final PermissionChecker getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/IpAddress$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID();
        ViewConfiguration.getScrollDefaultDelay();
        new getSDKReferenceNumber((byte) 0);
        int i11 = ChallengeResultCancelled + 27;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 44 / 0;
        }
    }

    public /* synthetic */ BuildConfig(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    private static boolean AuthenticationRequestParameters(InetAddress inetAddress) {
        BuildConfig = (ChallengeResultCancelled + 55) % 128;
        if (inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress()) {
            return false;
        }
        int i11 = BuildConfig + 51;
        ChallengeResultCancelled = i11 % 128;
        return i11 % 2 != 0;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12 = $10;
        $11 = (i12 + 37) % 128;
        int i13 = 2;
        int i14 = 0;
        if (str != null) {
            int i15 = i12 + 125;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                charArray = str.toCharArray();
                int i16 = 17 / 0;
            } else {
                charArray = str.toCharArray();
            }
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.ChallengeStatusHandler challengeStatusHandler = new atd.az.ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        challengeStatusHandler.getSDKReferenceNumber = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i17 = challengeStatusHandler.getSDKReferenceNumber;
            if (i17 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            $10 = ($11 + 125) % 128;
            cArr3[i14] = cArr[i17];
            int i18 = 1;
            cArr3[1] = cArr[i17 + 1];
            int i19 = 58224;
            int i21 = i14;
            while (i21 < 16) {
                char c11 = cArr3[i18];
                char c12 = cArr3[i14];
                int i22 = i13;
                int i23 = i14;
                int i24 = (c12 + i19) ^ ((c12 << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                int i25 = c12 >>> 5;
                int i26 = i18;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getDeviceData);
                    objArr2[i22] = Integer.valueOf(i25);
                    objArr2[i26] = Integer.valueOf(i24);
                    objArr2[i23] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method == null) {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - KeyEvent.normalizeMetaState(i23), (char) (16682 - KeyEvent.keyCodeFromString("")), 29 - KeyEvent.keyCodeFromString(""));
                        byte b11 = (byte) i26;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[i26];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i23], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c13 = cArr3[i23];
                    int i27 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) getSDKAppID) ^ (-2881362678149017980L))));
                    int i28 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr4[i22] = Integer.valueOf(i28);
                    objArr4[1] = Integer.valueOf(i27);
                    objArr4[i23] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - View.getDefaultSize(i23, i23), (char) (16681 - ImageFormat.getBitsPerPixel(i23)), 29 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b13 = (byte) 1;
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i19 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i21++;
                    i13 = i22;
                    cArr = cArr;
                    cArr3 = cArr3;
                    i14 = 0;
                    i18 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr;
            int i29 = i13;
            char[] cArr5 = cArr3;
            int i31 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i31] = cArr5[0];
            cArr2[i31 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i29];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1596 - ExpandableListView.getPackedPositionType(0L), (char) (27823 - TextUtils.indexOf((CharSequence) "", '0')), 26 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                b(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = i29;
            cArr = cArr4;
            cArr3 = cArr5;
            i14 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 4
            int r5 = 116 - r5
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r1 = atd.l.BuildConfig.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r1[r6]
        L28:
            int r6 = r6 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.BuildConfig.b(byte, short, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        return getSDKReferenceNumber(objArr);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) throws SocketException {
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
            ChallengeResultCancelled = (BuildConfig + 39) % 128;
            while (inetAddresses.hasMoreElements()) {
                int i11 = ChallengeResultCancelled + 121;
                BuildConfig = i11 % 128;
                if (i11 % 2 != 0) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    s.h(inetAddressNextElement);
                    AuthenticationRequestParameters(inetAddressNextElement);
                    throw null;
                }
                InetAddress inetAddressNextElement2 = inetAddresses.nextElement();
                s.h(inetAddressNextElement2);
                if (AuthenticationRequestParameters(inetAddressNextElement2) && getSDKTransactionID(inetAddressNextElement2)) {
                    int i12 = BuildConfig + 11;
                    ChallengeResultCancelled = i12 % 128;
                    if (i12 % 2 != 0) {
                        return inetAddressNextElement2.getHostAddress();
                    }
                    inetAddressNextElement2.getHostAddress();
                    throw null;
                }
            }
        }
        return null;
    }

    private static boolean getSDKTransactionID(InetAddress inetAddress) {
        int i11 = (ChallengeResultCancelled + 113) % 128;
        BuildConfig = i11;
        if ((inetAddress instanceof Inet4Address) || (inetAddress instanceof Inet6Address)) {
            return true;
        }
        ChallengeResultCancelled = (i11 + 85) % 128;
        return false;
    }

    static void init$0() {
        $$a = new byte[]{86, -59, -39, 110};
        $$b = 84;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        int i11 = ChallengeResultCancelled + 7;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKReferenceNumber();
            throw null;
        }
        if (!getSDKReferenceNumber()) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.MISSING_PERMISSION);
        }
        String str = (String) getSDKAppID(new Object[0], 1961001557, -1961001557, (int) System.currentTimeMillis());
        if (str == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(str));
        BuildConfig = (ChallengeResultCancelled + 19) % 128;
        return stringValueM49boximpl;
    }

    private static String AuthenticationRequestParameters() {
        return (String) getSDKAppID(new Object[0], 1961001557, -1961001557, (int) System.currentTimeMillis());
    }

    static void getSDKTransactionID() {
        getSDKAppID = (char) 27025;
        AuthenticationRequestParameters = (char) 51060;
        getSDKReferenceNumber = (char) 9858;
        getDeviceData = (char) 14085;
    }

    private BuildConfig(Application application, PermissionChecker permissionChecker) {
        s.k(application, "");
        s.k(permissionChecker, "");
        this.getSDKTransactionID = permissionChecker;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x0048  */
    private final boolean getSDKReferenceNumber() throws Throwable {
        PermissionChecker permissionChecker;
        Object[] objArr;
        int i11 = ChallengeResultCancelled + 17;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            PermissionChecker permissionChecker2 = this.getSDKTransactionID;
            Object[] objArr2 = new Object[1];
            a("䓮佂禍躵\ue551ꤡ\uedf5㤝쁧ⴹ赡襻뚌䷸쓭鞘ᇍ甆\ue773铦⮩燮⁐\ued5e蔈ȁ薕쑃", 110 % Drawable.resolveOpacity(1, 0), objArr2);
            if (permissionChecker2.getSDKAppID(((String) objArr2[0]).intern())) {
                permissionChecker = this.getSDKTransactionID;
                objArr = new Object[1];
                a("䓮佂禍躵\ue551ꤡ\uedf5㤝쁧ⴹ赡襻뚌䷸쓭鞘ᇍ甆擊杹辵뷓껣鍎좙훉蔈ȁꉅ邟\ue58e뚋\ue2d3撺螴䷬鰃ዖ释ﺛ", Color.alpha(0) + 39, objArr);
                if (permissionChecker.getSDKAppID(((String) objArr[0]).intern())) {
                    BuildConfig = (ChallengeResultCancelled + 75) % 128;
                    return true;
                }
            }
        } else {
            PermissionChecker permissionChecker3 = this.getSDKTransactionID;
            Object[] objArr3 = new Object[1];
            a("䓮佂禍躵\ue551ꤡ\uedf5㤝쁧ⴹ赡襻뚌䷸쓭鞘ᇍ甆\ue773铦⮩燮⁐\ued5e蔈ȁ薕쑃", Drawable.resolveOpacity(0, 0) + 27, objArr3);
            if (permissionChecker3.getSDKAppID(((String) objArr3[0]).intern())) {
                permissionChecker = this.getSDKTransactionID;
                objArr = new Object[1];
                a("䓮佂禍躵\ue551ꤡ\uedf5㤝쁧ⴹ赡襻뚌䷸쓭鞘ᇍ甆擊杹辵뷓껣鍎좙훉蔈ȁꉅ邟\ue58e뚋\ue2d3撺螴䷬鰃ዖ释ﺛ", Color.alpha(0) + 39, objArr);
                if (permissionChecker.getSDKAppID(((String) objArr[0]).intern())) {
                    BuildConfig = (ChallengeResultCancelled + 75) % 128;
                    return true;
                }
            }
        }
        return false;
    }
}
