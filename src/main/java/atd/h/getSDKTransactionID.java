package atd.h;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.az.ChallengeResultCompleted;
import atd.az.ChallengeStatusHandler;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", "", "Success", "Failure", "UnsupportedDataVersion", "IllegalState", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Failure;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getSDKTransactionID {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Failure;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", AnalyticsAttribute.Error, "Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "getError", "()Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$IllegalState;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$UnsupportedDataVersion;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AuthenticationRequestParameters extends getSDKTransactionID {
        atd.ad.AuthenticationRequestParameters getDeviceData();
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$IllegalState;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Failure;", "<init>", "()V", AnalyticsAttribute.Error, "Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "getError", "()Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "equals", "", "other", "", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class getDeviceData implements AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int[] AuthenticationRequestParameters;
        public static final getDeviceData getDeviceData;
        private static int getSDKAppID;
        private static final atd.ad.AuthenticationRequestParameters getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKTransactionID = 0;
            getSDKAppID = 1;
            getSDKReferenceNumber();
            getDeviceData = new getDeviceData();
            getSDKReferenceNumber = atd.ad.AuthenticationRequestParameters.DEVICE_DATA_FAILURE;
            getSDKAppID = (getSDKTransactionID + 71) % 128;
        }

        private getDeviceData() {
        }

        private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
            char[] cArr;
            float f11;
            float f12;
            Object method;
            Object method2;
            ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
            char[] cArr2 = new char[4];
            int i12 = 2;
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr2 = AuthenticationRequestParameters;
            Class cls = Integer.TYPE;
            int i13 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i14 = 0;
                while (i14 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(2050190164);
                        if (obj != null) {
                            method2 = obj;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (CdmaCellLocation.convertQuartSecToDecDegrees(i13) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i13) == 0.0d ? 0 : -1)), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 21);
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, b12, objArr3);
                            method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(2050190164, method2);
                        }
                        iArr3[i14] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        i14++;
                        cArr2 = cArr2;
                        iArr3 = iArr3;
                        iArr2 = iArr2;
                        i13 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            char[] cArr4 = cArr2;
            int i15 = 16;
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = AuthenticationRequestParameters;
            float f13 = BitmapDescriptorFactory.HUE_RED;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i16 = 0;
                while (i16 < length3) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i16])};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map2.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                        f12 = f13;
                    } else {
                        f12 = f13;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1862 - (TypedValue.complexToFraction(0, f13, f13) > f12 ? 1 : (TypedValue.complexToFraction(0, f13, f13) == f12 ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'), 21 - KeyEvent.normalizeMetaState(0));
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method);
                    }
                    iArr6[i16] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i16++;
                    f13 = f12;
                    iArr5 = iArr5;
                    iArr6 = iArr6;
                    length3 = length3;
                    cArr3 = cArr3;
                }
                cArr = cArr3;
                f11 = f13;
                $11 = ($10 + 99) % 128;
                iArr5 = iArr6;
            } else {
                cArr = cArr3;
                f11 = 0.0f;
            }
            char c11 = 0;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            challengeResultCompleted.getDeviceData = 0;
            while (true) {
                int i17 = challengeResultCompleted.getDeviceData;
                if (i17 >= iArr.length) {
                    break;
                }
                int i18 = iArr[i17];
                char c12 = (char) (i18 >> 16);
                cArr4[c11] = c12;
                char c13 = (char) i18;
                cArr4[1] = c13;
                char c14 = (char) (iArr[i17 + 1] >> 16);
                cArr4[i12] = c14;
                char c15 = (char) iArr[i17 + 1];
                int i19 = 3;
                cArr4[3] = c15;
                challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
                challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
                ChallengeResultCompleted.getSDKAppID(iArr4);
                int i21 = 0;
                while (i21 < i15) {
                    int i22 = challengeResultCompleted.getSDKAppID ^ iArr4[i21];
                    challengeResultCompleted.getSDKAppID = i22;
                    int sDKAppID = ChallengeResultCompleted.getSDKAppID(i22);
                    Object[] objArr6 = new Object[4];
                    objArr6[i19] = challengeResultCompleted;
                    objArr6[i12] = challengeResultCompleted;
                    objArr6[1] = Integer.valueOf(sDKAppID);
                    objArr6[0] = challengeResultCompleted;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(929629307);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > f11 ? 1 : (AudioTrack.getMinVolume() == f11 ? 0 : -1)) + 1299, (char) (Color.green(0) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), 33 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        byte b15 = (byte) i19;
                        byte b16 = (byte) (b15 - 3);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, b16, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                        map3.put(929629307, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                    challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                    i21++;
                    i19 = i19;
                    i15 = 16;
                }
                int i23 = i19;
                int i24 = challengeResultCompleted.getSDKAppID;
                int i25 = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKAppID = i25;
                challengeResultCompleted.getSDKReferenceNumber = i24;
                i15 = 16;
                int i26 = i24 ^ iArr4[16];
                challengeResultCompleted.getSDKReferenceNumber = i26;
                int i27 = i25 ^ iArr4[17];
                challengeResultCompleted.getSDKAppID = i27;
                cArr4[0] = (char) (i27 >>> 16);
                cArr4[1] = (char) i27;
                cArr4[i12] = (char) (i26 >>> 16);
                cArr4[i23] = (char) i26;
                ChallengeResultCompleted.getSDKAppID(iArr4);
                int i28 = challengeResultCompleted.getDeviceData;
                cArr[i28 * 2] = cArr4[0];
                cArr[(i28 * 2) + 1] = cArr4[1];
                cArr[(i28 * 2) + 2] = cArr4[i12];
                cArr[(i28 * 2) + 3] = cArr4[i23];
                Object[] objArr8 = new Object[i12];
                objArr8[1] = challengeResultCompleted;
                objArr8[0] = challengeResultCompleted;
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(1109131256);
                if (method4 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID((TypedValue.complexToFloat(0) > f11 ? 1 : (TypedValue.complexToFloat(0) == f11 ? 0 : -1)) + 2061, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.argb(0, 0, 0, 0) + 17);
                    byte b17 = (byte) 2;
                    byte b18 = (byte) (b17 - 2);
                    Object[] objArr9 = new Object[1];
                    b(b17, b18, b18, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(1109131256, method4);
                }
                ((Method) method4).invoke(null, objArr8);
                c11 = 0;
                i12 = 2;
            }
            String str = new String(cArr, 0, i11);
            int i29 = $10 + 11;
            $11 = i29 % 128;
            if (i29 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 3
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r0 = r7 + 1
                int r6 = r6 + 117
                byte[] r1 = atd.h.getSDKTransactionID.getDeviceData.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L15
                r3 = r1
                r4 = r2
                r1 = r8
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r7) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L23:
                int r3 = r3 + 1
                r4 = r1[r8]
                r5 = r1
                r1 = r8
                r8 = r4
                r4 = r3
                r3 = r5
            L2c:
                int r6 = r6 + r8
                int r8 = r1 + 1
                r1 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.h.getSDKTransactionID.getDeviceData.b(short, byte, byte, java.lang.Object[]):void");
        }

        static void getSDKReferenceNumber() {
            AuthenticationRequestParameters = new int[]{1521994131, 34090555, 2132123750, -282889387, 996925885, 1129278658, -572479657, -1688758342, 230647800, 1701948790, -1277454436, -966604323, -1958877411, 303029792, 349902742, -834884420, -564088348, -2084160000};
        }

        static void init$0() {
            $$a = new byte[]{108, 15, 34, -15};
            $$b = 148;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                getSDKAppID = (getSDKTransactionID + 113) % 128;
                return true;
            }
            if (!(other instanceof getDeviceData)) {
                return false;
            }
            getSDKTransactionID = (getSDKAppID + 71) % 128;
            return true;
        }

        @Override // atd.h.getSDKTransactionID.AuthenticationRequestParameters
        public final atd.ad.AuthenticationRequestParameters getDeviceData() {
            int i11 = getSDKAppID + 79;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 == 0) {
                return getSDKReferenceNumber;
            }
            throw null;
        }

        public final int hashCode() {
            int i11 = getSDKAppID + 25;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 == 0) {
                return 82294022;
            }
            throw null;
        }

        public final String toString() throws Throwable {
            Object obj;
            int i11 = getSDKAppID + 93;
            getSDKTransactionID = i11 % 128;
            if (i11 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new int[]{1513121612, -656549713, -111340596, 1974881031, -210762583, -1565749595}, 95 / Process.getGidForName(""), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(new int[]{1513121612, -656549713, -111340596, 1974881031, -210762583, -1565749595}, Process.getGidForName("") + 13, objArr2);
                obj = objArr2[0];
            }
            return ((String) obj).intern();
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$UnsupportedDataVersion;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Failure;", "<init>", "()V", AnalyticsAttribute.Error, "Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "getError", "()Lcom/adyen/threeds2/internal/error/SdkRuntimeError;", "equals", "", "other", "", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class getSDKReferenceNumber implements AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final getSDKReferenceNumber AuthenticationRequestParameters;
        private static int ChallengeResult;
        private static char ChallengeResultCancelled;
        private static char getDeviceData;
        private static int getMessageVersion;
        private static char getSDKAppID;
        private static char getSDKReferenceNumber;
        private static final atd.ad.AuthenticationRequestParameters getSDKTransactionID;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            ChallengeResult = 0;
            getMessageVersion = 1;
            getSDKReferenceNumber();
            AuthenticationRequestParameters = new getSDKReferenceNumber();
            getSDKTransactionID = atd.ad.AuthenticationRequestParameters.DEVICE_DATA_FAILURE;
            getMessageVersion = (ChallengeResult + 121) % 128;
        }

        private getSDKReferenceNumber() {
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0025  */
        /* JADX WARN: Code duplicated, block: B:9:0x002a  */
        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            Object charArray;
            int i12;
            int i13 = $10 + 85;
            $11 = i13 % 128;
            int i14 = 2;
            int i15 = 0;
            if (i13 % 2 == 0) {
                int i16 = 77 / 0;
                if (str != null) {
                    charArray = str.toCharArray();
                } else {
                    charArray = str;
                }
            } else if (str != null) {
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = (char[]) charArray;
            ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
            char[] cArr2 = new char[cArr.length];
            challengeStatusHandler.getSDKReferenceNumber = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i17 = challengeStatusHandler.getSDKReferenceNumber;
                if (i17 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i11);
                    return;
                }
                cArr3[i15] = cArr[i17];
                int i18 = 1;
                cArr3[1] = cArr[i17 + 1];
                $10 = ($11 + 113) % 128;
                int i19 = 58224;
                int i21 = i15;
                while (i21 < 16) {
                    $11 = ($10 + 27) % 128;
                    char c11 = cArr3[i18];
                    char c12 = cArr3[i15];
                    int i22 = (c12 + i19) ^ ((c12 << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                    int i23 = c12 >>> 5;
                    int i24 = i14;
                    int i25 = i18;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(ChallengeResultCancelled);
                        objArr2[i24] = Integer.valueOf(i23);
                        objArr2[i25] = Integer.valueOf(i22);
                        objArr2[i15] = Integer.valueOf(c11);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i15;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSizeAndState(i15, i15, i15) + 1745, (char) (Gravity.getAbsoluteGravity(i15, i15) + 16682), (ViewConfiguration.getTapTimeout() >> 16) + 29);
                            byte b11 = (byte) i15;
                            byte b12 = b11;
                            i12 = i15;
                            Object[] objArr3 = new Object[i25];
                            b(b11, b12, (byte) (b12 + 1), objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i12];
                        int i26 = (cCharValue + i19) ^ ((cCharValue << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                        int i27 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(getSDKAppID);
                        objArr4[i24] = Integer.valueOf(i27);
                        objArr4[1] = Integer.valueOf(i26);
                        objArr4[i12] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            int i28 = i12;
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (16682 - KeyEvent.getDeadChar(i28, i28)), (ViewConfiguration.getTapTimeout() >> 16) + 29);
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            b(b13, b14, (byte) (b14 + 1), objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i19 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i21++;
                        i14 = i24;
                        cArr = cArr;
                        cArr3 = cArr3;
                        i15 = 0;
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
                int i29 = i14;
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
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 1596, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 27824), TextUtils.indexOf((CharSequence) "", '0', 0) + 26);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                $10 = ($11 + 59) % 128;
                i14 = i29;
                cArr = cArr4;
                cArr3 = cArr5;
                i15 = 0;
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
        private static void b(int r5, int r6, short r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 2
                int r0 = r6 + 1
                int r5 = r5 * 3
                int r5 = 4 - r5
                byte[] r1 = atd.h.getSDKTransactionID.getSDKReferenceNumber.$$a
                int r7 = r7 * 4
                int r7 = 116 - r7
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L28
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L26:
                r3 = r1[r5]
            L28:
                int r3 = -r3
                int r5 = r5 + 1
                int r7 = r7 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.h.getSDKTransactionID.getSDKReferenceNumber.b(int, int, short, java.lang.Object[]):void");
        }

        static void getSDKReferenceNumber() {
            getSDKReferenceNumber = (char) 53109;
            getSDKAppID = (char) 51399;
            getDeviceData = (char) 44316;
            ChallengeResultCancelled = (char) 42339;
        }

        static void init$0() {
            $$a = new byte[]{86, -79, -114, -51};
            $$b = 11;
        }

        public final boolean equals(Object other) {
            int i11 = getMessageVersion + 71;
            int i12 = i11 % 128;
            ChallengeResult = i12;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (this == other) {
                return true;
            }
            if (other instanceof getSDKReferenceNumber) {
                return true;
            }
            getMessageVersion = (i12 + 45) % 128;
            return false;
        }

        @Override // atd.h.getSDKTransactionID.AuthenticationRequestParameters
        public final atd.ad.AuthenticationRequestParameters getDeviceData() {
            int i11 = (getMessageVersion + 53) % 128;
            ChallengeResult = i11;
            atd.ad.AuthenticationRequestParameters authenticationRequestParameters = getSDKTransactionID;
            int i12 = i11 + 105;
            getMessageVersion = i12 % 128;
            if (i12 % 2 != 0) {
                return authenticationRequestParameters;
            }
            throw null;
        }

        public final int hashCode() {
            int i11 = getMessageVersion + 43;
            ChallengeResult = i11 % 128;
            if (i11 % 2 == 0) {
                return -510112540;
            }
            throw null;
        }

        public final String toString() throws Throwable {
            Object obj;
            int i11 = ChallengeResult + 87;
            getMessageVersion = i11 % 128;
            if (i11 % 2 == 0) {
                Object[] objArr = new Object[1];
                a("싪㳌狋\uf5bd㿅朶獛姥寠鐕瞄ꟛ棅ꨓ꾉Â頚促\udc1eČ\ue9f5슝", MotionEvent.axisFromString("") + 4, objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a("싪㳌狋\uf5bd㿅朶獛姥寠鐕瞄ꟛ棅ꨓ꾉Â頚促\udc1eČ\ue9f5슝", 21 - MotionEvent.axisFromString(""), objArr2);
                obj = objArr2[0];
            }
            String strIntern = ((String) obj).intern();
            getMessageVersion = (ChallengeResult + 69) % 128;
            return strIntern;
        }
    }

    /* JADX INFO: renamed from: atd.h.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult$Success;", "Lcom/adyen/threeds2/internal/deviceinfo/DeviceDataResult;", "data", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "getData", "()Lorg/json/JSONObject;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0264getSDKTransactionID implements getSDKTransactionID {
        private static int AuthenticationRequestParameters = 1;
        private static int getSDKAppID;
        private final JSONObject getSDKTransactionID;

        public C0264getSDKTransactionID(JSONObject jSONObject) {
            p013kotlin.jvm.internal.s.k(jSONObject, "");
            this.getSDKTransactionID = jSONObject;
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
            C0264getSDKTransactionID c0264getSDKTransactionID = (C0264getSDKTransactionID) objArr[0];
            int i11 = getSDKAppID;
            int i12 = i11 & 7;
            int i13 = ((i11 ^ 7) | i12) << 1;
            int i14 = -((~i12) & (i11 | 7));
            int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
            AuthenticationRequestParameters = i15 % 128;
            int i16 = i15 % 2;
            JSONObject jSONObject = c0264getSDKTransactionID.getSDKTransactionID;
            if (i16 == 0) {
                int i17 = 15 / 0;
            }
            int i18 = i11 | 79;
            int i19 = i18 << 1;
            int i21 = -(i18 & (~(i11 & 79)));
            AuthenticationRequestParameters = ((i19 & i21) + (i21 | i19)) % 128;
            return jSONObject;
        }

        public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
            return getSDKAppID(objArr);
        }

        public final JSONObject getSDKTransactionID() {
            return (JSONObject) getSDKTransactionID(new Object[]{this}, -563555601, 563555601, System.identityHashCode(this));
        }
    }
}
