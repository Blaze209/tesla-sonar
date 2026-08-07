package ug;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f116180a = "idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#";

    public static String a() {
        String str = new String();
        for (int i11 = 0; i11 < f116180a.length() - 1; i11 += 4) {
            str = str + f116180a.charAt(i11);
        }
        return str;
    }

    public static String b(String str, String str2) {
        try {
            return c(f(h(str), str2.getBytes(), i()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b11 : bArr) {
            d(stringBuffer, b11);
        }
        return stringBuffer.toString();
    }

    public static void d(StringBuffer stringBuffer, byte b11) {
        stringBuffer.append("0123456789ABCDEF".charAt((b11 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b11 & 15));
    }

    public static byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = Integer.valueOf(str.substring(i12, i12 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] f(PBEKeySpec pBEKeySpec, byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException, ShortBufferException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(pBEKeySpec).getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
        byte[] salt = pBEKeySpec.getSalt();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bArr.length));
        byteBufferAllocate.put(salt);
        cipher.doFinal(ByteBuffer.wrap(bArr), byteBufferAllocate);
        return byteBufferAllocate.array();
    }

    public static String g(String str, String str2) {
        try {
            byte[] bArrJ = j(h(str), e(str2), i());
            if (bArrJ == null) {
                throw new Exception();
            }
            String str3 = new String(bArrJ);
            if (sg.a.g(str3)) {
                return str3;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static PBEKeySpec h(String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName(new String(a.a("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object objNewInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(objNewInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    public static byte[] i() {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 48; i11 += 2) {
                sb2.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i11));
            }
            return a.a(sb2.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static byte[] j(PBEKeySpec pBEKeySpec, byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (bArr.length <= 16) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(pBEKeySpec.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
        return cipher.doFinal(bArr, 16, bArr.length - 16);
    }
}
