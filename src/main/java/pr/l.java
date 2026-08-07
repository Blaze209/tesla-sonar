package pr;

import java.nio.ByteBuffer;
import java.util.UUID;
import okhttp3.internal.http2.Http2Connection;
import ts.d0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UUID f103868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f103869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f103870c;

        public a(UUID uuid, int i11, byte[] bArr) {
            this.f103868a = uuid;
            this.f103869b = i11;
            this.f103870c = bArr;
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
        if (bArr != null && bArr.length != 0) {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    private static a d(byte[] bArr) {
        d0 d0Var = new d0(bArr);
        if (d0Var.g() < 32) {
            return null;
        }
        d0Var.U(0);
        if (d0Var.q() != d0Var.a() + 4 || d0Var.q() != 1886614376) {
            return null;
        }
        int iC = pr.a.c(d0Var.q());
        if (iC > 1) {
            u.i("PsshAtomUtil", "Unsupported pssh version: " + iC);
            return null;
        }
        UUID uuid = new UUID(d0Var.A(), d0Var.A());
        if (iC == 1) {
            d0Var.V(d0Var.L() * 16);
        }
        int iL = d0Var.L();
        if (iL != d0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iL];
        d0Var.l(bArr2, 0, iL);
        return new a(uuid, iC, bArr2);
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (uuid.equals(aVarD.f103868a)) {
            return aVarD.f103870c;
        }
        u.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f103868a + ".");
        return null;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f103868a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f103869b;
    }
}
