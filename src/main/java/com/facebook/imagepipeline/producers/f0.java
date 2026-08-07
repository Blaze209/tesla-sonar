package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/imagepipeline/producers/f0;", "Lcom/facebook/imagepipeline/producers/e0;", "Lwm/d;", "Lwm/e;", "requestListener", "requestListener2", "<init>", "(Lwm/e;Lwm/d;)V", "Lcom/facebook/imagepipeline/producers/a1;", "producerContext", "Ljn0/h0;", "c", "(Lcom/facebook/imagepipeline/producers/a1;)V", "e", "", "throwable", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/Throwable;)V", "g", "Lwm/e;", DateTokenConverter.CONVERTER_KEY, "Lwm/d;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 extends e0 implements wm.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wm.e requestListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wm.d requestListener2;

    public f0(wm.e eVar, wm.d dVar) {
        super(eVar, dVar);
        this.requestListener = eVar;
        this.requestListener2 = dVar;
    }

    @Override // wm.d
    public void c(a1 producerContext) {
        p013kotlin.jvm.internal.s.k(producerContext, "producerContext");
        wm.e eVar = this.requestListener;
        if (eVar != null) {
            eVar.e(producerContext.B(), producerContext.c(), producerContext.getId(), producerContext.c0());
        }
        wm.d dVar = this.requestListener2;
        if (dVar != null) {
            dVar.c(producerContext);
        }
    }

    @Override // wm.d
    public void e(a1 producerContext) {
        p013kotlin.jvm.internal.s.k(producerContext, "producerContext");
        wm.e eVar = this.requestListener;
        if (eVar != null) {
            eVar.b(producerContext.B(), producerContext.getId(), producerContext.c0());
        }
        wm.d dVar = this.requestListener2;
        if (dVar != null) {
            dVar.e(producerContext);
        }
    }

    @Override // wm.d
    public void g(a1 producerContext) {
        p013kotlin.jvm.internal.s.k(producerContext, "producerContext");
        wm.e eVar = this.requestListener;
        if (eVar != null) {
            eVar.k(producerContext.getId());
        }
        wm.d dVar = this.requestListener2;
        if (dVar != null) {
            dVar.g(producerContext);
        }
    }

    @Override // wm.d
    public void i(a1 producerContext, Throwable throwable) {
        p013kotlin.jvm.internal.s.k(producerContext, "producerContext");
        wm.e eVar = this.requestListener;
        if (eVar != null) {
            eVar.j(producerContext.B(), producerContext.getId(), throwable, producerContext.c0());
        }
        wm.d dVar = this.requestListener2;
        if (dVar != null) {
            dVar.i(producerContext, throwable);
        }
    }
}
