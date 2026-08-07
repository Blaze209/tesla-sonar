package com.swmansion.rnscreens.stack.views;

import com.swmansion.rnscreens.m0;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005R\u00020\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/swmansion/rnscreens/stack/views/d;", "Lcom/swmansion/rnscreens/stack/views/b;", "<init>", "()V", "", "Lcom/swmansion/rnscreens/m0$b;", "Lcom/swmansion/rnscreens/m0;", "drawingOperations", "Ljn0/h0;", "apply", "(Ljava/util/List;)V", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends b {
    public d() {
        super(false, 1, null);
    }

    @Override // com.swmansion.rnscreens.stack.views.b, com.swmansion.rnscreens.stack.views.a
    public void apply(List<m0.b> drawingOperations) {
        s.k(drawingOperations, "drawingOperations");
        if (isEnabled()) {
            v.a0(drawingOperations);
        }
    }
}
