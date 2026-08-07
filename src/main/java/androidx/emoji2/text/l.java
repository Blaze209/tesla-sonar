package androidx.emoji2.text;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes.dex */
class l {

    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final ByteBuffer f8326a;

        a(@NonNull ByteBuffer byteBuffer) {
            this.f8326a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.l.c
        public void a(int i11) {
            ByteBuffer byteBuffer = this.f8326a;
            byteBuffer.position(byteBuffer.position() + i11);
        }

        @Override // androidx.emoji2.text.l.c
        public int b() {
            return this.f8326a.getInt();
        }

        @Override // androidx.emoji2.text.l.c
        public long c() {
            return l.c(this.f8326a.getInt());
        }

        @Override // androidx.emoji2.text.l.c
        public long getPosition() {
            return this.f8326a.position();
        }

        @Override // androidx.emoji2.text.l.c
        public int readUnsignedShort() {
            return l.d(this.f8326a.getShort());
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f8327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f8328b;

        b(long j11, long j12) {
            this.f8327a = j11;
            this.f8328b = j12;
        }

        long a() {
            return this.f8327a;
        }
    }

    private interface c {
        void a(int i11);

        int b();

        long c();

        long getPosition();

        int readUnsignedShort();
    }

    private static b a(c cVar) throws IOException {
        long jC;
        cVar.a(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.a(6);
        int i11 = 0;
        while (true) {
            if (i11 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iB = cVar.b();
            cVar.a(4);
            jC = cVar.c();
            cVar.a(4);
            if (1835365473 == iB) {
                break;
            }
            i11++;
        }
        if (jC != -1) {
            cVar.a((int) (jC - cVar.getPosition()));
            cVar.a(12);
            long jC2 = cVar.c();
            for (int i12 = 0; i12 < jC2; i12++) {
                int iB2 = cVar.b();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iB2 || 1701669481 == iB2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static d7.b b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return d7.b.h(byteBufferDuplicate);
    }

    static long c(int i11) {
        return ((long) i11) & 4294967295L;
    }

    static int d(short s11) {
        return s11 & HPKE.aead_EXPORT_ONLY;
    }
}
