package wo0;

import ch.qos.logback.core.CoreConstants;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010 \u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lwo0/g;", "", "T", "Lro0/d;", "Lco0/d;", "baseClass", "<init>", "(Lco0/d;)V", "subClass", "", "b", "(Lco0/d;Lco0/d;)Ljava/lang/Void;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "Lro0/c;", "a", "(Lkotlinx/serialization/json/JsonElement;)Lro0/c;", "Lco0/d;", "Lto0/f;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class g<T> implements ro0.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co0.d<T> baseClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final to0.f descriptor;

    public g(co0.d<T> baseClass) {
        p013kotlin.jvm.internal.s.k(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = to0.m.h("JsonContentPolymorphicSerializer<" + baseClass.l() + '>', to0.d.b.f114874a, new to0.f[0], null, 8, null);
    }

    private final Void b(co0.d<?> subClass, co0.d<?> baseClass) {
        String strL = subClass.l();
        if (strL == null) {
            strL = String.valueOf(subClass);
        }
        throw new SerializationException("Class '" + strL + "' is not registered for polymorphic serialization " + ("in the scope of '" + baseClass.l() + CoreConstants.SINGLE_QUOTE_CHAR) + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }

    protected abstract ro0.c<T> a(JsonElement element);

    @Override // ro0.c
    public final T deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        h hVarD = r.d(decoder);
        JsonElement jsonElementY = hVarD.y();
        ro0.c<T> cVarA = a(jsonElementY);
        p013kotlin.jvm.internal.s.i(cVarA, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) hVarD.getJson().c((ro0.d) cVarA, jsonElementY);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.descriptor;
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        ro0.q<T> qVarE = encoder.getSerializersModule().e(this.baseClass, value);
        if (qVarE == null && (qVarE = ro0.r.b(o0.b(value.getClass()))) == null) {
            b(o0.b(value.getClass()), this.baseClass);
            throw new KotlinNothingValueException();
        }
        ((ro0.d) qVarE).serialize(encoder, value);
    }
}
