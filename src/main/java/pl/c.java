package pl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ol.b;
import pk.i;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class c<DH extends ol.b> extends ImageView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f103175g = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a.C2191a f103176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f103177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b<DH> f103178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f103179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f103180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f103181f;

    public c(Context context) {
        super(context);
        this.f103176a = new a.C2191a();
        this.f103177b = BitmapDescriptorFactory.HUE_RED;
        this.f103179d = false;
        this.f103180e = false;
        this.f103181f = null;
        c(context);
    }

    private void c(Context context) {
        boolean zD;
        try {
            if (bn.b.d()) {
                bn.b.a("DraweeView#init");
            }
            if (this.f103179d) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            boolean z11 = true;
            this.f103179d = true;
            this.f103178c = b.c(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (zD) {
                    return;
                } else {
                    return;
                }
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f103175g || context.getApplicationInfo().targetSdkVersion < 24) {
                z11 = false;
            }
            this.f103180e = z11;
        } finally {
            if (bn.b.d()) {
                bn.b.b();
            }
        }
    }

    private void d() {
        Drawable drawable;
        if (!this.f103180e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z11) {
        f103175g = z11;
    }

    protected void a() {
        this.f103178c.i();
    }

    protected void b() {
        this.f103178c.j();
    }

    protected void e() {
        a();
    }

    protected void f() {
        b();
    }

    public float getAspectRatio() {
        return this.f103177b;
    }

    public ol.a getController() {
        return this.f103178c.e();
    }

    public Object getExtraData() {
        return this.f103181f;
    }

    public DH getHierarchy() {
        return (DH) this.f103178c.f();
    }

    public Drawable getTopLevelDrawable() {
        return this.f103178c.g();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        f();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        d();
        e();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        a.C2191a c2191a = this.f103176a;
        c2191a.f103167a = i11;
        c2191a.f103168b = i12;
        a.b(c2191a, this.f103177b, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        a.C2191a c2191a2 = this.f103176a;
        super.onMeasure(c2191a2.f103167a, c2191a2.f103168b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        d();
        f();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f103178c.k(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        d();
    }

    public void setAspectRatio(float f11) {
        if (f11 == this.f103177b) {
            return;
        }
        this.f103177b = f11;
        requestLayout();
    }

    public void setController(ol.a aVar) {
        this.f103178c.n(aVar);
        super.setImageDrawable(this.f103178c.g());
    }

    public void setExtraData(Object obj) {
        this.f103181f = obj;
    }

    public void setHierarchy(DH dh2) {
        this.f103178c.p(dh2);
        super.setImageDrawable(this.f103178c.g());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        c(getContext());
        this.f103178c.m();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        c(getContext());
        this.f103178c.m();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i11) {
        c(getContext());
        this.f103178c.m();
        super.setImageResource(i11);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        c(getContext());
        this.f103178c.m();
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z11) {
        this.f103180e = z11;
    }

    @Override // android.view.View
    public String toString() {
        i.a aVarB = i.b(this);
        b<DH> bVar = this.f103178c;
        return aVarB.b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f103176a = new a.C2191a();
        this.f103177b = BitmapDescriptorFactory.HUE_RED;
        this.f103179d = false;
        this.f103180e = false;
        this.f103181f = null;
        c(context);
    }

    public c(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f103176a = new a.C2191a();
        this.f103177b = BitmapDescriptorFactory.HUE_RED;
        this.f103179d = false;
        this.f103180e = false;
        this.f103181f = null;
        c(context);
    }
}
