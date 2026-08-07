package atd.d;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.az.completed;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class ChallengeResultTimeout extends SSLSocketFactory {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char AuthenticationRequestParameters;
    private static int BuildConfig;
    private static char[] getSDKAppID;
    private static int getSDKReferenceNumber;
    private final String[] getDeviceData;
    private final SSLSocketFactory getSDKTransactionID;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        BuildConfig = 1;
        getSDKAppID = new char[]{52392, 52365, 52463, 52464, 52393, 52370, 52394, 52362, 52460};
        AuthenticationRequestParameters = (char) 63815;
    }

    ChallengeResultTimeout() throws Throwable {
        Object[] objArr = new Object[1];
        a(ExpandableListView.getPackedPositionType(0L) + 3, "\b\u0004㗵", (byte) (44 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), objArr);
        SSLContext sSLContext = SSLContext.getInstance(((String) objArr[0]).intern());
        sSLContext.init(null, null, null);
        this.getSDKTransactionID = sSLContext.getSocketFactory();
        Object[] objArr2 = new Object[1];
        a(Gravity.getAbsoluteGravity(0, 0) + 7, "\b\u0004\u0002\u0001\u0000\u0005㗠", (byte) (KeyEvent.keyCodeFromString("") + 56), objArr2);
        this.getDeviceData = new String[]{((String) objArr2[0]).intern()};
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr, int i11, int i12, int i13) {
        return getSDKAppID(objArr);
    }

    private static void a(int i11, String str, byte b11, Object[] objArr) throws Throwable {
        int i12;
        char c11;
        Object method;
        Class cls;
        Object method2;
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] cArr = getSDKAppID;
        Class cls2 = Integer.TYPE;
        if (cArr != null) {
            $11 = ($10 + 39) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                $10 = ($11 + 55) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(-1709775791);
                    if (obj != null) {
                        method2 = obj;
                        cls = cls2;
                    } else {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2313 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        cls = cls2;
                        Object[] objArr3 = new Object[1];
                        b(b12, b13, b13, objArr3);
                        method2 = cls3.getMethod((String) objArr3[0], cls);
                        map.put(-1709775791, method2);
                    }
                    cArr2[i13] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i13++;
                    $10 = ($11 + 117) % 128;
                    charArray = charArray;
                    cArr = cArr;
                    cls2 = cls;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = charArray;
        Class cls4 = cls2;
        Object[] objArr4 = {Integer.valueOf(AuthenticationRequestParameters)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method3 = map2.get(-1709775791);
        long j11 = 0;
        if (method3 == null) {
            Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2314, (char) ExpandableListView.getPackedPositionGroup(0L), 23 - MotionEvent.axisFromString(""));
            byte b14 = (byte) 0;
            byte b15 = b14;
            Object[] objArr5 = new Object[1];
            b(b14, b15, b15, objArr5);
            method3 = cls5.getMethod((String) objArr5[0], cls4);
            map2.put(-1709775791, method3);
        }
        char cCharValue = ((Character) ((Method) method3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i11];
        if (i11 % 2 != 0) {
            $10 = ($11 + 89) % 128;
            i12 = i11 - 1;
            cArr4[i12] = (char) (cArr3[i12] - b11);
        } else {
            i12 = i11;
        }
        char c12 = 2;
        if (i12 > 1) {
            int i14 = $11 + 45;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                completedVar.getSDKTransactionID = 1;
            } else {
                completedVar.getSDKTransactionID = 0;
            }
            while (true) {
                int i15 = completedVar.getSDKTransactionID;
                if (i15 >= i12) {
                    break;
                }
                char c13 = cArr3[i15];
                completedVar.getSDKAppID = c13;
                char c14 = cArr3[i15 + 1];
                completedVar.getSDKReferenceNumber = c14;
                if (c13 == c14) {
                    cArr4[i15] = (char) (c13 - b11);
                    cArr4[i15 + 1] = (char) (c14 - b11);
                    c11 = c12;
                    j11 = j11;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = completedVar;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = completedVar;
                    objArr6[9] = completedVar;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = completedVar;
                    objArr6[6] = completedVar;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = completedVar;
                    objArr6[3] = completedVar;
                    objArr6[c12] = Integer.valueOf(cCharValue);
                    objArr6[1] = completedVar;
                    objArr6[0] = completedVar;
                    c11 = c12;
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object obj2 = map3.get(700818725);
                    if (obj2 != null) {
                        method = obj2;
                    } else {
                        Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1919, (char) (ViewConfiguration.getScrollBarSize() >> 8), KeyEvent.getDeadChar(0, 0) + 29);
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        Object[] objArr7 = new Object[1];
                        b(b16, b17, (byte) (b17 | 55), objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls7 = Integer.TYPE;
                        method = cls6.getMethod(str2, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class, Object.class, cls7, Object.class);
                        map3.put(700818725, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i16 = completedVar.getSDKEphemeralPublicKey;
                    if (iIntValue == i16) {
                        $11 = ($10 + 91) % 128;
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = completedVar;
                        objArr8[9] = Integer.valueOf(cCharValue);
                        objArr8[8] = completedVar;
                        objArr8[7] = Integer.valueOf(cCharValue);
                        objArr8[6] = Integer.valueOf(cCharValue);
                        objArr8[5] = completedVar;
                        objArr8[4] = completedVar;
                        objArr8[3] = Integer.valueOf(cCharValue);
                        objArr8[c11] = Integer.valueOf(cCharValue);
                        objArr8[1] = completedVar;
                        objArr8[0] = completedVar;
                        Object method4 = map3.get(-248084636);
                        if (method4 == null) {
                            Class cls8 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1722 - (ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1)), (char) (48635 - (ViewConfiguration.getGlobalActionKeyTimeout() > j11 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j11 ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 24);
                            byte b18 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            b(b18, b18, (byte) (-$$a[3]), objArr9);
                            String str3 = (String) objArr9[0];
                            Class cls9 = Integer.TYPE;
                            method4 = cls8.getMethod(str3, Object.class, Object.class, cls9, cls9, Object.class, Object.class, cls9, cls9, Object.class, cls9, Object.class);
                            map3.put(-248084636, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i17 = (completedVar.AuthenticationRequestParameters * cCharValue) + completedVar.getSDKEphemeralPublicKey;
                        int i18 = completedVar.getSDKTransactionID;
                        cArr4[i18] = cArr[iIntValue2];
                        cArr4[i18 + 1] = cArr[i17];
                        $11 = ($10 + 25) % 128;
                    } else {
                        int i19 = completedVar.getDeviceData;
                        int i21 = completedVar.AuthenticationRequestParameters;
                        if (i19 == i21) {
                            int i22 = ((completedVar.getMessageVersion + cCharValue) - 1) % cCharValue;
                            completedVar.getMessageVersion = i22;
                            int i23 = ((i16 + cCharValue) - 1) % cCharValue;
                            completedVar.getSDKEphemeralPublicKey = i23;
                            int i24 = (i21 * cCharValue) + i23;
                            int i25 = completedVar.getSDKTransactionID;
                            cArr4[i25] = cArr[(i19 * cCharValue) + i22];
                            cArr4[i25 + 1] = cArr[i24];
                        } else {
                            int i26 = (i19 * cCharValue) + i16;
                            int i27 = (i21 * cCharValue) + completedVar.getMessageVersion;
                            int i28 = completedVar.getSDKTransactionID;
                            cArr4[i28] = cArr[i26];
                            cArr4[i28 + 1] = cArr[i27];
                        }
                        completedVar.getSDKTransactionID += 2;
                        c12 = c11;
                        j11 = j11;
                    }
                }
                completedVar.getSDKTransactionID += 2;
                c12 = c11;
                j11 = j11;
            }
        }
        for (int i29 = 0; i29 < i11; i29++) {
            cArr4[i29] = (char) (cArr4[i29] ^ 13722);
        }
        String str4 = new String(cArr4);
        int i31 = $11 + 29;
        $10 = i31 % 128;
        if (i31 % 2 == 0) {
            objArr[0] = str4;
        } else {
            int i32 = 2 / 0;
            objArr[0] = str4;
        }
    }

    private static void b(short s11, byte b11, byte b12, Object[] objArr) {
        int i11 = b12 + 67;
        int i12 = 4 - (b11 * 3);
        int i13 = s11 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i13 + 1];
        int i14 = -1;
        if (bArr == null) {
            i11 = i12 + i13;
            i12++;
            bArr = bArr;
            i14 = -1;
        }
        while (true) {
            int i15 = i14 + 1;
            bArr2[i15] = (byte) i11;
            if (i15 == i13) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i16 = i11;
            byte[] bArr3 = bArr;
            i11 = bArr[i12] + i16;
            i12++;
            bArr = bArr3;
            i14 = i15;
        }
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        Socket socketAuthenticationRequestParameters;
        ChallengeResultTimeout challengeResultTimeout = (ChallengeResultTimeout) objArr[0];
        InetAddress inetAddress = (InetAddress) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = getSDKReferenceNumber + 73;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            socketAuthenticationRequestParameters = challengeResultTimeout.AuthenticationRequestParameters(challengeResultTimeout.getSDKTransactionID.createSocket(inetAddress, iIntValue));
            int i12 = 46 / 0;
        } else {
            socketAuthenticationRequestParameters = challengeResultTimeout.AuthenticationRequestParameters(challengeResultTimeout.getSDKTransactionID.createSocket(inetAddress, iIntValue));
        }
        getSDKReferenceNumber = (BuildConfig + 55) % 128;
        return socketAuthenticationRequestParameters;
    }

    static void init$0() {
        $$a = new byte[]{62, 104, -85, -6};
        $$b = 12;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        BuildConfig = (getSDKReferenceNumber + 23) % 128;
        Socket socketAuthenticationRequestParameters = AuthenticationRequestParameters(this.getSDKTransactionID.createSocket());
        int i11 = BuildConfig + 59;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 35 / 0;
        }
        return socketAuthenticationRequestParameters;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        getSDKReferenceNumber = (BuildConfig + 33) % 128;
        String[] defaultCipherSuites = this.getSDKTransactionID.getDefaultCipherSuites();
        int i11 = BuildConfig + 49;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            return defaultCipherSuites;
        }
        throw null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        getSDKReferenceNumber = (BuildConfig + 23) % 128;
        String[] supportedCipherSuites = this.getSDKTransactionID.getSupportedCipherSuites();
        int i11 = BuildConfig + 103;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 17 / 0;
        }
        return supportedCipherSuites;
    }

    private Socket AuthenticationRequestParameters(Socket socket) {
        int i11 = BuildConfig;
        getSDKReferenceNumber = (i11 + 87) % 128;
        if (socket instanceof SSLSocket) {
            int i12 = i11 + 99;
            getSDKReferenceNumber = i12 % 128;
            if (i12 % 2 != 0) {
                ((SSLSocket) socket).setEnabledProtocols(this.getDeviceData);
                int i13 = 80 / 0;
            } else {
                ((SSLSocket) socket).setEnabledProtocols(this.getDeviceData);
            }
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i11, boolean z11) {
        int i12 = BuildConfig + 5;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 == 0) {
            return AuthenticationRequestParameters(this.getSDKTransactionID.createSocket(socket, str, i11, z11));
        }
        AuthenticationRequestParameters(this.getSDKTransactionID.createSocket(socket, str, i11, z11));
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11) {
        BuildConfig = (getSDKReferenceNumber + 63) % 128;
        Socket socketAuthenticationRequestParameters = AuthenticationRequestParameters(this.getSDKTransactionID.createSocket(str, i11));
        BuildConfig = (getSDKReferenceNumber + 45) % 128;
        return socketAuthenticationRequestParameters;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) {
        int i13 = getSDKReferenceNumber + 39;
        BuildConfig = i13 % 128;
        if (i13 % 2 != 0) {
            return AuthenticationRequestParameters(this.getSDKTransactionID.createSocket(str, i11, inetAddress, i12));
        }
        AuthenticationRequestParameters(this.getSDKTransactionID.createSocket(str, i11, inetAddress, i12));
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) {
        BuildConfig = (getSDKReferenceNumber + 49) % 128;
        Socket socketAuthenticationRequestParameters = AuthenticationRequestParameters(this.getSDKTransactionID.createSocket(inetAddress, i11, inetAddress2, i12));
        int i13 = BuildConfig + 11;
        getSDKReferenceNumber = i13 % 128;
        if (i13 % 2 == 0) {
            return socketAuthenticationRequestParameters;
        }
        throw null;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11) {
        return (Socket) AuthenticationRequestParameters(new Object[]{this, inetAddress, Integer.valueOf(i11)}, -1944125751, 1944125751, i11);
    }
}
