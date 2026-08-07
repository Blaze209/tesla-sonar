package atd.at;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultCompleted;
import atd.az.getTransactionStatus;
import atd.e.ChallengeResult;
import com.adyen.threeds2.R;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKTransactionID extends AuthenticationRequestParameters<ChallengeResult, atd.ax.getDeviceData> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    static final Charset getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int[] getSDKTransactionID;
    private final WebView AuthenticationRequestParameters;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKAppID = 1;
        getDeviceData();
        TextUtils.getCapsMode("", 0, 0);
        ViewConfiguration.getScrollDefaultDelay();
        KeyEvent.normalizeMetaState(0);
        TextUtils.lastIndexOf("", '0', 0, 0);
        TextUtils.indexOf((CharSequence) "", '0');
        getDeviceData = atd.a.AuthenticationRequestParameters.AuthenticationRequestParameters;
        getSDKReferenceNumber = (getSDKAppID + 107) % 128;
    }

    public getSDKTransactionID(Context context) {
        this(context, null);
    }

    private static void a(int[] iArr, int i11, Object[] objArr) throws Throwable {
        char[] cArr;
        Object method;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr2 = new char[4];
        int i12 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = getSDKTransactionID;
        Class cls = Integer.TYPE;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i13 = 0;
            while (i13 < length) {
                int i14 = $11 + 41;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i13])};
                        Map map = getMessageVersion.timedout;
                        Object obj = map.get(2050190164);
                        if (obj != null) {
                            method = obj;
                        } else {
                            Class cls2 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1862, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 21 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                            byte b11 = (byte) (-1);
                            byte b12 = (byte) (b11 + 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, (byte) (b12 + 3), objArr3);
                            method = cls2.getMethod((String) objArr3[0], cls);
                            map.put(2050190164, method);
                        }
                        iArr3[i13] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                        i13 /= 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    int i15 = i13;
                    cArr2 = cArr2;
                    iArr3 = iArr3;
                    Object[] objArr4 = {Integer.valueOf(iArr2[i15])};
                    Map map2 = getMessageVersion.timedout;
                    Object method2 = map2.get(2050190164);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(View.resolveSize(0, 0) + 1862, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20);
                        byte b13 = (byte) (-1);
                        byte b14 = (byte) (b13 + 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, (byte) (b14 + 3), objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2050190164, method2);
                    }
                    iArr3[i15] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    i13 = i15 + 1;
                }
                cArr2 = cArr2;
                iArr3 = iArr3;
            }
            iArr2 = iArr3;
        }
        char[] cArr4 = cArr2;
        int i16 = 16;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getSDKTransactionID;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i17 = 0;
            while (i17 < length3) {
                int i18 = $10 + 69;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    Object[] objArr6 = {Integer.valueOf(iArr5[i17])};
                    Map map3 = getMessageVersion.timedout;
                    Object method3 = map3.get(2050190164);
                    if (method3 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 1862, (char) (ViewConfiguration.getScrollBarSize() >> 8), Process.getGidForName("") + 22);
                        byte b15 = (byte) (-1);
                        byte b16 = (byte) (b15 + 1);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 + 3), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], cls);
                        map3.put(2050190164, method3);
                    }
                    iArr6[i17] = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    i17--;
                } else {
                    cArr3 = cArr3;
                    iArr5 = iArr5;
                    length3 = length3;
                    iArr6 = iArr6;
                    int i19 = i17;
                    Object[] objArr8 = {Integer.valueOf(iArr5[i19])};
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(2050190164);
                    if (method4 == null) {
                        Class cls5 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 1862, (char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 20);
                        byte b17 = (byte) (-1);
                        byte b18 = (byte) (b17 + 1);
                        Object[] objArr9 = new Object[1];
                        b(b17, b18, (byte) (b18 + 3), objArr9);
                        method4 = cls5.getMethod((String) objArr9[0], cls);
                        map4.put(2050190164, method4);
                    }
                    iArr6[i19] = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                    i17 = i19 + 1;
                }
                iArr5 = iArr5;
                iArr6 = iArr6;
                length3 = length3;
                cArr3 = cArr3;
            }
            cArr = cArr3;
            $10 = ($11 + 41) % 128;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        $11 = ($10 + 21) % 128;
        while (true) {
            int i21 = challengeResultCompleted.getDeviceData;
            if (i21 >= iArr.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            $11 = ($10 + 77) % 128;
            int i22 = iArr[i21];
            char c11 = (char) (i22 >> 16);
            cArr4[0] = c11;
            char c12 = (char) i22;
            cArr4[1] = c12;
            char c13 = (char) (iArr[i21 + 1] >> 16);
            cArr4[i12] = c13;
            char c14 = (char) iArr[i21 + 1];
            char c15 = 3;
            cArr4[3] = c14;
            challengeResultCompleted.getSDKAppID = (c11 << 16) + c12;
            challengeResultCompleted.getSDKReferenceNumber = (c13 << 16) + c14;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i23 = 0;
            while (i23 < i16) {
                int i24 = challengeResultCompleted.getSDKAppID ^ iArr4[i23];
                challengeResultCompleted.getSDKAppID = i24;
                int sDKAppID = ChallengeResultCompleted.getSDKAppID(i24);
                Object[] objArr10 = new Object[4];
                objArr10[c15] = challengeResultCompleted;
                objArr10[i12] = challengeResultCompleted;
                objArr10[1] = Integer.valueOf(sDKAppID);
                objArr10[0] = challengeResultCompleted;
                Map map5 = getMessageVersion.timedout;
                Object method5 = map5.get(929629307);
                if (method5 == null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID(1298 - TextUtils.lastIndexOf("", '0', 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), TextUtils.indexOf((CharSequence) "", '0') + 34);
                    byte b19 = (byte) (-1);
                    byte b21 = (byte) (b19 + 1);
                    Object[] objArr11 = new Object[1];
                    b(b19, b21, b21, objArr11);
                    method5 = cls6.getMethod((String) objArr11[0], Object.class, cls, Object.class, Object.class);
                    map5.put(929629307, method5);
                }
                int iIntValue = ((Integer) ((Method) method5).invoke(null, objArr10)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i23++;
                c15 = c15;
                i16 = 16;
            }
            char c16 = c15;
            int i25 = challengeResultCompleted.getSDKAppID;
            int i26 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i26;
            challengeResultCompleted.getSDKReferenceNumber = i25;
            int i27 = i25 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i27;
            int i28 = i26 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i28;
            cArr4[0] = (char) (i28 >>> 16);
            cArr4[1] = (char) i28;
            cArr4[i12] = (char) (i27 >>> 16);
            cArr4[c16] = (char) i27;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i29 = challengeResultCompleted.getDeviceData;
            cArr[i29 * 2] = cArr4[0];
            cArr[(i29 * 2) + 1] = cArr4[1];
            cArr[(i29 * 2) + 2] = cArr4[i12];
            cArr[(i29 * 2) + 3] = cArr4[c16];
            Object[] objArr12 = new Object[i12];
            objArr12[1] = challengeResultCompleted;
            objArr12[0] = challengeResultCompleted;
            Map map6 = getMessageVersion.timedout;
            Object method6 = map6.get(1109131256);
            if (method6 != null) {
                i16 = 16;
            } else {
                i16 = 16;
                Class cls7 = (Class) getMessageVersion.getSDKTransactionID(2060 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (ViewConfiguration.getScrollBarSize() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 16);
                byte b22 = (byte) (-1);
                byte b23 = (byte) (b22 + 1);
                Object[] objArr13 = new Object[1];
                b(b22, b23, (byte) (b23 + 1), objArr13);
                method6 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map6.put(1109131256, method6);
            }
            ((Method) method6).invoke(null, objArr12);
            i12 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 120 - r8
            int r6 = r6 + 4
            byte[] r0 = atd.at.getSDKTransactionID.$$a
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r3
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.at.getSDKTransactionID.b(byte, int, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{95, 124, -34, 103};
        $$b = 175;
    }

    public final void AuthenticationRequestParameters(ChallengeResult challengeResult) throws Throwable {
        getSDKAppID = (getSDKReferenceNumber + 117) % 128;
        getSDKTransactionID(challengeResult.AuthenticationRequestParameters());
        int i11 = getSDKAppID + 77;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public final void getDeviceData(ChallengeResult challengeResult) throws Throwable {
        int i11 = getSDKReferenceNumber + 79;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKTransactionID(challengeResult.getSDKReferenceNumber());
        } else {
            getSDKTransactionID(challengeResult.getSDKReferenceNumber());
            throw null;
        }
    }

    @Override // atd.at.AuthenticationRequestParameters
    protected final int getSDKTransactionID() {
        int i11 = getSDKAppID;
        int i12 = R.layout.a3ds2_view_challenge_html_container;
        getSDKReferenceNumber = (i11 + 107) % 128;
        return i12;
    }

    public getSDKTransactionID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void getSDKTransactionID(String str) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getSDKReferenceNumber = (getSDKAppID + 37) % 128;
        String sDKReferenceNumber = ((atd.json.getDeviceData) atd.json.getDeviceData.getSDKTransactionID(new Object[0], 76032564, -76032563, (int) System.currentTimeMillis())).getSDKReferenceNumber(str);
        WebView webView = this.AuthenticationRequestParameters;
        Object[] objArr = new Object[1];
        a(new int[]{953731473, -175916982, -1773149328, 1604799294, -1877809594, 169516578, -368565740, 582980421, -84356654, 216348536, 1855230180, 1886230712}, KeyEvent.normalizeMetaState(0) + 24, objArr);
        webView.loadDataWithBaseURL("", sDKReferenceNumber, ((String) objArr[0]).intern(), getDeviceData.toString(), null);
        getSDKReferenceNumber = (getSDKAppID + 63) % 128;
    }

    public getSDKTransactionID(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        WebView webView = (WebView) findViewById(R.id.webView_htmlChallengeContainer);
        this.AuthenticationRequestParameters = webView;
        webView.getSettings().setJavaScriptEnabled(false);
        webView.setWebViewClient(new getDeviceData());
    }

    static void getDeviceData() {
        getSDKTransactionID = new int[]{-1932836880, -816259855, -937613290, -198860910, -153673782, -1122200952, -1274641915, -1619526423, 1466869989, 1801214204, 695000042, -2056606881, -2040198414, 1939666196, 1015045393, -907767477, -1411464425, -479276156};
    }

    final class getDeviceData extends WebViewClient {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int getDeviceData;
        private static int getSDKAppID;
        private static long getSDKReferenceNumber;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKAppID = 0;
            getDeviceData = 1;
            getSDKReferenceNumber = -2057689239617920713L;
        }

        getDeviceData() {
        }

        /* JADX WARN: Code duplicated, block: B:44:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:45:0x01b1  */
        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            char c11;
            Throwable cause;
            int i12;
            Object method;
            if (str != null) {
                $11 = ($10 + 119) % 128;
                charArray = str.toCharArray();
                $10 = ($11 + 113) % 128;
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            getTransactionStatus gettransactionstatus = new getTransactionStatus();
            gettransactionstatus.getSDKAppID = i11;
            int length = cArr.length;
            long[] jArr = new long[length];
            int i13 = 0;
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i14 = gettransactionstatus.getSDKTransactionID;
                if (i14 >= cArr.length) {
                    break;
                }
                char c12 = cArr[i14];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = gettransactionstatus;
                    objArr2[1] = gettransactionstatus;
                    objArr2[i13] = Integer.valueOf(c12);
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(962978490);
                    if (obj != null) {
                        method = obj;
                        i12 = i13;
                    } else {
                        Class cls = (Class) getMessageVersion.getSDKTransactionID(688 - TextUtils.lastIndexOf("", '0', i13), (char) (16022 - Drawable.resolveOpacity(i13, i13)), 32 - (ViewConfiguration.getScrollBarSize() >> 8));
                        byte b11 = (byte) i13;
                        byte b12 = b11;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                        map.put(962978490, method);
                    }
                    jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKReferenceNumber ^ (-2227742522694838850L));
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = gettransactionstatus;
                    objArr4[i12] = gettransactionstatus;
                    Object method2 = map.get(-46730980);
                    if (method2 == null) {
                        int i15 = i12;
                        method2 = ((Class) getMessageVersion.getSDKTransactionID(465 - AndroidCharacter.getMirror('0'), (char) (29016 - ExpandableListView.getPackedPositionChild(0L)), (ExpandableListView.getPackedPositionForChild(i15, i15) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == 0L ? 0 : -1)) + 25)).getMethod("A", Object.class, Object.class);
                        map.put(-46730980, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    jArr = jArr;
                    i13 = 0;
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
            char c13 = '0';
            char[] cArr2 = new char[length];
            gettransactionstatus.getSDKTransactionID = 0;
            while (true) {
                int i16 = gettransactionstatus.getSDKTransactionID;
                if (i16 >= cArr.length) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                int i17 = $11 + 89;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr2[i16] = (char) jArr2[i16];
                    Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                    Map map2 = getMessageVersion.timedout;
                    Object method3 = map2.get(-46730980);
                    if (method3 == null) {
                        method3 = ((Class) getMessageVersion.getSDKTransactionID(416 - Process.getGidForName(""), (char) (29017 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.getOffsetBefore("", 0) + 24)).getMethod("A", Object.class, Object.class);
                        map2.put(-46730980, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                    throw null;
                }
                cArr2[i16] = (char) jArr2[i16];
                Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
                Map map3 = getMessageVersion.timedout;
                Object method4 = map3.get(-46730980);
                if (method4 != null) {
                    c11 = c13;
                } else {
                    c11 = c13;
                    method4 = ((Class) getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 418, (char) (TextUtils.lastIndexOf("", c11, 0, 0) + 29018), ImageFormat.getBitsPerPixel(0) + 25)).getMethod("A", Object.class, Object.class);
                    map3.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                c13 = c11;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.at.getSDKTransactionID.getDeviceData.$$a
                int r8 = r8 * 3
                int r8 = r8 + 1
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r6 = r6 * 3
                int r6 = r6 + 118
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L18
                r6 = r8
                r3 = r0
                r4 = r2
                r0 = r7
                goto L2f
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r3 = r3 + 1
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                r4 = r0[r7]
                r5 = r0
                r0 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2f:
                int r6 = r6 + r7
                int r7 = r0 + 1
                r0 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.at.getSDKTransactionID.getDeviceData.b(byte, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
        
            if ((r8 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
        
            r2 = new java.lang.Object[1];
            a("\uf4e1㤘漷鵖썮", android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 52710, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0083, code lost:
        
            if (((java.lang.String) r2[0]).intern().equalsIgnoreCase(r8.getScheme()) == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0085, code lost:
        
            r2 = new java.lang.Object[1];
            a("\uf4ec魧⯹먳䫡\ud975", android.os.Process.getGidForName("") + 28548, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
        
            if (((java.lang.String) r2[0]).intern().equalsIgnoreCase(r8.getHost()) == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
        
            r2 = new java.lang.Object[1];
            a("\uf4a6单뮟ϕ標뉞᪖拞줖ᅛ", (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 42943, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
        
            if (((java.lang.String) r2[0]).intern().equalsIgnoreCase(r8.getPath()) == false) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c7, code lost:
        
            r0 = atd.at.getSDKTransactionID.getDeviceData.getSDKAppID + 79;
            atd.at.getSDKTransactionID.getDeviceData.getDeviceData = r0 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00d1, code lost:
        
            if ((r0 % 2) == 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00d9, code lost:
        
            if (r7.AuthenticationRequestParameters.getSDKReferenceNumber() == null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
        
            r7.AuthenticationRequestParameters.getSDKReferenceNumber().getSDKAppID(r8.getQuery());
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
        
            return dj_("");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ef, code lost:
        
            r7.AuthenticationRequestParameters.getSDKReferenceNumber();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00f4, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
        
            r0 = new java.lang.StringBuilder();
            r1 = new java.lang.Object[1];
            a("\uf4da䯭諭짚ࣜ侒軫춡\u0ca9䎞节솂c䝧虿씌Ѭ孠騆\ud97fᠦ彎鸚\udd06ᷤ岺鏹틏ᇉ傖鞢횰ᖅ咍ꮈ\uea6d⥡栿꼡\uee71ⵣ氆ꍽ\ue270", 48906 - android.widget.ExpandableListView.getPackedPositionChild(0), r1);
            r0.append(((java.lang.String) r1[0]).intern());
            r0.append(r8.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0125, code lost:
        
            return dj_(r0.toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0031, code lost:
        
            if (((java.lang.String) r1[0]).intern().equals(r8.getScheme()) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0050, code lost:
        
            if (((java.lang.String) r0[0]).intern().equals(r8.getScheme()) != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0052, code lost:
        
            r8 = atd.at.getSDKTransactionID.getDeviceData.getDeviceData + 25;
            atd.at.getSDKTransactionID.getDeviceData.getSDKAppID = r8 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private android.webkit.WebResourceResponse di_(android.net.Uri r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.at.getSDKTransactionID.getDeviceData.di_(android.net.Uri):android.webkit.WebResourceResponse");
        }

        private static WebResourceResponse dj_(String str) throws Throwable {
            Object[] objArr = new Object[1];
            a("\uf4fdꡑ䶋\ue2ca虒㭐\ud893総ᄍ똗毋ࣵ갽䅱\ue6ad鯩㼼\udc70燾\u16fb쨹潮ಚꁊ", Color.rgb(0, 0, 0) + 16800957, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Charset charset = getSDKTransactionID.getDeviceData;
            WebResourceResponse webResourceResponse = new WebResourceResponse(strIntern, charset.toString(), new ByteArrayInputStream(str.getBytes(charset)));
            int i11 = getDeviceData + 81;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                return webResourceResponse;
            }
            throw null;
        }

        static void init$0() {
            $$a = new byte[]{30, 69, 82, 95};
            $$b = 58;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) throws Throwable {
            int i11 = getDeviceData + 115;
            getSDKAppID = i11 % 128;
            try {
                if (i11 % 2 == 0) {
                    return di_(Uri.parse(str));
                }
                int i12 = 23 / 0;
                return di_(Uri.parse(str));
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr = new Object[1];
                a("\uf4ca\udc5dꖊ軔嘁㼎\u0085\ue9fb넥騺掷㓡᰿\ue585컖陜罌䂐⧃\uf152\uda1f", 10427 - ExpandableListView.getPackedPositionGroup(0L), objArr);
                sb2.append(((String) objArr[0]).intern());
                sb2.append(str);
                return dj_(sb2.toString());
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) throws Throwable {
            int i11 = getSDKAppID + 1;
            getDeviceData = i11 % 128;
            if (i11 % 2 == 0) {
                di_(webResourceRequest.getUrl());
                throw null;
            }
            WebResourceResponse webResourceResponseDi_ = di_(webResourceRequest.getUrl());
            int i12 = getDeviceData + 7;
            getSDKAppID = i12 % 128;
            if (i12 % 2 == 0) {
                return webResourceResponseDi_;
            }
            throw null;
        }
    }
}
