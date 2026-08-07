package androidx.p002activity;

import androidx.p003lifecycle.LifecycleOwner;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "", "enabled", "Lkotlin/Function1;", "Landroidx/activity/b0;", "Ljn0/h0;", "onBackPressed", "a", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/LifecycleOwner;ZLwn0/l;)Landroidx/activity/b0;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class d0 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/activity/d0$a", "Landroidx/activity/b0;", "Ljn0/h0;", "handleOnBackPressed", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<b0, h0> f1893a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(boolean z11, l<? super b0, h0> lVar) {
            super(z11);
            this.f1893a = lVar;
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackPressed() {
            this.f1893a.invoke(this);
        }
    }

    public static final b0 a(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z11, l<? super b0, h0> onBackPressed) {
        s.k(onBackPressedDispatcher, "<this>");
        s.k(onBackPressed, "onBackPressed");
        a aVar = new a(z11, onBackPressed);
        if (lifecycleOwner != null) {
            onBackPressedDispatcher.i(lifecycleOwner, aVar);
            return aVar;
        }
        onBackPressedDispatcher.h(aVar);
        return aVar;
    }

    public static /* synthetic */ b0 b(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lifecycleOwner = null;
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return a(onBackPressedDispatcher, lifecycleOwner, z11, lVar);
    }
}
