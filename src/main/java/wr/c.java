package wr;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f122344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f122345b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f122344a = byteArrayOutputStream;
        this.f122345b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f122344a.reset();
        try {
            b(this.f122345b, aVar.f122338a);
            String str = aVar.f122339b;
            if (str == null) {
                str = "";
            }
            b(this.f122345b, str);
            this.f122345b.writeLong(aVar.f122340c);
            this.f122345b.writeLong(aVar.f122341d);
            this.f122345b.write(aVar.f122342e);
            this.f122345b.flush();
            return this.f122344a.toByteArray();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }
}
