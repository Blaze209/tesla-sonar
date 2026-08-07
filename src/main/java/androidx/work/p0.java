package androidx.work;

import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"T", "Landroidx/work/o0;", "", AnnotatedPrivateKey.LABEL, "Lkotlin/Function0;", "block", "a", "(Landroidx/work/o0;Ljava/lang/String;Lwn0/a;)Ljava/lang/Object;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p0 {
    public static final <T> T a(o0 o0Var, String label, wn0.a<? extends T> block) {
        p013kotlin.jvm.internal.s.k(o0Var, "<this>");
        p013kotlin.jvm.internal.s.k(label, "label");
        p013kotlin.jvm.internal.s.k(block, "block");
        boolean zIsEnabled = o0Var.isEnabled();
        if (zIsEnabled) {
            try {
                o0Var.a(label);
            } finally {
                p013kotlin.jvm.internal.q.b(1);
                if (zIsEnabled) {
                    o0Var.b();
                }
                p013kotlin.jvm.internal.q.a(1);
            }
        }
        return block.invoke();
    }
}
