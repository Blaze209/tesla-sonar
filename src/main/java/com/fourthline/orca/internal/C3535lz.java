package com.fourthline.orca.internal;

import com.facebook.react.modules.appstate.AppStateModule;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3535lz implements ro0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final to0.f f33467a = to0.m.e("StatefulButtonElement", new to0.f[0], null, 4, null);

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public StatefulButtonElement deserialize(uo0.e decoder) {
        JsonObject jsonObjectO;
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        if (!(decoder instanceof wo0.h)) {
            AbstractC3989wg.a("Incorrect decoder type found for serialization of StatefulTextInputElement.");
            throw new KotlinNothingValueException();
        }
        JsonObject jsonObjectO2 = wo0.j.o(((wo0.h) decoder).y());
        JsonElement jsonElementA = Ki.a(jsonObjectO2, "default");
        JsonElement jsonElement = (JsonElement) jsonObjectO2.get("disabled");
        if (jsonElement == null) {
            jsonElement = jsonElementA;
        }
        wo0.b bVarA = Ki.a();
        bVarA.getSerializersModule();
        ButtonElement buttonElement = (ButtonElement) bVarA.c(ButtonElement.INSTANCE.serializer(), jsonElementA);
        JsonObject jsonObjectO3 = wo0.j.o(jsonElement);
        wo0.b bVarA2 = Ki.a();
        JsonElement jsonElement2 = (JsonElement) jsonObjectO3.get("spinner");
        Object spinner = buttonElement.getSpinner();
        if (jsonElement2 != null) {
            try {
                bVarA2.getSerializersModule();
                spinner = bVarA2.c(ProgressElement.INSTANCE.serializer(), jsonElement2);
            } catch (Exception unused) {
            }
        }
        ProgressElement progressElement = (ProgressElement) spinner;
        wo0.b bVarA3 = Ki.a();
        JsonElement jsonElement3 = (JsonElement) jsonObjectO3.get(AppStateModule.APP_STATE_BACKGROUND);
        Object background = buttonElement.getBackground();
        if (jsonElement3 != null) {
            try {
                bVarA3.getSerializersModule();
                background = bVarA3.c(ColorElement.INSTANCE.serializer(), jsonElement3);
            } catch (Exception unused2) {
            }
        }
        ColorElement colorElement = (ColorElement) background;
        wo0.b bVarA4 = Ki.a();
        JsonElement jsonElement4 = (JsonElement) jsonObjectO3.get("text");
        Object text = buttonElement.getText();
        if (jsonElement4 != null) {
            try {
                bVarA4.getSerializersModule();
                text = bVarA4.c(TextElement.INSTANCE.serializer(), jsonElement4);
            } catch (Exception unused3) {
            }
        }
        TextElement textElement = (TextElement) text;
        wo0.b bVarA5 = Ki.a();
        JsonElement jsonElement5 = (JsonElement) jsonObjectO3.get("border");
        Object border = buttonElement.getBorder();
        if (jsonElement5 != null) {
            try {
                bVarA5.getSerializersModule();
                border = bVarA5.c(BorderElement.INSTANCE.serializer(), jsonElement5);
            } catch (Exception unused4) {
            }
        }
        BorderElement borderElement = (BorderElement) border;
        wo0.b bVarA6 = Ki.a();
        JsonElement jsonElement6 = (JsonElement) jsonObjectO3.get("text");
        JsonElement jsonElement7 = (jsonElement6 == null || (jsonObjectO = wo0.j.o(jsonElement6)) == null) ? null : (JsonElement) jsonObjectO.get("opacity");
        Object objValueOf = Float.valueOf(buttonElement.getOpacity());
        if (jsonElement7 != null) {
            try {
                bVarA6.getSerializersModule();
                objValueOf = bVarA6.c(vo0.d0.f119601a, jsonElement7);
            } catch (Exception unused5) {
            }
        }
        return new StatefulButtonElement(0, buttonElement, new ButtonElement(progressElement, textElement, colorElement, borderElement, ((Number) objValueOf).floatValue()), 1, null);
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f33467a;
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, StatefulButtonElement value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        throw new jn0.q(null, 1, null);
    }
}
