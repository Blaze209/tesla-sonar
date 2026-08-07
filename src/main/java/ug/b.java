package ug;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class b {
    public static String a(String str) {
        try {
            if (sg.a.c(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b11)));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
