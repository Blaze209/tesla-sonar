package atd.aa;

import android.app.Application;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC4419g;
import ezvcard.property.Kind;
import java.lang.reflect.Method;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointFqdnProvider;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/PasspointProvider;", Kind.APPLICATION, "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "get", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTransactionStatus implements ChallengeResultTimeout {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKTransactionID;
    private final Application getSDKAppID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters = -7222153549876657259L;
    }

    public getTransactionStatus(Application application) {
        s.k(application, "");
        this.getSDKAppID = application;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $10 = ($11 + 31) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        atd.az.getAdditionalDetails getadditionaldetails = new atd.az.getAdditionalDetails();
        char[] deviceData = atd.az.getAdditionalDetails.getDeviceData(AuthenticationRequestParameters ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            $10 = ($11 + 113) % 128;
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(AuthenticationRequestParameters)};
                Map map = atd.a.getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(2750 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (54837 - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 29);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 1401, (char) (TextUtils.getTrimmedLength("") + 16690), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-719904898, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                $11 = ($10 + 93) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.aa.getTransactionStatus.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r6 = r6 * 4
            int r6 = 101 - r6
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r0
            r0 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r8 = r8 + 1
            int r6 = r6 + r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.getTransactionStatus.b(byte, int, int, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{77, 3, 102, 118};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE;
    }

    @Override // atd.aa.ChallengeResultTimeout
    public final String getDeviceData() throws Throwable {
        Application application = this.getSDKAppID;
        Object[] objArr = new Object[1];
        a("迩⻱ಟ辞綠ꪉ:炙", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, objArr);
        Object systemService = application.getSystemService(((String) objArr[0]).intern());
        WifiManager wifiManager = systemService instanceof WifiManager ? (WifiManager) systemService : null;
        if (wifiManager != null) {
            int i11 = getSDKTransactionID + 119;
            getDeviceData = i11 % 128;
            if (i11 % 2 != 0) {
                wifiManager.getConnectionInfo();
                throw null;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getPasspointFqdn();
            }
        }
        int i12 = getSDKTransactionID + 103;
        getDeviceData = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 33 / 0;
        }
        return null;
    }
}
