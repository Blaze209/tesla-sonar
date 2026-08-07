package atd.ae;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getMessageVersion;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKReferenceNumber extends AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        AuthenticationRequestParameters = 0;
        getSDKTransactionID = 1;
        getDeviceData();
        ViewConfiguration.getTouchSlop();
        TextUtils.getOffsetBefore("", 0);
        Color.red(0);
        TextUtils.getTrimmedLength("");
        ExpandableListView.getPackedPositionType(0L);
        ViewConfiguration.getZoomControlsTimeout();
        int i11 = getSDKTransactionID + 125;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    getSDKReferenceNumber() {
    }

    private static Signature AuthenticationRequestParameters() throws Throwable {
        Object obj;
        int i11 = AuthenticationRequestParameters + 123;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            int jumpTapTimeout = 22255 % (ViewConfiguration.getJumpTapTimeout() >>> 23);
            int capsMode = 21 % TextUtils.getCapsMode("", 1, 0);
            ViewConfiguration.getZoomControlsTimeout();
            Object[] objArr = new Object[1];
            a(jumpTapTimeout, false, capsMode, "\u0004\u0004\u0004\ufff9\ufff2￣￦\uffe7(\u001a%\u0019\u0003\u0004\ufff2￠\u0001", 0, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getJumpTapTimeout() >> 16) + EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, false, 17 - TextUtils.getCapsMode("", 0, 0), "\u0004\u0004\u0004\ufff9\ufff2￣￦\uffe7(\u001a%\u0019\u0003\u0004\ufff2￠\u0001", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, objArr2);
            obj = objArr2[0];
        }
        Signature signature = Signature.getInstance(((String) obj).intern(), atd.an.getSDKAppID.getSDKAppID);
        int i12 = AuthenticationRequestParameters + 13;
        getSDKTransactionID = i12 % 128;
        if (i12 % 2 != 0) {
            return signature;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x019c  */
    /* JADX WARN: Code duplicated, block: B:41:0x019d  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        char[] charArray;
        int i14;
        Throwable cause;
        int i15;
        if (str != null) {
            charArray = str.toCharArray();
            $11 = ($10 + 25) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr2 = new char[i12];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            $10 = ($11 + 21) % 128;
            char c11 = cArr[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr2[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getDeviceData);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(139968170);
                if (method != null) {
                    i15 = i16;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1187 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), 46 - Color.red(i16));
                    byte b11 = (byte) i16;
                    byte b12 = (byte) (b11 + 1);
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 - 1), objArr3);
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
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (48635 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 24 - Color.argb(i18, i18, i18, i18));
                    byte b13 = (byte) i18;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[i18], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
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
            $11 = ($10 + 3) % 128;
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
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - View.getDefaultSize(0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 48635), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                $11 = ($10 + 49) % 128;
            }
            $10 = ($11 + 107) % 128;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = atd.ae.getSDKReferenceNumber.$$a
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r7 = r7 + 66
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L1a
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r8
            goto L32
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2c:
            r3 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r3
            r3 = r5
        L32:
            int r7 = r7 + r8
            r8 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ae.getSDKReferenceNumber.b(byte, byte, int, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getDeviceData = 1029305036;
    }

    static void init$0() {
        $$a = new byte[]{87, -6, 59, -47};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE;
    }

    @Override // atd.ac.getSDKAppID
    public final String getSDKAppID() throws Throwable {
        Object obj;
        int i11 = AuthenticationRequestParameters + 11;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(15816 % TextUtils.lastIndexOf("", '6', 1), false, 4 >> ((byte) KeyEvent.getModifierMetaStateMask()), "\u0013\ufff2\ufff5\ufff6\u0010", TextUtils.indexOf((CharSequence) "", 'r', 0) + 3, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(228 - TextUtils.lastIndexOf("", '0', 0), false, 4 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0013\ufff2\ufff5\ufff6\u0010", TextUtils.indexOf((CharSequence) "", '0', 0) + 5, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        AuthenticationRequestParameters = (getSDKTransactionID + 93) % 128;
        return strIntern;
    }

    @Override // atd.ae.AuthenticationRequestParameters
    public final boolean getSDKReferenceNumber(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws Throwable {
        int i11 = getSDKTransactionID + 51;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            Signature signatureAuthenticationRequestParameters = AuthenticationRequestParameters();
            signatureAuthenticationRequestParameters.initVerify(publicKey);
            signatureAuthenticationRequestParameters.update(bArr2);
            signatureAuthenticationRequestParameters.verify(bArr);
            throw null;
        }
        Signature signatureAuthenticationRequestParameters2 = AuthenticationRequestParameters();
        signatureAuthenticationRequestParameters2.initVerify(publicKey);
        signatureAuthenticationRequestParameters2.update(bArr2);
        boolean zVerify = signatureAuthenticationRequestParameters2.verify(bArr);
        AuthenticationRequestParameters = (getSDKTransactionID + 117) % 128;
        return zVerify;
    }
}
