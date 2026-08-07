package e30;

import a30.ViewEnvironment;
import a30.f0;
import a30.g0;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.p002activity.OnBackPressedDispatcher;
import androidx.p002activity.e0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Le30/j;", "Le30/g;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "initialModalRendering", "La30/a0;", "initialViewEnvironment", "Le30/g$a;", "b", "(Ljava/lang/Object;La30/a0;)Le30/g$a;", "dialogRef", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Le30/g$a;)V", "e", "a", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class j extends g<Object> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        this(context, null, 0, 0, 14, null);
        s.k(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(View view, DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        s.k(view, "$view");
        if (i11 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Context context = view.getContext();
        s.j(context, "view.context");
        e0 e0VarB = a30.e.b(context);
        if (e0VarB != null && (onBackPressedDispatcher = e0VarB.getOnBackPressedDispatcher()) != null && onBackPressedDispatcher.getHasEnabledCallbacks()) {
            onBackPressedDispatcher.m();
        }
        return true;
    }

    @Override // e30.g
    protected final g.a<Object> b(Object initialModalRendering, ViewEnvironment initialViewEnvironment) {
        s.k(initialModalRendering, "initialModalRendering");
        s.k(initialViewEnvironment, "initialViewEnvironment");
        a30.d dVar = new a30.d(initialModalRendering, false, b.f61672c, 2, null);
        a30.e0 e0Var = (a30.e0) initialViewEnvironment.a(a30.e0.INSTANCE);
        Context context = getContext();
        s.j(context, "this.context");
        final View viewD = f0.d(e0Var, dVar, initialViewEnvironment, context, this, null, 16, null);
        g0.h(viewD);
        Dialog dialogG = g(viewD);
        dialogG.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: e30.i
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i11, KeyEvent keyEvent) {
                return j.f(viewD, dialogInterface, i11, keyEvent);
            }
        });
        return new g.a<>(initialModalRendering, initialViewEnvironment, dialogG, viewD);
    }

    @Override // e30.g
    protected void d(g.a<Object> dialogRef) {
        s.k(dialogRef, "dialogRef");
        a30.d dVar = new a30.d(dialogRef.f(), false, c.f61673c, 2, null);
        Object extra = dialogRef.getExtra();
        if (extra == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        g0.g((View) extra, dVar, dialogRef.getViewEnvironment());
    }

    public Dialog g(View view) {
        s.k(view, "view");
        Dialog dialog = new Dialog(getContext());
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        s.h(window);
        window.setLayout(-2, -2);
        Window window2 = dialog.getWindow();
        s.h(window2);
        window2.setBackgroundDrawable(null);
        return dialog;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        s.k(context, "context");
    }

    public /* synthetic */ j(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        s.k(context, "context");
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    static final class b extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f61672c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }

        public final void b() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 6, 0})
    static final class c extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f61673c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }

        public final void b() {
        }
    }
}
