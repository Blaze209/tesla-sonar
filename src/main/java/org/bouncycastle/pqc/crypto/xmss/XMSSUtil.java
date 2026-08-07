package org.bouncycastle.pqc.crypto.xmss;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes10.dex */
public class XMSSUtil {

    private static class CheckingStream extends ObjectInputStream {
        private static final Set components;
        private boolean found;
        private final Class mainClass;

        static {
            HashSet hashSet = new HashSet();
            components = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        CheckingStream(Class cls, InputStream inputStream) {
            super(inputStream);
            this.found = false;
            this.mainClass = cls;
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws InvalidClassException {
            if (this.found) {
                if (!components.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else {
                if (!objectStreamClass.getName().equals(this.mainClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
                this.found = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static boolean areEqual(byte[][] bArr, byte[][] bArr2) {
        if (hasNullPointer(bArr) || hasNullPointer(bArr2)) {
            throw new NullPointerException("a or b == null");
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (!Arrays.areEqual(bArr[i11], bArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static long bytesToXBigEndian(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        long j11 = 0;
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            j11 = (j11 << 8) | ((long) (bArr[i13] & 255));
        }
        return j11;
    }

    public static int calculateTau(int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (((i11 >> i13) & 1) == 0) {
                return i13;
            }
        }
        return 0;
    }

    public static byte[] cloneArray(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static void copyBytesAtOffset(byte[] bArr, byte[] bArr2, int i11) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("src == null");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i11 > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            bArr[i11 + i12] = bArr2[i12];
        }
    }

    public static Object deserialize(byte[] bArr, Class cls) throws ClassNotFoundException, IOException {
        CheckingStream checkingStream = new CheckingStream(cls, new ByteArrayInputStream(bArr));
        Object object = checkingStream.readObject();
        if (checkingStream.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        }
        if (cls.isInstance(object)) {
            return object;
        }
        throw new IOException("unexpected class found in ObjectInputStream");
    }

    public static void dumpByteArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException("x has null pointers");
        }
        for (byte[] bArr2 : bArr) {
            System.out.println(Hex.toHexString(bArr2));
        }
    }

    public static byte[] extractBytesAtOffset(byte[] bArr, int i11, int i12) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        if (i11 + i12 > bArr.length) {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
        byte[] bArr2 = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr2[i13] = bArr[i11 + i13];
        }
        return bArr2;
    }

    public static int getDigestSize(Digest digest) {
        if (digest == null) {
            throw new NullPointerException("digest == null");
        }
        String algorithmName = digest.getAlgorithmName();
        if (algorithmName.equals("SHAKE128")) {
            return 32;
        }
        if (algorithmName.equals("SHAKE256")) {
            return 64;
        }
        return digest.getDigestSize();
    }

    public static int getLeafIndex(long j11, int i11) {
        return (int) (j11 & ((1 << i11) - 1));
    }

    public static long getTreeIndex(long j11, int i11) {
        return j11 >> i11;
    }

    public static boolean hasNullPointer(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean isIndexValid(int i11, long j11) {
        if (j11 >= 0) {
            return j11 < (1 << i11);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean isNewAuthenticationPathNeeded(long j11, int i11, int i12) {
        return j11 != 0 && (j11 + 1) % ((long) Math.pow((double) (1 << i11), (double) i12)) == 0;
    }

    public static boolean isNewBDSInitNeeded(long j11, int i11, int i12) {
        return j11 != 0 && j11 % ((long) Math.pow((double) (1 << i11), (double) (i12 + 1))) == 0;
    }

    public static int log2(int i11) {
        int i12 = 0;
        while (true) {
            i11 >>= 1;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public static void longToBigEndian(long j11, byte[] bArr, int i11) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        }
        if (bArr.length - i11 < 8) {
            throw new IllegalArgumentException("not enough space in array");
        }
        bArr[i11] = (byte) ((j11 >> 56) & 255);
        bArr[i11 + 1] = (byte) ((j11 >> 48) & 255);
        bArr[i11 + 2] = (byte) ((j11 >> 40) & 255);
        bArr[i11 + 3] = (byte) ((j11 >> 32) & 255);
        bArr[i11 + 4] = (byte) ((j11 >> 24) & 255);
        bArr[i11 + 5] = (byte) ((j11 >> 16) & 255);
        bArr[i11 + 6] = (byte) ((j11 >> 8) & 255);
        bArr[i11 + 7] = (byte) (j11 & 255);
    }

    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] toBytesBigEndian(long j11, int i11) {
        byte[] bArr = new byte[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            bArr[i12] = (byte) j11;
            j11 >>>= 8;
        }
        return bArr;
    }

    public static byte[][] cloneArray(byte[][] bArr) {
        if (hasNullPointer(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte[] bArr3 = new byte[bArr[i11].length];
            bArr2[i11] = bArr3;
            byte[] bArr4 = bArr[i11];
            System.arraycopy(bArr4, 0, bArr3, 0, bArr4.length);
        }
        return bArr2;
    }
}
