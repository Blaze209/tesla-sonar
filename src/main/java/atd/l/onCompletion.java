package atd.l;

import android.app.Application;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ScreenResolution;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Landroid/app/Application;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onCompletion extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static boolean getSDKAppID;
    private static char[] getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final Application getDeviceData;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/ScreenResolution$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "MIN_VALUE", "", "MAX_VALUE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        ChallengeResultCancelled = 0;
        ChallengeResult = 1;
        AuthenticationRequestParameters();
        View.resolveSizeAndState(0, 0, 0);
        new getSDKAppID((byte) 0);
        ChallengeResultCancelled = (ChallengeResult + 47) % 128;
    }

    public onCompletion(Application application) {
        s.k(application, "");
        this.getDeviceData = application;
    }

    static void AuthenticationRequestParameters() {
        getSDKReferenceNumber = new char[]{64903, 64838, 64818, 64873, 64890, 64882};
        getSDKTransactionID = -185467478;
        AuthenticationRequestParameters = true;
        getSDKAppID = true;
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        long j11;
        Class cls;
        Object method;
        String str3 = str2;
        int i12 = 2;
        Object bytes = str3;
        if (str3 != null) {
            int i13 = $11 + 29;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                str3.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
        char[] cArr = getSDKReferenceNumber;
        Class cls2 = Integer.TYPE;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i14 = 0;
            j11 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                    int i15 = i12;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj != null) {
                        method = obj;
                        cls = cls2;
                    } else {
                        cls = cls2;
                        method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 31 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("o", cls);
                        map.put(508097192, method);
                    }
                    cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    cArr = cArr;
                    i12 = i15;
                    cls2 = cls;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        } else {
            j11 = 0;
        }
        int i16 = i12;
        Class cls3 = cls2;
        Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - Color.green(0), (char) View.MeasureSpec.getSize(0), ExpandableListView.getPackedPositionChild(j11) + 18);
            byte b11 = $$a[i16];
            byte b12 = (byte) (b11 + 1);
            byte b13 = b11;
            Object[] objArr4 = new Object[1];
            b(b12, b13, b13, objArr4);
            method2 = cls4.getMethod((String) objArr4[0], cls3);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (getSDKAppID) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr3 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i17 = challengeStatusReceiver.getDeviceData;
                int i18 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i17 >= i18) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                cArr3[i17] = (char) (cArr[bArr[(i18 - 1) - i17] + i11] - iIntValue);
                Object[] objArr5 = new Object[i16];
                objArr5[1] = challengeStatusReceiver;
                objArr5[0] = challengeStatusReceiver;
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - Gravity.getAbsoluteGravity(0, 0), (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 51 - (Process.getElapsedCpuTime() > j11 ? 1 : (Process.getElapsedCpuTime() == j11 ? 0 : -1)));
                    byte b14 = $$a[2];
                    byte b15 = b14;
                    Object[] objArr6 = new Object[1];
                    b(b14, b15, b15, objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                i16 = 2;
            }
        } else if (AuthenticationRequestParameters) {
            int length3 = charArray.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr4 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i19 = challengeStatusReceiver.getDeviceData;
                int i21 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i19] = (char) (cArr[charArray[(i21 - 1) - i19] - i11] - iIntValue);
                Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1108, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 50);
                    byte b16 = $$a[2];
                    byte b17 = b16;
                    Object[] objArr8 = new Object[1];
                    b(b16, b17, b17, objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr5 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i22 = challengeStatusReceiver.getDeviceData;
                int i23 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i22 >= i23) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    $11 = ($10 + 65) % 128;
                    cArr5[i22] = (char) (cArr[iArr[(i23 - 1) - i22] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i22 + 1;
                }
            }
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
    private static void b(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 2
            int r5 = 109 - r5
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = atd.l.onCompletion.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r7]
        L28:
            int r4 = -r4
            int r5 = r5 + r4
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.l.onCompletion.b(short, short, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{115, 82, 0, 114};
        $$b = 40;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[DONT_INVERT, PHI: r0 r5
      0x0031: PHI (r0v6 android.util.DisplayMetrics) = (r0v5 android.util.DisplayMetrics), (r0v19 android.util.DisplayMetrics) binds: [B:8:0x002f, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r5v1 int) = (r5v0 int), (r5v11 int) binds: [B:8:0x002f, B:5:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        DisplayMetrics displayMetrics;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14 = ChallengeResult + 33;
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 == 0) {
            displayMetrics = this.getDeviceData.getResources().getDisplayMetrics();
            i11 = displayMetrics.heightPixels;
            if (i11 >= 0) {
                if (i11 < 1000000) {
                    i12 = ChallengeResult + 79;
                    ChallengeResultCancelled = i12 % 128;
                    if (i12 % 2 != 0) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
            }
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        displayMetrics = this.getDeviceData.getResources().getDisplayMetrics();
        i11 = displayMetrics.heightPixels;
        int i15 = 53 / 0;
        if (i11 >= 0) {
            if (i11 < 1000000) {
                i12 = ChallengeResult + 79;
                ChallengeResultCancelled = i12 % 128;
                if (i12 % 2 != 0) {
                    z11 = true;
                }
            }
        }
        if (z11 || (i13 = displayMetrics.widthPixels) < 0 || i13 >= 1000000) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        ChallengeResult = (ChallengeResultCancelled + 55) % 128;
        t0 t0Var = t0.f86535a;
        Object[] objArr = new Object[1];
        a(null, null, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 126, "\u0082\u0081\u0083\u0082\u0081", objArr);
        String str = String.format(((String) objArr[0]).intern(), Arrays.copyOf(new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)}, 2));
        s.j(str, "");
        return DeviceParameterResult.Success.StringValue.m49boximpl(DeviceParameterResult.Success.StringValue.m50constructorimpl(str));
        z11 = false;
        if (z11) {
        }
        return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
    }
}
