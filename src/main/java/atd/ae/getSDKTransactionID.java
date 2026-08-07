package atd.ae;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.getAdditionalDetails;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKTransactionID extends AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int getDeviceData;
    private static int getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getDeviceData = 0;
        getSDKTransactionID = 1;
        getSDKReferenceNumber();
        ViewConfiguration.getJumpTapTimeout();
        getSDKTransactionID = (getDeviceData + 45) % 128;
    }

    getSDKTransactionID() {
    }

    private static Signature AuthenticationRequestParameters() throws Throwable {
        getSDKTransactionID = (getDeviceData + 3) % 128;
        Object[] objArr = new Object[1];
        a("ᎀ\ufff2䬉Ꮣ儝풳ᘆ\udf73꤭隃岔ቋ曌\udc45駊嗝㰐⇚왪", ExpandableListView.getPackedPositionType(0L) + 1, objArr);
        Signature signature = Signature.getInstance(((String) objArr[0]).intern());
        getSDKTransactionID = (getDeviceData + 15) % 128;
        return signature;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            $11 = ($10 + 123) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        getAdditionalDetails getadditionaldetails = new getAdditionalDetails();
        char[] deviceData = getAdditionalDetails.getDeviceData(AuthenticationRequestParameters ^ 4326518537449951405L, charArray, i11);
        getadditionaldetails.getDeviceData = 4;
        while (true) {
            int i12 = getadditionaldetails.getDeviceData;
            if (i12 >= deviceData.length) {
                objArr[0] = new String(deviceData, 4, deviceData.length - 4);
                return;
            }
            $11 = ($10 + 27) % 128;
            int i13 = i12 - 4;
            getadditionaldetails.getSDKTransactionID = i13;
            try {
                Object[] objArr2 = {Long.valueOf(deviceData[i12] ^ deviceData[i12 % 4]), Long.valueOf(i13), Long.valueOf(AuthenticationRequestParameters)};
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1024136788);
                if (method == null) {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(0, 0) + 2749, (char) (54838 - View.MeasureSpec.getSize(0)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28);
                    Class cls2 = Long.TYPE;
                    method = cls.getMethod("c", cls2, cls2, cls2);
                    map.put(-1024136788, method);
                }
                deviceData[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getadditionaldetails, getadditionaldetails};
                Object method2 = map.get(-719904898);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 1402, (char) (16690 - Color.red(0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 22);
                    byte b11 = (byte) (-1);
                    byte b12 = (byte) (b11 + 1);
                    Object[] objArr4 = new Object[1];
                    b(b11, b12, b12, objArr4);
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

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = atd.ae.getSDKTransactionID.$$a
            int r7 = r7 * 2
            int r7 = 101 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L28
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ae.getSDKTransactionID.b(byte, byte, byte, java.lang.Object[]):void");
    }

    static void init$0() {
        $$a = new byte[]{68, 46, 5, 3};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
    }

    @Override // atd.ac.getSDKAppID
    public final String getSDKAppID() throws Throwable {
        Object obj;
        int i11 = getDeviceData + 75;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            View.combineMeasuredStates(1, 0);
            Object[] objArr = new Object[1];
            a("ᵙ㸤첎ᴜ郐浕釵暑ꟷ", 0, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("ᵙ㸤첎ᴜ郐浕釵暑ꟷ", 1 - View.combineMeasuredStates(0, 0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // atd.ae.AuthenticationRequestParameters
    public final boolean getSDKReferenceNumber(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws Throwable {
        boolean zVerify;
        int i11 = getDeviceData + 89;
        getSDKTransactionID = i11 % 128;
        if (i11 % 2 == 0) {
            Signature signatureAuthenticationRequestParameters = AuthenticationRequestParameters();
            signatureAuthenticationRequestParameters.initVerify(publicKey);
            signatureAuthenticationRequestParameters.update(bArr2);
            zVerify = signatureAuthenticationRequestParameters.verify(bArr);
            int i12 = 94 / 0;
        } else {
            Signature signatureAuthenticationRequestParameters2 = AuthenticationRequestParameters();
            signatureAuthenticationRequestParameters2.initVerify(publicKey);
            signatureAuthenticationRequestParameters2.update(bArr2);
            zVerify = signatureAuthenticationRequestParameters2.verify(bArr);
        }
        int i13 = getDeviceData + 11;
        getSDKTransactionID = i13 % 128;
        if (i13 % 2 != 0) {
            return zVerify;
        }
        throw null;
    }

    static void getSDKReferenceNumber() {
        AuthenticationRequestParameters = -1049833448747467254L;
    }
}
