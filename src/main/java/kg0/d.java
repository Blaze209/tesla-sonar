package kg0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import java.io.File;
import java.io.FileInputStream;
import jn0.h0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.i;
import org.spongycastle.cms.CMSAttributeTableGenerator;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lkg0/d;", "Lokhttp3/RequestBody;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lokhttp3/MediaType;", "mediaType", "<init>", "(Ljava/io/File;Lokhttp3/MediaType;)V", CMSAttributeTableGenerator.CONTENT_TYPE, "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lokio/i;", "sink", "Ljn0/h0;", "writeTo", "(Lokio/i;)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "a", "()Lkotlinx/coroutines/flow/StateFlow;", "Ljava/io/File;", "b", "Lokhttp3/MediaType;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", AnalyticsContext.Flow, DateTokenConverter.CONVERTER_KEY, "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MediaType mediaType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<Integer> flow;

    public d(File file, MediaType mediaType) {
        s.k(file, "file");
        this.file = file;
        this.mediaType = mediaType;
        this.flow = StateFlowKt.MutableStateFlow(0);
    }

    public final StateFlow<Integer> a() {
        return FlowKt.asStateFlow(this.flow);
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.file.length();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public MediaType getMediaType() {
        return this.mediaType;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(i sink) {
        s.k(sink, "sink");
        float length = this.file.length();
        byte[] bArr = new byte[2048];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            int i11 = fileInputStream.read(bArr);
            long j11 = 0;
            int i12 = 0;
            while (i11 != -1) {
                j11 += (long) i11;
                sink.write(bArr, 0, i11);
                i11 = fileInputStream.read(bArr);
                int iD = yn0.a.d((j11 / length) * 100.0f);
                if (iD - i12 > 1 || iD >= 100) {
                    this.flow.tryEmit(Integer.valueOf(iD));
                    i12 = iD;
                }
            }
            h0 h0Var = h0.f84049a;
            sn0.b.a(fileInputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }
}
