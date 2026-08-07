package wt;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import zs.c;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f122347a = {R.attr.theme, c.B0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f122348b = {c.U};

    private static int a(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f122347a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f122348b, i11, i12);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    public static Context c(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        int iB = b(context, attributeSet, i11, i12);
        boolean z11 = (context instanceof n.c) && ((n.c) context).c() == iB;
        if (iB == 0 || z11) {
            return context;
        }
        n.c cVar = new n.c(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            cVar.getTheme().applyStyle(iA, true);
        }
        return cVar;
    }
}
