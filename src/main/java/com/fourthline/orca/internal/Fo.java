package com.fourthline.orca.internal;

import ch.qos.logback.core.joran.action.Action;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Fo implements ro0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f25847a = to0.m.e("OrcaFontDefinition", new to0.f[0], null, 4, null);

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public OrcaFontDefinition deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (decoder instanceof wo0.h) {
            return new OrcaFontDefinition(wo0.j.p(a(wo0.j.o(a(wo0.j.o(((wo0.h) decoder).y()), "mobile")), Action.FILE_ATTRIBUTE)).getContent());
        }
        throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of OrcaStylingDefaults.");
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f25847a;
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, OrcaFontDefinition value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new jn0.q(null, 1, null);
    }

    private final JsonElement a(JsonObject jsonObject, String str) {
        JsonElement jsonElement = (JsonElement) jsonObject.get(str);
        if (jsonElement != null) {
            return jsonElement;
        }
        throw new IllegalStateException(("FL Developer Error. Missing key '" + str + "' during serialization of OrcaFontDefinition.").toString());
    }
}
