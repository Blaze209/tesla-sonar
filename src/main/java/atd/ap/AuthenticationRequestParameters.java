package atd.ap;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getMessageVersion;
import com.adyen.threeds2.Warning;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/security/warning/DebuggerAttachedWarning;", "Lcom/adyen/threeds2/Warning;", "<init>", "()V", "getID", "", "getMessage", "getSeverity", "Lcom/adyen/threeds2/Warning$Severity;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters implements Warning {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKAppID;
    public static final AuthenticationRequestParameters getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKAppID = 1;
        getSDKTransactionID();
        getSDKReferenceNumber = new AuthenticationRequestParameters();
        int i11 = getSDKAppID + 41;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private AuthenticationRequestParameters() {
    }

    /* JADX WARN: Code duplicated, block: B:39:0x019a  */
    /* JADX WARN: Code duplicated, block: B:40:0x019b  */
    private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
        int i14;
        Throwable cause;
        int i15;
        char[] charArray = str != null ? str.toCharArray() : str;
        getMessageVersion getmessageversion = new getMessageVersion();
        char[] cArr = new char[i12];
        int i16 = 0;
        getmessageversion.getDeviceData = 0;
        $10 = ($11 + 87) % 128;
        while (true) {
            int i17 = getmessageversion.getDeviceData;
            if (i17 >= i12) {
                break;
            }
            $10 = ($11 + 65) % 128;
            char c11 = charArray[i17];
            getmessageversion.getSDKTransactionID = c11;
            char c12 = (char) (i11 + c11);
            cArr[i17] = c12;
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
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.argb(i16, i16, i16, i16) + 1186, (char) (KeyEvent.getMaxKeyCode() >> 16), ((Process.getThreadPriority(i15) + 20) >> 6) + 46);
                    byte b11 = (byte) 1;
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
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
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1722 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (Color.alpha(i15) + 48634), 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int i18 = i15;
                    byte b13 = (byte) i18;
                    byte b14 = b13;
                    Object[] objArr5 = new Object[1];
                    b(b13, b14, b14, objArr5);
                    method2 = cls3.getMethod((String) objArr5[i18], Object.class, Object.class);
                    map.put(-1388326022, method2);
                }
                ((Method) method2).invoke(null, objArr4);
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
            $11 = ($10 + 21) % 128;
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
                $11 = ($10 + 83) % 128;
                cArr3[i22] = cArr[(i12 - i22) - 1];
                Object[] objArr6 = {getmessageversion, getmessageversion};
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(-1388326022);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 1721, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 48635), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1388326022, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
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
    private static void b(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = atd.ap.AuthenticationRequestParameters.$$a
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r7 = r7 + 66
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r5 = r2
            r0 = r8
            r8 = r9
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2f:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ap.AuthenticationRequestParameters.b(short, short, int, java.lang.Object[]):void");
    }

    static void getSDKTransactionID() {
        AuthenticationRequestParameters = 1029304833;
    }

    static void init$0() {
        $$a = new byte[]{64, 55, -50, 126};
        $$b = 144;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getID() throws Throwable {
        getSDKTransactionID = (getSDKAppID + 41) % 128;
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 172, true, ExpandableListView.getPackedPositionChild(0L) + 5, "\u0014\u0010\ufff1￭", 2 - (Process.myTid() >> 22), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKTransactionID + 73;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Warning
    public final String getMessage() throws Throwable {
        getSDKTransactionID = (getSDKAppID + 111) % 128;
        Object[] objArr = new Object[1];
        a((Process.myPid() >> 22) + 193, true, 34 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "￨ￕ\u0017\u0017￨ￇ\f\u000f\u001bￇ\u0016\u001bￇ\u000b\f\u000f\n\b\u001b\u001b\bￇ\u001a\u0010ￇ\u0019\f\u000e\u000e\u001c\t\f\u000bￇ", 1 - KeyEvent.getDeadChar(0, 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        int i11 = getSDKTransactionID + 103;
        getSDKAppID = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 38 / 0;
        }
        return strIntern;
    }

    @Override // com.adyen.threeds2.Warning
    public final Warning.Severity getSeverity() {
        getSDKAppID = (getSDKTransactionID + 77) % 128;
        Warning.Severity severity = Warning.Severity.MEDIUM;
        getSDKTransactionID = (getSDKAppID + 121) % 128;
        return severity;
    }
}
