package h9;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f71720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f71721b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f71720a = byteArrayOutputStream;
        this.f71721b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f71720a.reset();
        try {
            b(this.f71721b, aVar.f71714a);
            String str = aVar.f71715b;
            if (str == null) {
                str = "";
            }
            b(this.f71721b, str);
            this.f71721b.writeLong(aVar.f71716c);
            this.f71721b.writeLong(aVar.f71717d);
            this.f71721b.write(aVar.f71718e);
            this.f71721b.flush();
            return this.f71720a.toByteArray();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }
}
