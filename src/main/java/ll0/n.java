package ll0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lll0/n;", "Lnl0/c;", "Lml0/a;", "", "bufferSize", "capacity", "Ljl0/a;", "allocator", "<init>", "(IILjl0/a;)V", "c0", "()Lml0/a;", "instance", "Ljn0/h0;", "b0", "(Lml0/a;)V", "e0", "T", "(Lml0/a;)Lml0/a;", "h", "I", IntegerTokenConverter.CONVERTER_KEY, "Ljl0/a;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class n extends nl0.c<ml0.a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int bufferSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final jl0.a allocator;

    public /* synthetic */ n(int i11, int i12, jl0.a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 4096 : i11, (i13 & 2) != 0 ? 1000 : i12, (i13 & 4) != 0 ? jl0.b.f83979a : aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ml0.a o(ml0.a instance) {
        p013kotlin.jvm.internal.s.k(instance, "instance");
        ml0.a aVar = (ml0.a) super.o(instance);
        aVar.I();
        aVar.r();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.c
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void p(ml0.a instance) {
        p013kotlin.jvm.internal.s.k(instance, "instance");
        this.allocator.a(instance.getMemory());
        super.p(instance);
        instance.H();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.c
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public ml0.a B() {
        return new ml0.a(this.allocator.b(this.bufferSize), null, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nl0.c
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void J(ml0.a instance) {
        p013kotlin.jvm.internal.s.k(instance, "instance");
        super.J(instance);
        if (instance.getMemory().limit() != this.bufferSize) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Buffer size mismatch. Expected: ");
            sb2.append(this.bufferSize);
            sb2.append(", actual: ");
            sb2.append(instance.getMemory().limit());
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (instance == ml0.a.INSTANCE.a()) {
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled");
        }
        if (instance == a.INSTANCE.a()) {
            throw new IllegalStateException("Empty instance couldn't be recycled");
        }
        if (instance.getRefCount() != 0) {
            throw new IllegalStateException("Unable to clear buffer: it is still in use.");
        }
        if (instance.B() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.");
        }
        if (instance.getOrigin() != null) {
            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i11, int i12, jl0.a allocator) {
        super(i12);
        p013kotlin.jvm.internal.s.k(allocator, "allocator");
        this.bufferSize = i11;
        this.allocator = allocator;
    }
}
