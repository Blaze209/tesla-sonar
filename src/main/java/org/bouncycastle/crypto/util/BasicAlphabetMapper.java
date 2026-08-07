package org.bouncycastle.crypto.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AlphabetMapper;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes9.dex */
public class BasicAlphabetMapper implements AlphabetMapper {
    private Map<Integer, Character> charMap;
    private Map<Character, Integer> indexMap;

    public BasicAlphabetMapper(String str) {
        this(str.toCharArray());
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public char[] convertToChars(byte[] bArr) {
        int i11 = 0;
        if (this.charMap.size() <= 256) {
            char[] cArr = new char[bArr.length];
            while (i11 != bArr.length) {
                cArr[i11] = this.charMap.get(Integer.valueOf(bArr[i11] & 255)).charValue();
                i11++;
            }
            return cArr;
        }
        if ((bArr.length & 1) != 0) {
            throw new IllegalArgumentException("two byte radix and input string odd length");
        }
        char[] cArr2 = new char[bArr.length / 2];
        while (i11 != bArr.length) {
            cArr2[i11 / 2] = this.charMap.get(Integer.valueOf(((bArr[i11] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | (bArr[i11 + 1] & 255))).charValue();
            i11 += 2;
        }
        return cArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public byte[] convertToIndexes(char[] cArr) {
        int i11 = 0;
        if (this.indexMap.size() <= 256) {
            byte[] bArr = new byte[cArr.length];
            while (i11 != cArr.length) {
                bArr[i11] = this.indexMap.get(Character.valueOf(cArr[i11])).byteValue();
                i11++;
            }
            return bArr;
        }
        byte[] bArr2 = new byte[cArr.length * 2];
        while (i11 != cArr.length) {
            int iIntValue = this.indexMap.get(Character.valueOf(cArr[i11])).intValue();
            int i12 = i11 * 2;
            bArr2[i12] = (byte) ((iIntValue >> 8) & 255);
            bArr2[i12 + 1] = (byte) (iIntValue & 255);
            i11++;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public int getRadix() {
        return this.indexMap.size();
    }

    public BasicAlphabetMapper(char[] cArr) {
        this.indexMap = new HashMap();
        this.charMap = new HashMap();
        for (int i11 = 0; i11 != cArr.length; i11++) {
            if (this.indexMap.containsKey(Character.valueOf(cArr[i11]))) {
                throw new IllegalArgumentException("duplicate key detected in alphabet: " + cArr[i11]);
            }
            this.indexMap.put(Character.valueOf(cArr[i11]), Integer.valueOf(i11));
            this.charMap.put(Integer.valueOf(i11), Character.valueOf(cArr[i11]));
        }
    }
}
