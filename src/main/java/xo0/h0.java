package xo0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0012\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lxo0/h0;", "Lxo0/c;", "Lwo0/b;", "json", "Lkotlinx/serialization/json/JsonObject;", "value", "", "polymorphicDiscriminator", "Lto0/f;", "polyDescriptor", "<init>", "(Lwo0/b;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lto0/f;)V", "descriptor", "", "index", "tag", "", "D0", "(Lto0/f;ILjava/lang/String;)Z", "C0", "(Lto0/f;I)Z", "A", "(Lto0/f;)I", "E", "()Z", "f0", "(Lto0/f;I)Ljava/lang/String;", "Lkotlinx/serialization/json/JsonElement;", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Luo0/c;", "b", "(Lto0/f;)Luo0/c;", "Ljn0/h0;", "c", "(Lto0/f;)V", "g", "Lkotlinx/serialization/json/JsonObject;", "E0", "()Lkotlinx/serialization/json/JsonObject;", "h", "Lto0/f;", IntegerTokenConverter.CONVERTER_KEY, "I", "position", "j", "Z", "forceNull", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
class h0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final JsonObject value;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final to0.f polyDescriptor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int position;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean forceNull;

    public /* synthetic */ h0(wo0.b bVar, JsonObject jsonObject, String str, to0.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jsonObject, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : fVar);
    }

    private final boolean C0(to0.f descriptor, int index) {
        boolean z11 = (getJson().getConfiguration().getExplicitNulls() || descriptor.i(index) || !descriptor.d(index).b()) ? false : true;
        this.forceNull = z11;
        return z11;
    }

    private final boolean D0(to0.f descriptor, int index, String tag) {
        wo0.b json = getJson();
        boolean zI = descriptor.i(index);
        to0.f fVarD = descriptor.d(index);
        if (zI && !fVarD.b() && (l0(tag) instanceof JsonNull)) {
            return true;
        }
        if (!p013kotlin.jvm.internal.s.f(fVarD.getKind(), to0.n.b.f114905a) || (fVarD.b() && (l0(tag) instanceof JsonNull))) {
            return false;
        }
        JsonElement jsonElementL0 = l0(tag);
        JsonPrimitive jsonPrimitive = jsonElementL0 instanceof JsonPrimitive ? (JsonPrimitive) jsonElementL0 : null;
        String strH = jsonPrimitive != null ? wo0.j.h(jsonPrimitive) : null;
        if (strH == null) {
            return false;
        }
        return b0.i(fVarD, json, strH) == -3 && (zI || (!json.getConfiguration().getExplicitNulls() && fVarD.b()));
    }

    @Override // uo0.c
    public int A(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        while (this.position < descriptor.getElementsCount()) {
            int i11 = this.position;
            this.position = i11 + 1;
            String strZ = Z(descriptor, i11);
            int i12 = this.position - 1;
            this.forceNull = false;
            if (z0().containsKey(strZ) || C0(descriptor, i12)) {
                if (!this.configuration.getCoerceInputValues() || !D0(descriptor, i12, strZ)) {
                    return i12;
                }
            }
        }
        return -1;
    }

    @Override // xo0.c, uo0.e
    public boolean E() {
        return !this.forceNull && super.E();
    }

    @Override // xo0.c
    /* JADX INFO: renamed from: E0, reason: from getter and merged with bridge method [inline-methods] */
    public JsonObject getValue() {
        return this.value;
    }

    @Override // xo0.c, uo0.e
    public uo0.c b(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        if (descriptor != this.polyDescriptor) {
            return super.b(descriptor);
        }
        wo0.b json = getJson();
        JsonElement jsonElementM0 = m0();
        String serialName = this.polyDescriptor.getSerialName();
        if (jsonElementM0 instanceof JsonObject) {
            return new h0(json, (JsonObject) jsonElementM0, getPolymorphicDiscriminator(), this.polyDescriptor);
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonObject.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementM0.getClass()).l() + " as the serialized body of " + serialName + " at element: " + i0(), jsonElementM0.toString());
    }

    @Override // xo0.c, uo0.c
    public void c(to0.f descriptor) {
        Set<String> setN;
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        if (this.configuration.getIgnoreUnknownKeys() || (descriptor.getKind() instanceof to0.d)) {
            return;
        }
        b0.m(descriptor, getJson());
        if (this.configuration.getUseAlternativeNames()) {
            Set<String> setA = vo0.k0.a(descriptor);
            Map map = (Map) wo0.e0.a(getJson()).a(descriptor, b0.g());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = d1.d();
            }
            setN = d1.n(setA, setKeySet);
        } else {
            setN = vo0.k0.a(descriptor);
        }
        for (String str : z0().keySet()) {
            if (!setN.contains(str) && !p013kotlin.jvm.internal.s.f(str, getPolymorphicDiscriminator())) {
                throw z.g(str, z0().toString());
            }
        }
    }

    @Override // vo0.w0
    protected String f0(to0.f descriptor, int index) {
        Object next;
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        b0.m(descriptor, getJson());
        String strF = descriptor.f(index);
        if (!this.configuration.getUseAlternativeNames() || z0().keySet().contains(strF)) {
            return strF;
        }
        Map<String, Integer> mapE = b0.e(getJson(), descriptor);
        Iterator<T> it = z0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = mapE.get((String) next);
            if (num != null && num.intValue() == index) {
                break;
            }
        }
        String str = (String) next;
        return str != null ? str : strF;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xo0.c
    public JsonElement l0(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        return (JsonElement) p013kotlin.collections.v0.j(z0(), tag);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(wo0.b json, JsonObject value, String str, to0.f fVar) {
        super(json, value, str, null);
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.value = value;
        this.polyDescriptor = fVar;
    }
}
