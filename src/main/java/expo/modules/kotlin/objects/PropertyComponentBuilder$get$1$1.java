package expo.modules.kotlin.objects;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class PropertyComponentBuilder$get$1$1 implements l<Object[], Object> {
    final /* synthetic */ wn0.a<R> $body;

    /* JADX WARN: Multi-variable type inference failed */
    public PropertyComponentBuilder$get$1$1(wn0.a<? extends R> aVar) {
        this.$body = aVar;
    }

    @Override // wn0.l
    public final Object invoke(Object[] it) {
        s.k(it, "it");
        return this.$body.invoke();
    }
}
