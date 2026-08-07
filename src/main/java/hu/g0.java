package hu;

import android.util.Pair;
import com.google.android.play.core.splitinstall.internal.zzf;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 {
    public static X509Certificate[][] a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairC = h0.c(randomAccessFile);
            if (pairC == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairC.first;
            long jLongValue = ((Long) pairC.second).longValue();
            long j11 = (-20) + jLongValue;
            if (j11 >= 0) {
                randomAccessFile.seek(j11);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            long jA = h0.a(byteBuffer);
            if (jA >= jLongValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + jA + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (h0.b(byteBuffer) + jA != jLongValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jA < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + jA);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jA - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            int i11 = 0;
            long j12 = byteBufferAllocate.getLong(0);
            if (j12 < byteBufferAllocate.capacity() || j12 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j12);
            }
            int i12 = (int) (8 + j12);
            long j13 = jA - ((long) i12);
            if (j13 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j13);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i12);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j13);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j14 = byteBufferAllocate2.getLong(0);
            if (j14 != j12) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j14 + " vs " + j12);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j13));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                while (byteBufferSlice.hasRemaining()) {
                    i11++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i11);
                    }
                    long j15 = byteBufferSlice.getLong();
                    if (j15 < 4 || j15 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i11 + " size out of range: " + j15);
                    }
                    int i13 = (int) j15;
                    int iPosition2 = byteBufferSlice.position() + i13;
                    if (i13 > byteBufferSlice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i11 + " size out of range: " + i13 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrL = l(randomAccessFile.getChannel(), new d0(e(byteBufferSlice, i13 - 4), jLongValue2, jA, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return x509CertificateArrL;
                    }
                    long j16 = jLongValue2;
                    byteBufferSlice.position(iPosition2);
                    jLongValue2 = j16;
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th3;
        }
    }

    private static int b(int i11) {
        if (i11 == 1) {
            return 32;
        }
        if (i11 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i11);
    }

    private static int c(int i11) {
        if (i11 == 513) {
            return 1;
        }
        if (i11 == 514) {
            return 2;
        }
        if (i11 == 769) {
            return 1;
        }
        switch (i11) {
            case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
            case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                return 1;
            case SDK_ASSET_HEADER_BOLT_VALUE:
            case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i11))));
        }
    }

    private static String d(int i11) {
        if (i11 == 1) {
            return "SHA-256";
        }
        if (i11 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i11);
    }

    private static ByteBuffer e(ByteBuffer byteBuffer, int i11) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i12 = i11 + iPosition;
        if (i12 < iPosition || i12 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i12);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i12);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i11 = byteBuffer.getInt();
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i11 <= byteBuffer.remaining()) {
            return e(byteBuffer, i11);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i11 + ", remaining: " + byteBuffer.remaining());
    }

    private static void g(int i11, byte[] bArr, int i12) {
        bArr[1] = (byte) (i11 & 255);
        bArr[2] = (byte) ((i11 >>> 8) & 255);
        bArr[3] = (byte) ((i11 >>> 16) & 255);
        bArr[4] = (byte) (i11 >> 24);
    }

    private static void h(Map map, FileChannel fileChannel, long j11, long j12, long j13, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        b0 b0Var = new b0(fileChannel, 0L, j11);
        b0 b0Var2 = new b0(fileChannel, j12, j13 - j12);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        h0.d(byteBufferDuplicate, j11);
        a aVar = new a(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = ((Integer) it.next()).intValue();
            i11++;
        }
        try {
            byte[][] bArrK = k(iArr, new s[]{b0Var, b0Var2, aVar});
            for (int i12 = 0; i12 < size; i12++) {
                int i13 = iArr[i12];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i13)), bArrK[i12])) {
                    throw new SecurityException(d(i13).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e11) {
            throw new SecurityException("Failed to compute digest(s) of contents", e11);
        }
    }

    private static byte[] i(ByteBuffer byteBuffer) throws IOException {
        int i11 = byteBuffer.getInt();
        if (i11 < 0) {
            throw new IOException("Negative length");
        }
        if (i11 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i11];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i11 + ", available: " + byteBuffer.remaining());
    }

    private static X509Certificate[] j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferF = f(byteBuffer);
        ByteBuffer byteBufferF2 = f(byteBuffer);
        byte[] bArrI = i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrI2 = null;
        byte[] bArrI3 = null;
        int i11 = -1;
        int i12 = 0;
        while (byteBufferF2.hasRemaining()) {
            i12++;
            try {
                ByteBuffer byteBufferF3 = f(byteBufferF2);
                if (byteBufferF3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i13 = byteBufferF3.getInt();
                arrayList.add(Integer.valueOf(i13));
                if (i13 != 513 && i13 != 514 && i13 != 769) {
                    switch (i13) {
                        case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                        case SDK_ASSET_HEADER_BOLT_VALUE:
                        case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                        case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                            break;
                        default:
                            continue;
                    }
                }
                if (i11 != -1) {
                    int iC = c(i13);
                    int iC2 = c(i11);
                    if (iC != 1 && iC2 == 1) {
                    }
                }
                bArrI3 = i(byteBufferF3);
                i11 = i13;
            } catch (IOException e11) {
                e = e11;
                throw new SecurityException("Failed to parse signature record #" + i12, e);
            } catch (BufferUnderflowException e12) {
                e = e12;
                throw new SecurityException("Failed to parse signature record #" + i12, e);
            }
        }
        if (i11 == -1) {
            if (i12 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i11 == 513 || i11 == 514) {
            str = "EC";
        } else if (i11 != 769) {
            switch (i11) {
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                case SDK_ASSET_HEADER_BOLT_VALUE:
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i11))));
            }
        } else {
            str = "DSA";
        }
        if (i11 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i11 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i11 != 769) {
            switch (i11) {
                case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case SDK_ASSET_HEADER_BOLT_VALUE:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i11))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrI));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferF);
            if (!signature.verify(bArrI3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferF.clear();
            ByteBuffer byteBufferF4 = f(byteBufferF);
            ArrayList arrayList2 = new ArrayList();
            int i14 = 0;
            while (byteBufferF4.hasRemaining()) {
                i14++;
                try {
                    ByteBuffer byteBufferF5 = f(byteBufferF4);
                    if (byteBufferF5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i15 = byteBufferF5.getInt();
                    arrayList2.add(Integer.valueOf(i15));
                    if (i15 == i11) {
                        bArrI2 = i(byteBufferF5);
                    }
                } catch (IOException e13) {
                    e = e13;
                    throw new IOException("Failed to parse digest record #" + i14, e);
                } catch (BufferUnderflowException e14) {
                    e = e14;
                    throw new IOException("Failed to parse digest record #" + i14, e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iC3 = c(i11);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iC3), bArrI2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrI2)) {
                throw new SecurityException(d(iC3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferF6 = f(byteBufferF);
            ArrayList arrayList3 = new ArrayList();
            int i16 = 0;
            while (byteBufferF6.hasRemaining()) {
                i16++;
                byte[] bArrI4 = i(byteBufferF6);
                try {
                    arrayList3.add(new e0((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrI4)), bArrI4));
                } catch (CertificateException e15) {
                    throw new SecurityException("Failed to decode certificate #" + i16, e15);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrI, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e16) {
            e = e16;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e17) {
            e = e17;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e18) {
            e = e18;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e19) {
            e = e19;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e21) {
            e = e21;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }

    private static byte[][] k(int[] iArr, s[] sVarArr) throws DigestException {
        long j11;
        int i11;
        int length;
        char c11;
        int i12;
        String str;
        int i13 = 0;
        int i14 = 0;
        long jZza = 0;
        while (true) {
            j11 = 1048576;
            i11 = 3;
            if (i14 >= 3) {
                break;
            }
            jZza += (sVarArr[i14].zza() + 1048575) / 1048576;
            i14++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i15 = 0;
        while (true) {
            length = iArr.length;
            c11 = 5;
            i12 = 1;
            if (i15 >= length) {
                break;
            }
            int i16 = (int) jZza;
            byte[] bArr2 = new byte[(b(iArr[i15]) * i16) + 5];
            bArr2[0] = 90;
            g(i16, bArr2, 1);
            bArr[i15] = bArr2;
            i15++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i17 = 0;
        while (true) {
            str = " digest not supported";
            if (i17 >= iArr.length) {
                break;
            }
            String strD = d(iArr[i17]);
            try {
                messageDigestArr[i17] = MessageDigest.getInstance(strD);
                i17++;
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(strD.concat(" digest not supported"), e11);
            }
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i11) {
            s sVar = sVarArr[i18];
            int i21 = i18;
            long jZza2 = sVar.zza();
            byte[][] bArr4 = bArr;
            long j12 = 0;
            while (jZza2 > 0) {
                int i22 = i19;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j11);
                g(iMin, bArr3, i12);
                for (int i23 = 0; i23 < length; i23++) {
                    messageDigestArr[i23].update(bArr3);
                }
                try {
                    sVar.a(messageDigestArr, j12, iMin);
                    int i24 = 0;
                    while (i24 < iArr.length) {
                        int i25 = iArr[i24];
                        byte[] bArr5 = bArr4[i24];
                        int iB = b(i25);
                        char c12 = c11;
                        MessageDigest messageDigest = messageDigestArr[i24];
                        int iDigest = messageDigest.digest(bArr5, (i22 * iB) + 5, iB);
                        if (iDigest != iB) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i24++;
                        c11 = c12;
                    }
                    long j13 = iMin;
                    j12 += j13;
                    jZza2 -= j13;
                    i19 = i22 + 1;
                    str = str2;
                    j11 = 1048576;
                    i12 = 1;
                } catch (IOException e12) {
                    throw new DigestException("Failed to digest chunk #" + i22 + " of section #" + i13, e12);
                }
            }
            i13++;
            i18 = i21 + 1;
            bArr = bArr4;
            j11 = 1048576;
            i11 = 3;
            i12 = 1;
        }
        byte[][] bArr6 = bArr;
        String str3 = str;
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i26 = 0; i26 < iArr.length; i26++) {
            int i27 = iArr[i26];
            byte[] bArr8 = bArr6[i26];
            String strD2 = d(i27);
            try {
                bArr7[i26] = MessageDigest.getInstance(strD2).digest(bArr8);
            } catch (NoSuchAlgorithmException e13) {
                throw new RuntimeException(strD2.concat(str3), e13);
            }
        }
        return bArr7;
    }

    private static X509Certificate[][] l(FileChannel fileChannel, d0 d0Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferF = f(d0Var.f73631a);
                int i11 = 0;
                while (byteBufferF.hasRemaining()) {
                    i11++;
                    try {
                        arrayList.add(j(f(byteBufferF), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e11) {
                        throw new SecurityException("Failed to parse/verify signer #" + i11 + " block", e11);
                    }
                }
                if (i11 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                h(map, fileChannel, d0Var.f73632b, d0Var.f73633c, d0Var.f73634d, d0Var.f73635e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e12) {
                throw new SecurityException("Failed to read list of signers", e12);
            }
        } catch (CertificateException e13) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e13);
        }
    }
}
