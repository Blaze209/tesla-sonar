package atd.d;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getTransactionStatus {
    private static int ChallengeResultCancelled = 1;
    private static int getSDKTransactionID;
    private final ChallengeResult AuthenticationRequestParameters;
    private final String getDeviceData;
    private final byte[] getSDKAppID;
    private final Map<String, List<String>> getSDKReferenceNumber;

    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static long ChallengeResult;
        private static int ChallengeResultCancelled;
        private static int getSDKEphemeralPublicKey;
        private static char[] getSDKReferenceNumber;
        byte[] getSDKAppID;
        String getSDKTransactionID;
        ChallengeResult getDeviceData = ChallengeResult.GET;
        Map<String, List<String>> AuthenticationRequestParameters = new HashMap();

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKEphemeralPublicKey = 0;
            ChallengeResultCancelled = 1;
            getSDKReferenceNumber = new char[]{'\r', 12518, 25036, 37532, 50081, 62615, 9680, 22114, 34669, 47192, 59692, 6770, 59438, 55493, 35311, 31423, 11138, 7348, 52723, 48714, 28502, 20583, 279, 61958, 41829, 21, 12529, 25044, 37588, 50087, 62592, 9680, 22117, 34667, 47124, 59694, 6697, 19204, 31720, 44222, 21, 12529, 25044, 37588, 50087, 62592, 9680, 15929, 3736, 24500, 44206, 64989, 51877, 7167, 26626, 47373, 34421, 55113, 9308, 30079, 17792, 37585, 58284, 12537, 455, 20196, 40940, 60444, 15648, 2594, 23385, 43033, 63863, 51598, 5785, 26544, 46219, 42866, 38867, 50943, 13797, 25750, 21486, 33458, 61767, 8260, 8059, 20042, 48407, 60514, 56540, 3039, 31479, 43495, 39067, 55225, 1698, 29954, 42092, 37749, 49666, 12555, 24688};
            ChallengeResult = -6325108501164511084L;
        }

        public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
            return getDeviceData(objArr);
        }

        /* JADX WARN: Code duplicated, block: B:38:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:39:0x01be  */
        private static void a(char c11, int i11, int i12, Object[] objArr) throws Throwable {
            Throwable cause;
            int i13;
            int i14;
            atd.az.BuildConfig buildConfig = new atd.az.BuildConfig();
            long[] jArr = new long[i12];
            int i15 = 0;
            buildConfig.getDeviceData = 0;
            $10 = ($11 + 79) % 128;
            while (true) {
                int i16 = buildConfig.getDeviceData;
                if (i16 >= i12) {
                    break;
                }
                $11 = ($10 + 65) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(getSDKReferenceNumber[i11 + i16])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(1019086628);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i14 = i15;
                        i13 = 2;
                    } else {
                        i13 = 2;
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(i15, i15) + 1774, (char) (KeyEvent.getMaxKeyCode() >> 16), 32 - (TypedValue.complexToFloat(i15) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i15) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        i14 = i15;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i14], cls);
                        map.put(1019086628, method);
                    }
                    Long l11 = (Long) ((Method) method).invoke(null, objArr2);
                    l11.longValue();
                    long j11 = buildConfig.getDeviceData;
                    long j12 = ChallengeResult;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(c11);
                    objArr4[i13] = Long.valueOf(j12);
                    objArr4[1] = Long.valueOf(j11);
                    objArr4[i14] = l11;
                    Object method2 = map.get(-1106061844);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFloat(i14) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i14) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 441, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 37);
                        Class cls4 = Long.TYPE;
                        method2 = cls3.getMethod("n", cls4, cls4, cls4, cls);
                        map.put(-1106061844, method2);
                    }
                    jArr[i16] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = new Object[i13];
                    objArr5[1] = buildConfig;
                    objArr5[i14] = buildConfig;
                    Object method3 = map.get(1947342796);
                    if (method3 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1919 - Color.alpha(i14), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 30);
                        int i17 = i14;
                        byte b13 = (byte) i17;
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, (byte) (b14 - 1), objArr6);
                        method3 = cls5.getMethod((String) objArr6[i17], Object.class, Object.class);
                        map.put(1947342796, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    jArr = jArr;
                    i15 = 0;
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
            char[] cArr = new char[i12];
            buildConfig.getDeviceData = 0;
            $11 = ($10 + 105) % 128;
            while (true) {
                int i18 = buildConfig.getDeviceData;
                if (i18 >= i12) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i18] = (char) jArr2[i18];
                Object[] objArr7 = {buildConfig, buildConfig};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method4 = map2.get(1947342796);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getPressedStateDuration() >> 16) + 1919, (char) View.MeasureSpec.getMode(0), 29 - TextUtils.getOffsetAfter("", 0));
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(1947342796, method4);
                }
                ((Method) method4).invoke(null, objArr7);
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
        private static void b(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = atd.d.getTransactionStatus.getSDKReferenceNumber.$$a
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r9 = r9 * 2
                int r9 = r9 + 4
                int r8 = r8 * 5
                int r8 = r8 + 108
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r5 = r2
                r0 = r9
                goto L31
            L17:
                r3 = r9
                r9 = r8
                r8 = r3
                r3 = r2
            L1b:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r0
                r0 = r6
            L31:
                int r9 = r9 + 1
                int r8 = r8 + r0
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r3 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getTransactionStatus.getSDKReferenceNumber.b(int, short, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{82, 42, -92, 24};
            $$b = EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE;
        }

        public final getSDKReferenceNumber getDeviceData(byte[] bArr) {
            int i11 = getSDKEphemeralPublicKey + 103;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 != 0) {
                return (getSDKReferenceNumber) AuthenticationRequestParameters(new Object[]{this, ChallengeResult.POST, bArr}, -886872425, 886872425, System.identityHashCode(this));
            }
            throw null;
        }

        public final getSDKReferenceNumber getSDKAppID(Map<String, List<String>> map) {
            int i11 = getSDKEphemeralPublicKey;
            this.AuthenticationRequestParameters = map;
            int i12 = i11 + 57;
            ChallengeResultCancelled = i12 % 128;
            if (i12 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final getSDKReferenceNumber getSDKReferenceNumber(String str) throws Throwable {
            getSDKEphemeralPublicKey = (ChallengeResultCancelled + 69) % 128;
            if (str == null) {
                Object[] objArr = new Object[1];
                a((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0') + 1, (ViewConfiguration.getWindowTouchSlop() >> 8) + 12, objArr);
                throw new NullPointerException(((String) objArr[0]).intern());
            }
            if (str.isEmpty()) {
                Object[] objArr2 = new Object[1];
                a((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 59426), 12 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 13 - TextUtils.getTrimmedLength(""), objArr2);
                throw new NullPointerException(((String) objArr2[0]).intern());
            }
            this.getSDKTransactionID = str;
            getSDKEphemeralPublicKey = (ChallengeResultCancelled + 23) % 128;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        
            if (atd.d.ChallengeResult.getSDKReferenceNumber(r3) != false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            r1 = new java.lang.StringBuilder();
            r9 = new java.lang.Object[1];
            a((char) ((-1) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))), android.view.Gravity.getAbsoluteGravity(0, 0) + 40, 7 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), r9);
            r1.append(((java.lang.String) r9[0]).intern());
            r1.append(r3);
            r2 = new java.lang.Object[1];
            a((char) (15970 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1))), 47 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 30, r2);
            r1.append(((java.lang.String) r2[0]).intern());
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
        
            throw new java.lang.IllegalArgumentException(r1.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        
            if (atd.d.ChallengeResult.getSDKReferenceNumber(r3) != false) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static /* synthetic */ java.lang.Object getDeviceData(java.lang.Object[] r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 334
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.d.getTransactionStatus.getSDKReferenceNumber.getDeviceData(java.lang.Object[]):java.lang.Object");
        }

        public final getSDKReferenceNumber getSDKAppID() {
            int i11 = ChallengeResultCancelled + 109;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                return (getSDKReferenceNumber) AuthenticationRequestParameters(new Object[]{this, ChallengeResult.GET, null}, -886872425, 886872425, System.identityHashCode(this));
            }
            throw null;
        }

        public final getTransactionStatus getSDKReferenceNumber() throws Throwable {
            int i11 = getSDKEphemeralPublicKey + 83;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 != 0) {
                if (this.getSDKTransactionID != null) {
                    getTransactionStatus gettransactionstatus = new getTransactionStatus(this);
                    getSDKEphemeralPublicKey = (ChallengeResultCancelled + 121) % 128;
                    return gettransactionstatus;
                }
                Object[] objArr = new Object[1];
                a((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ViewConfiguration.getScrollBarSize() >> 8, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, objArr);
                throw new IllegalStateException(((String) objArr[0]).intern());
            }
            throw null;
        }

        private getSDKReferenceNumber getSDKReferenceNumber(ChallengeResult challengeResult, byte[] bArr) {
            return (getSDKReferenceNumber) AuthenticationRequestParameters(new Object[]{this, challengeResult, bArr}, -886872425, 886872425, System.identityHashCode(this));
        }
    }

    getTransactionStatus(getSDKReferenceNumber getsdkreferencenumber) {
        this.getDeviceData = getsdkreferencenumber.getSDKTransactionID;
        this.AuthenticationRequestParameters = getsdkreferencenumber.getDeviceData;
        this.getSDKReferenceNumber = getsdkreferencenumber.AuthenticationRequestParameters;
        this.getSDKAppID = getsdkreferencenumber.getSDKAppID;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
        int i13 = i12 % 128;
        getSDKTransactionID = i13;
        int i14 = i12 % 2;
        String str = gettransactionstatus.getDeviceData;
        if (i14 != 0) {
            throw null;
        }
        int i15 = i13 & 45;
        int i16 = (i13 | 45) & (~i15);
        int i17 = -(-(i15 << 1));
        ChallengeResultCancelled = ((i16 & i17) + (i16 | i17)) % 128;
        return str;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = i11 + 6;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        ChallengeResultCancelled = i13 % 128;
        int i14 = i13 % 2;
        ChallengeResult challengeResult = gettransactionstatus.AuthenticationRequestParameters;
        if (i14 == 0) {
            throw null;
        }
        int i15 = (((i11 & (-54)) | ((~i11) & 53)) - (~(-(-((i11 & 53) << 1))))) - 1;
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 10 / 0;
        }
        return challengeResult;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE) + 610 + (i12 * EnumC4419g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE) + (((~(i11 | i12)) | (~(i11 | i13))) * EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE) + (((~(i11 | (~i13))) | (~i12)) * EnumC4419g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE);
        if (i14 == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        if (i14 != 2) {
            return i14 != 3 ? getSDKTransactionID(objArr) : getSDKAppID(objArr);
        }
        return getSDKReferenceNumber(objArr);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = ((i11 ^ 49) | (i11 & 49)) << 1;
        int i13 = -(((~i11) & 49) | (i11 & (-50)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        ChallengeResultCancelled = i14 % 128;
        int i15 = i14 % 2;
        Map<String, List<String>> map = gettransactionstatus.getSDKReferenceNumber;
        if (i15 != 0) {
            return map;
        }
        throw null;
    }

    public final String getDeviceData() {
        return (String) getSDKReferenceNumber(new Object[]{this}, -701491070, 701491071, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        byte[] bArrCopyOf;
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = (((((i11 ^ 39) | (i11 & 39)) << 1) - (~(-(((~i11) & 39) | (i11 & (-40)))))) - 1) % 128;
        ChallengeResultCancelled = i12;
        byte[] bArr = gettransactionstatus.getSDKAppID;
        if (bArr == null) {
            int i13 = (((i12 & (-74)) | ((~i12) & 73)) - (~(-(-((i12 & 73) << 1))))) - 1;
            getSDKTransactionID = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 77 / 0;
            }
            return null;
        }
        int i15 = (i12 & 31) + (i12 | 31);
        getSDKTransactionID = i15 % 128;
        if (i15 % 2 != 0) {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            int i16 = 70 / 0;
        } else {
            bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        int i17 = ChallengeResultCancelled;
        getSDKTransactionID = ((((i17 & (-4)) | ((~i17) & 3)) - (~(-(-((i17 & 3) << 1))))) - 1) % 128;
        return bArrCopyOf;
    }

    public final Map<String, List<String>> getSDKAppID() {
        return (Map) getSDKReferenceNumber(new Object[]{this}, -194309084, 194309084, System.identityHashCode(this));
    }

    public final ChallengeResult getSDKTransactionID() {
        return (ChallengeResult) getSDKReferenceNumber(new Object[]{this}, -1520224174, 1520224177, System.identityHashCode(this));
    }

    public final byte[] getSDKReferenceNumber() {
        return (byte[]) getSDKReferenceNumber(new Object[]{this}, -857678302, 857678304, System.identityHashCode(this));
    }
}
