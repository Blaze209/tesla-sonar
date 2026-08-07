package atd.ag;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    public static final AuthenticationRequestParameters getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKReferenceNumber = 1;
        getDeviceData();
        getSDKAppID = new getSDKReferenceNumber();
        getSDKReferenceNumber = (getDeviceData + 15) % 128;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            int i12 = $11 + 53;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
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
            $11 = ($10 + 111) % 128;
            int i15 = i14 - 4;
            getadditionaldetails.getSDKTransactionID = i15;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i14] ^ deviceData[i14 % 4]), Long.valueOf(i15), Long.valueOf(getSDKTransactionID)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 2750, (char) (54838 - View.combineMeasuredStates(0, 0)), 29 - ((Process.getThreadPriority(0) + 20) >> 6));
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(Color.red(0) + 1401, (char) (16690 - TextUtils.indexOf("", "", 0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 22);
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                $10 = ($11 + 103) % 128;
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

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r6 = r6 * 3
            int r6 = r6 + 101
            int r8 = r8 * 3
            int r0 = 1 - r8
            byte[] r1 = atd.ag.getSDKTransactionID.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L30:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.getSDKTransactionID.b(int, byte, short, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getSDKTransactionID = -1134262704250069244L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r4 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r0 = 77 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return atd.ag.getSDKTransactionID.getSDKAppID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return atd.ag.getSDKTransactionID.getSDKAppID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        r2 = new java.lang.Object[1];
        a("妊姟\ueba1摦ꂁ뾠悔츚杞\uaa5b\ue239⏷Ⓐ棲⍞\ue279\ue209⾁撾꒔ꍴ\uee29꘣柽惗곟\ue706♔⸾掀⣥\ue8bb\uef9f∷樆\uab00겊\ue0c1ꮳ橬樫ꜥ", 1 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        throw new java.lang.IllegalArgumentException(((java.lang.String) r2[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (atd.ag.getSDKTransactionID.getSDKAppID.getSDKAppID().equals(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (atd.ag.getSDKTransactionID.getSDKAppID.getSDKAppID().equals(r4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r4 = atd.ag.getSDKTransactionID.getSDKReferenceNumber + 49;
        atd.ag.getSDKTransactionID.getDeviceData = r4 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static atd.ag.AuthenticationRequestParameters getSDKTransactionID(java.lang.String r4) throws java.lang.Throwable {
        /*
            int r0 = atd.ag.getSDKTransactionID.getSDKReferenceNumber
            int r0 = r0 + 29
            int r1 = r0 % 128
            atd.ag.getSDKTransactionID.getDeviceData = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1d
            atd.ag.AuthenticationRequestParameters r0 = atd.ag.getSDKTransactionID.getSDKAppID
            java.lang.String r0 = r0.getSDKAppID()
            boolean r4 = r0.equals(r4)
            r0 = 76
            int r0 = r0 / r1
            if (r4 == 0) goto L3e
            goto L29
        L1d:
            atd.ag.AuthenticationRequestParameters r0 = atd.ag.getSDKTransactionID.getSDKAppID
            java.lang.String r0 = r0.getSDKAppID()
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L3e
        L29:
            int r4 = atd.ag.getSDKTransactionID.getSDKReferenceNumber
            int r4 = r4 + 49
            int r0 = r4 % 128
            atd.ag.getSDKTransactionID.getDeviceData = r0
            int r4 = r4 % 2
            if (r4 == 0) goto L3b
            atd.ag.AuthenticationRequestParameters r4 = atd.ag.getSDKTransactionID.getSDKAppID
            r0 = 77
            int r0 = r0 / r1
            return r4
        L3b:
            atd.ag.AuthenticationRequestParameters r4 = atd.ag.getSDKTransactionID.getSDKAppID
            return r4
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            int r0 = android.os.Process.getThreadPriority(r1)
            int r0 = r0 + 20
            int r0 = r0 >> 6
            r2 = 1
            int r0 = 1 - r0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "妊姟\ueba1摦ꂁ뾠悔츚杞\uaa5b\ue239⏷Ⓐ棲⍞\ue279\ue209⾁撾꒔ꍴ\uee29꘣柽惗곟\ue706♔⸾掀⣥\ue8bb\uef9f∷樆\uab00겊\ue0c1ꮳ橬樫ꜥ"
            a(r3, r0, r2)
            r0 = r2[r1]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ag.getSDKTransactionID.getSDKTransactionID(java.lang.String):atd.ag.AuthenticationRequestParameters");
    }

    static void init$0() {
        $$a = new byte[]{34, -58, -116, -81};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
    }
}
