package atd.ap;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getMessageVersion;
import com.adyen.threeds2.Warning;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/UnsupportedOsWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKEphemeralPublicKey implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    public static final getSDKEphemeralPublicKey getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        AuthenticationRequestParameters();
        getSDKTransactionID = new getSDKEphemeralPublicKey();
        getSDKAppID = (getSDKReferenceNumber + 55) % 128;
    }

    private getSDKEphemeralPublicKey() {
    }

    static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = 1029304959;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:41:0x01aa  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        int i14;
        Throwable cause;
        int i15;
        int i16 = $11 + 19;
        $10 = i16 % 128;
        int i17 = 2;
        if (i16 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr = new char[i12];
        int i18 = 0;
        getmessageversion.getDeviceData = 0;
        while (true) {
            int i19 = getmessageversion.getDeviceData;
            if (i19 >= i12) {
                break;
            }
            char c11 = charArray[i19];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr[i19] = c12;
            try {
                Object[] objArr2 = new Object[i17];
                objArr2[1] = Integer.valueOf(AuthenticationRequestParameters);
                objArr2[i18] = Integer.valueOf(c12);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(139968170);
                if (method != null) {
                    i15 = i18;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(1186 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 46 - KeyEvent.getDeadChar(i18, i18));
                    byte b11 = (byte) i18;
                    byte b12 = b11;
                    i15 = i18;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    String str2 = (String) objArr3[i15];
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(139968170, method);
                }
                cArr[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[1] = getmessageversion;
                objArr4[i15] = getmessageversion;
                Object method2 = map.get(-1388326022);
                if (method2 == null) {
                    int i21 = i15;
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1721, (char) (TextUtils.getOffsetAfter("", i21) + 48634), Color.rgb(i21, i21, i21) + 16777240);
                    byte b13 = (byte) ($$b & 3);
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                charArray = charArray;
                i17 = 2;
                i18 = 0;
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
            int i22 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, 0, cArr, i12 - i22, i22);
            int i23 = getmessageversion.getSDKReferenceNumber;
            System.arraycopy(cArr2, i23, cArr, 0, i12 - i23);
        } else {
            i14 = 0;
        }
        if (z11) {
            $10 = ($11 + 71) % 128;
            char[] cArr3 = new char[i12];
            getmessageversion.getDeviceData = i14;
            while (true) {
                int i24 = getmessageversion.getDeviceData;
                if (i24 >= i12) {
                    break;
                }
                $10 = ($11 + 109) % 128;
                cArr3[i24] = cArr[(i12 - i24) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1721 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 48635), ((byte) KeyEvent.getModifierMetaStateMask()) + 25);
                    byte b15 = (byte) ($$b & 3);
                    byte b16 = (byte) (b15 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            $11 = ($10 + 73) % 128;
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.ap.getSDKEphemeralPublicKey.$$a
            int r8 = r8 * 4
            int r1 = r8 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 2
            int r6 = 68 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r7
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ap.getSDKEphemeralPublicKey.b(int, short, short, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{62, 104, -85, -6};
        $$b = EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getID() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 41;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a(123 - TextUtils.getOffsetBefore("", 0), true, View.MeasureSpec.makeMeasureSpec(0, 0) + 3, "\u0014\u0010\ufff2￭", 3 % (ViewConfiguration.getMinimumFlingVelocity() / 92), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(89 - TextUtils.getOffsetBefore("", 0), true, View.MeasureSpec.makeMeasureSpec(0, 0) + 4, "\u0014\u0010\ufff2￭", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        getSDKReferenceNumber = (getSDKAppID + 65) % 128;
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getMessage() throws Throwable {
        Object obj;
        int i11 = getSDKReferenceNumber + 99;
        getSDKAppID = i11 % 128;
        int i12 = i11 % 2;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (i12 != 0) {
            Object[] objArr = new Object[1];
            a(92 >> (jUptimeMillis > 1L ? 1 : (jUptimeMillis == 1L ? 0 : -1)), true, 65 >>> (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1)), "ￆ\u001c\u000b\u0018\u0019\u000f\u0015\u0014ￆ\u000f\u0019ￆ\u0014\u0015\u001aￆ\u0019\u001b\u0016\u0016\u0015\u0018\u001a\u000b\nￔ\ufffa\u000e\u000bￆ\ufff5\ufff9ￆ\u0015\u0018ￆ\u001a\u000e\u000bￆ\ufff5\ufff9", 51 / TextUtils.indexOf("", "", 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a(113 - (jUptimeMillis > 0L ? 1 : (jUptimeMillis == 0L ? 0 : -1)), false, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, "ￆ\u001c\u000b\u0018\u0019\u000f\u0015\u0014ￆ\u000f\u0019ￆ\u0014\u0015\u001aￆ\u0019\u001b\u0016\u0016\u0015\u0018\u001a\u000b\nￔ\ufffa\u000e\u000bￆ\ufff5\ufff9ￆ\u0015\u0018ￆ\u001a\u000e\u000bￆ\ufff5\ufff9", TextUtils.indexOf("", "", 0) + 26, objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.adyen.threeds2.Warning
    public final Warning.Severity getSeverity() {
        getSDKAppID = (getSDKReferenceNumber + 11) % 128;
        Warning.Severity severity = Warning.Severity.HIGH;
        getSDKAppID = (getSDKReferenceNumber + 93) % 128;
        return severity;
    }
}
