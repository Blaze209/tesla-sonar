package r4;

import android.text.style.TtsSpan;
import i4.VerbatimTtsAnnotation;
import i4.t0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li4/t0;", "Landroid/text/style/TtsSpan;", "a", "(Li4/t0;)Landroid/text/style/TtsSpan;", "Li4/v0;", "b", "(Li4/v0;)Landroid/text/style/TtsSpan;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final TtsSpan a(t0 t0Var) {
        if (t0Var instanceof VerbatimTtsAnnotation) {
            return b((VerbatimTtsAnnotation) t0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
