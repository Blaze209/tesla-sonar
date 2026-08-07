package xo0;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"Lxo0/x;", "Luo0/a;", "Lxo0/a;", "lexer", "Lwo0/b;", "json", "<init>", "(Lxo0/a;Lwo0/b;)V", "Lto0/f;", "descriptor", "", "A", "(Lto0/f;)I", "z", "()I", "", "h", "()J", "", "H", "()B", "", "k", "()S", "a", "Lxo0/a;", "Lyo0/c;", "b", "Lyo0/c;", "()Lyo0/c;", "serializersModule", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x extends uo0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JsonReader lexer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo0.c serializersModule;

    public x(JsonReader lexer, wo0.b json) {
        p013kotlin.jvm.internal.s.k(lexer, "lexer");
        p013kotlin.jvm.internal.s.k(json, "json");
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
    }

    @Override // uo0.c
    public int A(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // uo0.a, uo0.e
    public byte H() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            return p013kotlin.text.n0.a(strQ);
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'UByte' for input '" + strQ + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // uo0.e, uo0.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public yo0.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // uo0.a, uo0.e
    public long h() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            return p013kotlin.text.n0.h(strQ);
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'ULong' for input '" + strQ + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // uo0.a, uo0.e
    public short k() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            return p013kotlin.text.n0.k(strQ);
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'UShort' for input '" + strQ + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // uo0.a, uo0.e
    public int z() {
        JsonReader jsonReader = this.lexer;
        String strQ = jsonReader.q();
        try {
            return p013kotlin.text.n0.d(strQ);
        } catch (IllegalArgumentException unused) {
            JsonReader.x(jsonReader, "Failed to parse type 'UInt' for input '" + strQ + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
