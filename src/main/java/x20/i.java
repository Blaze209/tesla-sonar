package x20;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.f;
import com.squareup.wire.f.a;
import com.squareup.wire.q;
import ezvcard.property.Gender;
import java.lang.reflect.Field;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B+\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00102\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010.R\u0014\u00104\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010*R\u0014\u00106\u001a\u00020(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000f0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lx20/i;", "Lcom/squareup/wire/f;", Gender.MALE, "Lcom/squareup/wire/f$a;", "B", "Lx20/b;", "Ljava/lang/reflect/Field;", "messageField", "Ljava/lang/Class;", "builderType", "Lcom/squareup/wire/h$a;", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Class;Lcom/squareup/wire/h$a;)V", "builder", "", "value", "Ljn0/h0;", "t", "(Lcom/squareup/wire/f$a;Ljava/lang/Object;)V", "s", "message", "p", "(Lcom/squareup/wire/f;)Ljava/lang/Object;", "q", "(Lcom/squareup/wire/f$a;)Ljava/lang/Object;", "b", "Ljava/lang/reflect/Field;", "builderField", "c", DateTokenConverter.CONVERTER_KEY, "Lcom/squareup/wire/h$a;", "", "j", "()I", "tag", "Lcom/squareup/wire/q$a;", "f", "()Lcom/squareup/wire/q$a;", AnnotatedPrivateKey.LABEL, "", "h", "()Z", "redacted", "", "k", "()Ljava/lang/String;", "wireFieldJsonName", "g", "name", "declaredName", "l", "isMap", "m", "isMessage", "", "r", "()Ljava/lang/Void;", "keyAdapter", "Lcom/squareup/wire/ProtoAdapter;", IntegerTokenConverter.CONVERTER_KEY, "()Lcom/squareup/wire/ProtoAdapter;", "singleAdapter", "wire-runtime"}, k = 1, mv = {1, 4, 0})
public final class i<M extends com.squareup.wire.f<M, B>, B extends com.squareup.wire.f.a<M, B>> extends b<M, B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Field builderField;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Field messageField;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.squareup.wire.h.a<?> key;

    public i(Field messageField, Class<B> builderType, com.squareup.wire.h.a<?> key) throws NoSuchFieldException {
        s.k(messageField, "messageField");
        s.k(builderType, "builderType");
        s.k(key, "key");
        this.messageField = messageField;
        this.key = key;
        Field declaredField = builderType.getDeclaredField(messageField.getName());
        s.j(declaredField, "builderType.getDeclaredField(messageField.name)");
        this.builderField = declaredField;
    }

    @Override // x20.b
    public String c() {
        return this.key.getDeclaredName();
    }

    @Override // x20.b
    public /* bridge */ /* synthetic */ ProtoAdapter e() {
        return (ProtoAdapter) r();
    }

    @Override // x20.b
    public q.a f() {
        return q.a.OPTIONAL;
    }

    @Override // x20.b
    public String g() {
        return this.key.getDeclaredName();
    }

    @Override // x20.b
    public boolean h() {
        return this.key.getRedacted();
    }

    @Override // x20.b
    public ProtoAdapter<Object> i() {
        ProtoAdapter<?> protoAdapterA = this.key.a();
        if (protoAdapterA != null) {
            return protoAdapterA;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
    }

    @Override // x20.b
    public int j() {
        return this.key.getTag();
    }

    @Override // x20.b
    public String k() {
        return this.key.getJsonName();
    }

    @Override // x20.b
    public boolean l() {
        return false;
    }

    @Override // x20.b
    public boolean m() {
        co0.d<?> type = i().getType();
        return com.squareup.wire.f.class.isAssignableFrom(type != null ? vn0.a.c(type) : null);
    }

    @Override // x20.b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Object a(M message) {
        s.k(message, "message");
        com.squareup.wire.h hVar = (com.squareup.wire.h) this.messageField.get(message);
        if (hVar != null) {
            return hVar.a(this.key);
        }
        return null;
    }

    @Override // x20.b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Object d(B builder) {
        s.k(builder, "builder");
        com.squareup.wire.h hVar = (com.squareup.wire.h) this.builderField.get(builder);
        if (hVar != null) {
            return hVar.a(this.key);
        }
        return null;
    }

    public Void r() {
        throw new IllegalStateException("not a map");
    }

    @Override // x20.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(B builder, Object value) throws IllegalAccessException {
        s.k(builder, "builder");
        Field field = this.builderField;
        com.squareup.wire.h.a<?> aVar = this.key;
        if (aVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.squareup.wire.OneOf.Key<kotlin.Any>");
        }
        s.h(value);
        field.set(builder, new com.squareup.wire.h(aVar, value));
    }

    @Override // x20.b
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void o(B builder, Object value) throws IllegalAccessException {
        s.k(builder, "builder");
        s.k(value, "value");
        n(builder, value);
    }
}
