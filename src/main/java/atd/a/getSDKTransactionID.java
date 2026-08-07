package atd.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
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
import atd.az.ChallengeResult;
import atd.az.ChallengeResultTimeout;
import atd.az.ChallengeStatusReceiver;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.d;
import sn0.b;
import sn0.r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\u000f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/SdkIdentifier;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/adyen/threeds2/internal/persistence/PersistenceManager;", "persistenceManager", "<init>", "(Landroid/content/Context;Lcom/adyen/threeds2/internal/persistence/PersistenceManager;)V", "", "generateSdkAppId", "()Ljava/lang/String;", "Lcom/adyen/threeds2/internal/persistence/PersistenceManager;", "getSdkReferenceNumber", "sdkReferenceNumber", "getSdkAppId", "sdkAppId", "applicationContext", "Landroid/content/Context;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte AuthenticationRequestParameters;
    private static char BuildConfig;
    private static int ChallengeResult;
    private static final byte[] ChallengeResultCancelled = null;
    private static int getAdditionalDetails;
    private static final int getMessageVersion = 0;
    private static long getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static long getSDKTransactionID;
    private final atd.al.getSDKTransactionID getDeviceData;
    private final Context getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/adyen/threeds2/internal/SdkIdentifier$Companion;", "", "<init>", "()V", "SDK_APP_ID_KEY", "", "SDK_REFERENCE_NUMBER_FILE_NAME", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$d = null;
        private static final int $$e = 0;
        private static int $10;
        private static int $11;
        private static boolean AuthenticationRequestParameters;
        private static int BuildConfig;
        private static int getDeviceData;
        private static boolean getSDKAppID;
        private static char[] getSDKReferenceNumber;
        private static int getSDKTransactionID;

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            getDeviceData = 0;
            BuildConfig = 1;
            getSDKReferenceNumber = new char[]{64845, 64840};
            getSDKTransactionID = -185467476;
            getSDKAppID = true;
            AuthenticationRequestParameters = true;
        }

        private getDeviceData() {
        }

        public static void AuthenticationRequestParameters(long j11, long j12) throws Throwable {
            BuildConfig = (getDeviceData + 93) % 128;
            byte[] bArr = $$a;
            byte b11 = (byte) (bArr[36] - 1);
            byte b12 = (byte) (-b11);
            Object[] objArr = new Object[1];
            a(b11, b12, b12, objArr);
            Class.forName((String) objArr[0]).getField("getSDKReferenceNumber").get(null);
            BuildConfig = (getDeviceData + 107) % 128;
            try {
                byte b13 = (byte) (bArr[36] - 1);
                byte b14 = (byte) (-b13);
                Object[] objArr2 = new Object[1];
                a(b13, b14, b14, objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b15 = (byte) ($$b >>> 2);
                byte b16 = bArr[36];
                Object[] objArr3 = new Object[1];
                a(b15, b16, b16, objArr3);
                Object objInvoke = cls.getMethod((String) objArr3[0], null).invoke(null, null);
                Object[] objArr4 = {atd.ap.getDeviceData.class.getField("getSDKAppID").get(null)};
                Object[] objArr5 = new Object[1];
                b(null, null, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 127, "\u0082\u0082\u0081", objArr5);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
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
        private static void a(short r5, int r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 6
                int r7 = 103 - r7
                byte[] r0 = atd.a.getSDKTransactionID.getDeviceData.$$a
                int r6 = r6 * 17
                int r1 = r6 + 21
                int r5 = r5 + 4
                byte[] r1 = new byte[r1]
                int r6 = r6 + 20
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r6
                r4 = r2
                goto L2a
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r7
                int r5 = r5 + 1
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L28
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L28:
                r3 = r0[r5]
            L2a:
                int r7 = r7 + r3
                int r7 = r7 + (-8)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.getDeviceData.a(short, int, int, java.lang.Object[]):void");
        }

        private static void b(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
            char[] cArr;
            String str3 = str2;
            Object bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            char[] charArray = str != null ? str.toCharArray() : str;
            ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
            char[] cArr2 = getSDKReferenceNumber;
            Class cls = Integer.TYPE;
            if (cArr2 != null) {
                $10 = ($11 + 71) % 128;
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i12 = 0;
                while (i12 < length) {
                    $10 = ($11 + 47) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i12])};
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(508097192);
                        if (obj == null) {
                            Method method = ((Class) getMessageVersion.getSDKTransactionID(328 - KeyEvent.normalizeMetaState(0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 33 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getMethod("o", cls);
                            map.put(508097192, method);
                            obj = method;
                        }
                        cArr3[i12] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i12++;
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
            }
            Object[] objArr3 = {Integer.valueOf(getSDKTransactionID)};
            Map map2 = getMessageVersion.timedout;
            Object method2 = map2.get(-852383591);
            if (method2 == null) {
                Class cls2 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2061, (char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), TextUtils.indexOf((CharSequence) "", '0') + 18);
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 - 1);
                Object[] objArr4 = new Object[1];
                c(b11, b12, (byte) (b12 + 1), objArr4);
                method2 = cls2.getMethod((String) objArr4[0], cls);
                map2.put(-852383591, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
            if (AuthenticationRequestParameters) {
                int i13 = $11 + 29;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    int length2 = bArr.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length2;
                    cArr = new char[length2];
                    challengeStatusReceiver.getDeviceData = 1;
                } else {
                    int length3 = bArr.length;
                    challengeStatusReceiver.getSDKReferenceNumber = length3;
                    cArr = new char[length3];
                    challengeStatusReceiver.getDeviceData = 0;
                }
                while (true) {
                    int i14 = challengeStatusReceiver.getDeviceData;
                    int i15 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i14 >= i15) {
                        objArr[0] = new String(cArr);
                        return;
                    }
                    cArr[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i11] - iIntValue);
                    Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(-249860496);
                    if (method3 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarSize() >> 8) + 1108, (char) TextUtils.getOffsetBefore("", 0), TextUtils.getTrimmedLength("") + 50);
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr6 = new Object[1];
                        c(b13, b14, (byte) (-b14), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                        map3.put(-249860496, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                }
            } else if (getSDKAppID) {
                int length4 = charArray.length;
                challengeStatusReceiver.getSDKReferenceNumber = length4;
                char[] cArr4 = new char[length4];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i16 = challengeStatusReceiver.getDeviceData;
                    int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i16 >= i17) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i16] = (char) (cArr2[charArray[(i17 - 1) - i16] - i11] - iIntValue);
                    Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(-249860496);
                    if (method4 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(0, 0) + 1108, (char) (AndroidCharacter.getMirror('0') - '0'), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 50);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 - 1);
                        Object[] objArr8 = new Object[1];
                        c(b15, b16, (byte) (-b16), objArr8);
                        method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                        map4.put(-249860496, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                    $10 = ($11 + 61) % 128;
                }
            } else {
                int length5 = iArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length5;
                char[] cArr5 = new char[length5];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i18 = challengeStatusReceiver.getDeviceData;
                    int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i18 >= i19) {
                        objArr[0] = new String(cArr5);
                        return;
                    } else {
                        $10 = ($11 + 93) % 128;
                        cArr5[i18] = (char) (cArr2[iArr[(i19 - 1) - i18] - i11] - iIntValue);
                        challengeStatusReceiver.getDeviceData = i18 + 1;
                    }
                }
            }
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
        private static void c(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 2
                int r9 = r9 + 107
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r8 = r8 + 4
                byte[] r0 = atd.a.getSDKTransactionID.getDeviceData.$$d
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r7
                r9 = r8
                r5 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L25
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L25:
                int r8 = r8 + 1
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
            L2c:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r9
                r9 = r8
                r8 = r3
                r3 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.getDeviceData.c(int, int, int, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{39, -117, 45, 21, 27, -8, -46, 59, 26, -61, 27, 60, 7, -4, 5, 17, 14, -3, 2, 6, 27, -3, 14, 7, -20, 27, 20, 12, -8, 22, 9, -28, 25, 25, -9, 20, 0, 23, -7, 21, 9, 6, 23, -25, -7, 15, 15, 27, 9, 7, 21, -5, 17, -3, 10, -15, 47, 0, -3, 11, 21};
            $$b = 144;
        }

        static void init$1() {
            $$d = new byte[]{99, 39, 79, 89};
            $$e = 116;
        }

        public /* synthetic */ getDeviceData(byte b11) {
            this();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKEphemeralPublicKey = 0;
        getAdditionalDetails = 1;
        getSDKReferenceNumber();
        AuthenticationRequestParameters();
        getSDKTransactionID();
        TextUtils.indexOf((CharSequence) "", '0', 0, 0);
        TypedValue.complexToFloat(0);
        new getDeviceData((byte) 0);
        getSDKEphemeralPublicKey = (getAdditionalDetails + 15) % 128;
    }

    public getSDKTransactionID(Context context, atd.al.getSDKTransactionID getsdktransactionid) {
        s.k(context, "");
        s.k(getsdktransactionid, "");
        this.getDeviceData = getsdktransactionid;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "");
        this.getSDKReferenceNumber = applicationContext;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        getSDKEphemeralPublicKey = (getAdditionalDetails + 101) % 128;
        String sDKAppID = atd.json.ChallengeResultCancelled.getSDKAppID(UUID.randomUUID().toString());
        atd.al.getSDKTransactionID getsdktransactionid2 = getsdktransactionid.getDeviceData;
        Context context = getsdktransactionid.getSDKReferenceNumber;
        Object[] objArr2 = new Object[1];
        b((char) (31906 - Gravity.getAbsoluteGravity(0, 0)), "᭮痧ꋻ\udf7c", "\u0000\u0000\u0000\u0000", "ጉ\ue52e\uf609䄶뫡\udc46똽⬮睭콗\ue880⾎愻Ⴑᬌ\u0003\ua95a허妓곒퓑頶Ꝡ扆㩇猾ⱐ껵赱氷呬", (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 76159205, objArr2);
        getsdktransactionid2.AuthenticationRequestParameters(context, ((String) objArr2[0]).intern(), sDKAppID);
        s.h(sDKAppID);
        int i11 = getAdditionalDetails + 15;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            return sDKAppID;
        }
        throw null;
    }

    private final String BuildConfig() {
        return (String) getSDKAppID(new Object[]{this}, -1309430352, 1309430352, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = atd.a.getSDKTransactionID.ChallengeResultCancelled
            int r8 = 32 - r8
            int r7 = r7 * 14
            int r7 = r7 + 97
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r7 = r8
            r5 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r6]
        L25:
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-1)
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getSDKTransactionID.a(byte, int, int, java.lang.Object[]):void");
    }

    private static void b(char c11, String str, String str2, String str3, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        int i12 = ($11 + 15) % 128;
        $10 = i12;
        int i13 = 2;
        if (str3 != null) {
            int i14 = i12 + 99;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $10 = ($11 + 113) % 128;
            charArray2 = str.toCharArray();
        } else {
            charArray2 = str;
        }
        char[] cArr2 = charArray2;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray3.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray3, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c11);
        cArr4[2] = (char) (cArr4[2] + ((char) i11));
        int length3 = cArr.length;
        char[] cArr5 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = getMessageVersion.timedout;
                Object method = map.get(num2);
                int i15 = i13;
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(1862 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr3 = new Object[1];
                    c(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 224, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 43 - View.combineMeasuredStates(0, 0))).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i16 = cArr3[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i15] = Integer.valueOf(cArr4[iIntValue]);
                objArr5[1] = Integer.valueOf(i16);
                objArr5[0] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 2446, (char) KeyEvent.getDeadChar(0, 0), 18 - KeyEvent.normalizeMetaState(0));
                    byte b13 = (byte) ($$b & 7);
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    c(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i17 = cArr3[iIntValue2] * 32718;
                Object[] objArr7 = new Object[i15];
                objArr7[1] = Integer.valueOf(cArr4[iIntValue]);
                objArr7[0] = Integer.valueOf(i17);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2969, (char) (9913 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 37 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr4[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = challengeResultTimeout.getDeviceData;
                cArr3[iIntValue2] = c12;
                int i18 = challengeResultTimeout.getSDKTransactionID;
                cArr5[i18] = (char) (((((long) (c12 ^ cArr[i18])) ^ (getSDKTransactionID ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) ChallengeResult) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) BuildConfig) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i18 + 1;
                i13 = i15;
                length3 = length3;
                cArr3 = cArr3;
                num = num;
                num2 = num2;
                cArr = cArr;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        String str4 = new String(cArr5);
        $10 = ($11 + 59) % 128;
        objArr[0] = str4;
    }

    private static void c(short s11, byte b11, int i11, Object[] objArr) {
        byte[] bArr = $$a;
        int i12 = b11 * 3;
        int i13 = (s11 * 4) + 102;
        int i14 = (i11 * 3) + 4;
        byte[] bArr2 = new byte[i12 + 1];
        int i15 = -1;
        if (bArr == null) {
            i14++;
            i13 += i12;
        }
        while (true) {
            i15++;
            bArr2[i15] = (byte) i13;
            if (i15 == i12) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                int i16 = bArr[i14];
                i14++;
                i13 += i16;
            }
        }
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        return AuthenticationRequestParameters(objArr);
    }

    static void getSDKReferenceNumber() {
        ChallengeResultCancelled = new byte[]{112, -83, -25, -94, -45, 50, Tnaf.POW_2_WIDTH, -64, 46, 21, 0, -3, 14, -9, 15, -2, -5, -4, -53, 54, 13, 0, 7, -14, 10, 7, -69, 69, -12, 15, -68, 20, 51, 1, -13, Tnaf.POW_2_WIDTH, -38, 21, 14, -12, 7, -1, 14, 2, -10, 10};
        getMessageVersion = 108;
    }

    static void getSDKTransactionID() {
        int i11 = getAdditionalDetails;
        int i12 = i11 + 19;
        getSDKEphemeralPublicKey = i12 % 128;
        int i13 = i12 % 2;
        getSDKAppID = -1176416925021082700L;
        AuthenticationRequestParameters = i13 != 0 ? (byte) 123 : (byte) 107;
        getSDKEphemeralPublicKey = (i11 + 111) % 128;
    }

    static void init$0() {
        $$a = new byte[]{24, -17, 72, 96};
        $$b = 9;
    }

    public final String getDeviceData() throws Throwable {
        getSDKEphemeralPublicKey = (getAdditionalDetails + 57) % 128;
        atd.al.getSDKTransactionID getsdktransactionid = this.getDeviceData;
        Context context = this.getSDKReferenceNumber;
        Object[] objArr = new Object[1];
        b((char) (31907 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), "᭮痧ꋻ\udf7c", "\u0000\u0000\u0000\u0000", "ጉ\ue52e\uf609䄶뫡\udc46똽⬮睭콗\ue880⾎愻Ⴑᬌ\u0003\ua95a허妓곒퓑頶Ꝡ扆㩇猾ⱐ껵赱氷呬", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 76159205, objArr);
        String strAuthenticationRequestParameters = getsdktransactionid.AuthenticationRequestParameters(context, ((String) objArr[0]).intern());
        if (strAuthenticationRequestParameters == null) {
            int i11 = getSDKEphemeralPublicKey + 63;
            getAdditionalDetails = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            strAuthenticationRequestParameters = (String) getSDKAppID(new Object[]{this}, -1309430352, 1309430352, System.identityHashCode(this));
        }
        String sDKReferenceNumber = atd.json.ChallengeResultCancelled.getSDKReferenceNumber(strAuthenticationRequestParameters);
        s.j(sDKReferenceNumber, "");
        int i12 = getSDKEphemeralPublicKey + 7;
        getAdditionalDetails = i12 % 128;
        if (i12 % 2 != 0) {
            return sDKReferenceNumber;
        }
        throw null;
    }

    public final String getSDKAppID() throws Throwable {
        AssetManager assets;
        Object obj;
        int i11 = getAdditionalDetails + 91;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            assets = this.getSDKReferenceNumber.getAssets();
            byte b11 = ChallengeResultCancelled[14];
            byte b12 = b11;
            Object[] objArr = new Object[1];
            a(b11, b12, (byte) (b12 | 101), objArr);
            obj = objArr[0];
        } else {
            assets = this.getSDKReferenceNumber.getAssets();
            byte b13 = ChallengeResultCancelled[10];
            byte b14 = b13;
            Object[] objArr2 = new Object[1];
            a(b13, b14, (byte) (b14 | 23), objArr2);
            obj = objArr2[0];
        }
        try {
            byte b15 = (byte) (getMessageVersion & 26);
            byte[] bArr = ChallengeResultCancelled;
            byte b16 = bArr[10];
            Object[] objArr3 = new Object[1];
            a(b15, b16, b16, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((byte) 39, bArr[33], (byte) 28, objArr4);
            InputStream sDKAppID = getSDKAppID((InputStream) cls.getMethod((String) objArr4[0], String.class).invoke(assets, (String) obj), TextUtils.indexOf("", "") - 1915210141, 10 - TextUtils.getTrimmedLength(""), new byte[]{30, -20, 45, -124, 121, 78, -108, 87, 95, -99, 59, -121, 106, 115, 93, -92});
            s.j(sDKAppID, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sDKAppID, d.UTF_8), PKIFailureInfo.certRevoked);
            try {
                String strF = r.f(bufferedReader);
                b.a(bufferedReader, null);
                getAdditionalDetails = (getSDKEphemeralPublicKey + 107) % 128;
                return strF;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            Throwable cause = th4.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th4;
        }
    }

    static void AuthenticationRequestParameters() {
        getSDKTransactionID = -4201337076207898698L;
        ChallengeResult = 1458778038;
        BuildConfig = (char) 59897;
    }

    private InputStream getSDKAppID(InputStream inputStream, int i11, int i12, byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        ChallengeResult.getSDKReferenceNumber(bArr2, AuthenticationRequestParameters, getSDKAppID);
        atd.az.AuthenticationRequestParameters authenticationRequestParameters = new atd.az.AuthenticationRequestParameters(new atd.az.getSDKTransactionID(inputStream, i12, bArr2, atd.az.getSDKAppID.getSDKAppID(i11)));
        getAdditionalDetails = (getSDKEphemeralPublicKey + 21) % 128;
        return authenticationRequestParameters;
    }
}
