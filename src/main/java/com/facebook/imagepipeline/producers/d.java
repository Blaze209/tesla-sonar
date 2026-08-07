package com.facebook.imagepipeline.producers;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.imagepipeline.producers.c0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/imagepipeline/producers/d;", "Lcom/facebook/imagepipeline/producers/c0;", "FETCH_STATE", "Lcom/facebook/imagepipeline/producers/t0;", "<init>", "()V", "fetchState", "", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/imagepipeline/producers/c0;)Z", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d<FETCH_STATE extends c0> implements t0<FETCH_STATE> {
    @Override // com.facebook.imagepipeline.producers.t0
    public boolean d(FETCH_STATE fetchState) {
        return true;
    }
}
