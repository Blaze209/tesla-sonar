package com.fourthline.scanners.config.orca.flavor;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006'"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaFontMapping;", "", "", "fontName", "", OrcaFlavourKeys.FONT_SIZE, "<init>", "(Ljava/lang/String;I)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;ILvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaFontMapping;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lcom/fourthline/scanners/config/orca/flavor/OrcaFontMapping;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFontName", "I", "getFontSize", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class OrcaFontMapping {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String fontName;
    private final int fontSize;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaFontMapping$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaFontMapping;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<OrcaFontMapping> serializer() {
            return OrcaFontMapping$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OrcaFontMapping(int i11, String str, int i12, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, OrcaFontMapping$$serializer.INSTANCE.getDescriptor());
        }
        this.fontName = str;
        this.fontSize = i12;
    }

    public static /* synthetic */ OrcaFontMapping copy$default(OrcaFontMapping orcaFontMapping, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = orcaFontMapping.fontName;
        }
        if ((i12 & 2) != 0) {
            i11 = orcaFontMapping.fontSize;
        }
        return orcaFontMapping.copy(str, i11);
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(OrcaFontMapping self, uo0.d output, f serialDesc) {
        output.e(serialDesc, 0, self.fontName);
        output.x(serialDesc, 1, self.fontSize);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFontName() {
        return this.fontName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    public final OrcaFontMapping copy(String fontName, int fontSize) {
        s.k(fontName, "fontName");
        return new OrcaFontMapping(fontName, fontSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaFontMapping)) {
            return false;
        }
        OrcaFontMapping orcaFontMapping = (OrcaFontMapping) other;
        return s.f(this.fontName, orcaFontMapping.fontName) && this.fontSize == orcaFontMapping.fontSize;
    }

    public final String getFontName() {
        return this.fontName;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public int hashCode() {
        return (this.fontName.hashCode() * 31) + Integer.hashCode(this.fontSize);
    }

    public String toString() {
        return "OrcaFontMapping(fontName=" + this.fontName + ", fontSize=" + this.fontSize + ")";
    }

    public OrcaFontMapping(String fontName, int i11) {
        s.k(fontName, "fontName");
        this.fontName = fontName;
        this.fontSize = i11;
    }
}
