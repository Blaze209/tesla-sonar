package com.fourthline.scanners.config.orca.flavor;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;", "", "", "baseLanguage", "fixedLanguage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBaseLanguage", "getFixedLanguage", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class OrcaLocalizationConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String baseLanguage;
    private final String fixedLanguage;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaLocalizationConfig;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<OrcaLocalizationConfig> serializer() {
            return OrcaLocalizationConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OrcaLocalizationConfig(int i11, String str, String str2, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, OrcaLocalizationConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.baseLanguage = str;
        this.fixedLanguage = str2;
    }

    public static /* synthetic */ OrcaLocalizationConfig copy$default(OrcaLocalizationConfig orcaLocalizationConfig, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = orcaLocalizationConfig.baseLanguage;
        }
        if ((i11 & 2) != 0) {
            str2 = orcaLocalizationConfig.fixedLanguage;
        }
        return orcaLocalizationConfig.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(OrcaLocalizationConfig self, uo0.d output, f serialDesc) {
        z1 z1Var = z1.f119730a;
        output.y(serialDesc, 0, z1Var, self.baseLanguage);
        output.y(serialDesc, 1, z1Var, self.fixedLanguage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseLanguage() {
        return this.baseLanguage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFixedLanguage() {
        return this.fixedLanguage;
    }

    public final OrcaLocalizationConfig copy(String baseLanguage, String fixedLanguage) {
        return new OrcaLocalizationConfig(baseLanguage, fixedLanguage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaLocalizationConfig)) {
            return false;
        }
        OrcaLocalizationConfig orcaLocalizationConfig = (OrcaLocalizationConfig) other;
        return s.f(this.baseLanguage, orcaLocalizationConfig.baseLanguage) && s.f(this.fixedLanguage, orcaLocalizationConfig.fixedLanguage);
    }

    public final String getBaseLanguage() {
        return this.baseLanguage;
    }

    public final String getFixedLanguage() {
        return this.fixedLanguage;
    }

    public int hashCode() {
        String str = this.baseLanguage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fixedLanguage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "OrcaLocalizationConfig(baseLanguage=" + this.baseLanguage + ", fixedLanguage=" + this.fixedLanguage + ")";
    }

    public OrcaLocalizationConfig(String str, String str2) {
        this.baseLanguage = str;
        this.fixedLanguage = str2;
    }
}
