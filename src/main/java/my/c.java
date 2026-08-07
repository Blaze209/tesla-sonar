package my;

import com.google.zxing.WriterException;
import com.plaid.internal.EnumC4419g;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f92537a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f92538b = StandardCharsets.ISO_8859_1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92539a;

        static {
            int[] iArr = new int[ly.b.values().length];
            f92539a = iArr;
            try {
                iArr[ly.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92539a[ly.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92539a[ly.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92539a[ly.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, iy.a aVar, Charset charset) {
        for (byte b11 : str.getBytes(charset)) {
            aVar.c(b11, 8);
        }
    }

    static void b(CharSequence charSequence, iy.a aVar) throws WriterException {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int iP = p(charSequence.charAt(i11));
            if (iP == -1) {
                throw new WriterException();
            }
            int i12 = i11 + 1;
            if (i12 < length) {
                int iP2 = p(charSequence.charAt(i12));
                if (iP2 == -1) {
                    throw new WriterException();
                }
                aVar.c((iP * 45) + iP2, 11);
                i11 += 2;
            } else {
                aVar.c(iP, 6);
                i11 = i12;
            }
        }
    }

    static void c(String str, ly.b bVar, iy.a aVar, Charset charset) {
        int i11 = a.f92539a[bVar.ordinal()];
        if (i11 == 1) {
            h(str, aVar);
            return;
        }
        if (i11 == 2) {
            b(str, aVar);
            return;
        }
        if (i11 == 3) {
            a(str, aVar, charset);
        } else {
            if (i11 == 4) {
                e(str, aVar);
                return;
            }
            throw new WriterException("Invalid mode: " + bVar);
        }
    }

    private static void d(iy.c cVar, iy.a aVar) {
        aVar.c(ly.b.ECI.getBits(), 4);
        aVar.c(cVar.getValue(), 8);
    }

    static void e(String str, iy.a aVar) throws WriterException {
        int i11;
        Charset charset = iy.e.f81953b;
        if (charset == null) {
            throw new WriterException("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new WriterException("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i12 = 0; i12 < length; i12 += 2) {
            int i13 = ((bytes[i12] & 255) << 8) | (bytes[i12 + 1] & 255);
            int i14 = 33088;
            if (i13 >= 33088 && i13 <= 40956) {
                i11 = i13 - i14;
            } else if (i13 < 57408 || i13 > 60351) {
                i11 = -1;
            } else {
                i14 = 49472;
                i11 = i13 - i14;
            }
            if (i11 == -1) {
                throw new WriterException("Invalid byte sequence");
            }
            aVar.c(((i11 >> 8) * 192) + (i11 & 255), 13);
        }
    }

    static void f(int i11, ly.c cVar, ly.b bVar, iy.a aVar) throws WriterException {
        int characterCountBits = bVar.getCharacterCountBits(cVar);
        int i12 = 1 << characterCountBits;
        if (i11 < i12) {
            aVar.c(i11, characterCountBits);
            return;
        }
        throw new WriterException(i11 + " is bigger than " + (i12 - 1));
    }

    static void g(ly.b bVar, iy.a aVar) {
        aVar.c(bVar.getBits(), 4);
    }

    static void h(CharSequence charSequence, iy.a aVar) {
        int length = charSequence.length();
        int i11 = 0;
        while (i11 < length) {
            int iCharAt = charSequence.charAt(i11) - '0';
            int i12 = i11 + 2;
            if (i12 < length) {
                aVar.c((iCharAt * 100) + ((charSequence.charAt(i11 + 1) - '0') * 10) + (charSequence.charAt(i12) - '0'), 10);
                i11 += 3;
            } else {
                i11++;
                if (i11 < length) {
                    aVar.c((iCharAt * 10) + (charSequence.charAt(i11) - '0'), 7);
                    i11 = i12;
                } else {
                    aVar.c(iCharAt, 4);
                }
            }
        }
    }

    private static int i(ly.b bVar, iy.a aVar, iy.a aVar2, ly.c cVar) {
        return aVar.g() + bVar.getCharacterCountBits(cVar) + aVar2.g();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(iy.a aVar, ly.a aVar2, ly.c cVar, b bVar) throws WriterException {
        int i11 = Integer.MAX_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < 8; i13++) {
            e.a(aVar, aVar2, cVar, i13, bVar);
            int iJ = j(bVar);
            if (iJ < i11) {
                i12 = i13;
                i11 = iJ;
            }
        }
        return i12;
    }

    private static ly.b l(String str, Charset charset) {
        Charset charset2 = iy.e.f81953b;
        if (charset2 != null && charset2.equals(charset) && s(str)) {
            return ly.b.KANJI;
        }
        boolean z11 = false;
        boolean z12 = false;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z12 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return ly.b.BYTE;
                }
                z11 = true;
            }
        }
        if (z11) {
            return ly.b.ALPHANUMERIC;
        }
        return z12 ? ly.b.NUMERIC : ly.b.BYTE;
    }

    private static ly.c m(int i11, ly.a aVar) throws WriterException {
        for (int i12 = 1; i12 <= 40; i12++) {
            ly.c cVarE = ly.c.e(i12);
            if (v(i11, cVarE, aVar)) {
                return cVarE;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static g n(String str, ly.a aVar, Map<com.google.zxing.b, ?> map) throws WriterException {
        boolean z11;
        boolean z12;
        ly.c cVarT;
        ly.b bVar;
        ly.c cVarE;
        iy.a aVar2;
        iy.c characterSetECI;
        int iK;
        boolean z13 = false;
        if (map != null) {
            com.google.zxing.b bVar2 = com.google.zxing.b.GS1_FORMAT;
            if (map.containsKey(bVar2) && Boolean.parseBoolean(map.get(bVar2).toString())) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (map != null) {
            com.google.zxing.b bVar3 = com.google.zxing.b.QR_COMPACT;
            if (map.containsKey(bVar3) && Boolean.parseBoolean(map.get(bVar3).toString())) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        Charset charsetForName = f92538b;
        if (map != null && map.containsKey(com.google.zxing.b.CHARACTER_SET)) {
            z13 = true;
        }
        if (z13) {
            try {
                charsetForName = Charset.forName(map.get(com.google.zxing.b.CHARACTER_SET).toString());
            } catch (UnsupportedCharsetException unused) {
            }
        }
        if (z12) {
            bVar = ly.b.BYTE;
            if (charsetForName.equals(f92538b)) {
                charsetForName = null;
            }
            f.c cVarH = f.h(str, null, charsetForName, z11, aVar);
            aVar2 = new iy.a();
            cVarH.b(aVar2);
            cVarE = cVarH.e();
        } else {
            ly.b bVarL = l(str, charsetForName);
            iy.a aVar3 = new iy.a();
            ly.b bVar4 = ly.b.BYTE;
            if (bVarL == bVar4 && z13 && (characterSetECI = iy.c.getCharacterSetECI(charsetForName)) != null) {
                d(characterSetECI, aVar3);
            }
            if (z11) {
                g(ly.b.FNC1_FIRST_POSITION, aVar3);
            }
            g(bVarL, aVar3);
            iy.a aVar4 = new iy.a();
            c(str, bVarL, aVar4, charsetForName);
            if (map != null) {
                com.google.zxing.b bVar5 = com.google.zxing.b.QR_VERSION;
                if (map.containsKey(bVar5)) {
                    cVarT = ly.c.e(Integer.parseInt(map.get(bVar5).toString()));
                    if (!v(i(bVarL, aVar3, aVar4, cVarT), cVarT, aVar)) {
                        throw new WriterException("Data too big for requested version");
                    }
                } else {
                    cVarT = t(aVar, bVarL, aVar3, aVar4);
                }
            } else {
                cVarT = t(aVar, bVarL, aVar3, aVar4);
            }
            iy.a aVar5 = new iy.a();
            aVar5.b(aVar3);
            f(bVarL == bVar4 ? aVar4.h() : str.length(), cVarT, bVarL, aVar5);
            aVar5.b(aVar4);
            bVar = bVarL;
            cVarE = cVarT;
            aVar2 = aVar5;
        }
        ly.c.b bVarC = cVarE.c(aVar);
        int iD = cVarE.d() - bVarC.d();
        u(iD, aVar2);
        iy.a aVarR = r(aVar2, cVarE.d(), iD, bVarC.c());
        g gVar = new g();
        gVar.c(aVar);
        gVar.f(bVar);
        gVar.g(cVarE);
        int iB = cVarE.b();
        b bVar6 = new b(iB, iB);
        if (map != null) {
            com.google.zxing.b bVar7 = com.google.zxing.b.QR_MASK_PATTERN;
            if (map.containsKey(bVar7)) {
                iK = Integer.parseInt(map.get(bVar7).toString());
                if (!g.b(iK)) {
                    iK = -1;
                }
            } else {
                iK = -1;
            }
        } else {
            iK = -1;
        }
        if (iK == -1) {
            iK = k(aVarR, aVar, cVarE, bVar6);
        }
        gVar.d(iK);
        e.a(aVarR, aVar, cVarE, iK, bVar6);
        gVar.e(bVar6);
        return gVar;
    }

    static byte[] o(byte[] bArr, int i11) {
        int length = bArr.length;
        int[] iArr = new int[length + i11];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = bArr[i12] & 255;
        }
        new jy.c(jy.a.f84417l).b(iArr, i11);
        byte[] bArr2 = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i13] = (byte) iArr[length + i13];
        }
        return bArr2;
    }

    static int p(int i11) {
        int[] iArr = f92537a;
        if (i11 < iArr.length) {
            return iArr[i11];
        }
        return -1;
    }

    static void q(int i11, int i12, int i13, int i14, int[] iArr, int[] iArr2) throws WriterException {
        if (i14 >= i13) {
            throw new WriterException("Block ID too large");
        }
        int i15 = i11 % i13;
        int i16 = i13 - i15;
        int i17 = i11 / i13;
        int i18 = i17 + 1;
        int i19 = i12 / i13;
        int i21 = i19 + 1;
        int i22 = i17 - i19;
        int i23 = i18 - i21;
        if (i22 != i23) {
            throw new WriterException("EC bytes mismatch");
        }
        if (i13 != i16 + i15) {
            throw new WriterException("RS blocks mismatch");
        }
        if (i11 != ((i19 + i22) * i16) + ((i21 + i23) * i15)) {
            throw new WriterException("Total bytes mismatch");
        }
        if (i14 < i16) {
            iArr[0] = i19;
            iArr2[0] = i22;
        } else {
            iArr[0] = i21;
            iArr2[0] = i23;
        }
    }

    static iy.a r(iy.a aVar, int i11, int i12, int i13) throws WriterException {
        if (aVar.h() != i12) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i13);
        int i14 = 0;
        int i15 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i14 < i13) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i16 = i11;
            int i17 = i12;
            int i18 = i13;
            q(i16, i17, i18, i14, iArr, iArr2);
            int i19 = iArr[0];
            byte[] bArr = new byte[i19];
            aVar.j(i15 * 8, bArr, 0, i19);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new my.a(bArr, bArrO));
            iMax = Math.max(iMax, i19);
            iMax2 = Math.max(iMax2, bArrO.length);
            i15 += iArr[0];
            i14++;
            i11 = i16;
            i12 = i17;
            i13 = i18;
        }
        int i21 = i11;
        if (i12 != i15) {
            throw new WriterException("Data bytes does not match offset");
        }
        iy.a aVar2 = new iy.a();
        for (int i22 = 0; i22 < iMax; i22++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((my.a) it.next()).a();
                if (i22 < bArrA.length) {
                    aVar2.c(bArrA[i22], 8);
                }
            }
        }
        for (int i23 = 0; i23 < iMax2; i23++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((my.a) it2.next()).b();
                if (i23 < bArrB.length) {
                    aVar2.c(bArrB[i23], 8);
                }
            }
        }
        if (i21 == aVar2.h()) {
            return aVar2;
        }
        throw new WriterException("Interleaving error: " + i21 + " and " + aVar2.h() + " differ.");
    }

    static boolean s(String str) {
        byte[] bytes = str.getBytes(iy.e.f81953b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11 += 2) {
            int i12 = bytes[i11] & 255;
            if ((i12 < 129 || i12 > 159) && (i12 < 224 || i12 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static ly.c t(ly.a aVar, ly.b bVar, iy.a aVar2, iy.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, ly.c.e(1)), aVar)), aVar);
    }

    static void u(int i11, iy.a aVar) throws WriterException {
        int i12 = i11 * 8;
        if (aVar.g() > i12) {
            throw new WriterException("data bits cannot fit in the QR Code" + aVar.g() + " > " + i12);
        }
        for (int i13 = 0; i13 < 4 && aVar.g() < i12; i13++) {
            aVar.a(false);
        }
        int iG = aVar.g() & 7;
        if (iG > 0) {
            while (iG < 8) {
                aVar.a(false);
                iG++;
            }
        }
        int iH = i11 - aVar.h();
        for (int i14 = 0; i14 < iH; i14++) {
            aVar.c((i14 & 1) == 0 ? EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE : 17, 8);
        }
        if (aVar.g() != i12) {
            throw new WriterException("Bits size does not equal capacity");
        }
    }

    static boolean v(int i11, ly.c cVar, ly.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i11 + 7) / 8;
    }
}
