package x20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.q;
import ezvcard.property.Gender;
import jn0.m;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0004\b\u000f\u0010\u000eR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u0014\u0010(\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0014\u0010,\u001a\u00020%8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010'R\u0018\u0010.\u001a\u0006\u0012\u0002\b\u00030\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0013R\u0018\u00100\u001a\u0006\u0012\u0002\b\u00030\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0013¨\u00061"}, d2 = {"Lx20/b;", Gender.MALE, "B", "", "<init>", "()V", "builder", "value", "Ljn0/h0;", "o", "(Ljava/lang/Object;Ljava/lang/Object;)V", "n", "message", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "Lcom/squareup/wire/ProtoAdapter;", "Lkotlin/Lazy;", "b", "()Lcom/squareup/wire/ProtoAdapter;", "adapter", "", "j", "()I", "tag", "Lcom/squareup/wire/q$a;", "f", "()Lcom/squareup/wire/q$a;", AnnotatedPrivateKey.LABEL, "", "h", "()Z", "redacted", "l", "isMap", "m", "isMessage", "", "g", "()Ljava/lang/String;", "name", "c", "declaredName", "k", "wireFieldJsonName", "e", "keyAdapter", IntegerTokenConverter.CONVERTER_KEY, "singleAdapter", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public abstract class b<M, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy adapter = m.b(new a());

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {Gender.MALE, "B", "Lcom/squareup/wire/ProtoAdapter;", "", "b", "()Lcom/squareup/wire/ProtoAdapter;"}, k = 3, mv = {1, 4, 0})
    static final class a extends u implements wn0.a<ProtoAdapter<Object>> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProtoAdapter<Object> invoke() {
            if (!b.this.l()) {
                ProtoAdapter<?> protoAdapterWithLabel$wire_runtime = b.this.i().withLabel$wire_runtime(b.this.f());
                if (protoAdapterWithLabel$wire_runtime != null) {
                    return protoAdapterWithLabel$wire_runtime;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            }
            ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
            ProtoAdapter<?> protoAdapterE = b.this.e();
            if (protoAdapterE == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            }
            ProtoAdapter<?> protoAdapterI = b.this.i();
            if (protoAdapterI == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
            }
            ProtoAdapter<Object> protoAdapterE2 = companion.e(protoAdapterE, protoAdapterI);
            if (protoAdapterE2 != null) {
                return protoAdapterE2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
        }
    }

    public abstract Object a(M message);

    public final ProtoAdapter<Object> b() {
        return (ProtoAdapter) this.adapter.getValue();
    }

    public abstract String c();

    public abstract Object d(B builder);

    public abstract ProtoAdapter<?> e();

    public abstract q.a f();

    public abstract String g();

    public abstract boolean h();

    public abstract ProtoAdapter<?> i();

    public abstract int j();

    public abstract String k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract void n(B builder, Object value);

    public abstract void o(B builder, Object value);
}
