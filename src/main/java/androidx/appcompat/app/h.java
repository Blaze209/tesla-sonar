package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionMode;

/* JADX INFO: loaded from: classes.dex */
public class h extends Dialog implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AppCompatDelegate f2107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.core.view.l.a f2108b;

    class a implements androidx.core.view.l.a {
        a() {
        }

        @Override // androidx.core.view.l.a
        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.c(keyEvent);
        }
    }

    public h(Context context, int i11) {
        super(context, b(context, i11));
        this.f2108b = new a();
        AppCompatDelegate appCompatDelegateA = a();
        appCompatDelegateA.I(b(context, i11));
        appCompatDelegateA.t(null);
    }

    private static int b(Context context, int i11) {
        if (i11 != 0) {
            return i11;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.B, typedValue, true);
        return typedValue.resourceId;
    }

    public AppCompatDelegate a() {
        if (this.f2107a == null) {
            this.f2107a = AppCompatDelegate.j(this, this);
        }
        return this.f2107a;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i11) {
        return a().C(i11);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().u();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.l.e(this.f2108b, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i11) {
        return (T) a().k(i11);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().r();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().q();
        super.onCreate(bundle);
        a().t(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().z();
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.d
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i11) {
        a().D(i11);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().J(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().E(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().F(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i11) {
        super.setTitle(i11);
        a().J(getContext().getString(i11));
    }
}
