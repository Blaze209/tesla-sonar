package qm;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.imagepipeline.producers.a1;
import com.facebook.imagepipeline.producers.h1;
import com.facebook.imagepipeline.producers.n;
import com.facebook.imagepipeline.producers.z0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import pk.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0004¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lqm/a;", "T", "Lcom/facebook/datasource/a;", "", "Lcom/facebook/imagepipeline/producers/z0;", "producer", "Lcom/facebook/imagepipeline/producers/h1;", "settableProducerContext", "Lwm/d;", "requestListener", "<init>", "(Lcom/facebook/imagepipeline/producers/z0;Lcom/facebook/imagepipeline/producers/h1;Lwm/d;)V", "Lcom/facebook/imagepipeline/producers/n;", "x", "()Lcom/facebook/imagepipeline/producers/n;", "", "throwable", "Ljn0/h0;", "B", "(Ljava/lang/Throwable;)V", "A", "()V", "result", "", PermissionsResponse.STATUS_KEY, "Lcom/facebook/imagepipeline/producers/a1;", "producerContext", "C", "(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/a1;)V", "", "", "y", "(Lcom/facebook/imagepipeline/producers/a1;)Ljava/util/Map;", "", "close", "()Z", "h", "Lcom/facebook/imagepipeline/producers/h1;", "z", "()Lcom/facebook/imagepipeline/producers/h1;", IntegerTokenConverter.CONVERTER_KEY, "Lwm/d;", "getRequestListener", "()Lwm/d;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a<T> extends com.facebook.datasource.a<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h1 settableProducerContext;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wm.d requestListener;

    /* JADX INFO: renamed from: qm.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"qm/a$a", "Lcom/facebook/imagepipeline/producers/c;", "newResult", "", PermissionsResponse.STATUS_KEY, "Ljn0/h0;", "h", "(Ljava/lang/Object;I)V", "", "throwable", "g", "(Ljava/lang/Throwable;)V", "f", "()V", "", ReactProgressBarViewManager.PROP_PROGRESS, IntegerTokenConverter.CONVERTER_KEY, "(F)V", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C2243a extends com.facebook.imagepipeline.producers.c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<T> f105687b;

        C2243a(a<T> aVar) {
            this.f105687b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.c
        protected void f() {
            this.f105687b.A();
        }

        @Override // com.facebook.imagepipeline.producers.c
        protected void g(Throwable throwable) {
            s.k(throwable, "throwable");
            this.f105687b.B(throwable);
        }

        @Override // com.facebook.imagepipeline.producers.c
        protected void h(T newResult, int status) {
            a<T> aVar = this.f105687b;
            aVar.C(newResult, status, aVar.getSettableProducerContext());
        }

        @Override // com.facebook.imagepipeline.producers.c
        protected void i(float progress) {
            this.f105687b.p(progress);
        }
    }

    protected a(z0<T> producer, h1 settableProducerContext, wm.d requestListener) {
        s.k(producer, "producer");
        s.k(settableProducerContext, "settableProducerContext");
        s.k(requestListener, "requestListener");
        this.settableProducerContext = settableProducerContext;
        this.requestListener = requestListener;
        if (!bn.b.d()) {
            l(settableProducerContext.getExtras());
            if (bn.b.d()) {
                bn.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.c(settableProducerContext);
                    h0 h0Var = h0.f84049a;
                    bn.b.b();
                } catch (Throwable th2) {
                    bn.b.b();
                    throw th2;
                }
            } else {
                requestListener.c(settableProducerContext);
            }
            if (!bn.b.d()) {
                producer.a(x(), settableProducerContext);
                return;
            }
            bn.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.a(x(), settableProducerContext);
                h0 h0Var2 = h0.f84049a;
                return;
            } finally {
                bn.b.b();
            }
        }
        bn.b.a("AbstractProducerToDataSourceAdapter()");
        try {
            l(settableProducerContext.getExtras());
            if (bn.b.d()) {
                bn.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.c(settableProducerContext);
                    h0 h0Var3 = h0.f84049a;
                    bn.b.b();
                } catch (Throwable th3) {
                    bn.b.b();
                    throw th3;
                }
            } else {
                requestListener.c(settableProducerContext);
            }
            if (bn.b.d()) {
                bn.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.a(x(), settableProducerContext);
                    h0 h0Var4 = h0.f84049a;
                    bn.b.b();
                } finally {
                    bn.b.b();
                }
            } else {
                producer.a(x(), settableProducerContext);
            }
            h0 h0Var5 = h0.f84049a;
        } catch (Throwable th4) {
            bn.b.b();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void A() {
        k.i(h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(Throwable throwable) {
        if (super.n(throwable, y(this.settableProducerContext))) {
            this.requestListener.i(this.settableProducerContext, throwable);
        }
    }

    private final n<T> x() {
        return new C2243a(this);
    }

    protected void C(T result, int status, a1 producerContext) {
        s.k(producerContext, "producerContext");
        boolean zD = com.facebook.imagepipeline.producers.c.d(status);
        if (super.r(result, zD, y(producerContext)) && zD) {
            this.requestListener.e(this.settableProducerContext);
        }
    }

    @Override // com.facebook.datasource.a, com.facebook.datasource.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.isFinished()) {
            return true;
        }
        this.requestListener.g(this.settableProducerContext);
        this.settableProducerContext.f();
        return true;
    }

    protected final Map<String, Object> y(a1 producerContext) {
        s.k(producerContext, "producerContext");
        return producerContext.getExtras();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final h1 getSettableProducerContext() {
        return this.settableProducerContext;
    }
}
