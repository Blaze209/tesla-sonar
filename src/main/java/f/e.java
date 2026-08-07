package f;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.C2797h1;
import jn0.h0;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.q;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/activity/ComponentActivity;", "Lr2/q;", "parent", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Landroidx/activity/ComponentActivity;Lr2/q;Lwn0/p;)V", "c", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f63713a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ComponentActivity componentActivity, q qVar, p<? super l, ? super Integer, h0> pVar) {
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(qVar);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(qVar);
        composeView2.setContent(pVar);
        c(componentActivity);
        componentActivity.setContentView(composeView2, f63713a);
    }

    public static /* synthetic */ void b(ComponentActivity componentActivity, q qVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qVar = null;
        }
        a(componentActivity, qVar, pVar);
    }

    private static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (androidx.p003lifecycle.View.a(decorView) == null) {
            androidx.p003lifecycle.View.b(decorView, componentActivity);
        }
        if (C2797h1.a(decorView) == null) {
            C2797h1.b(decorView, componentActivity);
        }
        if (xa.e.a(decorView) == null) {
            xa.e.b(decorView, componentActivity);
        }
    }
}
