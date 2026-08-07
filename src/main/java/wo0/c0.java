package wo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lwo0/c0;", "Lro0/d;", "Lkotlinx/serialization/json/JsonObject;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lkotlinx/serialization/json/JsonObject;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lkotlinx/serialization/json/JsonObject;", "Lto0/f;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 implements ro0.d<JsonObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f122112a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final to0.f descriptor = a.f122114b;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0097\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\u00020\u00068\u0016X\u0097D¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u00128VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00128VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0014\u0010$\u001a\u00020\u00048\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lwo0/c0$a;", "Lto0/f;", "<init>", "()V", "", "index", "", "f", "(I)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;)I", "", "", "g", "(I)Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "(I)Lto0/f;", "", IntegerTokenConverter.CONVERTER_KEY, "(I)Z", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "getSerialName$annotations", "serialName", "Lto0/n;", "getKind", "()Lto0/n;", "kind", "b", "()Z", "isNullable", "isInline", "e", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a implements to0.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f122114b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final String serialName = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ to0.f f122116a = so0.a.i(so0.a.F(t0.f86535a), q.f122156a).getDescriptor();

        private a() {
        }

        @Override // to0.f
        public boolean b() {
            return this.f122116a.b();
        }

        @Override // to0.f
        public int c(String name) {
            p013kotlin.jvm.internal.s.k(name, "name");
            return this.f122116a.c(name);
        }

        @Override // to0.f
        public to0.f d(int index) {
            return this.f122116a.d(index);
        }

        @Override // to0.f
        /* JADX INFO: renamed from: e */
        public int getElementsCount() {
            return this.f122116a.getElementsCount();
        }

        @Override // to0.f
        public String f(int index) {
            return this.f122116a.f(index);
        }

        @Override // to0.f
        public List<Annotation> g(int index) {
            return this.f122116a.g(index);
        }

        @Override // to0.f
        public List<Annotation> getAnnotations() {
            return this.f122116a.getAnnotations();
        }

        @Override // to0.f
        public to0.n getKind() {
            return this.f122116a.getKind();
        }

        @Override // to0.f
        /* JADX INFO: renamed from: h */
        public String getSerialName() {
            return serialName;
        }

        @Override // to0.f
        public boolean i(int index) {
            return this.f122116a.i(index);
        }

        @Override // to0.f
        /* JADX INFO: renamed from: isInline */
        public boolean getIsInline() {
            return this.f122116a.getIsInline();
        }
    }

    private c0() {
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        r.g(decoder);
        return new JsonObject((Map) so0.a.i(so0.a.F(t0.f86535a), q.f122156a).deserialize(decoder));
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, JsonObject value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        r.h(encoder);
        so0.a.i(so0.a.F(t0.f86535a), q.f122156a).serialize(encoder, value);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return descriptor;
    }
}
