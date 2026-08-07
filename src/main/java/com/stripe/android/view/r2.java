package com.stripe.android.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import p013kotlin.Lazy;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0006H$¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010)R*\u0010.\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b8\u0004@DX\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u0016R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u001d\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lcom/stripe/android/view/r2;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onPrepareOptionsMenu", "t", "visible", "u", "(Z)V", "", AnalyticsAttribute.Error, "w", "(Ljava/lang/String;)V", "Lh40/b;", "f", "Lkotlin/Lazy;", "r", "()Lh40/b;", "viewBinding", "Landroid/widget/ProgressBar;", "g", "p", "()Landroid/widget/ProgressBar;", "progressBar", "Landroid/view/ViewStub;", "h", "s", "()Landroid/view/ViewStub;", "viewStub", "value", IntegerTokenConverter.CONVERTER_KEY, "Z", "isProgressBarVisible", "()Z", "v", "Lcom/stripe/android/view/l;", "j", "n", "()Lcom/stripe/android/view/l;", "alertDisplayer", "Lcom/stripe/android/view/s2;", "k", "q", "()Lcom/stripe/android/view/s2;", "stripeColorUtils", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class r2 extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isProgressBarVisible;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewBinding = jn0.m.b(new d());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Lazy progressBar = jn0.m.b(new b());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewStub = jn0.m.b(new e());

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy alertDisplayer = jn0.m.b(new a());

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy stripeColorUtils = jn0.m.b(new c());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/l$a;", "b", "()Lcom/stripe/android/view/l$a;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<l.a> {
        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l.a invoke() {
            return new l.a(r2.this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/material/progressindicator/LinearProgressIndicator;", "b", "()Lcom/google/android/material/progressindicator/LinearProgressIndicator;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<LinearProgressIndicator> {
        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LinearProgressIndicator invoke() {
            return r2.this.r().f70660b;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/s2;", "b", "()Lcom/stripe/android/view/s2;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<s2> {
        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s2 invoke() {
            return new s2(r2.this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh40/b;", "b", "()Lh40/b;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<h40.b> {
        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h40.b invoke() {
            h40.b bVarC = h40.b.c(r2.this.getLayoutInflater());
            p013kotlin.jvm.internal.s.j(bVarC, "inflate(...)");
            return bVarC;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/ViewStub;", "b", "()Landroid/view/ViewStub;"}, k = 3, mv = {1, 9, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<ViewStub> {
        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewStub invoke() {
            ViewStub viewStub = r2.this.r().f70662d;
            p013kotlin.jvm.internal.s.j(viewStub, "viewStub");
            return viewStub;
        }
    }

    private final l n() {
        return (l) this.alertDisplayer.getValue();
    }

    private final s2 q() {
        return (s2) this.stripeColorUtils.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h40.b r() {
        return (h40.b) this.viewBinding.getValue();
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(r().getRoot());
        setSupportActionBar(r().f70661c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        p013kotlin.jvm.internal.s.k(menu, "menu");
        getMenuInflater().inflate(f30.c0.f63931a, menu);
        menu.findItem(f30.z.f64251d).setEnabled(!this.isProgressBarVisible);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        if (item.getItemId() == f30.z.f64251d) {
            t();
            return true;
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
        if (!zOnOptionsItemSelected) {
            getOnBackPressedDispatcher().m();
        }
        return zOnOptionsItemSelected;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        p013kotlin.jvm.internal.s.k(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(f30.z.f64251d);
        s2 s2VarQ = q();
        Resources.Theme theme = getTheme();
        p013kotlin.jvm.internal.s.j(theme, "getTheme(...)");
        menuItemFindItem.setIcon(s2VarQ.f(theme, i.a.Q, f30.y.N));
        return super.onPrepareOptionsMenu(menu);
    }

    public final ProgressBar p() {
        Object value = this.progressBar.getValue();
        p013kotlin.jvm.internal.s.j(value, "getValue(...)");
        return (ProgressBar) value;
    }

    public final ViewStub s() {
        return (ViewStub) this.viewStub.getValue();
    }

    protected abstract void t();

    protected void u(boolean visible) {
    }

    protected final void v(boolean z11) {
        p().setVisibility(z11 ? 0 : 8);
        invalidateOptionsMenu();
        u(z11);
        this.isProgressBarVisible = z11;
    }

    protected final void w(String error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        n().a(error);
    }
}
