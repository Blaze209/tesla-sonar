package atd.b;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.ChallengeStatusReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters extends getDeviceData {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char[] getDeviceData;
    private static int getSDKAppID;
    private static boolean getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        BuildConfig = 1;
        getDeviceData();
        ExpandableListView.getPackedPositionGroup(0L);
        int i11 = getSDKTransactionID + 53;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthenticationRequestParameters() throws Throwable {
        Object[] objArr = new Object[1];
        a(null, null, 175 - AndroidCharacter.getMirror('0'), "\u0082\u0081", objArr);
        super(((String) objArr[0]).intern());
    }

    private static void a(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        int length;
        char[] cArr;
        int i14;
        Object method;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            $11 = ($10 + 75) % 128;
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr2 = getDeviceData;
        Class cls = Integer.TYPE;
        int i15 = 2;
        int i16 = 0;
        if (cArr2 != null) {
            int i17 = $10 + 35;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i18])};
                    int i19 = i15;
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj != null) {
                        method = obj;
                        i14 = i16;
                    } else {
                        i14 = i16;
                        method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(View.resolveSize(i16, i16) + EnumC4419g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, (char) Color.green(i14), (Process.myPid() >> 22) + 32)).getMethod("o", cls);
                        map.put(508097192, method);
                    }
                    cArr[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    $10 = ($11 + 59) % 128;
                    i15 = i19;
                    i16 = i14;
                    cArr2 = cArr2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        int i21 = i15;
        int i22 = i16;
        Object[] objArr3 = {Integer.valueOf(getSDKAppID)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0') + 2062, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 18 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            byte b11 = (byte) i22;
            byte b12 = b11;
            Object[] objArr4 = new Object[1];
            b(b11, b12, b12, objArr4);
            method2 = cls2.getMethod((String) objArr4[i22], cls);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (AuthenticationRequestParameters) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr3 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i23 = challengeStatusReceiver.getDeviceData;
                int i24 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i23 >= i24) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                int i25 = $10 + 43;
                $11 = i25 % 128;
                if (i25 % 2 == 0) {
                    cArr3[i23] = (char) (cArr2[bArr[i24 >> i23] - i11] << iIntValue);
                    Object[] objArr5 = new Object[i21];
                    objArr5[1] = challengeStatusReceiver;
                    objArr5[0] = challengeStatusReceiver;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(-249860496);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1109 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)), (char) View.resolveSizeAndState(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + 50);
                        byte b13 = (byte) 0;
                        byte b14 = b13;
                        Object[] objArr6 = new Object[1];
                        b(b13, b14, (byte) (b14 + 1), objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                        map3.put(-249860496, method3);
                    }
                    ((Method) method3).invoke(null, objArr5);
                } else {
                    cArr3[i23] = (char) (cArr2[bArr[(i24 - 1) - i23] + i11] - iIntValue);
                    Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map4 = atd.a.getMessageVersion.timedout;
                    Object method4 = map4.get(-249860496);
                    if (method4 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - View.resolveSizeAndState(0, 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 50 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr8 = new Object[1];
                        b(b15, b16, (byte) (b16 + 1), objArr8);
                        method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                        map4.put(-249860496, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                }
                i21 = 2;
            }
        } else {
            int i26 = 0;
            if (getSDKReferenceNumber) {
                int length3 = charArray.length;
                challengeStatusReceiver.getSDKReferenceNumber = length3;
                char[] cArr4 = new char[length3];
                challengeStatusReceiver.getDeviceData = 0;
                while (true) {
                    int i27 = challengeStatusReceiver.getDeviceData;
                    int i28 = challengeStatusReceiver.getSDKReferenceNumber;
                    if (i27 >= i28) {
                        objArr[0] = new String(cArr4);
                        return;
                    }
                    cArr4[i27] = (char) (cArr2[charArray[(i28 - 1) - i27] - i11] - iIntValue);
                    Object[] objArr9 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map5 = atd.a.getMessageVersion.timedout;
                    Object method5 = map5.get(-249860496);
                    if (method5 == null) {
                        Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - TextUtils.indexOf("", ""), (char) TextUtils.getOffsetBefore("", 0), 50 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b17 = (byte) 0;
                        byte b18 = b17;
                        Object[] objArr10 = new Object[1];
                        b(b17, b18, (byte) (b18 + 1), objArr10);
                        method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                        map5.put(-249860496, method5);
                    }
                    ((Method) method5).invoke(null, objArr9);
                }
            } else {
                int length4 = iArr.length;
                challengeStatusReceiver.getSDKReferenceNumber = length4;
                char[] cArr5 = new char[length4];
                while (true) {
                    challengeStatusReceiver.getDeviceData = i26;
                    while (true) {
                        i12 = challengeStatusReceiver.getDeviceData;
                        i13 = challengeStatusReceiver.getSDKReferenceNumber;
                        if (i12 >= i13) {
                            objArr[0] = new String(cArr5);
                            return;
                        }
                        int i29 = $11 + 79;
                        $10 = i29 % 128;
                        if (i29 % 2 != 0) {
                            break;
                        }
                        cArr5[i12] = (char) (cArr2[iArr[(i13 - 1) - i12] - i11] - iIntValue);
                        challengeStatusReceiver.getDeviceData = i12 + 1;
                    }
                    cArr5[i12] = (char) (cArr2[iArr[i13 - i12] >>> i11] - iIntValue);
                    i26 = 0;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r0 = atd.b.AuthenticationRequestParameters.$$d
            int r9 = r9 * 2
            int r9 = r9 + 107
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r5 = r2
            r0 = r9
            r9 = r8
            goto L31
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L31:
            int r8 = -r8
            int r8 = r8 + r0
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.AuthenticationRequestParameters.b(short, byte, int, java.lang.Object[]):void");
    }

    private static boolean getDeviceData(String str) throws Throwable {
        BuildConfig = (getSDKTransactionID + 19) % 128;
        Object[] objArr = new Object[1];
        a(null, null, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 127, "\u0082\u0081", objArr);
        boolean zEquals = ((String) objArr[0]).intern().equals(str);
        int i11 = BuildConfig + 113;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 96 / 0;
        }
        return zEquals;
    }

    static void init$0() {
        $$d = new byte[]{83, 108, 55, -47};
        $$e = 90;
    }

    @Override // atd.b.getSDKReferenceNumber
    final /* synthetic */ boolean getSDKReferenceNumber(String str) throws Throwable {
        int i11 = BuildConfig + 103;
        getSDKTransactionID = i11 % 128;
        String str2 = str;
        if (i11 % 2 == 0) {
            return getDeviceData(str2);
        }
        getDeviceData(str2);
        throw null;
    }

    static void getDeviceData() {
        getDeviceData = new char[]{64811, 64808};
        getSDKAppID = -185467557;
        getSDKReferenceNumber = true;
        AuthenticationRequestParameters = true;
    }
}
