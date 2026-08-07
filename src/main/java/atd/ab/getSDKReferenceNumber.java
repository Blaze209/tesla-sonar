package atd.ab;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getMessageVersion;
import com.adyen.threeds2.ErrorMessage;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKReferenceNumber implements ErrorMessage {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static int getSDKTransactionID;
    private final String AuthenticationRequestParameters;
    private final String getDeviceData;
    private final String getSDKAppID;
    private final String getSDKReferenceNumber;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResultCancelled = 1;
        getSDKTransactionID = 1029305026;
    }

    public getSDKReferenceNumber(String str, String str2, String str3, String str4) {
        this.AuthenticationRequestParameters = str;
        this.getDeviceData = str2;
        this.getSDKReferenceNumber = str3;
        this.getSDKAppID = str4;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x018e  */
    /* JADX WARN: Code duplicated, block: B:41:0x018f  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        int i14;
        Throwable cause;
        int i15;
        char[] charArray = str != null ? str.toCharArray() : str;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr = new char[i12];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            $10 = ($11 + 71) % 128;
            char c11 = charArray[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr[i17] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(getSDKTransactionID);
                objArr2[i16] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(139968170);
                if (method != null) {
                    i15 = i16;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(i16, i16) + 1186, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 45 - ExpandableListView.getPackedPositionChild(0L));
                    byte b11 = (byte) i16;
                    byte b12 = (byte) (b11 + 1);
                    i15 = i16;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (-b12), objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1721, (char) (48634 - KeyEvent.keyCodeFromString("")), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int i18 = i15;
                    byte b13 = (byte) i18;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, (byte) (b14 - 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[i18], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                $10 = ($11 + 105) % 128;
                charArray = charArray;
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
            char[] cArr2 = new char[i12];
            i14 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i19 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, 0, cArr, i12 - i19, i19);
            int i21 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, i21, cArr, 0, i12 - i21);
        } else {
            i14 = 0;
        }
        if (z11) {
            char[] cArr3 = new char[i12];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i22 = getmessageversion.getDeviceData;
                if (i22 >= i12) {
                    break;
                }
                cArr3[i22] = cArr[(i12 - i22) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (48635 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getPressedStateDuration() >> 16) + 24);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            $11 = ($10 + 39) % 128;
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
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
    private static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 66
            int r6 = r6 * 4
            int r6 = 1 - r6
            int r8 = r8 + 4
            byte[] r0 = atd.ab.getSDKReferenceNumber.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.getSDKReferenceNumber.b(int, byte, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = i11 + 73;
        BuildConfig = i12 % 128;
        int i13 = i12 % 2;
        String str = getsdkreferencenumber.getDeviceData;
        if (i13 != 0) {
            throw null;
        }
        BuildConfig = (i11 + 39) % 128;
        return str;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        return getSDKAppID(objArr);
    }

    static void init$0() {
        $$a = new byte[]{75, 126, 55, 101};
        $$b = 193;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public final String getErrorCode() {
        return (String) getSDKTransactionID(new Object[]{this}, 1873438763, -1873438763, System.identityHashCode(this));
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public final String getErrorDescription() {
        int i11 = ChallengeResultCancelled;
        String str = this.getSDKReferenceNumber;
        BuildConfig = (i11 + 107) % 128;
        return str;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public final String getErrorDetails() {
        int i11 = BuildConfig + 113;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getSDKAppID;
        }
        int i12 = 77 / 0;
        return this.getSDKAppID;
    }

    @Override // com.adyen.threeds2.ErrorMessage
    public final String getTransactionID() {
        int i11 = BuildConfig + 35;
        int i12 = i11 % 128;
        ChallengeResultCancelled = i12;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.AuthenticationRequestParameters;
        BuildConfig = (i12 + 103) % 128;
        return str;
    }

    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a(260 - Color.green(0), true, 16 - (ViewConfiguration.getLongPressTimeout() >> 16), "\n\b\u001a\u0015\b\u0019\u001bﾱￇ￡￫\ufff0\u0015\u0016\u0010\u001b", 7 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(getTransactionID());
        Object[] objArr2 = new Object[1];
        a(257 - View.MeasureSpec.getSize(0), false, 12 - (ViewConfiguration.getTouchSlop() >> 8), "\u001c￭\u0019\u000e\u000f￤ￊﾴ\u000f\u001c\u001c\u0019", TextUtils.indexOf("", "") + 7, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append((String) getSDKTransactionID(new Object[]{this}, 1873438763, -1873438763, System.identityHashCode(this)));
        Object[] objArr3 = new Object[1];
        a(267 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, 19 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u0006ﾫ\uffc1ￛ\u000f\u0010\n\u0015\u0011\n\u0013\u0004\u0014\u0006￥\u0013\u0010\u0013\u0013", 2 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(getErrorDescription());
        Object[] objArr4 = new Object[1];
        a((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + EnumC4419g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, true, KeyEvent.normalizeMetaState(0) + 15, "￠\u0019\u0012\u000f\u0007\u001a\u000b￪\u0018\u0015\u0018\u0018\u000bﾰￆ", '>' - AndroidCharacter.getMirror('0'), objArr4);
        sb2.append(((String) objArr4[0]).intern());
        sb2.append(getErrorDetails());
        String string = sb2.toString();
        BuildConfig = (ChallengeResultCancelled + 15) % 128;
        return string;
    }
}
