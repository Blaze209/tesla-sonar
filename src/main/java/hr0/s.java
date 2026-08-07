package hr0;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
public class s extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static /* synthetic */ jq0.a.InterfaceC1785a f73499m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f73500k;

    static {
        k();
    }

    public s() {
        super("smhd");
    }

    private static /* synthetic */ void k() {
        mq0.b bVar = new mq0.b("SoundMediaHeaderBox.java", s.class);
        f73498l = bVar.f("method-execution", bVar.e("1", "getBalance", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "", InquiryField.FloatField.TYPE), 36);
        f73499m = bVar.f("method-execution", bVar.e("1", "toString", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    @Override // lr0.a
    public void a(ByteBuffer byteBuffer) {
        n(byteBuffer);
        this.f73500k = mr0.d.e(byteBuffer);
        mr0.d.h(byteBuffer);
    }

    @Override // lr0.a
    protected void b(ByteBuffer byteBuffer) {
        q(byteBuffer);
        mr0.e.c(byteBuffer, this.f73500k);
        mr0.e.e(byteBuffer, 0);
    }

    @Override // lr0.a
    protected long d() {
        return 8L;
    }

    public float r() {
        lr0.e.b().c(mq0.b.b(f73498l, this, this));
        return this.f73500k;
    }

    public String toString() {
        lr0.e.b().c(mq0.b.b(f73499m, this, this));
        return "SoundMediaHeaderBox[balance=" + r() + "]";
    }
}
