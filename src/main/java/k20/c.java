package k20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0010¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u001c\"\u0004\b \u0010\u001eR(\u0010#\u001a\u0004\u0018\u00010\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u001c\"\u0004\b\"\u0010\u001e¨\u0006$"}, d2 = {"Lk20/c;", "Lk20/a;", "", "<init>", "()V", "a", "Lk20/c;", "e", "()Lk20/c;", "f", "(Lk20/c;)V", "sourceConfig", "Lt20/a;", "b", "Lt20/a;", "_basisForProcessing", "", "c", "Ljava/lang/String;", "_documentId", DateTokenConverter.CONVERTER_KEY, "_documentVersion", "_documentDescription", "value", "()Lt20/a;", "setBasisForProcessing", "(Lt20/a;)V", "basisForProcessing", "()Ljava/lang/String;", "setDocumentId", "(Ljava/lang/String;)V", "documentId", "setDocumentVersion", "documentVersion", "setDocumentDescription", "documentDescription", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c sourceConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private t20.a _basisForProcessing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String _documentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String _documentVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String _documentDescription;

    public t20.a a() {
        t20.a aVar = this._basisForProcessing;
        if (aVar != null) {
            return aVar;
        }
        c cVar = this.sourceConfig;
        t20.a aVarA = cVar != null ? cVar.a() : null;
        return aVarA == null ? t20.a.CONTRACT : aVarA;
    }

    public String b() {
        String str = this._documentDescription;
        if (str != null) {
            return str;
        }
        c cVar = this.sourceConfig;
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public String c() {
        String str = this._documentId;
        if (str != null) {
            return str;
        }
        c cVar = this.sourceConfig;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    public String d() {
        String str = this._documentVersion;
        if (str != null) {
            return str;
        }
        c cVar = this.sourceConfig;
        if (cVar != null) {
            return cVar.d();
        }
        return null;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getSourceConfig() {
        return this.sourceConfig;
    }

    public final void f(c cVar) {
        this.sourceConfig = cVar;
    }
}
