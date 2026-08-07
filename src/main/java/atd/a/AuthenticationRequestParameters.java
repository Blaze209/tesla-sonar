package atd.a;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final Charset AuthenticationRequestParameters;
    private static long getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        getSDKTransactionID = 1;
        getSDKAppID();
        Object[] objArr = new Object[1];
        a("鹿ꠎ遛㳭洛履硣\ue07d⦄", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        AuthenticationRequestParameters = Charset.forName(((String) objArr[0]).intern());
        getSDKReferenceNumber = (getSDKTransactionID + 57) % 128;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $10 = ($11 + 23) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
        char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(getSDKAppID ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                String str2 = new String(deviceData, 4, deviceData.length - 4);
                $10 = ($11 + 15) % 128;
                objArr[0] = str2;
                return;
            }
            $11 = ($10 + 55) % 128;
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKAppID)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getLongPressTimeout() >> 16) + 2749, (char) (ExpandableListView.getPackedPositionType(0L) + 54838), TextUtils.lastIndexOf("", '0', 0, 0) + 30);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(1401 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (16690 - (KeyEvent.getMaxKeyCode() >> 16)), 22 - View.resolveSize(0, 0));
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, (byte) (b12 + 1), objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r7 = r7 + 4
            byte[] r1 = atd.a.AuthenticationRequestParameters.$$a
            int r6 = r6 * 2
            int r6 = r6 + 101
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2e
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.AuthenticationRequestParameters.b(int, int, byte, java.lang.Object[]):void");
    }

    static void getSDKAppID() {
        getSDKAppID = 1320473263306318994L;
    }

    static void init$0() {
        $$a = new byte[]{100, 5, -101, -34};
        $$b = 166;
    }
}
