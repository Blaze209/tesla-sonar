package q9;

import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;
import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f105062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f105063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f105064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final UUID[] f105065d;

        a(UUID uuid, int i11, byte[] bArr, UUID[] uuidArr) {
            this.f105062a = uuid;
            this.f105063b = i11;
            this.f105064c = bArr;
            this.f105065d = uuidArr;
        }
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        c0 c0Var = new c0(bArr);
        if (c0Var.j() < 32) {
            return null;
        }
        c0Var.b0(0);
        int iA = c0Var.a();
        int iV = c0Var.v();
        if (iV != iA) {
            s7.t.i("PsshAtomUtil", "Advertised atom size (" + iV + ") does not match buffer size: " + iA);
            return null;
        }
        int iV2 = c0Var.v();
        if (iV2 != 1886614376) {
            s7.t.i("PsshAtomUtil", "Atom type is not pssh: " + iV2);
            return null;
        }
        int iQ = b.q(c0Var.v());
        if (iQ > 1) {
            s7.t.i("PsshAtomUtil", "Unsupported pssh version: " + iQ);
            return null;
        }
        UUID uuid = new UUID(c0Var.F(), c0Var.F());
        if (iQ == 1) {
            int iQ2 = c0Var.Q();
            uuidArr = new UUID[iQ2];
            for (int i11 = 0; i11 < iQ2; i11++) {
                uuidArr[i11] = new UUID(c0Var.F(), c0Var.F());
            }
        } else {
            uuidArr = null;
        }
        int iQ3 = c0Var.Q();
        int iA2 = c0Var.a();
        if (iQ3 == iA2) {
            byte[] bArr2 = new byte[iQ3];
            c0Var.q(bArr2, 0, iQ3);
            return new a(uuid, iQ, bArr2, uuidArr);
        }
        s7.t.i("PsshAtomUtil", "Atom data size (" + iQ3 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f105062a)) {
            return aVarD.f105064c;
        }
        s7.t.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f105062a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f105062a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f105063b;
    }
}
