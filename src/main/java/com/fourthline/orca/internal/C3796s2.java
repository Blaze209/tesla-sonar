package com.fourthline.orca.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: renamed from: com.fourthline.orca.internal.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3796s2 implements ro0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3796s2 f35191a = new C3796s2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final to0.f f35192b = to0.m.d("BavStartPaymentResult", new to0.f[0], new wn0.l() { // from class: com.fourthline.orca.internal.xb1
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return C3796s2.a((to0.a) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f35193c = 8;

    private C3796s2() {
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, InterfaceC3839t2.BavStartPaymentResult value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new SerializationException("Serialization not implemented - this is typically used for deserialization only");
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return f35192b;
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC3839t2.BavStartPaymentResult deserialize(uo0.e decoder) {
        JsonPrimitive jsonPrimitiveP;
        String content;
        JsonObject jsonObjectO;
        AbstractC3582n2 abstractC3582n2A;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (!(decoder instanceof wo0.h)) {
            throw new IllegalArgumentException("This serializer can only be used with JSON");
        }
        wo0.h hVar = (wo0.h) decoder;
        JsonElement jsonElementY = hVar.y();
        if (!(jsonElementY instanceof JsonObject)) {
            throw new IllegalArgumentException("Expected JsonObject");
        }
        JsonObject jsonObject = (JsonObject) jsonElementY;
        JsonElement jsonElement = (JsonElement) jsonObject.get("provider");
        if (jsonElement == null || (jsonPrimitiveP = wo0.j.p(jsonElement)) == null || (content = jsonPrimitiveP.getContent()) == null) {
            throw new SerializationException("Missing 'provider' field");
        }
        JsonElement jsonElement2 = (JsonElement) jsonObject.get("values");
        if (jsonElement2 == null || (jsonObjectO = wo0.j.o(jsonElement2)) == null) {
            throw new SerializationException("Missing 'values' field");
        }
        String lowerCase = content.toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode == -1081415738) {
            if (lowerCase.equals("manual")) {
                abstractC3582n2A = (AbstractC3582n2) hVar.getJson().c(AbstractC3582n2.Manual.INSTANCE.serializer(), jsonObjectO);
                return new InterfaceC3839t2.BavStartPaymentResult(content, abstractC3582n2A);
            }
            throw new SerializationException("Unknown provider: " + content);
        }
        if (iHashCode == 3526595) {
            if (lowerCase.equals("sepa")) {
                abstractC3582n2A = a(jsonObjectO);
                return new InterfaceC3839t2.BavStartPaymentResult(content, abstractC3582n2A);
            }
            throw new SerializationException("Unknown provider: " + content);
        }
        if (iHashCode == 3560178 && lowerCase.equals("tink")) {
            abstractC3582n2A = (AbstractC3582n2) hVar.getJson().c(AbstractC3582n2.Tink.INSTANCE.serializer(), jsonObjectO);
            return new InterfaceC3839t2.BavStartPaymentResult(content, abstractC3582n2A);
        }
        throw new SerializationException("Unknown provider: " + content);
    }

    private final AbstractC3582n2.Sepa a(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitiveP;
        JsonPrimitive jsonPrimitiveP2;
        String content;
        JsonObject jsonObjectO;
        JsonPrimitive jsonPrimitiveP3;
        JsonPrimitive jsonPrimitiveP4;
        JsonElement jsonElement = (JsonElement) jsonObject.get("amount");
        if (jsonElement != null && (jsonPrimitiveP = wo0.j.p(jsonElement)) != null) {
            double dI = wo0.j.i(jsonPrimitiveP);
            JsonElement jsonElement2 = (JsonElement) jsonObject.get("preferredMarket");
            if (jsonElement2 != null && (jsonPrimitiveP2 = wo0.j.p(jsonElement2)) != null && (content = jsonPrimitiveP2.getContent()) != null) {
                JsonElement jsonElement3 = (JsonElement) jsonObject.get("iban");
                String string = (jsonElement3 == null || (jsonPrimitiveP4 = wo0.j.p(jsonElement3)) == null) ? null : jsonPrimitiveP4.toString();
                JsonElement jsonElement4 = (JsonElement) jsonObject.get("ibanConfiguration");
                if (jsonElement4 != null && (jsonObjectO = wo0.j.o(jsonElement4)) != null) {
                    Set<Map.Entry<String, JsonElement>> setEntrySet = jsonObjectO.entrySet();
                    ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(setEntrySet, 10));
                    Iterator<T> it = setEntrySet.iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        String str = (String) entry.getKey();
                        JsonElement jsonElement5 = (JsonElement) wo0.j.o((JsonElement) entry.getValue()).get("length");
                        if (jsonElement5 != null && (jsonPrimitiveP3 = wo0.j.p(jsonElement5)) != null) {
                            arrayList.add(new BavIbanCountryConfig(str, wo0.j.l(jsonPrimitiveP3)));
                        } else {
                            throw new SerializationException("Missing 'length' field for country " + str);
                        }
                    }
                    return new AbstractC3582n2.Sepa(dI, content, string, arrayList);
                }
                throw new SerializationException("Missing 'ibanConfiguration' field in Sepa values");
            }
            throw new SerializationException("Missing 'preferredMarket' field in Sepa values");
        }
        throw new SerializationException("Missing 'amount' field in Sepa values");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(to0.a buildClassSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a("provider", vo0.z1.f119730a.getDescriptor(), p013kotlin.collections.v.m(), false);
        buildClassSerialDescriptor.a("values", JsonElement.INSTANCE.serializer().getDescriptor(), p013kotlin.collections.v.m(), false);
        return jn0.h0.f84049a;
    }
}
