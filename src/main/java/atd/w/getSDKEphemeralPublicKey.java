package atd.w;

import android.app.Application;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsNetworkRoaming;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/TelephonyDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey extends InitializeResultSuccess {
    private static long AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getSDKTransactionID = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/telephony/IsNetworkRoaming$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static boolean AuthenticationRequestParameters;
        private static long getDeviceData;
        private static char[] getSDKAppID;
        private static int getSDKReferenceNumber;
        private static boolean getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 1719098028050104166L;
            getSDKAppID = new char[]{64877, 64864, 64883, 64879, 64832, 64842, 64828, 64833, 64839, 64910, 64874, 64843, 64844, 64827, 64841, 64898, 64865, 64859, 64861, 64847, 64896, 64845, 64826, 64822, 64862, 64837, 64867, 64830, 64835, 64871, 64840, 64829, 64854, 64891, 64894, 64887, 64836, 64824, 64823, 64872, 64834};
            getSDKReferenceNumber = -185467474;
            AuthenticationRequestParameters = true;
            getSDKTransactionID = true;
        }

        private getDeviceData() {
        }

        private static void a(byte b11, int i11, int i12, Object[] objArr) {
            int i13 = 4 - (b11 * 2);
            byte[] bArr = $$a;
            int i14 = i11 * 4;
            int i15 = (i12 * 2) + 103;
            byte[] bArr2 = new byte[i14 + 21];
            int i16 = i14 + 20;
            int i17 = -1;
            if (bArr == null) {
                i13++;
                i15 = i16 + (-i15) + 3;
                bArr = bArr;
                i17 = -1;
            }
            while (true) {
                int i18 = i17 + 1;
                bArr2[i18] = (byte) i15;
                if (i18 == i16) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b12 = bArr[i13];
                i13++;
                i15 = i15 + (-b12) + 3;
                bArr = bArr;
                i17 = i18;
            }
        }

        /* JADX WARN: Code duplicated, block: B:45:0x01bc  */
        /* JADX WARN: Code duplicated, block: B:46:0x01bd  */
        private static void b(String str, int i11, Object[] objArr) throws Throwable {
            Throwable cause;
            int i12;
            int i13;
            Object method;
            int i14 = $11 + 85;
            $10 = i14 % 128;
            int i15 = 2;
            if (i14 % 2 != 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.getTransactionStatus gettransactionstatus = new atd.az.getTransactionStatus();
            gettransactionstatus.getSDKAppID = i11;
            int length = charArray.length;
            long[] jArr = new long[length];
            int i16 = 0;
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i17 = gettransactionstatus.getSDKTransactionID;
                if (i17 >= charArray.length) {
                    break;
                }
                $10 = ($11 + 35) % 128;
                char c11 = charArray[i17];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i15] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i16] = Integer.valueOf(c11);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(962978490);
                    if (obj != null) {
                        i13 = i15;
                        i12 = i16;
                        method = obj;
                    } else {
                        i12 = i16;
                        i13 = i15;
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(689 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (16022 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 32);
                        byte b11 = $$d[i13];
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i17] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getDeviceData ^ (-2227742522694838850L));
                    Object[] objArr4 = new Object[i13];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(417 - (ViewConfiguration.getScrollBarSize() >> 8), (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 29017), TextUtils.getTrimmedLength("") + 24)).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    i15 = 2;
                    i16 = i12;
                    jArr = jArr;
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
            char[] cArr = new char[length];
            gettransactionstatus.getSDKTransactionID = i16;
            while (true) {
                int i18 = gettransactionstatus.getSDKTransactionID;
                if (i18 >= charArray.length) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i19 = $10 + 27;
                $11 = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr[i18] = (char) jArr2[i18];
                    Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(-46730980);
                    if (method3 == null) {
                        method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getFadingEdgeLength() >> 16) + 417, (char) (29017 - TextUtils.getCapsMode("", 0, 0)), 24 - Color.blue(0))).getMethod("A", Object.class, Object.class);
                        map2.put(-46730980, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    int i21 = 43 / 0;
                } else {
                    cArr[i18] = (char) jArr2[i18];
                    Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method4 = map3.get(-46730980);
                    if (method4 == null) {
                        method4 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 417, (char) (29017 - View.resolveSize(0, 0)), View.MeasureSpec.getMode(0) + 24)).getMethod("A", Object.class, Object.class);
                        map3.put(-46730980, method4);
                    }
                    ((Method) method4).invoke(null, objArr6);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:8:0x002e  */
        private static void c(int i11, int[] iArr, String str, String str2, Object[] objArr) throws Throwable {
            long j11;
            char[] cArr;
            int i12;
            String str3 = str2;
            int i13 = $11 + 49;
            $10 = i13 % 128;
            int i14 = 2;
            int i15 = 0;
            Object bytes = str3;
            if (i13 % 2 != 0) {
                int i16 = 38 / 0;
                if (str3 != null) {
                    bytes = str3;
                    bytes = str3.getBytes("ISO-8859-1");
                }
            } else if (str3 != null) {
                bytes = str3;
                bytes = str3.getBytes("ISO-8859-1");
            }
            bytes = str3;
            byte[] bArr = (byte[]) bytes;
            char[] charArray = str != null ? str.toCharArray() : str;
            atd.az.ChallengeStatusReceiver challengeStatusReceiver = new atd.az.ChallengeStatusReceiver();
            char[] cArr2 = getSDKAppID;
            Class cls = Integer.TYPE;
            if (cArr2 != null) {
                int length = cArr2.length;
                j11 = 0;
                char[] cArr3 = new char[length];
                int i17 = 0;
                while (i17 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i17])};
                        int i18 = i14;
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(508097192);
                        if (obj != null) {
                            i12 = i15;
                        } else {
                            i12 = i15;
                            Method method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(329 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((Process.getThreadPriority(i12) + 20) >> 6), 33 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getMethod("o", cls);
                            map.put(508097192, method);
                            obj = method;
                        }
                        cArr3[i17] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i17++;
                        i14 = i18;
                        i15 = i12;
                        cArr2 = cArr2;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            } else {
                j11 = 0;
            }
            int i19 = i14;
            int i21 = i15;
            float f11 = BitmapDescriptorFactory.HUE_RED;
            Object[] objArr3 = {Integer.valueOf(getSDKReferenceNumber)};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method2 = map2.get(-852383591);
            if (method2 == null) {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(i21) + 2061, (char) (1 - (SystemClock.elapsedRealtime() > j11 ? 1 : (SystemClock.elapsedRealtime() == j11 ? 0 : -1))), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                byte b11 = $$d[i19];
                Object[] objArr4 = new Object[1];
                d((byte) 11, b11, b11, objArr4);
                method2 = cls2.getMethod((String) objArr4[i21], cls);
                map2.put(-852383591, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
            int i22 = 9;
            char c11 = '0';
            if (getSDKTransactionID) {
                int i23 = $11 + 83;
                $10 = i23 % 128;
                if (i23 % 2 != 0) {
                    int length2 = bArr.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length2;
                    cArr = new char[length2];
                } else {
                    int length3 = bArr.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length3;
                    cArr = new char[length3];
                }
                challengeStatusReceiver.getDeviceData = i21;
                while (true) {
                    int i24 = challengeStatusReceiver.getDeviceData;
                    int i25 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i24 >= i25) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    cArr[i24] = (char) (cArr2[bArr[(i25 - 1) - i24] + i11] - iIntValue);
                    Object[] objArr5 = new Object[i19];
                    objArr5[1] = challengeStatusReceiver;
                    objArr5[0] = challengeStatusReceiver;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-249860496);
                    if (method3 == null) {
                        float f12 = f11;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1107 - TextUtils.indexOf("", c11, 0), (char) (TypedValue.complexToFraction(0, f12, f12) > f12 ? 1 : (TypedValue.complexToFraction(0, f12, f12) == f12 ? 0 : -1)), 50 - View.MeasureSpec.getSize(0));
                        byte b12 = $$d[2];
                        Object[] objArr6 = new Object[1];
                        d((byte) i22, b12, b12, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                        map3.put(-249860496, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    i22 = 9;
                    c11 = '0';
                    i19 = 2;
                    f11 = BitmapDescriptorFactory.HUE_RED;
                }
            } else {
                int i26 = i21;
                if (AuthenticationRequestParameters) {
                    int length4 = charArray.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length4;
                    char[] cArr4 = new char[length4];
                    challengeStatusReceiver.getDeviceData = i26;
                    while (true) {
                        int i27 = challengeStatusReceiver.getDeviceData;
                        int i28 = challengeStatusReceiver.getSDKReferenceNumber;
                        if (i27 >= i28) {
                            objArr[0] = new String(cArr4);
                            return;
                        }
                        $11 = ($10 + 117) % 128;
                        cArr4[i27] = (char) (cArr2[charArray[(i28 - 1) - i27] - i11] - iIntValue);
                        Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                        Map map4 = atd.a.getMessageVersion.timedout;
                        Object method4 = map4.get(-249860496);
                        if (method4 == null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionGroup(j11) + 1108, (char) TextUtils.indexOf("", "", 0, 0), 49 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                            byte b13 = $$d[2];
                            Object[] objArr8 = new Object[1];
                            d((byte) 9, b13, b13, objArr8);
                            method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                            map4.put(-249860496, method4);
                        }
                        ((Method) method4).invoke(null, objArr7);
                    }
                } else {
                    int length5 = iArr.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length5;
                    char[] cArr5 = new char[length5];
                    while (true) {
                        challengeStatusReceiver.getDeviceData = i26;
                        int i29 = challengeStatusReceiver.getDeviceData;
                        int i31 = challengeStatusReceiver.getSDKReferenceNumber;
                        if (i29 >= i31) {
                            objArr[0] = new String(cArr5);
                            return;
                        } else {
                            $11 = ($10 + 75) % 128;
                            cArr5[i29] = (char) (cArr2[iArr[(i31 - 1) - i29] - i11] - iIntValue);
                            i26 = i29 + 1;
                        }
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
        private static void d(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.w.getSDKEphemeralPublicKey.getDeviceData.$$d
                int r6 = 118 - r6
                int r7 = r7 * 2
                int r7 = 3 - r7
                int r8 = r8 * 3
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L28
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                int r7 = r7 + 1
                if (r4 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L26:
                r3 = r0[r7]
            L28:
                int r6 = r6 + r3
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getSDKEphemeralPublicKey.getDeviceData.d(int, short, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v17 */
        /* JADX WARN: Type inference failed for: r8v2, types: [int[], java.lang.String] */
        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(android.content.Context r28, int r29, int r30) {
            /*
                Method dump skipped, instruction units count: 1451
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.w.getSDKEphemeralPublicKey.getDeviceData.getDeviceData(android.content.Context, int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{98, -9, 35, 31, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10};
            $$b = 15;
        }

        static void init$1() {
            $$d = new byte[]{75, 34, 0, 64};
            $$e = 24;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        AuthenticationRequestParameters();
        TypedValue.complexToFloat(0);
        new getDeviceData((byte) 0);
        int i11 = getSDKTransactionID + 121;
        getDeviceData = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 41 / 0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKEphemeralPublicKey(Application application) {
        super(application);
        s.k(application, "");
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 657944677099037705L;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() {
        getSDKTransactionID = (getDeviceData + 15) % 128;
        TelephonyManager telephonyManagerCF_ = cF_();
        if (telephonyManagerCF_ == null) {
            return new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        }
        getSDKTransactionID = (getDeviceData + 45) % 128;
        DeviceParameterResult.Success.BooleanValue booleanValueM14boximpl = DeviceParameterResult.Success.BooleanValue.m14boximpl(DeviceParameterResult.Success.BooleanValue.m15constructorimpl(telephonyManagerCF_.isNetworkRoaming()));
        getDeviceData = (getSDKTransactionID + 83) % 128;
        return booleanValueM14boximpl;
    }
}
