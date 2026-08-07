package a30;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0087\u0010¢\u0006\u0004\b\u0002\u0010\u0003\"J\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007*\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\" \u0010\u0014\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012*\u0018\b\u0007\u0010\u0015\"\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", "Landroidx/activity/e0;", "b", "(Landroid/content/Context;)Landroidx/activity/e0;", "Landroid/view/View;", "Lkotlin/Function0;", "Ljn0/h0;", "Lcom/squareup/workflow1/ui/BackPressHandler;", "value", "getBackPressedHandler", "(Landroid/view/View;)Lwn0/a;", "c", "(Landroid/view/View;Lwn0/a;)V", "getBackPressedHandler$annotations", "(Landroid/view/View;)V", "backPressedHandler", "La30/j;", "a", "(Landroid/view/View;)La30/j;", "getHandlerWrapperOrNull$annotations", "handlerWrapperOrNull", "BackPressHandler", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class e {
    private static final j a(View view) {
        return (j) view.getTag(q.f192c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.content.Context] */
    public static final androidx.p002activity.e0 b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "<this>");
        while (!(context instanceof androidx.p002activity.e0)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == 0) {
                return null;
            }
        }
        return (androidx.p002activity.e0) context;
    }

    public static final void c(View view, wn0.a<jn0.h0> aVar) {
        Object obj;
        p013kotlin.jvm.internal.s.k(view, "<this>");
        j jVarA = a(view);
        if (jVarA != null) {
            jVarA.c();
        }
        if (aVar == null) {
            obj = null;
        } else {
            j jVar = new j(view, aVar);
            jVar.b();
            obj = jVar;
        }
        view.setTag(q.f192c, obj);
    }
}
