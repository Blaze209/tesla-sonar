package com.fourthline.scanners.config;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.e;
import vo0.h1;
import vo0.j0;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u0019R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010,\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b0\u0010+\u001a\u0004\b/\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010+\u001a\u0004\b2\u0010\u001e¨\u00066"}, d2 = {"Lcom/fourthline/scanners/config/IdDocument;", "", "", "type", "", "nationalities", "nfcIssueDate", "", "validityPeriod", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/IdDocument;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/fourthline/scanners/config/IdDocument;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "Ljava/util/List;", "getNationalities", "getNationalities$annotations", "getNfcIssueDate", "getNfcIssueDate$annotations", "Ljava/lang/Integer;", "getValidityPeriod", "getValidityPeriod$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class IdDocument {
    private final List<String> nationalities;
    private final String nfcIssueDate;
    private final String type;
    private final Integer validityPeriod;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final d<Object>[] $childSerializers = {null, new e(z1.f119730a), null, null};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/IdDocument$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/IdDocument;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<IdDocument> serializer() {
            return IdDocument$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ IdDocument(int i11, String str, List list, String str2, Integer num, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, IdDocument$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.nationalities = list;
        if ((i11 & 4) == 0) {
            this.nfcIssueDate = null;
        } else {
            this.nfcIssueDate = str2;
        }
        if ((i11 & 8) == 0) {
            this.validityPeriod = null;
        } else {
            this.validityPeriod = num;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdDocument copy$default(IdDocument idDocument, String str, List list, String str2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = idDocument.type;
        }
        if ((i11 & 2) != 0) {
            list = idDocument.nationalities;
        }
        if ((i11 & 4) != 0) {
            str2 = idDocument.nfcIssueDate;
        }
        if ((i11 & 8) != 0) {
            num = idDocument.validityPeriod;
        }
        return idDocument.copy(str, list, str2, num);
    }

    @o("nationalities")
    public static /* synthetic */ void getNationalities$annotations() {
    }

    @o("nfcIssueDate")
    public static /* synthetic */ void getNfcIssueDate$annotations() {
    }

    @o("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @o("validityPeriod")
    public static /* synthetic */ void getValidityPeriod$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(IdDocument self, uo0.d output, f serialDesc) {
        d<Object>[] dVarArr = $childSerializers;
        output.e(serialDesc, 0, self.type);
        output.D(serialDesc, 1, dVarArr[1], self.nationalities);
        if (output.G(serialDesc, 2) || self.nfcIssueDate != null) {
            output.y(serialDesc, 2, z1.f119730a, self.nfcIssueDate);
        }
        if (!output.G(serialDesc, 3) && self.validityPeriod == null) {
            return;
        }
        output.y(serialDesc, 3, j0.f119632a, self.validityPeriod);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<String> component2() {
        return this.nationalities;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNfcIssueDate() {
        return this.nfcIssueDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getValidityPeriod() {
        return this.validityPeriod;
    }

    public final IdDocument copy(String type, List<String> nationalities, String nfcIssueDate, Integer validityPeriod) {
        s.k(type, "type");
        s.k(nationalities, "nationalities");
        return new IdDocument(type, nationalities, nfcIssueDate, validityPeriod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdDocument)) {
            return false;
        }
        IdDocument idDocument = (IdDocument) other;
        return s.f(this.type, idDocument.type) && s.f(this.nationalities, idDocument.nationalities) && s.f(this.nfcIssueDate, idDocument.nfcIssueDate) && s.f(this.validityPeriod, idDocument.validityPeriod);
    }

    public final List<String> getNationalities() {
        return this.nationalities;
    }

    public final String getNfcIssueDate() {
        return this.nfcIssueDate;
    }

    public final String getType() {
        return this.type;
    }

    public final Integer getValidityPeriod() {
        return this.validityPeriod;
    }

    public int hashCode() {
        int iHashCode = ((this.type.hashCode() * 31) + this.nationalities.hashCode()) * 31;
        String str = this.nfcIssueDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.validityPeriod;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "IdDocument(type=" + this.type + ", nationalities=" + this.nationalities + ", nfcIssueDate=" + this.nfcIssueDate + ", validityPeriod=" + this.validityPeriod + ")";
    }

    public IdDocument(String type, List<String> nationalities, String str, Integer num) {
        s.k(type, "type");
        s.k(nationalities, "nationalities");
        this.type = type;
        this.nationalities = nationalities;
        this.nfcIssueDate = str;
        this.validityPeriod = num;
    }

    public /* synthetic */ IdDocument(String str, List list, String str2, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : num);
    }
}
