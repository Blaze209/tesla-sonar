package atd.v;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SkipFirstUseHints;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCompletion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getDeviceData;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/secure/SkipFirstUseHints$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private getDeviceData() {
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters();
        new getDeviceData((byte) 0);
        int i11 = getSDKTransactionID + 75;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 41 / 0;
        }
    }

    public /* synthetic */ onCompletion(Application application) {
        this(application, new atd.q.getDeviceData(application));
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = new char[]{30823, 30864, 30871, 30869, 30872, 30879, 30872, 30866, 30863, 30860, 30870, 30871, 30861, 30869, 30879, 30876, 30873, 30868, 30862, 30860, 30731, 30809, 30807, 30803, 30825, 30822, 30807, 30802, 30797, 30792, 30808, 30846, 30830, 30799, 30832, 30839, 30808, 30802, 30798, 30805, 30807, 30809, 30732, 30806, 30808, 30806, 30799, 30802, 30810, 30821, 30821, 30813, 30808, 30798, 30800, 30805, 30807, 30731, 30811, 30805, 30805, 30841, 30835, 30808, 30809, 30804, 30836, 30846, 30808, 30792, 30797, 30802, 30807, 30730, 30808, 30810, 30807, 30799, 30800, 30800, 30792, 30814, 30826, 30804, 30803, 30827, 30823, 30807, 30810, 30847, 30905, 30909, 30784};
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
        int i12 = 0;
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = iArr[2];
        int i16 = iArr[3];
        char[] cArr = AuthenticationRequestParameters;
        Class cls3 = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            while (i12 < length) {
                byte[] bArr2 = bArr;
                $10 = ($11 + 119) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i12])};
                    int i17 = i12;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1708792688);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2312, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls3);
                        map.put(-1708792688, method);
                    }
                    cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12 = i17 + 1;
                    bArr = bArr2;
                    cArr = cArr;
                    length = length;
                    cArr2 = cArr2;
                    i15 = i15;
                    i16 = i16;
                    cls2 = cls2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        byte[] bArr3 = bArr;
        Class<Object> cls5 = cls2;
        int i18 = i15;
        int i19 = i16;
        char[] cArr3 = new char[i14];
        System.arraycopy(cArr, i13, cArr3, 0, i14);
        if (bArr3 != null) {
            char[] cArr4 = new char[i14];
            challengeResultError.getSDKAppID = 0;
            char c11 = 0;
            while (true) {
                int i21 = challengeResultError.getSDKAppID;
                if (i21 >= i14) {
                    break;
                }
                if (bArr3[i21] == 1) {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i21]), Integer.valueOf(c11)};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method2 = map2.get(10570995);
                    if (method2 == null) {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(558 - Color.green(0), (char) (View.MeasureSpec.getSize(0) + 5486), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        d(b13, b14, b14, objArr5);
                        method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                        map2.put(10570995, method2);
                    }
                    cArr4[i21] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                } else {
                    cArr3 = cArr3;
                    Object[] objArr6 = {Integer.valueOf(cArr3[i21]), Integer.valueOf(c11)};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-502074319);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(0, 0, 0) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24)).getMethod("a", cls3, cls3);
                        map3.put(-502074319, method3);
                    }
                    cArr4[i21] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                }
                c11 = cArr4[challengeResultError.getSDKAppID];
                Object[] objArr7 = {challengeResultError, challengeResultError};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-399400818);
                if (method4 != null) {
                    cls = cls5;
                } else {
                    Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(854 - View.MeasureSpec.getSize(0), (char) Color.alpha(0), TextUtils.lastIndexOf("", '0') + 25);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    d(b15, b16, (byte) (b16 + 3), objArr8);
                    String str3 = (String) objArr8[0];
                    cls = cls5;
                    method4 = cls7.getMethod(str3, cls, cls);
                    map4.put(-399400818, method4);
                }
                ((Method) method4).invoke(null, objArr7);
                cls5 = cls;
                cArr3 = cArr3;
            }
            cArr3 = cArr4;
        }
        if (i19 > 0) {
            $10 = ($11 + 1) % 128;
            char[] cArr5 = new char[i14];
            i11 = 0;
            System.arraycopy(cArr3, 0, cArr5, 0, i14);
            int i22 = i14 - i19;
            System.arraycopy(cArr5, 0, cArr3, i22, i19);
            System.arraycopy(cArr5, i19, cArr3, 0, i22);
        } else {
            i11 = 0;
        }
        if (z11) {
            char[] cArr6 = new char[i14];
            challengeResultError.getSDKAppID = i11;
            while (true) {
                int i23 = challengeResultError.getSDKAppID;
                if (i23 >= i14) {
                    break;
                }
                int i24 = $11 + 77;
                $10 = i24 % 128;
                if (i24 % 2 != 0) {
                    cArr6[i23] = cArr3[(i14 >>> i23) - 1];
                } else {
                    cArr6[i23] = cArr3[(i14 - i23) - 1];
                    i23++;
                }
                challengeResultError.getSDKAppID = i23;
            }
            cArr3 = cArr6;
        }
        if (i18 > 0) {
            challengeResultError.getSDKAppID = 0;
            while (true) {
                int i25 = challengeResultError.getSDKAppID;
                if (i25 >= i14) {
                    break;
                }
                cArr3[i25] = (char) (cArr3[i25] - iArr[2]);
                challengeResultError.getSDKAppID = i25 + 1;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = atd.v.onCompletion.$$a
            int r8 = r8 * 4
            int r8 = r8 + 103
            int r7 = r7 * 12
            int r7 = 15 - r7
            int r9 = r9 * 8
            int r9 = r9 + 13
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-4)
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.v.onCompletion.b(short, byte, int, java.lang.Object[]):void");
    }

    private static void c(int i11, byte b11, byte b12, Object[] objArr) {
        int i12 = b12 * 24;
        int i13 = 103 - (b11 * 6);
        int i14 = (i11 * 42) + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[43 - i12];
        int i15 = 42 - i12;
        int i16 = -1;
        if (bArr == null) {
            i13 = (i14 + i15) - 2;
            i14++;
        }
        while (true) {
            i16++;
            bArr2[i16] = (byte) i13;
            if (i16 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i17 = i13;
            i13 = (i17 + bArr[i14]) - 2;
            i14++;
        }
    }

    private static void d(int i11, short s11, int i12, Object[] objArr) {
        int i13 = (i11 * 3) + 4;
        int i14 = s11 * 2;
        byte[] bArr = $$g;
        int i15 = (i12 * 2) + 98;
        byte[] bArr2 = new byte[1 - i14];
        int i16 = 0 - i14;
        int i17 = -1;
        if (bArr == null) {
            i13++;
            i15 = i16 + i15;
        }
        while (true) {
            i17++;
            bArr2[i17] = (byte) i15;
            if (i17 == i16) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b11 = bArr[i13];
                i13++;
                i15 += b11;
            }
        }
    }

    static void init$0() {
        $$a = new byte[]{81, 2, -35, -124, -2, -19, 44, -37, -21, 9, 2, -6, 29, -33, -23, 15, -2, -19, 29, 11, -11, -11, -23, -5, -3, -17, 9, -13, 7, -6, 19, -43, 4, 7, -7, -17};
        $$b = 124;
    }

    static void init$1() {
        $$d = new byte[]{82, 111, -78, -28, 21, -14, -52, 76, -72, 23, 39, -5, 13, 2, -5, 11, -5, 0, -16, 35, -17, 21, 3, 0, -31, 21, 0, 4, 6, 15, -15, 15, -76, 69, 0, 17, -46, 35, 19, -11, -4, 4, -31, 31, 21, -17, 0, 17, -31, -13, 9, 11, 32, -15, 15, 7, -16, 4, 19, -9, 8, 1, -35, -3};
        $$e = 136;
    }

    static void init$2() {
        $$g = new byte[]{86, -79, -114, -51};
        $$h = 197;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00da A[PHI: r2 r5 r24 r25
      0x00da: PHI (r2v5 boolean) = (r2v4 boolean), (r2v8 boolean) binds: [B:12:0x00d8, B:9:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r5v15 long) = (r5v14 long), (r5v92 long) binds: [B:12:0x00d8, B:9:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r24v1 float) = (r24v0 float), (r24v3 float) binds: [B:12:0x00d8, B:9:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r25v1 boolean) = (r25v0 boolean), (r25v11 boolean) binds: [B:12:0x00d8, B:9:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0125  */
    /* JADX WARN: Code duplicated, block: B:18:0x017b  */
    /* JADX WARN: Code duplicated, block: B:19:0x017c A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:25:0x0200, B:29:0x0266, B:36:0x034c, B:40:0x038f, B:39:0x0363, B:45:0x0449, B:49:0x048e, B:48:0x0462, B:28:0x0226, B:16:0x0161, B:20:0x01a4, B:19:0x017c), top: B:68:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0343  */
    /* JADX WARN: Code duplicated, block: B:38:0x0362  */
    /* JADX WARN: Code duplicated, block: B:39:0x0363 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:25:0x0200, B:29:0x0266, B:36:0x034c, B:40:0x038f, B:39:0x0363, B:45:0x0449, B:49:0x048e, B:48:0x0462, B:28:0x0226, B:16:0x0161, B:20:0x01a4, B:19:0x017c), top: B:68:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0397  */
    /* JADX WARN: Code duplicated, block: B:47:0x0461  */
    /* JADX WARN: Code duplicated, block: B:48:0x0462 A[Catch: all -> 0x01b1, TryCatch #0 {all -> 0x01b1, blocks: (B:25:0x0200, B:29:0x0266, B:36:0x034c, B:40:0x038f, B:39:0x0363, B:45:0x0449, B:49:0x048e, B:48:0x0462, B:28:0x0226, B:16:0x0161, B:20:0x01a4, B:19:0x017c), top: B:68:0x0051 }] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Boolean sDKReferenceNumber;
        boolean z11;
        float f11;
        boolean zBooleanValue;
        long j11;
        long j12;
        int i11;
        Class<?> cls;
        Object[] objArr;
        Map map;
        Object method;
        Object[] objArr2;
        int i12;
        int i13;
        Map map2;
        Object method2;
        Map map3;
        Object method3;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getDeviceData;
        Object[] objArr3 = new Object[1];
        a("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{0, 20, 63, 0}, false, objArr3);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr3[0]).intern());
        if (sDKTransactionID == null || (sDKReferenceNumber = com.adyen.threeds2.internal.deviceinfo.parameter.getSDKTransactionID.getSDKReferenceNumber(sDKTransactionID)) == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            int i14 = getSDKTransactionID + 123;
            getSDKReferenceNumber = i14 % 128;
            if (i14 % 2 == 0) {
                return failure;
            }
            throw null;
        }
        int i15 = getSDKTransactionID + 77;
        getSDKReferenceNumber = i15 % 128;
        int i16 = i15 % 2;
        Class cls2 = Integer.TYPE;
        try {
            try {
                if (i16 == 0) {
                    z11 = false;
                    f11 = BitmapDescriptorFactory.HUE_RED;
                    zBooleanValue = sDKReferenceNumber.booleanValue();
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(721 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) Color.red(0), Color.red(0) + 33);
                    byte b11 = (byte) ($$a[1] - 1);
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    j11 = cls3.getField((String) objArr4[0]).getLong(null);
                    if (j11 != -1) {
                        j12 = j11 + 2029;
                        i11 = z11;
                        Object[] objArr5 = new Object[1];
                        a("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{20, 22, i11, i11}, true, objArr5);
                        cls = Class.forName(((String) objArr5[i11]).intern());
                        objArr = new Object[1];
                        a("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{42, 15, i11, i11}, i11, objArr);
                        if (j12 >= ((Long) cls.getDeclaredMethod(((String) objArr[i11]).intern(), null).invoke(null, null)).longValue()) {
                            getSDKReferenceNumber = (getSDKTransactionID + 65) % 128;
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.red(0) + 721, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), Drawable.resolveOpacity(0, 0) + 33);
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr6 = new Object[1];
                            b(b13, b14, (byte) (b14 + 1), objArr6);
                            Object[] objArr7 = {cls4.getField((String) objArr6[0]).get(null), -171985889, 0};
                            map = atd.a.getMessageVersion.timedout;
                            method = map.get(-1124906587);
                            if (method != null) {
                                float f12 = f11;
                                method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2718 - (TypedValue.complexToFraction(0, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(0, f12, f12) == f12 ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), 31 - View.MeasureSpec.getSize(0))).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                                map.put(-1124906587, method);
                            }
                            objArr2 = (Object[]) ((Method) method).invoke(null, objArr7);
                        }
                    }
                    i12 = ((int[]) objArr2[1])[0];
                    i13 = ((int[]) objArr2[0])[0];
                    if (i13 == i12) {
                        Object[] objArr8 = {objArr2, Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                        map3 = atd.a.getMessageVersion.timedout;
                        method3 = map3.get(-1124906587);
                        if (method3 == null) {
                            method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2717, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 31)).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                            map3.put(-1124906587, method3);
                        }
                        ((Method) method3).invoke(null, objArr8);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add((String) objArr2[2]);
                        arrayList.add((String) objArr2[3]);
                        arrayList.add((String) objArr2[4]);
                        arrayList.add((String) objArr2[5]);
                        arrayList.add((String) objArr2[6]);
                        arrayList.add((String) objArr2[7]);
                        arrayList.add((String) objArr2[8]);
                        long j13 = ((long) (i12 ^ i13)) ^ 1699685182283448320L;
                        getSDKTransactionID = (getSDKReferenceNumber + 79) % 128;
                        Object[] objArr9 = {Long.valueOf(j13), 395738794L};
                        byte[] bArr = $$d;
                        byte b15 = bArr[17];
                        Object[] objArr10 = new Object[1];
                        c(b15, bArr[61], b15, objArr10);
                        Class<?> cls5 = Class.forName((String) objArr10[0]);
                        byte b16 = bArr[61];
                        Object[] objArr11 = new Object[1];
                        c(b16, bArr[17], b16, objArr11);
                        String str = (String) objArr11[0];
                        Class cls6 = Long.TYPE;
                        cls5.getMethod(str, cls6, cls6).invoke(null, objArr9);
                        Object[] objArr12 = {objArr2, Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-1124906587);
                        if (method2 == null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 2719, (char) (Process.myPid() >> 22), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                            map2.put(-1124906587, method2);
                        }
                        ((Method) method2).invoke(null, objArr12);
                    }
                    return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(zBooleanValue));
                }
                zBooleanValue = sDKReferenceNumber.booleanValue();
                int iKeyCodeFromString = 721 - KeyEvent.keyCodeFromString("");
                int keyRepeatDelay = ViewConfiguration.getKeyRepeatDelay();
                f11 = BitmapDescriptorFactory.HUE_RED;
                z11 = false;
                Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(iKeyCodeFromString, (char) (keyRepeatDelay >> 16), 34 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                byte b17 = (byte) ($$a[1] - 1);
                byte b18 = (byte) (b17 - 1);
                Object[] objArr13 = new Object[1];
                b(b17, b18, b18, objArr13);
                j11 = cls7.getField((String) objArr13[0]).getLong(null);
                int i17 = 32 / 0;
                if (j11 != -1) {
                    j12 = j11 + 2029;
                    i11 = z11;
                    Object[] objArr14 = new Object[1];
                    a("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{20, 22, i11, i11}, true, objArr14);
                    cls = Class.forName(((String) objArr14[i11]).intern());
                    objArr = new Object[1];
                    a("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{42, 15, i11, i11}, i11, objArr);
                    if (j12 >= ((Long) cls.getDeclaredMethod(((String) objArr[i11]).intern(), null).invoke(null, null)).longValue()) {
                        getSDKReferenceNumber = (getSDKTransactionID + 65) % 128;
                        Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.red(0) + 721, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), Drawable.resolveOpacity(0, 0) + 33);
                        byte b19 = (byte) 0;
                        byte b110 = b19;
                        Object[] objArr15 = new Object[1];
                        b(b19, b110, (byte) (b110 + 1), objArr15);
                        Object[] objArr16 = {cls8.getField((String) objArr15[0]).get(null), -171985889, 0};
                        map = atd.a.getMessageVersion.timedout;
                        method = map.get(-1124906587);
                        if (method != null) {
                            float f13 = f11;
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2718 - (TypedValue.complexToFraction(0, f13, f13) > f13 ? 1 : (TypedValue.complexToFraction(0, f13, f13) == f13 ? 0 : -1)), (char) ((-1) - MotionEvent.axisFromString("")), 31 - View.MeasureSpec.getSize(0))).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                            map.put(-1124906587, method);
                        }
                        objArr2 = (Object[]) ((Method) method).invoke(null, objArr16);
                    }
                }
                i12 = ((int[]) objArr2[1])[0];
                i13 = ((int[]) objArr2[0])[0];
                if (i13 == i12) {
                    Object[] objArr17 = {objArr2, Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                    map3 = atd.a.getMessageVersion.timedout;
                    method3 = map3.get(-1124906587);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2717, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 31)).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                        map3.put(-1124906587, method3);
                    }
                    ((Method) method3).invoke(null, objArr17);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add((String) objArr2[2]);
                    arrayList2.add((String) objArr2[3]);
                    arrayList2.add((String) objArr2[4]);
                    arrayList2.add((String) objArr2[5]);
                    arrayList2.add((String) objArr2[6]);
                    arrayList2.add((String) objArr2[7]);
                    arrayList2.add((String) objArr2[8]);
                    long j14 = ((long) (i12 ^ i13)) ^ 1699685182283448320L;
                    getSDKTransactionID = (getSDKReferenceNumber + 79) % 128;
                    try {
                        Object[] objArr18 = {Long.valueOf(j14), 395738794L};
                        byte[] bArr2 = $$d;
                        byte b111 = bArr2[17];
                        Object[] objArr19 = new Object[1];
                        c(b111, bArr2[61], b111, objArr19);
                        Class<?> cls9 = Class.forName((String) objArr19[0]);
                        byte b112 = bArr2[61];
                        Object[] objArr110 = new Object[1];
                        c(b112, bArr2[17], b112, objArr110);
                        String str2 = (String) objArr110[0];
                        Class cls10 = Long.TYPE;
                        cls9.getMethod(str2, cls10, cls10).invoke(null, objArr18);
                        Object[] objArr111 = {objArr2, Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                        map2 = atd.a.getMessageVersion.timedout;
                        method2 = map2.get(-1124906587);
                        if (method2 == null) {
                            method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 2719, (char) (Process.myPid() >> 22), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                            map2.put(-1124906587, method2);
                        }
                        ((Method) method2).invoke(null, objArr111);
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                }
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(zBooleanValue));
                Object[] objArr20 = new Object[1];
                a("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{20, 22, 0, 0}, true, objArr20);
                Class<?> cls11 = Class.forName(((String) objArr20[0]).intern());
                Object[] objArr21 = new Object[1];
                a("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000", new int[]{42, 15, 0, 0}, false, objArr21);
                Long lValueOf = Long.valueOf(((Long) cls11.getDeclaredMethod(((String) objArr21[0]).intern(), null).invoke(null, null)).longValue());
                Class cls12 = (Class) atd.a.getMessageVersion.getSDKTransactionID(722 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (Process.myTid() >> 22) + 33);
                byte b21 = (byte) ($$a[1] - 1);
                byte b22 = (byte) (b21 - 1);
                Object[] objArr22 = new Object[1];
                b(b21, b22, b22, objArr22);
                cls12.getField((String) objArr22[0]).set(null, lValueOf);
                getSDKTransactionID = (getSDKReferenceNumber + 101) % 128;
                i12 = ((int[]) objArr2[1])[0];
                i13 = ((int[]) objArr2[0])[0];
                if (i13 == i12) {
                    Object[] objArr112 = {objArr2, Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                    map3 = atd.a.getMessageVersion.timedout;
                    method3 = map3.get(-1124906587);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2717, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 31)).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                        map3.put(-1124906587, method3);
                    }
                    ((Method) method3).invoke(null, objArr112);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add((String) objArr2[2]);
                    arrayList3.add((String) objArr2[3]);
                    arrayList3.add((String) objArr2[4]);
                    arrayList3.add((String) objArr2[5]);
                    arrayList3.add((String) objArr2[6]);
                    arrayList3.add((String) objArr2[7]);
                    arrayList3.add((String) objArr2[8]);
                    long j15 = ((long) (i12 ^ i13)) ^ 1699685182283448320L;
                    getSDKTransactionID = (getSDKReferenceNumber + 79) % 128;
                    Object[] objArr113 = {Long.valueOf(j15), 395738794L};
                    byte[] bArr3 = $$d;
                    byte b113 = bArr3[17];
                    Object[] objArr114 = new Object[1];
                    c(b113, bArr3[61], b113, objArr114);
                    Class<?> cls13 = Class.forName((String) objArr114[0]);
                    byte b114 = bArr3[61];
                    Object[] objArr115 = new Object[1];
                    c(b114, bArr3[17], b114, objArr115);
                    String str3 = (String) objArr115[0];
                    Class cls14 = Long.TYPE;
                    cls13.getMethod(str3, cls14, cls14).invoke(null, objArr113);
                    Object[] objArr116 = {objArr2, Integer.valueOf(((int[]) objArr2[9])[0]), 0};
                    map2 = atd.a.getMessageVersion.timedout;
                    method2 = map2.get(-1124906587);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 2719, (char) (Process.myPid() >> 22), 31 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                        map2.put(-1124906587, method2);
                    }
                    ((Method) method2).invoke(null, objArr116);
                }
                return DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(zBooleanValue));
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr23 = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", new int[]{57, 16, 0, 0}, false, objArr23);
            Class<?> cls15 = Class.forName(((String) objArr23[0]).intern());
            Object[] objArr24 = new Object[1];
            a("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001", new int[]{73, 16, 0, 0}, false, objArr24);
            Object[] objArr25 = {Integer.valueOf(((Integer) cls15.getMethod(((String) objArr24[0]).intern(), Object.class).invoke(null, this)).intValue()), 0, -171985889};
            Map map4 = atd.a.getMessageVersion.timedout;
            Object method4 = map4.get(1459979046);
            if (method4 == null) {
                Class cls16 = (Class) atd.a.getMessageVersion.getSDKTransactionID(721 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) Gravity.getAbsoluteGravity(0, 0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 33);
                byte b23 = (byte) 0;
                byte b24 = b23;
                Object[] objArr26 = new Object[1];
                b(b23, b24, (byte) (b24 + 1), objArr26);
                method4 = cls16.getMethod((String) objArr26[0], cls2, cls2, cls2);
                map4.put(1459979046, method4);
            }
            objArr2 = (Object[]) ((Method) method4).invoke(null, objArr25);
            Class cls17 = (Class) atd.a.getMessageVersion.getSDKTransactionID(721 - ExpandableListView.getPackedPositionType(0L), (char) (KeyEvent.getMaxKeyCode() >> 16), 32 - TextUtils.indexOf((CharSequence) "", '0', 0));
            byte b25 = (byte) 0;
            byte b26 = b25;
            Object[] objArr27 = new Object[1];
            b(b25, b26, (byte) (b26 + 1), objArr27);
            cls17.getField((String) objArr27[0]).set(null, objArr2);
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th3;
        }
    }

    private onCompletion(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getDeviceData = authenticationRequestParameters;
    }
}
