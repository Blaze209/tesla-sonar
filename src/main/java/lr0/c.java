package lr0;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c extends a implements fr0.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f90678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f90679j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f90680g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f90681h;

    static {
        k();
    }

    protected c(String str) {
        super(str);
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("AbstractFullBox.java", c.class);
        f90678i = bVar.f("method-execution", bVar.e("1", "setVersion", "org.mp4parser.support.AbstractFullBox", "int", "version", "", "void"), 50);
        f90679j = bVar.f("method-execution", bVar.e("1", "setFlags", "org.mp4parser.support.AbstractFullBox", "int", "flags", "", "void"), 63);
    }

    public int l() {
        if (!this.f90673c) {
            j();
        }
        return this.f90681h;
    }

    public int m() {
        if (!this.f90673c) {
            j();
        }
        return this.f90680g;
    }

    protected final long n(ByteBuffer byteBuffer) {
        this.f90680g = mr0.d.l(byteBuffer);
        this.f90681h = mr0.d.i(byteBuffer);
        return 4L;
    }

    public void o(int i11) {
        e.b().c(mq0.b.c(f90679j, this, this, lq0.a.d(i11)));
        this.f90681h = i11;
    }

    public void p(int i11) {
        e.b().c(mq0.b.c(f90678i, this, this, lq0.a.d(i11)));
        this.f90680g = i11;
    }

    protected final void q(ByteBuffer byteBuffer) {
        mr0.e.i(byteBuffer, this.f90680g);
        mr0.e.f(byteBuffer, this.f90681h);
    }
}
