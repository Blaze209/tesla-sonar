package n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import i.i;

/* JADX INFO: loaded from: classes.dex */
public class c extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f92574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f92575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f92576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f92577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f92578e;

    public c() {
        super(null);
    }

    private Resources b() {
        if (this.f92578e == null) {
            Configuration configuration = this.f92577d;
            if (configuration == null) {
                this.f92578e = super.getResources();
            } else {
                this.f92578e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f92578e;
    }

    private void d() {
        boolean z11 = this.f92575b == null;
        if (z11) {
            this.f92575b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f92575b.setTo(theme);
            }
        }
        e(this.f92575b, this.f92574a, z11);
    }

    public void a(Configuration configuration) {
        if (this.f92578e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f92577d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f92577d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f92574a;
    }

    protected void e(Resources.Theme theme, int i11, boolean z11) {
        theme.applyStyle(i11, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f92576c == null) {
            this.f92576c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f92576c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f92575b;
        if (theme != null) {
            return theme;
        }
        if (this.f92574a == 0) {
            this.f92574a = i.f73864e;
        }
        d();
        return this.f92575b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i11) {
        if (this.f92574a != i11) {
            this.f92574a = i11;
            d();
        }
    }

    public c(Context context, int i11) {
        super(context);
        this.f92574a = i11;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f92575b = theme;
    }
}
