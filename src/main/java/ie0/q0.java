package ie0;

import com.adyen.checkout.components.core.Address;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes8.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static HashMap<String, String> f77616a = new HashMap<>();

    public static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i11 = 0; i11 < length; i11 += 2) {
            bArr[i11 / 2] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        return c(bArr, bArr == null ? 0 : bArr.length);
    }

    public static String c(byte[] bArr, int i11) {
        if (bArr == null || i11 < 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i11 * 2);
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i12])));
        }
        return sb2.toString();
    }

    public static String d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes());
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String e(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("email:");
        sb2.append(str == null ? Address.ADDRESS_NULL_PLACEHOLDER : d(str));
        return sb2.toString();
    }

    public static String f(String str) {
        if (str == null || str.length() <= 11) {
            return str;
        }
        if (f77616a.containsKey(str)) {
            return f77616a.get(str);
        }
        String strD = d(str);
        f77616a.put(str, strD);
        return strD == null ? "???" : strD;
    }

    public static List<String> g(List<String> list) {
        if (list == null || list.size() == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f(it.next()));
        }
        return arrayList;
    }

    public static String h(int i11) {
        String str = String.format("Unknown error: %d", Integer.valueOf(i11));
        if (i11 == 1) {
            return "SCAN_FAILED_ALREADY_STARTED";
        }
        if (i11 == 2) {
            return "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED";
        }
        if (i11 != 3) {
            return i11 != 4 ? str : "SCAN_FAILED_FEATURE_UNSUPPORTED";
        }
        return "SCAN_FAILED_INTERNAL_ERROR";
    }
}
