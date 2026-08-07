package wm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J'\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lwm/a;", "Lwm/e;", "<init>", "()V", "", "requestId", "producerName", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "eventName", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "t", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "h", "", "successful", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Z)V", "f", "(Ljava/lang/String;)Z", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a implements e {
    @Override // com.facebook.imagepipeline.producers.d1
    public void a(String requestId, String producerName) {
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void c(String requestId, String producerName, Throwable t11, Map<String, String> extraMap) {
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
        s.k(t11, "t");
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void d(String requestId, String producerName, String eventName) {
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
        s.k(eventName, "eventName");
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public boolean f(String requestId) {
        s.k(requestId, "requestId");
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void g(String requestId, String producerName, Map<String, String> extraMap) {
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void h(String requestId, String producerName, Map<String, String> extraMap) {
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public void i(String requestId, String producerName, boolean successful) {
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
    }
}
