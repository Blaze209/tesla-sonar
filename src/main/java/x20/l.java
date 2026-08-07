package x20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.f;
import com.squareup.wire.f.a;
import com.squareup.wire.o;
import ezvcard.property.Gender;
import java.io.EOFException;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001*\u0014\b\u0001\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005BU\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J1\u0010(\u001a\u00020\u001b2\u0006\u0010 \u001a\u00028\u00012\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001b2\u0006\u0010 \u001a\u00028\u0001H\u0016¢\u0006\u0004\b*\u0010+R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R2\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Lx20/l;", "Lcom/squareup/wire/f;", Gender.MALE, "Lcom/squareup/wire/f$a;", "B", "Lx20/g;", "Lco0/d;", "messageType", "Ljava/lang/Class;", "builderType", "", "", "Lx20/b;", "fields", "", "typeUrl", "Lcom/squareup/wire/o;", "syntax", "<init>", "(Lco0/d;Ljava/lang/Class;Ljava/util/Map;Ljava/lang/String;Lcom/squareup/wire/o;)V", "message", "Lokio/k;", "o", "(Lcom/squareup/wire/f;)Lokio/k;", "l", "(Lcom/squareup/wire/f;)I", "size", "Ljn0/h0;", "n", "(Lcom/squareup/wire/f;I)V", "m", "()Lcom/squareup/wire/f$a;", "builder", "j", "(Lcom/squareup/wire/f$a;)Lcom/squareup/wire/f;", "tag", "Lcom/squareup/wire/b;", "fieldEncoding", "", "value", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/squareup/wire/f$a;ILcom/squareup/wire/b;Ljava/lang/Object;)V", "k", "(Lcom/squareup/wire/f$a;)V", "a", "Lco0/d;", "h", "()Lco0/d;", "b", "Ljava/lang/Class;", "c", "Ljava/util/Map;", "getFields", "()Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getTypeUrl", "()Ljava/lang/String;", "e", "Lcom/squareup/wire/o;", "getSyntax", "()Lcom/squareup/wire/o;", "wire-runtime"}, k = 1, mv = {1, 4, 0})
final class l<M extends com.squareup.wire.f<M, B>, B extends com.squareup.wire.f.a<M, B>> implements g<M, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<M> messageType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Class<B> builderType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, b<M, B>> fields;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String typeUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o syntax;

    /* JADX WARN: Multi-variable type inference failed */
    public l(co0.d<M> messageType, Class<B> builderType, Map<Integer, ? extends b<M, B>> fields, String str, o syntax) {
        s.k(messageType, "messageType");
        s.k(builderType, "builderType");
        s.k(fields, "fields");
        s.k(syntax, "syntax");
        this.messageType = messageType;
        this.builderType = builderType;
        this.fields = fields;
        this.typeUrl = str;
        this.syntax = syntax;
    }

    @Override // x20.g
    public Map<Integer, b<M, B>> getFields() {
        return this.fields;
    }

    @Override // x20.g
    public o getSyntax() {
        return this.syntax;
    }

    @Override // x20.g
    public String getTypeUrl() {
        return this.typeUrl;
    }

    @Override // x20.g
    public co0.d<M> h() {
        return this.messageType;
    }

    @Override // x20.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(B builder, int tag, com.squareup.wire.b fieldEncoding, Object value) {
        s.k(builder, "builder");
        s.k(fieldEncoding, "fieldEncoding");
        builder.a(tag, fieldEncoding, value);
    }

    @Override // x20.g
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public M b(B builder) {
        s.k(builder, "builder");
        return (M) builder.b();
    }

    @Override // x20.g
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void a(B builder) throws EOFException {
        s.k(builder, "builder");
        builder.c();
    }

    @Override // x20.g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int d(M message) {
        s.k(message, "message");
        return message.getCachedSerializedSize();
    }

    @Override // x20.g
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public B g() throws IllegalAccessException, InstantiationException {
        B bNewInstance = this.builderType.newInstance();
        s.j(bNewInstance, "builderType.newInstance()");
        return bNewInstance;
    }

    @Override // x20.g
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void f(M message, int size) {
        s.k(message, "message");
        message.setCachedSerializedSize$wire_runtime(size);
    }

    @Override // x20.g
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public okio.k e(M message) {
        s.k(message, "message");
        return message.unknownFields();
    }
}
