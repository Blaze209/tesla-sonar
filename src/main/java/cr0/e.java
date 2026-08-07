package cr0;

import br0.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class e extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f59154e;

    public e(InputStream inputStream) {
        super(97, inputStream);
    }

    @Override // br0.e
    protected void e(InputStream inputStream) throws IOException {
        ap0.b bVar = inputStream instanceof ap0.b ? (ap0.b) inputStream : new ap0.b(inputStream);
        bVar.p(24351);
        this.f59154e = new g(bVar, bVar.c());
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass().equals(getClass())) {
            return this.f59154e.equals(((e) obj).f59154e);
        }
        return false;
    }

    @Override // br0.e
    protected void g(OutputStream outputStream) throws IOException {
        ap0.d dVar = outputStream instanceof ap0.d ? (ap0.d) outputStream : new ap0.d(outputStream);
        dVar.n(24351);
        dVar.o(this.f59154e.getEncoded());
    }

    public g h() {
        return this.f59154e;
    }

    public int hashCode() {
        return (this.f59154e.hashCode() * 3) + 57;
    }

    public String toString() {
        return "DG1File " + this.f59154e.toString().replaceAll("\n", "").trim();
    }
}
