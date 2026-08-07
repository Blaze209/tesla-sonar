package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.y0;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class h extends AppCompatTextView implements b0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f23720s = new ViewGroup.LayoutParams(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextUtils.TruncateAt f23723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f23725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f23726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f23727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23728m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f23729n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f23730o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f23731p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private so.p f23732q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Spannable f23733r;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((WritableMap) obj).getInt("index") - ((WritableMap) obj2).getInt("index");
        }
    }

    public h(Context context) {
        super(context);
        this.f23732q = so.p.VISIBLE;
        g();
    }

    private void f() {
        if (!Float.isNaN(this.f23725j)) {
            setTextSize(0, this.f23725j);
        }
        if (Float.isNaN(this.f23727l)) {
            return;
        }
        super.setLetterSpacing(this.f23727l);
    }

    private void g() {
        this.f23722g = Integer.MAX_VALUE;
        this.f23724i = false;
        this.f23728m = 0;
        this.f23729n = false;
        this.f23730o = false;
        this.f23731p = false;
        this.f23723h = TextUtils.TruncateAt.END;
        this.f23725j = Float.NaN;
        this.f23726k = Float.NaN;
        this.f23727l = BitmapDescriptorFactory.HUE_RED;
        this.f23732q = so.p.VISIBLE;
        this.f23733r = null;
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        return context instanceof y0 ? (ReactContext) ((y0) context).getBaseContext() : (ReactContext) context;
    }

    private static WritableMap h(int i11, int i12, int i13, int i14, int i15, int i16) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (i11 == 8) {
            writableMapCreateMap.putString("visibility", "gone");
            writableMapCreateMap.putInt("index", i12);
            return writableMapCreateMap;
        }
        if (i11 != 0) {
            writableMapCreateMap.putString("visibility", "unknown");
            writableMapCreateMap.putInt("index", i12);
            return writableMapCreateMap;
        }
        writableMapCreateMap.putString("visibility", "visible");
        writableMapCreateMap.putInt("index", i12);
        writableMapCreateMap.putDouble("left", w.f(i13));
        writableMapCreateMap.putDouble("top", w.f(i14));
        writableMapCreateMap.putDouble("right", w.f(i15));
        writableMapCreateMap.putDouble("bottom", w.f(i16));
        return writableMapCreateMap;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (ViewCompat.O(this)) {
            androidx.core.view.a aVarM = ViewCompat.m(this);
            if (aVarM instanceof s6.a) {
                return ((s6.a) aVarM).v(motionEvent) || super.dispatchHoverEvent(motionEvent);
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        androidx.core.view.a aVarM = ViewCompat.m(this);
        return (aVarM != null && (aVarM instanceof i) && ((i) aVarM).w(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public Spannable getSpanned() {
        return this.f23733r;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    void i() {
        g();
        com.facebook.react.uimanager.a.n(this);
        setBreakStrategy(0);
        setMovementMethod(getDefaultMovementMethod());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            setJustificationMode(0);
        }
        setLayoutParams(f23720s);
        super.setText((CharSequence) null);
        f();
        setGravity(8388659);
        setNumberOfLines(this.f23722g);
        setAdjustFontSizeToFit(this.f23724i);
        setLinkifyMask(this.f23728m);
        setTextIsSelectable(this.f23730o);
        setIncludeFontPadding(true);
        setEnabled(true);
        setLinkifyMask(0);
        setEllipsizeLocation(this.f23723h);
        setEnabled(true);
        if (i11 >= 26) {
            setFocusable(16);
        }
        setHyphenationFrequency(0);
        j();
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f23721f && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (ap.p pVar : (ap.p[]) spanned.getSpans(0, spanned.length(), ap.p.class)) {
                if (pVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public void j() {
        setEllipsize((this.f23722g == Integer.MAX_VALUE || this.f23724i) ? null : this.f23723h);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTextIsSelectable(this.f23730o);
        if (this.f23721f && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (ap.p pVar : (ap.p[]) spanned.getSpans(0, spanned.length(), ap.p.class)) {
                pVar.c();
            }
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f23721f && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (ap.p pVar : (ap.p[]) spanned.getSpans(0, spanned.length(), ap.p.class)) {
                pVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        sn.c cVar = new sn.c("ReactTextView.onDraw");
        try {
            if (this.f23724i && getSpanned() != null && this.f23731p) {
                this.f23731p = false;
                Spannable spanned = getSpanned();
                float width = getWidth();
                com.facebook.yoga.p pVar = com.facebook.yoga.p.EXACTLY;
                o.a(spanned, width, pVar, getHeight(), pVar, this.f23726k, this.f23722g, getIncludeFontPadding(), getBreakStrategy(), getHyphenationFrequency(), Layout.Alignment.ALIGN_NORMAL, Build.VERSION.SDK_INT < 26 ? -1 : getJustificationMode(), getPaint());
                setText(getSpanned());
            }
            if (this.f23732q != so.p.VISIBLE) {
                com.facebook.react.uimanager.a.a(this, canvas);
            }
            super.onDraw(canvas);
            cVar.close();
        } catch (Throwable th2) {
            try {
                cVar.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f23721f && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (ap.p pVar : (ap.p[]) spanned.getSpans(0, spanned.length(), ap.p.class)) {
                pVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        androidx.core.view.a aVarM = ViewCompat.m(this);
        if (aVarM == null || !(aVarM instanceof i)) {
            return;
        }
        ((i) aVarM).I(z11, i11, rect);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ap.q[] qVarArr;
        int i15;
        Spanned spanned;
        int primaryHorizontal;
        float lineWidth;
        int id2 = getId();
        if (!(getText() instanceof Spanned) || oo.a.a(id2) == 2) {
            return;
        }
        UIManagerModule uIManagerModule = (UIManagerModule) gn.a.c((UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class));
        Spanned spanned2 = (Spanned) getText();
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        ap.q[] qVarArr2 = (ap.q[]) spanned2.getSpans(0, spanned2.length(), ap.q.class);
        ArrayList arrayList = this.f23729n ? new ArrayList(qVarArr2.length) : null;
        int i16 = i13 - i11;
        int i17 = i14 - i12;
        int length = qVarArr2.length;
        int i18 = 0;
        while (i18 < length) {
            ap.q qVar = qVarArr2[i18];
            View viewResolveView = uIManagerModule.resolveView(qVar.getReactTag());
            int spanStart = spanned2.getSpanStart(qVar);
            int lineForOffset = layout.getLineForOffset(spanStart);
            if ((layout.getEllipsisCount(lineForOffset) <= 0 || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) && lineForOffset < this.f23722g && spanStart < layout.getLineEnd(lineForOffset)) {
                int i19 = qVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String();
                int i21 = qVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                qVarArr = qVarArr2;
                boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart);
                i15 = length;
                boolean z12 = layout.getParagraphDirection(lineForOffset) == -1;
                if (spanStart == spanned2.length() - 1) {
                    if (spanned2.length() > 0) {
                        spanned = spanned2;
                        if (spanned2.charAt(layout.getLineEnd(lineForOffset) - 1) == '\n') {
                            lineWidth = layout.getLineMax(lineForOffset);
                        }
                        if (z12) {
                            primaryHorizontal = i16 - ((int) lineWidth);
                        } else {
                            primaryHorizontal = (int) layout.getLineRight(lineForOffset);
                            primaryHorizontal -= i19;
                        }
                    } else {
                        spanned = spanned2;
                    }
                    lineWidth = layout.getLineWidth(lineForOffset);
                    if (z12) {
                        primaryHorizontal = i16 - ((int) lineWidth);
                    } else {
                        primaryHorizontal = (int) layout.getLineRight(lineForOffset);
                        primaryHorizontal -= i19;
                    }
                } else {
                    spanned = spanned2;
                    primaryHorizontal = (int) (z12 == zIsRtlCharAt ? layout.getPrimaryHorizontal(spanStart) : layout.getSecondaryHorizontal(spanStart));
                    if (z12) {
                        primaryHorizontal = i16 - (((int) layout.getLineRight(lineForOffset)) - primaryHorizontal);
                    }
                    if (zIsRtlCharAt) {
                        primaryHorizontal -= i19;
                    }
                }
                int totalPaddingRight = primaryHorizontal + (zIsRtlCharAt ? getTotalPaddingRight() : getTotalPaddingLeft());
                int i22 = i11 + totalPaddingRight;
                int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - i21;
                int i23 = i12 + totalPaddingTop;
                int i24 = (i16 <= totalPaddingRight || i17 <= totalPaddingTop) ? 8 : 0;
                int i25 = i22 + i19;
                int i26 = i21 + i23;
                viewResolveView.setVisibility(i24);
                viewResolveView.layout(i22, i23, i25, i26);
                if (this.f23729n) {
                    arrayList.add(h(i24, spanStart, i22, i23, i25, i26));
                }
            } else {
                spanned = spanned2;
                qVarArr = qVarArr2;
                i15 = length;
                viewResolveView.setVisibility(8);
                if (this.f23729n) {
                    arrayList.add(h(8, spanStart, -1, -1, -1, -1));
                }
            }
            i18++;
            qVarArr2 = qVarArr;
            length = i15;
            spanned2 = spanned;
        }
        if (this.f23729n) {
            Collections.sort(arrayList, new a());
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                writableArrayCreateArray.pushMap((WritableMap) it.next());
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putArray("inlineViews", writableArrayCreateArray);
            if (uIManagerModule != null) {
                uIManagerModule.receiveEvent(id2, "topInlineViewLayout", writableMapCreateMap);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        sn.c cVar = new sn.c("ReactTextView.onMeasure");
        try {
            super.onMeasure(i11, i12);
            cVar.close();
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f23721f && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (ap.p pVar : (ap.p[]) spanned.getSpans(0, spanned.length(), ap.p.class)) {
                pVar.f();
            }
        }
    }

    @Override // com.facebook.react.uimanager.b0
    public int reactTagForTouch(float f11, float f12) {
        int i11;
        CharSequence text = getText();
        int id2 = getId();
        int i12 = (int) f11;
        int i13 = (int) f12;
        Layout layout = getLayout();
        if (layout != null) {
            int lineForVertical = layout.getLineForVertical(i13);
            int lineLeft = (int) layout.getLineLeft(lineForVertical);
            int lineRight = (int) layout.getLineRight(lineForVertical);
            if ((text instanceof Spanned) && i12 >= lineLeft && i12 <= lineRight) {
                Spanned spanned = (Spanned) text;
                try {
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, i12);
                    ap.k[] kVarArr = (ap.k[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ap.k.class);
                    if (kVarArr != null) {
                        int length = text.length();
                        for (int i14 = 0; i14 < kVarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(kVarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(kVarArr[i14]);
                            if (spanEnd >= offsetForHorizontal && (i11 = spanEnd - spanStart) <= length) {
                                id2 = kVarArr[i14].getReactTag();
                                length = i11;
                            }
                        }
                        return id2;
                    }
                } catch (ArrayIndexOutOfBoundsException e11) {
                    qk.a.m("ReactNative", "Crash in HorizontalMeasurementProvider: " + e11.getMessage());
                }
            }
        }
        return id2;
    }

    public void setAdjustFontSizeToFit(boolean z11) {
        this.f23724i = z11;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        com.facebook.react.uimanager.a.o(this, Integer.valueOf(i11));
    }

    public void setBorderColor(int i11, Integer num) {
        com.facebook.react.uimanager.a.q(this, so.n.values()[i11], num);
    }

    public void setBorderRadius(float f11) {
        setBorderRadius(f11, so.d.BORDER_RADIUS.ordinal());
    }

    public void setBorderStyle(String str) {
        com.facebook.react.uimanager.a.s(this, str == null ? null : so.f.fromString(str));
    }

    public void setBorderWidth(int i11, float f11) {
        com.facebook.react.uimanager.a.t(this, so.n.values()[i11], Float.valueOf(w.f(f11)));
    }

    @Override // android.widget.TextView
    public void setBreakStrategy(int i11) {
        super.setBreakStrategy(i11);
        this.f23731p = true;
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.f23723h = truncateAt;
    }

    public void setFontSize(float f11) {
        this.f23725j = (float) (this.f23724i ? Math.ceil(w.j(f11)) : Math.ceil(w.h(f11)));
        f();
    }

    void setGravityHorizontal(int i11) {
        if (i11 == 0) {
            i11 = 8388611;
        }
        setGravity(i11 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i11) {
        if (i11 == 0) {
            i11 = 48;
        }
        setGravity(i11 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setHyphenationFrequency(int i11) {
        super.setHyphenationFrequency(i11);
        this.f23731p = true;
    }

    @Override // android.widget.TextView
    public void setIncludeFontPadding(boolean z11) {
        super.setIncludeFontPadding(z11);
        this.f23731p = true;
    }

    @Override // android.widget.TextView
    public void setLetterSpacing(float f11) {
        if (Float.isNaN(f11)) {
            return;
        }
        this.f23727l = w.h(f11) / this.f23725j;
        f();
    }

    public void setLinkifyMask(int i11) {
        this.f23728m = i11;
    }

    public void setMinimumFontSize(float f11) {
        this.f23726k = f11;
        this.f23731p = true;
    }

    public void setNotifyOnInlineViewLayout(boolean z11) {
        this.f23729n = z11;
    }

    public void setNumberOfLines(int i11) {
        if (i11 == 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.f23722g = i11;
        setMaxLines(i11);
        this.f23731p = true;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.f23732q = so.p.VISIBLE;
        } else {
            so.p pVarFromString = so.p.fromString(str);
            if (pVarFromString == null) {
                pVarFromString = so.p.VISIBLE;
            }
            this.f23732q = pVarFromString;
        }
        invalidate();
    }

    public void setSpanned(Spannable spannable) {
        this.f23733r = spannable;
        this.f23731p = true;
    }

    public void setText(g gVar) {
        sn.c cVar = new sn.c("ReactTextView.setText(ReactTextUpdate)");
        try {
            this.f23721f = gVar.getContainsImages();
            if (getLayoutParams() == null) {
                setLayoutParams(f23720s);
            }
            Spannable text = gVar.getText();
            int i11 = this.f23728m;
            if (i11 > 0) {
                Linkify.addLinks(text, i11);
                setMovementMethod(LinkMovementMethod.getInstance());
            }
            setText(text);
            float paddingLeft = gVar.getPaddingLeft();
            float paddingTop = gVar.getPaddingTop();
            float paddingRight = gVar.getPaddingRight();
            float paddingBottom = gVar.getPaddingBottom();
            if (paddingLeft != -1.0f && paddingTop != -1.0f && paddingRight != -1.0f && paddingBottom != -1.0f) {
                setPadding((int) Math.floor(paddingLeft), (int) Math.floor(paddingTop), (int) Math.floor(paddingRight), (int) Math.floor(paddingBottom));
            }
            int textAlign = gVar.getTextAlign();
            if (textAlign != getGravityHorizontal()) {
                setGravityHorizontal(textAlign);
            }
            if (getBreakStrategy() != gVar.getTextBreakStrategy()) {
                setBreakStrategy(gVar.getTextBreakStrategy());
            }
            if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != gVar.getJustificationMode()) {
                setJustificationMode(gVar.getJustificationMode());
            }
            requestLayout();
            cVar.close();
        } catch (Throwable th2) {
            try {
                cVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.widget.TextView
    public void setTextIsSelectable(boolean z11) {
        this.f23730o = z11;
        super.setTextIsSelectable(z11);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f23721f && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (ap.p pVar : (ap.p[]) spanned.getSpans(0, spanned.length(), ap.p.class)) {
                if (pVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void setBorderRadius(float f11, int i11) {
        com.facebook.react.uimanager.a.r(this, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(w.f(f11), com.facebook.react.uimanager.p.POINT));
    }
}
