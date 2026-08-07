package qe0;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH¦@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqe0/a;", "", "", "a", "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Intent;", "b", "(Landroid/content/Context;)Landroid/content/Intent;", "Lkotlin/Pair;", "", "location", "", "c", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {
    boolean a();

    Intent b(Context context);

    Object c(Pair<Double, Double> pair, Continuation<? super String> continuation);
}
