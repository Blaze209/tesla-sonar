package com.withpersona.sdk2.inquiry.steps.ui.components;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.ClickableStackComponentJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponentJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "b", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;)V", "Lcom/squareup/moshi/k$b;", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/h;", "stringAdapter", "", "Loi0/n5;", "c", "listOfUiComponentAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", DateTokenConverter.CONVERTER_KEY, "nullableJsonLogicBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$ClickableStackComponentStyle;", "e", "nullableClickableStackComponentStyleAdapter", "", "f", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "g", "Ljava/lang/reflect/Constructor;", "constructorRef", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<ClickableStackComponent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<String> stringAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h<List<n5>> listOfUiComponentAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<ClickableStack.ClickableStackComponentStyle> nullableClickableStackComponentStyleAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> booleanAdapter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile Constructor<ClickableStackComponent> constructorRef;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("name", "children", "hidden", "disabled", "styles", "isActive");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, d1.d(), "name");
        s.j(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<List<n5>> hVarF2 = moshi.f(y.j(List.class, n5.class), d1.d(), "children");
        s.j(hVarF2, "adapter(...)");
        this.listOfUiComponentAdapter = hVarF2;
        h<JsonLogicBoolean> hVarF3 = moshi.f(JsonLogicBoolean.class, d1.d(), "hidden");
        s.j(hVarF3, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = hVarF3;
        h<ClickableStack.ClickableStackComponentStyle> hVarF4 = moshi.f(ClickableStack.ClickableStackComponentStyle.class, d1.d(), "styles");
        s.j(hVarF4, "adapter(...)");
        this.nullableClickableStackComponentStyleAdapter = hVarF4;
        h<Boolean> hVarF5 = moshi.f(Boolean.TYPE, d1.d(), "isActive");
        s.j(hVarF5, "adapter(...)");
        this.booleanAdapter = hVarF5;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ClickableStackComponent fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        s.k(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.h();
        List<n5> listFromJson = null;
        Boolean boolFromJson = bool;
        String strFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyleFromJson = null;
        int i11 = -1;
        JsonLogicBoolean jsonLogicBooleanFromJson2 = null;
        while (reader.hasNext()) {
            switch (reader.T(this.options)) {
                case -1:
                    reader.e0();
                    reader.F();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw v20.c.x("name", "name", reader);
                    }
                    break;
                    break;
                case 1:
                    listFromJson = this.listOfUiComponentAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw v20.c.x("children", "children", reader);
                    }
                    break;
                    break;
                case 2:
                    jsonLogicBooleanFromJson2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 3:
                    jsonLogicBooleanFromJson = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    break;
                case 4:
                    clickableStackComponentStyleFromJson = this.nullableClickableStackComponentStyleAdapter.fromJson(reader);
                    break;
                case 5:
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw v20.c.x("isActive", "isActive", reader);
                    }
                    i11 = -33;
                    break;
                    break;
            }
        }
        reader.j();
        if (i11 == -33) {
            if (strFromJson == null) {
                throw v20.c.o("name", "name", reader);
            }
            if (listFromJson != null) {
                return new ClickableStackComponent(strFromJson, listFromJson, jsonLogicBooleanFromJson2, jsonLogicBooleanFromJson, clickableStackComponentStyleFromJson, boolFromJson.booleanValue());
            }
            throw v20.c.o("children", "children", reader);
        }
        Constructor<ClickableStackComponent> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStackComponent.class.getDeclaredConstructor(String.class, List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, ClickableStack.ClickableStackComponentStyle.class, Boolean.TYPE, Integer.TYPE, v20.c.f117643c);
            this.constructorRef = declaredConstructor;
            s.j(declaredConstructor, "also(...)");
        }
        if (strFromJson == null) {
            throw v20.c.o("name", "name", reader);
        }
        if (listFromJson == null) {
            throw v20.c.o("children", "children", reader);
        }
        JsonLogicBoolean jsonLogicBoolean = jsonLogicBooleanFromJson;
        ClickableStack.ClickableStackComponentStyle clickableStackComponentStyle = clickableStackComponentStyleFromJson;
        ClickableStackComponent clickableStackComponentNewInstance = declaredConstructor.newInstance(strFromJson, listFromJson, jsonLogicBooleanFromJson2, jsonLogicBoolean, clickableStackComponentStyle, boolFromJson, Integer.valueOf(i11), null);
        s.j(clickableStackComponentNewInstance, "newInstance(...)");
        return clickableStackComponentNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(r writer, ClickableStackComponent value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.b0("children");
        this.listOfUiComponentAdapter.toJson(writer, value_.getChildren());
        writer.b0("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.b0("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.b0("styles");
        this.nullableClickableStackComponentStyleAdapter.toJson(writer, value_.getStyles());
        writer.b0("isActive");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getIsActive()));
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClickableStackComponent");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}
