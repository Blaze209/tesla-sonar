package sk0;

import io.ktor.client.engine.okhttp.StreamAdapterIOException;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.c0;
import okio.r0;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsk0/i;", "Lokhttp3/RequestBody;", "", "contentLength", "Lkotlin/Function0;", "Lio/ktor/utils/io/g;", "block", "<init>", "(Ljava/lang/Long;Lwn0/a;)V", "Lokhttp3/MediaType;", CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "Lokio/i;", "sink", "Ljn0/h0;", "writeTo", "(Lokio/i;)V", "()J", "", "isOneShot", "()Z", "a", "Ljava/lang/Long;", "b", "Lwn0/a;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Long contentLength;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<io.ktor.utils.io.g> block;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Long l11, wn0.a<? extends io.ktor.utils.io.g> block) {
        s.k(block, "block");
        this.contentLength = l11;
        this.block = block;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        Long l11 = this.contentLength;
        if (l11 != null) {
            return l11.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getContentType() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return true;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.i sink) throws IOException {
        Long lValueOf;
        s.k(sink, "sink");
        try {
            Throwable th2 = null;
            r0 r0VarM = c0.m(io.ktor.utils.io.jvm.javaio.b.d(this.block.invoke(), null, 1, null));
            try {
                lValueOf = Long.valueOf(sink.q2(r0VarM));
                if (r0VarM != null) {
                    try {
                        r0VarM.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
            } catch (Throwable th4) {
                if (r0VarM != null) {
                    try {
                        r0VarM.close();
                    } catch (Throwable th5) {
                        jn0.g.a(th4, th5);
                    }
                }
                th2 = th4;
                lValueOf = null;
            }
            if (th2 != null) {
                throw th2;
            }
            s.h(lValueOf);
        } catch (IOException e11) {
            throw e11;
        } catch (Throwable th6) {
            throw new StreamAdapterIOException(th6);
        }
    }
}
