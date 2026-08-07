package com.fourthline.orca.internal;

import java.io.File;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3998wp implements ro0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f36522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final to0.f f36523c;

    public C3998wp(Map fonts, String fontPath) {
        p013kotlin.jvm.internal.s.k(fonts, "fonts");
        p013kotlin.jvm.internal.s.k(fontPath, "fontPath");
        this.f36521a = fonts;
        this.f36522b = fontPath;
        this.f36523c = to0.m.d("OrcaTypographySerializer", new to0.f[0], new wn0.l() { // from class: com.fourthline.orca.internal.sh1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3998wp.a((to0.a) obj);
            }
        });
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (!(decoder instanceof wo0.h)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of OrcaTypographyDefaults.");
        }
        JsonObject jsonObjectO = wo0.j.o(((wo0.h) decoder).y());
        LinkedHashMap linkedHashMap = new LinkedHashMap(p013kotlin.collections.v0.e(jsonObjectO.size()));
        Iterator<T> it = jsonObjectO.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            JsonObject jsonObjectO2 = wo0.j.o((JsonElement) entry.getValue());
            String content = wo0.j.p(a(jsonObjectO2, "font")).getContent();
            OrcaFontDefinition orcaFontDefinition = (OrcaFontDefinition) this.f36521a.get(content);
            if (orcaFontDefinition == null) {
                throw new IllegalStateException(("FL Developer Error. No configured font with name '" + content + "' found.").toString());
            }
            linkedHashMap.put(key, new OrcaTypographyDefinition(p014n4.r.b(p014n4.c.b(new File(this.f36522b, orcaFontDefinition.getFile()), null, 0, null, 14, null)), wo0.j.p(a(jsonObjectO2, "weight")).getContent(), wo0.j.l(wo0.j.p(a(jsonObjectO2, "size"))), wo0.j.l(wo0.j.p(a(jsonObjectO2, "line_height")))));
        }
        return linkedHashMap;
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f36523c;
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, Map value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new jn0.q(null, 1, null);
    }

    private final JsonElement a(JsonObject jsonObject, String str) {
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalStateException(("FL Developer Error. Missing key '" + str + "' during serialization of OrcaStylingDefaults.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(to0.a buildClassSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> listM = p013kotlin.collections.v.m();
        vo0.z1 z1Var = vo0.z1.f119730a;
        buildClassSerialDescriptor.a("light", z1Var.getDescriptor(), listM, false);
        buildClassSerialDescriptor.a("dark", z1Var.getDescriptor(), p013kotlin.collections.v.m(), false);
        return jn0.h0.f84049a;
    }
}
