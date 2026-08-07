package expo.modules.filesystem;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.c0;
import okio.i;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lexpo/modules/filesystem/CountingRequestBody;", "Lokhttp3/RequestBody;", "requestBody", "Lexpo/modules/filesystem/CountingRequestListener;", "progressListener", "<init>", "(Lokhttp3/RequestBody;Lexpo/modules/filesystem/CountingRequestListener;)V", "Lokhttp3/MediaType;", CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/i;", "sink", "Ljn0/h0;", "writeTo", "(Lokio/i;)V", "Lokhttp3/RequestBody;", "Lexpo/modules/filesystem/CountingRequestListener;", "expo-file-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountingRequestBody extends RequestBody {
    private final CountingRequestListener progressListener;
    private final RequestBody requestBody;

    public CountingRequestBody(RequestBody requestBody, CountingRequestListener progressListener) {
        s.k(requestBody, "requestBody");
        s.k(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.requestBody.contentLength();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getContentType() {
        return this.requestBody.getContentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(i sink) {
        s.k(sink, "sink");
        i iVarC = c0.c(new CountingSink(sink, this, this.progressListener));
        this.requestBody.writeTo(iVarC);
        iVarC.flush();
    }
}
