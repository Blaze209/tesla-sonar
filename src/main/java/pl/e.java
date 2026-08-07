package pl;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import pk.k;
import pk.n;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class e extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static n<? extends il.b> f103182i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private il.b f103183h;

    public e(Context context) {
        super(context);
        h(context, null);
    }

    private void h(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (bn.b.d()) {
                bn.b.a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                k.h(f103182i, "SimpleDraweeView was not initialized!");
                this.f103183h = f103182i.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dl.a.E);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(dl.a.G)) {
                        setImageURI(Uri.parse(typedArrayObtainStyledAttributes.getString(dl.a.G)), (Object) null);
                    } else if (typedArrayObtainStyledAttributes.hasValue(dl.a.F) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(dl.a.F, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
            if (bn.b.d()) {
                bn.b.b();
            }
        } catch (Throwable th3) {
            if (bn.b.d()) {
                bn.b.b();
            }
            throw th3;
        }
    }

    public static void i(n<? extends il.b> nVar) {
        f103182i = nVar;
    }

    public il.b getControllerBuilder() {
        return this.f103183h;
    }

    public void setActualImageResource(int i11) {
        setActualImageResource(i11, null);
    }

    public void setImageRequest(com.facebook.imagepipeline.request.a aVar) {
        setController(this.f103183h.D(aVar).a(getController()).build());
    }

    @Override // pl.c, android.widget.ImageView
    public void setImageResource(int i11) {
        super.setImageResource(i11);
    }

    @Override // pl.c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void setActualImageResource(int i11, Object obj) {
        setImageURI(xk.e.g(i11), obj);
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context, attributeSet);
    }

    public void setImageURI(Uri uri, Object obj) {
        setController(this.f103183h.B(obj).b(uri).a(getController()).build());
    }

    public e(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        h(context, attributeSet);
    }

    public void setImageURI(String str, Object obj) {
        setImageURI(str != null ? Uri.parse(str) : null, obj);
    }
}
