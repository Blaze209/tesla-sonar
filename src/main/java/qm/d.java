package qm;

import com.facebook.imagepipeline.producers.h1;
import com.facebook.imagepipeline.producers.z0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\fB'\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lqm/d;", "T", "Lqm/a;", "Lcom/facebook/imagepipeline/producers/z0;", "producer", "Lcom/facebook/imagepipeline/producers/h1;", "settableProducerContext", "Lwm/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/facebook/imagepipeline/producers/z0;Lcom/facebook/imagepipeline/producers/h1;Lwm/d;)V", "j", "a", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d<T> extends a<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: qm.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqm/d$a;", "", "<init>", "()V", "T", "Lcom/facebook/imagepipeline/producers/z0;", "producer", "Lcom/facebook/imagepipeline/producers/h1;", "settableProducerContext", "Lwm/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/facebook/datasource/c;", "a", "(Lcom/facebook/imagepipeline/producers/z0;Lcom/facebook/imagepipeline/producers/h1;Lwm/d;)Lcom/facebook/datasource/c;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> com.facebook.datasource.c<T> a(z0<T> producer, h1 settableProducerContext, wm.d listener) {
            s.k(producer, "producer");
            s.k(settableProducerContext, "settableProducerContext");
            s.k(listener, "listener");
            return new d(producer, settableProducerContext, listener, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(z0 z0Var, h1 h1Var, wm.d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(z0Var, h1Var, dVar);
    }

    private d(z0<T> z0Var, h1 h1Var, wm.d dVar) {
        super(z0Var, h1Var, dVar);
    }
}
