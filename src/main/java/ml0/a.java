package ml0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@jn0.e
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u0000 +2\u00020\u0001:\u0001,B,\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR(\u0010&\u001a\u0004\u0018\u00010\u00002\b\u0010#\u001a\u0004\u0018\u00010\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\fR\u0011\u0010*\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lml0/a;", "Lll0/a;", "Ljl0/c;", "memory", "origin", "Lnl0/f;", "parentPool", "<init>", "(Ljava/nio/ByteBuffer;Lml0/a;Lnl0/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chunk", "Ljn0/h0;", "y", "(Lml0/a;)V", "z", "()Lml0/a;", "A", "pool", "E", "(Lnl0/f;)V", "H", "()V", "x", "I", "", Gender.FEMALE, "()Z", "r", "h", "Lnl0/f;", "getParentPool$ktor_io", "()Lnl0/f;", "<set-?>", IntegerTokenConverter.CONVERTER_KEY, "Lml0/a;", "C", "newValue", "B", "G", "next", "", "D", "()I", "referenceCount", "j", DateTokenConverter.CONVERTER_KEY, "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class a extends ll0.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f92329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f92330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final nl0.f<a> f92331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f92332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final nl0.f<a> f92333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final nl0.f<a> f92334p;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final nl0.f<a> parentPool;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private a origin;
    private volatile /* synthetic */ Object nextRef;
    private volatile /* synthetic */ int refCount;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ml0/a$b", "Lnl0/e;", "Lml0/a;", "c", "()Lml0/a;", "instance", "Ljn0/h0;", "n", "(Lml0/a;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends nl0.e<a> {
        b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // nl0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a S2() {
            return new a(jl0.b.f83979a.b(4096), null, this, 0 == true ? 1 : 0);
        }

        @Override // nl0.e, nl0.f
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void F1(a instance) {
            s.k(instance, "instance");
            jl0.b.f83979a.a(instance.getMemory());
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ml0/a$c", "Lnl0/e;", "Lml0/a;", "c", "()Lml0/a;", "instance", "Ljn0/h0;", "n", "(Lml0/a;)V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends nl0.e<a> {
        c() {
        }

        @Override // nl0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a S2() {
            throw new UnsupportedOperationException("This pool doesn't support borrow");
        }

        @Override // nl0.e, nl0.f
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void F1(a instance) {
            s.k(instance, "instance");
        }
    }

    /* JADX INFO: renamed from: ml0.a$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lml0/a$d;", "", "<init>", "()V", "Lnl0/f;", "Lml0/a;", "c", "()Lnl0/f;", "Pool", "EmptyPool", "Lnl0/f;", "b", "Empty", "Lml0/a;", "a", "()Lml0/a;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f92332n;
        }

        public final nl0.f<a> b() {
            return a.f92331m;
        }

        public final nl0.f<a> c() {
            return ll0.c.a();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C1972a c1972a = new C1972a();
        f92331m = c1972a;
        f92332n = new a(jl0.c.INSTANCE.a(), 0 == true ? 1 : 0, c1972a, 0 == true ? 1 : 0);
        f92333o = new b();
        f92334p = new c();
        f92329k = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "nextRef");
        f92330l = AtomicIntegerFieldUpdater.newUpdater(a.class, "refCount");
    }

    public /* synthetic */ a(ByteBuffer byteBuffer, a aVar, nl0.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteBuffer, aVar, fVar);
    }

    private final void y(a chunk) {
        if (!androidx.concurrent.futures.b.a(f92329k, this, null, chunk)) {
            throw new IllegalStateException("This chunk has already a next chunk.");
        }
    }

    public a A() {
        a aVar = this.origin;
        if (aVar == null) {
            aVar = this;
        }
        aVar.x();
        a aVar2 = new a(getMemory(), aVar, this.parentPool, null);
        e(aVar2);
        return aVar2;
    }

    public final a B() {
        return (a) this.nextRef;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final a getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int getRefCount() {
        return this.refCount;
    }

    public void E(nl0.f<a> pool) {
        s.k(pool, "pool");
        if (F()) {
            a aVar = this.origin;
            if (aVar != null) {
                H();
                aVar.E(pool);
            } else {
                nl0.f<a> fVar = this.parentPool;
                if (fVar != null) {
                    pool = fVar;
                }
                pool.F1(this);
            }
        }
    }

    public final boolean F() {
        int i11;
        int i12;
        do {
            i11 = this.refCount;
            if (i11 <= 0) {
                throw new IllegalStateException("Unable to release: it is already released.");
            }
            i12 = i11 - 1;
        } while (!f92330l.compareAndSet(this, i11, i12));
        return i12 == 0;
    }

    public final void G(a aVar) {
        if (aVar == null) {
            z();
        } else {
            y(aVar);
        }
    }

    public final void H() {
        if (!f92330l.compareAndSet(this, 0, -1)) {
            throw new IllegalStateException("Unable to unlink: buffer is in use.");
        }
        z();
        this.origin = null;
    }

    public final void I() {
        int i11;
        do {
            i11 = this.refCount;
            if (i11 < 0) {
                throw new IllegalStateException("This instance is already disposed and couldn't be borrowed.");
            }
            if (i11 > 0) {
                throw new IllegalStateException("This instance is already in use but somehow appeared in the pool.");
            }
        } while (!f92330l.compareAndSet(this, i11, 1));
    }

    @Override // ll0.a
    public final void r() {
        if (this.origin != null) {
            throw new IllegalArgumentException("Unable to reset buffer with origin");
        }
        super.r();
        this.nextRef = null;
    }

    public final void x() {
        int i11;
        do {
            i11 = this.refCount;
            if (i11 <= 0) {
                throw new IllegalStateException("Unable to acquire chunk: it is already released.");
            }
        } while (!f92330l.compareAndSet(this, i11, i11 + 1));
    }

    public final a z() {
        return (a) f92329k.getAndSet(this, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private a(ByteBuffer memory, a aVar, nl0.f<a> fVar) {
        super(memory, null);
        s.k(memory, "memory");
        this.parentPool = fVar;
        if (aVar == this) {
            throw new IllegalArgumentException("A chunk couldn't be a view of itself.");
        }
        this.nextRef = null;
        this.refCount = 1;
        this.origin = aVar;
    }

    /* JADX INFO: renamed from: ml0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ml0/a$a", "Lnl0/f;", "Lml0/a;", "c", "()Lml0/a;", "instance", "Ljn0/h0;", "n", "(Lml0/a;)V", "dispose", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1972a implements nl0.f<a> {
        C1972a() {
        }

        @Override // nl0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a S2() {
            return a.INSTANCE.a();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            nl0.f.a.a(this);
        }

        @Override // nl0.f
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void F1(a instance) {
            s.k(instance, "instance");
            if (instance != a.INSTANCE.a()) {
                throw new IllegalArgumentException("Only ChunkBuffer.Empty instance could be recycled.");
            }
        }

        @Override // nl0.f
        public void dispose() {
        }
    }
}
