package ii0;

import android.view.View;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import yh0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "back", "cancel", "Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;", "navigationBar", "Landroid/view/View;", "backPressHandler", "b", "(Lii0/a;Lwn0/a;Lwn0/a;Lcom/withpersona/sdk2/inquiry/shared/ui/Pi2NavigationBar;Landroid/view/View;)V", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ii0/e$a", "", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f78193a;

        a(wn0.a<h0> aVar) {
            this.f78193a = aVar;
        }
    }

    public static final void b(final ii0.a navigationState, final wn0.a<h0> back, final wn0.a<h0> cancel, Pi2NavigationBar navigationBar, View backPressHandler) {
        s.k(navigationState, "navigationState");
        s.k(back, "back");
        s.k(cancel, "cancel");
        s.k(navigationBar, "navigationBar");
        s.k(backPressHandler, "backPressHandler");
        navigationBar.setState$shared_release(navigationState, back, cancel);
        wn0.a aVar = new wn0.a() { // from class: ii0.d
            @Override // wn0.a
            public final Object invoke() {
                return e.c(navigationState, back, cancel);
            }
        };
        backPressHandler.setTag(m.f125542h, new a(aVar));
        if (navigationState.getHandleBackPress()) {
            a30.e.c(backPressHandler, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(ii0.a aVar, wn0.a aVar2, wn0.a aVar3) {
        if (aVar.getShowBackButton()) {
            aVar2.invoke();
        } else {
            aVar3.invoke();
        }
        return h0.f84049a;
    }
}
