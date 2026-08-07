package com.fourthline.scanners.config.orca.flavor;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig;", "", "Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;", "cellStyle1", "cellStyle2", "<init>", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;", "component2", "copy", "(Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;)Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/scanners/config/orca/flavor/OrcaCellConfig;", "getCellStyle1", "getCellStyle2", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class OrcaCellsConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final OrcaCellConfig cellStyle1;
    private final OrcaCellConfig cellStyle2;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/flavor/OrcaCellsConfig;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<OrcaCellsConfig> serializer() {
            return OrcaCellsConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OrcaCellsConfig(int i11, OrcaCellConfig orcaCellConfig, OrcaCellConfig orcaCellConfig2, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, OrcaCellsConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.cellStyle1 = orcaCellConfig;
        this.cellStyle2 = orcaCellConfig2;
    }

    public static /* synthetic */ OrcaCellsConfig copy$default(OrcaCellsConfig orcaCellsConfig, OrcaCellConfig orcaCellConfig, OrcaCellConfig orcaCellConfig2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            orcaCellConfig = orcaCellsConfig.cellStyle1;
        }
        if ((i11 & 2) != 0) {
            orcaCellConfig2 = orcaCellsConfig.cellStyle2;
        }
        return orcaCellsConfig.copy(orcaCellConfig, orcaCellConfig2);
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(OrcaCellsConfig self, uo0.d output, f serialDesc) {
        OrcaCellConfig$$serializer orcaCellConfig$$serializer = OrcaCellConfig$$serializer.INSTANCE;
        output.y(serialDesc, 0, orcaCellConfig$$serializer, self.cellStyle1);
        output.y(serialDesc, 1, orcaCellConfig$$serializer, self.cellStyle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OrcaCellConfig getCellStyle1() {
        return this.cellStyle1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OrcaCellConfig getCellStyle2() {
        return this.cellStyle2;
    }

    public final OrcaCellsConfig copy(OrcaCellConfig cellStyle1, OrcaCellConfig cellStyle2) {
        return new OrcaCellsConfig(cellStyle1, cellStyle2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrcaCellsConfig)) {
            return false;
        }
        OrcaCellsConfig orcaCellsConfig = (OrcaCellsConfig) other;
        return s.f(this.cellStyle1, orcaCellsConfig.cellStyle1) && s.f(this.cellStyle2, orcaCellsConfig.cellStyle2);
    }

    public final OrcaCellConfig getCellStyle1() {
        return this.cellStyle1;
    }

    public final OrcaCellConfig getCellStyle2() {
        return this.cellStyle2;
    }

    public int hashCode() {
        OrcaCellConfig orcaCellConfig = this.cellStyle1;
        int iHashCode = (orcaCellConfig == null ? 0 : orcaCellConfig.hashCode()) * 31;
        OrcaCellConfig orcaCellConfig2 = this.cellStyle2;
        return iHashCode + (orcaCellConfig2 != null ? orcaCellConfig2.hashCode() : 0);
    }

    public String toString() {
        return "OrcaCellsConfig(cellStyle1=" + this.cellStyle1 + ", cellStyle2=" + this.cellStyle2 + ")";
    }

    public OrcaCellsConfig(OrcaCellConfig orcaCellConfig, OrcaCellConfig orcaCellConfig2) {
        this.cellStyle1 = orcaCellConfig;
        this.cellStyle2 = orcaCellConfig2;
    }
}
