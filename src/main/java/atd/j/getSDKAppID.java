package atd.j;

import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"SCHEME_HTTPS", "", "SCHEME_HTTP", "isCompleteUrl", "", ImagesContract.URL, "isWebLink", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static long getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKAppID = 1;
        getDeviceData();
        ViewConfiguration.getLongPressTimeout();
        ViewConfiguration.getScrollBarSize();
        getSDKAppID = (getDeviceData + 115) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r6 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        atd.j.getSDKAppID.getSDKAppID = (atd.j.getSDKAppID.getDeviceData + 29) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r6 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        r6 = android.net.Uri.parse(r6).getScheme();
        r3 = new java.lang.Object[1];
        a("週嵒験䞵遙ꈶ摇뫵氂", android.widget.ExpandableListView.getPackedPositionGroup(0), r3);
        r0 = p013kotlin.jvm.internal.s.f(((java.lang.String) r3[0]).intern(), r6);
        r4 = new java.lang.Object[1];
        a("ㄌ᥎瞺ࣃㅤ\ue62a觮\uf583", android.view.KeyEvent.keyCodeFromString(""), r4);
        r6 = p013kotlin.jvm.internal.s.f(((java.lang.String) r4[0]).intern(), r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean AuthenticationRequestParameters(java.lang.String r6) throws java.lang.Throwable {
        /*
            int r0 = atd.j.getSDKAppID.getSDKAppID
            int r0 = r0 + 43
            int r1 = r0 % 128
            atd.j.getSDKAppID.getDeviceData = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 11
            int r0 = r0 / r1
            if (r6 != 0) goto L16
            goto L15
        L13:
            if (r6 != 0) goto L16
        L15:
            return r1
        L16:
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r6 = r6.getScheme()
            r2 = 0
            int r0 = android.widget.ExpandableListView.getPackedPositionGroup(r2)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "週嵒験䞵遙ꈶ摇뫵氂"
            a(r4, r0, r3)
            r0 = r3[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = p013kotlin.jvm.internal.s.f(r0, r6)
            java.lang.String r3 = ""
            int r3 = android.view.KeyEvent.keyCodeFromString(r3)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "ㄌ᥎瞺ࣃㅤ\ue62a觮\uf583"
            a(r5, r3, r4)
            r3 = r4[r1]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            boolean r6 = p013kotlin.jvm.internal.s.f(r3, r6)
            if (r0 != 0) goto L5f
            if (r6 == 0) goto L56
            goto L5f
        L56:
            int r6 = atd.j.getSDKAppID.getDeviceData
            int r6 = r6 + 29
            int r6 = r6 % 128
            atd.j.getSDKAppID.getSDKAppID = r6
            return r1
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.j.getSDKAppID.AuthenticationRequestParameters(java.lang.String):boolean");
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        int i12 = $11 + 11;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(getSDKTransactionID ^ 4326518537449951405L, charArray, i11);
        int i13 = 4;
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i14 = getadditionaldetails.getDeviceData;
            if (i14 >= deviceData.length) {
                objArr[0] = new String(deviceData, i13, deviceData.length - 4);
                return;
            }
            $10 = ($11 + 61) % 128;
            int i15 = i14 - 4;
            getadditionaldetails.getSDKTransactionID = i15;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i14] ^ deviceData[i14 % 4]), Long.valueOf(i15), Long.valueOf(getSDKTransactionID)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 2749, (char) (54837 - ExpandableListView.getPackedPositionChild(0L)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 30);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 1401, (char) (KeyEvent.keyCodeFromString("") + 16690), (ViewConfiguration.getTapTimeout() >> 16) + 22);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                i13 = i13;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 3
            int r5 = 3 - r5
            int r6 = r6 * 3
            int r6 = 101 - r6
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = atd.j.getSDKAppID.$$a
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r6 = r5
            r3 = r7
            goto L2d
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            int r6 = r6 + 1
            r0[r2] = r3
            if (r2 != r7) goto L2b
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L2b:
            r3 = r1[r6]
        L2d:
            int r5 = r5 + r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.j.getSDKAppID.b(int, int, short, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getSDKTransactionID = -8763940009814577219L;
    }

    public static final boolean getSDKTransactionID(String str) {
        if (str == null) {
            return false;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String host = uri.getHost();
        if (scheme != null && !t.y0(scheme)) {
            int i11 = getSDKAppID + 35;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            if (host != null && !t.y0(host)) {
                getSDKAppID = (getDeviceData + 25) % 128;
                return true;
            }
        }
        return false;
    }

    static void init$0() {
        $$a = new byte[]{79, 66, 87, 20};
        $$b = 56;
    }
}
