package atd.o;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.graphics.Color;
import android.os.Build;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultError;
import com.adyen.threeds2.internal.deviceinfo.parameter.DefaultPermissionChecker;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.PermissionChecker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0004J\b\u0010\u000f\u001a\u00020\u000eH\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/bluetooth/BluetoothDeviceParameter;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", Kind.APPLICATION, "Landroid/app/Application;", "permissionChecker", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/PermissionChecker;)V", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "getAdapter", "isBluetoothPermissionGranted", "", "isLocalMacAddressPermissionGranted", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int ChallengeResultCancelled;
    private static int getSDKTransactionID;
    private final BluetoothAdapter getDeviceData;
    private final PermissionChecker getSDKAppID;
    private final Application getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters = new char[]{30815, 30969, 30958, 30963, 30962, 30959, 30961, 30959, 30960, 30800, 30945, 30946, 30943, 30945, 30953, 30946, 30946, 30953, 30956, 30951, 30934, 30923, 30921, 30919, 30912, 30916, 30922, 30953, 30947, 30918, 30919, 30915, 30919, 30914, 31039, 30914, 30916, 30914, 30946, 30968, 30955, 30944, 30949, 30948, 30945, 30824, 30861, 30859, 30857, 30850, 30854, 30860, 30891, 30885, 30856, 30857, 30853, 30857, 30852, 30849, 30852, 30854, 30852, 30884, 30906, 30893, 30882, 30887, 30886, 30883, 30885, 30883, 30884, 30905, 31019, 31017, 31015, 31008, 31012, 31018, 30921, 30915, 31014, 31015, 31011, 31015, 31010, 31007, 31010, 31012, 31010, 30914, 30933, 30917, 30921, 30926, 30922, 31037, 31034, 30923, 30926, 30913, 30912, 30926, 30924, 30919, 30919, 30916, 31039};
    }

    public /* synthetic */ getSDKReferenceNumber(Application application) {
        this(application, new DefaultPermissionChecker(application));
    }

    private static void a(boolean z11, int[] iArr, String str, Object[] objArr) throws Throwable {
        Object bytes;
        int i11;
        int i12;
        int i13;
        Class<Object> cls;
        int length;
        char[] cArr;
        Object method;
        String str2 = str;
        Class<Object> cls2 = Object.class;
        Integer num = -399400818;
        int i14 = $11;
        int i15 = i14 + 21;
        $10 = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        if (str2 != null) {
            int i16 = i14 + 119;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                bytes = str2;
                int i17 = 85 / 0;
                bytes = str2.getBytes("ISO-8859-1");
            } else {
                bytes = str2;
                bytes = str2.getBytes("ISO-8859-1");
            }
        }
        bytes = str2;
        byte[] bArr = (byte[]) bytes;
        ChallengeResultError challengeResultError = new ChallengeResultError();
        int i18 = iArr[0];
        int i19 = iArr[1];
        int i21 = iArr[2];
        int i22 = iArr[3];
        char[] cArr2 = AuthenticationRequestParameters;
        int i23 = 2;
        Class cls3 = Integer.TYPE;
        if (cArr2 != null) {
            int i24 = $10 + 93;
            $11 = i24 % 128;
            if (i24 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i25 = 0;
            while (i25 < length) {
                try {
                    int i26 = i25;
                    Object[] objArr2 = {Integer.valueOf(cArr2[i25])};
                    int i27 = length;
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2312 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), AndroidCharacter.getMirror('0') - 24);
                        byte b11 = (byte) ($$b & 6);
                        byte b12 = (byte) (b11 - 2);
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 1), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr[i26] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i25 = i26 + 1;
                    length = i27;
                    i21 = i21;
                    cArr = cArr;
                    cArr2 = cArr2;
                    i22 = i22;
                    cls2 = cls2;
                    num = num;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        Class<Object> cls5 = cls2;
        Integer num2 = num;
        int i28 = i21;
        int i29 = i22;
        char[] cArr3 = new char[i19];
        System.arraycopy(cArr2, i18, cArr3, 0, i19);
        if (bArr != 0) {
            char[] cArr4 = new char[i19];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i31 = challengeResultError.getSDKAppID;
                if (i31 >= i19) {
                    break;
                }
                if (bArr[i31] == 1) {
                    $10 = ($11 + 123) % 128;
                    char c12 = cArr3[i31];
                    Object[] objArr4 = new Object[i23];
                    objArr4[1] = Integer.valueOf(c11);
                    objArr4[0] = Integer.valueOf(c12);
                    Map map2 = getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) getMessageVersion.getSDKTransactionID(558 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 5486), 23 - TextUtils.getTrimmedLength(""));
                        byte b13 = (byte) ($$b & 7);
                        byte b14 = (byte) (b13 - 3);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 - 1), objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr4[i31] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr3 = cArr3;
                    Object[] objArr6 = {Integer.valueOf(cArr3[i31]), Integer.valueOf(c11)};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) getMessageVersion.getSDKTransactionID(201 - Color.argb(0, 0, 0, 0), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), MotionEvent.axisFromString("") + 25)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr4[i31] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = getMessageVersion.timedout;
                Integer num3 = num2;
                Object method4 = map4.get(num3);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) getMessageVersion.getSDKTransactionID(854 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) KeyEvent.keyCodeFromString(""), 24 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr8);
                    cls = cls5;
                    method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                    map4.put(num3, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                num2 = num3;
                cls5 = cls;
                cArr3 = cArr3;
                cArr4 = cArr4;
                i23 = 2;
            }
            cArr3 = cArr4;
        }
        if (i29 > 0) {
            int i32 = $10 + 33;
            $11 = i32 % 128;
            if (i32 % 2 == 0) {
                char[] cArr5 = new char[i19];
                i11 = 0;
                System.arraycopy(cArr3, 1, cArr5, 0, i19);
                int i33 = i19 >>> i29;
                System.arraycopy(cArr5, 0, cArr3, i33, i29);
                System.arraycopy(cArr5, i29, cArr3, 1, i33);
            } else {
                i11 = 0;
                char[] cArr6 = new char[i19];
                System.arraycopy(cArr3, 0, cArr6, 0, i19);
                int i34 = i19 - i29;
                System.arraycopy(cArr6, 0, cArr3, i34, i29);
                System.arraycopy(cArr6, i29, cArr3, 0, i34);
            }
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr7 = new char[i19];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i35 = challengeResultError.getSDKAppID;
                if (i35 >= i19) {
                    break;
                }
                int i36 = $10 + 49;
                $11 = i36 % 128;
                if (i36 % 2 == 0) {
                    cArr7[i35] = cArr3[i19 >> i35];
                    i13 = i35 << 1;
                } else {
                    cArr7[i35] = cArr3[(i19 - i35) - 1];
                    i13 = i35 + 1;
                }
                challengeResultError.getSDKAppID = i13;
            }
            cArr3 = cArr7;
        }
        if (i28 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i37 = challengeResultError.getSDKAppID;
                if (i37 >= i19) {
                    break;
                }
                int i38 = $10 + 67;
                $11 = i38 % 128;
                if (i38 % 2 == 0) {
                    cArr3[i37] = (char) (cArr3[i37] >>> iArr[3]);
                    i12 = i37 << 1;
                } else {
                    cArr3[i37] = (char) (cArr3[i37] - iArr[2]);
                    i12 = i37 + 1;
                }
                challengeResultError.getSDKAppID = i12;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.o.getSDKReferenceNumber.$$a
            int r7 = r7 * 2
            int r7 = 104 - r7
            int r9 = r9 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r9 = r9 + r3
            r3 = r9
            r9 = r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.o.getSDKReferenceNumber.b(short, short, int, java.lang.Object[]):void");
    }

    private final BluetoothAdapter ci_() throws Throwable {
        ChallengeResultCancelled = (getSDKTransactionID + 13) % 128;
        Application application = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a(false, new int[]{0, 9, 96, 0}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000", objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        if (bluetoothManager == null) {
            return null;
        }
        ChallengeResultCancelled = (getSDKTransactionID + 87) % 128;
        return bluetoothManager.getAdapter();
    }

    static void init$0() {
        $$a = new byte[]{93, -72, -53, -77};
        $$b = 187;
    }

    public final BluetoothAdapter ch_() {
        int i11 = getSDKTransactionID + 21;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getDeviceData;
        }
        int i12 = 4 / 0;
        return this.getDeviceData;
    }

    protected final boolean getMessageVersion() throws Throwable {
        ChallengeResultCancelled = (getSDKTransactionID + 13) % 128;
        PermissionChecker permissionChecker = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a(false, new int[]{73, 36, 174, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0000", objArr);
        boolean sDKAppID = permissionChecker.getSDKAppID(((String) objArr[0]).intern());
        getSDKTransactionID = (ChallengeResultCancelled + 13) % 128;
        return sDKAppID;
    }

    protected final boolean getSDKReferenceNumber() throws Throwable {
        if (Build.VERSION.SDK_INT >= 31) {
            ChallengeResultCancelled = (getSDKTransactionID + 23) % 128;
            PermissionChecker permissionChecker = this.getSDKAppID;
            Object[] objArr = new Object[1];
            a(false, new int[]{9, 36, 142, 11}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001", objArr);
            return permissionChecker.getSDKAppID(((String) objArr[0]).intern());
        }
        PermissionChecker permissionChecker2 = this.getSDKAppID;
        Object[] objArr2 = new Object[1];
        a(false, new int[]{45, 28, 76, 0}, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000", objArr2);
        boolean sDKAppID = permissionChecker2.getSDKAppID(((String) objArr2[0]).intern());
        int i11 = ChallengeResultCancelled + 3;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            return sDKAppID;
        }
        throw null;
    }

    public getSDKReferenceNumber(Application application, PermissionChecker permissionChecker) {
        s.k(application, "");
        s.k(permissionChecker, "");
        this.getSDKReferenceNumber = application;
        this.getSDKAppID = permissionChecker;
        this.getDeviceData = ci_();
    }
}
