package atd.r;

import android.app.Application;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AnimatorDurationScale;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "settings", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/Settings;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends DeviceParameter {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKTransactionID;
    private final atd.q.AuthenticationRequestParameters getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/settings/global/AnimatorDurationScale$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static int getDeviceData;
        private static int getSDKAppID;
        private static int[] getSDKReferenceNumber;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            getSDKAppID = 1;
            getSDKReferenceNumber = new int[]{92525136, 1430585673, -1837411976, -1298582851, 365184058, 732979943, -1506810035, 2103500369, -1877097355, -1197963772, 714967008, 1765084456, -183185164, -751603447, 1161640980, -1775228728, -1786323625, 273379430};
        }

        private getSDKTransactionID() {
        }

        private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
            int i12;
            Object method;
            Object method2;
            Integer num = 1109131256;
            atd.az.ChallengeResultCompleted challengeResultCompleted = new atd.az.ChallengeResultCompleted();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            int i13 = 2;
            if (iArr2 != null) {
                int length = iArr2.length;
                i12 = 16;
                int[] iArr3 = new int[length];
                int i14 = 0;
                while (i14 < length) {
                    int i15 = $11 + 83;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                            Map map = atd.a.getMessageVersion.timedout;
                            Object obj = map.get(2050190164);
                            if (obj != null) {
                                method2 = obj;
                            } else {
                                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTapTimeout() >> 16) + 1862, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 21 - KeyEvent.getDeadChar(0, 0));
                                byte b11 = (byte) 0;
                                byte b12 = (byte) (b11 + 3);
                                Object[] objArr3 = new Object[1];
                                c(b11, b12, (byte) (b12 - 3), objArr3);
                                method2 = cls2.getMethod((String) objArr3[0], cls);
                                map.put(2050190164, method2);
                            }
                            iArr3[i14] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                            i14--;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } else {
                        length = length;
                        cArr = cArr;
                        iArr2 = iArr2;
                        iArr3 = iArr3;
                        int i16 = i14;
                        Object[] objArr4 = {Integer.valueOf(iArr2[i16])};
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object method3 = map2.get(2050190164);
                        if (method3 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0') + 1863, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + 21);
                            byte b13 = (byte) 0;
                            byte b14 = (byte) (b13 + 3);
                            Object[] objArr5 = new Object[1];
                            c(b13, b14, (byte) (b14 - 3), objArr5);
                            method3 = cls3.getMethod((String) objArr5[0], cls);
                            map2.put(2050190164, method3);
                        }
                        iArr3[i16] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                        i14 = i16 + 1;
                    }
                    cArr = cArr;
                    length = length;
                    iArr2 = iArr2;
                    iArr3 = iArr3;
                }
                iArr2 = iArr3;
            } else {
                i12 = 16;
            }
            char[] cArr3 = cArr;
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = getSDKReferenceNumber;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i17 = 0;
                while (i17 < length3) {
                    Object[] objArr6 = {Integer.valueOf(iArr5[i17])};
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map3.get(2050190164);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 1862, (char) ('0' - AndroidCharacter.getMirror('0')), 20 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr7 = new Object[1];
                        c(b15, b16, (byte) (b16 - 3), objArr7);
                        method = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method);
                    }
                    iArr6[i17] = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    i17++;
                    iArr6 = iArr6;
                    iArr5 = iArr5;
                    length3 = length3;
                    cArr2 = cArr2;
                    num = num;
                }
                iArr5 = iArr6;
            }
            Integer num2 = num;
            char[] cArr4 = cArr2;
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            challengeResultCompleted.getDeviceData = 0;
            while (true) {
                int i18 = challengeResultCompleted.getDeviceData;
                if (i18 >= iArr.length) {
                    objArr[0] = new String(cArr4, 0, i11);
                    return;
                }
                $10 = ($11 + 35) % 128;
                int i19 = iArr[i18];
                char c11 = (char) (i19 >> 16);
                cArr3[0] = c11;
                char c12 = (char) i19;
                cArr3[1] = c12;
                char c13 = (char) (iArr[i18 + 1] >> 16);
                cArr3[i13] = c13;
                char c14 = (char) iArr[i18 + 1];
                char c15 = 3;
                cArr3[3] = c14;
                challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
                challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
                atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
                int i21 = 0;
                while (i21 < i12) {
                    int i22 = challengeResultCompleted.getSDKAppID ^ iArr4[i21];
                    challengeResultCompleted.getSDKAppID = i22;
                    int sDKAppID = atd.az.ChallengeResultCompleted.getSDKAppID(i22);
                    Object[] objArr8 = new Object[4];
                    objArr8[c15] = challengeResultCompleted;
                    objArr8[i13] = challengeResultCompleted;
                    objArr8[1] = Integer.valueOf(sDKAppID);
                    objArr8[0] = challengeResultCompleted;
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(929629307);
                    if (method4 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 1299, (char) (CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 - TextUtils.indexOf("", "", 0)), 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr9 = new Object[1];
                        c(b17, b18, b18, objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], Object.class, cls, Object.class, Object.class);
                        map4.put(929629307, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                    challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                    i21++;
                    c15 = c15;
                    i12 = 16;
                }
                char c16 = c15;
                int i23 = challengeResultCompleted.getSDKAppID;
                int i24 = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKAppID = i24;
                challengeResultCompleted.getSDKReferenceNumber = i23;
                int i25 = i23 ^ iArr4[16];
                challengeResultCompleted.getSDKReferenceNumber = i25;
                int i26 = i24 ^ iArr4[17];
                challengeResultCompleted.getSDKAppID = i26;
                cArr3[0] = (char) (i26 >>> 16);
                cArr3[1] = (char) i26;
                cArr3[i13] = (char) (i25 >>> 16);
                cArr3[c16] = (char) i25;
                atd.az.ChallengeResultCompleted.getSDKAppID(iArr4);
                int i27 = challengeResultCompleted.getDeviceData;
                cArr4[i27 * 2] = cArr3[0];
                cArr4[(i27 * 2) + 1] = cArr3[1];
                cArr4[(i27 * 2) + 2] = cArr3[i13];
                cArr4[(i27 * 2) + 3] = cArr3[c16];
                Object[] objArr10 = new Object[i13];
                objArr10[1] = challengeResultCompleted;
                objArr10[0] = challengeResultCompleted;
                Map map5 = atd.a.getMessageVersion.timedout;
                Integer num3 = num2;
                Object method5 = map5.get(num3);
                if (method5 != null) {
                    i12 = 16;
                } else {
                    i12 = 16;
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(0, 0) + 2061, (char) (ViewConfiguration.getTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) + 17);
                    byte b19 = (byte) 0;
                    byte b21 = (byte) (b19 + 1);
                    Object[] objArr11 = new Object[1];
                    c(b19, b21, (byte) (b21 - 1), objArr11);
                    method5 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map5.put(num3, method5);
                }
                ((Method) method5).invoke(null, objArr10);
                $10 = ($11 + 1) % 128;
                num2 = num3;
                i13 = 2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 2
                int r9 = r9 + 103
                byte[] r0 = atd.r.getSDKReferenceNumber.getSDKTransactionID.$$a
                int r8 = r8 * 18
                int r8 = r8 + 3
                int r7 = r7 * 20
                int r7 = 23 - r7
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r0
                r4 = r2
                r0 = r8
                goto L2f
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r7]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r6
            L2f:
                int r9 = -r9
                int r0 = r0 + r9
                int r9 = r0 + 3
                r0 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKReferenceNumber.getSDKTransactionID.b(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void c(short r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                byte[] r0 = atd.r.getSDKReferenceNumber.getSDKTransactionID.$$d
                int r7 = r7 * 2
                int r7 = 1 - r7
                int r5 = r5 * 4
                int r5 = r5 + 4
                int r6 = 120 - r6
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r6 = r5
                r4 = r7
                r3 = r2
                goto L2a
            L15:
                r3 = r6
                r6 = r5
                r5 = r3
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r4 = r0[r6]
            L2a:
                int r5 = r5 + r4
                int r6 = r6 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKReferenceNumber.getSDKTransactionID.c(short, short, byte, java.lang.Object[]):void");
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1638)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:310)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] getSDKAppID(int r38, int r39) {
            /*
                Method dump skipped, instruction units count: 2284
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKReferenceNumber.getSDKTransactionID.getSDKAppID(int, int):java.lang.Object[]");
        }

        static void init$0() {
            $$a = new byte[]{25, -44, -28, 70, 5, -12, 36, 18, -4, -4, -16, 2, 4, -10, Tnaf.POW_2_WIDTH, -6, 14, 1, 26, -36, 11, 14, 0, -10, -2, 24};
            $$b = 119;
        }

        static void init$1() {
            $$d = new byte[]{30, 69, 82, 95};
            $$e = 79;
        }

        public /* synthetic */ getSDKTransactionID(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        AuthenticationRequestParameters();
        View.resolveSizeAndState(0, 0, 0);
        TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        TextUtils.indexOf("", "", 0, 0);
        new getSDKTransactionID((byte) 0);
        getSDKTransactionID = (getSDKAppID + 23) % 128;
    }

    public /* synthetic */ getSDKReferenceNumber(Application application) {
        this(application, new atd.q.getSDKTransactionID(application));
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 1029305027;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a6  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        char[] charArray;
        int i14;
        Throwable cause;
        int i15;
        if (str != null) {
            $11 = ($10 + 71) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        atd.az.getMessageVersion getmessageversion = new atd.az.getMessageVersion();
        char[] cArr2 = new char[i12];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        $10 = ($11 + 35) % 128;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            $10 = ($11 + 9) % 128;
            char c11 = cArr[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr2[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(AuthenticationRequestParameters);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(139968170);
                if (method != null) {
                    i15 = i16;
                } else {
                    i15 = i16;
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1186 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 47 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    byte b11 = (byte) ($$b & 5);
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    int i18 = i15;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - ExpandableListView.getPackedPositionType(0L), (char) (48634 - Color.argb(i18, i18, i18, i18)), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(i18) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i18) == 0.0d ? 0 : -1)));
                    byte b13 = (byte) i18;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[i18], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                $10 = ($11 + 37) % 128;
                cArr = cArr;
                i16 = 0;
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
        if (i13 > 0) {
            getmessageversion.getSDKReferenceNumber = i13;
            char[] cArr3 = new char[i12];
            i14 = 0;
            System.arraycopy(cArr2, 0, cArr3, 0, i12);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, 0, cArr2, i12 - i19, i19);
            int i21 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr3, i21, cArr2, 0, i12 - i21);
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr4 = new char[i12];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i22 = getmessageversion.getDeviceData;
                if (i22 >= i12) {
                    break;
                }
                cArr4[i22] = cArr2[(i12 - i22) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 1721, (char) (KeyEvent.keyCodeFromString("") + 48634), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                $10 = ($11 + 73) % 128;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 * 2
            int r6 = r6 + 66
            byte[] r1 = atd.r.getSDKReferenceNumber.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r4 = r7
            r6 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L30:
            int r4 = -r4
            int r8 = r8 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.r.getSDKReferenceNumber.b(byte, short, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{117, -125, -120, 23};
        $$b = 51;
    }

    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    public final DeviceParameterResult getDeviceData() throws Throwable {
        Float fV;
        getSDKAppID = (getSDKTransactionID + 119) % 128;
        atd.q.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + EnumC4419g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, false, (ViewConfiguration.getTouchSlop() >> 8) + 23, "\uffff\u0005\u0004\ufff5\t\ufff9\ufff7\u0002\ufffb\ufff7\u0004\uffff\u0003\ufff7\n\u0005\b\ufff5\ufffa\u000b\b\ufff7\n", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 9, objArr);
        String sDKTransactionID = authenticationRequestParameters.getSDKTransactionID(((String) objArr[0]).intern());
        if (sDKTransactionID != null && (fV = t.v(sDKTransactionID)) != null) {
            return DeviceParameterResult.Success.FloatValue.m28boximpl(DeviceParameterResult.Success.FloatValue.m29constructorimpl(fV.floatValue()));
        }
        DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
        getSDKTransactionID = (getSDKAppID + 77) % 128;
        return failure;
    }

    private getSDKReferenceNumber(Application application, atd.q.AuthenticationRequestParameters authenticationRequestParameters) {
        s.k(application, "");
        s.k(authenticationRequestParameters, "");
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }
}
