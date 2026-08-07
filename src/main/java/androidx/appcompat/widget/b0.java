package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
class b0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f2590l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f2591m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Field> f2592n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2593a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2594b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f2595c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f2596d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f2597e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f2598f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2599g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f2600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private final TextView f2601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f2602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f2603k;

    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.b0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) b0.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.b0.a, androidx.appcompat.widget.b0.c
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.b0.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class c {
        c() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) b0.n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    b0(@NonNull TextView textView) {
        this.f2601i = textView;
        this.f2602j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2603k = new b();
        } else {
            this.f2603k = new a();
        }
    }

    private void A(float f11, float f12, float f13) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f11 + "px) is less or equal to (0px)");
        }
        if (f12 <= f11) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f12 + "px) is less or equal to minimum auto-size text size (" + f11 + "px)");
        }
        if (f13 <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f13 + "px) is less or equal to (0px)");
        }
        this.f2593a = 1;
        this.f2596d = f11;
        this.f2597e = f12;
        this.f2595c = f13;
        this.f2599g = false;
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i11 : iArr) {
                if (i11 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i11)) < 0) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i12 = 0; i12 < size; i12++) {
                    iArr2[i12] = ((Integer) arrayList.get(i12)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f2593a = 0;
        this.f2596d = -1.0f;
        this.f2597e = -1.0f;
        this.f2595c = -1.0f;
        this.f2598f = new int[0];
        this.f2594b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i11, int i12) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f2600h, i11);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f2601i.getLineSpacingExtra(), this.f2601i.getLineSpacingMultiplier()).setIncludePad(this.f2601i.getIncludeFontPadding()).setBreakStrategy(this.f2601i.getBreakStrategy()).setHyphenationFrequency(this.f2601i.getHyphenationFrequency());
        if (i12 == -1) {
            i12 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i12);
        try {
            this.f2603k.a(builderObtain, this.f2601i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    private int f(RectF rectF) {
        int length = this.f2598f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = 1;
        int i12 = length - 1;
        int i13 = 0;
        while (i11 <= i12) {
            int i14 = (i11 + i12) / 2;
            if (y(this.f2598f[i14], rectF)) {
                int i15 = i14 + 1;
                i13 = i11;
                i11 = i15;
            } else {
                i13 = i14 - 1;
                i12 = i13;
            }
        }
        return this.f2598f[i13];
    }

    private static Method l(@NonNull String str) {
        try {
            Method declaredMethod = f2591m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f2591m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e11);
            return null;
        }
    }

    static <T> T n(@NonNull Object obj, @NonNull String str, @NonNull T t11) {
        try {
            return (T) l(str).invoke(obj, null);
        } catch (Exception e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e11);
            return t11;
        }
    }

    private void t(float f11) {
        if (f11 != this.f2601i.getPaint().getTextSize()) {
            this.f2601i.getPaint().setTextSize(f11);
            boolean zIsInLayout = this.f2601i.isInLayout();
            if (this.f2601i.getLayout() != null) {
                this.f2594b = false;
                try {
                    Method methodL = l("nullLayouts");
                    if (methodL != null) {
                        methodL.invoke(this.f2601i, null);
                    }
                } catch (Exception e11) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e11);
                }
                if (zIsInLayout) {
                    this.f2601i.forceLayout();
                } else {
                    this.f2601i.requestLayout();
                }
                this.f2601i.invalidate();
            }
        }
    }

    private boolean v() {
        if (z() && this.f2593a == 1) {
            if (!this.f2599g || this.f2598f.length == 0) {
                int iFloor = ((int) Math.floor((this.f2597e - this.f2596d) / this.f2595c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i11 = 0; i11 < iFloor; i11++) {
                    iArr[i11] = Math.round(this.f2596d + (i11 * this.f2595c));
                }
                this.f2598f = b(iArr);
            }
            this.f2594b = true;
        } else {
            this.f2594b = false;
        }
        return this.f2594b;
    }

    private void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = typedArray.getDimensionPixelSize(i11, -1);
            }
            this.f2598f = b(iArr);
            x();
        }
    }

    private boolean x() {
        int[] iArr = this.f2598f;
        int length = iArr.length;
        boolean z11 = length > 0;
        this.f2599g = z11;
        if (z11) {
            this.f2593a = 1;
            this.f2596d = iArr[0];
            this.f2597e = iArr[length - 1];
            this.f2595c = -1.0f;
        }
        return z11;
    }

    private boolean y(int i11, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f2601i.getText();
        TransformationMethod transformationMethod = this.f2601i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f2601i)) != null) {
            text = transformation;
        }
        int maxLines = this.f2601i.getMaxLines();
        m(i11);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) n(this.f2601i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean z() {
        return !(this.f2601i instanceof i);
    }

    void a() {
        if (o()) {
            if (this.f2594b) {
                if (this.f2601i.getMeasuredHeight() <= 0 || this.f2601i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2603k.b(this.f2601i) ? PKIFailureInfo.badCertTemplate : (this.f2601i.getMeasuredWidth() - this.f2601i.getTotalPaddingLeft()) - this.f2601i.getTotalPaddingRight();
                int height = (this.f2601i.getHeight() - this.f2601i.getCompoundPaddingBottom()) - this.f2601i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2590l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float f11 = f(rectF);
                        if (f11 != this.f2601i.getTextSize()) {
                            u(0, f11);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f2594b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i11, int i12) {
        return e(charSequence, alignment, i11, i12);
    }

    int g() {
        return Math.round(this.f2597e);
    }

    int h() {
        return Math.round(this.f2596d);
    }

    int i() {
        return Math.round(this.f2595c);
    }

    int[] j() {
        return this.f2598f;
    }

    int k() {
        return this.f2593a;
    }

    void m(int i11) {
        TextPaint textPaint = this.f2600h;
        if (textPaint == null) {
            this.f2600h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f2600h.set(this.f2601i.getPaint());
        this.f2600h.setTextSize(i11);
    }

    boolean o() {
        return z() && this.f2593a != 0;
    }

    void p(AttributeSet attributeSet, int i11) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f2602j.obtainStyledAttributes(attributeSet, i.j.f73911i0, i11, 0);
        TextView textView = this.f2601i;
        ViewCompat.n0(textView, textView.getContext(), i.j.f73911i0, attributeSet, typedArrayObtainStyledAttributes, i11, 0);
        if (typedArrayObtainStyledAttributes.hasValue(i.j.f73936n0)) {
            this.f2593a = typedArrayObtainStyledAttributes.getInt(i.j.f73936n0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(i.j.f73931m0) ? typedArrayObtainStyledAttributes.getDimension(i.j.f73931m0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i.j.f73921k0) ? typedArrayObtainStyledAttributes.getDimension(i.j.f73921k0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i.j.f73916j0) ? typedArrayObtainStyledAttributes.getDimension(i.j.f73916j0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(i.j.f73926l0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i.j.f73926l0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z()) {
            this.f2593a = 0;
            return;
        }
        if (this.f2593a == 1) {
            if (!this.f2599g) {
                DisplayMetrics displayMetrics = this.f2602j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    void q(int i11, int i12, int i13, int i14) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f2602j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i14, i11, displayMetrics), TypedValue.applyDimension(i14, i12, displayMetrics), TypedValue.applyDimension(i14, i13, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    void r(@NonNull int[] iArr, int i11) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i11 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f2602j.getResources().getDisplayMetrics();
                    for (int i12 = 0; i12 < length; i12++) {
                        iArrCopyOf[i12] = Math.round(TypedValue.applyDimension(i11, iArr[i12], displayMetrics));
                    }
                }
                this.f2598f = b(iArrCopyOf);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f2599g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    void s(int i11) {
        if (z()) {
            if (i11 == 0) {
                c();
                return;
            }
            if (i11 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i11);
            }
            DisplayMetrics displayMetrics = this.f2602j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        }
    }

    void u(int i11, float f11) {
        Context context = this.f2602j;
        t(TypedValue.applyDimension(i11, f11, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
