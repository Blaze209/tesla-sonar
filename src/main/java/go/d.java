package go;

import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ5\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\rJ'\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010(R,\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R,\u0010.\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,¨\u0006/"}, d2 = {"Lgo/d;", "Lwm/a;", "<init>", "()V", "", "requestId", "producerName", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "t", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "h", "eventName", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/imagepipeline/request/a;", "request", "", "callerContext", "", "isPrefetch", "e", "(Lcom/facebook/imagepipeline/request/a;Ljava/lang/Object;Ljava/lang/String;Z)V", "b", "(Lcom/facebook/imagepipeline/request/a;Ljava/lang/String;Z)V", "throwable", "j", "(Lcom/facebook/imagepipeline/request/a;Ljava/lang/String;Ljava/lang/Throwable;Z)V", "k", "(Ljava/lang/String;)V", "f", "(Ljava/lang/String;)Z", "", "I", "currentId", "", "Landroid/util/Pair;", "Ljava/util/Map;", "producerId", "requestsId", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends wm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int currentId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Pair<Integer, String>> producerId = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Pair<Integer, String>> requestsId = new LinkedHashMap();

    @Override // wm.a, com.facebook.imagepipeline.producers.d1
    public void a(String requestId, String producerName) {
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
        if (ep.a.j(0L)) {
            Pair<Integer, String> pairCreate = Pair.create(Integer.valueOf(this.currentId), "FRESCO_PRODUCER_" + t.U(producerName, CoreConstants.COLON_CHAR, '_', false, 4, null));
            Object second = pairCreate.second;
            s.j(second, "second");
            ep.a.a(0L, (String) second, this.currentId);
            this.producerId.put(requestId, pairCreate);
            this.currentId++;
        }
    }

    @Override // wm.e
    public void b(com.facebook.imagepipeline.request.a request, String requestId, boolean isPrefetch) {
        Pair<Integer, String> pair;
        s.k(request, "request");
        s.k(requestId, "requestId");
        if (ep.a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            s.j(second, "second");
            Object first = pair.first;
            s.j(first, "first");
            ep.a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // wm.a, com.facebook.imagepipeline.producers.d1
    public void c(String requestId, String producerName, Throwable t11, Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
        s.k(t11, "t");
        if (ep.a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            s.j(second, "second");
            Object first = pair.first;
            s.j(first, "first");
            ep.a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // wm.a, com.facebook.imagepipeline.producers.d1
    public void d(String requestId, String producerName, String eventName) {
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
        s.k(eventName, "eventName");
        if (ep.a.j(0L)) {
            ep.a.n(0L, "FRESCO_PRODUCER_EVENT_" + t.U(requestId, CoreConstants.COLON_CHAR, '_', false, 4, null) + "_" + t.U(producerName, CoreConstants.COLON_CHAR, '_', false, 4, null) + "_" + t.U(eventName, CoreConstants.COLON_CHAR, '_', false, 4, null), ep.a.EnumC1295a.THREAD);
        }
    }

    @Override // wm.e
    public void e(com.facebook.imagepipeline.request.a request, Object callerContext, String requestId, boolean isPrefetch) {
        s.k(request, "request");
        s.k(callerContext, "callerContext");
        s.k(requestId, "requestId");
        if (ep.a.j(0L)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FRESCO_REQUEST_");
            String string = request.v().toString();
            s.j(string, "toString(...)");
            sb2.append(t.U(string, CoreConstants.COLON_CHAR, '_', false, 4, null));
            Pair<Integer, String> pairCreate = Pair.create(Integer.valueOf(this.currentId), sb2.toString());
            Object second = pairCreate.second;
            s.j(second, "second");
            ep.a.a(0L, (String) second, this.currentId);
            this.requestsId.put(requestId, pairCreate);
            this.currentId++;
        }
    }

    @Override // wm.a, com.facebook.imagepipeline.producers.d1
    public boolean f(String requestId) {
        s.k(requestId, "requestId");
        return false;
    }

    @Override // wm.a, com.facebook.imagepipeline.producers.d1
    public void g(String requestId, String producerName, Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
        if (ep.a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            s.j(second, "second");
            Object first = pair.first;
            s.j(first, "first");
            ep.a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // wm.a, com.facebook.imagepipeline.producers.d1
    public void h(String requestId, String producerName, Map<String, String> extraMap) {
        Pair<Integer, String> pair;
        s.k(requestId, "requestId");
        s.k(producerName, "producerName");
        if (ep.a.j(0L) && (pair = this.producerId.get(requestId)) != null) {
            Object second = pair.second;
            s.j(second, "second");
            Object first = pair.first;
            s.j(first, "first");
            ep.a.g(0L, (String) second, ((Number) first).intValue());
            this.producerId.remove(requestId);
        }
    }

    @Override // wm.e
    public void j(com.facebook.imagepipeline.request.a request, String requestId, Throwable throwable, boolean isPrefetch) {
        Pair<Integer, String> pair;
        s.k(request, "request");
        s.k(requestId, "requestId");
        s.k(throwable, "throwable");
        if (ep.a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            s.j(second, "second");
            Object first = pair.first;
            s.j(first, "first");
            ep.a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }

    @Override // wm.e
    public void k(String requestId) {
        Pair<Integer, String> pair;
        s.k(requestId, "requestId");
        if (ep.a.j(0L) && (pair = this.requestsId.get(requestId)) != null) {
            Object second = pair.second;
            s.j(second, "second");
            Object first = pair.first;
            s.j(first, "first");
            ep.a.g(0L, (String) second, ((Number) first).intValue());
            this.requestsId.remove(requestId);
        }
    }
}
