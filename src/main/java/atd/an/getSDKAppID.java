package atd.an;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.getTransactionStatus;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.PSSSignatureSpi;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKAppID extends Provider {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final String AuthenticationRequestParameters;
    private static int getDeviceData;
    public static final getSDKAppID getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKReferenceNumber = 1;
        getSDKReferenceNumber();
        Color.alpha(0);
        getSDKAppID = new getSDKAppID();
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        a("邳⮟\ue699ꆌ粸㟿\uf297趨䣙ϖ\udeda駸哪\ueffeꪬ攥‐ﬄ똦焰ఢ윪艆崝ᡜ팶湾", 47881 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr);
        AuthenticationRequestParameters = String.format(locale, ((String) objArr[0]).intern(), Double.valueOf(1.0d));
        int i11 = getDeviceData + 47;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 53 / 0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private getSDKAppID() throws Throwable {
        Object[] objArr = new Object[1];
        a("邳쯽☽", Color.green(0) + 23371, objArr);
        super(((String) objArr[0]).intern(), 1.0d, AuthenticationRequestParameters);
        Object[] objArr2 = new Object[1];
        a("邡徬\u0efbﴹ걏鲕䯍㨁\ue92f\ud833袇矧☧ᔋ업듽揵刼Ř\uf18fꃬ漢帉ബﶊ곾鬷", 53047 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
        put(((String) objArr2[0]).intern(), PSSSignatureSpi.SHA256withRSA.class.getName());
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0155  */
    /* JADX WARN: Code duplicated, block: B:36:0x0156  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= charArray.length) {
                break;
            }
            $11 = ($10 + 13) % 128;
            char c11 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(962978490);
                if (method != null) {
                    i12 = i13;
                } else {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 689, (char) (Process.getGidForName("") + 16023), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 32);
                    byte b11 = (byte) i13;
                    byte b12 = b11;
                    i12 = i13;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, (byte) (b12 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (getSDKTransactionID ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i15 = i12;
                    method2 = ((Class) atd.a.getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionType(0L) + 417, (char) (29017 - Color.argb(i15, i15, i15, i15)), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("A", Object.class, Object.class);
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
        char[] cArr = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i16] = (char) jArr2[i16];
            Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(-46730980);
            if (method3 == null) {
                method3 = ((Class) atd.a.getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 417, (char) (29017 - (ViewConfiguration.getTouchSlop() >> 8)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24)).getMethod("A", Object.class, Object.class);
                map2.put(-46730980, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            $10 = ($11 + 87) % 128;
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
    private static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 3
            int r6 = 118 - r6
            byte[] r0 = atd.an.getSDKAppID.$$a
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r6 = r7
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2f
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r6 = r6 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.getSDKAppID.b(byte, int, short, java.lang.Object[]):void");
    }

    static void getSDKReferenceNumber() {
        getSDKTransactionID = 5700391763067094348L;
    }

    static void init$0() {
        $$a = new byte[]{39, -117, 45, 21};
        $$b = 45;
    }
}
