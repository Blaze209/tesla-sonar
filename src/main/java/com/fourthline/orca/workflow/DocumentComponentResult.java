package com.fourthline.orca.workflow;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/fourthline/orca/workflow/DocumentComponentResult;", "", "Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;", "document", "Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;", "documentAnalysis", "<init>", "(Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;)V", "component1", "()Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;", "component2", "()Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;", "copy", "(Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;)Lcom/fourthline/orca/workflow/DocumentComponentResult;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;", "getDocument", "b", "Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;", "getDocumentAnalysis", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DocumentComponentResult {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final WorkflowResults.Component.Document document;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final WorkflowResults.Component.DocumentAnalysis documentAnalysis;

    public DocumentComponentResult(WorkflowResults.Component.Document document, WorkflowResults.Component.DocumentAnalysis documentAnalysis) {
        s.k(document, "document");
        this.document = document;
        this.documentAnalysis = documentAnalysis;
    }

    public static /* synthetic */ DocumentComponentResult copy$default(DocumentComponentResult documentComponentResult, WorkflowResults.Component.Document document, WorkflowResults.Component.DocumentAnalysis documentAnalysis, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            document = documentComponentResult.document;
        }
        if ((i11 & 2) != 0) {
            documentAnalysis = documentComponentResult.documentAnalysis;
        }
        return documentComponentResult.copy(document, documentAnalysis);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WorkflowResults.Component.Document getDocument() {
        return this.document;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WorkflowResults.Component.DocumentAnalysis getDocumentAnalysis() {
        return this.documentAnalysis;
    }

    public final DocumentComponentResult copy(WorkflowResults.Component.Document document, WorkflowResults.Component.DocumentAnalysis documentAnalysis) {
        s.k(document, "document");
        return new DocumentComponentResult(document, documentAnalysis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DocumentComponentResult)) {
            return false;
        }
        DocumentComponentResult documentComponentResult = (DocumentComponentResult) other;
        return s.f(this.document, documentComponentResult.document) && s.f(this.documentAnalysis, documentComponentResult.documentAnalysis);
    }

    public final WorkflowResults.Component.Document getDocument() {
        return this.document;
    }

    public final WorkflowResults.Component.DocumentAnalysis getDocumentAnalysis() {
        return this.documentAnalysis;
    }

    public int hashCode() {
        int iHashCode = this.document.hashCode() * 31;
        WorkflowResults.Component.DocumentAnalysis documentAnalysis = this.documentAnalysis;
        return iHashCode + (documentAnalysis == null ? 0 : documentAnalysis.hashCode());
    }

    public String toString() {
        return "DocumentComponentResult(document=" + this.document + ", documentAnalysis=" + this.documentAnalysis + ")";
    }

    public /* synthetic */ DocumentComponentResult(WorkflowResults.Component.Document document, WorkflowResults.Component.DocumentAnalysis documentAnalysis, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(document, (i11 & 2) != 0 ? null : documentAnalysis);
    }
}
