package tb;

import androidx.core.util.Consumer;
import androidx.work.x0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/core/util/Consumer;", "Landroidx/work/x0;", "info", "", "tag", "Ljn0/h0;", "a", "(Landroidx/core/util/Consumer;Landroidx/work/x0;Ljava/lang/String;)V", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o0 {
    public static final void a(Consumer<x0> consumer, x0 info, String tag) {
        p013kotlin.jvm.internal.s.k(consumer, "<this>");
        p013kotlin.jvm.internal.s.k(info, "info");
        p013kotlin.jvm.internal.s.k(tag, "tag");
        try {
            consumer.accept(info);
        } catch (Throwable th2) {
            androidx.work.z.e().d(tag, "Exception handler threw an exception", th2);
        }
    }
}
