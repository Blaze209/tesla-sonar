package ii;

import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lii/a0;", "", "Lokio/i;", "sink", "Ljn0/h0;", "a", "(Lokio/i;)V", "", "getContentType", "()Ljava/lang/String;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "getContentLength", "()J", "contentLength", "getFileName", "fileName", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface a0 {
    void a(okio.i sink);

    long getContentLength();

    String getContentType();

    String getFileName();
}
