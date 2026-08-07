package g40;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.DefaultLifecycleObserver;
import androidx.p003lifecycle.LifecycleOwner;
import c40.l;
import c40.m;
import c40.n;
import c40.o;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.customersheet.g;
import ezvcard.property.Kind;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0003R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001dR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001dR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001c8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u001d¨\u0006\""}, d2 = {"Lg40/a;", "", "<init>", "()V", "Landroid/app/Application;", Kind.APPLICATION, "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/stripe/android/customersheet/g;", "integration", "Ljn0/h0;", "f", "(Landroid/app/Application;Landroidx/lifecycle/LifecycleOwner;Lcom/stripe/android/customersheet/g;)V", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lc40/l;", "b", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_initializationDataSource", "Lc40/n;", "c", "_paymentMethodDataSource", "Lc40/o;", DateTokenConverter.CONVERTER_KEY, "_savedSelectionDataSource", "Lc40/m;", "e", "_intentDataSource", "Lkotlinx/coroutines/Deferred;", "()Lkotlinx/coroutines/Deferred;", "initializationDataSource", "paymentMethodDataSource", "savedSelectionDataSource", "intentDataSource", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f67321a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final MutableStateFlow<l> _initializationDataSource = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final MutableStateFlow<n> _paymentMethodDataSource = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final MutableStateFlow<o> _savedSelectionDataSource = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final MutableStateFlow<m> _intentDataSource = StateFlowKt.MutableStateFlow(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f67326f = 8;

    /* JADX INFO: renamed from: g40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"g40/a$a", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Ljn0/h0;", "onDestroy", "(Landroidx/lifecycle/LifecycleOwner;)V", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C1379a implements DefaultLifecycleObserver {
        C1379a() {
        }

        @Override // androidx.p003lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            boolean zIsChangingConfigurations;
            u activity;
            s.k(owner, "owner");
            if (owner instanceof ComponentActivity) {
                zIsChangingConfigurations = ((ComponentActivity) owner).isChangingConfigurations();
            } else {
                zIsChangingConfigurations = (!(owner instanceof Fragment) || (activity = ((Fragment) owner).getActivity()) == null) ? false : activity.isChangingConfigurations();
            }
            if (!zIsChangingConfigurations) {
                a.f67321a.a();
            }
            super.onDestroy(owner);
        }
    }

    private a() {
    }

    public final void a() {
        _initializationDataSource.setValue(null);
        _paymentMethodDataSource.setValue(null);
        _savedSelectionDataSource.setValue(null);
        _intentDataSource.setValue(null);
    }

    public final Deferred<l> b() {
        return b.b(_initializationDataSource);
    }

    public final Deferred<m> c() {
        return b.b(_intentDataSource);
    }

    public final Deferred<n> d() {
        return b.b(_paymentMethodDataSource);
    }

    public final Deferred<o> e() {
        return b.b(_savedSelectionDataSource);
    }

    public final void f(Application application, LifecycleOwner lifecycleOwner, g integration) {
        s.k(application, "application");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(integration, "integration");
        if (integration instanceof g.a) {
            d40.a aVarBuild = d40.e.a().a(application).b(((g.a) integration).getAdapter()).build();
            _initializationDataSource.setValue(aVarBuild.b());
            _paymentMethodDataSource.setValue(aVarBuild.a());
            _intentDataSource.setValue(aVarBuild.d());
            _savedSelectionDataSource.setValue(aVarBuild.c());
        } else if (integration instanceof g.b) {
            d40.b bVarBuild = d40.g.a().a(application).b(((g.b) integration).b()).build();
            _initializationDataSource.setValue(bVarBuild.b());
            _paymentMethodDataSource.setValue(bVarBuild.a());
            _intentDataSource.setValue(bVarBuild.d());
            _savedSelectionDataSource.setValue(bVarBuild.c());
        }
        lifecycleOwner.getLifecycle().a(new C1379a());
    }
}
