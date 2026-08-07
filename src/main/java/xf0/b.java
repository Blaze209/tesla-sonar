package xf0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.unionpay.utils.UPUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f123484a = new c();

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008f  */
    public static String b(Context context) {
        String str;
        int i11;
        String strC = UPUtils.c(context, "configs");
        String strC2 = UPUtils.c(context, "mode");
        String strC3 = UPUtils.c(context, "or");
        if (TextUtils.isEmpty(strC) || TextUtils.isEmpty(strC2) || TextUtils.isEmpty(strC3)) {
            str = "";
        } else {
            try {
                JSONObject jSONObject = new JSONObject(strC);
                String strB = i.b(jSONObject, "sign");
                try {
                    i11 = Integer.parseInt(strC2);
                } catch (Exception unused) {
                    i11 = 0;
                }
                str = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str2 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                String strM = m(UPUtils.d(str + str2 + strC3));
                String strB2 = UPUtils.b(i11, strB);
                if (TextUtils.isEmpty(strB2) || !strB2.equals(strM)) {
                    str = "";
                }
            } catch (Exception unused2) {
            }
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                Object objA = i.a(jSONArray, i12);
                if (objA != null) {
                    JSONObject jSONObject2 = (JSONObject) objA;
                    if ("app".equals(i.b(jSONObject2, "type"))) {
                        return new String(Base64.decode(i.b(jSONObject2, "ca"), 2));
                    }
                }
            }
        } catch (Exception unused3) {
        }
        return "";
    }

    public static String c(InputStream inputStream, String str) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 <= 0) {
                    return byteArrayOutputStream.toString(str);
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strB = i.b(jSONObject, "sign");
            String strB2 = i.b(jSONObject, "configs");
            if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strB2)) {
                return null;
            }
            String str3 = new String(Base64.decode(strB2, 2));
            String strM = m(UPUtils.d(str3));
            String strB3 = UPUtils.b(a(str2), strB);
            if (TextUtils.isEmpty(strB3) || !strB3.equals(strM)) {
                return null;
            }
            return str3;
        } catch (Exception unused) {
            return null;
        }
    }

    private static String e(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i11 = 0; i11 < bArr.length; i11++) {
            String hexString = Integer.toHexString(bArr[i11]);
            int length = hexString.length();
            if (length == 1) {
                hexString = WebrtcBuildVersion.maint_version + hexString;
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb2.append(hexString.toUpperCase());
            if (i11 < bArr.length - 1) {
                sb2.append(CoreConstants.COLON_CHAR);
            }
        }
        return sb2.toString();
    }

    public static boolean f() {
        try {
            return "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean g(Context context, String str) {
        PackageInfo packageInfo = null;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && !TextUtils.isEmpty(str)) {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
            } catch (Exception unused) {
            }
        }
        return packageInfo != null;
    }

    private static boolean h(Context context, String str, String str2) {
        int iT;
        int iR = r(context, str);
        try {
            iT = t(str2);
        } catch (Exception unused) {
            iT = Integer.MAX_VALUE;
        }
        return iR >= iT;
    }

    public static boolean i(Context context, String str, String str2, String str3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    int iR = r(context, str);
                    int iT = t(str3);
                    if (g(context, str) && iR >= iT && str2.equalsIgnoreCase(l(context, str, "SHA256"))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private static boolean j(Context context, String str, String str2, String str3, String str4) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    if (str4 == null || TextUtils.isEmpty(str4)) {
                        str4 = "11";
                    }
                    String strP = p(context, str);
                    if ((!s(str4) || !TextUtils.isEmpty(strP)) && g(context, str) && (((("11".equals(str4) || "10".equals(str4)) && str2.equalsIgnoreCase(l(context, str, "SHA1"))) || str2.equalsIgnoreCase(l(context, str, "SHA256"))) && ((s(str4) && strP.matches(str3)) || h(context, str, str3)))) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean k(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null) {
            return false;
        }
        return j(context, i.b(jSONObject, "schema"), i.b(jSONObject, "sign"), i.b(jSONObject, "version"), i.b(jSONObject, "checkMode"));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0049  */
    /* JADX WARN: Code duplicated, block: B:35:0x0050 A[Catch: NoSuchAlgorithmException | CertificateEncodingException -> 0x005d, NoSuchAlgorithmException -> 0x005f, Exception -> 0x006c, TRY_LEAVE, TryCatch #1 {Exception -> 0x006c, blocks: (B:4:0x0005, B:9:0x000f, B:15:0x001b, B:17:0x001f, B:19:0x0022, B:21:0x0027, B:22:0x0030, B:28:0x003e, B:33:0x004a, B:35:0x0050, B:42:0x0065, B:40:0x0060, B:31:0x0046, B:25:0x0038, B:12:0x0015), top: B:48:0x0005, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0065 A[Catch: Exception -> 0x006c, TRY_LEAVE, TryCatch #1 {Exception -> 0x006c, blocks: (B:4:0x0005, B:9:0x000f, B:15:0x001b, B:17:0x001f, B:19:0x0022, B:21:0x0027, B:22:0x0030, B:28:0x003e, B:33:0x004a, B:35:0x0050, B:42:0x0065, B:40:0x0060, B:31:0x0046, B:25:0x0038, B:12:0x0015), top: B:48:0x0005, inners: #0, #2, #5 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static String l(Context context, String str, String str2) {
        PackageManager packageManager;
        PackageInfo packageInfo;
        Signature[] signatureArr;
        Signature signature;
        ByteArrayInputStream byteArrayInputStream;
        CertificateFactory certificateFactory;
        X509Certificate x509Certificate;
        MessageDigest messageDigest;
        String strE = null;
        if (context != null) {
            try {
                packageManager = context.getPackageManager();
            } catch (Exception unused) {
            }
        } else {
            packageManager = null;
        }
        if (packageManager != null) {
            try {
                packageInfo = packageManager.getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException e11) {
                e11.printStackTrace();
                packageInfo = null;
            }
            if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length > 0 && (signature = signatureArr[0]) != null) {
                byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                try {
                    certificateFactory = CertificateFactory.getInstance("X509");
                } catch (CertificateException e12) {
                    e12.printStackTrace();
                    certificateFactory = null;
                }
                if (certificateFactory != null) {
                    try {
                        x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
                    } catch (CertificateException e13) {
                        e13.printStackTrace();
                        x509Certificate = null;
                    }
                    try {
                        messageDigest = MessageDigest.getInstance(str2);
                        if (x509Certificate != null) {
                            strE = e(messageDigest.digest(x509Certificate.getEncoded()));
                        }
                    } catch (NoSuchAlgorithmException | CertificateEncodingException e14) {
                        e14.printStackTrace();
                    }
                    if (strE != null) {
                        return strE.replaceAll(":", "");
                    }
                } else {
                    x509Certificate = null;
                    messageDigest = MessageDigest.getInstance(str2);
                    if (x509Certificate != null) {
                        strE = e(messageDigest.digest(x509Certificate.getEncoded()));
                    }
                    if (strE != null) {
                        return strE.replaceAll(":", "");
                    }
                }
            }
        } else {
            packageInfo = null;
            if (packageInfo != null) {
                byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                certificateFactory = CertificateFactory.getInstance("X509");
                if (certificateFactory != null) {
                    x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
                    messageDigest = MessageDigest.getInstance(str2);
                    if (x509Certificate != null) {
                        strE = e(messageDigest.digest(x509Certificate.getEncoded()));
                    }
                    if (strE != null) {
                        return strE.replaceAll(":", "");
                    }
                } else {
                    x509Certificate = null;
                    messageDigest = MessageDigest.getInstance(str2);
                    if (x509Certificate != null) {
                        strE = e(messageDigest.digest(x509Certificate.getEncoded()));
                    }
                    if (strE != null) {
                        return strE.replaceAll(":", "");
                    }
                }
            }
        }
        return "";
    }

    public static String m(String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb2 = new StringBuilder("");
        for (byte b11 : str.getBytes()) {
            sb2.append(charArray[(b11 & 240) >> 4]);
            sb2.append(charArray[b11 & 15]);
        }
        return sb2.toString().trim();
    }

    public static String n(Context context, String str) {
        return l(context, str, "SHA1");
    }

    public static String o(String str) {
        return !TextUtils.isEmpty((CharSequence) f123484a.get(str)) ? (String) f123484a.get(str) : str;
    }

    public static String p(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String q(String str) {
        if (str != null) {
            try {
                return Pattern.compile("[\":,\\[\\]{}]").matcher(str).replaceAll("").trim();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static int r(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    private static boolean s(String str) {
        return "11".equals(str) || "01".equals(str);
    }

    private static int t(String str) {
        try {
            return Integer.valueOf(str, 10).intValue();
        } catch (Exception unused) {
            return Integer.MAX_VALUE;
        }
    }
}
