package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.p0;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/facebook/react/modules/network/k;", "Lokhttp3/RequestBody;", "requestBody", "Lcom/facebook/react/modules/network/j;", "progressListener", "<init>", "(Lokhttp3/RequestBody;Lcom/facebook/react/modules/network/j;)V", "Lokio/i;", "sink", "Lokio/p0;", "b", "(Lokio/i;)Lokio/p0;", "Lokhttp3/MediaType;", CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljn0/h0;", "writeTo", "(Lokio/i;)V", "a", "Lokhttp3/RequestBody;", "Lcom/facebook/react/modules/network/j;", "c", "J", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final RequestBody requestBody;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j progressListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long contentLength;

    public k(RequestBody requestBody, j progressListener) {
        s.k(requestBody, "requestBody");
        s.k(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    private final p0 b(okio.i sink) {
        return okio.c.a().b(new a(sink.I3()));
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.contentLength == 0) {
            this.contentLength = this.requestBody.contentLength();
        }
        return this.contentLength;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getContentType() {
        return this.requestBody.getContentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.i sink) {
        s.k(sink, "sink");
        okio.i iVarA = okio.c.a().a(b(sink));
        contentLength();
        this.requestBody.writeTo(iVarA);
        iVarA.flush();
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"com/facebook/react/modules/network/k$a", "Ljava/io/FilterOutputStream;", "", "data", "", "offset", "byteCount", "Ljn0/h0;", "write", "([BII)V", "(I)V", "c", "()V", "", "a", "J", "count", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends FilterOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private long count;

        a(OutputStream outputStream) {
            super(outputStream);
        }

        public final void c() {
            long j11 = this.count;
            long jContentLength = k.this.contentLength();
            k.this.progressListener.a(j11, jContentLength, j11 == jContentLength);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] data, int offset, int byteCount) throws IOException {
            s.k(data, "data");
            super.write(data, offset, byteCount);
            this.count += (long) byteCount;
            c();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int data) throws IOException {
            super.write(data);
            this.count++;
            c();
        }
    }
}
