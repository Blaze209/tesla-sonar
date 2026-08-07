package com.withpersona.sdk2.inquiry.network.dto.ui;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import v20.c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributesJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributesJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/network/dto/ui/BasicButtonAttributes;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "nullableButtonTypeAdapter", "nullableStringAdapter", "", "nullableIntAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "nullableJsonLogicBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<BasicButtonAttributes> {
    private volatile Constructor<BasicButtonAttributes> constructorRef;
    private final h<Button.ButtonType> nullableButtonTypeAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<JsonLogicBoolean> nullableJsonLogicBooleanAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("text", "buttonType", "autoSubmitCountdownText", "autoSubmitIntervalSeconds", "hidden", "disabled");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, d1.d(), "text");
        s.j(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<Button.ButtonType> hVarF2 = moshi.f(Button.ButtonType.class, d1.d(), "buttonType");
        s.j(hVarF2, "adapter(...)");
        this.nullableButtonTypeAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, d1.d(), "autoSubmitCountdownText");
        s.j(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
        h<Integer> hVarF4 = moshi.f(Integer.class, d1.d(), "autoSubmitIntervalSeconds");
        s.j(hVarF4, "adapter(...)");
        this.nullableIntAdapter = hVarF4;
        h<JsonLogicBoolean> hVarF5 = moshi.f(JsonLogicBoolean.class, d1.d(), "hidden");
        s.j(hVarF5, "adapter(...)");
        this.nullableJsonLogicBooleanAdapter = hVarF5;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("BasicButtonAttributes");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public BasicButtonAttributes fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        s.k(reader, "reader");
        reader.h();
        int i11 = -1;
        String strFromJson = null;
        Button.ButtonType buttonTypeFromJson = null;
        String strFromJson2 = null;
        Integer numFromJson = null;
        JsonLogicBoolean jsonLogicBooleanFromJson = null;
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
                        throw c.x("text", "text", reader);
                    }
                    break;
                    break;
                case 1:
                    buttonTypeFromJson = this.nullableButtonTypeAdapter.fromJson(reader);
                    break;
                case 2:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    jsonLogicBooleanFromJson = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    jsonLogicBooleanFromJson2 = this.nullableJsonLogicBooleanAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.j();
        if (i11 == -61) {
            JsonLogicBoolean jsonLogicBoolean = jsonLogicBooleanFromJson2;
            JsonLogicBoolean jsonLogicBoolean2 = jsonLogicBooleanFromJson;
            Integer num = numFromJson;
            String str = strFromJson2;
            Button.ButtonType buttonType = buttonTypeFromJson;
            String str2 = strFromJson;
            if (str2 != null) {
                return new BasicButtonAttributes(str2, buttonType, str, num, jsonLogicBoolean2, jsonLogicBoolean);
            }
            throw c.o("text", "text", reader);
        }
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBooleanFromJson2;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBooleanFromJson;
        Integer num2 = numFromJson;
        String str3 = strFromJson2;
        Button.ButtonType buttonType2 = buttonTypeFromJson;
        String str4 = strFromJson;
        Constructor<BasicButtonAttributes> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = BasicButtonAttributes.class.getDeclaredConstructor(String.class, Button.ButtonType.class, String.class, Integer.class, JsonLogicBoolean.class, JsonLogicBoolean.class, Integer.TYPE, c.f117643c);
            this.constructorRef = declaredConstructor;
            s.j(declaredConstructor, "also(...)");
        }
        if (str4 == null) {
            throw c.o("text", "text", reader);
        }
        BasicButtonAttributes basicButtonAttributesNewInstance = declaredConstructor.newInstance(str4, buttonType2, str3, num2, jsonLogicBoolean4, jsonLogicBoolean3, Integer.valueOf(i11), null);
        s.j(basicButtonAttributesNewInstance, "newInstance(...)");
        return basicButtonAttributesNewInstance;
    }

    @Override // com.squareup.moshi.h
    public void toJson(r writer, BasicButtonAttributes value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("text");
        this.stringAdapter.toJson(writer, value_.getText());
        writer.b0("buttonType");
        this.nullableButtonTypeAdapter.toJson(writer, value_.getButtonType());
        writer.b0("autoSubmitCountdownText");
        this.nullableStringAdapter.toJson(writer, value_.getAutoSubmitCountdownText());
        writer.b0("autoSubmitIntervalSeconds");
        this.nullableIntAdapter.toJson(writer, value_.getAutoSubmitIntervalSeconds());
        writer.b0("hidden");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getHidden());
        writer.b0("disabled");
        this.nullableJsonLogicBooleanAdapter.toJson(writer, value_.getDisabled());
        writer.C();
    }
}
