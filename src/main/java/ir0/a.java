package ir0;

import gr0.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import lr0.c;
import lr0.e;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
public class a extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static Logger f81801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81802n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f81806r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected gr0.b f81807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected ByteBuffer f81808l;

    static {
        k();
        f81801m = LoggerFactory.getLogger(a.class.getName());
    }

    public a(String str) {
        super(str);
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("AbstractDescriptorBox.java", a.class);
        f81802n = bVar.f("method-execution", bVar.e("1", "getData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.nio.ByteBuffer"), 43);
        f81803o = bVar.f("method-execution", bVar.e("1", "setData", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "", "void"), 47);
        f81804p = bVar.f("method-execution", bVar.e("1", "getDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor"), 63);
        f81805q = bVar.f("method-execution", bVar.e("1", "setDescriptor", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor", "descriptor", "", "void"), 67);
        f81806r = bVar.f("method-execution", bVar.e("1", "getDescriptorAsString", "org.mp4parser.boxes.iso14496.part14.AbstractDescriptorBox", "", "", "", "java.lang.String"), 71);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        this.f81808l = byteBuffer.slice();
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
        try {
            this.f81808l.rewind();
            this.f81807k = l.a(-1, this.f81808l.duplicate());
        } catch (IOException e11) {
            f81801m.warn("Error parsing ObjectDescriptor", (Throwable) e11);
        } catch (IndexOutOfBoundsException e12) {
            f81801m.warn("Error parsing ObjectDescriptor", (Throwable) e12);
        }
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        this.f81808l.rewind();
        byteBuffer.put(this.f81808l);
    }

    @Override // lr0.a
    protected long d() {
        return this.f81808l.limit() + 4;
    }

    public gr0.b r() {
        e.b().c(mq0.b.b(f81804p, this, this));
        return this.f81807k;
    }

    public void s(gr0.b bVar) {
        e.b().c(mq0.b.c(f81805q, this, this, bVar));
        this.f81807k = bVar;
    }
}
