package zh0;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import gb.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import qh0.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000f\u0010\u0005J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzh0/a;", "Lgb/a;", "T", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "binding", "Ljn0/h0;", "j", "(Lgb/a;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "(Landroid/content/Context;)V", "onDestroyView", "onDetach", "getContext", "()Landroid/content/Context;", "m", "Lgb/a;", "_binding", "n", "Landroid/content/Context;", "themedContext", IntegerTokenConverter.CONVERTER_KEY, "()Lgb/a;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class a<T extends gb.a> extends Fragment {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private T _binding;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Context themedContext;

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        Context context = this.themedContext;
        return context == null ? super.getContext() : context;
    }

    public final T i() {
        T t11 = this._binding;
        s.h(t11);
        return t11;
    }

    public final void j(T binding) {
        s.k(binding, "binding");
        this._binding = binding;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        s.k(context, "context");
        super.onAttach(context);
        LifecycleOwner parentFragment = getParentFragment();
        s.i(parentFragment, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.shared.baseFragment.InquiryArgsProvider");
        d dVar = (d) parentFragment;
        if (!dVar.isInline()) {
            this.themedContext = context;
        } else {
            Integer theme = dVar.getTheme();
            this.themedContext = new n.c(context, (theme == null || theme.intValue() == 0) ? f.f105574b : theme.intValue());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.themedContext = null;
    }
}
