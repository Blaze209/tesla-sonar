package com.swmansion.rnscreens.stack.views;

import com.swmansion.rnscreens.m0;
import java.util.Collections;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0010\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/swmansion/rnscreens/stack/views/c;", "Lcom/swmansion/rnscreens/stack/views/b;", "", "startIndex", "<init>", "(I)V", "", "Lcom/swmansion/rnscreens/m0$b;", "Lcom/swmansion/rnscreens/m0;", "drawingOperations", "Ljn0/h0;", "apply", "(Ljava/util/List;)V", "I", "getStartIndex", "()I", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c extends b {
    private final int startIndex;

    public c(int i11) {
        super(false, 1, null);
        this.startIndex = i11;
    }

    @Override // com.swmansion.rnscreens.stack.views.b, com.swmansion.rnscreens.stack.views.a
    public void apply(List<m0.b> drawingOperations) {
        s.k(drawingOperations, "drawingOperations");
        if (isEnabled()) {
            int i11 = this.startIndex;
            for (int iO = v.o(drawingOperations); i11 < iO; iO--) {
                Collections.swap(drawingOperations, i11, iO);
                i11++;
            }
        }
    }

    public final int getStartIndex() {
        return this.startIndex;
    }
}
