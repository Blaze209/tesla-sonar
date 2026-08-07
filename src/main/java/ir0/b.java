package ir0;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import gr0.h;
import java.nio.ByteBuffer;
import lr0.e;

/* JADX INFO: loaded from: classes10.dex */
public class b extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81809s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81810t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81811u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81812v;

    static {
        k();
    }

    public b() {
        super("esds");
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("ESDescriptorBox.java", b.class);
        f81809s = bVar.f("method-execution", bVar.e("1", "getEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor"), 36);
        f81810t = bVar.f("method-execution", bVar.e("1", "setEsDescriptor", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"), 40);
        f81811u = bVar.f("method-execution", bVar.e("1", "equals", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "java.lang.Object", "o", "", InquiryField.BooleanField.TYPE), 45);
        f81812v = bVar.f("method-execution", bVar.e("1", "hashCode", "org.mp4parser.boxes.iso14496.part14.ESDescriptorBox", "", "", "", "int"), 56);
    }

    @Override // ir0.a, lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        h hVarT = t();
        if (hVarT != null) {
            byteBuffer.put((ByteBuffer) hVarT.g().rewind());
        } else {
            byteBuffer.put(this.f81808l.duplicate());
        }
    }

    @Override // ir0.a, lr0.a
    protected long d() {
        h hVarT = t();
        return (hVarT != null ? hVarT.b() : this.f81808l.remaining()) + 4;
    }

    public boolean equals(Object obj) {
        e.b().c(mq0.b.c(f81811u, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f81808l;
        ByteBuffer byteBuffer2 = ((b) obj).f81808l;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    public int hashCode() {
        e.b().c(mq0.b.b(f81812v, this, this));
        ByteBuffer byteBuffer = this.f81808l;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public h t() {
        e.b().c(mq0.b.b(f81809s, this, this));
        return (h) super.r();
    }

    public void u(h hVar) {
        e.b().c(mq0.b.c(f81810t, this, this, hVar));
        super.s(hVar);
    }
}
