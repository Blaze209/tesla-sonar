package com.adyen.threeds2.internal.deviceinfo.parameter;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultError;
import atd.az.ChallengeResultKt;
import atd.az.ChallengeResultTimeout;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import on0.a;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;
import vn0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "", "Success", "Failure", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceParameterResult {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", AnalyticsAttribute.Reason, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure$Reason;", "<init>", "(Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure$Reason;)V", "getReason", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure$Reason;", "Reason", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Failure implements DeviceParameterResult {
        private static int getDeviceData = 0;
        private static int getSDKAppID = 1;
        private final Reason reason;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Failure$Reason;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "RESTRICTED", "UNSUPPORTED_OR_DEPRECATED", "MISSING_PERMISSION", "NULL_OR_BLANK", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Reason {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Reason[] $VALUES;
            private static int AuthenticationRequestParameters;
            public static final Reason MISSING_PERMISSION;
            public static final Reason NULL_OR_BLANK;
            public static final Reason RESTRICTED;
            public static final Reason UNSUPPORTED_OR_DEPRECATED;
            private static char getDeviceData;
            private static int getSDKAppID;
            private static int getSDKReferenceNumber;
            private static long getSDKTransactionID;
            private final String code;

            private static final /* synthetic */ Reason[] $values() {
                int i11 = (AuthenticationRequestParameters + 37) % 128;
                getSDKAppID = i11;
                Reason[] reasonArr = {RESTRICTED, UNSUPPORTED_OR_DEPRECATED, MISSING_PERMISSION, NULL_OR_BLANK};
                int i12 = i11 + 85;
                AuthenticationRequestParameters = i12 % 128;
                if (i12 % 2 != 0) {
                    return reasonArr;
                }
                throw null;
            }

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                getSDKAppID = 0;
                AuthenticationRequestParameters = 1;
                getSDKTransactionID();
                Object[] objArr = new Object[1];
                a("芀丵롮ߏ", "\u0000\u0000\u0000\u0000", (char) ((Process.getThreadPriority(0) + 20) >> 6), "⥙觾竃퓵ց枠ﳴ팎\uaad2\ue061", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                String strIntern = ((String) objArr[0]).intern();
                Object[] objArr2 = new Object[1];
                a("⇥꾤䧰ᛆ", "\u0000\u0000\u0000\u0000", (char) (50761 - KeyEvent.getDeadChar(0, 0)), "\ud96e\uf86e쪮⭀", (-1) - ExpandableListView.getPackedPositionChild(0L), objArr2);
                RESTRICTED = new Reason(strIntern, 0, ((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                a("＊㲛\u0c52ｗ", "\u0000\u0000\u0000\u0000", (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), "꘧ꨕ\uf009\ue62d\ud9baṪ鿙띏槿虲\ue46a琶騈\ue96c翆\u0001\uefbfノ\uf741퇂\uf551̄庺ㆎ\ue996", 1379703806 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
                String strIntern2 = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                a("ݻ獭䇯ఘ", "\u0000\u0000\u0000\u0000", (char) (Color.red(0) + 6209), "ᬽ\ud937⋏皲", ViewConfiguration.getLongPressTimeout() >> 16, objArr4);
                UNSUPPORTED_OR_DEPRECATED = new Reason(strIntern2, 1, ((String) objArr4[0]).intern());
                Object[] objArr5 = new Object[1];
                a("恀읅\uf877䉘", "\u0000\u0000\u0000\u0000", (char) (TextUtils.getOffsetBefore("", 0) + 22776), "\ue501\uf445籠꧇쵁ᦦ꿒簶ꍵ쐃踎\ue7d4⬩臶\uefa3듿\ue595렧", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, objArr5);
                String strIntern3 = ((String) objArr5[0]).intern();
                Object[] objArr6 = new Object[1];
                a("쐼곶迟ထ", "\u0000\u0000\u0000\u0000", (char) (4496 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "샅笺\uf5eb鏇", '0' - AndroidCharacter.getMirror('0'), objArr6);
                MISSING_PERMISSION = new Reason(strIntern3, 2, ((String) objArr6[0]).intern());
                Object[] objArr7 = new Object[1];
                a("ઈ骇ﱭ⼆", "\u0000\u0000\u0000\u0000", (char) (1788 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\uf3f9嬹宓輹ⴢ䈺뮙웊ꐜ缘ก髴긷", 1838843658 - TextUtils.getOffsetBefore("", 0), objArr7);
                String strIntern4 = ((String) objArr7[0]).intern();
                Object[] objArr8 = new Object[1];
                a("너䛢惰百", "\u0000\u0000\u0000\u0000", (char) (32353 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "ࡄ欏䐌뵗", KeyEvent.normalizeMetaState(0), objArr8);
                NULL_OR_BLANK = new Reason(strIntern4, 3, ((String) objArr8[0]).intern());
                Reason[] reasonArr$values = $values();
                $VALUES = reasonArr$values;
                $ENTRIES = a.a(reasonArr$values);
                AuthenticationRequestParameters = (getSDKAppID + 105) % 128;
            }

            private Reason(String str, int i11, String str2) {
                super(str, i11);
                this.code = str2;
            }

            private static void a(String str, String str2, char c11, String str3, int i11, Object[] objArr) throws Throwable {
                char[] charArray;
                char[] charArray2;
                char[] charArray3;
                Object method;
                Integer num = -2032575242;
                Integer num2 = 262890898;
                int i12 = $10;
                int i13 = i12 + 83;
                $11 = i13 % 128;
                int i14 = 2;
                if (i13 % 2 == 0) {
                    throw null;
                }
                if (str3 != null) {
                    $11 = (i12 + 69) % 128;
                    charArray = str3.toCharArray();
                } else {
                    charArray = str3;
                }
                char[] cArr = charArray;
                int i15 = 0;
                if (str2 != null) {
                    int i16 = $11 + 3;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        charArray2 = str2.toCharArray();
                        int i17 = 86 / 0;
                    } else {
                        charArray2 = str2.toCharArray();
                    }
                    $11 = ($10 + 33) % 128;
                } else {
                    charArray2 = str2;
                }
                char[] cArr2 = charArray2;
                if (str != null) {
                    $11 = ($10 + 9) % 128;
                    charArray3 = str.toCharArray();
                } else {
                    charArray3 = str;
                }
                char[] cArr3 = charArray3;
                ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int length2 = cArr2.length;
                char[] cArr5 = new char[length2];
                System.arraycopy(cArr3, 0, cArr4, 0, length);
                System.arraycopy(cArr2, 0, cArr5, 0, length2);
                cArr4[0] = (char) (cArr4[0] ^ c11);
                cArr5[2] = (char) (cArr5[2] + ((char) i11));
                int length3 = cArr.length;
                char[] cArr6 = new char[length3];
                challengeResultTimeout.getSDKTransactionID = 0;
                while (challengeResultTimeout.getSDKTransactionID < length3) {
                    try {
                        Object[] objArr2 = {challengeResultTimeout};
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(num2);
                        int i18 = i14;
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls = (Class) getMessageVersion.getSDKTransactionID(1862 - View.MeasureSpec.getSize(i15), (char) (ViewConfiguration.getTapTimeout() >> 16), View.MeasureSpec.makeMeasureSpec(i15, i15) + 21);
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, b12, objArr3);
                            method = cls.getMethod((String) objArr3[0], Object.class);
                            map.put(num2, method);
                        }
                        int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                        Object[] objArr4 = {challengeResultTimeout};
                        Object method2 = map.get(num);
                        if (method2 == null) {
                            method2 = ((Class) getMessageVersion.getSDKTransactionID(225 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 43 - TextUtils.getOffsetBefore("", 0))).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                            map.put(num, method2);
                        }
                        int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                        int i19 = cArr4[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                        Object[] objArr5 = new Object[3];
                        objArr5[i18] = Integer.valueOf(cArr5[iIntValue]);
                        objArr5[1] = Integer.valueOf(i19);
                        objArr5[0] = challengeResultTimeout;
                        Object method3 = map.get(484986213);
                        Class cls2 = Integer.TYPE;
                        if (method3 == null) {
                            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2446 - TextUtils.indexOf("", ""), (char) (1 - (Process.getElapsedCpuTime() > r12 ? 1 : (Process.getElapsedCpuTime() == r12 ? 0 : -1))), 17 - TextUtils.lastIndexOf("", '0'));
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr6 = new Object[1];
                            b(b13, b14, (byte) (b14 + 1), objArr6);
                            method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                            map.put(484986213, method3);
                        }
                        ((Method) method3).invoke(null, objArr5);
                        int i21 = cArr4[iIntValue2] * 32718;
                        Object[] objArr7 = new Object[i18];
                        objArr7[1] = Integer.valueOf(cArr5[iIntValue]);
                        objArr7[0] = Integer.valueOf(i21);
                        Object method4 = map.get(-919285918);
                        if (method4 == null) {
                            method4 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > r12 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == r12 ? 0 : -1)) + 2968, (char) (9913 - Gravity.getAbsoluteGravity(0, 0)), ExpandableListView.getPackedPositionType(0L) + 37)).getMethod("g", cls2, cls2);
                            map.put(-919285918, method4);
                        }
                        cArr5[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                        char c12 = challengeResultTimeout.getDeviceData;
                        cArr4[iIntValue2] = c12;
                        int i22 = challengeResultTimeout.getSDKTransactionID;
                        cArr6[i22] = (char) (((((long) (c12 ^ cArr[i22])) ^ (getSDKTransactionID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKReferenceNumber) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getDeviceData) ^ (-4201337076207898698L)))));
                        challengeResultTimeout.getSDKTransactionID = i22 + 1;
                        length3 = length3;
                        i14 = i18;
                        cArr = cArr;
                        cArr4 = cArr4;
                        num = num;
                        num2 = num2;
                        i15 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr6);
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0025  */
            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void b(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 3
                    int r0 = r7 + 1
                    byte[] r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.$$a
                    int r8 = r8 * 4
                    int r8 = r8 + 102
                    int r6 = r6 * 4
                    int r6 = r6 + 4
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L17
                    r8 = r6
                    r4 = r7
                    r3 = r2
                    goto L2c
                L17:
                    r3 = r2
                L18:
                    byte r4 = (byte) r8
                    r0[r3] = r4
                    if (r3 != r7) goto L25
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    r9[r2] = r6
                    return
                L25:
                    r4 = r1[r6]
                    int r3 = r3 + 1
                    r5 = r8
                    r8 = r6
                    r6 = r5
                L2c:
                    int r4 = -r4
                    int r6 = r6 + r4
                    int r8 = r8 + 1
                    r5 = r8
                    r8 = r6
                    r6 = r5
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.b(short, byte, short, java.lang.Object[]):void");
            }

            public static EnumEntries<Reason> getEntries() {
                int i11 = (getSDKAppID + 71) % 128;
                AuthenticationRequestParameters = i11;
                EnumEntries<Reason> enumEntries = $ENTRIES;
                getSDKAppID = (i11 + 59) % 128;
                return enumEntries;
            }

            static void getSDKTransactionID() {
                getSDKTransactionID = -4201337076207898698L;
                getSDKReferenceNumber = 1458778038;
                getDeviceData = (char) 49819;
            }

            static void init$0() {
                $$a = new byte[]{29, -9, 65, -64};
                $$b = 147;
            }

            public static Reason valueOf(String str) {
                AuthenticationRequestParameters = (getSDKAppID + 77) % 128;
                Reason reason = (Reason) Enum.valueOf(Reason.class, str);
                int i11 = getSDKAppID + 11;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 61 / 0;
                }
                return reason;
            }

            public static Reason[] values() {
                getSDKAppID = (AuthenticationRequestParameters + 25) % 128;
                Reason[] reasonArr = (Reason[]) $VALUES.clone();
                AuthenticationRequestParameters = (getSDKAppID + 119) % 128;
                return reasonArr;
            }

            public final String getCode() {
                int i11 = (getSDKAppID + 7) % 128;
                AuthenticationRequestParameters = i11;
                String str = this.code;
                int i12 = i11 + 73;
                getSDKAppID = i12 % 128;
                if (i12 % 2 == 0) {
                    return str;
                }
                throw null;
            }
        }

        public Failure(Reason reason) {
            s.k(reason, "");
            this.reason = reason;
        }

        public final Reason getReason() {
            int i11 = getSDKAppID + 41;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                return this.reason;
            }
            int i12 = 80 / 0;
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "IntValue", "LongValue", "DoubleValue", "FloatValue", "BooleanValue", "StringValue", "StringsListValue", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$BooleanValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$DoubleValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$IntValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$LongValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringsListValue;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Success extends DeviceParameterResult {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$BooleanValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(Z)Z", "getValue", "()Z", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "equals", "other", "", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @b
        public static final class BooleanValue implements Success {
            private static int AuthenticationRequestParameters = 0;
            private static int getSDKReferenceNumber = 1;
            private final boolean value;

            private /* synthetic */ BooleanValue(boolean z11) {
                this.value = z11;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ BooleanValue m14boximpl(boolean z11) {
                BooleanValue booleanValue = new BooleanValue(z11);
                int i11 = getSDKReferenceNumber;
                int i12 = (i11 & (-40)) | ((~i11) & 39);
                int i13 = (i11 & 39) << 1;
                AuthenticationRequestParameters = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                return booleanValue;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static boolean m15constructorimpl(boolean z11) {
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & 73;
                int i13 = -(-((i11 ^ 73) | i12));
                int i14 = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                AuthenticationRequestParameters = i14;
                int i15 = i14 + 105;
                getSDKReferenceNumber = i15 % 128;
                if (i15 % 2 != 0) {
                    return z11;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m16equalsimpl(boolean z11, Object obj) {
                int i11 = AuthenticationRequestParameters;
                int i12 = ((((i11 ^ 101) | (i11 & 101)) << 1) - (((~i11) & 101) | (i11 & (-102)))) % 128;
                getSDKReferenceNumber = i12;
                if (obj instanceof BooleanValue) {
                    if (z11 != ((BooleanValue) obj).m20unboximpl()) {
                        int i13 = AuthenticationRequestParameters;
                        int i14 = i13 & 125;
                        int i15 = (i13 ^ 125) | i14;
                        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
                        getSDKReferenceNumber = i16 % 128;
                        return i16 % 2 == 0;
                    }
                    int i17 = AuthenticationRequestParameters;
                    int i18 = ((i17 & 28) + (i17 | 28)) - 1;
                    getSDKReferenceNumber = i18 % 128;
                    if (i18 % 2 == 0) {
                        int i19 = 37 / 0;
                    }
                    return true;
                }
                int i21 = i12 & 107;
                int i22 = (i12 ^ 107) | i21;
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                int i24 = i23 % 128;
                AuthenticationRequestParameters = i24;
                boolean z12 = i23 % 2 != 0;
                int i25 = i24 ^ 39;
                int i26 = ((i24 & 39) | i25) << 1;
                int i27 = -i25;
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                getSDKReferenceNumber = i28 % 128;
                if (i28 % 2 == 0) {
                    int i29 = 9 / 0;
                }
                return z12;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m17equalsimpl0(boolean z11, boolean z12) {
                int i11 = AuthenticationRequestParameters;
                getSDKReferenceNumber = (i11 + 23) % 128;
                if (z11 != z12) {
                    int i12 = i11 + 50;
                    getSDKReferenceNumber = ((i12 ^ (-1)) + (i12 << 1)) % 128;
                    return false;
                }
                int i13 = i11 + 9;
                getSDKReferenceNumber = i13 % 128;
                if (i13 % 2 != 0) {
                    return true;
                }
                throw null;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m18hashCodeimpl(boolean z11) {
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & 19;
                int i13 = -(-((i11 ^ 19) | i12));
                AuthenticationRequestParameters = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
                int iHashCode = Boolean.hashCode(z11);
                int i14 = getSDKReferenceNumber;
                AuthenticationRequestParameters = ((((i14 ^ 37) | (i14 & 37)) << 1) - (((~i14) & 37) | (i14 & (-38)))) % 128;
                return iHashCode;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m19toStringimpl(boolean z11) {
                int i11 = getSDKReferenceNumber;
                int i12 = ((i11 | 80) << 1) - (i11 ^ 80);
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                AuthenticationRequestParameters = i13 % 128;
                if (i13 % 2 == 0) {
                    return String.valueOf(z11);
                }
                String.valueOf(z11);
                throw null;
            }

            public final boolean equals(Object obj) {
                int i11 = getSDKReferenceNumber;
                AuthenticationRequestParameters = ((i11 & 57) + (i11 | 57)) % 128;
                boolean zM16equalsimpl = m16equalsimpl(this.value, obj);
                getSDKReferenceNumber = (AuthenticationRequestParameters + 61) % 128;
                return zM16equalsimpl;
            }

            public final boolean getValue() {
                int i11 = AuthenticationRequestParameters;
                int i12 = (i11 ^ 25) + ((i11 & 25) << 1);
                int i13 = i12 % 128;
                getSDKReferenceNumber = i13;
                if (i12 % 2 == 0) {
                    throw null;
                }
                boolean z11 = this.value;
                int i14 = i13 ^ 109;
                int i15 = (i13 & 109) << 1;
                AuthenticationRequestParameters = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
                return z11;
            }

            public final int hashCode() {
                AuthenticationRequestParameters = ((-2) - ((getSDKReferenceNumber + 26) ^ (-1))) % 128;
                int iM18hashCodeimpl = m18hashCodeimpl(this.value);
                int i11 = AuthenticationRequestParameters + 33;
                getSDKReferenceNumber = i11 % 128;
                if (i11 % 2 == 0) {
                    int i12 = 54 / 0;
                }
                return iM18hashCodeimpl;
            }

            public final String toString() {
                int i11 = getSDKReferenceNumber;
                int i12 = i11 ^ 21;
                int i13 = (i11 & 21) << 1;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                AuthenticationRequestParameters = i14 % 128;
                int i15 = i14 % 2;
                boolean z11 = this.value;
                if (i15 != 0) {
                    m19toStringimpl(z11);
                    throw null;
                }
                String strM19toStringimpl = m19toStringimpl(z11);
                int i16 = AuthenticationRequestParameters;
                int i17 = i16 & 23;
                int i18 = (i16 ^ 23) | i17;
                int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                getSDKReferenceNumber = i19 % 128;
                if (i19 % 2 == 0) {
                    int i21 = 85 / 0;
                }
                return strM19toStringimpl;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ boolean m20unboximpl() {
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 | 65;
                int i13 = ((i12 << 1) - (~(-((~(i11 & 65)) & i12)))) - 1;
                getSDKReferenceNumber = i13 % 128;
                if (i13 % 2 != 0) {
                    return this.value;
                }
                throw null;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$DoubleValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(D)D", "getValue", "()D", "toString", "", "toString-impl", "(D)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(DLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(D)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @b
        public static final class DoubleValue implements Success {
            private static int getSDKAppID = 0;
            private static int getSDKTransactionID = 1;
            private final double value;

            private /* synthetic */ DoubleValue(double d11) {
                this.value = d11;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ DoubleValue m21boximpl(double d11) {
                DoubleValue doubleValue = new DoubleValue(d11);
                int i11 = getSDKAppID;
                int i12 = i11 & 17;
                int i13 = ((i11 ^ 17) | i12) << 1;
                int i14 = -((i11 | 17) & (~i12));
                getSDKTransactionID = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
                return doubleValue;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static double m22constructorimpl(double d11) {
                int i11 = getSDKTransactionID;
                int i12 = i11 & 111;
                int i13 = i12 + ((i11 ^ 111) | i12);
                getSDKAppID = i13 % 128;
                if (i13 % 2 == 0) {
                    return d11;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m23equalsimpl(double d11, Object obj) {
                int i11 = (getSDKTransactionID + 115) % 128;
                getSDKAppID = i11;
                if (!(obj instanceof DoubleValue)) {
                    int i12 = i11 ^ 43;
                    int i13 = -(-((i11 & 43) << 1));
                    getSDKTransactionID = (((i12 | i13) << 1) - (i12 ^ i13)) % 128;
                    return false;
                }
                if (Double.compare(d11, ((DoubleValue) obj).m27unboximpl()) == 0) {
                    int i14 = getSDKTransactionID;
                    getSDKAppID = ((i14 ^ 37) + ((i14 & 37) << 1)) % 128;
                    return true;
                }
                int i15 = getSDKAppID;
                int i16 = i15 & 31;
                int i17 = ((((i15 ^ 31) | i16) << 1) - (~(-((i15 | 31) & (~i16))))) - 1;
                getSDKTransactionID = i17 % 128;
                if (i17 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m24equalsimpl0(double d11, double d12) {
                int i11 = getSDKTransactionID;
                getSDKAppID = (((i11 | 109) << 1) - (((~i11) & 109) | (i11 & (-110)))) % 128;
                if (Double.compare(d11, d12) == 0) {
                    int i12 = getSDKAppID;
                    int i13 = i12 & 125;
                    int i14 = ((i12 | 125) & (~i13)) + (i13 << 1);
                    getSDKTransactionID = i14 % 128;
                    return i14 % 2 != 0;
                }
                int i15 = getSDKAppID + 47;
                getSDKTransactionID = i15 % 128;
                if (i15 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m25hashCodeimpl(double d11) {
                int i11 = getSDKTransactionID;
                int i12 = i11 ^ 79;
                int i13 = ((i11 & 79) | i12) << 1;
                int i14 = -i12;
                int i15 = (i13 & i14) + (i13 | i14);
                getSDKAppID = i15 % 128;
                int i16 = i15 % 2;
                int iHashCode = Double.hashCode(d11);
                if (i16 != 0) {
                    int i17 = 53 / 0;
                }
                return iHashCode;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m26toStringimpl(double d11) {
                int i11 = getSDKTransactionID;
                int i12 = i11 + 88;
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                getSDKAppID = i13 % 128;
                if (i13 % 2 == 0 ? d11 % 1.0d != 0.0d : d11 / 1.0d != 0.0d) {
                    getSDKAppID = (((i11 ^ 68) + ((i11 & 68) << 1)) - 1) % 128;
                    String plainString = new BigDecimal(String.valueOf(d11)).toPlainString();
                    s.j(plainString, "");
                    int i14 = getSDKAppID;
                    int i15 = i14 & 95;
                    int i16 = -(-((i14 ^ 95) | i15));
                    int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                    getSDKTransactionID = i17 % 128;
                    if (i17 % 2 != 0) {
                        return plainString;
                    }
                    throw null;
                }
                int i18 = ((((i11 ^ 1) | (i11 & 1)) << 1) - (((~i11) & 1) | (i11 & (-2)))) % 128;
                getSDKAppID = i18;
                int i19 = i18 ^ 45;
                int i21 = (i18 & 45) << 1;
                int i22 = ((i19 | i21) << 1) - (i19 ^ i21);
                getSDKTransactionID = i22 % 128;
                int i23 = (int) d11;
                if (i22 % 2 == 0) {
                    String.valueOf(i23);
                    throw null;
                }
                String strValueOf = String.valueOf(i23);
                int i24 = getSDKAppID;
                int i25 = i24 & 39;
                getSDKTransactionID = (i25 + ((i24 ^ 39) | i25)) % 128;
                return strValueOf;
            }

            public final boolean equals(Object obj) {
                int i11 = getSDKAppID;
                int i12 = (i11 ^ 84) + ((i11 & 84) << 1);
                int i13 = (i12 ^ (-1)) + (i12 << 1);
                getSDKTransactionID = i13 % 128;
                if (i13 % 2 != 0) {
                    return m23equalsimpl(this.value, obj);
                }
                m23equalsimpl(this.value, obj);
                throw null;
            }

            public final double getValue() {
                int i11 = getSDKAppID;
                double d11 = this.value;
                int i12 = i11 + 7;
                getSDKTransactionID = i12 % 128;
                if (i12 % 2 != 0) {
                    return d11;
                }
                throw null;
            }

            public final int hashCode() {
                int iM25hashCodeimpl;
                int i11 = getSDKTransactionID;
                int i12 = (i11 & 57) + (i11 | 57);
                getSDKAppID = i12 % 128;
                if (i12 % 2 != 0) {
                    iM25hashCodeimpl = m25hashCodeimpl(this.value);
                    int i13 = 53 / 0;
                } else {
                    iM25hashCodeimpl = m25hashCodeimpl(this.value);
                }
                int i14 = getSDKAppID;
                int i15 = (i14 & (-104)) | ((~i14) & 103);
                int i16 = (i14 & 103) << 1;
                getSDKTransactionID = ((i15 ^ i16) + ((i16 & i15) << 1)) % 128;
                return iM25hashCodeimpl;
            }

            public final String toString() {
                int i11 = getSDKAppID;
                int i12 = i11 & 49;
                getSDKTransactionID = ((i12 - (~((i11 ^ 49) | i12))) - 1) % 128;
                String strM26toStringimpl = m26toStringimpl(this.value);
                int i13 = getSDKTransactionID + 57;
                getSDKAppID = i13 % 128;
                if (i13 % 2 == 0) {
                    return strM26toStringimpl;
                }
                throw null;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ double m27unboximpl() {
                int i11 = getSDKTransactionID;
                int i12 = ((i11 | 45) << 1) - ((i11 & (-46)) | ((~i11) & 45));
                getSDKAppID = i12 % 128;
                if (i12 % 2 != 0) {
                    throw null;
                }
                double d11 = this.value;
                getSDKAppID = ((-2) - ((i11 + 54) ^ (-1))) % 128;
                return d11;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$FloatValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @b
        public static final class FloatValue implements Success {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static byte[] AuthenticationRequestParameters;
            private static int BuildConfig;
            private static char ChallengeResult;
            private static int ChallengeResultCancelled;
            private static int getDeviceData;
            private static long getMessageVersion;
            private static short[] getSDKAppID;
            private static int getSDKEphemeralPublicKey;
            private static int getSDKReferenceNumber;
            private static int getSDKTransactionID;
            private final float value;

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKEphemeralPublicKey = 0;
                BuildConfig = 1;
                getSDKTransactionID = 2068103848;
                getDeviceData = -1568969990;
                getSDKReferenceNumber = 1061199057;
                AuthenticationRequestParameters = new byte[]{25, -29, 21, 20, -25, 23, -27, 48, 50, 18, -23, -49, 56, -20, 18, -23, -81, 88, -44, -26, -19, 6, 33, -89, 23, 25, -27, -17, 0, -20, -32, 87, -92, 5, -7, 7, -27, -80, 67, -69, 78, -80, -87, 85, 67, -69, 75, -75, -65, -84, 97, -78, 67, -16, 3, -5, 14, -16, -23, 21, 3, -5, 11, -11, -1, -20, -33, 60, 0, -65, 71, -5, -12, 12, -5, 2, -15, -56, 55, 6, 7, 0, -13, 11, -16, -45, 34, -1, 62, 36, -36, 44, -46, -40, -53, 6, -43, 36, 69, -72, -74, 74, 88, -72, 76, -75, -67, 79, 75, -77, 89, 74, 83, -87, -71, 91, -74, -78, 75, -75, -67, 74, 69, 106, 93, -14, 74, 69, 74, 125, -3, 77, 67, -65, -75, 90, -74, -70, 13, -123, -93, 93, -65, -72, 79, -73, 87, -69, -65, -97, 111, -75, 68, 29, -22, 5, 52, -39, -12, -2, 50, -42, -2, -34, 60, -47, -43, 44, -46, -38, 45, 34, 13, -15, -34, 60, -64, 34, -40, 38, -47, -2, -2, -2, -2, -2, -2, -2, -2, -2};
                getMessageVersion = -4201337076207898698L;
                ChallengeResultCancelled = 1458778038;
                ChallengeResult = (char) 54014;
            }

            private /* synthetic */ FloatValue(float f11) {
                this.value = f11;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.FloatValue.$$a
                    int r7 = r7 * 4
                    int r1 = r7 + 21
                    int r8 = r8 * 4
                    int r8 = 103 - r8
                    int r6 = r6 * 4
                    int r6 = 3 - r6
                    byte[] r1 = new byte[r1]
                    int r7 = r7 + 20
                    r2 = 0
                    if (r0 != 0) goto L1a
                    r8 = r6
                    r3 = r0
                    r4 = r2
                    r0 = r7
                    goto L34
                L1a:
                    r3 = r2
                L1b:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L28:
                    int r3 = r3 + 1
                    int r6 = r6 + 1
                    r4 = r0[r6]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r0
                    r0 = r5
                L34:
                    int r0 = r0 + r6
                    int r6 = r0 + 3
                    r0 = r8
                    r8 = r6
                    r6 = r0
                    r0 = r3
                    r3 = r4
                    goto L1b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.FloatValue.a(short, byte, byte, java.lang.Object[]):void");
            }

            private static void b(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
                int i14;
                int i15;
                long j11;
                boolean z11;
                char c11;
                int length;
                byte[] bArr;
                int i16;
                Object method;
                ChallengeResultKt challengeResultKt = new ChallengeResultKt();
                StringBuilder sb2 = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getDeviceData)};
                    Map map = getMessageVersion.timedout;
                    Object method2 = map.get(557807898);
                    Class cls = Integer.TYPE;
                    if (method2 != null) {
                        i14 = 0;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(2105 - ExpandableListView.getPackedPositionType(0L), (char) (21995 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), Color.green(0) + 31);
                        byte b12 = (byte) (-1);
                        i14 = 0;
                        Object[] objArr3 = new Object[1];
                        d((byte) ($$e & 12), b12, (byte) (b12 + 1), objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                        map.put(557807898, method2);
                    }
                    int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    int i17 = iIntValue == -1 ? 1 : i14;
                    if (i17 != 0) {
                        int i18 = ($10 + 11) % 128;
                        $11 = i18;
                        byte[] bArr2 = AuthenticationRequestParameters;
                        j11 = -671853308956415234L;
                        if (bArr2 != null) {
                            $10 = (i18 + 83) % 128;
                            int length2 = bArr2.length;
                            byte[] bArr3 = new byte[length2];
                            int i19 = i14;
                            while (i19 < length2) {
                                Object[] objArr4 = {Integer.valueOf(bArr2[i19])};
                                Map map2 = getMessageVersion.timedout;
                                Object obj = map2.get(-844142059);
                                if (obj != null) {
                                    method = obj;
                                } else {
                                    int i21 = i14;
                                    method = ((Class) getMessageVersion.getSDKTransactionID(2936 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) TextUtils.getOffsetAfter("", i21), 32 - TextUtils.lastIndexOf("", '0', i21))).getMethod("s", cls);
                                    map2.put(-844142059, method);
                                }
                                bArr3[i19] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                                i19++;
                                length2 = length2;
                                i17 = i17;
                                i14 = 0;
                            }
                            i15 = i17;
                            $10 = ($11 + 95) % 128;
                            bArr2 = bArr3;
                        } else {
                            i15 = i17;
                        }
                        if (bArr2 != null) {
                            byte[] bArr4 = AuthenticationRequestParameters;
                            Object[] objArr5 = {Integer.valueOf(i13), Integer.valueOf(getSDKTransactionID)};
                            Map map3 = getMessageVersion.timedout;
                            Object method3 = map3.get(557807898);
                            if (method3 == null) {
                                Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2104 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (TextUtils.indexOf("", "", 0, 0) + 21995), (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) + 30);
                                byte b13 = (byte) (-1);
                                Object[] objArr6 = new Object[1];
                                d((byte) ($$e & 12), b13, (byte) (b13 + 1), objArr6);
                                method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                                map3.put(557807898, method3);
                            }
                            iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ (-671853308956415234L))) + ((int) (((long) getDeviceData) ^ (-671853308956415234L))));
                            $10 = ($11 + 17) % 128;
                        } else {
                            iIntValue = (short) (((short) (((long) getSDKAppID[i13 + ((int) (((long) getSDKTransactionID) ^ (-671853308956415234L)))]) ^ (-671853308956415234L))) + ((int) (((long) getDeviceData) ^ (-671853308956415234L))));
                        }
                    } else {
                        i15 = i17;
                        j11 = -671853308956415234L;
                    }
                    if (iIntValue > 0) {
                        challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKTransactionID) ^ j11)) + i15;
                        Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getSDKReferenceNumber), sb2};
                        Map map4 = getMessageVersion.timedout;
                        Object method4 = map4.get(-1793105104);
                        if (method4 == null) {
                            Class cls4 = (Class) getMessageVersion.getSDKTransactionID(2136 - (ViewConfiguration.getScrollBarSize() >> 8), (char) Color.blue(0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28);
                            byte b14 = (byte) (-1);
                            Object[] objArr8 = new Object[1];
                            d((byte) ($$e & 19), b14, (byte) (b14 + 1), objArr8);
                            method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                            map4.put(-1793105104, method4);
                        }
                        ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                        challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                        byte[] bArr5 = AuthenticationRequestParameters;
                        if (bArr5 != null) {
                            int i22 = $10 + 29;
                            $11 = i22 % 128;
                            if (i22 % 2 == 0) {
                                length = bArr5.length;
                                bArr = new byte[length];
                                i16 = 1;
                            } else {
                                length = bArr5.length;
                                bArr = new byte[length];
                                i16 = 0;
                            }
                            while (i16 < length) {
                                int i23 = $11 + 3;
                                $10 = i23 % 128;
                                if (i23 % 2 != 0) {
                                    bArr[i16] = (byte) (((long) bArr5[i16]) ^ j11);
                                    i16 %= 0;
                                } else {
                                    bArr[i16] = (byte) (((long) bArr5[i16]) ^ j11);
                                    i16++;
                                }
                            }
                            bArr5 = bArr;
                        }
                        if (bArr5 != null) {
                            $10 = ($11 + 123) % 128;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        challengeResultKt.getSDKReferenceNumber = 1;
                        while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                            if (z11) {
                                int i24 = $10 + 115;
                                $11 = i24 % 128;
                                if (i24 % 2 == 0) {
                                    byte[] bArr6 = AuthenticationRequestParameters;
                                    int i25 = challengeResultKt.getDeviceData;
                                    challengeResultKt.getDeviceData = i25 % 0;
                                    c11 = (char) (challengeResultKt.getSDKAppID << (((byte) (((byte) (((long) bArr6[i25]) % j11)) >>> s11)) ^ b11));
                                } else {
                                    byte[] bArr7 = AuthenticationRequestParameters;
                                    int i26 = challengeResultKt.getDeviceData;
                                    challengeResultKt.getDeviceData = i26 - 1;
                                    c11 = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr7[i26]) ^ j11)) + s11)) ^ b11));
                                }
                                challengeResultKt.getSDKTransactionID = c11;
                            } else {
                                short[] sArr = getSDKAppID;
                                int i27 = challengeResultKt.getDeviceData;
                                challengeResultKt.getDeviceData = i27 - 1;
                                challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i27]) ^ j11)) + s11)) ^ b11));
                            }
                            sb2.append(challengeResultKt.getSDKTransactionID);
                            challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                            challengeResultKt.getSDKReferenceNumber++;
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

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ FloatValue m28boximpl(float f11) {
                FloatValue floatValue = new FloatValue(f11);
                getSDKEphemeralPublicKey = (BuildConfig + 65) % 128;
                return floatValue;
            }

            private static void c(char c11, String str, String str2, String str3, int i11, Object[] objArr) throws Throwable {
                char[] charArray;
                Integer num = -2032575242;
                Integer num2 = 262890898;
                int i12 = $11 + 5;
                int i13 = i12 % 128;
                $10 = i13;
                int i14 = 2;
                if (i12 % 2 != 0) {
                    throw null;
                }
                if (str3 != null) {
                    int i15 = i13 + 13;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        str3.toCharArray();
                        throw null;
                    }
                    charArray = str3.toCharArray();
                } else {
                    charArray = str3;
                }
                char[] cArr = charArray;
                char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
                char[] charArray3 = str != null ? str.toCharArray() : str;
                ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
                int length = charArray3.length;
                char[] cArr2 = new char[length];
                int length2 = charArray2.length;
                char[] cArr3 = new char[length2];
                int i16 = 0;
                System.arraycopy(charArray3, 0, cArr2, 0, length);
                System.arraycopy(charArray2, 0, cArr3, 0, length2);
                cArr2[0] = (char) (cArr2[0] ^ c11);
                cArr3[2] = (char) (cArr3[2] + ((char) i11));
                int length3 = cArr.length;
                char[] cArr4 = new char[length3];
                challengeResultTimeout.getSDKTransactionID = 0;
                while (challengeResultTimeout.getSDKTransactionID < length3) {
                    try {
                        Object[] objArr2 = {challengeResultTimeout};
                        Map map = getMessageVersion.timedout;
                        Object method = map.get(num2);
                        int i17 = i14;
                        if (method == null) {
                            Class cls = (Class) getMessageVersion.getSDKTransactionID(1910 - AndroidCharacter.getMirror('0'), (char) KeyEvent.getDeadChar(i16, i16), 21 - ((Process.getThreadPriority(i16) + 20) >> 6));
                            byte b11 = (byte) 0;
                            byte b12 = (byte) (b11 - 1);
                            Object[] objArr3 = new Object[1];
                            d(b11, b12, (byte) (b12 + 1), objArr3);
                            method = cls.getMethod((String) objArr3[0], Object.class);
                            map.put(num2, method);
                        }
                        int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                        Object[] objArr4 = {challengeResultTimeout};
                        Object method2 = map.get(num);
                        if (method2 == null) {
                            method2 = ((Class) getMessageVersion.getSDKTransactionID(((Process.getThreadPriority(0) + 20) >> 6) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) View.MeasureSpec.getMode(0), TextUtils.getOffsetAfter("", 0) + 43)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                            map.put(num, method2);
                        }
                        int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                        int i18 = cArr2[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                        Object[] objArr5 = new Object[3];
                        objArr5[i17] = Integer.valueOf(cArr3[iIntValue]);
                        objArr5[1] = Integer.valueOf(i18);
                        objArr5[0] = challengeResultTimeout;
                        Object method3 = map.get(484986213);
                        Class cls2 = Integer.TYPE;
                        if (method3 == null) {
                            Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2447, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 17 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            byte length4 = (byte) $$d.length;
                            byte b13 = (byte) (length4 - 5);
                            Object[] objArr6 = new Object[1];
                            d(length4, b13, (byte) (b13 + 1), objArr6);
                            method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                            map.put(484986213, method3);
                        }
                        ((Method) method3).invoke(null, objArr5);
                        int i19 = cArr2[iIntValue2] * 32718;
                        Object[] objArr7 = new Object[i17];
                        objArr7[1] = Integer.valueOf(cArr3[iIntValue]);
                        objArr7[0] = Integer.valueOf(i19);
                        Object method4 = map.get(-919285918);
                        if (method4 == null) {
                            method4 = ((Class) getMessageVersion.getSDKTransactionID(2970 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (TextUtils.getOffsetAfter("", 0) + 9913), 37 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("g", cls2, cls2);
                            map.put(-919285918, method4);
                        }
                        cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                        char c12 = challengeResultTimeout.getDeviceData;
                        cArr2[iIntValue2] = c12;
                        int i21 = challengeResultTimeout.getSDKTransactionID;
                        cArr4[i21] = (char) (((((long) (c12 ^ cArr[i21])) ^ (getMessageVersion ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) ChallengeResultCancelled) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) ChallengeResult) ^ (-4201337076207898698L)))));
                        challengeResultTimeout.getSDKTransactionID = i21 + 1;
                        cArr2 = cArr2;
                        i14 = i17;
                        length3 = length3;
                        num = num;
                        num2 = num2;
                        i16 = 0;
                        cArr = cArr;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArr4);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static float m29constructorimpl(float f11) {
                int i11 = (getSDKEphemeralPublicKey + 19) % 128;
                BuildConfig = i11;
                getSDKEphemeralPublicKey = (i11 + 87) % 128;
                return f11;
            }

            private static void d(int i11, short s11, short s12, Object[] objArr) {
                int i12 = i11 + 102;
                int i13 = s12 * 4;
                byte[] bArr = $$d;
                int i14 = s11 + 4;
                byte[] bArr2 = new byte[1 - i13];
                int i15 = 0 - i13;
                int i16 = -1;
                if (bArr == null) {
                    i12 = i15 + i14;
                    i14 = i14;
                    bArr = bArr;
                    i16 = -1;
                }
                while (true) {
                    int i17 = i16 + 1;
                    bArr2[i17] = (byte) i12;
                    if (i17 == i15) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i18 = i14 + 1;
                    byte[] bArr3 = bArr;
                    i12 += bArr[i18];
                    i14 = i18;
                    bArr = bArr3;
                    i16 = i17;
                }
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m30equalsimpl(float f11, Object obj) {
                int i11 = getSDKEphemeralPublicKey + 9;
                int i12 = i11 % 128;
                BuildConfig = i12;
                if (i11 % 2 == 0) {
                    throw null;
                }
                if (!(obj instanceof FloatValue)) {
                    getSDKEphemeralPublicKey = (i12 + 11) % 128;
                    return false;
                }
                if (Float.compare(f11, ((FloatValue) obj).m34unboximpl()) != 0) {
                    return false;
                }
                int i13 = BuildConfig + 125;
                getSDKEphemeralPublicKey = i13 % 128;
                if (i13 % 2 == 0) {
                    return true;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m31equalsimpl0(float f11, float f12) {
                int i11 = BuildConfig + 77;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 != 0) {
                    Float.compare(f11, f12);
                    throw null;
                }
                if (Float.compare(f11, f12) == 0) {
                    return true;
                }
                BuildConfig = (getSDKEphemeralPublicKey + 121) % 128;
                return false;
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] getSDKAppID(android.content.Context r36, int r37, int r38) {
                /*
                    Method dump skipped, instruction units count: 2059
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.FloatValue.getSDKAppID(android.content.Context, int, int):java.lang.Object[]");
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m32hashCodeimpl(float f11) {
                int i11 = BuildConfig + 1;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    return Float.hashCode(f11);
                }
                Float.hashCode(f11);
                throw null;
            }

            static void init$0() {
                $$a = new byte[]{29, -91, 33, -72, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10};
                $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE;
            }

            static void init$1() {
                $$d = new byte[]{81, 113, 124, -104};
                $$e = 127;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m33toStringimpl(float f11) {
                int i11 = BuildConfig + 31;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0 ? ((double) f11) % 1.0d != 0.0d : ((double) f11) % 1.0d != 1.0d) {
                    String plainString = new BigDecimal(String.valueOf(f11)).toPlainString();
                    s.j(plainString, "");
                    return plainString;
                }
                String strValueOf = String.valueOf((int) f11);
                getSDKEphemeralPublicKey = (BuildConfig + 85) % 128;
                return strValueOf;
            }

            public final boolean equals(Object obj) {
                BuildConfig = (getSDKEphemeralPublicKey + 77) % 128;
                boolean zM30equalsimpl = m30equalsimpl(this.value, obj);
                getSDKEphemeralPublicKey = (BuildConfig + 49) % 128;
                return zM30equalsimpl;
            }

            public final float getValue() {
                int i11 = (BuildConfig + 1) % 128;
                getSDKEphemeralPublicKey = i11;
                float f11 = this.value;
                BuildConfig = (i11 + 53) % 128;
                return f11;
            }

            public final int hashCode() {
                getSDKEphemeralPublicKey = (BuildConfig + 65) % 128;
                int iM32hashCodeimpl = m32hashCodeimpl(this.value);
                int i11 = BuildConfig + 51;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    return iM32hashCodeimpl;
                }
                throw null;
            }

            public final String toString() {
                getSDKEphemeralPublicKey = (BuildConfig + 93) % 128;
                String strM33toStringimpl = m33toStringimpl(this.value);
                int i11 = BuildConfig + 117;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    return strM33toStringimpl;
                }
                throw null;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ float m34unboximpl() {
                int i11 = getSDKEphemeralPublicKey;
                float f11 = this.value;
                int i12 = i11 + 25;
                BuildConfig = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 40 / 0;
                }
                return f11;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$IntValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @b
        public static final class IntValue implements Success {
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKTransactionID;
            private final int value;

            private /* synthetic */ IntValue(int i11) {
                this.value = i11;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ IntValue m35boximpl(int i11) {
                IntValue intValue = new IntValue(i11);
                int i12 = AuthenticationRequestParameters;
                getSDKTransactionID = (((i12 ^ 80) + ((i12 & 80) << 1)) - 1) % 128;
                return intValue;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static int m36constructorimpl(int i11) {
                int i12 = AuthenticationRequestParameters;
                int i13 = (i12 & 119) + (i12 | 119);
                getSDKTransactionID = i13 % 128;
                if (i13 % 2 != 0) {
                    int i14 = 21 / 0;
                }
                return i11;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m37equalsimpl(int i11, Object obj) {
                int i12 = getSDKTransactionID;
                int i13 = i12 & 123;
                int i14 = (i12 ^ 123) | i13;
                int i15 = (i13 & i14) + (i13 | i14);
                AuthenticationRequestParameters = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
                if (!(obj instanceof IntValue)) {
                    int i16 = (i12 ^ 66) + ((i12 & 66) << 1);
                    int i17 = (i16 ^ (-1)) + (i16 << 1);
                    AuthenticationRequestParameters = i17 % 128;
                    if (i17 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
                if (i11 != ((IntValue) obj).m41unboximpl()) {
                    int i18 = AuthenticationRequestParameters;
                    int i19 = (((i18 ^ 57) | (i18 & 57)) << 1) - (((~i18) & 57) | (i18 & (-58)));
                    getSDKTransactionID = i19 % 128;
                    if (i19 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                int i21 = AuthenticationRequestParameters;
                int i22 = i21 & 107;
                int i23 = -(-((i21 ^ 107) | i22));
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                getSDKTransactionID = i24 % 128;
                if (i24 % 2 == 0) {
                    return true;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m38equalsimpl0(int i11, int i12) {
                int i13 = AuthenticationRequestParameters;
                int i14 = i13 & 39;
                int i15 = (~i14) & (i13 | 39);
                int i16 = i14 << 1;
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                int i18 = i17 % 128;
                getSDKTransactionID = i18;
                if (i17 % 2 != 0) {
                    throw null;
                }
                if (i11 == i12) {
                    getSDKTransactionID = ((i13 ^ 15) + ((i13 & 15) << 1)) % 128;
                    return true;
                }
                int i19 = (i18 & 38) + (i18 | 38);
                AuthenticationRequestParameters = ((i19 ^ (-1)) + (i19 << 1)) % 128;
                return false;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m39hashCodeimpl(int i11) {
                int i12 = AuthenticationRequestParameters;
                int i13 = i12 & 23;
                int i14 = (i12 | 23) & (~i13);
                int i15 = -(-(i13 << 1));
                int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
                getSDKTransactionID = i16 % 128;
                if (i16 % 2 == 0) {
                    return Integer.hashCode(i11);
                }
                Integer.hashCode(i11);
                throw null;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m40toStringimpl(int i11) {
                int i12 = getSDKTransactionID;
                int i13 = i12 & 111;
                AuthenticationRequestParameters = ((((i12 ^ 111) | i13) << 1) - ((i12 | 111) & (~i13))) % 128;
                String strValueOf = String.valueOf(i11);
                int i14 = AuthenticationRequestParameters;
                int i15 = i14 & 15;
                int i16 = i15 + ((i14 ^ 15) | i15);
                getSDKTransactionID = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 73 / 0;
                }
                return strValueOf;
            }

            public final boolean equals(Object obj) {
                int i11 = AuthenticationRequestParameters;
                getSDKTransactionID = ((((i11 & (-88)) | ((~i11) & 87)) - (~(-(-((i11 & 87) << 1))))) - 1) % 128;
                boolean zM37equalsimpl = m37equalsimpl(this.value, obj);
                int i12 = AuthenticationRequestParameters;
                int i13 = i12 & 57;
                int i14 = (i12 ^ 57) | i13;
                getSDKTransactionID = ((i13 & i14) + (i14 | i13)) % 128;
                return zM37equalsimpl;
            }

            public final int getValue() {
                int i11 = getSDKTransactionID;
                int i12 = (i11 & (-64)) | ((~i11) & 63);
                int i13 = (i11 & 63) << 1;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                AuthenticationRequestParameters = i14 % 128;
                if (i14 % 2 != 0) {
                    return this.value;
                }
                throw null;
            }

            public final int hashCode() {
                getSDKTransactionID = (AuthenticationRequestParameters + 9) % 128;
                int iM39hashCodeimpl = m39hashCodeimpl(this.value);
                int i11 = AuthenticationRequestParameters;
                getSDKTransactionID = ((((i11 | 15) << 1) - (~(-(i11 ^ 15)))) - 1) % 128;
                return iM39hashCodeimpl;
            }

            public final String toString() {
                getSDKTransactionID = ((-2) - ((AuthenticationRequestParameters + 82) ^ (-1))) % 128;
                String strM40toStringimpl = m40toStringimpl(this.value);
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 9;
                getSDKTransactionID = ((i12 - (~(-(-((i11 ^ 9) | i12))))) - 1) % 128;
                return strM40toStringimpl;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ int m41unboximpl() {
                int i11 = getSDKTransactionID;
                int i12 = ((i11 ^ 121) | (i11 & 121)) << 1;
                int i13 = -(((~i11) & 121) | (i11 & (-122)));
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                int i15 = i14 % 128;
                AuthenticationRequestParameters = i15;
                if (i14 % 2 == 0) {
                    throw null;
                }
                int i16 = this.value;
                getSDKTransactionID = (((i15 & (-78)) | ((~i15) & 77)) + ((i15 & 77) << 1)) % 128;
                return i16;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$LongValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(J)J", "getValue", "()J", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @b
        public static final class LongValue implements Success {
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static final byte[] $$d = null;
            private static final int $$e = 0;
            private static int $10;
            private static int $11;
            private static int getDeviceData;
            private static int getSDKAppID;
            private static char[] getSDKTransactionID;
            private final long value;

            static {
                init$1();
                $10 = 0;
                $11 = 1;
                init$0();
                getSDKAppID = 0;
                getDeviceData = 1;
                getSDKTransactionID = new char[]{30792, 30928, 30925, 30918, 30918, 30941, 30938, 30923, 30926, 30927, 30918, 30923, 30931, 30944, 30939, 30918, 30926, 30928, 30920, 30724, 30800, 30809, 30808, 30805, 30794, 30802, 30811, 30800, 30800, 30805, 30804, 30824, 30820, 30798, 30821, 30826, 30813, 30733, 30800, 30805, 30813, 30826, 30727, 30830, 30799, 30832, 30839, 30808, 30802, 30798, 30805, 30807, 30809, 30825, 30866, 30905, 30904, 30879, 30884, 30886, 30881, 30871, 30881, 30881, 30873, 30881, 30879, 30870, 30871, 30876, 30785, 30911, 30878, 30879, 30882, 30886, 30881, 30871, 30905, 30911, 30874, 30879, 30887, 30884, 30785, 30909, 30880, 30881, 30872, 30879, 30880, 30909, 30905, 30903, 31018, 31018, 30735, 30839, 30831, 30792, 30792, 30831, 30835, 30806, 30805, 30798, 30807, 30806, 30835, 30836, 30803, 30797, 30807, 30812, 30810, 30812, 30812, 30807, 30809, 30815, 30809, 30806, 30810, 30839, 30833, 30799, 30798, 30758, 30863, 30852, 30848, 30863, 30857, 30789, 30849, 30971, 30849, 30789, 30852, 30853, 30869, 30861, 30852, 30859, 30865, 30867, 30848, 30974, 30789, 30861, 30852, 30859, 30865, 30867, 30848, 30974, 30789, 30861, 30975, 30864, 30863, 30862, 30789, 30854};
            }

            private /* synthetic */ LongValue(long j11) {
                this.value = j11;
            }

            private static void a(String str, int[] iArr, boolean z11, Object[] objArr) throws Throwable {
                int i11;
                char[] cArr;
                char c11;
                Class<Object> cls;
                Object method;
                String str2 = str;
                Class<Object> cls2 = Object.class;
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                ChallengeResultError challengeResultError = new ChallengeResultError();
                int i12 = iArr[0];
                int i13 = iArr[1];
                int i14 = iArr[2];
                int i15 = iArr[3];
                char[] cArr2 = getSDKTransactionID;
                Class cls3 = Integer.TYPE;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    int i16 = 0;
                    while (i16 < length) {
                        try {
                            byte[] bArr2 = bArr;
                            Object[] objArr2 = {Integer.valueOf(cArr2[i16])};
                            int i17 = length;
                            Map map = getMessageVersion.timedout;
                            Object obj = map.get(-1708792688);
                            if (obj != null) {
                                method = obj;
                            } else {
                                Class cls4 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2313, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 24 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                byte b11 = (byte) 2;
                                byte b12 = (byte) (b11 - 2);
                                Object[] objArr3 = new Object[1];
                                c(b11, b12, b12, objArr3);
                                method = cls4.getMethod((String) objArr3[0], cls3);
                                map.put(-1708792688, method);
                            }
                            cArr3[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                            i16++;
                            length = i17;
                            bArr = bArr2;
                            i14 = i14;
                            cArr3 = cArr3;
                            cArr2 = cArr2;
                            i15 = i15;
                            cls2 = cls2;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    }
                    cArr2 = cArr3;
                }
                byte[] bArr3 = bArr;
                Class<Object> cls5 = cls2;
                int i18 = i14;
                int i19 = i15;
                char[] cArr4 = new char[i13];
                System.arraycopy(cArr2, i12, cArr4, 0, i13);
                if (bArr3 != null) {
                    int i21 = $11 + 93;
                    $10 = i21 % 128;
                    if (i21 % 2 != 0) {
                        cArr = new char[i13];
                        challengeResultError.getSDKAppID = 0;
                        c11 = 1;
                    } else {
                        cArr = new char[i13];
                        challengeResultError.getSDKAppID = 0;
                        c11 = 0;
                    }
                    while (true) {
                        int i22 = challengeResultError.getSDKAppID;
                        if (i22 >= i13) {
                            break;
                        }
                        if (bArr3[i22] == 1) {
                            Object[] objArr4 = {Integer.valueOf(cArr4[i22]), Integer.valueOf(c11)};
                            Map map2 = getMessageVersion.timedout;
                            Object method2 = map2.get(10570995);
                            if (method2 == null) {
                                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(558 - (ViewConfiguration.getTouchSlop() >> 8), (char) (5534 - AndroidCharacter.getMirror('0')), 'G' - AndroidCharacter.getMirror('0'));
                                byte b13 = (byte) 3;
                                byte b14 = (byte) (b13 - 3);
                                Object[] objArr5 = new Object[1];
                                c(b13, b14, b14, objArr5);
                                method2 = cls6.getMethod((String) objArr5[0], cls3, cls3);
                                map2.put(10570995, method2);
                            }
                            cArr[i22] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        } else {
                            cArr4 = cArr4;
                            Object[] objArr6 = {Integer.valueOf(cArr4[i22]), Integer.valueOf(c11)};
                            Map map3 = getMessageVersion.timedout;
                            Object method3 = map3.get(-502074319);
                            if (method3 == null) {
                                method3 = ((Class) getMessageVersion.getSDKTransactionID(201 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) KeyEvent.normalizeMetaState(0), View.combineMeasuredStates(0, 0) + 24)).getMethod("a", cls3, cls3);
                                map3.put(-502074319, method3);
                            }
                            cArr[i22] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                        }
                        c11 = cArr[challengeResultError.getSDKAppID];
                        Object[] objArr7 = {challengeResultError, challengeResultError};
                        Map map4 = getMessageVersion.timedout;
                        Object method4 = map4.get(-399400818);
                        if (method4 != null) {
                            cls = cls5;
                        } else {
                            Class cls7 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 854, (char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24);
                            byte b15 = (byte) 0;
                            byte b16 = b15;
                            Object[] objArr8 = new Object[1];
                            c(b15, b16, b16, objArr8);
                            cls = cls5;
                            method4 = cls7.getMethod((String) objArr8[0], cls, cls);
                            map4.put(-399400818, method4);
                        }
                        ((Method) method4).invoke(null, objArr7);
                        cls5 = cls;
                        cArr4 = cArr4;
                    }
                    cArr4 = cArr;
                }
                if (i19 > 0) {
                    char[] cArr5 = new char[i13];
                    i11 = 0;
                    System.arraycopy(cArr4, 0, cArr5, 0, i13);
                    int i23 = i13 - i19;
                    System.arraycopy(cArr5, 0, cArr4, i23, i19);
                    System.arraycopy(cArr5, i19, cArr4, 0, i23);
                    $11 = ($10 + 125) % 128;
                } else {
                    i11 = 0;
                }
                if (z11) {
                    char[] cArr6 = new char[i13];
                    challengeResultError.getSDKAppID = i11;
                    $10 = ($11 + 95) % 128;
                    while (true) {
                        int i24 = challengeResultError.getSDKAppID;
                        if (i24 >= i13) {
                            break;
                        }
                        cArr6[i24] = cArr4[(i13 - i24) - 1];
                        challengeResultError.getSDKAppID = i24 + 1;
                    }
                    cArr4 = cArr6;
                }
                if (i18 > 0) {
                    $10 = ($11 + 81) % 128;
                    challengeResultError.getSDKAppID = 0;
                    while (true) {
                        int i25 = challengeResultError.getSDKAppID;
                        if (i25 >= i13) {
                            break;
                        }
                        int i26 = $10 + 93;
                        $11 = i26 % 128;
                        if (i26 % 2 == 0) {
                            cArr4[i25] = (char) (cArr4[i25] << iArr[2]);
                        } else {
                            cArr4[i25] = (char) (cArr4[i25] - iArr[2]);
                            i25++;
                        }
                        challengeResultError.getSDKAppID = i25;
                    }
                }
                objArr[0] = new String(cArr4);
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
            private static void b(int r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.LongValue.$$a
                    int r6 = r6 * 2
                    int r6 = 105 - r6
                    int r8 = r8 * 18
                    int r8 = 21 - r8
                    int r7 = r7 * 20
                    int r7 = 23 - r7
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L18
                    r6 = r8
                    r3 = r0
                    r4 = r2
                    r0 = r7
                    goto L31
                L18:
                    r3 = r2
                L19:
                    int r7 = r7 + 1
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r3 = r3 + 1
                    if (r3 != r8) goto L2a
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L2a:
                    r4 = r0[r7]
                    r5 = r0
                    r0 = r7
                    r7 = r4
                    r4 = r3
                    r3 = r5
                L31:
                    int r6 = r6 + r7
                    int r6 = r6 + 3
                    r7 = r0
                    r0 = r3
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.LongValue.b(int, int, short, java.lang.Object[]):void");
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ LongValue m42boximpl(long j11) {
                LongValue longValue = new LongValue(j11);
                int i11 = getDeviceData + 13;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    return longValue;
                }
                throw null;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 4
                    int r7 = 3 - r7
                    byte[] r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.LongValue.$$d
                    int r8 = r8 * 4
                    int r8 = r8 + 1
                    int r6 = r6 * 2
                    int r6 = 104 - r6
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r8
                    r5 = r2
                    goto L2a
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r6
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r8) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r7 = r7 + 1
                    r3 = r0[r7]
                L2a:
                    int r3 = -r3
                    int r6 = r6 + r3
                    r3 = r5
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.LongValue.c(short, byte, short, java.lang.Object[]):void");
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m43constructorimpl(long j11) {
                int i11 = (getDeviceData + 67) % 128;
                getSDKAppID = i11;
                int i12 = i11 + 91;
                getDeviceData = i12 % 128;
                if (i12 % 2 != 0) {
                    return j11;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m44equalsimpl(long j11, Object obj) {
                int i11 = (getDeviceData + 9) % 128;
                getSDKAppID = i11;
                if (!(obj instanceof LongValue)) {
                    getDeviceData = (i11 + 1) % 128;
                    return false;
                }
                if (j11 == ((LongValue) obj).m48unboximpl()) {
                    return true;
                }
                int i12 = getDeviceData + 91;
                getSDKAppID = i12 % 128;
                if (i12 % 2 == 0) {
                    return false;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m45equalsimpl0(long j11, long j12) {
                if (j11 == j12) {
                    getSDKAppID = (getDeviceData + 91) % 128;
                    return true;
                }
                getDeviceData = (getSDKAppID + 27) % 128;
                return false;
            }

            /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                java.util.NoSuchElementException
                	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
                	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
                	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                */
            public static java.lang.Object[] getDeviceData(int r37, int r38) {
                /*
                    Method dump skipped, instruction units count: 2077
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.LongValue.getDeviceData(int, int):java.lang.Object[]");
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m46hashCodeimpl(long j11) {
                getDeviceData = (getSDKAppID + 99) % 128;
                int iHashCode = Long.hashCode(j11);
                getDeviceData = (getSDKAppID + 81) % 128;
                return iHashCode;
            }

            static void init$0() {
                $$a = new byte[]{75, 126, 55, 101, -5, 12, -36, -18, 4, 4, Tnaf.POW_2_WIDTH, -2, -4, 10, -16, 6, -14, -1, -26, 36, -11, -14, 0, 10, 2, -24};
                $$b = EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE;
            }

            static void init$1() {
                $$d = new byte[]{81, -98, -48, -128};
                $$e = 60;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m47toStringimpl(long j11) {
                getSDKAppID = (getDeviceData + 29) % 128;
                String strValueOf = String.valueOf(j11);
                int i11 = getDeviceData + 3;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    return strValueOf;
                }
                throw null;
            }

            public final boolean equals(Object obj) {
                getDeviceData = (getSDKAppID + 73) % 128;
                boolean zM44equalsimpl = m44equalsimpl(this.value, obj);
                getSDKAppID = (getDeviceData + 19) % 128;
                return zM44equalsimpl;
            }

            public final long getValue() {
                int i11 = getDeviceData + 71;
                int i12 = i11 % 128;
                getSDKAppID = i12;
                if (i11 % 2 != 0) {
                    throw null;
                }
                long j11 = this.value;
                getDeviceData = (i12 + 45) % 128;
                return j11;
            }

            public final int hashCode() {
                getDeviceData = (getSDKAppID + 49) % 128;
                int iM46hashCodeimpl = m46hashCodeimpl(this.value);
                getDeviceData = (getSDKAppID + 43) % 128;
                return iM46hashCodeimpl;
            }

            public final String toString() {
                int i11 = getDeviceData + 7;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    return m47toStringimpl(this.value);
                }
                m47toStringimpl(this.value);
                throw null;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m48unboximpl() {
                int i11 = getDeviceData + 15;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    return this.value;
                }
                int i12 = 93 / 0;
                return this.value;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "toString", "toString-impl", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @b
        public static final class StringValue implements Success {
            private static int getSDKAppID = 1;
            private static int getSDKReferenceNumber;
            private final String value;

            private /* synthetic */ StringValue(String str) {
                this.value = str;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ StringValue m49boximpl(String str) {
                StringValue stringValue = new StringValue(str);
                int i11 = getSDKAppID;
                int i12 = (i11 | 43) << 1;
                int i13 = -(((~i11) & 43) | (i11 & (-44)));
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getSDKReferenceNumber = i14 % 128;
                if (i14 % 2 == 0) {
                    return stringValue;
                }
                throw null;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static String m50constructorimpl(String str) {
                getSDKReferenceNumber = (getSDKAppID + 91) % 128;
                s.k(str, "");
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & 51;
                int i13 = i11 | 51;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getSDKAppID = i14 % 128;
                if (i14 % 2 != 0) {
                    return str;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m51equalsimpl(String str, Object obj) {
                int i11 = getSDKAppID;
                int i12 = (i11 & (-40)) | ((~i11) & 39);
                int i13 = -(-((i11 & 39) << 1));
                getSDKReferenceNumber = (((i12 | i13) << 1) - (i12 ^ i13)) % 128;
                if (obj instanceof StringValue) {
                    if (!s.f(str, ((StringValue) obj).m55unboximpl())) {
                        getSDKReferenceNumber = (getSDKAppID + 27) % 128;
                        return false;
                    }
                    int i14 = getSDKAppID;
                    int i15 = ((i14 & 104) + (i14 | 104)) - 1;
                    getSDKReferenceNumber = i15 % 128;
                    if (i15 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
                int i16 = i11 & 107;
                int i17 = (i11 ^ 107) | i16;
                int i18 = (((i16 | i17) << 1) - (i16 ^ i17)) % 128;
                getSDKReferenceNumber = i18;
                int i19 = i18 & 93;
                int i21 = -(-((i18 ^ 93) | i19));
                int i22 = (i19 ^ i21) + ((i19 & i21) << 1);
                getSDKAppID = i22 % 128;
                if (i22 % 2 != 0) {
                    return false;
                }
                throw null;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m52equalsimpl0(String str, String str2) {
                int i11 = getSDKAppID + 115;
                getSDKReferenceNumber = i11 % 128;
                int i12 = i11 % 2;
                boolean zF = s.f(str, str2);
                if (i12 != 0) {
                    int i13 = 49 / 0;
                }
                int i14 = getSDKReferenceNumber;
                int i15 = i14 & 117;
                int i16 = (i14 | 117) & (~i15);
                int i17 = i15 << 1;
                getSDKAppID = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
                return zF;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m53hashCodeimpl(String str) {
                int i11 = getSDKAppID + 33;
                getSDKReferenceNumber = i11 % 128;
                int i12 = i11 % 2;
                int iHashCode = str.hashCode();
                if (i12 != 0) {
                    int i13 = 22 / 0;
                }
                return iHashCode;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m54toStringimpl(String str) {
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & 125;
                int i13 = i11 | 125;
                int i14 = (i12 & i13) + (i13 | i12);
                getSDKAppID = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 12 / 0;
                }
                return str;
            }

            public final boolean equals(Object obj) {
                int i11 = getSDKReferenceNumber;
                int i12 = i11 & 79;
                int i13 = ((i11 ^ 79) | i12) << 1;
                int i14 = -((i11 | 79) & (~i12));
                int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
                getSDKAppID = i15 % 128;
                int i16 = i15 % 2;
                boolean zM51equalsimpl = m51equalsimpl(this.value, obj);
                if (i16 == 0) {
                    int i17 = 25 / 0;
                }
                return zM51equalsimpl;
            }

            public final String getValue() {
                int i11 = getSDKAppID;
                String str = this.value;
                int i12 = (((i11 | 74) << 1) - (i11 ^ 74)) - 1;
                getSDKReferenceNumber = i12 % 128;
                if (i12 % 2 == 0) {
                    return str;
                }
                throw null;
            }

            public final int hashCode() {
                int i11 = getSDKReferenceNumber;
                int i12 = (((i11 | 107) << 1) - (~(-(((~i11) & 107) | (i11 & (-108)))))) - 1;
                getSDKAppID = i12 % 128;
                int i13 = i12 % 2;
                int iM53hashCodeimpl = m53hashCodeimpl(this.value);
                if (i13 == 0) {
                    int i14 = 69 / 0;
                }
                return iM53hashCodeimpl;
            }

            public final String toString() {
                int i11 = getSDKAppID;
                int i12 = ((i11 | 101) << 1) - (i11 ^ 101);
                getSDKReferenceNumber = i12 % 128;
                int i13 = i12 % 2;
                String str = this.value;
                if (i13 == 0) {
                    return m54toStringimpl(str);
                }
                m54toStringimpl(str);
                throw null;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ String m55unboximpl() {
                String str;
                int i11 = getSDKAppID;
                int i12 = ((i11 | 59) << 1) - (i11 ^ 59);
                int i13 = i12 % 128;
                getSDKReferenceNumber = i13;
                if (i12 % 2 != 0) {
                    str = this.value;
                    int i14 = 54 / 0;
                } else {
                    str = this.value;
                }
                int i15 = (((i13 | 44) << 1) - (i13 ^ 44)) - 1;
                getSDKAppID = i15 % 128;
                if (i15 % 2 != 0) {
                    return str;
                }
                throw null;
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringsListValue;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success;", "value", "", "", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "getValue", "()Ljava/util/List;", "toString", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/List;)I", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @b
        public static final class StringsListValue implements Success {
            private static int getDeviceData = 0;
            private static int getSDKAppID = 1;
            private final List<String> value;

            private /* synthetic */ StringsListValue(List list) {
                this.value = list;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ StringsListValue m56boximpl(List list) {
                StringsListValue stringsListValue = new StringsListValue(list);
                int i11 = getDeviceData;
                getSDKAppID = ((((i11 | 126) << 1) - (i11 ^ 126)) - 1) % 128;
                return stringsListValue;
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends String> m57constructorimpl(List<String> list) {
                int i11 = getSDKAppID + 93;
                getDeviceData = i11 % 128;
                int i12 = i11 % 2;
                s.k(list, "");
                if (i12 != 0) {
                    throw null;
                }
                int i13 = getSDKAppID;
                getDeviceData = (((i13 & 62) + (i13 | 62)) - 1) % 128;
                return list;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m58equalsimpl(List<? extends String> list, Object obj) {
                int i11;
                int i12 = getSDKAppID;
                getDeviceData = (i12 + 17) % 128;
                boolean z11 = false;
                if (!(obj instanceof StringsListValue)) {
                    int i13 = i12 ^ 117;
                    int i14 = ((((i12 & 117) | i13) << 1) - i13) % 128;
                    getDeviceData = i14;
                    i11 = (i14 ^ 79) + ((i14 & 79) << 1);
                } else {
                    if (s.f(list, ((StringsListValue) obj).m62unboximpl())) {
                        int i15 = getSDKAppID;
                        int i16 = (((i15 & (-102)) | ((~i15) & 101)) - (~(-(-((i15 & 101) << 1))))) - 1;
                        getDeviceData = i16 % 128;
                        if (i16 % 2 != 0) {
                            int i17 = 8 / 0;
                        }
                        return true;
                    }
                    int i18 = getDeviceData;
                    int i19 = (((i18 | 106) << 1) - (i18 ^ 106)) - 1;
                    getSDKAppID = i19 % 128;
                    z11 = i19 % 2 == 0;
                    i11 = i18 + 103;
                }
                getSDKAppID = i11 % 128;
                return z11;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m59equalsimpl0(List<? extends String> list, List<? extends String> list2) {
                int i11 = getSDKAppID;
                int i12 = (-2) - (((i11 ^ 116) + ((i11 & 116) << 1)) ^ (-1));
                getDeviceData = i12 % 128;
                int i13 = i12 % 2;
                boolean zF = s.f(list, list2);
                if (i13 != 0) {
                    int i14 = 76 / 0;
                }
                int i15 = getSDKAppID + 113;
                getDeviceData = i15 % 128;
                if (i15 % 2 == 0) {
                    return zF;
                }
                throw null;
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m60hashCodeimpl(List<? extends String> list) {
                int i11 = getDeviceData;
                int i12 = (i11 | 119) << 1;
                int i13 = -(i11 ^ 119);
                getSDKAppID = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
                int iHashCode = list.hashCode();
                int i14 = getSDKAppID + 73;
                getDeviceData = i14 % 128;
                if (i14 % 2 == 0) {
                    return iHashCode;
                }
                throw null;
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m61toStringimpl(List<? extends String> list) {
                getDeviceData = (getSDKAppID + 109) % 128;
                String string = list.toString();
                int i11 = getDeviceData;
                int i12 = i11 & 33;
                int i13 = i11 | 33;
                int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
                getSDKAppID = i14 % 128;
                if (i14 % 2 != 0) {
                    return string;
                }
                throw null;
            }

            public final boolean equals(Object obj) {
                int i11 = getDeviceData + 1;
                getSDKAppID = i11 % 128;
                if (i11 % 2 == 0) {
                    m58equalsimpl(this.value, obj);
                    throw null;
                }
                boolean zM58equalsimpl = m58equalsimpl(this.value, obj);
                int i12 = (-2) - ((getDeviceData + 100) ^ (-1));
                getSDKAppID = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 38 / 0;
                }
                return zM58equalsimpl;
            }

            public final List<String> getValue() {
                int i11 = getSDKAppID;
                int i12 = (i11 & 11) + (i11 | 11);
                getDeviceData = i12 % 128;
                if (i12 % 2 == 0) {
                    return this.value;
                }
                throw null;
            }

            public final int hashCode() {
                getSDKAppID = (getDeviceData + 115) % 128;
                int iM60hashCodeimpl = m60hashCodeimpl(this.value);
                int i11 = getSDKAppID;
                int i12 = i11 & 3;
                int i13 = (i11 ^ 3) | i12;
                int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
                getDeviceData = i14 % 128;
                if (i14 % 2 == 0) {
                    return iM60hashCodeimpl;
                }
                throw null;
            }

            public final String toString() {
                int i11 = getDeviceData;
                int i12 = i11 & 23;
                int i13 = (((i11 | 23) & (~i12)) - (~(i12 << 1))) - 1;
                getSDKAppID = i13 % 128;
                if (i13 % 2 == 0) {
                    m61toStringimpl(this.value);
                    throw null;
                }
                String strM61toStringimpl = m61toStringimpl(this.value);
                int i14 = getDeviceData;
                int i15 = (i14 & 87) + (i14 | 87);
                getSDKAppID = i15 % 128;
                if (i15 % 2 != 0) {
                    return strM61toStringimpl;
                }
                throw null;
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ List m62unboximpl() {
                int i11 = getSDKAppID;
                int i12 = i11 & 63;
                int i13 = ((i11 ^ 63) | i12) << 1;
                int i14 = -((i11 | 63) & (~i12));
                int i15 = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
                getDeviceData = i15;
                List<String> list = this.value;
                int i16 = (i15 & 65) + (i15 | 65);
                getSDKAppID = i16 % 128;
                if (i16 % 2 != 0) {
                    return list;
                }
                throw null;
            }
        }
    }
}
