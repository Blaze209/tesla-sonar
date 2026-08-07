package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0018\u0010\u0012\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J)\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/facebook/imagepipeline/producers/e0;", "Lcom/facebook/imagepipeline/producers/c1;", "Lcom/facebook/imagepipeline/producers/d1;", "producerListener", "producerListener2", "<init>", "(Lcom/facebook/imagepipeline/producers/d1;Lcom/facebook/imagepipeline/producers/c1;)V", "Lcom/facebook/imagepipeline/producers/a1;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "producerName", "Ljn0/h0;", "b", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;)V", "eventName", "h", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;Ljava/lang/String;)V", "", "extraMap", "j", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;Ljava/util/Map;)V", "", "t", "k", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", DateTokenConverter.CONVERTER_KEY, "", "successful", "a", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;Z)V", "f", "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;)Z", "Lcom/facebook/imagepipeline/producers/d1;", "getProducerListener", "()Lcom/facebook/imagepipeline/producers/d1;", "Lcom/facebook/imagepipeline/producers/c1;", "getProducerListener2", "()Lcom/facebook/imagepipeline/producers/c1;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class e0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d1 producerListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c1 producerListener2;

    public e0(d1 d1Var, c1 c1Var) {
        this.producerListener = d1Var;
        this.producerListener2 = c1Var;
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void a(a1 context, String producerName, boolean successful) {
        p013kotlin.jvm.internal.s.k(context, "context");
        d1 d1Var = this.producerListener;
        if (d1Var != null) {
            d1Var.i(context.getId(), producerName, successful);
        }
        c1 c1Var = this.producerListener2;
        if (c1Var != null) {
            c1Var.a(context, producerName, successful);
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void b(a1 context, String producerName) {
        p013kotlin.jvm.internal.s.k(context, "context");
        d1 d1Var = this.producerListener;
        if (d1Var != null) {
            d1Var.a(context.getId(), producerName);
        }
        c1 c1Var = this.producerListener2;
        if (c1Var != null) {
            c1Var.b(context, producerName);
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void d(a1 context, String producerName, Map<String, String> extraMap) {
        p013kotlin.jvm.internal.s.k(context, "context");
        d1 d1Var = this.producerListener;
        if (d1Var != null) {
            d1Var.h(context.getId(), producerName, extraMap);
        }
        c1 c1Var = this.producerListener2;
        if (c1Var != null) {
            c1Var.d(context, producerName, extraMap);
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public boolean f(a1 context, String producerName) {
        p013kotlin.jvm.internal.s.k(context, "context");
        d1 d1Var = this.producerListener;
        Boolean boolValueOf = d1Var != null ? Boolean.valueOf(d1Var.f(context.getId())) : null;
        if (!p013kotlin.jvm.internal.s.f(boolValueOf, Boolean.TRUE)) {
            c1 c1Var = this.producerListener2;
            boolValueOf = c1Var != null ? Boolean.valueOf(c1Var.f(context, producerName)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void h(a1 context, String producerName, String eventName) {
        p013kotlin.jvm.internal.s.k(context, "context");
        d1 d1Var = this.producerListener;
        if (d1Var != null) {
            d1Var.d(context.getId(), producerName, eventName);
        }
        c1 c1Var = this.producerListener2;
        if (c1Var != null) {
            c1Var.h(context, producerName, eventName);
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void j(a1 context, String producerName, Map<String, String> extraMap) {
        p013kotlin.jvm.internal.s.k(context, "context");
        d1 d1Var = this.producerListener;
        if (d1Var != null) {
            d1Var.g(context.getId(), producerName, extraMap);
        }
        c1 c1Var = this.producerListener2;
        if (c1Var != null) {
            c1Var.j(context, producerName, extraMap);
        }
    }

    @Override // com.facebook.imagepipeline.producers.c1
    public void k(a1 context, String producerName, Throwable t11, Map<String, String> extraMap) {
        p013kotlin.jvm.internal.s.k(context, "context");
        d1 d1Var = this.producerListener;
        if (d1Var != null) {
            d1Var.c(context.getId(), producerName, t11, extraMap);
        }
        c1 c1Var = this.producerListener2;
        if (c1Var != null) {
            c1Var.k(context, producerName, t11, extraMap);
        }
    }
}
