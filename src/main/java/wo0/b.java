package wo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import xo0.a1;
import xo0.g0;
import xo0.q0;
import xo0.t0;
import xo0.u0;
import xo0.x0;
import xo0.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00122\u00020\u0001:\u0001\u001cB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\b\b\u0001\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b\u001c\u0010!R \u0010(\u001a\u00020\"8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%\u0082\u0001\u0002)*¨\u0006+"}, d2 = {"Lwo0/b;", "Lro0/t;", "Lwo0/f;", "configuration", "Lyo0/c;", "serializersModule", "<init>", "(Lwo0/f;Lyo0/c;)V", "T", "Lro0/q;", "serializer", "value", "", "b", "(Lro0/q;Ljava/lang/Object;)Ljava/lang/String;", "Lro0/c;", "deserializer", InquiryField.StringField.TYPE, DateTokenConverter.CONVERTER_KEY, "(Lro0/c;Ljava/lang/String;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "e", "(Lro0/q;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;", "element", "c", "(Lro0/c;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "h", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "a", "Lwo0/f;", "f", "()Lwo0/f;", "Lyo0/c;", "()Lyo0/c;", "Lxo0/v;", "Lxo0/v;", "g", "()Lxo0/v;", "get_schemaCache$kotlinx_serialization_json$annotations", "()V", "_schemaCache", "Lwo0/b$a;", "Lwo0/t;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b implements ro0.t {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final JsonConfiguration configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo0.c serializersModule;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xo0.v _schemaCache;

    /* JADX INFO: renamed from: wo0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwo0/b$a;", "Lwo0/b;", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion extends b {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), yo0.d.a(), null);
        }
    }

    public /* synthetic */ b(JsonConfiguration fVar, yo0.c cVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, cVar);
    }

    @Override // ro0.n
    /* JADX INFO: renamed from: a, reason: from getter */
    public yo0.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // ro0.t
    public final <T> String b(ro0.q<? super T> serializer, T value) {
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        g0 g0Var = new g0();
        try {
            xo0.f0.a(this, g0Var, serializer, value);
            return g0Var.toString();
        } finally {
            g0Var.g();
        }
    }

    public final <T> T c(ro0.c<? extends T> deserializer, JsonElement element) {
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        p013kotlin.jvm.internal.s.k(element, "element");
        return (T) x0.a(this, element, deserializer);
    }

    public final <T> T d(ro0.c<? extends T> deserializer, String string) {
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        p013kotlin.jvm.internal.s.k(string, "string");
        t0 t0VarA = u0.a(this, string);
        T t11 = (T) new q0(this, a1.OBJ, t0VarA, deserializer.getDescriptor(), null).o(deserializer);
        t0VarA.v();
        return t11;
    }

    public final <T> JsonElement e(ro0.q<? super T> serializer, T value) {
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        return z0.d(this, value, serializer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final JsonConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final xo0.v get_schemaCache() {
        return this._schemaCache;
    }

    public final JsonElement h(String string) {
        p013kotlin.jvm.internal.s.k(string, "string");
        return (JsonElement) d(q.f122156a, string);
    }

    private b(JsonConfiguration fVar, yo0.c cVar) {
        this.configuration = fVar;
        this.serializersModule = cVar;
        this._schemaCache = new xo0.v();
    }
}
