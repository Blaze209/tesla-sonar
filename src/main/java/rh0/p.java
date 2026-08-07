package rh0;

import a30.ViewEnvironment;
import a30.c0;
import a30.z;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lrh0/p;", "La30/k;", "Lrh0/i;", "Lsh0/b;", "binding", "<init>", "(Lsh0/b;)V", "rendering", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "h", "(Lrh0/i;Landroid/content/Context;)V", "La30/a0;", "viewEnvironment", "l", "(Lrh0/i;La30/a0;)V", "b", "Lsh0/b;", "Landroid/app/Dialog;", "c", "Landroid/app/Dialog;", "optionsDialog", DateTokenConverter.CONVERTER_KEY, "a", "sandbox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p implements a30.k<SandboxScreen<?>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sh0.b binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Dialog optionsDialog;

    /* JADX INFO: renamed from: rh0.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J6\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lrh0/p$a;", "La30/c0;", "Lrh0/i;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lrh0/i;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "sandbox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements c0<SandboxScreen<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ c0<SandboxScreen<?>> f108287a;

        /* JADX INFO: renamed from: rh0.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C2302a extends p013kotlin.jvm.internal.p implements q<LayoutInflater, ViewGroup, Boolean, sh0.b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C2302a f108288a = new C2302a();

            C2302a() {
                super(3, sh0.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;", 0);
            }

            public final sh0.b a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
                s.k(p11, "p0");
                return sh0.b.c(p11, viewGroup, z11);
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ sh0.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return a(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: rh0.p$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.l<sh0.b, p> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f108289a = new b();

            b() {
                super(1, p.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/sandbox/databinding/Pi2SandboxOverlayBinding;)V", 0);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p invoke(sh0.b p11) {
                s.k(p11, "p0");
                return new p(p11);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(SandboxScreen<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            s.k(initialRendering, "initialRendering");
            s.k(initialViewEnvironment, "initialViewEnvironment");
            s.k(contextForNewView, "contextForNewView");
            return this.f108287a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super SandboxScreen<?>> getType() {
            return this.f108287a.getType();
        }

        private Companion() {
            a30.k.Companion companion = a30.k.INSTANCE;
            this.f108287a = new z(o0.b(SandboxScreen.class), C2302a.f108288a, b.f108289a);
        }
    }

    public p(sh0.b binding) {
        s.k(binding, "binding");
        this.binding = binding;
    }

    private final void h(final SandboxScreen<?> rendering, Context context) {
        if (this.optionsDialog != null) {
            return;
        }
        final Dialog dialog = new Dialog(context, zs.l.f128798g);
        sh0.a aVarC = sh0.a.c(LayoutInflater.from(dialog.getContext()));
        s.j(aVarC, "inflate(...)");
        dialog.setContentView(aVarC.getRoot());
        aVarC.f111164c.setTitle("Sandbox options");
        aVarC.f111164c.setNavigationIcon(yh0.l.f125534u);
        aVarC.f111164c.setNavigationOnClickListener(new View.OnClickListener() { // from class: rh0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.i(dialog, view);
            }
        });
        aVarC.f111163b.setChecked(rendering.getSimulateGovIdNfc());
        aVarC.f111163b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rh0.n
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                p.j(rendering, compoundButton, z11);
            }
        });
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(null);
        }
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: rh0.o
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                p.k(this.f108283a, dialogInterface);
            }
        });
        this.optionsDialog = dialog;
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SandboxScreen sandboxScreen, CompoundButton compoundButton, boolean z11) {
        s.k(compoundButton, "<unused var>");
        sandboxScreen.d().invoke(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(p pVar, DialogInterface dialogInterface) {
        pVar.optionsDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SandboxScreen sandboxScreen, sh0.b bVar, View view) {
        sandboxScreen.c().invoke();
        Toast.makeText(bVar.f111167c.getRootView().getContext(), "Setting the debug flag to: " + c.INSTANCE.a(sandboxScreen.a().invoke()), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(p pVar, SandboxScreen sandboxScreen, Context context, View view) {
        s.h(context);
        pVar.h(sandboxScreen, context);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o(p pVar, WindowInsetsCompat insets) {
        s.k(insets, "insets");
        k5.e eVarG = insets.g(WindowInsetsCompat.n.h());
        s.j(eVarG, "getInsetsIgnoringVisibility(...)");
        FloatingActionButton floatingActionButton = pVar.binding.f111167c;
        s.j(floatingActionButton, "floatingActionButton");
        ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = (int) (((double) eVarG.f84927d) + yh0.h.c(16.0d));
        floatingActionButton.setLayoutParams(fVar);
        return h0.f84049a;
    }

    @Override // a30.k
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void a(final SandboxScreen<?> rendering, ViewEnvironment viewEnvironment) {
        s.k(rendering, "rendering");
        s.k(viewEnvironment, "viewEnvironment");
        final sh0.b bVar = this.binding;
        final Context context = bVar.getRoot().getContext();
        bVar.f111167c.setOnClickListener(new View.OnClickListener() { // from class: rh0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.m(rendering, bVar, view);
            }
        });
        bVar.f111167c.setOnLongClickListener(new View.OnLongClickListener() { // from class: rh0.k
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return p.n(this.f108277a, rendering, context, view);
            }
        });
        FloatingActionButton floatingActionButton = bVar.f111167c;
        s.j(floatingActionButton, "floatingActionButton");
        ki0.f.g(floatingActionButton, new wn0.l() { // from class: rh0.l
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return p.o(this.f108280a, (WindowInsetsCompat) obj);
            }
        });
        bVar.f111166b.c(rendering.b(), viewEnvironment);
    }
}
