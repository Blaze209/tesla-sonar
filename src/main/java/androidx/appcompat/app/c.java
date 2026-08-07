package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g1;
import androidx.core.app.TaskStackBuilder;
import androidx.fragment.app.u;
import androidx.p002activity.contextaware.OnContextAvailableListener;
import androidx.p003lifecycle.C2797h1;
import androidx.p003lifecycle.View;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public class c extends u implements d, TaskStackBuilder.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AppCompatDelegate mDelegate;
    private Resources mResources;

    class a implements SavedStateRegistry.c {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.c
        @NonNull
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.getDelegate().x(bundle);
            return bundle;
        }
    }

    class b implements OnContextAvailableListener {
        b() {
        }

        @Override // androidx.p002activity.contextaware.OnContextAvailableListener
        public void a(@NonNull Context context) {
            AppCompatDelegate delegate = c.this.getDelegate();
            delegate.q();
            delegate.t(c.this.getSavedStateRegistry().b(c.DELEGATE_TAG));
        }
    }

    public c() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        View.b(getWindow().getDecorView(), this);
        C2797h1.b(getWindow().getDecorView(), this);
        xa.e.b(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().h(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int i11) {
        return (T) getDelegate().k(i11);
    }

    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.i(this, this);
        }
        return this.mDelegate;
    }

    public androidx.appcompat.app.a getDrawerToggleDelegate() {
        return getDelegate().m();
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        return getDelegate().o();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && g1.b()) {
            this.mResources = new g1(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().p();
    }

    @Override // androidx.core.app.TaskStackBuilder.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.m.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().r();
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        getDelegate().s(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.d(this);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().u();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i11, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i11, Menu menu) {
        return super.onMenuOpened(i11, menu);
    }

    protected void onNightModeChanged(int i11) {
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, @NonNull Menu menu) {
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().v(bundle);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().w();
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull TaskStackBuilder taskStackBuilder) {
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().y();
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().z();
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeFinished(@NonNull ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.d
    public void onSupportActionModeStarted(@NonNull ActionMode actionMode) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        TaskStackBuilder taskStackBuilderF = TaskStackBuilder.f(this);
        onCreateSupportNavigateUpTaskStack(taskStackBuilderF);
        onPrepareSupportNavigateUpTaskStack(taskStackBuilderF);
        taskStackBuilderF.g();
        try {
            androidx.core.app.b.b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i11) {
        super.onTitleChanged(charSequence, i11);
        getDelegate().J(charSequence);
    }

    @Override // androidx.appcompat.app.d
    public ActionMode onWindowStartingSupportActionMode(@NonNull ActionMode.Callback callback) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void setContentView(int i11) {
        initViewTreeOwners();
        getDelegate().D(i11);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().H(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i11) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z11) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z11) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z11) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        super.setTheme(i11);
        getDelegate().I(i11);
    }

    public ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback) {
        return getDelegate().K(callback);
    }

    @Override // androidx.fragment.app.u
    public void supportInvalidateOptionsMenu() {
        getDelegate().r();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        androidx.core.app.m.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i11) {
        return getDelegate().C(i11);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return androidx.core.app.m.f(this, intent);
    }

    public c(int i11) {
        super(i11);
        initDelegate();
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        initViewTreeOwners();
        getDelegate().E(view);
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().F(view, layoutParams);
    }
}
