package y20;

import ch.qos.logback.core.CoreConstants;
import jn0.h0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: y20.i, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0011B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00038GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0018"}, d2 = {"Ly20/i;", "", "Lkotlin/Function0;", "Lokio/k;", "toByteString", "<init>", "(Lwn0/a;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lwn0/a;", "b", "Lkotlin/Lazy;", "()Lokio/k;", "bytes", "c", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Snapshot {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<okio.k> toByteString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy bytes;

    /* JADX INFO: renamed from: y20.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ly20/i$a;", "", "<init>", "()V", "Lokio/k;", "byteString", "Ly20/i;", "a", "(Lokio/k;)Ly20/i;", "Lkotlin/Function0;", "lazy", "b", "(Lwn0/a;)Ly20/i;", "Lkotlin/Function1;", "Lokio/i;", "Ljn0/h0;", "c", "(Lwn0/l;)Ly20/i;", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: y20.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokio/k;", "b", "()Lokio/k;"}, k = 3, mv = {1, 6, 0})
        static final class C2694a extends p013kotlin.jvm.internal.u implements wn0.a<okio.k> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ okio.k f124689c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2694a(okio.k kVar) {
                super(0);
                this.f124689c = kVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final okio.k invoke() {
                return this.f124689c;
            }
        }

        /* JADX INFO: renamed from: y20.i$a$b */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokio/k;", "b", "()Lokio/k;"}, k = 3, mv = {1, 6, 0})
        static final class b extends p013kotlin.jvm.internal.u implements wn0.a<okio.k> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.l<okio.i, h0> f124690c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(wn0.l<? super okio.i, h0> lVar) {
                super(0);
                this.f124690c = lVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final okio.k invoke() {
                okio.h hVar = new okio.h();
                this.f124690c.invoke(hVar);
                return hVar.m1();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Snapshot a(okio.k byteString) {
            p013kotlin.jvm.internal.s.k(byteString, "byteString");
            return new Snapshot(new C2694a(byteString), null);
        }

        public final Snapshot b(wn0.a<? extends okio.k> lazy) {
            p013kotlin.jvm.internal.s.k(lazy, "lazy");
            return new Snapshot(lazy, null);
        }

        public final Snapshot c(wn0.l<? super okio.i, h0> lazy) {
            p013kotlin.jvm.internal.s.k(lazy, "lazy");
            return b(new b(lazy));
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: y20.i$b */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lokio/k;", "b", "()Lokio/k;"}, k = 3, mv = {1, 6, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<okio.k> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final okio.k invoke() {
            return (okio.k) Snapshot.this.toByteString.invoke();
        }
    }

    public /* synthetic */ Snapshot(wn0.a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final okio.k b() {
        return (okio.k) this.bytes.getValue();
    }

    public boolean equals(Object other) {
        Snapshot snapshot = other instanceof Snapshot ? (Snapshot) other : null;
        if (snapshot == null) {
            return false;
        }
        return p013kotlin.jvm.internal.s.f(b(), snapshot.b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return "Snapshot(" + b() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Snapshot(wn0.a<? extends okio.k> aVar) {
        this.toByteString = aVar;
        this.bytes = jn0.m.b(new b());
    }
}
