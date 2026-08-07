package atd.ao;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.a.getMessageVersion;
import atd.az.ChallengeResultTimeout;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "", "", "sdkTransactionId", "serverTransactionId", "acsTransactionId", "acsReferenceNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "()Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "Ljn0/h0;", "destroy", "()V", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "_sdkTransactionId", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "getSdkTransactionId", "()Ljava/lang/String;", "_serverTransactionId", "getServerTransactionId", "_acsTransactionId", "getAcsTransactionId", "_acsReferenceNumber", "getAcsReferenceNumber", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResultCancelled;
    private static char getMessageVersion;
    private static int getSDKEphemeralPublicKey;
    private final atd.json.AuthenticationRequestParameters getDeviceData;
    private final atd.json.AuthenticationRequestParameters getSDKAppID;
    private final atd.json.AuthenticationRequestParameters getSDKReferenceNumber;
    private final atd.json.AuthenticationRequestParameters getSDKTransactionID;

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        ChallengeResultCancelled = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters = -1480222262962110588L;
        getSDKEphemeralPublicKey = 1458778038;
        getMessageVersion = (char) 12214;
    }

    public /* synthetic */ AuthenticationRequestParameters(byte b11) {
        this(null, null, null, null);
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * EnumC4419g.SDK_ASSET_ICON_SUBMIT_VALUE) + (i12 * (-219));
        int i15 = ~((~i11) | (~i12));
        int i16 = ~i13;
        int i17 = i14 + ((i15 | (~(i16 | i11 | i12))) * EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~(i16 | i12)) | i11) * (-440)) + ((i11 | i12 | i13) * EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
        if (i17 == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        if (i17 == 2) {
            return getSDKReferenceNumber(objArr);
        }
        if (i17 == 3) {
            return getSDKTransactionID(objArr);
        }
        if (i17 != 4) {
            return i17 != 5 ? getDeviceData(objArr) : ChallengeResultCancelled(objArr);
        }
        return getSDKAppID(objArr);
    }

    private static /* synthetic */ Object ChallengeResultCancelled(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        AuthenticationRequestParameters authenticationRequestParameters2 = new AuthenticationRequestParameters((String) AuthenticationRequestParameters(new Object[]{authenticationRequestParameters}, 414390748, -414390748, System.identityHashCode(authenticationRequestParameters)), (String) AuthenticationRequestParameters(new Object[]{authenticationRequestParameters}, -118387588, 118387590, System.identityHashCode(authenticationRequestParameters)), (String) AuthenticationRequestParameters(new Object[]{authenticationRequestParameters}, -785917785, 785917789, System.identityHashCode(authenticationRequestParameters)), (String) AuthenticationRequestParameters(new Object[]{authenticationRequestParameters}, 1631534470, -1631534467, System.identityHashCode(authenticationRequestParameters)));
        int i11 = ChallengeResultCancelled;
        int i12 = ((i11 ^ 3) | (i11 & 3)) << 1;
        int i13 = -(((~i11) & 3) | (i11 & (-4)));
        int i14 = (i12 & i13) + (i13 | i12);
        BuildConfig = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 71 / 0;
        }
        return authenticationRequestParameters2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r6 = r6 * 4
            int r6 = 106 - r6
            byte[] r0 = atd.ao.AuthenticationRequestParameters.$$g
            int r7 = r7 * 4
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r7
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L30:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ao.AuthenticationRequestParameters.a(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = atd.ao.AuthenticationRequestParameters.$$a
            int r6 = r6 * 18
            int r6 = 21 - r6
            int r7 = r7 * 8
            int r1 = r7 + 11
            int r8 = r8 * 37
            int r8 = 103 - r8
            byte[] r1 = new byte[r1]
            int r7 = r7 + 10
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r0
            r4 = r2
            r0 = r6
            goto L34
        L19:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2e:
            r3 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r5
        L34:
            int r6 = r6 + r8
            int r6 = r6 + 7
            r8 = r0
            r0 = r3
            r3 = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ao.AuthenticationRequestParameters.b(byte, int, int, java.lang.Object[]):void");
    }

    private static void c(int i11, String str, String str2, char c11, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        Object method;
        Integer num = -2032575242;
        Integer num2 = 262890898;
        $11 = ($10 + 75) % 128;
        char[] charArray2 = str3 != null ? str3.toCharArray() : str3;
        int i12 = 2;
        if (str2 != null) {
            int i13 = $10 + 125;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            charArray = str2.toCharArray();
        } else {
            charArray = str2;
        }
        char[] cArr = charArray;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        ChallengeResultTimeout challengeResultTimeout = new ChallengeResultTimeout();
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int length2 = charArray3.length;
        char[] cArr3 = new char[length2];
        int i14 = 0;
        System.arraycopy(cArr, 0, cArr2, 0, length);
        System.arraycopy(charArray3, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c11);
        cArr3[2] = (char) (cArr3[2] + ((char) i11));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        challengeResultTimeout.getSDKTransactionID = 0;
        $10 = ($11 + 1) % 128;
        while (challengeResultTimeout.getSDKTransactionID < length3) {
            $11 = ($10 + 67) % 128;
            try {
                Object[] objArr2 = {challengeResultTimeout};
                Map map = getMessageVersion.timedout;
                Object obj = map.get(num2);
                int i15 = i12;
                int i16 = i14;
                if (obj != null) {
                    method = obj;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(TextUtils.getTrimmedLength("") + 1862, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getFadingEdgeLength() >> 16) + 21);
                    byte b11 = (byte) ($$h & 5);
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr3 = new Object[1];
                    a(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i16], Object.class);
                    map.put(num2, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {challengeResultTimeout};
                Object method2 = map.get(num);
                if (method2 == null) {
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(Color.blue(i16) + EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE, (char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42)).getMethod(IntegerTokenConverter.CONVERTER_KEY, Object.class);
                    map.put(num, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i17 = cArr2[challengeResultTimeout.getSDKTransactionID % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[i15] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[1] = Integer.valueOf(i17);
                objArr5[i16] = challengeResultTimeout;
                Object method3 = map.get(484986213);
                Class cls2 = Integer.TYPE;
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID(Color.green(i16) + 2446, (char) ((-1) - ExpandableListView.getPackedPositionChild(r11)), View.MeasureSpec.getSize(i16) + 18);
                    byte b13 = (byte) i16;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    a(b13, b14, b14, objArr6);
                    method3 = cls3.getMethod((String) objArr6[i16], Object.class, cls2, cls2);
                    map.put(484986213, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i18 = cArr2[iIntValue2] * 32718;
                Object[] objArr7 = new Object[i15];
                objArr7[1] = Integer.valueOf(cArr3[iIntValue]);
                objArr7[0] = Integer.valueOf(i18);
                Object method4 = map.get(-919285918);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID(2969 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 9914), View.resolveSize(0, 0) + 37)).getMethod("g", cls2, cls2);
                    map.put(-919285918, method4);
                }
                cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = challengeResultTimeout.getDeviceData;
                cArr2[iIntValue2] = c12;
                int i19 = challengeResultTimeout.getSDKTransactionID;
                cArr4[i19] = (char) (((((long) (c12 ^ charArray2[i19])) ^ (AuthenticationRequestParameters ^ (-4201337076207898698L))) ^ ((long) ((int) (((long) getSDKEphemeralPublicKey) ^ (-4201337076207898698L))))) ^ ((long) ((char) (((long) getMessageVersion) ^ (-4201337076207898698L)))));
                challengeResultTimeout.getSDKTransactionID = i19 + 1;
                i12 = i15;
                length3 = length3;
                charArray2 = charArray2;
                cArr3 = cArr3;
                num = num;
                num2 = num2;
                i14 = 0;
                cArr2 = cArr2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = 61 - r9
            int r8 = r8 * 6
            int r8 = 103 - r8
            byte[] r0 = atd.ao.AuthenticationRequestParameters.$$d
            int r7 = r7 * 2
            int r7 = r7 + 19
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r3 = r0
            r5 = r2
            r0 = r9
            goto L30
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            int r9 = r9 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L30:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-3)
            r9 = r0
            r0 = r3
            r3 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ao.AuthenticationRequestParameters.d(byte, byte, short, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = ChallengeResultCancelled + 97;
        int i12 = i11 % 128;
        BuildConfig = i12;
        int i13 = i11 % 2;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters2 = authenticationRequestParameters.getSDKReferenceNumber;
        if (i13 == 0) {
            throw null;
        }
        if (authenticationRequestParameters2 == null) {
            ChallengeResultCancelled = ((i12 ^ 41) + ((i12 & 41) << 1)) % 128;
            return null;
        }
        int i14 = ((i12 | 11) << 1) - (((~i12) & 11) | (i12 & (-12)));
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 == 0) {
            return (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters2));
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = ((i11 ^ 118) + ((i11 & 118) << 1)) - 1;
        int i13 = i12 % 128;
        BuildConfig = i13;
        int i14 = i12 % 2;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters2 = authenticationRequestParameters.getSDKTransactionID;
        if (i14 == 0) {
            throw null;
        }
        if (authenticationRequestParameters2 == null) {
            int i15 = ((i13 ^ 49) | (i13 & 49)) << 1;
            int i16 = -((i13 & (-50)) | ((~i13) & 49));
            ChallengeResultCancelled = ((i15 ^ i16) + ((i15 & i16) << 1)) % 128;
            return null;
        }
        int i17 = i11 ^ 33;
        int i18 = (((i11 & 33) | i17) << 1) - i17;
        BuildConfig = i18 % 128;
        if (i18 % 2 != 0) {
            return (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters2));
        }
        int i19 = 99 / 0;
        return (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters2));
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = (i11 ^ 95) + ((i11 & 95) << 1);
        int i13 = i12 % 128;
        BuildConfig = i13;
        if (i12 % 2 == 0) {
            atd.json.AuthenticationRequestParameters authenticationRequestParameters2 = authenticationRequestParameters.getSDKAppID;
            throw null;
        }
        atd.json.AuthenticationRequestParameters authenticationRequestParameters3 = authenticationRequestParameters.getSDKAppID;
        if (authenticationRequestParameters3 == null) {
            int i14 = i13 & 65;
            int i15 = ((i13 ^ 65) | i14) << 1;
            int i16 = -((~i14) & (i13 | 65));
            ChallengeResultCancelled = ((i15 ^ i16) + ((i15 & i16) << 1)) % 128;
            return null;
        }
        int i17 = i11 & 89;
        int i18 = ((i11 ^ 89) | i17) << 1;
        int i19 = -((i11 | 89) & (~i17));
        BuildConfig = (((i18 | i19) << 1) - (i19 ^ i18)) % 128;
        String str = (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters3}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters3));
        int iIdentityHashCode = System.identityHashCode(authenticationRequestParameters);
        int i21 = ~iIdentityHashCode;
        int i22 = ~((1259127225 & i21) | ((-1259127226) & iIdentityHashCode) | (1259127225 & iIdentityHashCode));
        int i23 = ((~i22) & (-750060428)) | (750060427 & i22);
        int i24 = i22 & (-750060428);
        int i25 = -(-(((i24 & i23) | (i23 ^ i24)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE));
        int i26 = (((-43696700) | i25) << 1) - (i25 ^ (-43696700));
        int i27 = (((i26 ^ 346224440) | (i26 & 346224440)) << 1) - ((346224440 & (~i26)) | ((-346224441) & i26));
        int i28 = (iIdentityHashCode | i21) & (~iIdentityHashCode);
        int i29 = 1259127225 ^ i28;
        int i31 = i28 & 1259127225;
        int i32 = (i31 & i29) | (i29 ^ i31);
        int i33 = (i32 | (~i32)) & (~i32);
        int i34 = (i33 & 1124646960) | (i33 ^ 1124646960);
        int i35 = i34 ^ (-1874707388);
        int i36 = i34 & (-1874707388);
        int i37 = ((i36 & i35) | (i35 ^ i36)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE;
        int i38 = i27 & i37;
        int i39 = -(-((i37 ^ i27) | i38));
        int i41 = ((i38 | i39) << 1) - (i39 ^ i38);
        int iIdentityHashCode2 = System.identityHashCode(authenticationRequestParameters);
        int i42 = ~iIdentityHashCode2;
        int i43 = (-1134973004) ^ i42;
        int i44 = i42 & (-1134973004);
        int i45 = (i44 & i43) | (i43 ^ i44);
        int i46 = (~((i45 & (-1931816285)) | (1931816284 & i45) | ((~i45) & (-1931816285)))) * (-783);
        int i47 = (-1171211422) & i46;
        int i48 = (i46 ^ (-1171211422)) | i47;
        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
        int i51 = ~((~iIdentityHashCode2) | (-1931816285));
        int i52 = -(-(((i51 & (-1134973004)) | ((-1134973004) ^ i51)) * 783));
        int i53 = i49 & i52;
        int i54 = (i52 | i49) & (~i53);
        int i55 = -(-(i53 << 1));
        if (i41 > ((i54 | i55) << 1) - (i54 ^ i55)) {
            return str;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0607  */
    /* JADX WARN: Code duplicated, block: B:40:0x0626  */
    /* JADX WARN: Code duplicated, block: B:41:0x0627 A[Catch: all -> 0x07f1, TryCatch #0 {all -> 0x07f1, blocks: (B:11:0x022b, B:15:0x0273, B:16:0x0279, B:38:0x0610, B:42:0x0653, B:41:0x0627, B:45:0x0663, B:49:0x06a4, B:48:0x067c, B:54:0x0739, B:58:0x077e, B:57:0x0752, B:14:0x0247, B:19:0x02bb, B:23:0x02fe, B:22:0x02d4), top: B:89:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x065b  */
    /* JADX WARN: Code duplicated, block: B:47:0x067b  */
    /* JADX WARN: Code duplicated, block: B:48:0x067c A[Catch: all -> 0x07f1, TryCatch #0 {all -> 0x07f1, blocks: (B:11:0x022b, B:15:0x0273, B:16:0x0279, B:38:0x0610, B:42:0x0653, B:41:0x0627, B:45:0x0663, B:49:0x06a4, B:48:0x067c, B:54:0x0739, B:58:0x077e, B:57:0x0752, B:14:0x0247, B:19:0x02bb, B:23:0x02fe, B:22:0x02d4), top: B:89:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:56:0x0751  */
    /* JADX WARN: Code duplicated, block: B:57:0x0752 A[Catch: all -> 0x07f1, TryCatch #0 {all -> 0x07f1, blocks: (B:11:0x022b, B:15:0x0273, B:16:0x0279, B:38:0x0610, B:42:0x0653, B:41:0x0627, B:45:0x0663, B:49:0x06a4, B:48:0x067c, B:54:0x0739, B:58:0x077e, B:57:0x0752, B:14:0x0247, B:19:0x02bb, B:23:0x02fe, B:22:0x02d4), top: B:89:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x079d  */
    /* JADX WARN: Code duplicated, block: B:64:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x07ee A[RETURN] */
    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) throws Throwable {
        int i11;
        int i12;
        int iIntValue;
        Object[] objArr2;
        char c11;
        char c12;
        int i13;
        int i14;
        Map map;
        Object method;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters;
        int i15;
        int i16;
        Map map2;
        Object method2;
        Map map3;
        Object method3;
        Object objInvoke;
        AuthenticationRequestParameters authenticationRequestParameters2 = (AuthenticationRequestParameters) objArr[0];
        int iIdentityHashCode = System.identityHashCode(authenticationRequestParameters2);
        int i17 = (~iIdentityHashCode) & ((~iIdentityHashCode) | iIdentityHashCode);
        int i18 = ((~i17) & (-420291302)) | (420291301 & i17);
        int i19 = i17 & (-420291302);
        int i21 = (i19 & i18) | (i18 ^ i19);
        int i22 = i21 & 1266354423;
        int i23 = (i21 | 1266354423) & (~i22);
        int i24 = ~((i23 & i22) | (i23 ^ i22));
        int i25 = 1535060727 & iIdentityHashCode;
        int i26 = ((1535060727 | iIdentityHashCode) & (~i25)) | i25;
        int i27 = (i26 | (~i26)) & (~i26);
        int i28 = i24 & i27;
        int i29 = (i24 | i27) & (~i28);
        int i31 = ((i29 & i28) | (i29 ^ i28)) * (-302);
        int i32 = ((-421346656) ^ i31) + ((i31 & (-421346656)) << 1);
        int i33 = -(-((~(((-268706305) & iIdentityHashCode) | ((-268706305) ^ iIdentityHashCode))) * (-604)));
        int i34 = i32 & i33;
        int i35 = ((i33 | i32) & (~i34)) + (i34 << 1);
        int i36 = 1266354423 & iIdentityHashCode;
        int i37 = (iIdentityHashCode | 1266354423) & (~i36);
        int i38 = ~((i37 & i36) | (i37 ^ i36));
        int i39 = 1114769426 & i38;
        int i41 = (i38 | 1114769426) & (~i39);
        int i42 = ((i41 & i39) | (i41 ^ i39)) * EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE;
        int i43 = ((i35 ^ i42) | (i35 & i42)) << 1;
        int i44 = -((i42 & (~i35)) | ((~i42) & i35));
        int i45 = (i43 & i44) + (i44 | i43);
        int iIdentityHashCode2 = System.identityHashCode(authenticationRequestParameters2);
        int i46 = 92703021 & iIdentityHashCode2;
        int i47 = (~i46) & (92703021 | iIdentityHashCode2);
        int i48 = ~iIdentityHashCode2;
        int i49 = (i46 & i47) | (i47 ^ i46);
        int i51 = ((i49 & 845099908) | (i49 ^ 845099908)) * (-676);
        int i52 = ((((~i51) & 1842191280) | ((-1842191281) & i51)) - (~((i51 & 1842191280) << 1))) - 1;
        int i53 = ~((92703021 & i48) | (i48 ^ 92703021));
        int i54 = ((~i53) & (-937409454)) | (937409453 & i53);
        int i55 = i53 & (-937409454);
        int i56 = -(~(((i55 & i54) | (i54 ^ i55)) * 676));
        int i57 = (((i52 | i56) << 1) - (i56 ^ i52)) - 1;
        int i58 = ~iIdentityHashCode2;
        int i59 = 845099908 & i58;
        int i61 = (i58 | 845099908) & (~i59);
        int i62 = ~((i61 & i59) | (i61 ^ i59));
        int i63 = ((~i62) & 92309545) | ((-92309546) & i62);
        int i64 = i62 & 92309545;
        int i65 = (i64 & i63) | (i63 ^ i64);
        int i66 = (iIdentityHashCode2 & (-844706433)) | (i48 & (-844706433)) | (844706432 & iIdentityHashCode2);
        int i67 = (i66 | (~i66)) & (~i66);
        int i68 = ((~i67) & i65) | ((~i65) & i67);
        int i69 = i67 & i65;
        int i71 = ((i69 & i68) | (i68 ^ i69)) * 676;
        if (i45 <= ((i57 & i71) - (~(-(-(i71 | i57))))) - 1) {
            Class cls = (Class) getMessageVersion.getSDKTransactionID(664 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 24 - ImageFormat.getBitsPerPixel(0));
            byte[] bArr = $$a;
            byte b11 = (byte) (-bArr[18]);
            Object[] objArr3 = new Object[1];
            b(b11, b11, bArr[8], objArr3);
            cls.getField((String) objArr3[0]).getLong(null);
            throw null;
        }
        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(664 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 25 - Color.argb(0, 0, 0, 0));
        byte[] bArr2 = $$a;
        byte b12 = (byte) (-bArr2[18]);
        Object[] objArr4 = new Object[1];
        b(b12, b12, bArr2[8], objArr4);
        long j11 = cls2.getField((String) objArr4[0]).getLong(null);
        Class cls3 = Integer.TYPE;
        try {
            try {
                try {
                    if (j11 != -1) {
                        long j12 = j11 + 1974;
                        i11 = 2;
                        Object[] objArr5 = new Object[1];
                        c(Color.green(0), "進長\ueb81⻄", "늣蓾ኚ䤒", (char) (ViewConfiguration.getTouchSlop() >> 8), "炉ﴘ倲塒磐겝ᚽ碀㏐䷏된댙ൊ쯡ʧ꙾쩬\uf7b5꒘젻髁棭", objArr5);
                        Class<?> cls4 = Class.forName((String) objArr5[0]);
                        int jumpTapTimeout = ViewConfiguration.getJumpTapTimeout() >> 16;
                        int i72 = (jumpTapTimeout | (-334538487)) << 1;
                        int i73 = -(jumpTapTimeout ^ (-334538487));
                        int i74 = (i72 & i73) + (i72 | i73);
                        int i75 = -(~(-(-(Process.myPid() >> 22))));
                        char c13 = (char) ((-2) - (((i75 & 29030) + (i75 | 29030)) ^ (-1)));
                        Object[] objArr6 = new Object[1];
                        c(i74, "進長\ueb81⻄", "বཙ曬ࡱ", c13, "礴ᰠ엄\uf695颫\uf796猫\ue11a㌦ៈ틁읟၏羒簛", objArr6);
                        if (j12 >= ((Long) cls4.getDeclaredMethod((String) objArr6[0], null).invoke(null, null)).longValue()) {
                            int i76 = ChallengeResultCancelled + 77;
                            BuildConfig = i76 % 128;
                            if (i76 % 2 == 0) {
                                Class cls5 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 664, (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), Color.alpha(0) + 25);
                                byte b13 = bArr2[8];
                                Object[] objArr7 = new Object[1];
                                b(b13, b13, (byte) (-bArr2[18]), objArr7);
                                Object[] objArr8 = {cls5.getField((String) objArr7[0]).get(null), 425418482, 1};
                                Map map4 = getMessageVersion.timedout;
                                Object method4 = map4.get(1046315470);
                                if (method4 == null) {
                                    method4 = ((Class) getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(0) + NearbyMessagesStatusCodes.DISALLOWED_CALLING_CONTEXT, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 64315), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                    map4.put(1046315470, method4);
                                }
                                objInvoke = ((Method) method4).invoke(null, objArr8);
                            } else {
                                Class cls6 = (Class) getMessageVersion.getSDKTransactionID(664 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 25 - (ViewConfiguration.getTapTimeout() >> 16));
                                byte b14 = bArr2[8];
                                Object[] objArr9 = new Object[1];
                                b(b14, b14, (byte) (-bArr2[18]), objArr9);
                                Object[] objArr10 = {cls6.getField((String) objArr9[0]).get(null), 425418482, 0};
                                Map map5 = getMessageVersion.timedout;
                                Object method5 = map5.get(1046315470);
                                if (method5 == null) {
                                    method5 = ((Class) getMessageVersion.getSDKTransactionID(2801 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (64313 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 28 - TextUtils.indexOf("", ""))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                    map5.put(1046315470, method5);
                                }
                                objInvoke = ((Method) method5).invoke(null, objArr10);
                            }
                            objArr2 = (Object[]) objInvoke;
                            int i77 = ChallengeResultCancelled;
                            BuildConfig = ((i77 & 1) + (i77 | 1)) % 128;
                            c11 = 1;
                            c12 = 0;
                        } else {
                            i12 = 0;
                        }
                        i13 = ((int[]) objArr2[c11])[c12];
                        i14 = ((int[]) objArr2[c12])[c12];
                        if (i14 == i13) {
                            i16 = BuildConfig + 47;
                            ChallengeResultCancelled = i16 % 128;
                            if (i16 % 2 != 0) {
                                Object[] objArr11 = {objArr2, Integer.valueOf(((int[]) objArr2[2])[0]), 0};
                                map3 = getMessageVersion.timedout;
                                method3 = map3.get(1046315470);
                                if (method3 != null) {
                                    method3 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + NearbyMessagesStatusCodes.TOO_MANY_PENDING_INTENTS, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64313), 28 - Color.alpha(0))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                    map3.put(1046315470, method3);
                                }
                                ((Method) method3).invoke(null, objArr11);
                            } else {
                                Object[] objArr12 = {objArr2, Integer.valueOf(((int[]) objArr2[3])[0]), r2};
                                map2 = getMessageVersion.timedout;
                                method2 = map2.get(1046315470);
                                if (method2 != null) {
                                    method2 = ((Class) getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - TextUtils.getCapsMode("", 0, 0)), 28 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                    map2.put(1046315470, method2);
                                }
                                ((Method) method2).invoke(null, objArr12);
                            }
                        } else {
                            new ArrayList().add((String) objArr2[2]);
                            int i78 = i13 & i14;
                            long j13 = ((long) (((i13 ^ i14) | i78) & (~i78))) ^ (-7289146455837638656L);
                            int i79 = BuildConfig;
                            ChallengeResultCancelled = (((i79 ^ 94) + ((i79 & 94) << 1)) - 1) % 128;
                            try {
                                Object[] objArr13 = {Long.valueOf(j13), -1697136645L};
                                byte[] bArr3 = $$d;
                                byte b15 = (byte) (-bArr3[58]);
                                byte b16 = (byte) (-bArr3[17]);
                                Object[] objArr14 = new Object[1];
                                d(b15, b16, (byte) (b16 - 1), objArr14);
                                Class<?> cls7 = Class.forName((String) objArr14[0]);
                                byte b17 = (byte) (bArr3[17] + 1);
                                Object[] objArr15 = new Object[1];
                                d(b17, b17, (byte) (-bArr3[58]), objArr15);
                                String str = (String) objArr15[0];
                                Class cls8 = Long.TYPE;
                                cls7.getMethod(str, cls8, cls8).invoke(null, objArr13);
                                Object[] objArr16 = {objArr2, Integer.valueOf(((int[]) objArr2[3])[0]), r2};
                                map = getMessageVersion.timedout;
                                method = map.get(1046315470);
                                if (method != null) {
                                    method = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 64314), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                    map.put(1046315470, method);
                                }
                                ((Method) method).invoke(null, objArr16);
                                int i81 = BuildConfig;
                                int i82 = i81 & 19;
                                int i83 = -(-((i81 ^ 19) | i82));
                                ChallengeResultCancelled = ((i82 ^ i83) + ((i83 & i82) << 1)) % 128;
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th2;
                            }
                        }
                        authenticationRequestParameters = authenticationRequestParameters2.getDeviceData;
                        if (authenticationRequestParameters != null) {
                            int i84 = BuildConfig;
                            int i85 = i84 & 15;
                            int i86 = (i84 ^ 15) | i85;
                            ChallengeResultCancelled = ((i85 & i86) + (i86 | i85)) % 128;
                            String str2 = (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters));
                            ChallengeResultCancelled = (BuildConfig + 83) % 128;
                            return str2;
                        }
                        int i87 = BuildConfig;
                        i15 = (((i87 ^ 105) | (i87 & 105)) << 1) - (((~i87) & 105) | (i87 & (-106)));
                        ChallengeResultCancelled = i15 % 128;
                        if (i15 % 2 != 0) {
                            return null;
                        }
                        int i88 = 46 / 0;
                        return null;
                    }
                    i11 = 2;
                    i12 = 0;
                    Object[] objArr17 = new Object[1];
                    c(Gravity.getAbsoluteGravity(0, 0), "進長\ueb81⻄", "늣蓾ኚ䤒", (char) KeyEvent.keyCodeFromString(""), "炉ﴘ倲塒磐겝ᚽ碀㏐䷏된댙ൊ쯡ʧ꙾쩬\uf7b5꒘젻髁棭", objArr17);
                    Class<?> cls9 = Class.forName((String) objArr17[0]);
                    int i89 = -(~(-View.MeasureSpec.getMode(0)));
                    int i91 = (-2) - (((i89 & (-334538487)) + (i89 | (-334538487))) ^ (-1));
                    int iIndexOf = TextUtils.indexOf("", "");
                    int iIdentityHashCode3 = System.identityHashCode(authenticationRequestParameters2);
                    int i92 = iIndexOf * (-520);
                    int i93 = i92 & 15153660;
                    int i94 = ((i92 ^ 15153660) | i93) << 1;
                    int i95 = -((i92 | 15153660) & (~i93));
                    int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                    int i97 = ~iIndexOf;
                    int i98 = (i97 ^ 29030) | (i97 & 29030);
                    int i99 = i98 ^ iIdentityHashCode3;
                    int i100 = i98 & iIdentityHashCode3;
                    int i101 = (i100 & i99) | (i99 ^ i100);
                    int i102 = ((i101 | (~i101)) & (~i101)) * 521;
                    int i103 = i96 ^ i102;
                    int i104 = ((((i96 & i102) | i103) << 1) - (~(-i103))) - 1;
                    int i105 = ((-29031) & i97) | (iIndexOf & 29030);
                    int i106 = (-29031) & iIndexOf;
                    int i107 = -(~((~((i106 & i105) | (i105 ^ i106))) * (-1042)));
                    int i108 = ((i104 ^ i107) + ((i104 & i107) << 1)) - 1;
                    int i109 = (i97 & (-29031)) | (iIndexOf & 29030);
                    int i110 = (-29031) & iIndexOf;
                    int i111 = ~((i109 & i110) | (i109 ^ i110));
                    int i112 = (~iIndexOf) | ((iIdentityHashCode3 | (~iIdentityHashCode3)) & (~iIdentityHashCode3));
                    int i113 = (i112 & (-29031)) | ((~i112) & 29030);
                    int i114 = i112 & 29030;
                    int i115 = ~((i114 & i113) | (i113 ^ i114));
                    int i116 = i111 ^ i115;
                    int i117 = i115 & i111;
                    int i118 = -(-(((i117 & i116) | (i116 ^ i117)) * 521));
                    int i119 = i108 & i118;
                    int i120 = (i118 | i108) & (~i119);
                    int i121 = i119 << 1;
                    char c14 = (char) (((i120 | i121) << 1) - (i120 ^ i121));
                    Object[] objArr18 = new Object[1];
                    c(i91, "進長\ueb81⻄", "বཙ曬ࡱ", c14, "礴ᰠ엄\uf695颫\uf796猫\ue11a㌦ៈ틁읟၏羒簛", objArr18);
                    Long lValueOf = Long.valueOf(((Long) cls9.getDeclaredMethod((String) objArr18[0], null).invoke(null, null)).longValue());
                    Class cls10 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 664, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.getOffsetBefore("", 0) + 25);
                    byte b18 = (byte) (-bArr2[18]);
                    c11 = 1;
                    Object[] objArr19 = new Object[1];
                    b(b18, b18, bArr2[8], objArr19);
                    c12 = 0;
                    cls10.getField((String) objArr19[0]).set(null, lValueOf);
                    System.identityHashCode(authenticationRequestParameters2);
                    System.identityHashCode(authenticationRequestParameters2);
                    i13 = ((int[]) objArr2[c11])[c12];
                    i14 = ((int[]) objArr2[c12])[c12];
                    if (i14 == i13) {
                        i16 = BuildConfig + 47;
                        ChallengeResultCancelled = i16 % 128;
                        if (i16 % 2 != 0) {
                            Object[] objArr110 = {objArr2, Integer.valueOf(((int[]) objArr2[2])[0]), 0};
                            map3 = getMessageVersion.timedout;
                            method3 = map3.get(1046315470);
                            if (method3 != null) {
                                method3 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + NearbyMessagesStatusCodes.TOO_MANY_PENDING_INTENTS, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64313), 28 - Color.alpha(0))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                map3.put(1046315470, method3);
                            }
                            ((Method) method3).invoke(null, objArr110);
                        } else {
                            Object[] objArr111 = {objArr2, Integer.valueOf(((int[]) objArr2[3])[0]), r2};
                            map2 = getMessageVersion.timedout;
                            method2 = map2.get(1046315470);
                            if (method2 != null) {
                                method2 = ((Class) getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - TextUtils.getCapsMode("", 0, 0)), 28 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                                map2.put(1046315470, method2);
                            }
                            ((Method) method2).invoke(null, objArr111);
                        }
                    } else {
                        new ArrayList().add((String) objArr2[2]);
                        int i710 = i13 & i14;
                        long j14 = ((long) (((i13 ^ i14) | i710) & (~i710))) ^ (-7289146455837638656L);
                        int i711 = BuildConfig;
                        ChallengeResultCancelled = (((i711 ^ 94) + ((i711 & 94) << 1)) - 1) % 128;
                        Object[] objArr112 = {Long.valueOf(j14), -1697136645L};
                        byte[] bArr4 = $$d;
                        byte b19 = (byte) (-bArr4[58]);
                        byte b110 = (byte) (-bArr4[17]);
                        Object[] objArr113 = new Object[1];
                        d(b19, b110, (byte) (b110 - 1), objArr113);
                        Class<?> cls11 = Class.forName((String) objArr113[0]);
                        byte b111 = (byte) (bArr4[17] + 1);
                        Object[] objArr114 = new Object[1];
                        d(b111, b111, (byte) (-bArr4[58]), objArr114);
                        String str3 = (String) objArr114[0];
                        Class cls12 = Long.TYPE;
                        cls11.getMethod(str3, cls12, cls12).invoke(null, objArr112);
                        Object[] objArr115 = {objArr2, Integer.valueOf(((int[]) objArr2[3])[0]), r2};
                        map = getMessageVersion.timedout;
                        method = map.get(1046315470);
                        if (method != null) {
                            method = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 64314), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls3, cls3);
                            map.put(1046315470, method);
                        }
                        ((Method) method).invoke(null, objArr115);
                        int i810 = BuildConfig;
                        int i811 = i810 & 19;
                        int i812 = -(-((i810 ^ 19) | i811));
                        ChallengeResultCancelled = ((i811 ^ i812) + ((i812 & i811) << 1)) % 128;
                    }
                    authenticationRequestParameters = authenticationRequestParameters2.getDeviceData;
                    if (authenticationRequestParameters != null) {
                        int i813 = BuildConfig;
                        int i814 = i813 & 15;
                        int i815 = (i813 ^ 15) | i814;
                        ChallengeResultCancelled = ((i814 & i815) + (i815 | i814)) % 128;
                        String str4 = (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters}, 680619687, -680619685, System.identityHashCode(authenticationRequestParameters));
                        ChallengeResultCancelled = (BuildConfig + 83) % 128;
                        return str4;
                    }
                    int i816 = BuildConfig;
                    i15 = (((i816 ^ 105) | (i816 & 105)) << 1) - (((~i816) & 105) | (i816 & (-106)));
                    ChallengeResultCancelled = i15 % 128;
                    if (i15 % 2 != 0) {
                        return null;
                    }
                    int i817 = 46 / 0;
                    return null;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
                Object[] objArr20 = new Object[i11];
                objArr20[1] = 425418482;
                objArr20[0] = Integer.valueOf(iIntValue);
                byte[] bArr5 = $$d;
                byte b21 = (byte) (-bArr5[81]);
                byte b22 = (byte) (-bArr5[17]);
                Object[] objArr21 = new Object[1];
                d(b21, b22, (byte) (b22 | 28), objArr21);
                Class<?> cls13 = Class.forName((String) objArr21[0]);
                byte b23 = (byte) (bArr5[17] + 1);
                Object[] objArr22 = new Object[1];
                d(b23, b23, (byte) (-bArr5[58]), objArr22);
                objArr2 = (Object[]) cls13.getMethod((String) objArr22[0], cls3, cls3).invoke(null, objArr20);
                Class cls14 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 663, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 25 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                byte b24 = bArr2[8];
                Object[] objArr23 = new Object[1];
                b(b24, b24, (byte) (-bArr2[18]), objArr23);
                cls14.getField((String) objArr23[0]).set(null, objArr2);
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
            int iBlue = Color.blue(i12);
            int i122 = -(-View.resolveSize(i12, i12));
            Object[] objArr24 = new Object[1];
            c(iBlue, "進長\ueb81⻄", "錮\u0082\uf0a3㝜", (char) ((i122 ^ 23792) + ((i122 & 23792) << 1)), "⦴鋒\uf057鲨\uec2c\ud94d滧볊\uf515渜ᔐ筿楑畞鑃覈", objArr24);
            Class<?> cls15 = Class.forName((String) objArr24[0]);
            int longPressTimeout = ViewConfiguration.getLongPressTimeout() >> 16;
            int i123 = -KeyEvent.keyCodeFromString("");
            int iIdentityHashCode4 = System.identityHashCode(authenticationRequestParameters2);
            int i124 = i123 * (-1965);
            int i125 = i124 & 57223536;
            int i126 = ((i124 ^ 57223536) | i125) << 1;
            int i127 = -((i124 | 57223536) & (~i125));
            int i128 = (i126 & i127) + (i126 | i127);
            int i129 = ~i123;
            int i130 = (58154 & i123) | ((-58155) & i129);
            int i131 = i123 & (-58155);
            int i132 = ((i130 ^ i131) | (i130 & i131)) * 983;
            int i133 = ((i128 ^ i132) | (i128 & i132)) << 1;
            int i134 = -(((~i132) & i128) | (i132 & (~i128)));
            int i135 = (i133 & i134) + (i133 | i134);
            int i136 = ~i123;
            int i137 = ~iIdentityHashCode4;
            int i138 = ((-58155) & (~i137)) | (i137 & 58154);
            int i139 = (-58155) & i137;
            int i140 = ~((i138 ^ i139) | (i138 & i139));
            int i141 = i136 & i140;
            int i142 = -(-((((~i141) & (i140 | i136)) | i141) * (-983)));
            int i143 = ((i135 | i142) << 1) - (i142 ^ i135);
            int i144 = i136 & i137;
            int i145 = (i137 | i136) & (~i144);
            int i146 = ~((i144 & i145) | (i145 ^ i144));
            int i147 = (i123 | i129) & (~i123);
            int i148 = i147 & 58154;
            int i149 = (i147 | 58154) & (~i148);
            int i150 = ~((i149 & i148) | (i149 ^ i148));
            int i151 = i146 & i150;
            int i152 = (i146 | i150) & (~i151);
            int i153 = ((i152 & i151) | (i152 ^ i151)) * 983;
            int i154 = i143 ^ i153;
            int i155 = (i153 & i143) << 1;
            Object[] objArr25 = new Object[1];
            c(longPressTimeout, "進長\ueb81⻄", "卹\udd4b⨣탣", (char) ((i154 & i155) + (i155 | i154)), "쌈蹉≭䆂剂⍤\uea35䕅꾏ꏛ띞콬\ue3f9鼵⃠Ⳳ", objArr25);
            iIntValue = ((Integer) cls15.getMethod((String) objArr25[0], Object.class).invoke(null, authenticationRequestParameters2)).intValue();
            ChallengeResultCancelled = (BuildConfig + 113) % 128;
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }

    static void init$0() {
        $$a = new byte[]{17, -107, -57, -94, -9, 8, -40, -22, 0, 2, 23, -24, 6, -2, -25, -5, 10, -18, -1, -8, -44, -12, 44, -19, -4, -15, -40, 37, -8, -15, -4, -9};
        $$b = 191;
    }

    static void init$1() {
        $$d = new byte[]{91, -6, 53, -91, -22, 13, 51, -65, 59, -24, -40, 4, -14, -3, 4, -12, 4, -1, 15, -36, Tnaf.POW_2_WIDTH, -22, -4, -1, 30, -22, -1, -5, -7, -16, 14, -16, 75, -70, -1, -18, 30, 12, -10, 7, -50, -3, 36, 2, -1, -18, 30, 12, -10, -12, -33, 14, -16, -8, 15, -5, -20, 8, -9, -2, 34, 2, -22, 13, 51, -77, 71, -24, -40, 4, -14, -3, 4, -12, 4, -1, Tnaf.POW_2_WIDTH, -22, -17, -5, 6, -11, 38, -44, 77, -70, -1, -18, 45, -36, -20, 10, 3, -5, 30, -32, -22, Tnaf.POW_2_WIDTH};
        $$e = 27;
    }

    static void init$2() {
        $$g = new byte[]{116, 90, 119, 13};
        $$h = 51;
    }

    public final void BuildConfig() {
        AuthenticationRequestParameters(new Object[]{this}, 208540168, -208540167, System.identityHashCode(this));
    }

    public AuthenticationRequestParameters(String str, String str2, String str3, String str4) {
        this.getSDKReferenceNumber = str != null ? new atd.json.AuthenticationRequestParameters(str) : null;
        this.getSDKAppID = str2 != null ? new atd.json.AuthenticationRequestParameters(str2) : null;
        this.getSDKTransactionID = str3 != null ? new atd.json.AuthenticationRequestParameters(str3) : null;
        this.getDeviceData = str4 != null ? new atd.json.AuthenticationRequestParameters(str4) : null;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        int i11;
        int i12;
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) objArr[0];
        int i13 = ChallengeResultCancelled;
        int i14 = i13 + 60;
        int i15 = ((i14 ^ (-1)) + (i14 << 1)) % 128;
        BuildConfig = i15;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters2 = authenticationRequestParameters.getSDKReferenceNumber;
        if (authenticationRequestParameters2 != null) {
            int i16 = i15 & 63;
            int i17 = i16 + ((i15 ^ 63) | i16);
            ChallengeResultCancelled = i17 % 128;
            if (i17 % 2 != 0) {
                atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters2));
                throw null;
            }
            atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters2}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters2));
        } else {
            BuildConfig = ((((i13 & (-80)) | ((~i13) & 79)) - (~((i13 & 79) << 1))) - 1) % 128;
        }
        atd.json.AuthenticationRequestParameters authenticationRequestParameters3 = authenticationRequestParameters.getSDKAppID;
        if (authenticationRequestParameters3 != null) {
            int i18 = BuildConfig;
            int i19 = (i18 & 29) + (i18 | 29);
            ChallengeResultCancelled = i19 % 128;
            if (i19 % 2 != 0) {
                atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters3}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters3));
                throw null;
            }
            atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters3}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters3));
            int i21 = BuildConfig;
            int i22 = i21 & 31;
            ChallengeResultCancelled = (i22 + ((i21 ^ 31) | i22)) % 128;
        } else {
            int i23 = ChallengeResultCancelled;
            int i24 = i23 & 23;
            BuildConfig = (((i23 | 23) & (~i24)) + (i24 << 1)) % 128;
        }
        atd.json.AuthenticationRequestParameters authenticationRequestParameters4 = authenticationRequestParameters.getSDKTransactionID;
        if (authenticationRequestParameters4 != null) {
            int i25 = ChallengeResultCancelled;
            int i26 = ((i25 ^ 97) | (i25 & 97)) << 1;
            int i27 = -(((~i25) & 97) | (i25 & (-98)));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            BuildConfig = i28 % 128;
            if (i28 % 2 == 0) {
                atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters4}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters4));
                int i29 = 89 / 0;
            } else {
                atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters4}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters4));
            }
            int i31 = ChallengeResultCancelled;
            int i32 = i31 ^ 121;
            int i33 = ((i31 & 121) | i32) << 1;
            int i34 = -i32;
            i11 = (i33 | i34) << 1;
            i12 = i33 ^ i34;
        } else {
            int i35 = ChallengeResultCancelled;
            int i36 = (i35 | 113) << 1;
            int i37 = -(i35 ^ 113);
            i11 = (i36 | i37) << 1;
            i12 = i37 ^ i36;
        }
        BuildConfig = (i11 - i12) % 128;
        atd.json.AuthenticationRequestParameters authenticationRequestParameters5 = authenticationRequestParameters.getDeviceData;
        if (authenticationRequestParameters5 != null) {
            int i38 = ChallengeResultCancelled;
            BuildConfig = (((((i38 ^ 121) | (i38 & 121)) << 1) - (~(-(((~i38) & 121) | (i38 & (-122)))))) - 1) % 128;
            atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParameters5}, -1497589000, 1497589000, System.identityHashCode(authenticationRequestParameters5));
            int i39 = ChallengeResultCancelled;
            BuildConfig = ((i39 ^ 15) + ((i39 & 15) << 1)) % 128;
            return null;
        }
        int i41 = BuildConfig;
        int i42 = i41 & 107;
        int i43 = (i41 | 107) & (~i42);
        int i44 = i42 << 1;
        int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
        ChallengeResultCancelled = i45 % 128;
        if (i45 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public final String getDeviceData() {
        return (String) AuthenticationRequestParameters(new Object[]{this}, -785917785, 785917789, System.identityHashCode(this));
    }

    public final String getSDKAppID() {
        return (String) AuthenticationRequestParameters(new Object[]{this}, 1631534470, -1631534467, System.identityHashCode(this));
    }

    public final AuthenticationRequestParameters getSDKReferenceNumber() {
        return (AuthenticationRequestParameters) AuthenticationRequestParameters(new Object[]{this}, -687165134, 687165139, System.identityHashCode(this));
    }

    public AuthenticationRequestParameters() {
        this((byte) 0);
    }

    public final String AuthenticationRequestParameters() {
        return (String) AuthenticationRequestParameters(new Object[]{this}, -118387588, 118387590, System.identityHashCode(this));
    }

    public final String getSDKTransactionID() {
        return (String) AuthenticationRequestParameters(new Object[]{this}, 414390748, -414390748, System.identityHashCode(this));
    }
}
