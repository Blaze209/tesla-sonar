package com.fourthline.scanners.config.orca.kyc.model;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.e;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:9B?\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010+R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010(\u0012\u0004\b0\u0010-\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010+R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010(\u0012\u0004\b3\u0010-\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010+R0\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00104\u0012\u0004\b8\u0010-\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/SecondaryDocumentModel;", "", "", "type", "issueDate", "expirationDate", "", "Lcom/fourthline/scanners/config/orca/kyc/model/AttachmentModel$Document;", "images", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/SecondaryDocumentModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/fourthline/scanners/config/orca/kyc/model/SecondaryDocumentModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getType$annotations", "()V", "getIssueDate", "setIssueDate", "getIssueDate$annotations", "getExpirationDate", "setExpirationDate", "getExpirationDate$annotations", "Ljava/util/List;", "getImages", "setImages", "(Ljava/util/List;)V", "getImages$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class SecondaryDocumentModel {
    private String expirationDate;
    private List<AttachmentModel.Document> images;
    private String issueDate;
    private String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final d<Object>[] $childSerializers = {null, null, null, new e(AttachmentModel$Document$$serializer.INSTANCE)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/SecondaryDocumentModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/SecondaryDocumentModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<SecondaryDocumentModel> serializer() {
            return SecondaryDocumentModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SecondaryDocumentModel() {
        this((String) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SecondaryDocumentModel copy$default(SecondaryDocumentModel secondaryDocumentModel, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = secondaryDocumentModel.type;
        }
        if ((i11 & 2) != 0) {
            str2 = secondaryDocumentModel.issueDate;
        }
        if ((i11 & 4) != 0) {
            str3 = secondaryDocumentModel.expirationDate;
        }
        if ((i11 & 8) != 0) {
            list = secondaryDocumentModel.images;
        }
        return secondaryDocumentModel.copy(str, str2, str3, list);
    }

    @o("expirationDate")
    public static /* synthetic */ void getExpirationDate$annotations() {
    }

    @o("images")
    public static /* synthetic */ void getImages$annotations() {
    }

    @o("issueDate")
    public static /* synthetic */ void getIssueDate$annotations() {
    }

    @o("type")
    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(SecondaryDocumentModel self, uo0.d output, f serialDesc) {
        d<Object>[] dVarArr = $childSerializers;
        if (output.G(serialDesc, 0) || self.type != null) {
            output.y(serialDesc, 0, z1.f119730a, self.type);
        }
        if (output.G(serialDesc, 1) || self.issueDate != null) {
            output.y(serialDesc, 1, z1.f119730a, self.issueDate);
        }
        if (output.G(serialDesc, 2) || self.expirationDate != null) {
            output.y(serialDesc, 2, z1.f119730a, self.expirationDate);
        }
        if (!output.G(serialDesc, 3) && self.images == null) {
            return;
        }
        output.y(serialDesc, 3, dVarArr[3], self.images);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final List<AttachmentModel.Document> component4() {
        return this.images;
    }

    public final SecondaryDocumentModel copy(String type, String issueDate, String expirationDate, List<AttachmentModel.Document> images) {
        return new SecondaryDocumentModel(type, issueDate, expirationDate, images);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecondaryDocumentModel)) {
            return false;
        }
        SecondaryDocumentModel secondaryDocumentModel = (SecondaryDocumentModel) other;
        return s.f(this.type, secondaryDocumentModel.type) && s.f(this.issueDate, secondaryDocumentModel.issueDate) && s.f(this.expirationDate, secondaryDocumentModel.expirationDate) && s.f(this.images, secondaryDocumentModel.images);
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final List<AttachmentModel.Document> getImages() {
        return this.images;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.issueDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<AttachmentModel.Document> list = this.images;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final void setExpirationDate(String str) {
        this.expirationDate = str;
    }

    public final void setImages(List<AttachmentModel.Document> list) {
        this.images = list;
    }

    public final void setIssueDate(String str) {
        this.issueDate = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "SecondaryDocumentModel(type=" + this.type + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", images=" + this.images + ")";
    }

    public SecondaryDocumentModel(String str) {
        this(str, (String) null, (String) null, (List) null, 14, (DefaultConstructorMarker) null);
    }

    public SecondaryDocumentModel(String str, String str2) {
        this(str, str2, (String) null, (List) null, 12, (DefaultConstructorMarker) null);
    }

    public SecondaryDocumentModel(String str, String str2, String str3) {
        this(str, str2, str3, (List) null, 8, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ SecondaryDocumentModel(int i11, String str, String str2, String str3, List list, v1 v1Var) {
        if ((i11 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i11 & 2) == 0) {
            this.issueDate = null;
        } else {
            this.issueDate = str2;
        }
        if ((i11 & 4) == 0) {
            this.expirationDate = null;
        } else {
            this.expirationDate = str3;
        }
        if ((i11 & 8) == 0) {
            this.images = null;
        } else {
            this.images = list;
        }
    }

    public SecondaryDocumentModel(String str, String str2, String str3, List<AttachmentModel.Document> list) {
        this.type = str;
        this.issueDate = str2;
        this.expirationDate = str3;
        this.images = list;
    }

    public /* synthetic */ SecondaryDocumentModel(String str, String str2, String str3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : list);
    }
}
