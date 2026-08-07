package atd.m;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Product;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "<init>", "()V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "getDeviceParameterResult-GaL_DrQ", "()Ljava/lang/String;", "getDeviceParameterResult", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCancelled extends DeviceParameter {
    private static long AuthenticationRequestParameters = 0;
    private static char getDeviceData = 0;
    private static int getSDKAppID = 1;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/build/Product$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int AuthenticationRequestParameters;
        private static char[] getDeviceData;
        private static char getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            AuthenticationRequestParameters = 0;
            getSDKTransactionID = 1;
            getDeviceData = new char[]{52401, 52411, 53063, 52407, 53062, 53056, 52394, 53059, 52376, 52465, 52395, 52413, 52396, 52410, 52398, 52409, 52405, 52412, 53058, 52402, 52415, 53057, 53061, 52378, 52403, 52393, 52353, 52463, 53060, 52408, 52381, 52400, 52464, 52397, 52414, 52391};
            getSDKReferenceNumber = (char) 63810;
        }

        private AuthenticationRequestParameters() {
        }

        private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
            char[] charArray;
            long j11;
            int i12;
            int length;
            char[] cArr;
            int i13;
            Object method;
            if (str != null) {
                int i14 = $11 + 109;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr2 = charArray;
            atd.az.completed completedVar = new atd.az.completed();
            char[] cArr3 = getDeviceData;
            Class cls = Integer.TYPE;
            int i15 = 0;
            if (cArr3 != null) {
                int i16 = $11 + 53;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    length = cArr3.length;
                    cArr = new char[length];
                } else {
                    length = cArr3.length;
                    cArr = new char[length];
                }
                int i17 = 0;
                j11 = 0;
                while (i17 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i17])};
                        Map map = atd.a.getMessageVersion.timedout;
                        Object obj = map.get(-1709775791);
                        if (obj != null) {
                            i13 = i15;
                            method = obj;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - TextUtils.getTrimmedLength(""), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 24 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            byte b12 = (byte) i15;
                            i13 = i15;
                            Object[] objArr3 = new Object[1];
                            c(b12, (byte) (b12 | 55), (byte) (-1), objArr3);
                            method = cls2.getMethod((String) objArr3[i13], cls);
                            map.put(-1709775791, method);
                        }
                        cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i17++;
                        i15 = i13;
                        length = length;
                        cArr2 = cArr2;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr;
            } else {
                j11 = 0;
            }
            char[] cArr4 = cArr2;
            int i18 = i15;
            Object[] objArr4 = {Integer.valueOf(getSDKReferenceNumber)};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method2 = map2.get(-1709775791);
            char c11 = '0';
            if (method2 == null) {
                Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2312 - TextUtils.indexOf((CharSequence) "", '0'), (char) ExpandableListView.getPackedPositionType(j11), 24 - View.getDefaultSize(i18, i18));
                byte b13 = (byte) i18;
                Object[] objArr5 = new Object[1];
                c(b13, (byte) (b13 | 55), (byte) (-1), objArr5);
                method2 = cls3.getMethod((String) objArr5[i18], cls);
                map2.put(-1709775791, method2);
            }
            char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
            char[] cArr5 = new char[i11];
            if (i11 % 2 != 0) {
                i12 = i11 - 1;
                cArr5[i12] = (char) (cArr4[i12] - b11);
            } else {
                i12 = i11;
            }
            if (i12 > 1) {
                completedVar.getSDKTransactionID = 0;
                while (true) {
                    int i19 = completedVar.getSDKTransactionID;
                    if (i19 >= i12) {
                        break;
                    }
                    int i21 = $11;
                    $10 = (i21 + 9) % 128;
                    char c12 = cArr4[i19];
                    completedVar.getSDKAppID = c12;
                    char c13 = cArr4[i19 + 1];
                    completedVar.getSDKReferenceNumber = c13;
                    if (c12 == c13) {
                        $10 = (i21 + 97) % 128;
                        cArr5[i19] = (char) (c12 - b11);
                        cArr5[i19 + 1] = (char) (c13 - b11);
                        $10 = (i21 + 7) % 128;
                    } else {
                        Object[] objArr6 = {completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), completedVar};
                        Map map3 = atd.a.getMessageVersion.timedout;
                        Object method3 = map3.get(700818725);
                        if (method3 == null) {
                            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 1919, (char) (Process.myTid() >> 22), 28 - TextUtils.indexOf("", c11, 0));
                            byte b14 = (byte) 0;
                            byte b15 = b14;
                            Object[] objArr7 = new Object[1];
                            c(b14, b15, (byte) (b15 - 1), objArr7);
                            String str2 = (String) objArr7[0];
                            Class cls5 = Integer.TYPE;
                            method3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                            map3.put(700818725, method3);
                        }
                        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                        int i22 = completedVar.getSDKEphemeralPublicKey;
                        if (iIntValue == i22) {
                            Object[] objArr8 = {completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, completedVar, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), completedVar, Integer.valueOf(cCharValue), completedVar};
                            Object method4 = map3.get(-248084636);
                            if (method4 == null) {
                                Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1)) + 1720, (char) (48634 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 24 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                byte b16 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                c(b16, (byte) (b16 | 49), (byte) (-1), objArr9);
                                String str3 = (String) objArr9[0];
                                Class cls7 = Integer.TYPE;
                                method4 = cls6.getMethod(str3, Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                map3.put(-248084636, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                            int i23 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                            int i24 = completedVar.getSDKTransactionID;
                            cArr5[i24] = cArr3[iIntValue2];
                            cArr5[i24 + 1] = cArr3[i23];
                        } else {
                            int i25 = completedVar.getDeviceData;
                            int i26 = completedVar.AuthenticationRequestParameters;
                            if (i25 == i26) {
                                int i27 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                                completedVar.getMessageVersion = i27;
                                int i28 = ((i22 + cCharValue) - 1) % cCharValue;
                                completedVar.getSDKEphemeralPublicKey = i28;
                                int i29 = (i26 * cCharValue) + i28;
                                int i31 = completedVar.getSDKTransactionID;
                                cArr5[i31] = cArr3[(i25 * cCharValue) + i27];
                                cArr5[i31 + 1] = cArr3[i29];
                            } else {
                                int i32 = (i25 * cCharValue) + i22;
                                int i33 = (i26 * cCharValue) + completedVar.getMessageVersion;
                                int i34 = completedVar.getSDKTransactionID;
                                cArr5[i34] = cArr3[i32];
                                cArr5[i34 + 1] = cArr3[i33];
                            }
                            completedVar.getSDKTransactionID += 2;
                            $11 = ($10 + 113) % 128;
                            c11 = '0';
                        }
                    }
                    completedVar.getSDKTransactionID += 2;
                    $11 = ($10 + 113) % 128;
                    c11 = '0';
                }
            }
            for (int i35 = 0; i35 < i11; i35++) {
                cArr5[i35] = (char) (cArr5[i35] ^ 13722);
            }
            objArr[0] = new String(cArr5);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(short r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 2
                int r7 = 105 - r7
                int r9 = r9 * 20
                int r9 = 23 - r9
                byte[] r0 = atd.m.ChallengeResultCancelled.AuthenticationRequestParameters.$$a
                int r8 = r8 * 18
                int r8 = r8 + 3
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L18
                r7 = r8
                r3 = r0
                r4 = r2
                r0 = r9
                goto L30
            L18:
                r3 = r2
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r9 = r9 + 1
                if (r4 != r8) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r9]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r6
            L30:
                int r9 = -r9
                int r7 = r7 + r9
                int r7 = r7 + 3
                r9 = r0
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultCancelled.AuthenticationRequestParameters.b(short, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
        /* JADX WARN: Code duplicated, block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = 122 - r7
                byte[] r0 = atd.m.ChallengeResultCancelled.AuthenticationRequestParameters.$$d
                int r8 = r8 + 4
                int r6 = r6 * 4
                int r6 = r6 + 1
                byte[] r1 = new byte[r6]
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r7
                r4 = r2
                r7 = r6
                goto L27
            L13:
                r3 = r2
            L14:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                int r8 = r8 + 1
                r3 = r0[r8]
            L27:
                int r7 = r7 + r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultCancelled.AuthenticationRequestParameters.c(byte, short, int, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getDeviceData(int r42, int r43) {
            /*
                Method dump skipped, instruction units count: 2092
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.m.ChallengeResultCancelled.AuthenticationRequestParameters.getDeviceData(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{103, 33, 110, -94, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10, -2, 24};
            $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE;
        }

        static void init$1() {
            $$d = new byte[]{36, 24, -89, 116};
            $$e = 160;
        }

        public /* synthetic */ AuthenticationRequestParameters(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        SystemClock.elapsedRealtimeNanos();
        ExpandableListView.getPackedPositionChild(0L);
        new AuthenticationRequestParameters((byte) 0);
        int i11 = getSDKTransactionID + 89;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static String AuthenticationRequestParameters() {
        int i11 = getSDKTransactionID + 51;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            String str = Build.PRODUCT;
            s.j(str, "");
            return DeviceParameterResult.Success.StringValue.m50constructorimpl(str);
        }
        String str2 = Build.PRODUCT;
        s.j(str2, "");
        DeviceParameterResult.Success.StringValue.m50constructorimpl(str2);
        throw null;
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = -4201337076207898698L;
        getSDKReferenceNumber = 1458778038;
        getDeviceData = (char) 57467;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final /* synthetic */ DeviceParameterResult getDeviceData() {
        getSDKAppID = (getSDKTransactionID + 99) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(AuthenticationRequestParameters());
        getSDKTransactionID = (getSDKAppID + 49) % 128;
        return stringValueM49boximpl;
    }
}
