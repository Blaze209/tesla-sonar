package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f13084a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f13085b = {112, 114, 109, 0};

    private static void A(@NonNull byte[] bArr, int i11, int i12, @NonNull d dVar) {
        int iM = m(i11, i12, dVar.f13072g);
        int i13 = iM / 8;
        bArr[i13] = (byte) ((1 << (iM % 8)) | bArr[i13]);
    }

    private static void B(@NonNull InputStream inputStream) {
        e.h(inputStream);
        int iJ = e.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            e.j(inputStream);
            for (int iJ2 = e.j(inputStream); iJ2 > 0; iJ2--) {
                e.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean C(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, n.f13097a)) {
            P(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, n.f13098b)) {
            O(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, n.f13100d)) {
            M(outputStream, dVarArr);
            return true;
        }
        if (Arrays.equals(bArr, n.f13099c)) {
            N(outputStream, dVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, n.f13101e)) {
            return false;
        }
        L(outputStream, dVarArr);
        return true;
    }

    private static void D(@NonNull OutputStream outputStream, @NonNull d dVar) throws IOException {
        int[] iArr = dVar.f13073h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            e.p(outputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
    }

    private static o E(@NonNull d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            e.p(byteArrayOutputStream, dVarArr.length);
            int i11 = 2;
            for (d dVar : dVarArr) {
                e.q(byteArrayOutputStream, dVar.f13068c);
                e.q(byteArrayOutputStream, dVar.f13069d);
                e.q(byteArrayOutputStream, dVar.f13072g);
                String strJ = j(dVar.f13066a, dVar.f13067b, n.f13097a);
                int iK = e.k(strJ);
                e.p(byteArrayOutputStream, iK);
                i11 = i11 + 14 + iK;
                e.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i11 == byteArray.length) {
                o oVar = new o(f.DEX_FILES, i11, byteArray, false);
                byteArrayOutputStream.close();
                return oVar;
            }
            throw e.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    static void F(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f13084a);
        outputStream.write(bArr);
    }

    private static void G(@NonNull OutputStream outputStream, @NonNull d dVar) throws IOException {
        K(outputStream, dVar);
        D(outputStream, dVar);
        I(outputStream, dVar);
    }

    private static void H(@NonNull OutputStream outputStream, @NonNull d dVar, @NonNull String str) throws IOException {
        e.p(outputStream, e.k(str));
        e.p(outputStream, dVar.f13070e);
        e.q(outputStream, dVar.f13071f);
        e.q(outputStream, dVar.f13068c);
        e.q(outputStream, dVar.f13072g);
        e.n(outputStream, str);
    }

    private static void I(@NonNull OutputStream outputStream, @NonNull d dVar) throws IOException {
        byte[] bArr = new byte[k(dVar.f13072g)];
        for (Map.Entry<Integer, Integer> entry : dVar.f13074i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                A(bArr, 2, iIntValue, dVar);
            }
            if ((iIntValue2 & 4) != 0) {
                A(bArr, 4, iIntValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void J(@NonNull OutputStream outputStream, int i11, @NonNull d dVar) throws IOException {
        byte[] bArr = new byte[l(i11, dVar.f13072g)];
        for (Map.Entry<Integer, Integer> entry : dVar.f13074i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i11) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (dVar.f13072g * i12) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        outputStream.write(bArr);
    }

    private static void K(@NonNull OutputStream outputStream, @NonNull d dVar) throws IOException {
        int i11 = 0;
        for (Map.Entry<Integer, Integer> entry : dVar.f13074i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                e.p(outputStream, iIntValue - i11);
                e.p(outputStream, 0);
                i11 = iIntValue;
            }
        }
    }

    private static void L(@NonNull OutputStream outputStream, @NonNull d[] dVarArr) throws IOException {
        e.p(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            String strJ = j(dVar.f13066a, dVar.f13067b, n.f13101e);
            e.p(outputStream, e.k(strJ));
            e.p(outputStream, dVar.f13074i.size());
            e.p(outputStream, dVar.f13073h.length);
            e.q(outputStream, dVar.f13068c);
            e.n(outputStream, strJ);
            Iterator<Integer> it = dVar.f13074i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, it.next().intValue());
            }
            for (int i11 : dVar.f13073h) {
                e.p(outputStream, i11);
            }
        }
    }

    private static void M(@NonNull OutputStream outputStream, @NonNull d[] dVarArr) throws IOException {
        e.r(outputStream, dVarArr.length);
        for (d dVar : dVarArr) {
            int size = dVar.f13074i.size() * 4;
            String strJ = j(dVar.f13066a, dVar.f13067b, n.f13100d);
            e.p(outputStream, e.k(strJ));
            e.p(outputStream, dVar.f13073h.length);
            e.q(outputStream, size);
            e.q(outputStream, dVar.f13068c);
            e.n(outputStream, strJ);
            Iterator<Integer> it = dVar.f13074i.keySet().iterator();
            while (it.hasNext()) {
                e.p(outputStream, it.next().intValue());
                e.p(outputStream, 0);
            }
            for (int i11 : dVar.f13073h) {
                e.p(outputStream, i11);
            }
        }
    }

    private static void N(@NonNull OutputStream outputStream, @NonNull d[] dVarArr) throws IOException {
        byte[] bArrB = b(dVarArr, n.f13099c);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, bArrB);
    }

    private static void O(@NonNull OutputStream outputStream, @NonNull d[] dVarArr) throws IOException {
        byte[] bArrB = b(dVarArr, n.f13098b);
        e.r(outputStream, dVarArr.length);
        e.m(outputStream, bArrB);
    }

    private static void P(@NonNull OutputStream outputStream, @NonNull d[] dVarArr) throws IOException {
        Q(outputStream, dVarArr);
    }

    private static void Q(@NonNull OutputStream outputStream, @NonNull d[] dVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(dVarArr));
        arrayList.add(c(dVarArr));
        arrayList.add(d(dVarArr));
        long length2 = ((long) n.f13097a.length) + ((long) f13084a.length) + 4 + ((long) (arrayList.size() * 16));
        e.q(outputStream, arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o oVar = (o) arrayList.get(i11);
            e.q(outputStream, oVar.f13104a.getValue());
            e.q(outputStream, length2);
            if (oVar.f13107d) {
                byte[] bArr = oVar.f13106c;
                long length3 = bArr.length;
                byte[] bArrB = e.b(bArr);
                arrayList2.add(bArrB);
                e.q(outputStream, bArrB.length);
                e.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(oVar.f13106c);
                e.q(outputStream, oVar.f13106c.length);
                e.q(outputStream, 0L);
                length = oVar.f13106c.length;
            }
            length2 += (long) length;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            outputStream.write((byte[]) arrayList2.get(i12));
        }
    }

    private static int a(@NonNull d dVar) {
        Iterator<Map.Entry<Integer, Integer>> it = dVar.f13074i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    @NonNull
    private static byte[] b(@NonNull d[] dVarArr, @NonNull byte[] bArr) throws IOException {
        int i11 = 0;
        int iK = 0;
        for (d dVar : dVarArr) {
            iK += e.k(j(dVar.f13066a, dVar.f13067b, bArr)) + 16 + (dVar.f13070e * 2) + dVar.f13071f + k(dVar.f13072g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, n.f13099c)) {
            int length = dVarArr.length;
            while (i11 < length) {
                d dVar2 = dVarArr[i11];
                H(byteArrayOutputStream, dVar2, j(dVar2.f13066a, dVar2.f13067b, bArr));
                G(byteArrayOutputStream, dVar2);
                i11++;
            }
        } else {
            for (d dVar3 : dVarArr) {
                H(byteArrayOutputStream, dVar3, j(dVar3.f13066a, dVar3.f13067b, bArr));
            }
            int length2 = dVarArr.length;
            while (i11 < length2) {
                G(byteArrayOutputStream, dVarArr[i11]);
                i11++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw e.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static o c(@NonNull d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            try {
                d dVar = dVarArr[i12];
                e.p(byteArrayOutputStream, i12);
                e.p(byteArrayOutputStream, dVar.f13070e);
                i11 = i11 + 4 + (dVar.f13070e * 2);
                D(byteArrayOutputStream, dVar);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            o oVar = new o(f.CLASSES, i11, byteArray, true);
            byteArrayOutputStream.close();
            return oVar;
        }
        throw e.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
    }

    private static o d(@NonNull d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        for (int i12 = 0; i12 < dVarArr.length; i12++) {
            try {
                d dVar = dVarArr[i12];
                int iA = a(dVar);
                byte[] bArrE = e(iA, dVar);
                byte[] bArrF = f(dVar);
                e.p(byteArrayOutputStream, i12);
                int length = bArrE.length + 2 + bArrF.length;
                e.q(byteArrayOutputStream, length);
                e.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i11 = i11 + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            o oVar = new o(f.METHODS, i11, byteArray, true);
            byteArrayOutputStream.close();
            return oVar;
        }
        throw e.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(int i11, @NonNull d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i11, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static byte[] f(@NonNull d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    private static String g(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @NonNull
    private static String h(@NonNull String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static d i(@NonNull d[] dVarArr, @NonNull String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i11 = 0; i11 < dVarArr.length; i11++) {
            if (dVarArr[i11].f13067b.equals(strH)) {
                return dVarArr[i11];
            }
        }
        return null;
    }

    @NonNull
    private static String j(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String strA = n.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + n.a(bArr) + str2;
    }

    private static int k(int i11) {
        return z(i11 * 2) / 8;
    }

    private static int l(int i11, int i12) {
        return z(Integer.bitCount(i11 & (-2)) * i12) / 8;
    }

    private static int m(int i11, int i12, int i13) {
        if (i11 == 1) {
            throw e.c("HOT methods are not stored in the bitmap");
        }
        if (i11 == 2) {
            return i12;
        }
        if (i11 == 4) {
            return i12 + i13;
        }
        throw e.c("Unexpected flag: " + i11);
    }

    private static int[] n(@NonNull InputStream inputStream, int i11) {
        int[] iArr = new int[i11];
        int iH = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iH += e.h(inputStream);
            iArr[i12] = iH;
        }
        return iArr;
    }

    private static int o(@NonNull BitSet bitSet, int i11, int i12) {
        int i13 = bitSet.get(m(2, i11, i12)) ? 2 : 0;
        return bitSet.get(m(4, i11, i12)) ? i13 | 4 : i13;
    }

    static byte[] p(@NonNull InputStream inputStream, @NonNull byte[] bArr) {
        if (Arrays.equals(bArr, e.d(inputStream, bArr.length))) {
            return e.d(inputStream, n.f13098b.length);
        }
        throw e.c("Invalid magic");
    }

    private static void q(@NonNull InputStream inputStream, @NonNull d dVar) {
        int iAvailable = inputStream.available() - dVar.f13071f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += e.h(inputStream);
            dVar.f13074i.put(Integer.valueOf(iH), 1);
            for (int iH2 = e.h(inputStream); iH2 > 0; iH2--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw e.c("Read too much data during profile line parse");
        }
    }

    @NonNull
    static d[] r(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, d[] dVarArr) {
        if (Arrays.equals(bArr, n.f13102f)) {
            if (Arrays.equals(n.f13097a, bArr2)) {
                throw e.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, dVarArr);
        }
        if (Arrays.equals(bArr, n.f13103g)) {
            return u(inputStream, bArr2, dVarArr);
        }
        throw e.c("Unsupported meta version");
    }

    @NonNull
    static d[] s(@NonNull InputStream inputStream, @NonNull byte[] bArr, d[] dVarArr) throws IOException {
        if (!Arrays.equals(bArr, n.f13102f)) {
            throw e.c("Unsupported meta version");
        }
        int iJ = e.j(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrT = t(byteArrayInputStream, iJ, dVarArr);
            byteArrayInputStream.close();
            return dVarArrT;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    private static d[] t(@NonNull InputStream inputStream, int i11, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i11 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i11];
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = e.h(inputStream);
            iArr[i12] = e.h(inputStream);
            strArr[i12] = e.f(inputStream, iH);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            d dVar = dVarArr[i13];
            if (!dVar.f13067b.equals(strArr[i13])) {
                throw e.c("Order of dexfiles in metadata did not match baseline");
            }
            int i14 = iArr[i13];
            dVar.f13070e = i14;
            dVar.f13073h = n(inputStream, i14);
        }
        return dVarArr;
    }

    @NonNull
    static d[] u(@NonNull InputStream inputStream, @NonNull byte[] bArr, d[] dVarArr) throws IOException {
        int iH = e.h(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrV = v(byteArrayInputStream, bArr, iH, dVarArr);
            byteArrayInputStream.close();
            return dVarArrV;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    private static d[] v(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i11, d[] dVarArr) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        if (i11 != dVarArr.length) {
            throw e.c("Mismatched number of dex files found in metadata");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            e.h(inputStream);
            String strF = e.f(inputStream, e.h(inputStream));
            long jI = e.i(inputStream);
            int iH = e.h(inputStream);
            d dVarI = i(dVarArr, strF);
            if (dVarI == null) {
                throw e.c("Missing profile key: " + strF);
            }
            dVarI.f13069d = jI;
            int[] iArrN = n(inputStream, iH);
            if (Arrays.equals(bArr, n.f13101e)) {
                dVarI.f13070e = iH;
                dVarI.f13073h = iArrN;
            }
        }
        return dVarArr;
    }

    private static void w(@NonNull InputStream inputStream, @NonNull d dVar) {
        BitSet bitSetValueOf = BitSet.valueOf(e.d(inputStream, e.a(dVar.f13072g * 2)));
        int i11 = 0;
        while (true) {
            int i12 = dVar.f13072g;
            if (i11 >= i12) {
                return;
            }
            int iO = o(bitSetValueOf, i11, i12);
            if (iO != 0) {
                Integer num = dVar.f13074i.get(Integer.valueOf(i11));
                if (num == null) {
                    num = 0;
                }
                dVar.f13074i.put(Integer.valueOf(i11), Integer.valueOf(iO | num.intValue()));
            }
            i11++;
        }
    }

    @NonNull
    static d[] x(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, n.f13098b)) {
            throw e.c("Unsupported version");
        }
        int iJ = e.j(inputStream);
        byte[] bArrE = e.e(inputStream, (int) e.i(inputStream), (int) e.i(inputStream));
        if (inputStream.read() > 0) {
            throw e.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            d[] dVarArrY = y(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return dVarArrY;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    private static d[] y(@NonNull InputStream inputStream, @NonNull String str, int i11) {
        if (inputStream.available() == 0) {
            return new d[0];
        }
        d[] dVarArr = new d[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = e.h(inputStream);
            int iH2 = e.h(inputStream);
            dVarArr[i12] = new d(str, e.f(inputStream, iH), e.i(inputStream), 0L, iH2, (int) e.i(inputStream), (int) e.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i13 = 0; i13 < i11; i13++) {
            d dVar = dVarArr[i13];
            q(inputStream, dVar);
            dVar.f13073h = n(inputStream, dVar.f13070e);
            w(inputStream, dVar);
        }
        return dVarArr;
    }

    private static int z(int i11) {
        return (i11 + 7) & (-8);
    }
}
