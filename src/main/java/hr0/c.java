package hr0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class c extends lr0.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73409k;

    static {
        k();
    }

    public c() {
        super("url ");
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("DataEntryUrlBox.java", c.class);
        f73409k = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.DataEntryUrlBox", "", "", "", "java.lang.String"), 51);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
    }

    @Override // lr0.a
    protected long d() {
        return 4L;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73409k, this, this));
        return "DataEntryUrlBox[]";
    }
}
