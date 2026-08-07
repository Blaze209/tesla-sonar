package com.withpersona.sdk2.inquiry.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.f;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.x;
import java.util.ArrayList;
import java.util.Map;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = false)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u001a\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0017R#\u0010(\u001a\u0004\u0018\u00010!8BX\u0083\u0084\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "Landroid/os/Parcelable;", "", "rule", "<init>", "(Ljava/lang/String;)V", "", "", "formValues", "thisComponentValue", "", "getValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Boolean;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRule", "Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "parsedRules$delegate", "Lkotlin/Lazy;", "getParsedRules", "()Lcom/withpersona/sdk2/inquiry/network/dto/ParsedRules;", "getParsedRules$annotations", "()V", "parsedRules", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class JsonLogicBoolean implements Parcelable {

    /* JADX INFO: renamed from: parsedRules$delegate, reason: from kotlin metadata */
    private final Lazy parsedRules;
    private final String rule;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<JsonLogicBoolean> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean$Companion;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "<init>", "()V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "Lcom/squareup/moshi/r;", "writer", "value", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;)V", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion extends h<JsonLogicBoolean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.squareup.moshi.h
        @x
        public void toJson(r writer, JsonLogicBoolean value) {
            s.k(writer, "writer");
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.moshi.h
        @f
        public JsonLogicBoolean fromJson(k reader) {
            s.k(reader, "reader");
            return new JsonLogicBoolean(reader.p().m1().K());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JsonLogicBoolean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new JsonLogicBoolean(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JsonLogicBoolean[] newArray(int i11) {
            return new JsonLogicBoolean[i11];
        }
    }

    public JsonLogicBoolean(String rule) {
        s.k(rule, "rule");
        this.rule = rule;
        this.parsedRules = m.b(new wn0.a() { // from class: com.withpersona.sdk2.inquiry.network.dto.a
            @Override // wn0.a
            public final Object invoke() {
                return JsonLogicBoolean.parsedRules_delegate$lambda$1(this.f58324a);
            }
        });
    }

    public static /* synthetic */ JsonLogicBoolean copy$default(JsonLogicBoolean jsonLogicBoolean, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jsonLogicBoolean.rule;
        }
        return jsonLogicBoolean.copy(str);
    }

    private final ParsedRules getParsedRules() {
        return (ParsedRules) this.parsedRules.getValue();
    }

    @g(ignore = true)
    private static /* synthetic */ void getParsedRules$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParsedRules parsedRules_delegate$lambda$1(JsonLogicBoolean jsonLogicBoolean) {
        Object objFromJson = new u.b().d().c(Object.class).nullSafe().lenient().fromJson(jsonLogicBoolean.rule);
        if (!(objFromJson instanceof Map)) {
            if (objFromJson instanceof Boolean) {
                return new ParsedRules.PrimitiveRule(objFromJson);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) objFromJson).entrySet()) {
            Object key = entry.getKey();
            Pair pairA = key instanceof String ? jn0.x.a(key, entry.getValue()) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return new ParsedRules.ComplexRules(v0.y(arrayList));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRule() {
        return this.rule;
    }

    public final JsonLogicBoolean copy(String rule) {
        s.k(rule, "rule");
        return new JsonLogicBoolean(rule);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof JsonLogicBoolean) && s.f(this.rule, ((JsonLogicBoolean) other).rule);
    }

    public final String getRule() {
        return this.rule;
    }

    public final Boolean getValue(Map<String, ? extends Object> formValues, Object thisComponentValue) {
        s.k(formValues, "formValues");
        ParsedRules parsedRules = getParsedRules();
        if (parsedRules == null) {
            return null;
        }
        if (!(parsedRules instanceof ParsedRules.ComplexRules)) {
            if (!(parsedRules instanceof ParsedRules.PrimitiveRule)) {
                throw new NoWhenBranchMatchedException();
            }
            ParsedRules.PrimitiveRule primitiveRule = (ParsedRules.PrimitiveRule) parsedRules;
            if (primitiveRule.getValue() instanceof Boolean) {
                return (Boolean) primitiveRule.getValue();
            }
            return null;
        }
        defpackage.i iVarA = JsonLogicBooleanKt.getJsonLogicEngine().a(((ParsedRules.ComplexRules) parsedRules).getExpression(), v0.m(jn0.x.a("form", formValues), jn0.x.a("value", thisComponentValue)));
        if (iVarA instanceof defpackage.i.Success) {
            Object value = ((defpackage.i.Success) iVarA).getValue();
            if (value instanceof Boolean) {
                return (Boolean) value;
            }
            return null;
        }
        if (s.f(iVarA, i.a.c.f73722a) || s.f(iVarA, i.a.C1546a.f73720a) || s.f(iVarA, i.a.b.f73721a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        return this.rule.hashCode();
    }

    public String toString() {
        return "JsonLogicBoolean(rule=" + this.rule + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.rule);
    }
}
