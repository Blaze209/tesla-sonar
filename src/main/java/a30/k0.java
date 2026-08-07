package a30;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"6\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00018@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\b\u0010\u0003\"\u0004\b\t\u0010\n\"\"\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\r*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u000e\u0010\u000f\"\"\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroid/view/View;", "La30/j0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/View;)La30/j0;", "getWorkflowViewStateOrNull$annotations", "(Landroid/view/View;)V", "workflowViewStateOrNull", "value", "a", "e", "(Landroid/view/View;La30/j0;)V", "getWorkflowViewState$annotations", "workflowViewState", "La30/j0$a;", "b", "(Landroid/view/View;)La30/j0$a;", "getWorkflowViewStateAsNew$annotations", "workflowViewStateAsNew", "La30/j0$b;", "c", "(Landroid/view/View;)La30/j0$b;", "getWorkflowViewStateAsStarted$annotations", "workflowViewStateAsStarted", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class k0 {
    public static final j0<?> a(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        j0<?> j0VarD = d(view);
        if (j0VarD != null) {
            return j0VarD;
        }
        throw new IllegalStateException(("Expected " + view + " to have been built by a ViewFactory. Perhaps the factory did not call View.bindShowRendering.").toString());
    }

    public static final j0.New<?> b(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        j0<?> j0VarA = a(view);
        j0.New<?> aVar = j0VarA instanceof j0.New ? (j0.New) j0VarA : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Expected " + view + " to be un-started, but View.start() has been called").toString());
    }

    public static final j0.Started<?> c(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        j0<?> j0VarA = a(view);
        j0.Started<?> bVar = j0VarA instanceof j0.Started ? (j0.Started) j0VarA : null;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(("Expected " + view + " to have been started, but View.start() has not been called").toString());
    }

    public static final j0<?> d(View view) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        Object tag = view.getTag(q.f194e);
        if (tag instanceof j0) {
            return (j0) tag;
        }
        return null;
    }

    public static final void e(View view, j0<?> value) {
        p013kotlin.jvm.internal.s.k(view, "<this>");
        p013kotlin.jvm.internal.s.k(value, "value");
        view.setTag(q.f194e, value);
    }
}
