package atd.m;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
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
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Supported32BitAbis;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class completed extends DeviceParameter {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getSDKReferenceNumber = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Supported32BitAbis$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static int ChallengeResultCancelled;
        private static short[] getDeviceData;
        private static byte[] getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        private static int getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            ChallengeResultCancelled = 0;
            getSDKEphemeralPublicKey = 1;
            AuthenticationRequestParameters = 482774268;
            getSDKTransactionID = -1568970106;
            getSDKReferenceNumber = 120604128;
            getSDKAppID = new byte[]{122, 23, 121, 32, 123, 74, 21, -68, 32, 49, 121, 32, 123, 42, 53, 108, 127, 124, 125, 40, 112, 45, 74, 61, 102, 28, 64, 75, 54, 84, 67, 63, 62, 65, 69, 112, 14, 80, 67, 66, -107, 94, 112, -108, 63, -114, 40, -105, -109, -106, -103, 61, 100, 40, 122, -106, -5, -45, 63, 66, -118, 63, -108, 73, 78, -125, -112, -109, -106, 71, -113, 70, 5, -5, 108, -5, 108, -7, 116, 100, -77, -68, 99, -67, 107, -54, 96, -68, -90, 116, 100, 94, -67, -96, 34, -78, 98, -72, -93, 113, 78, -82, -89, -11, -32, -35, -16, -38, -24, -53, -15, -35, -92, 47, -15, -2, -2, -2, -2, -2, -2, -2};
        }

        private getSDKReferenceNumber() {
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0453  */
        /* JADX WARN: Code duplicated, block: B:43:0x0459  */
        /* JADX WARN: Code duplicated, block: B:46:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:47:0x04b4 A[Catch: all -> 0x08e4, TryCatch #3 {all -> 0x08e4, blocks: (B:5:0x0079, B:9:0x00ce, B:8:0x0092, B:16:0x023b, B:20:0x0292, B:32:0x0362, B:36:0x03bf, B:87:0x07ae, B:91:0x080b, B:90:0x07ca, B:98:0x086d, B:102:0x08cc, B:101:0x088a, B:44:0x049c, B:48:0x04ef, B:47:0x04b4, B:35:0x0375, B:19:0x0256, B:23:0x02ed, B:27:0x0344, B:26:0x0306), top: B:121:0x002f }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r6v38 */
        /* JADX WARN: Type inference failed for: r6v39 */
        /* JADX WARN: Type inference failed for: r6v40, types: [java.lang.Class] */
        /* JADX WARN: Type inference failed for: r6v43 */
        /* JADX WARN: Type inference failed for: r6v44 */
        /* JADX WARN: Type inference failed for: r6v45 */
        /* JADX WARN: Type inference failed for: r6v48, types: [java.lang.Object[]] */
        /* JADX WARN: Type inference failed for: r6v59 */
        /* JADX WARN: Type inference failed for: r6v60 */
        /* JADX WARN: Type inference failed for: r6v71 */
        /* JADX WARN: Type inference failed for: r6v72 */
        /* JADX WARN: Type inference failed for: r6v73 */
        /* JADX WARN: Type inference failed for: r6v74 */
        /* JADX WARN: Type inference failed for: r6v75 */
        public static Object[] AuthenticationRequestParameters(Context context, int i11, int i12) throws Throwable {
            int i13;
            Object[] objArr;
            Object method;
            ?? r11;
            boolean zEquals;
            ?? r12;
            int i14 = (ChallengeResultCancelled + 1) % 128;
            getSDKEphemeralPublicKey = i14;
            Class cls = Integer.TYPE;
            try {
                if (context == null) {
                    ChallengeResultCancelled = (i14 + 99) % 128;
                    Object[] objArr2 = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                    int i15 = ~i11;
                    int i16 = ~((-629213838) | i15);
                    int i17 = ~((-419754935) | i11);
                    Object[] objArr3 = {Integer.valueOf(i12), 0, Integer.valueOf((-812653114) + ((i16 | i17) * 1150) + (((~(419754934 | i15)) | i17) * (-575)) + (((~(i11 | (-629213838))) | (~(i15 | 629213837))) * 575))};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method2 = map.get(552468314);
                    if (method2 == null) {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2243, (char) (46664 - View.combineMeasuredStates(0, 0)), AndroidCharacter.getMirror('0') - 22);
                        byte[] bArr = $$a;
                        byte b11 = (byte) (-bArr[1]);
                        byte b12 = (byte) (-bArr[14]);
                        Object[] objArr4 = new Object[1];
                        a(b11, b12, b12, objArr4);
                        method2 = cls2.getMethod((String) objArr4[0], cls, cls, cls);
                        map.put(552468314, method2);
                    }
                    ((int[]) objArr2[3])[0] = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                    return objArr2;
                }
                try {
                    Object[] objArr5 = new Object[1];
                    b((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 96, ExpandableListView.getPackedPositionType(0L) + 1521799491, (short) ((-47) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1094851070, (byte) (TextUtils.lastIndexOf("", '0', 0) - 86), objArr5);
                    Class<?> cls3 = Class.forName(((String) objArr5[0]).intern());
                    Object[] objArr6 = new Object[1];
                    b(View.MeasureSpec.getMode(0) - 102, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1521799496, (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 62), 1094851092 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (Color.alpha(0) + 126), objArr6);
                    Object objInvoke = cls3.getMethod(((String) objArr6[0]).intern(), null).invoke(context, null);
                    Object[] objArr7 = new Object[1];
                    b((-86) - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1521799491, (short) (106 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1094851109 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44), objArr7);
                    Class<?> cls4 = Class.forName(((String) objArr7[0]).intern());
                    Object[] objArr8 = new Object[1];
                    b(KeyEvent.getDeadChar(0, 0) - 115, 1521799496 - TextUtils.getOffsetAfter("", 0), (short) ((-74) - TextUtils.indexOf("", "", 0, 0)), 1094851142 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 67), objArr8);
                    if ((cls4.getField(((String) objArr8[0]).intern()).getInt(objInvoke) & 2) != 0) {
                        objArr = new Object[]{new int[]{i11}, new int[]{i11 ^ 1}, null, new int[1]};
                        Object[] objArr9 = {Integer.valueOf(i12), 16, Integer.valueOf(((((~((-930170910) | i11)) | 811681817) * (-283)) - 1173311002) + ((~((-118489093) | i11)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE))};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method3 = map2.get(552468314);
                        if (method3 != null) {
                            i13 = 0;
                        } else {
                            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(0) + 2245, (char) (TextUtils.getOffsetAfter("", 0) + 46664), 25 - TextUtils.indexOf((CharSequence) "", '0'));
                            byte[] bArr2 = $$a;
                            byte b13 = (byte) (-bArr2[1]);
                            byte b14 = (byte) (-bArr2[14]);
                            i13 = 0;
                            Object[] objArr10 = new Object[1];
                            a(b13, b14, b14, objArr10);
                            method3 = cls5.getMethod((String) objArr10[0], cls, cls, cls);
                            map2.put(552468314, method3);
                        }
                        ((int[]) objArr[3])[i13] = ((Integer) ((Method) method3).invoke(null, objArr9)).intValue();
                    } else {
                        i13 = 0;
                        Object[] objArr11 = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                        int i18 = ~i11;
                        Object[] objArr12 = {Integer.valueOf(i12), 0, Integer.valueOf(1722421047 + (((~(352203815 | i18)) | 696764956) * (-328)) + ((i11 | 696764956) * 164) + (((~(i18 | 1040186943)) | (~((-352203816) | i11)) | 8781828) * 164))};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method4 = map3.get(552468314);
                        if (method4 == null) {
                            Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 2244, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46664), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26);
                            byte[] bArr3 = $$a;
                            byte b15 = (byte) (-bArr3[1]);
                            byte b16 = (byte) (-bArr3[14]);
                            Object[] objArr13 = new Object[1];
                            a(b15, b16, b16, objArr13);
                            method4 = cls6.getMethod((String) objArr13[0], cls, cls, cls);
                            map3.put(552468314, method4);
                        }
                        ((int[]) objArr11[3])[0] = ((Integer) ((Method) method4).invoke(null, objArr12)).intValue();
                        objArr = objArr11;
                    }
                    if (((int[]) objArr[1])[i13] != i11) {
                        return objArr;
                    }
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method5 = map4.get(490796978);
                    if (method5 == null) {
                        int i19 = i13;
                        Class cls7 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", i19) + 1457, (char) (41772 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), TextUtils.lastIndexOf("", '0', i19) + 30);
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a((byte) (-bArr4[7]), (byte) (-bArr4[18]), (byte) ($$b & 57), objArr14);
                        method5 = cls7.getMethod((String) objArr14[0], null);
                        map4.put(490796978, method5);
                    }
                    Set set = (Set) ((Method) method5).invoke(null, null);
                    Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1457 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 41772), Color.blue(0) + 29);
                    byte[] bArr5 = $$a;
                    Object[] objArr15 = new Object[1];
                    a(bArr5[39], bArr5[5], (byte) (-bArr5[14]), objArr15);
                    if (!set.contains(cls8.getField((String) objArr15[0]).get(null))) {
                        Class cls9 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1457 - Color.blue(0), (char) (41772 - View.resolveSizeAndState(0, 0, 0)), 29 - View.resolveSizeAndState(0, 0, 0));
                        Object[] objArr16 = new Object[1];
                        a((byte) (-bArr5[7]), (byte) (-bArr5[18]), (byte) ($$b & 57), objArr16);
                        if (set.contains(cls9.getField((String) objArr16[0]).get(null))) {
                            if (Build.VERSION.SDK_INT == 30) {
                                ChallengeResultCancelled = (getSDKEphemeralPublicKey + 19) % 128;
                                Object[] objArr17 = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                                int i21 = ~i11;
                                Object[] objArr18 = {Integer.valueOf(i12), 0, Integer.valueOf(1060547232 + (((~((-496870223) | i21)) | (-552098550)) * (-933)) + (((~(i21 | (-552098550))) | 543185073) * 933) + 291017728)};
                                method = map4.get(552468314);
                                if (method != null) {
                                    Class cls10 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 2245, (char) (46664 - Gravity.getAbsoluteGravity(0, 0)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26);
                                    byte b17 = (byte) (-bArr5[1]);
                                    byte b18 = (byte) (-bArr5[14]);
                                    Object[] objArr19 = new Object[1];
                                    a(b17, b18, b18, objArr19);
                                    method = cls10.getMethod((String) objArr19[0], cls, cls, cls);
                                    map4.put(552468314, method);
                                }
                                ((int[]) objArr17[3])[0] = ((Integer) ((Method) method).invoke(null, objArr18)).intValue();
                                return objArr17;
                            }
                        }
                    } else if (Build.VERSION.SDK_INT == 30) {
                        ChallengeResultCancelled = (getSDKEphemeralPublicKey + 19) % 128;
                        Object[] objArr110 = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                        int i22 = ~i11;
                        Object[] objArr111 = {Integer.valueOf(i12), 0, Integer.valueOf(1060547232 + (((~((-496870223) | i22)) | (-552098550)) * (-933)) + (((~(i22 | (-552098550))) | 543185073) * 933) + 291017728)};
                        method = map4.get(552468314);
                        if (method != null) {
                            Class cls11 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 2245, (char) (46664 - Gravity.getAbsoluteGravity(0, 0)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26);
                            byte b19 = (byte) (-bArr5[1]);
                            byte b110 = (byte) (-bArr5[14]);
                            Object[] objArr112 = new Object[1];
                            a(b19, b110, b110, objArr112);
                            method = cls11.getMethod((String) objArr112[0], cls, cls, cls);
                            map4.put(552468314, method);
                        }
                        ((int[]) objArr110[3])[0] = ((Integer) ((Method) method).invoke(null, objArr111)).intValue();
                        return objArr110;
                    }
                    try {
                        r11 = 33;
                        try {
                            if (Build.VERSION.SDK_INT > 33) {
                                getSDKEphemeralPublicKey = (ChallengeResultCancelled + 55) % 128;
                                r11 = new Object[1];
                                b((-92) - (ViewConfiguration.getEdgeSlop() >> 16), 1521799440 - TextUtils.lastIndexOf("", '0', 0), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 115), (ViewConfiguration.getScrollBarSize() >> 8) + 1094851146, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 47), r11);
                                try {
                                    Object[] objArr20 = {((String) r11[0]).intern()};
                                    Object method6 = map4.get(-1512020881);
                                    if (method6 != null) {
                                        r11 = r11;
                                    } else {
                                        Class cls12 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2270 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), 20 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                        byte b21 = bArr5[8];
                                        Object[] objArr21 = new Object[1];
                                        a(b21, b21, (byte) (-bArr5[16]), objArr21);
                                        method6 = cls12.getMethod((String) objArr21[0], String.class);
                                        map4.put(-1512020881, method6);
                                        r11 = -1512020881;
                                    }
                                    long jLongValue = ((Long) ((Method) method6).invoke(null, objArr20)).longValue();
                                    long j11 = -114530300;
                                    long j12 = -721;
                                    r11 = cls;
                                    long j13 = i11;
                                    long j14 = -1;
                                    long j15 = j11 ^ j14;
                                    long j16 = jLongValue ^ j14;
                                    long j17 = (j11 | jLongValue) ^ j14;
                                    long j18 = (j12 * j11) + (j12 * jLongValue) + (((long) 1444) * ((j13 ^ j14) | ((j15 | j16) ^ j14) | j17)) + (((long) (-1444)) * (j17 | ((j11 | j13) ^ j14) | ((j13 | jLongValue) ^ j14))) + (((long) 722) * (((j15 | jLongValue) ^ j14) | (j14 ^ (j16 | j11)))) + ((long) 831336548);
                                    int i23 = ((int) (j18 >> 32)) & (11407270 + (((~(1342364384 | i11)) | 94707722) * (-140)) + ((~(1437072106 | i11)) * 70) + (((~(94862026 | i11)) | 1436917802) * 70));
                                    int i24 = ~i11;
                                    if ((i23 | (((int) j18) & (1688484646 + (((~((-1709778934) | i24)) | 1147961952) * (-602)) + (((~((-1709778934) | i11)) | 1147667040 | (~(1710073845 | i24))) * (-301)) + ((~(i24 | 1147961952)) * EnumC4419g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE)))) == 1) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                        r12 = r11;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause = th2.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } else {
                                r11 = cls;
                                Object[] objArr22 = new Object[1];
                                b(TextUtils.lastIndexOf("", '0', 0) - 106, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1521799507, (short) ((-27) - View.combineMeasuredStates(0, 0)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1094851173, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9), objArr22);
                                try {
                                    Object[] objArr23 = {((String) objArr22[0]).intern()};
                                    Object method7 = map4.get(416364664);
                                    if (method7 == null) {
                                        Class cls13 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.makeMeasureSpec(0, 0) + 1486, (char) (16176 - TextUtils.getOffsetAfter("", 0)), 36 - (ViewConfiguration.getEdgeSlop() >> 16));
                                        byte b22 = bArr5[29];
                                        byte b23 = b22;
                                        Object[] objArr24 = new Object[1];
                                        a(b22, b23, b23, objArr24);
                                        method7 = cls13.getMethod((String) objArr24[0], String.class);
                                        map4.put(416364664, method7);
                                    }
                                    Object objInvoke2 = ((Method) method7).invoke(null, objArr23);
                                    Object[] objArr25 = new Object[1];
                                    b((-119) - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1521799443, (short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 81), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1094851186, (byte) ((-96) - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr25);
                                    zEquals = objInvoke2.equals(((String) objArr25[0]).intern());
                                    r12 = r11;
                                } catch (Throwable th3) {
                                    Throwable cause2 = th3.getCause();
                                    if (cause2 != null) {
                                        throw cause2;
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        r11 = cls;
                    }
                    if (!zEquals) {
                        r12 = r11;
                        Object[] objArr26 = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                        int i25 = ~i11;
                        Object[] objArr27 = {Integer.valueOf(i12), 0, Integer.valueOf(159928613 + (((~((-35702894) | i25)) | (~(i11 | 1013265878))) * 333) + (((~(i11 | (-35702894))) | (~(i25 | 1013265878))) * 333))};
                        Map map5 = atd.a.getMessageVersion.timedout;
                        Object method8 = map5.get(552468314);
                        if (method8 == null) {
                            Class cls14 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + 2244, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 46664), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26);
                            byte[] bArr6 = $$a;
                            byte b24 = (byte) (-bArr6[1]);
                            byte b25 = (byte) (-bArr6[14]);
                            Object[] objArr28 = new Object[1];
                            a(b24, b25, b25, objArr28);
                            method8 = cls14.getMethod((String) objArr28[0], r12, r12, r12);
                            map5.put(552468314, method8);
                        }
                        ((int[]) objArr26[3])[0] = ((Integer) ((Method) method8).invoke(null, objArr27)).intValue();
                        return objArr26;
                    }
                    r12 = r11;
                    ChallengeResultCancelled = (getSDKEphemeralPublicKey + 71) % 128;
                    Object[] objArr29 = {new int[]{i11}, new int[]{i11 ^ 10}, null, new int[1]};
                    Object[] objArr30 = {Integer.valueOf(i12), 16, Integer.valueOf(915874379 + (((~((-517965517) | i11)) | 512099908) * 336) + (((~(i11 | 531003255)) | (-536868864)) * (-168)) + (((-517965517) | (~((~i11) | 531003255))) * 168))};
                    Map map6 = atd.a.getMessageVersion.timedout;
                    Object method9 = map6.get(552468314);
                    if (method9 == null) {
                        Class cls15 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2244 - Color.red(0), (char) (46665 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27);
                        byte[] bArr7 = $$a;
                        byte b26 = (byte) (-bArr7[1]);
                        byte b27 = (byte) (-bArr7[14]);
                        Object[] objArr31 = new Object[1];
                        a(b26, b27, b27, objArr31);
                        method9 = cls15.getMethod((String) objArr31[0], r12, r12, r12);
                        map6.put(552468314, method9);
                    }
                    ((int[]) objArr29[3])[0] = ((Integer) ((Method) method9).invoke(null, objArr30)).intValue();
                    int i26 = ChallengeResultCancelled + 47;
                    getSDKEphemeralPublicKey = i26 % 128;
                    if (i26 % 2 != 0) {
                        return objArr29;
                    }
                    throw null;
                } catch (Throwable th4) {
                    Throwable cause3 = th4.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                Throwable cause4 = th5.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th5;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0024  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void a(byte r6, byte r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 2
                int r6 = 66 - r6
                int r8 = 122 - r8
                byte[] r0 = atd.m.completed.getSDKReferenceNumber.$$a
                int r1 = r7 + 2
                byte[] r1 = new byte[r1]
                int r7 = r7 + 1
                r2 = 0
                if (r0 != 0) goto L16
                r8 = r6
                r3 = r0
                r4 = r2
                r0 = r7
                goto L2e
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L24:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r4
                r4 = r3
                r3 = r0
                r0 = r5
            L2e:
                int r0 = r0 + r6
                int r6 = r0 + 6
                int r8 = r8 + 1
                r0 = r8
                r8 = r6
                r6 = r0
                r0 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.completed.getSDKReferenceNumber.a(byte, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:46:0x01e7 A[PHI: r2
          0x01e7: PHI (r2v8 int) = (r2v7 int), (r2v22 int) binds: [B:45:0x01e5, B:42:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:47:0x01e9 A[PHI: r2
          0x01e9: PHI (r2v19 int) = (r2v7 int), (r2v22 int) binds: [B:45:0x01e5, B:42:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
        private static void b(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
            boolean z11;
            long j11;
            int i14;
            int i15;
            boolean z12;
            int i16;
            Object method;
            atd.az.ChallengeResultKt challengeResultKt = new atd.az.ChallengeResultKt();
            StringBuilder sb2 = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKTransactionID)};
                int i17 = 0;
                Map map = atd.a.getMessageVersion.timedout;
                Object method2 = map.get(557807898);
                Class cls = Integer.TYPE;
                if (method2 == null) {
                    Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2105 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 21996), View.resolveSizeAndState(0, 0, 0) + 31);
                    byte b12 = (byte) ($$d[2] + 1);
                    byte b13 = b12;
                    Object[] objArr3 = new Object[1];
                    c(b12, b13, b13, objArr3);
                    method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                    map.put(557807898, method2);
                }
                int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                boolean z13 = iIntValue == -1;
                if (z13) {
                    byte[] bArr = getSDKAppID;
                    if (bArr != null) {
                        j11 = -671853308956415234L;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i18 = 0;
                        while (i18 < length) {
                            Object[] objArr4 = {Integer.valueOf(bArr[i18])};
                            Map map2 = atd.a.getMessageVersion.timedout;
                            Object obj = map2.get(-844142059);
                            if (obj != null) {
                                method = obj;
                            } else {
                                method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", i17) + 2936, (char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 34)).getMethod("s", cls);
                                map2.put(-844142059, method);
                            }
                            bArr2[i18] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                            i18++;
                            bArr = bArr;
                            z13 = z13;
                            i17 = i17;
                        }
                        bArr = bArr2;
                    } else {
                        j11 = -671853308956415234L;
                    }
                    z11 = z13;
                    int i19 = i17;
                    if (bArr != null) {
                        byte[] bArr3 = getSDKAppID;
                        Object[] objArr5 = new Object[2];
                        objArr5[r9] = Integer.valueOf(AuthenticationRequestParameters);
                        objArr5[i19] = Integer.valueOf(i13);
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(557807898);
                        if (method3 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2104 - MotionEvent.axisFromString(""), (char) (Color.rgb(i19, i19, i19) + 16799211), 31 - (TypedValue.complexToFraction(i19, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i19, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            byte b14 = (byte) ($$d[2] + 1);
                            byte b15 = b14;
                            Object[] objArr6 = new Object[1];
                            c(b14, b15, b15, objArr6);
                            method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                            map3.put(557807898, method3);
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                        $11 = ($10 + 17) % 128;
                    } else {
                        iIntValue = (short) (((short) (((long) getDeviceData[i13 + ((int) (((long) AuthenticationRequestParameters) ^ j11))]) ^ j11)) + ((int) (((long) getSDKTransactionID) ^ j11)));
                    }
                } else {
                    z11 = z13;
                    j11 = -671853308956415234L;
                }
                if (iIntValue > 0) {
                    int i21 = $10 + 57;
                    $11 = i21 % 128;
                    if (i21 % 2 == 0) {
                        i14 = ((i13 % iIntValue) % 3) - ((int) (((long) AuthenticationRequestParameters) ^ j11));
                        if (z11) {
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                    } else {
                        i14 = ((i13 + iIntValue) - 2) + ((int) (((long) AuthenticationRequestParameters) ^ j11));
                        if (z11) {
                            i15 = 1;
                        } else {
                            i15 = 0;
                        }
                    }
                    challengeResultKt.getDeviceData = i14 + i15;
                    Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getSDKReferenceNumber), sb2};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-1793105104);
                    if (method4 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2136, (char) Drawable.resolveOpacity(0, 0), 'L' - AndroidCharacter.getMirror('0'));
                        byte b16 = (byte) (-$$d[2]);
                        byte b17 = (byte) (b16 - 1);
                        Object[] objArr8 = new Object[1];
                        c(b16, b17, b17, objArr8);
                        method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                        map4.put(-1793105104, method4);
                    }
                    ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    byte[] bArr4 = getSDKAppID;
                    if (bArr4 != null) {
                        $10 = ($11 + 31) % 128;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i22 = 0; i22 < length2; i22++) {
                            bArr5[i22] = (byte) (((long) bArr4[i22]) ^ j11);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        $10 = ($11 + 21) % 128;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i23 = 1;
                    challengeResultKt.getSDKReferenceNumber = 1;
                    while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                        if (z12) {
                            int i24 = $11 + i23;
                            $10 = i24 % 128;
                            if (i24 % 2 != 0) {
                                byte[] bArr6 = getSDKAppID;
                                int i25 = challengeResultKt.getDeviceData;
                                challengeResultKt.getDeviceData = i25 % 1;
                                i16 = challengeResultKt.getSDKAppID / (((byte) (((byte) (((long) bArr6[i25]) / j11)) + s11)) ^ b11);
                            } else {
                                byte[] bArr7 = getSDKAppID;
                                int i26 = challengeResultKt.getDeviceData;
                                challengeResultKt.getDeviceData = i26 - 1;
                                i16 = challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr7[i26]) ^ j11)) + s11)) ^ b11);
                            }
                            challengeResultKt.getSDKTransactionID = (char) i16;
                        } else {
                            short[] sArr = getDeviceData;
                            int i27 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i27 - 1;
                            challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i27]) ^ j11)) + s11)) ^ b11));
                        }
                        sb2.append(challengeResultKt.getSDKTransactionID);
                        challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                        challengeResultKt.getSDKReferenceNumber++;
                        i23 = 1;
                    }
                }
                objArr[0] = sb2.toString();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
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
        private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.m.completed.getSDKReferenceNumber.$$d
                int r6 = r6 * 7
                int r6 = r6 + 114
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r8 = r8 * 3
                int r8 = r8 + 4
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r6 = r7
                r3 = r8
                r4 = r2
                goto L29
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r8]
            L29:
                int r8 = r8 + 1
                int r6 = r6 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.completed.getSDKReferenceNumber.c(byte, short, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{20, -31, -122, 77, -8, 9, -39, -21, 1, 1, 13, -5, -7, 7, -19, 3, -17, -4, -29, 33, -14, -17, -3, 7, 46, -7, -18, -9, 3, 0, -17, -12, -8, 13, -17, 0, -7, -34, 13, 6, -2, -22, 8, -5, -42, 11, 11, -23, 6, -14, 9, -21, 7, -5, -8, 9, -39, -21, 1, -16, 41, -6, -45, -11, -1, -27, -39};
            $$b = 255;
        }

        static void init$1() {
            $$d = new byte[]{31, -124, -1, 73};
            $$e = 97;
        }

        public /* synthetic */ getSDKReferenceNumber(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getScrollBarFadeDuration();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        new getSDKReferenceNumber((byte) 0);
        int i11 = AuthenticationRequestParameters + 109;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    static void AuthenticationRequestParameters() {
        getDeviceData = 1029304943;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        List listW1;
        String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
        int i11 = getSDKReferenceNumber + 95;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (strArr == null || (listW1 = n.w1(strArr)) == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            int i12 = getSDKReferenceNumber + 107;
            AuthenticationRequestParameters = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 84 / 0;
            }
            return failure;
        }
        int i14 = AuthenticationRequestParameters + 31;
        getSDKReferenceNumber = i14 % 128;
        int i15 = i14 % 2;
        List<? extends String> listM57constructorimpl = DeviceParameterResult.Success.StringsListValue.m57constructorimpl(listW1);
        if (i15 != 0) {
            return DeviceParameterResult.Success.StringsListValue.m56boximpl(listM57constructorimpl);
        }
        DeviceParameterResult.Success.StringsListValue.m56boximpl(listM57constructorimpl);
        throw null;
    }
}
