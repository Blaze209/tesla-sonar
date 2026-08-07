package com.withpersona.sdk2.inquiry.network.dto;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.NextStep_Ui_ConfigJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep_Ui_ConfigJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Config;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "nullableListOfUiComponentConfigAdapter", "Lcom/squareup/moshi/h;", "", "nullableBooleanAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "nullableLocalizationsAdapter", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "nullableListOfUiComponentErrorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<NextStep.Ui.Config> {
    private volatile Constructor<NextStep.Ui.Config> constructorRef;
    private final h<Boolean> nullableBooleanAdapter;
    private final h<List<UiComponentConfig>> nullableListOfUiComponentConfigAdapter;
    private final h<List<UiComponentError>> nullableListOfUiComponentErrorAdapter;
    private final h<NextStep.Ui.Localizations> nullableLocalizationsAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("components", "backStepEnabled", "cancelButtonEnabled", "terminal", "localizations", "serverComponentErrors");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<List<UiComponentConfig>> hVarF = moshi.f(y.j(List.class, UiComponentConfig.class), d1.d(), "components");
        s.j(hVarF, "adapter(...)");
        this.nullableListOfUiComponentConfigAdapter = hVarF;
        h<Boolean> hVarF2 = moshi.f(Boolean.class, d1.d(), "backStepEnabled");
        s.j(hVarF2, "adapter(...)");
        this.nullableBooleanAdapter = hVarF2;
        h<NextStep.Ui.Localizations> hVarF3 = moshi.f(NextStep.Ui.Localizations.class, d1.d(), "localizations");
        s.j(hVarF3, "adapter(...)");
        this.nullableLocalizationsAdapter = hVarF3;
        h<List<UiComponentError>> hVarF4 = moshi.f(y.j(List.class, UiComponentError.class), d1.d(), "serverComponentErrors");
        s.j(hVarF4, "adapter(...)");
        this.nullableListOfUiComponentErrorAdapter = hVarF4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("NextStep.Ui.Config");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public NextStep.Ui.Config fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        s.k(reader, "reader");
        reader.h();
        int i11 = -1;
        List<UiComponentConfig> listFromJson = null;
        Boolean boolFromJson = null;
        Boolean boolFromJson2 = null;
        Boolean boolFromJson3 = null;
        NextStep.Ui.Localizations localizationsFromJson = null;
        List<UiComponentError> listFromJson2 = null;
        while (reader.hasNext()) {
            switch (reader.T(this.options)) {
                case -1:
                    reader.e0();
                    reader.F();
                    break;
                case 0:
                    listFromJson = this.nullableListOfUiComponentConfigAdapter.fromJson(reader);
                    break;
                case 1:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    boolFromJson2 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -5;
                    break;
                case 3:
                    boolFromJson3 = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    localizationsFromJson = this.nullableLocalizationsAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    listFromJson2 = this.nullableListOfUiComponentErrorAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.j();
        if (i11 == -63) {
            List<UiComponentError> list = listFromJson2;
            NextStep.Ui.Localizations localizations = localizationsFromJson;
            Boolean bool = boolFromJson3;
            return new NextStep.Ui.Config(listFromJson, boolFromJson, boolFromJson2, bool, localizations, list);
        }
        List<UiComponentError> list2 = listFromJson2;
        NextStep.Ui.Localizations localizations2 = localizationsFromJson;
        Boolean bool2 = boolFromJson3;
        Boolean bool3 = boolFromJson2;
        Boolean bool4 = boolFromJson;
        List<UiComponentConfig> list3 = listFromJson;
        Constructor<NextStep.Ui.Config> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = NextStep.Ui.Config.class.getDeclaredConstructor(List.class, Boolean.class, Boolean.class, Boolean.class, NextStep.Ui.Localizations.class, List.class, Integer.TYPE, v20.c.f117643c);
            this.constructorRef = declaredConstructor;
            s.j(declaredConstructor, "also(...)");
        }
        NextStep.Ui.Config configNewInstance = declaredConstructor.newInstance(list3, bool4, bool3, bool2, localizations2, list2, Integer.valueOf(i11), null);
        s.j(configNewInstance, "newInstance(...)");
        return configNewInstance;
    }

    @Override // com.squareup.moshi.h
    public void toJson(r writer, NextStep.Ui.Config value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("components");
        this.nullableListOfUiComponentConfigAdapter.toJson(writer, value_.getComponents());
        writer.b0("backStepEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getBackStepEnabled());
        writer.b0("cancelButtonEnabled");
        this.nullableBooleanAdapter.toJson(writer, value_.getCancelButtonEnabled());
        writer.b0("terminal");
        this.nullableBooleanAdapter.toJson(writer, value_.getTerminal());
        writer.b0("localizations");
        this.nullableLocalizationsAdapter.toJson(writer, value_.getLocalizations());
        writer.b0("serverComponentErrors");
        this.nullableListOfUiComponentErrorAdapter.toJson(writer, value_.getServerComponentErrors());
        writer.C();
    }
}
