package p020r2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ljn0/h0;", "c", "()V", "Lr2/q;", DateTokenConverter.CONVERTER_KEY, "(Lr2/l;I)Lr2/q;", "Lr2/i2;", "b", "(Lr2/l;I)Lr2/i2;", "currentRecomposeScope", "", "a", "(Lr2/l;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {
    public static final int a(l lVar, int i11) {
        if (o.J()) {
            o.S(524444915, i11, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int iR = lVar.R();
        if (o.J()) {
            o.R();
        }
        return iR;
    }

    public static final i2 b(l lVar, int i11) {
        if (o.J()) {
            o.S(394957799, i11, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        i2 i2VarF = lVar.F();
        if (i2VarF == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        lVar.P(i2VarF);
        if (o.J()) {
            o.R();
        }
        return i2VarF;
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final q d(l lVar, int i11) {
        if (o.J()) {
            o.S(-1165786124, i11, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        q qVarM = lVar.m();
        if (o.J()) {
            o.R();
        }
        return qVarM;
    }
}
