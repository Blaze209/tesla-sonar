package pl;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class d extends c<ml.a> {
    public d(Context context, ml.a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    protected void g(Context context, AttributeSet attributeSet) throws Throwable {
        if (bn.b.d()) {
            bn.b.a("GenericDraweeView#inflateHierarchy");
        }
        ml.b bVarD = ml.c.d(context, attributeSet);
        setAspectRatio(bVarD.f());
        setHierarchy(bVarD.a());
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    public d(Context context) throws Throwable {
        super(context);
        g(context, null);
    }

    public d(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        g(context, attributeSet);
    }

    public d(Context context, AttributeSet attributeSet, int i11) throws Throwable {
        super(context, attributeSet, i11);
        g(context, attributeSet);
    }
}
