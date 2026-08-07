package org.bouncycastle.crypto.generators;

import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes9.dex */
public class OpenBSDBCrypt {
    private static final Set<String> allowedVersions;
    private static final String defaultVersion = "2y";
    private static final byte[] encodingTable = {46, 47, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    private static final byte[] decodingTable = new byte[128];

    static {
        HashSet hashSet = new HashSet();
        allowedVersions = hashSet;
        hashSet.add("2");
        hashSet.add("2x");
        hashSet.add("2a");
        hashSet.add(defaultVersion);
        hashSet.add("2b");
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = decodingTable;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = encodingTable;
            if (i11 >= bArr2.length) {
                return;
            }
            decodingTable[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }

    private OpenBSDBCrypt() {
    }

    public static boolean checkPassword(String str, byte[] bArr) {
        if (bArr != null) {
            return doCheckPassword(str, Arrays.clone(bArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    private static String createBcryptString(String str, byte[] bArr, byte[] bArr2, int i11) {
        String string;
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        }
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append(CoreConstants.DOLLAR);
        sb2.append(str);
        sb2.append(CoreConstants.DOLLAR);
        if (i11 < 10) {
            string = WebrtcBuildVersion.maint_version + i11;
        } else {
            string = Integer.toString(i11);
        }
        sb2.append(string);
        sb2.append(CoreConstants.DOLLAR);
        encodeData(sb2, bArr2);
        encodeData(sb2, BCrypt.generate(bArr, bArr2, i11));
        return sb2.toString();
    }

    private static byte[] decodeSaltString(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length != 22) {
            throw new DataLengthException("Invalid base64 salt length: " + charArray.length + " , 22 required.");
        }
        for (char c11 : charArray) {
            if (c11 > 'z' || c11 < '.' || (c11 > '9' && c11 < 'A')) {
                throw new IllegalArgumentException("Salt string contains invalid character: " + ((int) c11));
            }
        }
        char[] cArr = new char[24];
        System.arraycopy(charArray, 0, cArr, 0, charArray.length);
        for (int i11 = 0; i11 < 24; i11 += 4) {
            byte[] bArr = decodingTable;
            byte b11 = bArr[cArr[i11]];
            byte b12 = bArr[cArr[i11 + 1]];
            byte b13 = bArr[cArr[i11 + 2]];
            byte b14 = bArr[cArr[i11 + 3]];
            byteArrayOutputStream.write((b11 << 2) | (b12 >> 4));
            byteArrayOutputStream.write((b12 << 4) | (b13 >> 2));
            byteArrayOutputStream.write(b14 | (b13 << 6));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr2 = new byte[16];
        System.arraycopy(byteArray, 0, bArr2, 0, 16);
        return bArr2;
    }

    private static boolean doCheckPassword(String str, byte[] bArr) {
        String strSubstring;
        if (str == null) {
            throw new IllegalArgumentException("Missing bcryptString.");
        }
        if (str.charAt(1) != '2') {
            throw new IllegalArgumentException("not a Bcrypt string");
        }
        int length = str.length();
        if (length != 60 && (length != 59 || str.charAt(2) != '$')) {
            throw new DataLengthException("Bcrypt String length: " + length + ", 60 required.");
        }
        int i11 = 3;
        if (str.charAt(2) == '$') {
            if (str.charAt(0) != '$' || str.charAt(5) != '$') {
                throw new IllegalArgumentException("Invalid Bcrypt String format.");
            }
        } else if (str.charAt(0) != '$' || str.charAt(3) != '$' || str.charAt(6) != '$') {
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
        if (str.charAt(2) == '$') {
            strSubstring = str.substring(1, 2);
        } else {
            strSubstring = str.substring(1, 3);
            i11 = 4;
        }
        if (!allowedVersions.contains(strSubstring)) {
            throw new IllegalArgumentException("Bcrypt version '" + strSubstring + "' is not supported by this implementation");
        }
        String strSubstring2 = str.substring(i11, i11 + 2);
        try {
            int i12 = Integer.parseInt(strSubstring2);
            if (i12 >= 4 && i12 <= 31) {
                return Strings.constantTimeAreEqual(str, doGenerate(strSubstring, bArr, decodeSaltString(str.substring(str.lastIndexOf(36) + 1, length - 31)), i12));
            }
            throw new IllegalArgumentException("Invalid cost factor: " + i12 + ", 4 < cost < 31 expected.");
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("Invalid cost factor: " + strSubstring2);
        }
    }

    private static String doGenerate(String str, byte[] bArr, byte[] bArr2, int i11) {
        if (!allowedVersions.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt required.");
        }
        if (bArr2.length != 16) {
            throw new DataLengthException("16 byte salt required: " + bArr2.length);
        }
        if (i11 < 4 || i11 > 31) {
            throw new IllegalArgumentException("Invalid cost factor.");
        }
        int length = bArr.length < 72 ? bArr.length + 1 : 72;
        byte[] bArr3 = new byte[length];
        if (length > bArr.length) {
            length = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr3, 0, length);
        Arrays.fill(bArr, (byte) 0);
        String strCreateBcryptString = createBcryptString(str, bArr3, bArr2, i11);
        Arrays.fill(bArr3, (byte) 0);
        return strCreateBcryptString;
    }

    private static void encodeData(StringBuilder sb2, byte[] bArr) {
        boolean z11;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new DataLengthException("Invalid length: " + bArr.length + ", 24 for key or 16 for salt expected");
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z11 = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z11 = false;
        }
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int i12 = bArr[i11] & 255;
            int i13 = bArr[i11 + 1] & 255;
            byte b11 = bArr[i11 + 2];
            byte[] bArr3 = encodingTable;
            sb2.append((char) bArr3[(i12 >>> 2) & 63]);
            sb2.append((char) bArr3[((i12 << 4) | (i13 >>> 4)) & 63]);
            sb2.append((char) bArr3[((i13 << 2) | ((b11 & 255) >>> 6)) & 63]);
            sb2.append((char) bArr3[b11 & 63]);
        }
        int length2 = sb2.length();
        sb2.setLength(z11 ? length2 - 2 : length2 - 1);
    }

    public static String generate(String str, byte[] bArr, byte[] bArr2, int i11) {
        if (bArr != null) {
            return doGenerate(str, Arrays.clone(bArr), bArr2, i11);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static boolean checkPassword(String str, char[] cArr) {
        if (cArr != null) {
            return doCheckPassword(str, Strings.toUTF8ByteArray(cArr));
        }
        throw new IllegalArgumentException("Missing password.");
    }

    public static String generate(String str, char[] cArr, byte[] bArr, int i11) {
        if (cArr != null) {
            return doGenerate(str, Strings.toUTF8ByteArray(cArr), bArr, i11);
        }
        throw new IllegalArgumentException("Password required.");
    }

    public static String generate(byte[] bArr, byte[] bArr2, int i11) {
        return generate(defaultVersion, bArr, bArr2, i11);
    }

    public static String generate(char[] cArr, byte[] bArr, int i11) {
        return generate(defaultVersion, cArr, bArr, i11);
    }
}
