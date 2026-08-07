package e30;

import a30.ViewEnvironment;
import a30.c0;
import a30.g0;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eB;\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\u0007*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Le30/c;", "Le30/g;", "Le30/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attributeSet", "", "defStyle", "defStyleRes", "dialogThemeResId", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;III)V", "Le30/e$a;", "h", "(Le30/e$a;)I", "initialModalRendering", "La30/a0;", "initialViewEnvironment", "Le30/g$a;", "g", "(Le30/e;La30/a0;)Le30/g$a;", "dialogRef", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Le30/g$a;)V", "e", "I", "f", "a", "b", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class c extends g<AlertScreen> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int dialogThemeResId;

    /* JADX INFO: renamed from: e30.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\r\u001a\u00020\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Le30/c$b;", "La30/c0;", "Le30/d;", "<init>", "()V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Le30/d;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lco0/d;", "getType", "()Lco0/d;", "type", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements c0<AlertContainerScreen<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ a f61640a;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(AlertContainerScreen<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            s.k(initialRendering, "initialRendering");
            s.k(initialViewEnvironment, "initialViewEnvironment");
            s.k(contextForNewView, "contextForNewView");
            return this.f61640a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super AlertContainerScreen<?>> getType() {
            return this.f61640a.getType();
        }

        private Companion() {
            this.f61640a = new a(0, 1, null);
        }
    }

    /* JADX INFO: renamed from: e30.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class C1263c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61641a;

        static {
            int[] iArr = new int[AlertScreen.a.values().length];
            iArr[AlertScreen.a.POSITIVE.ordinal()] = 1;
            iArr[AlertScreen.a.NEGATIVE.ordinal()] = 2;
            iArr[AlertScreen.a.NEUTRAL.ordinal()] = 3;
            f61641a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        this(context, null, 0, 0, 0, 30, null);
        s.k(context, "context");
    }

    private final int h(AlertScreen.a aVar) {
        int i11 = C1263c.f61641a[aVar.ordinal()];
        if (i11 == 1) {
            return -1;
        }
        if (i11 == 2) {
            return -2;
        }
        if (i11 == 3) {
            return -3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AlertScreen rendering, DialogInterface dialogInterface) {
        s.k(rendering, "$rendering");
        rendering.d().invoke(AlertScreen.b.C1264b.f61650a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(AlertScreen rendering, AlertScreen.a button, DialogInterface dialogInterface, int i11) {
        s.k(rendering, "$rendering");
        s.k(button, "$button");
        rendering.d().invoke(new AlertScreen.b.ButtonClicked(button));
    }

    @Override // e30.g
    protected void d(g.a<AlertScreen> dialogRef) {
        h0 h0Var;
        Button buttonE;
        s.k(dialogRef, "dialogRef");
        androidx.appcompat.app.b bVar = (androidx.appcompat.app.b) dialogRef.getDialog();
        final AlertScreen alertScreenF = dialogRef.f();
        int i11 = 0;
        if (alertScreenF.getCancelable()) {
            bVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: e30.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    c.i(alertScreenF, dialogInterface);
                }
            });
            bVar.setCancelable(true);
        } else {
            bVar.setCancelable(false);
        }
        AlertScreen.a[] aVarArrValues = AlertScreen.a.values();
        int length = aVarArrValues.length;
        while (i11 < length) {
            final AlertScreen.a aVar = aVarArrValues[i11];
            i11++;
            String str = alertScreenF.a().get(aVar);
            if (str == null) {
                h0Var = null;
            } else {
                bVar.h(h(aVar), str, new DialogInterface.OnClickListener() { // from class: e30.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        c.j(alertScreenF, aVar, dialogInterface, i12);
                    }
                });
                h0Var = h0.f84049a;
            }
            if (h0Var == null && (buttonE = bVar.e(h(aVar))) != null) {
                buttonE.setVisibility(4);
            }
        }
        bVar.i(alertScreenF.getMessage());
        bVar.setTitle(alertScreenF.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e30.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public g.a<AlertScreen> b(AlertScreen initialModalRendering, ViewEnvironment initialViewEnvironment) {
        s.k(initialModalRendering, "initialModalRendering");
        s.k(initialViewEnvironment, "initialViewEnvironment");
        androidx.appcompat.app.b bVarCreate = new androidx.appcompat.app.b.a(getContext(), this.dialogThemeResId).create();
        s.j(bVarCreate, "Builder(context, dialogThemeResId)\n      .create()");
        g.a<AlertScreen> aVar = new g.a<>(initialModalRendering, initialViewEnvironment, bVarCreate, null, 8, null);
        d(aVar);
        return aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 0, 28, null);
        s.k(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0, 0, 24, null);
        s.k(context, "context");
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) != 0 ? 0 : i13);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u00020\u00138\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Le30/c$a;", "La30/c0;", "Le30/d;", "", "dialogThemeResId", "<init>", "(I)V", "initialRendering", "La30/a0;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Le30/d;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "a", "I", "Lco0/d;", "getType", "()Lco0/d;", "type", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class a implements c0<AlertContainerScreen<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int dialogThemeResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final /* synthetic */ a30.f<AlertContainerScreen<?>> f61638b;

        /* JADX INFO: renamed from: e30.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Le30/d;", "initialRendering", "La30/a0;", "initialEnv", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "<anonymous parameter 3>", "Landroid/view/View;", "a", "(Le30/d;La30/a0;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;"}, k = 3, mv = {1, 6, 0})
        static final class C1261a extends u implements r<AlertContainerScreen<?>, ViewEnvironment, Context, ViewGroup, View> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f61639c;

            /* JADX INFO: renamed from: e30.c$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* synthetic */ class C1262a extends p implements wn0.p<f<?, ? extends AlertScreen>, ViewEnvironment, h0> {
                C1262a(Object obj) {
                    super(2, obj, c.class, "update", "update(Lcom/squareup/workflow1/ui/modal/HasModals;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", 0);
                }

                public final void a(f<?, AlertScreen> p11, ViewEnvironment p12) {
                    s.k(p11, "p0");
                    s.k(p12, "p1");
                    ((c) this.receiver).c(p11, p12);
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(f<?, ? extends AlertScreen> fVar, ViewEnvironment viewEnvironment) {
                    a(fVar, viewEnvironment);
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1261a(int i11) {
                super(4);
                this.f61639c = i11;
            }

            @Override // wn0.r
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke(AlertContainerScreen<?> initialRendering, ViewEnvironment initialEnv, Context context, ViewGroup viewGroup) {
                s.k(initialRendering, "initialRendering");
                s.k(initialEnv, "initialEnv");
                s.k(context, "context");
                c cVar = new c(context, null, 0, 0, this.f61639c, 14, null);
                cVar.setId(d30.a.f59343b);
                cVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                g0.a(cVar, initialRendering, initialEnv, new C1262a(cVar));
                return cVar;
            }
        }

        public a(int i11) {
            this.dialogThemeResId = i11;
            this.f61638b = new a30.f<>(o0.b(AlertContainerScreen.class), new C1261a(i11));
        }

        @Override // a30.c0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(AlertContainerScreen<?> initialRendering, ViewEnvironment initialViewEnvironment, Context contextForNewView, ViewGroup container) {
            s.k(initialRendering, "initialRendering");
            s.k(initialViewEnvironment, "initialViewEnvironment");
            s.k(contextForNewView, "contextForNewView");
            return this.f61638b.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // a30.c0
        public co0.d<? super AlertContainerScreen<?>> getType() {
            return this.f61638b.getType();
        }

        public /* synthetic */ a(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 0 : i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, AttributeSet attributeSet, int i11, int i12, int i13) {
        super(context, attributeSet, i11, i12);
        s.k(context, "context");
        this.dialogThemeResId = i13;
    }
}
