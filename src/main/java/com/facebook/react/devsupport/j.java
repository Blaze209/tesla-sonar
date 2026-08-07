package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0000\u0018\u0000 42\u00020\u00012\u00020\u0002:\u0002\u0012\u0010B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010&\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R$\u0010)\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010!R$\u0010-\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R$\u00100\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R$\u00103\u001a\u00020\u001b2\u0006\u00101\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001f\"\u0004\b\u0016\u0010!¨\u00065"}, d2 = {"Lcom/facebook/react/devsupport/j;", "Leo/a;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/devsupport/j$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lcom/facebook/react/devsupport/j$b;)V", "Landroid/content/SharedPreferences;", "sharedPreferences", "", Action.KEY_ATTRIBUTE, "Ljn0/h0;", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "a", "Lcom/facebook/react/devsupport/j$b;", "b", "Landroid/content/SharedPreferences;", "preferences", "Ljo/d;", "c", "Ljo/d;", "l", "()Ljo/d;", "packagerConnectionSettings", "", DateTokenConverter.CONVERTER_KEY, "Z", "q", "()Z", "setDeviceDebugEnabled", "(Z)V", "isDeviceDebugEnabled", "value", "o", IntegerTokenConverter.CONVERTER_KEY, "isFpsDebugEnabled", "k", "m", "isJSDevModeEnabled", "_", "r", "setJSMinifyEnabled", "isJSMinifyEnabled", "j", "n", "isElementInspectorEnabled", "enabled", "p", "isHotModuleReplacementEnabled", "e", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements eo.a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences preferences;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jo.d packagerConnectionSettings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isDeviceDebugEnabled;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/j$b;", "", "Ljn0/h0;", "a", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a();
    }

    public j(Context applicationContext, b bVar) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        this.listener = bVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        p013kotlin.jvm.internal.s.j(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.preferences = defaultSharedPreferences;
        this.packagerConnectionSettings = new jo.d(applicationContext);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.isDeviceDebugEnabled = ln.a.DEBUG;
    }

    @Override // eo.a
    public void c(boolean z11) {
        this.preferences.edit().putBoolean("hot_module_replacement", z11).apply();
    }

    @Override // eo.a
    public void i(boolean z11) {
        this.preferences.edit().putBoolean("fps_debug", z11).apply();
    }

    @Override // eo.a
    public boolean j() {
        return this.preferences.getBoolean("inspector_debug", false);
    }

    @Override // eo.a
    public boolean k() {
        return this.preferences.getBoolean("js_dev_mode_debug", true);
    }

    @Override // eo.a
    /* JADX INFO: renamed from: l, reason: from getter */
    public jo.d getPackagerConnectionSettings() {
        return this.packagerConnectionSettings;
    }

    @Override // eo.a
    public void m(boolean z11) {
        this.preferences.edit().putBoolean("js_dev_mode_debug", z11).apply();
    }

    @Override // eo.a
    public void n(boolean z11) {
        this.preferences.edit().putBoolean("inspector_debug", z11).apply();
    }

    @Override // eo.a
    public boolean o() {
        return this.preferences.getBoolean("fps_debug", false);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        p013kotlin.jvm.internal.s.k(sharedPreferences, "sharedPreferences");
        if (this.listener != null) {
            if (p013kotlin.jvm.internal.s.f("fps_debug", key) || p013kotlin.jvm.internal.s.f("js_dev_mode_debug", key) || p013kotlin.jvm.internal.s.f("js_minify_debug", key)) {
                this.listener.a();
            }
        }
    }

    @Override // eo.a
    public boolean p() {
        return this.preferences.getBoolean("hot_module_replacement", true);
    }

    @Override // eo.a
    /* JADX INFO: renamed from: q, reason: from getter */
    public boolean getIsDeviceDebugEnabled() {
        return this.isDeviceDebugEnabled;
    }

    @Override // eo.a
    public boolean r() {
        return this.preferences.getBoolean("js_minify_debug", false);
    }
}
