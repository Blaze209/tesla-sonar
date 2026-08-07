package com.withpersona.sdk2.inquiry.network.dto.government_id;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import v20.c;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.network.dto.government_id.IdJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/IdJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "toJson", "(Lcom/squareup/moshi/r;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "stringAdapter", "Lcom/squareup/moshi/h;", "", "listOfStringAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id$IdIcon;", "nullableIdIconAdapter", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "nullableListOfCapturePageConfigAdapter", "network-inquiry_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<Id> {
    private final h<List<String>> listOfStringAdapter;
    private final h<Id.IdIcon> nullableIdIconAdapter;
    private final h<List<CapturePageConfig>> nullableListOfCapturePageConfigAdapter;
    private final k.b options;
    private final h<String> stringAdapter;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a(Action.CLASS_ATTRIBUTE, "requiresSides", "icon", "capturePageConfigs");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, d1.d(), Action.CLASS_ATTRIBUTE);
        s.j(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<List<String>> hVarF2 = moshi.f(y.j(List.class, String.class), d1.d(), "requiresSides");
        s.j(hVarF2, "adapter(...)");
        this.listOfStringAdapter = hVarF2;
        h<Id.IdIcon> hVarF3 = moshi.f(Id.IdIcon.class, d1.d(), "icon");
        s.j(hVarF3, "adapter(...)");
        this.nullableIdIconAdapter = hVarF3;
        h<List<CapturePageConfig>> hVarF4 = moshi.f(y.j(List.class, CapturePageConfig.class), d1.d(), "capturePageConfigs");
        s.j(hVarF4, "adapter(...)");
        this.nullableListOfCapturePageConfigAdapter = hVarF4;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Id");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public Id fromJson(k reader) {
        s.k(reader, "reader");
        reader.h();
        String strFromJson = null;
        List<String> listFromJson = null;
        Id.IdIcon idIconFromJson = null;
        List<CapturePageConfig> listFromJson2 = null;
        while (reader.hasNext()) {
            int iT = reader.T(this.options);
            if (iT == -1) {
                reader.e0();
                reader.F();
            } else if (iT == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    throw c.x("class_", Action.CLASS_ATTRIBUTE, reader);
                }
            } else if (iT == 1) {
                listFromJson = this.listOfStringAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw c.x("requiresSides", "requiresSides", reader);
                }
            } else if (iT == 2) {
                idIconFromJson = this.nullableIdIconAdapter.fromJson(reader);
            } else if (iT == 3) {
                listFromJson2 = this.nullableListOfCapturePageConfigAdapter.fromJson(reader);
            }
        }
        reader.j();
        if (strFromJson == null) {
            throw c.o("class_", Action.CLASS_ATTRIBUTE, reader);
        }
        if (listFromJson != null) {
            return new Id(strFromJson, listFromJson, idIconFromJson, listFromJson2);
        }
        throw c.o("requiresSides", "requiresSides", reader);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r writer, Id value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0(Action.CLASS_ATTRIBUTE);
        this.stringAdapter.toJson(writer, value_.getClass());
        writer.b0("requiresSides");
        this.listOfStringAdapter.toJson(writer, value_.getRequiresSides());
        writer.b0("icon");
        this.nullableIdIconAdapter.toJson(writer, value_.getIcon());
        writer.b0("capturePageConfigs");
        this.nullableListOfCapturePageConfigAdapter.toJson(writer, value_.getCapturePageConfigs());
        writer.C();
    }
}
