package qh;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f105512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f105513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f105514c;

        public b() {
            this.f105512a = new int[256];
        }
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i11 = 0; i11 < 256; i11++) {
            bVar.f105512a[i11] = i11;
        }
        bVar.f105513b = 0;
        bVar.f105514c = 0;
        int length = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = bVar.f105512a;
                int i14 = iArr[i13];
                i12 = ((cCharAt + i14) + i12) % 256;
                iArr[i13] = iArr[i12];
                iArr[i12] = i14;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return bVar;
    }

    public static byte[] b(byte[] bArr) {
        b bVarA;
        if (bArr == null || (bVarA = a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return c(bArr, bVarA);
    }

    public static byte[] c(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int i11 = bVar.f105513b;
        int i12 = bVar.f105514c;
        for (int i13 = 0; i13 < bArr.length; i13++) {
            i11 = (i11 + 1) % 256;
            int[] iArr = bVar.f105512a;
            int i14 = iArr[i11];
            i12 = (i12 + i14) % 256;
            iArr[i11] = iArr[i12];
            iArr[i12] = i14;
            int i15 = (iArr[i11] + i14) % 256;
            bArr[i13] = (byte) (iArr[i15] ^ bArr[i13]);
        }
        bVar.f105513b = i11;
        bVar.f105514c = i12;
        return bArr;
    }
}
