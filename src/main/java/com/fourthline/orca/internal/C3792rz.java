package com.fourthline.orca.internal;

import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: renamed from: com.fourthline.orca.internal.rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3792rz implements ro0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f35183a = to0.m.e("StatefulTextInputElement", new to0.f[0], null, 4, null);

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StatefulTextInputElement deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (!(decoder instanceof wo0.h)) {
            throw new IllegalStateException("FL Developer Error. Incorrect decoder type found for serialization of StatefulTextInputElement.");
        }
        JsonObject jsonObjectO = wo0.j.o(((wo0.h) decoder).y());
        JsonElement jsonElementA = Ki.a(jsonObjectO, "default");
        JsonElement jsonElement = (JsonElement) jsonObjectO.get("focused");
        if (jsonElement == null) {
            jsonElement = jsonElementA;
        }
        JsonElement jsonElement2 = (JsonElement) jsonObjectO.get(AnalyticsAttribute.Error);
        if (jsonElement2 == null) {
            jsonElement2 = jsonElementA;
        }
        JsonElement jsonElement3 = (JsonElement) jsonObjectO.get("disabled");
        if (jsonElement3 == null) {
            jsonElement3 = jsonElementA;
        }
        wo0.b bVarA = Ki.a();
        bVarA.getSerializersModule();
        TextInputElement textInputElement = (TextInputElement) bVarA.c(TextInputElement.INSTANCE.serializer(), jsonElementA);
        JsonObject jsonObjectO2 = wo0.j.o(jsonElement);
        wo0.b bVarA2 = Ki.a();
        JsonElement jsonElementA2 = Ki.a(jsonObjectO2, "shadow");
        bVarA2.getSerializersModule();
        ColorElement.Companion companion = ColorElement.INSTANCE;
        ColorElement colorElement = (ColorElement) bVarA2.c(companion.serializer(), jsonElementA2);
        wo0.b bVarA3 = Ki.a();
        JsonElement jsonElementA3 = Ki.a(jsonObjectO2, "border");
        bVarA3.getSerializersModule();
        BorderElement.Companion companion2 = BorderElement.INSTANCE;
        TextInputElement textInputElementA = TextInputElement.a(textInputElement, null, null, null, null, null, colorElement, null, (BorderElement) bVarA3.c(companion2.serializer(), jsonElementA3), 0, 351, null);
        JsonObject jsonObjectO3 = wo0.j.o(jsonElement2);
        wo0.b bVarA4 = Ki.a();
        JsonElement jsonElementA4 = Ki.a(jsonObjectO3, PermissionsResponse.STATUS_KEY);
        bVarA4.getSerializersModule();
        TextElement textElement = (TextElement) bVarA4.c(TextElement.INSTANCE.serializer(), jsonElementA4);
        wo0.b bVarA5 = Ki.a();
        JsonElement jsonElementA5 = Ki.a(jsonObjectO3, "border");
        bVarA5.getSerializersModule();
        TextInputElement textInputElementA2 = TextInputElement.a(textInputElement, null, null, null, textElement, null, null, null, (BorderElement) bVarA5.c(companion2.serializer(), jsonElementA5), 0, 375, null);
        JsonObject jsonObjectO4 = wo0.j.o(jsonElement3);
        wo0.b bVarA6 = Ki.a();
        JsonElement jsonElementA6 = Ki.a(jsonObjectO4, AppStateModule.APP_STATE_BACKGROUND);
        bVarA6.getSerializersModule();
        return new StatefulTextInputElement(textInputElement, textInputElementA, textInputElementA2, TextInputElement.a(textInputElement, null, null, null, null, null, null, (ColorElement) bVarA6.c(companion.serializer(), jsonElementA6), null, 0, 447, null));
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f35183a;
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, StatefulTextInputElement value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new jn0.q(null, 1, null);
    }
}
