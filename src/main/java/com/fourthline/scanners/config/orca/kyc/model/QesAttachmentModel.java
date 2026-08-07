package com.fourthline.scanners.config.orca.kyc.model;

import com.fourthline.scanners.config.orca.kyc.model.serialization.UUIDSerializer;
import com.fourthline.scanners.config.orca.kyc.model.serialization.UriSerializer;
import java.net.URI;
import java.util.UUID;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel;", "", "Ljava/util/UUID;", "id", "Ljava/net/URI;", "fileUrl", "<init>", "(Ljava/util/UUID;Ljava/net/URI;)V", "", "seen0", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/util/UUID;Ljava/net/URI;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/util/UUID;", "component2", "()Ljava/net/URI;", "copy", "(Ljava/util/UUID;Ljava/net/URI;)Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/UUID;", "getId", "getId$annotations", "()V", "Ljava/net/URI;", "getFileUrl", "getFileUrl$annotations", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class QesAttachmentModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final URI fileUrl;
    private final UUID id;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/QesAttachmentModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<QesAttachmentModel> serializer() {
            return QesAttachmentModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QesAttachmentModel(int i11, UUID uuid, URI uri, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, QesAttachmentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = uuid;
        this.fileUrl = uri;
    }

    public static /* synthetic */ QesAttachmentModel copy$default(QesAttachmentModel qesAttachmentModel, UUID uuid, URI uri, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            uuid = qesAttachmentModel.id;
        }
        if ((i11 & 2) != 0) {
            uri = qesAttachmentModel.fileUrl;
        }
        return qesAttachmentModel.copy(uuid, uri);
    }

    @o("fileUrl")
    @p(with = UriSerializer.class)
    public static /* synthetic */ void getFileUrl$annotations() {
    }

    @o("id")
    @p(with = UUIDSerializer.class)
    public static /* synthetic */ void getId$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(QesAttachmentModel self, uo0.d output, f serialDesc) {
        output.D(serialDesc, 0, UUIDSerializer.INSTANCE, self.id);
        output.D(serialDesc, 1, UriSerializer.INSTANCE, self.fileUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final URI getFileUrl() {
        return this.fileUrl;
    }

    public final QesAttachmentModel copy(UUID id2, URI fileUrl) {
        s.k(id2, "id");
        s.k(fileUrl, "fileUrl");
        return new QesAttachmentModel(id2, fileUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QesAttachmentModel)) {
            return false;
        }
        QesAttachmentModel qesAttachmentModel = (QesAttachmentModel) other;
        return s.f(this.id, qesAttachmentModel.id) && s.f(this.fileUrl, qesAttachmentModel.fileUrl);
    }

    public final URI getFileUrl() {
        return this.fileUrl;
    }

    public final UUID getId() {
        return this.id;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.fileUrl.hashCode();
    }

    public String toString() {
        return "QesAttachmentModel(id=" + this.id + ", fileUrl=" + this.fileUrl + ")";
    }

    public QesAttachmentModel(UUID id2, URI fileUrl) {
        s.k(id2, "id");
        s.k(fileUrl, "fileUrl");
        this.id = id2;
        this.fileUrl = fileUrl;
    }
}
