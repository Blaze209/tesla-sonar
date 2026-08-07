package og;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ImagesContract;
import di.g;
import di.i;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f97294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference<WebView> f97295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference<ai.a> f97296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f97297d = i.a.f60652a;

    public class b extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConnectivityManager f97302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f97303b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f97304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map f97305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f97306e;

        /* JADX INFO: renamed from: og.a$b$a, reason: collision with other inner class name */
        public class RunnableC2086a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ConnectivityManager.NetworkCallback f97308a;

            public RunnableC2086a(ConnectivityManager.NetworkCallback networkCallback) {
                this.f97308a = networkCallback;
            }

            @Override // java.lang.Runnable
            public void run() {
                ConnectivityManager connectivityManager = b.this.f97302a;
                ta0.a.f(this.f97308a);
            }
        }

        public b(ConnectivityManager connectivityManager, String str, String str2, Map map, String str3) {
            this.f97302a = connectivityManager;
            this.f97303b = str;
            this.f97304c = str2;
            this.f97305d = map;
            this.f97306e = str3;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            g.f("mspl", "AlipayChinaMobileBridge checkNetworkAndRequest onAvailable");
            try {
                if (this.f97302a.getNetworkCapabilities(network).hasTransport(0)) {
                    a.this.f(network, this.f97303b, this.f97304c, this.f97305d, this.f97306e, new RunnableC2086a(this));
                } else {
                    g.f("mspl", "AlipayChinaMobileBridge sendNetworkByWifiBridge net error ");
                }
            } catch (Throwable th2) {
                g.d(th2);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Network f97310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f97311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f97312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Map f97313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f97314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Runnable f97315f;

        public c(Network network, String str, String str2, Map map, String str3, Runnable runnable) {
            this.f97310a = network;
            this.f97311b = str;
            this.f97312c = str2;
            this.f97313d = map;
            this.f97314e = str3;
            this.f97315f = runnable;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00bf A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #4 {all -> 0x00c9, blocks: (B:36:0x00b0, B:38:0x00bf), top: B:80:0x00b0 }] */
        /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:76:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() {
            OutputStream outputStream;
            BufferedReader bufferedReader;
            ai.a aVar;
            HttpsURLConnection httpsURLConnection;
            Runnable runnable;
            StringBuilder sb2 = new StringBuilder();
            HttpsURLConnection httpsURLConnection2 = null;
            try {
                httpsURLConnection = (HttpsURLConnection) this.f97310a.openConnection(new URL(this.f97311b));
                try {
                    httpsURLConnection.setRequestMethod(this.f97312c.toUpperCase());
                    httpsURLConnection.setConnectTimeout(5000);
                    httpsURLConnection.setReadTimeout(5000);
                    for (String str : this.f97313d.keySet()) {
                        httpsURLConnection.setRequestProperty(str, (String) this.f97313d.get(str));
                    }
                    if (TextUtils.equals("POST", this.f97312c.toUpperCase())) {
                        outputStream = httpsURLConnection.getOutputStream();
                        try {
                            outputStream.write(this.f97314e.getBytes(StandardCharsets.UTF_8));
                            outputStream.flush();
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = null;
                            httpsURLConnection2 = httpsURLConnection;
                            try {
                                g.d(th);
                                aVar = a.this.f97296c.get();
                                if (aVar != null) {
                                    hh.a.g(aVar, "biz", "AlipayChinaMobileBridge", "sendNetworkAsyncError");
                                }
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e11) {
                                        g.d(e11);
                                    }
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e12) {
                                        g.d(e12);
                                    }
                                }
                                if (httpsURLConnection2 != null) {
                                    httpsURLConnection = httpsURLConnection2;
                                    httpsURLConnection.disconnect();
                                }
                                runnable = this.f97315f;
                                if (runnable != null) {
                                    runnable.run();
                                }
                            } catch (Throwable th3) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException e13) {
                                        g.d(e13);
                                    }
                                }
                                if (bufferedReader != null) {
                                    try {
                                        bufferedReader.close();
                                    } catch (IOException e14) {
                                        g.d(e14);
                                    }
                                }
                                if (httpsURLConnection2 == null) {
                                    throw th3;
                                }
                                httpsURLConnection2.disconnect();
                                throw th3;
                            }
                        }
                    } else {
                        outputStream = null;
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                            sb2.append("\n");
                        } catch (Throwable th4) {
                            th = th4;
                            httpsURLConnection2 = httpsURLConnection;
                            g.d(th);
                            aVar = a.this.f97296c.get();
                            if (aVar != null) {
                                hh.a.g(aVar, "biz", "AlipayChinaMobileBridge", "sendNetworkAsyncError");
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            if (httpsURLConnection2 != null) {
                                httpsURLConnection = httpsURLConnection2;
                            }
                            runnable = this.f97315f;
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                    }
                    a.this.m(sb2.toString());
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e15) {
                            g.d(e15);
                        }
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException e16) {
                        g.d(e16);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = null;
                    bufferedReader = null;
                }
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
                bufferedReader = null;
            }
            httpsURLConnection.disconnect();
            runnable = this.f97315f;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public a(Context context, WebView webView, ai.a aVar) {
        this.f97294a = null;
        this.f97295b = null;
        this.f97296c = null;
        this.f97294a = new WeakReference<>(context);
        this.f97295b = new WeakReference<>(webView);
        this.f97296c = new WeakReference<>(aVar);
    }

    public static String a() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return sb2.toString();
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if ((inetAddressNextElement instanceof Inet4Address) && !inetAddressNextElement.isLoopbackAddress()) {
                            arrayList.add(inetAddressNextElement.getHostAddress());
                        }
                    }
                }
            }
            for (String str : arrayList) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            return sb2.toString();
        } catch (Throwable th2) {
            g.d(th2);
        }
    }

    public static String c(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        if (bArr == null || TextUtils.isEmpty(str)) {
            return null;
        }
        RSAPublicKey rSAPublicKeyE = e(str);
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        cipher.init(1, rSAPublicKeyE);
        return nh.a.b(k(bArr, cipher, (rSAPublicKeyE.getModulus().bitLength() / 8) - 66));
    }

    public static String d(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr2, "AES"), new GCMParameterSpec(128, Arrays.copyOf(bArr2, 12)));
        return nh.a.b(cipher.doFinal(bArr));
    }

    public static RSAPublicKey e(String str) {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(nh.a.d(str)));
    }

    public static byte[] k(byte[] bArr, Cipher cipher, int i11) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            int length = bArr.length;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int i14 = length - i12;
                if (i14 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
                byte[] bArrDoFinal = cipher.doFinal(bArr, i12, Math.min(i14, i11));
                byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                i13++;
                i12 = i13 * i11;
            }
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String l() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList<String> arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return sb2.toString();
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                if (networkInterfaceNextElement.isUp() && !networkInterfaceNextElement.isLoopback()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddressNextElement = inetAddresses.nextElement();
                        if ((inetAddressNextElement instanceof Inet6Address) && !inetAddressNextElement.isLoopbackAddress()) {
                            String hostAddress = inetAddressNextElement.getHostAddress();
                            int iIndexOf = hostAddress.indexOf(37);
                            if (iIndexOf > 0) {
                                hostAddress = hostAddress.substring(0, iIndexOf);
                            }
                            arrayList.add(hostAddress);
                        }
                    }
                    for (String str : arrayList) {
                        if (sb2.length() > 0) {
                            sb2.append(",");
                        }
                        sb2.append(str);
                    }
                }
            }
            return sb2.toString();
        } catch (Exception e11) {
            g.d(e11);
        }
    }

    public final String b(Context context) {
        if (context == null) {
            return "";
        }
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        g.f("mspl", "AlipayChinaMobileBridge getMobileOperator: " + simOperator);
        return simOperator;
    }

    public final void f(Network network, String str, String str2, Map<String, String> map, String str3, Runnable runnable) {
        g.f("mspl", "AlipayChinaMobileBridge sendNetworkAsync");
        ph.a.b(new c(network, str, str2, map, str3, runnable));
    }

    public final void g(String str, String str2, Map<String, String> map, String str3) {
        g.f("mspl", "AlipayChinaMobileBridge checkNetworkAndRequest");
        Context context = this.f97294a.get();
        if (context == null) {
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        connectivityManager.requestNetwork(new NetworkRequest.Builder().addCapability(12).addTransportType(0).build(), new b(connectivityManager, str, str2, map, str3));
    }

    @JavascriptInterface
    public int getMobileOperator(String str) {
        g.f("mspl", "AlipayChinaMobileBridge getMobileOperator params: " + str);
        Context context = this.f97294a.get();
        if (context == null) {
            return -3;
        }
        try {
            String strB = b(context);
            if (!TextUtils.equals(strB, "46000") && !TextUtils.equals(strB, "46002") && !TextUtils.equals(strB, "46007") && !TextUtils.equals(strB, "46004")) {
                if (!TextUtils.equals(strB, "46003") && !TextUtils.equals(strB, "46005") && !TextUtils.equals(strB, "46011")) {
                    return (TextUtils.equals(strB, "46001") || TextUtils.equals(strB, "46006") || TextUtils.equals(strB, "46009")) ? 3 : -3;
                }
                return 2;
            }
            return 1;
        } catch (Throwable th2) {
            g.d(th2);
            return -3;
        }
    }

    public final void h(@NonNull Map<String, String> map) {
        g.f("mspl", "attachParamsToHeader");
        Context context = this.f97294a.get();
        if (context == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ipv4List", a());
            jSONObject.put("ipv6List", l());
            String strA = i.a(context);
            this.f97297d = strA;
            jSONObject.put("networkType", strA);
            jSONObject.put("packageName", context.getPackageName());
            String string = jSONObject.toString();
            g.f("mspl", "AlipayJsBridge attachParamsToHeader sdkDataStr：" + string);
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            String strC = c(bArr, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAkzi87lcyX1t/OSjlmjmj\nUFTAb0Y0wPZ79j10sjVrDtV+lMZXz/hOalITFyXRpmS8g8I1H3AlhihQQsierIFa\nQj5omUsXhzvNO+4DorkMJ14n1o1sfL0iOLTrzydghuUpyspj0M8v5bJTBbLv8DGM\nreKtJ8sbIYC5aj8pAdxn+YTnZ4Rhp/pNRbmIAlxs4Btu3whJt/RTfEASgsDRaTgO\nr9Rlj2YDiyEM4T3d0LsLjNed7B0Ogulzj6OzvHj+foIyb+YEEn6C5F9r+uNY2l2i\nYlHfaizd1HKfISrcAseJu6lGKRP0I3mv538Twqg1u0DFV6waQ9gwgOhq4ORCiNpd\nIQIDAQAB");
            String strD = d(string.getBytes(), bArr);
            map.put("sdkSecret", strC);
            map.put("sdkData", strD);
        } catch (Throwable th2) {
            g.d(th2);
        }
    }

    public final void m(String str) {
        g.f("mspl", "AlipayChinaMobileBridge sendCallbackForSendNetwork:" + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("data", str);
            jSONObject.put("netType", this.f97297d);
        } catch (Throwable th2) {
            g.d(th2);
        }
        n("window.receiveNetworkSwitch(" + jSONObject + ")");
    }

    public final void n(String str) {
        g.f("mspl", "AlipayChinaMobileBridge sendWebCallback: " + str);
        WebView webView = this.f97295b.get();
        if (webView == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC2084a(webView, str));
    }

    @JavascriptInterface
    public void sendNetworkByWifiBridge(String str) {
        g.f("mspl", "AlipayChinaMobileBridge sendNetworkSwitch params: " + str);
        if (TextUtils.isEmpty(str) || this.f97294a.get() == null) {
            return;
        }
        this.f97297d = i.a.f60652a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getString(ImagesContract.URL);
            String string3 = jSONObject.getString("headers");
            String string4 = jSONObject.getString("params");
            HashMap map = new HashMap();
            JSONObject jSONObject2 = new JSONObject(string3);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.optString(next, ""));
            }
            h(map);
            g(string2, string, map, string4);
        } catch (Throwable th2) {
            g.d(th2);
        }
    }

    /* JADX INFO: renamed from: og.a$a, reason: collision with other inner class name */
    public class RunnableC2084a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f97298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f97299b;

        public RunnableC2084a(WebView webView, String str) {
            this.f97298a = webView;
            this.f97299b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f97298a.evaluateJavascript(this.f97299b, new C2085a());
        }

        /* JADX INFO: renamed from: og.a$a$a, reason: collision with other inner class name */
        public class C2085a implements ValueCallback<String> {
            public C2085a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }
        }
    }
}
