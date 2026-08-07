package p008h80;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.c;
import androidx.core.view.z0;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.b0;
import androidx.p002activity.d0;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\"\u0010\u0013\u001a\u00020\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lh80/e;", "ResultType", "Landroidx/appcompat/app/c;", "<init>", "()V", "Ljn0/h0;", "n", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "", "f", "Z", "getEarlyExitDueToIllegalState", "()Z", "p", "(Z)V", "earlyExitDueToIllegalState", "Lk80/a;", "m", "()Lk80/a;", "viewModel", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class e<ResultType> extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean earlyExitDueToIllegalState;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"ResultType", "Landroidx/activity/b0;", "Ljn0/h0;", "a", "(Landroidx/activity/b0;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<b0, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e<ResultType> f71020c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e<ResultType> eVar) {
            super(1);
            this.f71020c = eVar;
        }

        public final void a(b0 addCallback) {
            s.k(addCallback, "$this$addCallback");
            this.f71020c.m().G();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(b0 b0Var) {
            a(b0Var);
            return h0.f84049a;
        }
    }

    private final void n() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        z0.b(getWindow(), false);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        r90.c.a(this);
    }

    public abstract k80.a m();

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.earlyExitDueToIllegalState) {
            return;
        }
        n();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        s.j(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        d0.b(onBackPressedDispatcher, null, false, new a(this), 3, null);
    }

    protected final void p(boolean z11) {
        this.earlyExitDueToIllegalState = z11;
    }
}
