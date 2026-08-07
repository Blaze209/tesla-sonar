package lh0;

import a30.ViewEnvironment;
import a30.c0;
import a30.g0;
import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.z0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import e30.j;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import wn0.r;
import yh0.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Llh0/b;", "Le30/j;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "f", "a", "modal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends j {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: lh0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u000e\b\u0000\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Llh0/b$a;", "La30/c0;", "Llh0/c;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", DateTokenConverter.CONVERTER_KEY, "(Llh0/c;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "modal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements c0<c<?, ?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a30.f<c<?, ?>> f90028a;

        /* JADX INFO: renamed from: lh0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* synthetic */ class C1903a extends p implements wn0.p<e30.f<?, ? extends Object>, ViewEnvironment, h0> {
            C1903a(Object obj) {
                super(2, obj, b.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
            }

            public final void a(e30.f<?, ? extends Object> p11, ViewEnvironment p12) {
                s.k(p11, "p0");
                s.k(p12, "p1");
                ((b) this.receiver).c(p11, p12);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(e30.f<?, ? extends Object> fVar, ViewEnvironment viewEnvironment) {
                a(fVar, viewEnvironment);
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final View c(c initialRendering, ViewEnvironment initialEnv, Context contextForNewView, ViewGroup viewGroup) {
            s.k(initialRendering, "initialRendering");
            s.k(initialEnv, "initialEnv");
            s.k(contextForNewView, "contextForNewView");
            b bVar = new b(contextForNewView, null, 0, 0, 14, null);
            bVar.setId(g.f90036b);
            bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            g0.a(bVar, initialRendering, initialEnv, new C1903a(bVar));
            return bVar;
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public View a(c<?, ?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            s.k(initialRendering, "initialRendering");
            s.k(initialViewEnvironment, "initialViewEnvironment");
            s.k(contextForNewView, "contextForNewView");
            return this.f90028a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super c<?, ?>> getType() {
            return this.f90028a.getType();
        }

        private Companion() {
            this.f90028a = new a30.f<>(o0.b(c.class), new r() { // from class: lh0.a
                @Override // wn0.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return b.Companion.c((c) obj, (ViewEnvironment) obj2, (Context) obj3, (ViewGroup) obj4);
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, null, 0, 0, 14, null);
        s.k(context, "context");
    }

    @Override // e30.j
    public Dialog g(View view) {
        Object next;
        s.k(view, "view");
        Dialog dialog = new Dialog(getContext(), qh0.f.f105573a);
        Iterator<T> it = ki0.s.d(view).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((View) next).getTag(g.f90035a) instanceof Integer));
        View view2 = (View) next;
        Object tag = view2 != null ? view2.getTag(g.f90035a) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            if (num != null) {
                f0.a(window, num.intValue());
            }
            window.setBackgroundDrawable(null);
            window.setLayout(-1, -1);
            z0.b(window, false);
            if (!ki0.f.f()) {
                window.setNavigationBarColor(-16777216);
            }
        }
        return dialog;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 8, null);
        s.k(context, "context");
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        s.k(context, "context");
    }
}
