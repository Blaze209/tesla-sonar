package hr0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b extends lr0.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73408k;

    static {
        k();
    }

    public b(String str) {
        super(str);
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("ChunkOffsetBox.java", b.class);
        f73408k = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public abstract long[] r();

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73408k, this, this));
        return getClass().getSimpleName() + "[entryCount=" + r().length + "]";
    }
}
