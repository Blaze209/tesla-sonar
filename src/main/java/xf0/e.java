package xf0;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.unionpay.utils.UPUtils;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.UUID;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static String a() {
        String str = Build.VERSION.RELEASE;
        return !TextUtils.isEmpty(str) ? str.trim() : "";
    }

    public static String b(Context context) {
        try {
            String packageName = context instanceof Activity ? ((Activity) context).getPackageName() : "";
            return packageName == null ? "" : packageName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String c(Context context, String str, String str2) {
        PackageInfo packageInfo;
        CertificateFactory certificateFactory;
        String strD;
        String str3 = "";
        try {
            X509Certificate x509Certificate = null;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException e11) {
                e11.printStackTrace();
                packageInfo = null;
            }
            if (packageInfo == null) {
                return "";
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
            try {
                certificateFactory = CertificateFactory.getInstance("X509");
            } catch (CertificateException e12) {
                e12.printStackTrace();
                certificateFactory = null;
            }
            if (certificateFactory != null) {
                try {
                    Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
                    if (certificateGenerateCertificate instanceof X509Certificate) {
                        x509Certificate = (X509Certificate) certificateGenerateCertificate;
                    }
                } catch (CertificateException e13) {
                    e13.printStackTrace();
                }
            }
            try {
                strD = x509Certificate != null ? d(MessageDigest.getInstance(str2).digest(x509Certificate.getEncoded())) : "";
            } catch (NoSuchAlgorithmException | CertificateEncodingException e14) {
                e14.printStackTrace();
            }
            if (strD == null) {
                return strD;
            }
            try {
                return strD.replaceAll(":", "");
            } catch (Exception e15) {
                str3 = strD;
                e = e15;
            }
        } catch (Exception e16) {
            e = e16;
        }
        e.printStackTrace();
        return str3;
    }

    private static String d(byte[] bArr) {
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

    public static String e() {
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (!TextUtils.isEmpty(strTrim)) {
                return strTrim.replace(" ", "");
            }
        }
        return "";
    }

    public static String f(Context context) {
        if (context != null) {
            try {
                String strC = UPUtils.c(context, "merchant_id");
                if (!TextUtils.isEmpty(strC)) {
                    return strC;
                }
                String string = UUID.randomUUID().toString();
                if (TextUtils.isEmpty(string)) {
                    return string;
                }
                String strReplaceAll = string.replaceAll("-", "");
                UPUtils.g(context, strReplaceAll, "merchant_id");
                return strReplaceAll;
            } catch (Exception unused) {
            }
        }
        return "";
    }
}
