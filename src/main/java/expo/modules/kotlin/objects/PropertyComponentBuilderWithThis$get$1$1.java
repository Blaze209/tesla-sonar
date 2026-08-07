package expo.modules.kotlin.objects;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
public final class PropertyComponentBuilderWithThis$get$1$1 implements l<Object[], Object> {
    final /* synthetic */ l<ThisType, R> $body;

    /* JADX WARN: Multi-variable type inference failed */
    public PropertyComponentBuilderWithThis$get$1$1(l<? super ThisType, ? extends R> lVar) {
        this.$body = lVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // wn0.l
    public final Object invoke(Object[] it) {
        s.k(it, "it");
        return this.$body.invoke((ThisType) it[0]);
    }
}
