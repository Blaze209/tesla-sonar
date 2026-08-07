package wm;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.imagepipeline.producers.a1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\u001dB\u001b\b\u0016\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0017\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\nJ\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'¨\u0006)"}, d2 = {"Lwm/b;", "Lwm/d;", "", "listenersToAdd", "<init>", "(Ljava/util/Set;)V", "Lcom/facebook/imagepipeline/producers/a1;", "producerContext", "Ljn0/h0;", "c", "(Lcom/facebook/imagepipeline/producers/a1;)V", "", "producerName", "b", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;)V", "", "extraMap", "j", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;Ljava/util/Map;)V", "", "t", "k", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", DateTokenConverter.CONVERTER_KEY, "producerEventName", "h", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;Ljava/lang/String;)V", "", "successful", "a", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;Z)V", "e", "throwable", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/Throwable;)V", "g", "f", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;)Z", "", "Ljava/util/List;", "requestListeners", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<d> requestListeners;

    public b(Set<? extends d> set) {
        if (set == null) {
            this.requestListeners = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.requestListeners = arrayList;
        v.m0(set, arrayList);
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void a(a1 producerContext, String producerName, boolean successful) {
        s.k(producerContext, "producerContext");
        s.k(producerName, "producerName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).a(producerContext, producerName, successful);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void b(a1 producerContext, String producerName) {
        s.k(producerContext, "producerContext");
        s.k(producerName, "producerName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).b(producerContext, producerName);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e11);
            }
        }
    }

    @Override // wm.d
    public void c(a1 producerContext) {
        s.k(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).c(producerContext);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void d(a1 producerContext, String producerName, Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).d(producerContext, producerName, extraMap);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e11);
            }
        }
    }

    @Override // wm.d
    public void e(a1 producerContext) {
        s.k(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).e(producerContext);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public boolean f(a1 producerContext, String producerName) {
        s.k(producerContext, "producerContext");
        s.k(producerName, "producerName");
        List<d> list = this.requestListeners;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override // wm.d
    public void g(a1 producerContext) {
        s.k(producerContext, "producerContext");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).g(producerContext);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void h(a1 producerContext, String producerName, String producerEventName) {
        s.k(producerContext, "producerContext");
        s.k(producerName, "producerName");
        s.k(producerEventName, "producerEventName");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).h(producerContext, producerName, producerEventName);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e11);
            }
        }
    }

    @Override // wm.d
    public void i(a1 producerContext, Throwable throwable) {
        s.k(producerContext, "producerContext");
        s.k(throwable, "throwable");
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).i(producerContext, throwable);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void j(a1 producerContext, String producerName, Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).j(producerContext, producerName, extraMap);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e11);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void k(a1 producerContext, String producerName, Throwable t11, Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((d) it.next()).k(producerContext, producerName, t11, extraMap);
            } catch (Exception e11) {
                qk.a.n("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e11);
            }
        }
    }
}
