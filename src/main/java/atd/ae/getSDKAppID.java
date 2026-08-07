package atd.ae;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeStatusHandler;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Map;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes3.dex */
final class getSDKAppID extends AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static char getDeviceData;
    private static int getSDKAppID;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        ChallengeResult = 1;
        getDeviceData();
        Gravity.getAbsoluteGravity(0, 0);
        ChallengeResult = (getSDKAppID + 3) % 128;
    }

    getSDKAppID() {
    }

    private static byte[] AuthenticationRequestParameters(byte[] bArr) throws Throwable {
        ChallengeResult = (getSDKAppID + 97) % 128;
        if (bArr.length != 64) {
            return bArr;
        }
        int length = bArr.length / 2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length, bArr.length);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArrCopyOfRange)));
        aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArrCopyOfRange2)));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Object[] objArr = new Object[1];
        a("蔦碵要\ued35", (ViewConfiguration.getTouchSlop() >> 8) + 3, objArr);
        try {
            ASN1OutputStream.create(byteArrayOutputStream, ((String) objArr[0]).intern()).writeObject((ASN1Primitive) new DERSequence(aSN1EncodableVector));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ChallengeResult = (getSDKAppID + 73) % 128;
            return byteArray;
        } catch (IOException e11) {
            Object[] objArr2 = new Object[1];
            a("줋ᎆ䬷\uf671", 3 - KeyEvent.getDeadChar(0, 0), objArr2);
            throw new SignatureException(((String) objArr2[0]).intern(), e11);
        }
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            charArray = str.toCharArray();
            $10 = ($11 + 21) % 128;
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr2 = new char[cArr.length];
        int i12 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i13 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i14 = challengeStatusHandler.getSDKReferenceNumber;
            if (i14 >= cArr.length) {
                String str2 = new String(cArr2, 0, i11);
                $11 = ($10 + 77) % 128;
                objArr[0] = str2;
                return;
            }
            cArr3[i12] = cArr[i14];
            int i15 = 1;
            cArr3[1] = cArr[i14 + 1];
            int i16 = 58224;
            int i17 = i12;
            while (i17 < 16) {
                $10 = ($11 + 33) % 128;
                char c11 = cArr3[i15];
                char c12 = cArr3[i12];
                int i18 = i13;
                int i19 = i12;
                int i21 = (c12 + i16) ^ ((c12 << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                int i22 = c12 >>> 5;
                int i23 = i15;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getDeviceData);
                    objArr2[i18] = Integer.valueOf(i22);
                    objArr2[i23] = Integer.valueOf(i21);
                    objArr2[i19] = Integer.valueOf(c11);
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method == null) {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + 1746, (char) (16682 - View.MeasureSpec.getSize(i19)), 29 - KeyEvent.keyCodeFromString(""));
                        byte b11 = (byte) ($$b & 5);
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[i23];
                        b(b11, b12, b12, objArr3);
                        method = cls2.getMethod((String) objArr3[i19], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c13 = cArr3[i19];
                    int i24 = (cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                    int i25 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr4[i18] = Integer.valueOf(i25);
                    objArr4[1] = Integer.valueOf(i24);
                    objArr4[i19] = Integer.valueOf(c13);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(View.resolveSize(i19, i19) + 1745, (char) (Color.green(i19) + 16682), 29 - TextUtils.indexOf("", ""));
                        byte b13 = (byte) ($$b & 5);
                        byte b14 = (byte) (b13 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i16 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i17++;
                    i13 = i18;
                    cArr = cArr;
                    cArr3 = cArr3;
                    i12 = 0;
                    i15 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr;
            int i26 = i13;
            char[] cArr5 = cArr3;
            int i27 = challengeStatusHandler.getSDKReferenceNumber;
            cArr2[i27] = cArr5[0];
            cArr2[i27 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i26];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1596 - View.MeasureSpec.getSize(0), (char) (27824 - TextUtils.getCapsMode("", 0, 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25);
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr7 = new Object[1];
                b(b15, b16, b16, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = i26;
            cArr = cArr4;
            cArr3 = cArr5;
            i12 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = atd.ae.getSDKAppID.$$a
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r6 = r6 * 4
            int r6 = 116 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r5 = r2
            goto L2e
        L17:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r6 = r6 + 1
            r3 = r0[r6]
        L2e:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ae.getSDKAppID.b(short, short, int, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getSDKReferenceNumber = (char) 60682;
        AuthenticationRequestParameters = (char) 3573;
        getSDKTransactionID = (char) 9038;
        getDeviceData = (char) 46997;
    }

    static void init$0() {
        $$a = new byte[]{63, -110, -75, -71};
        $$b = EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE;
    }

    @Override // atd.ac.getSDKAppID
    public final String getSDKAppID() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 3;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("유\udfd6뒊\udc5e欆\ud875", 2 >> (Process.myTid() << 117), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("유\udfd6뒊\udc5e欆\ud875", (Process.myTid() >> 22) + 5, objArr2);
            obj = objArr2[0];
        }
        String strIntern = ((String) obj).intern();
        ChallengeResult = (getSDKAppID + 1) % 128;
        return strIntern;
    }

    @Override // atd.ae.AuthenticationRequestParameters
    public final boolean getSDKReferenceNumber(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws Throwable {
        boolean zVerify;
        int i11 = getSDKAppID + 9;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            Signature sDKReferenceNumber = getSDKReferenceNumber();
            sDKReferenceNumber.initVerify(publicKey);
            sDKReferenceNumber.update(bArr2);
            zVerify = sDKReferenceNumber.verify(AuthenticationRequestParameters(bArr));
            int i12 = 84 / 0;
        } else {
            Signature sDKReferenceNumber2 = getSDKReferenceNumber();
            sDKReferenceNumber2.initVerify(publicKey);
            sDKReferenceNumber2.update(bArr2);
            zVerify = sDKReferenceNumber2.verify(AuthenticationRequestParameters(bArr));
        }
        int i13 = getSDKAppID + 47;
        ChallengeResult = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 80 / 0;
        }
        return zVerify;
    }

    private static Signature getSDKReferenceNumber() throws Throwable {
        Object obj;
        int i11 = getSDKAppID + 117;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("ꖾ䀴棘ራᔖ\uf426၊쭺↰딄\uedcc텟\u2e7b夆藐ጠ", 109 - View.MeasureSpec.getMode(0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("ꖾ䀴棘ራᔖ\uf426၊쭺↰딄\uedcc텟\u2e7b夆藐ጠ", View.MeasureSpec.getMode(0) + 15, objArr2);
            obj = objArr2[0];
        }
        return Signature.getInstance(((String) obj).intern());
    }
}
