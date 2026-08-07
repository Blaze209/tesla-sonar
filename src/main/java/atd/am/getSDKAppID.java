package atd.am;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultError;
import atd.az.ChallengeStatusHandler;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006J\r\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/result/Result;", "T", "", "getOrThrow", "()Ljava/lang/Object;", "Success", "Failure", "Lcom/adyen/threeds2/internal/result/Result$Failure;", "Lcom/adyen/threeds2/internal/result/Result$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getSDKAppID<T> {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/adyen/threeds2/internal/result/Result$Success;", "T", "Lcom/adyen/threeds2/internal/result/Result;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/adyen/threeds2/internal/result/Result$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class getDeviceData<T> implements getSDKAppID<T> {
        private static int getSDKAppID = 1;
        private static int getSDKReferenceNumber;
        private final T getDeviceData;

        public getDeviceData(T t11) {
            this.getDeviceData = t11;
        }

        public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = (i11 * (-209)) + (i12 * (-209)) + ((~(i14 | i15)) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            int i17 = ~i13;
            int i18 = i16 + (((~(i15 | i17)) | (~(i14 | i13))) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE) + (((~(i11 | i15 | i13)) | (~(i12 | i14 | i17))) * EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            if (i18 == 1) {
                getDeviceData getdevicedata = (getDeviceData) objArr[0];
                int i19 = getSDKAppID;
                int i21 = i19 ^ 69;
                int i22 = -(-((i19 & 69) << 1));
                getSDKReferenceNumber = ((i21 ^ i22) + ((i21 & i22) << 1)) % 128;
                T t11 = getdevicedata.getDeviceData;
                int i23 = i19 ^ 83;
                int i24 = -(-((i19 & 83) << 1));
                getSDKReferenceNumber = ((i23 ^ i24) + ((i24 & i23) << 1)) % 128;
                return t11;
            }
            if (i18 != 2) {
                if (i18 != 3) {
                    return i18 != 4 ? AuthenticationRequestParameters(objArr) : getDeviceData(objArr);
                }
                return getSDKAppID(objArr);
            }
            getDeviceData getdevicedata2 = (getDeviceData) objArr[0];
            int i25 = getSDKAppID;
            int i26 = i25 & 47;
            getSDKReferenceNumber = ((((i25 | 47) & (~i26)) - (~(i26 << 1))) - 1) % 128;
            Object sDKTransactionID = getSDKReferenceNumber.getSDKTransactionID(new Object[]{getdevicedata2}, 1928614189, -1928614189, (int) System.currentTimeMillis());
            int i27 = getSDKAppID;
            int i28 = ((i27 ^ 61) | (i27 & 61)) << 1;
            int i29 = -(((~i27) & 61) | (i27 & (-62)));
            getSDKReferenceNumber = (((i28 | i29) << 1) - (i29 ^ i28)) % 128;
            return sDKTransactionID;
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            StringBuilder sb2 = new StringBuilder("Success(value=");
            sb2.append(getdevicedata.getDeviceData);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            String string = sb2.toString();
            int i11 = getSDKAppID;
            int i12 = (i11 & 43) + (i11 | 43);
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 == 0) {
                return string;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
            int i11;
            int i12;
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            Object obj = objArr[1];
            int i13 = getSDKAppID;
            int i14 = ((i13 ^ 73) + ((i13 & 73) << 1)) % 128;
            getSDKReferenceNumber = i14;
            if (getdevicedata == obj) {
                int i15 = ((i13 & 31) + (i13 | 31)) % 128;
                getSDKReferenceNumber = i15;
                i11 = i15 ^ 15;
                i12 = (i15 & 15) << 1;
            } else {
                if (!(obj instanceof getDeviceData)) {
                    int i16 = (i14 ^ 25) + ((i14 & 25) << 1);
                    getSDKAppID = i16 % 128;
                    if (i16 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
                if (!s.f(getdevicedata.getDeviceData, ((getDeviceData) obj).getDeviceData)) {
                    int i17 = getSDKAppID;
                    int i18 = i17 & 11;
                    int i19 = -(-(i17 | 11));
                    int i21 = (i18 & i19) + (i19 | i18);
                    getSDKReferenceNumber = i21 % 128;
                    return Boolean.valueOf(i21 % 2 != 0);
                }
                int i22 = getSDKReferenceNumber;
                i11 = i22 & 31;
                i12 = i22 | 31;
            }
            getSDKAppID = (i11 + i12) % 128;
            return Boolean.TRUE;
        }

        public final boolean equals(Object other) {
            return ((Boolean) AuthenticationRequestParameters(new Object[]{this, other}, 179706967, -179706964, System.identityHashCode(this))).booleanValue();
        }

        @Override // atd.am.getSDKAppID
        public final T getSDKReferenceNumber() {
            return (T) AuthenticationRequestParameters(new Object[]{this}, 1902854959, -1902854957, System.identityHashCode(this));
        }

        public final int hashCode() {
            return ((Integer) AuthenticationRequestParameters(new Object[]{this}, -1975144282, 1975144282, System.identityHashCode(this))).intValue();
        }

        public final String toString() {
            return (String) AuthenticationRequestParameters(new Object[]{this}, -516632986, 516632990, System.identityHashCode(this));
        }

        public final T getDeviceData() {
            return (T) AuthenticationRequestParameters(new Object[]{this}, -389237788, 389237789, System.identityHashCode(this));
        }

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            int i11 = getSDKAppID;
            int i12 = i11 & 69;
            getSDKReferenceNumber = ((((~i12) & (i11 | 69)) - (~(i12 << 1))) - 1) % 128;
            T t11 = getdevicedata.getDeviceData;
            if (t11 == null) {
                int i13 = ((i11 | 55) << 1) - (i11 ^ 55);
                getSDKReferenceNumber = i13 % 128;
                if (i13 % 2 == 0) {
                    return 0;
                }
                throw null;
            }
            int iHashCode = t11.hashCode();
            int iIdentityHashCode = System.identityHashCode(getdevicedata);
            int i14 = (-1959765533) ^ iIdentityHashCode;
            int i15 = ~iIdentityHashCode;
            int i16 = (-1959765533) & iIdentityHashCode;
            int i17 = ~((i14 & i16) | (i14 ^ i16));
            int i18 = 2068240342 ^ i17;
            int i19 = i17 & 2068240342;
            int i21 = (-2) - (((-441501141) - (~(-(-(((i19 & i18) | (i18 ^ i19)) * 191))))) ^ (-1));
            int i22 = (iIdentityHashCode | i15) & (~iIdentityHashCode);
            int i23 = (1959765532 & i22) | ((~i22) & (-1959765533));
            int i24 = i22 & (-1959765533);
            int i25 = ((~((i24 & i23) | (i23 ^ i24))) | 1883670036) * 191;
            int i26 = i21 & i25;
            int i27 = (i26 - (~((i25 ^ i21) | i26))) - 1;
            int iIdentityHashCode2 = System.identityHashCode(getdevicedata);
            int i28 = ~iIdentityHashCode2;
            int i29 = (-682192381) & i28;
            int i31 = (i28 | (-682192381)) & (~i29);
            int i32 = ~((i31 & i29) | (i31 ^ i29));
            int i33 = ((~i32) & 1054822361) | (i32 & (-1054822362));
            int i34 = i32 & 1054822361;
            int i35 = -(-(((i34 & i33) | (i33 ^ i34)) * (-933)));
            int i36 = 1059453712 & i35;
            int i37 = (((1059453712 ^ i35) | i36) << 1) - ((i35 | 1059453712) & (~i36));
            int i38 = ~iIdentityHashCode2;
            int i39 = ((~i38) & 1054822361) | (i38 & (-1054822362));
            int i41 = i38 & 1054822361;
            int i42 = ~((i41 & i39) | (i39 ^ i41));
            int i43 = i42 & (-1056927742);
            int i44 = (i42 | (-1056927742)) & (~i43);
            int i45 = -(~(((i44 & i43) | (i44 ^ i43)) * 933));
            int i46 = ((i37 ^ i45) + ((i45 & i37) << 1)) - 1;
            if (i27 > (i46 & 1735740837) + (1735740837 | i46)) {
                return Integer.valueOf(iHashCode);
            }
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static char[] AuthenticationRequestParameters;
        private static int ChallengeResultCancelled;
        private static char getDeviceData;
        private static char getSDKAppID;
        private static int getSDKEphemeralPublicKey;
        private static char getSDKReferenceNumber;
        private static char getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getSDKEphemeralPublicKey = 0;
            ChallengeResultCancelled = 1;
            AuthenticationRequestParameters = new char[]{30813, 30950, 30938, 30940, 30945, 30947, 30941, 30945, 30947, 30940, 30946, 30940, 30940, 30941, 30964, 30969, 30941, 30949, 30941, 30932, 30938, 30939, 30931, 30964, 30848, 30940, 30933, 30939, 30972, 30964, 30963, 30871, 30873, 30872, 30852, 30851, 30871, 30873, 30732, 30826, 30732, 30844, 30808, 30802, 30798, 30805, 30807, 30825, 30721, 30843, 30838, 30837, 30826, 30839, 30846, 30729, 30838, 30808, 30802, 30798, 30805, 30807, 30825, 30721, 30840, 30723, 30839, 30800, 30805, 30727, 30802, 30808, 30802, 30812, 30822, 30812, 30809, 30808, 30810, 30808, 30823, 30825, 30809, 30809, 30810, 30808, 30819, 30863, 30861, 30974, 30848, 30974, 30975, 30850, 30860, 30850, 30968, 30974, 30974, 30973, 30911, 31033, 31032, 31034, 31032, 30921, 30917, 31028, 31028, 31030, 31033, 31031, 31029, 31022, 31026, 31032, 30935, 30934, 31031, 31024, 31023, 31026, 31031, 31023, 30927, 30929, 31024, 30931, 30945, 30918, 30821, 30865, 30864, 30856, 30857, 30867, 30868, 30867, 30869, 30863, 30754, 30730, 30732, 30735, 30845, 30901, 31021, 31024, 31025, 31031, 31038, 30927, 30925, 31028, 31030, 31038, 31034, 31035, 31035, 31026, 31023, 31031, 30924, 30952, 30929, 31023, 31031, 31036, 30936, 30927, 31018, 31026, 31029, 31023, 31028, 31036, 31028, 30928, 30939, 31031, 31031, 31037, 30732, 30805, 30797, 30794, 30804, 30809, 30804, 30806, 30816, 30846, 30835, 30800, 30833, 30831, 30799, 30807, 30802, 30799, 30800, 30807, 30838, 30839, 30808, 30802, 30798, 30805, 30807, 30809, 30724, 30802, 30808, 30808, 30807, 30807, 30805, 30807, 30804, 30802, 30826, 30826, 30805, 30797, 30800, 30809, 30809, 30808, 30812, 30724, 30802, 30809, 30811, 30805, 30805, 30841, 30830, 30802, 30810, 30802, 30797, 30803, 30800, 30792, 30829, 30838, 30810, 30805, 30797, 30831, 30845, 30840, 30732, 30730, 30720, 30826, 30805, 30797, 30800, 30809, 30809, 30808, 30812};
            getSDKTransactionID = (char) 52095;
            getSDKAppID = (char) 41223;
            getDeviceData = (char) 3114;
            getSDKReferenceNumber = (char) 54337;
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
        private static void a(short r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = atd.am.getSDKAppID.getSDKReferenceNumber.$$a
                int r8 = r8 * 3
                int r8 = 3 - r8
                int r7 = r7 * 4
                int r7 = r7 + 21
                int r9 = r9 * 2
                int r9 = r9 + 103
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r0
                r4 = r2
                r0 = r9
                r9 = r8
                goto L31
            L18:
                r3 = r2
            L19:
                int r8 = r8 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r7) goto L2a
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
                int r8 = -r8
                int r0 = r0 + r8
                int r8 = r0 + 3
                r0 = r9
                r9 = r8
                r8 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.am.getSDKAppID.getSDKReferenceNumber.a(short, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:32:0x012f  */
        /* JADX WARN: Code duplicated, block: B:35:0x0137 A[PHI: r8
          0x0137: PHI (r8v4 char) = (r8v3 char), (r8v24 char) binds: [B:34:0x0135, B:30:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x0152  */
        /* JADX WARN: Code duplicated, block: B:39:0x0155 A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:13:0x006c, B:17:0x00d9, B:16:0x008f, B:43:0x01a1, B:47:0x01e7, B:50:0x01fb, B:54:0x0250, B:53:0x0214, B:46:0x01bc, B:36:0x013b, B:40:0x018e, B:39:0x0155), top: B:85:0x006c }] */
        /* JADX WARN: Code duplicated, block: B:45:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:46:0x01bc A[Catch: all -> 0x0262, TryCatch #0 {all -> 0x0262, blocks: (B:13:0x006c, B:17:0x00d9, B:16:0x008f, B:43:0x01a1, B:47:0x01e7, B:50:0x01fb, B:54:0x0250, B:53:0x0214, B:46:0x01bc, B:36:0x013b, B:40:0x018e, B:39:0x0155), top: B:85:0x006c }] */
        private static void b(boolean z11, String str, int[] iArr, Object[] objArr) throws Throwable {
            int i11;
            char[] cArr;
            char c11;
            Map map;
            Object method;
            Class<Object> cls;
            Map map2;
            Object method2;
            int length;
            char[] cArr2;
            int i12;
            Object method3;
            String str2 = str;
            Class<Object> cls2 = Object.class;
            Integer num = -399400818;
            Object bytes = str2;
            if (str2 != null) {
                $10 = ($11 + 25) % 128;
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            ChallengeResultError challengeResultError = new ChallengeResultError();
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            int i16 = iArr[3];
            char[] cArr3 = AuthenticationRequestParameters;
            Class cls3 = Integer.TYPE;
            int i17 = 2;
            if (cArr3 != null) {
                int i18 = $11 + 77;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i12 = 1;
                } else {
                    length = cArr3.length;
                    cArr2 = new char[length];
                    i12 = 0;
                }
                while (i12 < length) {
                    try {
                        int i19 = i12;
                        Object[] objArr2 = {Integer.valueOf(cArr3[i12])};
                        int i21 = length;
                        Map map3 = getMessageVersion.timedout;
                        Object obj = map3.get(-1708792688);
                        if (obj != null) {
                            method3 = obj;
                        } else {
                            Class cls4 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2314, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 24 - Color.green(0));
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            d(b11, b12, (byte) (b12 | 8), objArr3);
                            method3 = cls4.getMethod((String) objArr3[0], cls3);
                            map3.put(-1708792688, method3);
                        }
                        cArr2[i19] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                        i12 = i19 + 1;
                        length = i21;
                        i15 = i15;
                        cArr2 = cArr2;
                        i16 = i16;
                        cArr3 = cArr3;
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
                cArr3 = cArr2;
            } else {
                bArr = bArr;
            }
            Class<Object> cls5 = cls2;
            Integer num2 = num;
            int i22 = i15;
            int i23 = i16;
            char[] cArr4 = new char[i14];
            System.arraycopy(cArr3, i13, cArr4, 0, i14);
            if (bArr != null) {
                char[] cArr5 = new char[i14];
                challengeResultError.getSDKAppID = 0;
                char c12 = 0;
                while (true) {
                    int i24 = challengeResultError.getSDKAppID;
                    if (i24 >= i14) {
                        break;
                    }
                    int i25 = $10 + 87;
                    $11 = i25 % 128;
                    if (i25 % 2 == 0) {
                        c11 = 1;
                        if (bArr[i24] == 1) {
                            char c13 = cArr4[i24];
                            Object[] objArr4 = new Object[i17];
                            objArr4[c11] = Integer.valueOf(c12);
                            objArr4[0] = Integer.valueOf(c13);
                            map = getMessageVersion.timedout;
                            method = map.get(10570995);
                            if (method != null) {
                                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 558, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5486), 23 - TextUtils.indexOf("", "", 0, 0));
                                byte b13 = (byte) 0;
                                byte b14 = b13;
                                Object[] objArr5 = new Object[1];
                                d(b13, b14, (byte) (b14 | 9), objArr5);
                                method = cls6.getMethod((String) objArr5[0], cls3, cls3);
                                map.put(10570995, method);
                            }
                            cArr5[i24] = ((Character) ((Method) method).invoke(null, objArr4)).charValue();
                        } else {
                            cArr4 = cArr4;
                            Object[] objArr6 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c12)};
                            map2 = getMessageVersion.timedout;
                            method2 = map2.get(-502074319);
                            if (method2 != null) {
                                method2 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getTapTimeout() >> 16) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 25 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("a", cls3, cls3);
                                map2.put(-502074319, method2);
                            }
                            cArr5[i24] = ((Character) ((Method) method2).invoke(null, objArr6)).charValue();
                        }
                    } else {
                        c11 = 1;
                        if (bArr[i24] == 1) {
                            char c14 = cArr4[i24];
                            Object[] objArr7 = new Object[i17];
                            objArr7[c11] = Integer.valueOf(c12);
                            objArr7[0] = Integer.valueOf(c14);
                            map = getMessageVersion.timedout;
                            method = map.get(10570995);
                            if (method != null) {
                                Class cls7 = (Class) getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 558, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5486), 23 - TextUtils.indexOf("", "", 0, 0));
                                byte b15 = (byte) 0;
                                byte b16 = b15;
                                Object[] objArr8 = new Object[1];
                                d(b15, b16, (byte) (b16 | 9), objArr8);
                                method = cls7.getMethod((String) objArr8[0], cls3, cls3);
                                map.put(10570995, method);
                            }
                            cArr5[i24] = ((Character) ((Method) method).invoke(null, objArr7)).charValue();
                        } else {
                            cArr4 = cArr4;
                            Object[] objArr9 = {Integer.valueOf(cArr4[i24]), Integer.valueOf(c12)};
                            map2 = getMessageVersion.timedout;
                            method2 = map2.get(-502074319);
                            if (method2 != null) {
                                method2 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getTapTimeout() >> 16) + EnumC4419g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 25 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("a", cls3, cls3);
                                map2.put(-502074319, method2);
                            }
                            cArr5[i24] = ((Character) ((Method) method2).invoke(null, objArr9)).charValue();
                        }
                    }
                    c12 = cArr5[challengeResultError.getSDKAppID];
                    Object[] objArr10 = {challengeResultError, challengeResultError};
                    Map map4 = getMessageVersion.timedout;
                    Integer num3 = num2;
                    Object method4 = map4.get(num3);
                    if (method4 != null) {
                        cls = cls5;
                    } else {
                        Class cls8 = (Class) getMessageVersion.getSDKTransactionID(854 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) View.resolveSizeAndState(0, 0, 0), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr11 = new Object[1];
                        d(b17, b18, (byte) (b18 | 6), objArr11);
                        cls = cls5;
                        method4 = cls8.getMethod((String) objArr11[0], cls, cls);
                        map4.put(num3, method4);
                    }
                    ((Method) method4).invoke(null, objArr10);
                    num2 = num3;
                    cls5 = cls;
                    cArr4 = cArr4;
                    cArr5 = cArr5;
                    i17 = 2;
                }
                cArr4 = cArr5;
            }
            if (i23 > 0) {
                int i26 = $10 + 41;
                $11 = i26 % 128;
                if (i26 % 2 == 0) {
                    char[] cArr6 = new char[i14];
                    System.arraycopy(cArr4, 0, cArr6, 0, i14);
                    System.arraycopy(cArr6, 1, cArr4, i14 % i23, i23);
                    System.arraycopy(cArr6, i23, cArr4, 0, i14 - i23);
                } else {
                    char[] cArr7 = new char[i14];
                    System.arraycopy(cArr4, 0, cArr7, 0, i14);
                    int i27 = i14 - i23;
                    System.arraycopy(cArr7, 0, cArr4, i27, i23);
                    System.arraycopy(cArr7, i23, cArr4, 0, i27);
                }
            }
            if (z11) {
                int i28 = $11 + 89;
                $10 = i28 % 128;
                if (i28 % 2 != 0) {
                    cArr = new char[i14];
                    i11 = 0;
                } else {
                    i11 = 0;
                    cArr = new char[i14];
                }
                challengeResultError.getSDKAppID = i11;
                while (true) {
                    int i29 = challengeResultError.getSDKAppID;
                    if (i29 >= i14) {
                        break;
                    }
                    $10 = ($11 + 81) % 128;
                    cArr[i29] = cArr4[(i14 - i29) - 1];
                    challengeResultError.getSDKAppID = i29 + 1;
                }
                cArr4 = cArr;
            }
            if (i22 > 0) {
                challengeResultError.getSDKAppID = 0;
                while (true) {
                    int i31 = challengeResultError.getSDKAppID;
                    if (i31 >= i14) {
                        break;
                    }
                    cArr4[i31] = (char) (cArr4[i31] - iArr[2]);
                    challengeResultError.getSDKAppID = i31 + 1;
                }
            }
            objArr[0] = new String(cArr4);
        }

        private static void c(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            float f11;
            int i12;
            if (str != null) {
                $11 = ($10 + 65) % 128;
                charArray = str.toCharArray();
                $11 = ($10 + 43) % 128;
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
            char[] cArr2 = new char[cArr.length];
            int i13 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            int i14 = 2;
            char[] cArr3 = new char[2];
            while (true) {
                int i15 = challengeStatusHandler.getSDKReferenceNumber;
                if (i15 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i11);
                    return;
                }
                cArr3[i13] = cArr[i15];
                int i16 = 1;
                cArr3[1] = cArr[i15 + 1];
                int i17 = 58224;
                int i18 = i13;
                while (i18 < 16) {
                    $10 = ($11 + 69) % 128;
                    char c11 = cArr3[i16];
                    char c12 = cArr3[i13];
                    int i19 = i14;
                    int i21 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) getDeviceData) ^ (-2881362678149017980L))));
                    int i22 = c12 >>> 5;
                    int i23 = i16;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKReferenceNumber);
                        objArr2[i19] = Integer.valueOf(i22);
                        objArr2[i23] = Integer.valueOf(i21);
                        objArr2[i13] = Integer.valueOf(c11);
                        Map map = getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i13;
                            f11 = BitmapDescriptorFactory.HUE_RED;
                        } else {
                            int threadPriority = 1745 - ((Process.getThreadPriority(i13) + 20) >> 6);
                            float fComplexToFloat = TypedValue.complexToFloat(i13);
                            f11 = BitmapDescriptorFactory.HUE_RED;
                            Class cls2 = (Class) getMessageVersion.getSDKTransactionID(threadPriority, (char) ((fComplexToFloat > BitmapDescriptorFactory.HUE_RED ? 1 : (fComplexToFloat == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16682), 29 - Color.red(i13));
                            byte b11 = (byte) i13;
                            byte b12 = b11;
                            i12 = i13;
                            Object[] objArr3 = new Object[i23];
                            d(b11, b12, (byte) (b12 + 2), objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i12];
                        int i24 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                        int i25 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(getSDKAppID);
                        objArr4[i19] = Integer.valueOf(i25);
                        objArr4[1] = Integer.valueOf(i24);
                        objArr4[i12] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            int i26 = i12;
                            float f12 = f11;
                            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionType(0L) + 1745, (char) ((TypedValue.complexToFraction(i26, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(i26, f12, f12) == f12 ? 0 : -1)) + 16682), View.resolveSizeAndState(i26, i26, i26) + 29);
                            byte b13 = (byte) i26;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            d(b13, b14, (byte) (b14 + 2), objArr5);
                            method2 = cls3.getMethod((String) objArr5[i26], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i17 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i18++;
                        i14 = i19;
                        cArr = cArr;
                        cArr3 = cArr3;
                        i13 = 0;
                        i16 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = cArr;
                int i27 = i14;
                char[] cArr5 = cArr3;
                int i28 = challengeStatusHandler.getSDKReferenceNumber;
                cArr2[i28] = cArr5[0];
                cArr2[i28 + 1] = cArr5[1];
                Object[] objArr6 = new Object[i27];
                objArr6[1] = challengeStatusHandler;
                objArr6[0] = challengeStatusHandler;
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1596 - View.MeasureSpec.getSize(0), (char) (27824 - View.MeasureSpec.getSize(0)), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    d(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i14 = i27;
                cArr = cArr4;
                cArr3 = cArr5;
                i13 = 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(int r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 2
                int r6 = 4 - r6
                int r7 = r7 * 2
                int r7 = 116 - r7
                int r5 = r5 * 2
                int r0 = 1 - r5
                byte[] r1 = atd.am.getSDKAppID.getSDKReferenceNumber.$$d
                byte[] r0 = new byte[r0]
                r2 = 0
                int r5 = 0 - r5
                if (r1 != 0) goto L19
                r4 = r5
                r7 = r6
                r3 = r2
                goto L2e
            L19:
                r3 = r7
                r7 = r6
                r6 = r3
                r3 = r2
            L1d:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L2a
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L2a:
                int r3 = r3 + 1
                r4 = r1[r7]
            L2e:
                int r6 = r6 + r4
                int r7 = r7 + 1
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.am.getSDKAppID.getSDKReferenceNumber.d(int, short, byte, java.lang.Object[]):void");
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i11 = getSDKEphemeralPublicKey;
            int i12 = ((i11 ^ 111) + ((i11 & 111) << 1)) % 128;
            ChallengeResultCancelled = i12;
            if (!(getsdkappid instanceof getDeviceData)) {
                if (!(getsdkappid instanceof getSDKTransactionID)) {
                    throw new NoWhenBranchMatchedException();
                }
                ChallengeResultCancelled = (i11 + 67) % 128;
                getSDKTransactionID getsdktransactionid = (getSDKTransactionID) getsdkappid;
                throw ((Throwable) getSDKTransactionID.getSDKAppID(new Object[]{getsdktransactionid}, 1936954025, -1936954020, System.identityHashCode(getsdktransactionid)));
            }
            getSDKEphemeralPublicKey = ((((i12 ^ 99) | (i12 & 99)) << 1) - (((~i12) & 99) | (i12 & (-100)))) % 128;
            getDeviceData getdevicedata = (getDeviceData) getsdkappid;
            Object objAuthenticationRequestParameters = getDeviceData.AuthenticationRequestParameters(new Object[]{getdevicedata}, -389237788, 389237789, System.identityHashCode(getdevicedata));
            int i13 = getSDKEphemeralPublicKey;
            int i14 = i13 & 61;
            int i15 = (i13 | 61) & (~i14);
            int i16 = -(-(i14 << 1));
            int i17 = (i15 & i16) + (i15 | i16);
            ChallengeResultCancelled = i17 % 128;
            if (i17 % 2 != 0) {
                return objAuthenticationRequestParameters;
            }
            throw null;
        }

        public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
            return getDeviceData(objArr);
        }

        static void init$0() {
            $$a = new byte[]{8, -110, -18, -108, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10};
            $$b = 18;
        }

        static void init$1() {
            $$d = new byte[]{17, -107, -57, -94};
            $$e = EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE;
        }

        public static Object[] getSDKTransactionID(Context context, int i11, int i12) throws Throwable {
            Class cls = Integer.TYPE;
            try {
                if (context == null) {
                    Object[] objArr = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                    int i13 = ~i11;
                    Object[] objArr2 = {Integer.valueOf(i12), 0, Integer.valueOf(777681990 + (((~((-462299969) | i13)) | (~(1006631747 | i11))) * (-831)) + ((~((-419962945) | i11)) * (-1662)) + (((~(i11 | 462299968)) | (~(i13 | (-586668804))) | (~(586668803 | i11))) * 831))};
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(552468314);
                    if (method == null) {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(2244 - Drawable.resolveOpacity(0, 0), (char) (46663 - MotionEvent.axisFromString("")), 25 - TextUtils.lastIndexOf("", '0'));
                        byte b11 = $$a[22];
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        a(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls, cls, cls);
                        map.put(552468314, method);
                    }
                    ((int[]) objArr[3])[0] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    return objArr;
                }
                int i14 = 3;
                try {
                    Object[] objArr4 = new Object[1];
                    b(false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{0, 38, 119, 9}, objArr4);
                    Object[] objArr5 = (Object[]) Array.newInstance(Class.forName((String) objArr4[0]), 2);
                    Object[] objArr6 = new Object[1];
                    b(true, "\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001", new int[]{38, 31, 0, 13}, objArr6);
                    try {
                        Object[] objArr7 = {(String) objArr6[0]};
                        Object[] objArr8 = new Object[1];
                        b(false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{0, 38, 119, 9}, objArr8);
                        objArr5[0] = Class.forName((String) objArr8[0]).getDeclaredConstructor(String.class).newInstance(objArr7);
                        int i15 = -Gravity.getAbsoluteGravity(0, 0);
                        int i16 = (i15 ^ 31) + ((i15 & 31) << 1);
                        Object[] objArr9 = new Object[1];
                        c("즏駺ᢔ粽顐퐿哶占莵䎐⛈틀쮬迲껢흵\uf4cb签\udbfa炠놳\ueff3踙⦩䯹౮馋嵤ឰᐥ鉊䯭", i16, objArr9);
                        try {
                            Object[] objArr10 = {(String) objArr9[0]};
                            Object[] objArr11 = new Object[1];
                            b(false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000", new int[]{0, 38, 119, 9}, objArr11);
                            objArr5[1] = Class.forName((String) objArr11[0]).getDeclaredConstructor(String.class).newInstance(objArr10);
                            try {
                                int i17 = -(ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i18 = i17 * 46;
                                int i19 = ((i18 | 1058) << 1) - (i18 ^ 1058);
                                int i21 = ~i11;
                                int i22 = ~(((-24) ^ i21) | ((-24) & i21));
                                int i23 = ((i17 ^ i22) | (i22 & i17)) * (-90);
                                int i24 = (i19 ^ i23) + ((i19 & i23) << 1);
                                int i25 = ~(((-24) ^ i11) | ((-24) & i11));
                                int i26 = ~((i17 ^ 23) | (i17 & 23));
                                int i27 = i24 + (((i25 ^ i26) | (i25 & i26)) * (-45));
                                int i28 = ~((~i17) | i11);
                                int i29 = ((-24) & i28) | ((-24) ^ i28);
                                int i31 = ~((i17 & i21) | (i21 ^ i17));
                                int i32 = ((i31 & i29) | (i29 ^ i31)) * 45;
                                int i33 = (i27 ^ i32) + ((i27 & i32) << 1);
                                Object[] objArr12 = new Object[1];
                                c("⬯ꅌ놳\ueff3踙⦩\uf2f4᮫藾梉鎤\ue19d鼼䁟憿쐶衿㭝鎤\ue19d鏫\uf757긕⣁", i33, objArr12);
                                Class<?> cls3 = Class.forName((String) objArr12[0]);
                                Object[] objArr13 = new Object[1];
                                b(false, "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{69, 17, 0, 1}, objArr13);
                                Object objInvoke = cls3.getMethod((String) objArr13[0], null).invoke(context, null);
                                try {
                                    int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                                    int i34 = keyRepeatTimeout * 465;
                                    int i35 = (i34 & (-10649)) + (i34 | (-10649));
                                    int i36 = ~i11;
                                    int i37 = (~(((-24) ^ i36) | ((-24) & i36))) | (~(((-24) ^ keyRepeatTimeout) | ((-24) & keyRepeatTimeout)));
                                    int i38 = ~((i21 ^ keyRepeatTimeout) | (i21 & keyRepeatTimeout));
                                    int i39 = -(-(((i37 ^ i38) | (i37 & i38)) * 464));
                                    int i41 = (i35 & i39) + (i39 | i35);
                                    int i42 = ~keyRepeatTimeout;
                                    int i43 = -(-(((i42 & i11) | (i11 ^ i42) | (-24)) * (-464)));
                                    int i44 = (i41 ^ i43) + ((i43 & i41) << 1);
                                    int i45 = ~(((-24) ^ keyRepeatTimeout) | ((-24) & keyRepeatTimeout));
                                    int i46 = ~((keyRepeatTimeout & i11) | (keyRepeatTimeout ^ i11));
                                    int i47 = (i44 - (~(-(-(((i45 & i46) | (i45 ^ i46)) * 464))))) - 1;
                                    Object[] objArr14 = new Object[1];
                                    c("⬯ꅌ놳\ueff3踙⦩\uf2f4᮫藾梉鎤\ue19d鼼䁟憿쐶衿㭝鎤\ue19d鏫\uf757긕⣁", i47, objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    Object[] objArr15 = new Object[1];
                                    b(true, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000", new int[]{86, 14, 90, 12}, objArr15);
                                    try {
                                        Object[] objArr16 = {cls4.getMethod((String) objArr15[0], null).invoke(context, null), 64};
                                        Object[] objArr17 = new Object[1];
                                        c("⬯ꅌ놳\ueff3踙⦩\uf2f4᮫藾梉鎤\ue19d鼼䁟憿쐶衭妢ર嵁ࢣ굲ퟧ;浓暉ꃪ뭵પⲸ浓暉鮿⢇", (ViewConfiguration.getFadingEdgeLength() >> 16) + 33, objArr17);
                                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                                        int i48 = -TextUtils.getOffsetBefore("", 0);
                                        int i49 = ((i48 | 14) << 1) - (i48 ^ 14);
                                        Object[] objArr18 = new Object[1];
                                        c("浓暉ᗡ\uf76aࢣ굲ퟧ;浓暉푏ᖝ覍⧊", i49, objArr18);
                                        Object objInvoke2 = cls5.getMethod((String) objArr18[0], String.class, cls).invoke(objInvoke, objArr16);
                                        Object[] objArr19 = new Object[1];
                                        b(false, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", new int[]{100, 30, 160, 9}, objArr19);
                                        Class<?> cls6 = Class.forName((String) objArr19[0]);
                                        Object[] objArr20 = new Object[1];
                                        b(true, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000", new int[]{EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 10, 67, 10}, objArr20);
                                        Object[] objArr21 = (Object[]) cls6.getField((String) objArr20[0]).get(objInvoke2);
                                        int length = objArr21.length;
                                        int i51 = 0;
                                        while (i51 < length) {
                                            Object obj = objArr21[i51];
                                            int i52 = length;
                                            Object[] objArr22 = new Object[1];
                                            b(true, "\u0001\u0001\u0001\u0001\u0000", new int[]{140, 5, 0, 5}, objArr22);
                                            try {
                                                Object[] objArr23 = {(String) objArr22[0]};
                                                Object[] objArr24 = objArr21;
                                                Object[] objArr25 = new Object[1];
                                                b(true, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{145, 37, 158, 0}, objArr25);
                                                Class<?> cls7 = Class.forName((String) objArr25[0]);
                                                int i53 = -TextUtils.indexOf("", "");
                                                int i54 = -(-(i53 * (-963)));
                                                int i55 = (i54 & (-964)) + (i54 | (-964)) + 10615;
                                                int i56 = ~i53;
                                                int i57 = i51;
                                                int i58 = ~(((-12) ^ i11) | ((-12) & i11));
                                                int i59 = -(-(((i56 ^ i58) | (i58 & i56)) * (-964)));
                                                int i61 = (i55 & i59) + (i59 | i55);
                                                int i62 = ~(((-12) ^ i36) | ((-12) & i36));
                                                int i63 = ~(i53 | (-12));
                                                int i64 = ((i62 & i63) | (i62 ^ i63)) * (-964);
                                                int i65 = (i61 ^ i64) + ((i64 & i61) << 1);
                                                Object[] objArr26 = new Object[1];
                                                c("浓暉ꉘ鳎듉턺ⶪⵝ愮䠫餟읰", i65, objArr26);
                                                Object objInvoke3 = cls7.getMethod((String) objArr26[0], String.class).invoke(null, objArr23);
                                                try {
                                                    Object[] objArr27 = new Object[1];
                                                    b(true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{182, 28, 0, 0}, objArr27);
                                                    Class<?> cls8 = Class.forName((String) objArr27[0]);
                                                    int i66 = -(ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                    int i67 = (i66 * 784) + 794;
                                                    int i68 = -(-((~((~i66) | i21 | 11)) * (-783)));
                                                    int i69 = (i67 & i68) + (i67 | i68);
                                                    int i71 = ~i66;
                                                    int i72 = ~((i36 ^ 11) | (i36 & 11));
                                                    Object[] objArr28 = new Object[1];
                                                    c("㛲硤\udfd7低睶逪곇춠㭄\u0bad눸뗖", i69 + (((i71 & i72) | (i71 ^ i72)) * 783), objArr28);
                                                    try {
                                                        Object[] objArr29 = {new ByteArrayInputStream((byte[]) cls8.getMethod((String) objArr28[0], null).invoke(obj, null))};
                                                        Object[] objArr30 = new Object[1];
                                                        b(true, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{145, 37, 158, 0}, objArr30);
                                                        Class<?> cls9 = Class.forName((String) objArr30[0]);
                                                        Object[] objArr31 = new Object[1];
                                                        b(false, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000", new int[]{EnumC4419g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 19, 0, 2}, objArr31);
                                                        Object objInvoke4 = cls9.getMethod((String) objArr31[0], InputStream.class).invoke(objInvoke3, objArr29);
                                                        int i73 = 0;
                                                        while (i73 < 2) {
                                                            Object obj2 = objArr5[i73];
                                                            try {
                                                                Object[] objArr32 = new Object[1];
                                                                b(false, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000", new int[]{EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 34, 0, 2}, objArr32);
                                                                Class<?> cls10 = Class.forName((String) objArr32[0]);
                                                                int i74 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                                                int i75 = i74 * (-1975);
                                                                int i76 = (i75 & 22747) + (i75 | 22747);
                                                                int i77 = ~i74;
                                                                int i78 = i73;
                                                                int i79 = ~((i77 ^ 23) | (i77 & 23));
                                                                int i81 = ((i11 ^ i79) | (i11 & i79)) * 988;
                                                                int i82 = (((i76 | i81) << 1) - (i81 ^ i76)) + (((~(((-24) ^ i74) | ((-24) & i74))) | (~((i74 & i36) | (i36 ^ i74)))) * (-1976));
                                                                int i83 = ~((i77 ^ 23) | (i77 & 23));
                                                                int i84 = ~(((-24) ^ i11) | ((-24) & i11));
                                                                int i85 = -(-(((i83 & i84) | (i83 ^ i84) | (~((i21 ^ 23) | (i21 & 23)))) * 988));
                                                                int i86 = (i82 ^ i85) + ((i82 & i85) << 1);
                                                                Object[] objArr33 = new Object[1];
                                                                c("浓暉齼➸榁ᭌ\ue6c5떝셈輴\ue95b뤲ṁ䤡ｪ俛检㢛쥛㝅欝ܲ鑷ࢤ", i86, objArr33);
                                                                if (obj2.equals(cls10.getMethod((String) objArr33[0], null).invoke(objInvoke4, null))) {
                                                                    int i87 = (~(i11 & 1)) & (i11 | 1);
                                                                    Object[] objArr34 = new Object[4];
                                                                    objArr34[0] = new int[]{i11};
                                                                    objArr34[1] = new int[]{i87};
                                                                    objArr34[i14] = new int[1];
                                                                    objArr34[2] = null;
                                                                    try {
                                                                        Object[] objArr35 = new Object[i14];
                                                                        objArr35[2] = Integer.valueOf((-129722794) + (((~((-146374350) | i21)) | (-902594423)) * (-933)) + (((~((-902594423) | i21)) | 893649202) * 933) + 320634880);
                                                                        objArr35[1] = 16;
                                                                        objArr35[0] = Integer.valueOf(i12);
                                                                        Map map2 = getMessageVersion.timedout;
                                                                        Object method2 = map2.get(552468314);
                                                                        if (method2 == null) {
                                                                            Class cls11 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2243, (char) ((Process.myPid() >> 22) + 46664), 26 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                                                            byte b13 = $$a[22];
                                                                            byte b14 = b13;
                                                                            Object[] objArr36 = new Object[1];
                                                                            a(b13, b14, b14, objArr36);
                                                                            method2 = cls11.getMethod((String) objArr36[0], cls, cls, cls);
                                                                            map2.put(552468314, method2);
                                                                        }
                                                                        ((int[]) objArr34[3])[0] = ((Integer) ((Method) method2).invoke(null, objArr35)).intValue();
                                                                        return objArr34;
                                                                    } catch (Throwable th2) {
                                                                        Throwable cause = th2.getCause();
                                                                        if (cause != null) {
                                                                            throw cause;
                                                                        }
                                                                        throw th2;
                                                                    }
                                                                }
                                                                i73 = (i78 & 1) + (i78 | 1);
                                                                i14 = 3;
                                                            } catch (Throwable th3) {
                                                                Throwable cause2 = th3.getCause();
                                                                if (cause2 != null) {
                                                                    throw cause2;
                                                                }
                                                                throw th3;
                                                            }
                                                        }
                                                        i51 = i57 + 1;
                                                        objArr21 = objArr24;
                                                        length = i52;
                                                        i14 = 3;
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
                                            } catch (Throwable th6) {
                                                Throwable cause5 = th6.getCause();
                                                if (cause5 != null) {
                                                    throw cause5;
                                                }
                                                throw th6;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        Throwable cause6 = th7.getCause();
                                        if (cause6 != null) {
                                            throw cause6;
                                        }
                                        throw th7;
                                    }
                                } catch (Throwable th8) {
                                    Throwable cause7 = th8.getCause();
                                    if (cause7 != null) {
                                        throw cause7;
                                    }
                                    throw th8;
                                }
                            } catch (Throwable th9) {
                                Throwable cause8 = th9.getCause();
                                if (cause8 != null) {
                                    throw cause8;
                                }
                                throw th9;
                            }
                        } catch (Throwable th10) {
                            Throwable cause9 = th10.getCause();
                            if (cause9 != null) {
                                throw cause9;
                            }
                            throw th10;
                        }
                    } catch (Throwable th11) {
                        Throwable cause10 = th11.getCause();
                        if (cause10 != null) {
                            throw cause10;
                        }
                        throw th11;
                    }
                } catch (Throwable unused) {
                }
                Object[] objArr37 = {new int[]{i11}, new int[]{i11}, null, new int[1]};
                Object[] objArr38 = {Integer.valueOf(i12), 0, Integer.valueOf((-1930682519) + (((~(i11 | 545767609)) | 494419202) * (-140)) + ((~(1040186811 | i11)) * 70) + (((~(i11 | 503201162)) | 1031404851) * 70))};
                Map map3 = getMessageVersion.timedout;
                Object method3 = map3.get(552468314);
                if (method3 == null) {
                    Class cls12 = (Class) getMessageVersion.getSDKTransactionID(2244 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (46664 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25);
                    byte b15 = $$a[22];
                    byte b16 = b15;
                    Object[] objArr39 = new Object[1];
                    a(b15, b16, b16, objArr39);
                    method3 = cls12.getMethod((String) objArr39[0], cls, cls, cls);
                    map3.put(552468314, method3);
                }
                ((int[]) objArr37[3])[0] = ((Integer) ((Method) method3).invoke(null, objArr38)).intValue();
                return objArr37;
            } catch (Throwable th12) {
                Throwable cause11 = th12.getCause();
                if (cause11 != null) {
                    throw cause11;
                }
                throw th12;
            }
        }

        public static <T> T getDeviceData(getSDKAppID<? extends T> getsdkappid) {
            return (T) getSDKTransactionID(new Object[]{getsdkappid}, 1928614189, -1928614189, (int) System.currentTimeMillis());
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/adyen/threeds2/internal/result/Result$Failure;", "Lcom/adyen/threeds2/internal/result/Result;", "", StatusResponse.RESULT_CODE, "Lcom/adyen/threeds2/internal/result/ResultCode;", "cause", "", "messageField", "Lcom/adyen/threeds2/internal/result/MessageField;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "<init>", "(Lcom/adyen/threeds2/internal/result/ResultCode;Ljava/lang/Throwable;Lcom/adyen/threeds2/internal/result/MessageField;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;)V", "getResultCode", "()Lcom/adyen/threeds2/internal/result/ResultCode;", "getCause", "()Ljava/lang/Throwable;", "getMessageField", "()Lcom/adyen/threeds2/internal/result/MessageField;", "getTransactionIdentifiers", "()Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class getSDKTransactionID implements getSDKAppID {
        private static int getMessageVersion = 1;
        private static int getSDKReferenceNumber;
        private final ChallengeResultCancelled AuthenticationRequestParameters;
        private final Throwable getDeviceData;
        private final atd.am.getDeviceData getSDKAppID;
        private final atd.ao.AuthenticationRequestParameters getSDKTransactionID;

        private getSDKTransactionID(ChallengeResultCancelled challengeResultCancelled, Throwable th2, atd.am.getDeviceData getdevicedata, atd.ao.AuthenticationRequestParameters authenticationRequestParameters) {
            s.k(challengeResultCancelled, "");
            s.k(th2, "");
            s.k(getdevicedata, "");
            s.k(authenticationRequestParameters, "");
            this.AuthenticationRequestParameters = challengeResultCancelled;
            this.getDeviceData = th2;
            this.getSDKAppID = getdevicedata;
            this.getSDKTransactionID = authenticationRequestParameters;
        }

        private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            int i11 = getMessageVersion;
            int i12 = ((i11 & (-104)) | ((~i11) & 103)) + ((i11 & 103) << 1);
            int i13 = i12 % 128;
            getSDKReferenceNumber = i13;
            int i14 = i12 % 2;
            ChallengeResultCancelled challengeResultCancelled = getsdktransactionid.AuthenticationRequestParameters;
            if (i14 != 0) {
                throw null;
            }
            int i15 = i13 & 45;
            int i16 = (i13 | 45) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 & i17) + (i16 | i17);
            getMessageVersion = i18 % 128;
            if (i18 % 2 != 0) {
                return challengeResultCancelled;
            }
            throw null;
        }

        private static /* synthetic */ Object BuildConfig(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            int i11 = getSDKReferenceNumber;
            int i12 = (i11 ^ 73) + ((i11 & 73) << 1);
            getMessageVersion = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr2 = {getsdktransactionid};
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i13 != 0) {
                return (Void) getSDKReferenceNumber.getSDKTransactionID(objArr2, 1928614189, -1928614189, (int) jCurrentTimeMillis);
            }
            int i14 = 39 / 0;
            return (Void) getSDKReferenceNumber.getSDKTransactionID(objArr2, 1928614189, -1928614189, (int) jCurrentTimeMillis);
        }

        private Void ChallengeResult() {
            return (Void) getSDKAppID(new Object[]{this}, -226065787, 226065794, System.identityHashCode(this));
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            int i11 = getMessageVersion;
            int i12 = i11 & 79;
            int i13 = (i11 | 79) & (~i12);
            int i14 = i12 << 1;
            int i15 = (i13 & i14) + (i13 | i14);
            getSDKReferenceNumber = i15 % 128;
            int i16 = i15 % 2;
            Throwable th2 = getsdktransactionid.getDeviceData;
            if (i16 == 0) {
                return th2;
            }
            throw null;
        }

        private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            StringBuilder sb2 = new StringBuilder("Failure(resultCode=");
            sb2.append(getsdktransactionid.AuthenticationRequestParameters);
            sb2.append(", cause=");
            sb2.append(getsdktransactionid.getDeviceData);
            sb2.append(", messageField=");
            sb2.append(getsdktransactionid.getSDKAppID);
            sb2.append(", transactionIdentifiers=");
            sb2.append(getsdktransactionid.getSDKTransactionID);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            String string = sb2.toString();
            int i11 = getSDKReferenceNumber + 5;
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                return string;
            }
            throw null;
        }

        public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
            int iHashCode;
            int i14 = ~i12;
            switch ((i11 * 367) + (i12 * 367) + ((i11 | i12) * (-366)) + (((~(i14 | i13)) | i11) * (-366)) + (((~(i11 | i14 | i13)) | (~(i12 | (~i11)))) * 366)) {
                case 1:
                    return getSDKTransactionID(objArr);
                case 2:
                    return AuthenticationRequestParameters(objArr);
                case 3:
                    return getSDKReferenceNumber(objArr);
                case 4:
                    getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
                    int i15 = getSDKReferenceNumber;
                    int i16 = i15 ^ 81;
                    int i17 = ((i15 & 81) | i16) << 1;
                    int i18 = -i16;
                    int i19 = (i17 & i18) + (i17 | i18);
                    getMessageVersion = i19 % 128;
                    int i21 = i19 % 2;
                    int iHashCode2 = getsdktransactionid.AuthenticationRequestParameters.hashCode();
                    if (i21 == 0) {
                        int iHashCode3 = (iHashCode2 % 7) % getsdktransactionid.getDeviceData.hashCode();
                        int i22 = iHashCode3 & (-28);
                        int i23 = (iHashCode3 | (-28)) & (~i22);
                        int i24 = i22 << 1;
                        int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                        int iHashCode4 = getsdktransactionid.getSDKAppID.hashCode();
                        iHashCode = (((i25 ^ iHashCode4) + ((iHashCode4 & i25) << 1)) << 85) >>> getsdktransactionid.getSDKTransactionID.hashCode();
                    } else {
                        int i26 = iHashCode2 * 31;
                        int i27 = -(-getsdktransactionid.getDeviceData.hashCode());
                        int i28 = i26 ^ i27;
                        int i29 = ((((i26 & i27) | i28) << 1) - i28) * 31;
                        int i31 = -(~(-(-getsdktransactionid.getSDKAppID.hashCode())));
                        iHashCode = ((((((i29 | i31) << 1) - (i29 ^ i31)) - 1) * 31) - (~(-(~getsdktransactionid.getSDKTransactionID.hashCode())))) - 2;
                    }
                    return Integer.valueOf(iHashCode);
                case 5:
                    return getDeviceData(objArr);
                case 6:
                    return getMessageVersion(objArr);
                case 7:
                    return BuildConfig(objArr);
                case 8:
                    return getSDKEphemeralPublicKey(objArr);
                default:
                    return getSDKAppID(objArr);
            }
        }

        private static /* synthetic */ Object getSDKEphemeralPublicKey(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            int i11 = getMessageVersion;
            int i12 = (i11 | 23) << 1;
            int i13 = -(((~i11) & 23) | (i11 & (-24)));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            getSDKReferenceNumber = i14 % 128;
            int i15 = i14 % 2;
            atd.am.getDeviceData getdevicedata = getsdktransactionid.getSDKAppID;
            if (i15 == 0) {
                return getdevicedata;
            }
            throw null;
        }

        private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            Object obj = objArr[1];
            int i11 = getMessageVersion;
            int i12 = (((i11 & (-118)) | ((~i11) & 117)) - (~(-(-((i11 & 117) << 1))))) - 1;
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (getsdktransactionid == obj) {
                int i13 = ((i11 & 83) + (i11 | 83)) % 128;
                getSDKReferenceNumber = i13;
                int i14 = i13 + 27;
                getMessageVersion = i14 % 128;
                if (i14 % 2 != 0) {
                    return Boolean.TRUE;
                }
                int i15 = 18 / 0;
                return Boolean.TRUE;
            }
            if (!(obj instanceof getSDKTransactionID)) {
                int i16 = ((((i11 & (-112)) | ((~i11) & 111)) - (~((i11 & 111) << 1))) - 1) % 128;
                getSDKReferenceNumber = i16;
                getMessageVersion = (((i16 | 3) << 1) - (i16 ^ 3)) % 128;
                return Boolean.FALSE;
            }
            getSDKTransactionID getsdktransactionid2 = (getSDKTransactionID) obj;
            if (getsdktransactionid.AuthenticationRequestParameters != getsdktransactionid2.AuthenticationRequestParameters) {
                int i17 = i11 + 53;
                int i18 = i17 % 128;
                getSDKReferenceNumber = i18;
                boolean z11 = i17 % 2 != 0;
                getMessageVersion = (i18 + 125) % 128;
                return Boolean.valueOf(z11);
            }
            if (!s.f(getsdktransactionid.getDeviceData, getsdktransactionid2.getDeviceData)) {
                int i19 = getMessageVersion;
                int i21 = i19 & 93;
                int i22 = ((((i19 | 93) & (~i21)) - (~(i21 << 1))) - 1) % 128;
                getSDKReferenceNumber = i22;
                int i23 = (i22 & 76) + (i22 | 76);
                getMessageVersion = ((i23 ^ (-1)) + (i23 << 1)) % 128;
                return false;
            }
            if (getsdktransactionid.getSDKAppID != getsdktransactionid2.getSDKAppID) {
                int i24 = getMessageVersion;
                int i25 = i24 & 47;
                int i26 = (i24 | 47) & (~i25);
                int i27 = -(-(i25 << 1));
                getSDKReferenceNumber = (((i26 | i27) << 1) - (i26 ^ i27)) % 128;
                return false;
            }
            if (s.f(getsdktransactionid.getSDKTransactionID, getsdktransactionid2.getSDKTransactionID)) {
                int i28 = getSDKReferenceNumber;
                int i29 = (i28 & 31) + (i28 | 31);
                getMessageVersion = i29 % 128;
                if (i29 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
            int i31 = getMessageVersion;
            int i32 = i31 | 101;
            int i33 = i32 << 1;
            int i34 = -((~(i31 & 101)) & i32);
            getSDKReferenceNumber = (((i33 | i34) << 1) - (i34 ^ i33)) % 128;
            int iIdentityHashCode = System.identityHashCode(getsdktransactionid);
            int i35 = ~iIdentityHashCode;
            int i36 = ((-853975811) & i35) | (853975810 & iIdentityHashCode);
            int i37 = iIdentityHashCode & (-853975811);
            int i38 = ~((i37 & i36) | (i36 ^ i37));
            int i39 = ((i38 & (-1898784751)) | ((-1898784751) ^ i38)) * 191;
            int i41 = (((-762748447) & i39) - (~(-(-(i39 | (-762748447)))))) - 1;
            int i42 = ~((i35 ^ (-853975811)) | (i35 & (-853975811)));
            int i43 = 46301184 & i42;
            int i44 = (i42 | 46301184) & (~i43);
            int i45 = -(-(((i44 & i43) | (i44 ^ i43)) * 191));
            int i46 = i41 & i45;
            int i47 = i45 | i41;
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            int iIdentityHashCode2 = System.identityHashCode(getsdktransactionid);
            int i49 = ~iIdentityHashCode2;
            int i51 = ~((i49 ^ (-2096805324)) | (i49 & (-2096805324)));
            int i52 = (i51 & 1215824258) | ((-1215824259) & i51) | ((~i51) & 1215824258);
            int i53 = (-16796209) & iIdentityHashCode2;
            int i54 = (~i53) & ((-16796209) | iIdentityHashCode2);
            int i55 = ~((i53 & i54) | (i54 ^ i53));
            int i56 = i52 & i55;
            int i57 = -(-((((i52 | i55) & (~i56)) | i56) * 717));
            int i58 = (((-395502188) | i57) << 1) - (i57 ^ (-395502188));
            int i59 = ~(((~i49) & (-16796209)) | (16796208 & i49) | ((-16796209) & i49));
            int i61 = i59 ^ 1215824258;
            int i62 = i59 & 1215824258;
            int i63 = (i49 & (-2096805324)) | (2096805323 & iIdentityHashCode2);
            int i64 = iIdentityHashCode2 & (-2096805324);
            int i65 = ((~((i64 & i63) | (i63 ^ i64))) | (i62 & i61) | (i61 ^ i62)) * 717;
            int i66 = i58 & i65;
            int i67 = (i65 | i58) & (~i66);
            int i68 = i66 << 1;
            if (i48 > (i67 ^ i68) + ((i67 & i68) << 1)) {
                return Boolean.FALSE;
            }
            int i69 = 39 / 0;
            return Boolean.FALSE;
        }

        private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            int i11 = getMessageVersion;
            int i12 = i11 & 57;
            int i13 = i11 | 57;
            int i14 = (i12 & i13) + (i13 | i12);
            getSDKReferenceNumber = i14 % 128;
            if (i14 % 2 != 0) {
                throw null;
            }
            Void r11 = (Void) getSDKAppID(new Object[]{getsdktransactionid}, -226065787, 226065794, System.identityHashCode(getsdktransactionid));
            int i15 = getSDKReferenceNumber + 21;
            getMessageVersion = i15 % 128;
            if (i15 % 2 == 0) {
                int i16 = 91 / 0;
            }
            return r11;
        }

        public final boolean equals(Object other) {
            return ((Boolean) getSDKAppID(new Object[]{this, other}, -2140877132, 2140877135, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) getSDKAppID(new Object[]{this}, -986226308, 986226312, System.identityHashCode(this))).intValue();
        }

        public final String toString() {
            return (String) getSDKAppID(new Object[]{this}, -1727298939, 1727298945, System.identityHashCode(this));
        }

        public final ChallengeResultCancelled AuthenticationRequestParameters() {
            return (ChallengeResultCancelled) getSDKAppID(new Object[]{this}, -349245747, 349245749, System.identityHashCode(this));
        }

        public final Throwable getDeviceData() {
            return (Throwable) getSDKAppID(new Object[]{this}, 1936954025, -1936954020, System.identityHashCode(this));
        }

        @Override // atd.am.getSDKAppID
        public final /* synthetic */ Object getSDKReferenceNumber() {
            return getSDKAppID(new Object[]{this}, 2091298236, -2091298235, System.identityHashCode(this));
        }

        public final atd.ao.AuthenticationRequestParameters getSDKTransactionID() {
            return (atd.ao.AuthenticationRequestParameters) getSDKAppID(new Object[]{this}, 1493649336, -1493649336, System.identityHashCode(this));
        }

        private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            int i11 = getSDKReferenceNumber;
            int i12 = i11 & 73;
            int i13 = (i11 | 73) & (~i12);
            int i14 = i12 << 1;
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            getMessageVersion = i15 % 128;
            int i16 = i15 % 2;
            atd.ao.AuthenticationRequestParameters authenticationRequestParameters = getsdktransactionid.getSDKTransactionID;
            if (i16 != 0) {
                return authenticationRequestParameters;
            }
            throw null;
        }

        public final atd.am.getDeviceData getSDKAppID() {
            return (atd.am.getDeviceData) getSDKAppID(new Object[]{this}, -212095080, 212095088, System.identityHashCode(this));
        }

        public /* synthetic */ getSDKTransactionID(ChallengeResultCancelled challengeResultCancelled, Throwable th2, atd.am.getDeviceData getdevicedata, atd.ao.AuthenticationRequestParameters authenticationRequestParameters, int i11) {
            this(challengeResultCancelled, th2, (i11 & 4) != 0 ? atd.am.getDeviceData.NONE : getdevicedata, (i11 & 8) != 0 ? new atd.ao.AuthenticationRequestParameters((byte) 0) : authenticationRequestParameters);
        }
    }

    T getSDKReferenceNumber();
}
