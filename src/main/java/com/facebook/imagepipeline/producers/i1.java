package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010!R\"\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/facebook/imagepipeline/producers/i1;", "T", "Lnk/h;", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "Lcom/facebook/imagepipeline/producers/c1;", "producerListener", "Lcom/facebook/imagepipeline/producers/a1;", "producerContext", "", "producerName", "<init>", "(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/c1;Lcom/facebook/imagepipeline/producers/a1;Ljava/lang/String;)V", "result", "Ljn0/h0;", "f", "(Ljava/lang/Object;)V", "Ljava/lang/Exception;", "e", "(Ljava/lang/Exception;)V", DateTokenConverter.CONVERTER_KEY, "()V", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/util/Map;", "exception", "h", "(Ljava/lang/Exception;)Ljava/util/Map;", "b", "Lcom/facebook/imagepipeline/producers/n;", "c", "Lcom/facebook/imagepipeline/producers/c1;", "Lcom/facebook/imagepipeline/producers/a1;", "Ljava/lang/String;", "g", "()Ljava/util/Map;", "extraMapOnCancellation", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class i1<T> extends nk.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n<T> consumer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c1 producerListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a1 producerContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String producerName;

    public i1(n<T> consumer, c1 producerListener, a1 producerContext, String producerName) {
        p013kotlin.jvm.internal.s.k(consumer, "consumer");
        p013kotlin.jvm.internal.s.k(producerListener, "producerListener");
        p013kotlin.jvm.internal.s.k(producerContext, "producerContext");
        p013kotlin.jvm.internal.s.k(producerName, "producerName");
        this.consumer = consumer;
        this.producerListener = producerListener;
        this.producerContext = producerContext;
        this.producerName = producerName;
        producerListener.b(producerContext, producerName);
    }

    @Override // nk.h
    protected void d() {
        c1 c1Var = this.producerListener;
        a1 a1Var = this.producerContext;
        String str = this.producerName;
        c1Var.d(a1Var, str, c1Var.f(a1Var, str) ? g() : null);
        this.consumer.a();
    }

    @Override // nk.h
    protected void e(Exception e11) {
        p013kotlin.jvm.internal.s.k(e11, "e");
        c1 c1Var = this.producerListener;
        a1 a1Var = this.producerContext;
        String str = this.producerName;
        c1Var.k(a1Var, str, e11, c1Var.f(a1Var, str) ? h(e11) : null);
        this.consumer.onFailure(e11);
    }

    @Override // nk.h
    protected void f(T result) {
        c1 c1Var = this.producerListener;
        a1 a1Var = this.producerContext;
        String str = this.producerName;
        c1Var.j(a1Var, str, c1Var.f(a1Var, str) ? i(result) : null);
        this.consumer.b(result, 1);
    }

    protected Map<String, String> g() {
        return null;
    }

    protected Map<String, String> h(Exception exception) {
        return null;
    }

    protected Map<String, String> i(T result) {
        return null;
    }
}
