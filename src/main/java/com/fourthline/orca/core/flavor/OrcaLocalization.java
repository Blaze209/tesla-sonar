package com.fourthline.orca.core.flavor;

import java.util.Locale;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaLocalization;", "", "Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "baseLanguage", "fixedLanguage", "<init>", "(Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;)V", "component1", "()Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "component2", "copy", "(Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;)Lcom/fourthline/orca/core/flavor/OrcaLocalization;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "getBaseLanguage", "b", "getFixedLanguage", "LanguageType", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OrcaLocalization {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LanguageType baseLanguage;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LanguageType fixedLanguage;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/fourthline/orca/core/flavor/OrcaLocalization$LanguageType;", "", "<init>", "(Ljava/lang/String;I)V", "", "a", "Ljava/lang/String;", "getLanguageCode$fourthline_sdk_release", "()Ljava/lang/String;", "languageCode", "EN", "NL", "EL", "ES", "FI", "FR", "IT", "DE", "PL", "PT", "RO", "HR", "MT", "ET", "TR", "BG", "NB", "DA", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum LanguageType {
        EN,
        NL,
        EL,
        ES,
        FI,
        FR,
        IT,
        DE,
        PL,
        PT,
        RO,
        HR,
        MT,
        ET,
        TR,
        BG,
        NB,
        DA;


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f24840c = a.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String languageCode;

        LanguageType() {
            String lowerCase = name().toLowerCase(Locale.ROOT);
            s.j(lowerCase, "toLowerCase(...)");
            this.languageCode = lowerCase;
        }

        public static EnumEntries<LanguageType> getEntries() {
            return f24840c;
        }

        /* JADX INFO: renamed from: getLanguageCode$fourthline_sdk_release, reason: from getter */
        public final String getLanguageCode() {
            return this.languageCode;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrcaLocalization() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OrcaLocalization copy$default(OrcaLocalization orcaLocalization, LanguageType languageType, LanguageType languageType2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            languageType = orcaLocalization.baseLanguage;
        }
        if ((i11 & 2) != 0) {
            languageType2 = orcaLocalization.fixedLanguage;
        }
        return orcaLocalization.copy(languageType, languageType2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LanguageType getBaseLanguage() {
        return this.baseLanguage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LanguageType getFixedLanguage() {
        return this.fixedLanguage;
    }

    public final OrcaLocalization copy(LanguageType baseLanguage, LanguageType fixedLanguage) {
        s.k(baseLanguage, "baseLanguage");
        return new OrcaLocalization(baseLanguage, fixedLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaLocalization)) {
            return false;
        }
        OrcaLocalization orcaLocalization = (OrcaLocalization) other;
        return this.baseLanguage == orcaLocalization.baseLanguage && this.fixedLanguage == orcaLocalization.fixedLanguage;
    }

    public final LanguageType getBaseLanguage() {
        return this.baseLanguage;
    }

    public final LanguageType getFixedLanguage() {
        return this.fixedLanguage;
    }

    public int hashCode() {
        int iHashCode = this.baseLanguage.hashCode() * 31;
        LanguageType languageType = this.fixedLanguage;
        return iHashCode + (languageType == null ? 0 : languageType.hashCode());
    }

    public String toString() {
        return "OrcaLocalization(baseLanguage=" + this.baseLanguage + ", fixedLanguage=" + this.fixedLanguage + ")";
    }

    public OrcaLocalization(LanguageType baseLanguage, LanguageType languageType) {
        s.k(baseLanguage, "baseLanguage");
        this.baseLanguage = baseLanguage;
        this.fixedLanguage = languageType;
    }

    public /* synthetic */ OrcaLocalization(LanguageType languageType, LanguageType languageType2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? LanguageType.EN : languageType, (i11 & 2) != 0 ? null : languageType2);
    }
}
