package atd.b;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import atd.az.getAdditionalDetails;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResultCancelled extends getSDKTransactionID {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static long getSDKAppID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        AuthenticationRequestParameters = 1;
        getDeviceData();
        Color.red(0);
        int i11 = getDeviceData + 25;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChallengeResultCancelled(List<String> list) throws Throwable {
        Object[] objArr = new Object[1];
        c("뺟뺳貵☔瓚", ViewConfiguration.getKeyRepeatDelay() >> 16, objArr);
        super(TextUtils.join(((String) objArr[0]).intern(), list));
    }

    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $10 = ($11 + 115) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(getSDKAppID ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            $11 = ($10 + 75) % 128;
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(getSDKAppID)};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2749, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 54837), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(AndroidCharacter.getMirror('0') + 1353, (char) (16689 - TextUtils.lastIndexOf("", '0')), 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b11 = (byte) (-1);
                    byte b12 = (byte) (b11 + 1);
                    Object[] objArr4 = new Object[1];
                    d(b11, b12, b12, objArr4);
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

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 4
            int r7 = 101 - r7
            byte[] r0 = atd.b.ChallengeResultCancelled.$$d
            int r8 = r8 * 3
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L18
            r3 = r0
            r4 = r2
            r0 = r7
            r7 = r6
            goto L31
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r8) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r0
            r0 = r5
        L31:
            int r6 = -r6
            int r6 = r6 + r0
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.b.ChallengeResultCancelled.d(byte, byte, byte, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getSDKAppID = -6608813201171604669L;
    }

    static void init$0() {
        $$d = new byte[]{75, 105, -32, -100};
        $$e = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
    }
}
