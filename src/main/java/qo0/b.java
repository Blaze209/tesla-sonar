package qo0;

import jn0.m;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import ro0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0010\u0010\u0011R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0004\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lqo0/b;", "Lvo0/b;", "Lko0/a;", "<init>", "()V", "Luo0/c;", "decoder", "", "klassName", "Lro0/c;", "c", "(Luo0/c;Ljava/lang/String;)Lro0/c;", "Luo0/f;", "encoder", "value", "Lro0/q;", "f", "(Luo0/f;Lko0/a;)Lro0/q;", "Lro0/m;", "b", "Lkotlin/Lazy;", "g", "()Lro0/m;", "impl", "Lco0/d;", "e", "()Lco0/d;", "baseClass", "Lto0/f;", "getDescriptor", "()Lto0/f;", "getDescriptor$annotations", "descriptor", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends vo0.b<ko0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f105803a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Lazy impl = m.a(p.PUBLICATION, a.f105805c);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lro0/m;", "Lko0/a;", "b", "()Lro0/m;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<ro0.m<ko0.a>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f105805c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ro0.m<ko0.a> invoke() {
            return new ro0.m<>("kotlinx.datetime.DateTimeUnit", o0.b(ko0.a.class), new co0.d[]{o0.b(ko0.a.c.class), o0.b(ko0.a.d.class), o0.b(ko0.a.e.class)}, new ro0.d[]{d.f105806a, h.f105816a, i.f105820a});
        }
    }

    private b() {
    }

    private final ro0.m<ko0.a> g() {
        return (ro0.m) impl.getValue();
    }

    @Override // vo0.b
    public ro0.c<ko0.a> c(uo0.c decoder, String klassName) {
        s.k(decoder, "decoder");
        return g().c(decoder, klassName);
    }

    @Override // vo0.b
    public co0.d<ko0.a> e() {
        return o0.b(ko0.a.class);
    }

    @Override // vo0.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public q<ko0.a> d(uo0.f encoder, ko0.a value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        return g().d(encoder, value);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return g().getDescriptor();
    }
}
