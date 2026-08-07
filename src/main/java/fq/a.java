package fq;

import com.github.mangstadt.vinnie.codec.DecoderException;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BitSet f66325b = new BitSet(256);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f66326a;

    static {
        for (int i11 = 33; i11 <= 60; i11++) {
            f66325b.set(i11);
        }
        for (int i12 = 62; i12 <= 126; i12++) {
            f66325b.set(i12);
        }
        BitSet bitSet = f66325b;
        bitSet.set(9);
        bitSet.set(32);
    }

    public a(String str) {
        this.f66326a = str;
    }

    private static int b(byte b11) throws DecoderException {
        int iDigit = Character.digit((char) b11, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b11));
    }

    public String a(String str) throws DecoderException {
        try {
            byte[] bytes = str.getBytes("US-ASCII");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i11 = 0;
            while (i11 < bytes.length) {
                byte b11 = bytes[i11];
                if (b11 == 61) {
                    try {
                        int iB = b(bytes[i11 + 1]);
                        i11 += 2;
                        byteArrayOutputStream.write((char) ((iB << 4) + b(bytes[i11])));
                    } catch (ArrayIndexOutOfBoundsException e11) {
                        throw new DecoderException("Invalid quoted-printable encoding", e11);
                    }
                } else {
                    byteArrayOutputStream.write(b11);
                }
                i11++;
            }
            try {
                return new String(byteArrayOutputStream.toByteArray(), this.f66326a);
            } catch (UnsupportedEncodingException e12) {
                throw new DecoderException(e12);
            }
        } catch (UnsupportedEncodingException e13) {
            throw new DecoderException(e13);
        }
    }
}
