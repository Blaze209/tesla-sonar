package com.withpersona.sdk2.inquiry.network.dto.ui.components;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import v20.c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.components.ClickableStack_AttributesJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack_AttributesJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/ClickableStack$Attributes;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "nullableListOfUiComponentConfigAdapter", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<ClickableStack.Attributes> {
    private volatile Constructor<ClickableStack.Attributes> constructorRef;
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;
    private final h<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("children", "hidden", "disabled");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<List<UiComponentConfig>> hVarF = moshi.f(y.j(List.class, UiComponentConfig.class), d1.d(), "children");
        s.j(hVarF, "adapter(...)");
        this.nullableListOfUiComponentConfigAdapter = hVarF;
        h<JsonLogicBoolean> hVarF2 = moshi.f(JsonLogicBoolean.class, d1.d(), "hidden");
        s.j(hVarF2, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = hVarF2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ClickableStack.Attributes");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public ClickableStack.Attributes fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        s.k(reader, "reader");
        reader.h();
        List<UiComponentConfig> listFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson2 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int iT = reader.T(this.options);
            if (iT == -1) {
                reader.e0();
                reader.F();
            } else if (iT == 0) {
                listFromJson = this.nullableListOfUiComponentConfigAdapter.fromJson(reader);
            } else if (iT == 1) {
                jsonLogicBooleanFromJson = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                i11 &= -3;
            } else if (iT == 2) {
                jsonLogicBooleanFromJson2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                i11 &= -5;
            }
        }
        reader.j();
        if (i11 == -7) {
            return new ClickableStack.Attributes(listFromJson, jsonLogicBooleanFromJson, jsonLogicBooleanFromJson2);
        }
        Constructor<ClickableStack.Attributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ClickableStack.Attributes.class.getDeclaredConstructor(List.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.f117643c);
            this.constructorRef = declaredConstructor;
            s.j(declaredConstructor, "also(...)");
        }
        ClickableStack.Attributes attributesNewInstance = declaredConstructor.newInstance(listFromJson, jsonLogicBooleanFromJson, jsonLogicBooleanFromJson2, Integer.valueOf(i11), null);
        s.j(attributesNewInstance, "newInstance(...)");
        return attributesNewInstance;
    }

    @Override // com.squareup.moshi.h
    public void toJson(r writer, ClickableStack.Attributes value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("children");
        this.nullableListOfUiComponentConfigAdapter.toJson(writer, value_.getChildren());
        writer.b0("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.b0("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.C();
    }
}
