package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/imagepipeline/producers/u;", "I", Gender.OTHER, "Lcom/facebook/imagepipeline/producers/c;", "Lcom/facebook/imagepipeline/producers/n;", "consumer", "<init>", "(Lcom/facebook/imagepipeline/producers/n;)V", "", "t", "Ljn0/h0;", "g", "(Ljava/lang/Throwable;)V", "f", "()V", "", ReactProgressBarViewManager.PROP_PROGRESS, IntegerTokenConverter.CONVERTER_KEY, "(F)V", "b", "Lcom/facebook/imagepipeline/producers/n;", "o", "()Lcom/facebook/imagepipeline/producers/n;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class u<I, O> extends c<I> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n<O> consumer;

    public u(n<O> consumer) {
        p013kotlin.jvm.internal.s.k(consumer, "consumer");
        this.consumer = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.c
    protected void f() {
        this.consumer.a();
    }

    @Override // com.facebook.imagepipeline.producers.c
    protected void g(Throwable t11) {
        p013kotlin.jvm.internal.s.k(t11, "t");
        this.consumer.onFailure(t11);
    }

    @Override // com.facebook.imagepipeline.producers.c
    protected void i(float progress) {
        this.consumer.c(progress);
    }

    public final n<O> o() {
        return this.consumer;
    }
}
