package cr0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import zq0.h;
import zq0.i;

/* JADX INFO: loaded from: classes10.dex */
public class f extends br0.g<org.jmrtd.lds.iso19794.b> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final zq0.f f59155h = new zq0.f(new a());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final zq0.g<org.jmrtd.lds.iso19794.b> f59156i = new zq0.g<>(new b());

    static class a implements zq0.b<org.jmrtd.lds.iso19794.b> {
        a() {
        }

        @Override // zq0.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public org.jmrtd.lds.iso19794.b a(InputStream inputStream, i iVar, int i11, int i12) {
            return new org.jmrtd.lds.iso19794.b(iVar, inputStream);
        }
    }

    static class b implements zq0.c<org.jmrtd.lds.iso19794.b> {
        b() {
        }

        @Override // zq0.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(org.jmrtd.lds.iso19794.b bVar, OutputStream outputStream) throws IOException {
            bVar.a(outputStream);
        }
    }

    public f(InputStream inputStream) {
        super(117, inputStream);
    }

    @Override // br0.e
    protected void e(InputStream inputStream) throws IOException {
        for (zq0.d dVar : f59155h.a(inputStream).b()) {
            if (!(dVar instanceof h)) {
                throw new IOException("Was expecting a SimpleCBEFFInfo, found " + dVar.getClass().getSimpleName());
            }
            zq0.a aVarA = ((h) dVar).a();
            if (!(aVarA instanceof org.jmrtd.lds.iso19794.b)) {
                throw new IOException("Was expecting a FaceInfo, found " + aVarA.getClass().getSimpleName());
            }
            h((org.jmrtd.lds.iso19794.b) aVarA);
        }
    }

    @Override // br0.e
    protected void g(OutputStream outputStream) throws IOException {
        zq0.e eVar = new zq0.e();
        Iterator<org.jmrtd.lds.iso19794.b> it = i().iterator();
        while (it.hasNext()) {
            eVar.a(new h(it.next()));
        }
        f59156i.a(eVar, outputStream);
    }

    public List<org.jmrtd.lds.iso19794.b> j() {
        return i();
    }

    @Override // br0.g
    public String toString() {
        return "DG2File [" + super.toString() + "]";
    }
}
