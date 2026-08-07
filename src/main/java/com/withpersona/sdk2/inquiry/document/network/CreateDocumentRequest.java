package com.withpersona.sdk2.inquiry.document.network;

import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000f\u0010\u0011\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "data", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "meta", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;)V", "a", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "b", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "c", "Data", "Attributes", "Meta", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateDocumentRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Data data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Meta meta;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "", "", "kind", "", "fileLimit", "<init>", "(Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "I", "()I", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String kind;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int fileLimit;

        public Attributes(String kind, int i11) {
            s.k(kind, "kind");
            this.kind = kind;
            this.fileLimit = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFileLimit() {
            return this.fileLimit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getKind() {
            return this.kind;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Data;", "", "", "type", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "()Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Attributes;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Attributes attributes;

        public Data(String type, Attributes attributes) {
            s.k(type, "type");
            s.k(attributes, "attributes");
            this.type = type;
            this.attributes = attributes;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Attributes getAttributes() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$Meta;", "", "", "fieldKeyDocument", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Meta {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String fieldKeyDocument;

        public Meta(String fieldKeyDocument) {
            s.k(fieldKeyDocument, "fieldKeyDocument");
            this.fieldKeyDocument = fieldKeyDocument;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.network.CreateDocumentRequest$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest$a;", "", "<init>", "()V", "", "type", "kind", "", "fileLimit", "fieldKeyDocument", "Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/CreateDocumentRequest;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CreateDocumentRequest a(String type, String kind, int fileLimit, String fieldKeyDocument) {
            s.k(type, "type");
            s.k(kind, "kind");
            s.k(fieldKeyDocument, "fieldKeyDocument");
            return new CreateDocumentRequest(new Data(type, new Attributes(kind, fileLimit)), new Meta(fieldKeyDocument));
        }

        private Companion() {
        }
    }

    public CreateDocumentRequest(Data data, Meta meta) {
        s.k(data, "data");
        s.k(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Meta getMeta() {
        return this.meta;
    }
}
