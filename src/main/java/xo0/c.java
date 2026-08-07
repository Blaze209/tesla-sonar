package xo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import wo0.JsonConfiguration;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H$¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010.\u001a\u00020!H\u0014¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0002042\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u0002072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bH\u0010\u0016J\u001f\u0010K\u001a\u00020J2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010I\u001a\u00020!H\u0014¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020J2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010R\u001a\u0004\bS\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0001\u0003`ab¨\u0006c"}, d2 = {"Lxo0/c;", "Lvo0/w0;", "Lwo0/h;", "Lwo0/b;", "json", "Lkotlinx/serialization/json/JsonElement;", "value", "", "polymorphicDiscriminator", "<init>", "(Lwo0/b;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lkotlinx/serialization/json/JsonPrimitive;", "literal", "primitive", "tag", "", "B0", "(Lkotlinx/serialization/json/JsonPrimitive;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "m0", "()Lkotlinx/serialization/json/JsonElement;", "currentTag", "A0", "(Ljava/lang/String;)Ljava/lang/String;", "y", "T", "Lro0/c;", "deserializer", "o", "(Lro0/c;)Ljava/lang/Object;", "parentName", "childName", "e0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lto0/f;", "descriptor", "Luo0/c;", "b", "(Lto0/f;)Luo0/c;", "Ljn0/h0;", "c", "(Lto0/f;)V", "", "E", "()Z", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "enumDescriptor", "", "r0", "(Ljava/lang/String;Lto0/f;)I", "n0", "(Ljava/lang/String;)Z", "", "o0", "(Ljava/lang/String;)B", "", "w0", "(Ljava/lang/String;)S", "u0", "(Ljava/lang/String;)I", "", "v0", "(Ljava/lang/String;)J", "", "s0", "(Ljava/lang/String;)F", "", "q0", "(Ljava/lang/String;)D", "", "p0", "(Ljava/lang/String;)C", "x0", "inlineDescriptor", "Luo0/e;", "t0", "(Ljava/lang/String;Lto0/f;)Luo0/e;", "q", "(Lto0/f;)Luo0/e;", "Lwo0/b;", DateTokenConverter.CONVERTER_KEY, "()Lwo0/b;", "Lkotlinx/serialization/json/JsonElement;", "z0", "e", "Ljava/lang/String;", "y0", "()Ljava/lang/String;", "Lwo0/f;", "f", "Lwo0/f;", "configuration", "Lyo0/c;", "a", "()Lyo0/c;", "serializersModule", "Lxo0/d0;", "Lxo0/h0;", "Lxo0/j0;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class c extends vo0.w0 implements wo0.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wo0.b json;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final JsonElement value;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String polymorphicDiscriminator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    protected final JsonConfiguration configuration;

    public /* synthetic */ c(wo0.b bVar, JsonElement jsonElement, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jsonElement, str);
    }

    private final Void B0(JsonPrimitive literal, String primitive, String tag) {
        StringBuilder sb2;
        String str;
        if (p013kotlin.text.t.b0(primitive, IntegerTokenConverter.CONVERTER_KEY, false, 2, null)) {
            sb2 = new StringBuilder();
            str = "an ";
        } else {
            sb2 = new StringBuilder();
            str = "a ";
        }
        sb2.append(str);
        sb2.append(primitive);
        throw z.f(-1, "Failed to parse literal '" + literal + "' as " + sb2.toString() + " value at element: " + A0(tag), m0().toString());
    }

    public final String A0(String currentTag) {
        p013kotlin.jvm.internal.s.k(currentTag, "currentTag");
        return i0() + CoreConstants.DOT + currentTag;
    }

    @Override // uo0.e
    public boolean E() {
        return !(m0() instanceof JsonNull);
    }

    @Override // uo0.e, uo0.c
    /* JADX INFO: renamed from: a */
    public yo0.c getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @Override // uo0.e
    public uo0.c b(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        JsonElement jsonElementM0 = m0();
        to0.n kind = descriptor.getKind();
        if (p013kotlin.jvm.internal.s.f(kind, to0.o.b.f114907a) || (kind instanceof to0.d)) {
            wo0.b json = getJson();
            String serialName = descriptor.getSerialName();
            if (jsonElementM0 instanceof JsonArray) {
                return new j0(json, (JsonArray) jsonElementM0);
            }
            throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonArray.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementM0.getClass()).l() + " as the serialized body of " + serialName + " at element: " + i0(), jsonElementM0.toString());
        }
        if (!p013kotlin.jvm.internal.s.f(kind, to0.o.c.f114908a)) {
            wo0.b json2 = getJson();
            String serialName2 = descriptor.getSerialName();
            if (jsonElementM0 instanceof JsonObject) {
                return new h0(json2, (JsonObject) jsonElementM0, this.polymorphicDiscriminator, null, 8, null);
            }
            throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonObject.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementM0.getClass()).l() + " as the serialized body of " + serialName2 + " at element: " + i0(), jsonElementM0.toString());
        }
        wo0.b json3 = getJson();
        to0.f fVarA = b1.a(descriptor.d(0), json3.getSerializersModule());
        to0.n kind2 = fVarA.getKind();
        if ((kind2 instanceof to0.e) || p013kotlin.jvm.internal.s.f(kind2, to0.n.b.f114905a)) {
            wo0.b json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (jsonElementM0 instanceof JsonObject) {
                return new l0(json4, (JsonObject) jsonElementM0);
            }
            throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonObject.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementM0.getClass()).l() + " as the serialized body of " + serialName3 + " at element: " + i0(), jsonElementM0.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw z.d(fVarA);
        }
        wo0.b json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (jsonElementM0 instanceof JsonArray) {
            return new j0(json5, (JsonArray) jsonElementM0);
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonArray.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementM0.getClass()).l() + " as the serialized body of " + serialName4 + " at element: " + i0(), jsonElementM0.toString());
    }

    @Override // uo0.c
    public void c(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
    }

    @Override // wo0.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public wo0.b getJson() {
        return this.json;
    }

    @Override // vo0.w0
    protected String e0(String parentName, String childName) {
        p013kotlin.jvm.internal.s.k(parentName, "parentName");
        p013kotlin.jvm.internal.s.k(childName, "childName");
        return childName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract JsonElement l0(String tag);

    protected final JsonElement m0() {
        JsonElement jsonElementL0;
        String strY = Y();
        return (strY == null || (jsonElementL0 = l0(strY)) == null) ? z0() : jsonElementL0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public boolean N(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                Boolean boolG = wo0.j.g(jsonPrimitive);
                if (boolG != null) {
                    return boolG.booleanValue();
                }
                B0(jsonPrimitive, InquiryField.BooleanField.TYPE, tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, InquiryField.BooleanField.TYPE, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of " + InquiryField.BooleanField.TYPE + " at element: " + A0(tag), jsonElementL0.toString());
    }

    @Override // vo0.c2, uo0.e
    public <T> T o(ro0.c<? extends T> deserializer) {
        JsonPrimitive jsonPrimitiveP;
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        if (!(deserializer instanceof vo0.b) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.deserialize(this);
        }
        vo0.b bVar = (vo0.b) deserializer;
        String strC = o0.c(bVar.getDescriptor(), getJson());
        JsonElement jsonElementY = y();
        String serialName = bVar.getDescriptor().getSerialName();
        if (jsonElementY instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementY;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strC);
            try {
                ro0.c cVarA = ro0.i.a((vo0.b) deserializer, this, (jsonElement == null || (jsonPrimitiveP = wo0.j.p(jsonElement)) == null) ? null : wo0.j.h(jsonPrimitiveP));
                p013kotlin.jvm.internal.s.i(cVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) x0.b(getJson(), strC, jsonObject, cVarA);
            } catch (SerializationException e11) {
                String message = e11.getMessage();
                p013kotlin.jvm.internal.s.h(message);
                throw z.f(-1, message, jsonObject.toString());
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonObject.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementY.getClass()).l() + " as the serialized body of " + serialName + " at element: " + i0(), jsonElementY.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public byte O(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                int iL = wo0.j.l(jsonPrimitive);
                Byte bValueOf = (-128 > iL || iL > 127) ? null : Byte.valueOf((byte) iL);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                B0(jsonPrimitive, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of byte at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public char P(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                return p013kotlin.text.t.S1(jsonPrimitive.getContent());
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of char at element: " + A0(tag), jsonElementL0.toString());
    }

    @Override // vo0.c2, uo0.e
    public uo0.e q(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return Y() != null ? super.q(descriptor) : new d0(getJson(), z0(), this.polymorphicDiscriminator).q(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public double Q(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                double dI = wo0.j.i(jsonPrimitive);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    return dI;
                }
                if (Double.isInfinite(dI) || Double.isNaN(dI)) {
                    throw z.a(Double.valueOf(dI), tag, m0().toString());
                }
                return dI;
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of double at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public int R(String tag, to0.f enumDescriptor) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(enumDescriptor, "enumDescriptor");
        wo0.b json = getJson();
        JsonElement jsonElementL0 = l0(tag);
        String serialName = enumDescriptor.getSerialName();
        if (jsonElementL0 instanceof JsonPrimitive) {
            return b0.k(enumDescriptor, json, ((JsonPrimitive) jsonElementL0).getContent(), null, 4, null);
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of " + serialName + " at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public float S(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                float fK = wo0.j.k(jsonPrimitive);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    return fK;
                }
                if (Float.isInfinite(fK) || Float.isNaN(fK)) {
                    throw z.a(Float.valueOf(fK), tag, m0().toString());
                }
                return fK;
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, InquiryField.FloatField.TYPE, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of " + InquiryField.FloatField.TYPE + " at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public uo0.e T(String tag, to0.f inlineDescriptor) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        p013kotlin.jvm.internal.s.k(inlineDescriptor, "inlineDescriptor");
        if (!s0.b(inlineDescriptor)) {
            return super.T(tag, inlineDescriptor);
        }
        wo0.b json = getJson();
        JsonElement jsonElementL0 = l0(tag);
        String serialName = inlineDescriptor.getSerialName();
        if (jsonElementL0 instanceof JsonPrimitive) {
            return new x(u0.a(json, ((JsonPrimitive) jsonElementL0).getContent()), getJson());
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of " + serialName + " at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public int U(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                return wo0.j.l(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of int at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public long V(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                return wo0.j.r(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of long at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public short W(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (jsonElementL0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
            try {
                int iL = wo0.j.l(jsonPrimitive);
                Short shValueOf = (-32768 > iL || iL > 32767) ? null : Short.valueOf((short) iL);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                B0(jsonPrimitive, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                B0(jsonPrimitive, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of short at element: " + A0(tag), jsonElementL0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vo0.c2
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public String X(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        JsonElement jsonElementL0 = l0(tag);
        if (!(jsonElementL0 instanceof JsonPrimitive)) {
            throw z.f(-1, "Expected " + p013kotlin.jvm.internal.o0.b(JsonPrimitive.class).l() + ", but had " + p013kotlin.jvm.internal.o0.b(jsonElementL0.getClass()).l() + " as the serialized body of " + InquiryField.StringField.TYPE + " at element: " + A0(tag), jsonElementL0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementL0;
        if (!(jsonPrimitive instanceof wo0.v)) {
            throw z.f(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + A0(tag), m0().toString());
        }
        wo0.v vVar = (wo0.v) jsonPrimitive;
        if (vVar.getIsString() || getJson().getConfiguration().getIsLenient()) {
            return vVar.getContent();
        }
        throw z.f(-1, "String literal for key '" + tag + "' should be quoted at element: " + A0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", m0().toString());
    }

    @Override // wo0.h
    public JsonElement y() {
        return m0();
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    protected final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    public abstract JsonElement z0();

    public /* synthetic */ c(wo0.b bVar, JsonElement jsonElement, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jsonElement, (i11 & 4) != 0 ? null : str, null);
    }

    private c(wo0.b bVar, JsonElement jsonElement, String str) {
        this.json = bVar;
        this.value = jsonElement;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }
}
