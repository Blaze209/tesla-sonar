package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/l;", "", "Landroid/app/Dialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lq80/q;", "uiCustomization", "<init>", "(Landroid/content/Context;Lq80/q;)V", "a", "()Landroid/app/Dialog;", "Landroid/content/Context;", "b", "Lq80/q;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q80.q uiCustomization;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/l$a;", "Landroid/app/Dialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lq80/q;", "uiCustomization", "<init>", "(Landroid/content/Context;Lq80/q;)V", "Ljn0/h0;", "onStart", "()V", "a", "Lq80/q;", "Lo80/d;", "b", "Lkotlin/Lazy;", "()Lo80/d;", "viewBinding", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a extends Dialog {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final q80.q uiCustomization;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Lazy viewBinding;

        /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.views.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo80/d;", "b", "()Lo80/d;"}, k = 3, mv = {1, 9, 0})
        static final class C1087a extends p013kotlin.jvm.internal.u implements wn0.a<o80.d> {
            C1087a() {
                super(0);
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o80.d invoke() {
                o80.d dVarC = o80.d.c(a.this.getLayoutInflater());
                p013kotlin.jvm.internal.s.j(dVarC, "inflate(...)");
                return dVarC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, q80.q uiCustomization) {
            super(context);
            p013kotlin.jvm.internal.s.k(context, "context");
            p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
            this.viewBinding = jn0.m.b(new C1087a());
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }

        private final o80.d a() {
            return (o80.d) this.viewBinding.getValue();
        }

        @Override // android.app.Dialog
        protected void onStart() {
            super.onStart();
            setContentView(a().getRoot());
            v80.a aVar = v80.a.f118417a;
            CircularProgressIndicator progressBar = a().f96853b;
            p013kotlin.jvm.internal.s.j(progressBar, "progressBar");
            aVar.a(progressBar, this.uiCustomization);
        }
    }

    public l(Context context, q80.q uiCustomization) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(uiCustomization, "uiCustomization");
        this.context = context;
        this.uiCustomization = uiCustomization;
    }

    public Dialog a() {
        return new a(this.context, this.uiCustomization);
    }
}
