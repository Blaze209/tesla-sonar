package vt;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import pt.b;
import zs.c;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class a extends AppCompatTextView {
    public a(@NonNull Context context) {
        this(context, null);
    }

    private void f(@NonNull Resources.Theme theme, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i11, m.N5);
        int iJ = j(getContext(), typedArrayObtainStyledAttributes, m.P5, m.Q5);
        typedArrayObtainStyledAttributes.recycle();
        if (iJ >= 0) {
            setLineHeight(iJ);
        }
    }

    private static boolean g(Context context) {
        return b.b(context, c.f128606z0, true);
    }

    private static int h(@NonNull Resources.Theme theme, AttributeSet attributeSet, int i11, int i12) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.R5, i11, i12);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(m.S5, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void i(AttributeSet attributeSet, int i11, int i12) {
        int iH;
        Context context = getContext();
        if (g(context)) {
            Resources.Theme theme = context.getTheme();
            if (k(context, theme, attributeSet, i11, i12) || (iH = h(theme, attributeSet, i11, i12)) == -1) {
                return;
            }
            f(theme, iH);
        }
    }

    private static int j(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull int... iArr) {
        int iD = -1;
        for (int i11 = 0; i11 < iArr.length && iD < 0; i11++) {
            iD = pt.c.d(context, typedArray, iArr[i11], -1);
        }
        return iD;
    }

    private static boolean k(@NonNull Context context, @NonNull Resources.Theme theme, AttributeSet attributeSet, int i11, int i12) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.R5, i11, i12);
        int iJ = j(context, typedArrayObtainStyledAttributes, m.T5, m.U5);
        typedArrayObtainStyledAttributes.recycle();
        return iJ != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i11) {
        super.setTextAppearance(context, i11);
        if (g(context)) {
            f(context.getTheme(), i11);
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(wt.a.c(context, attributeSet, i11, 0), attributeSet, i11);
        i(attributeSet, i11, 0);
    }
}
