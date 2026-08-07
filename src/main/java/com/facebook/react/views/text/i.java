package com.facebook.react.views.text;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.uimanager.y;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002/4B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00112\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!J7\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\"2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010%H\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010-\u001a\u00020\u0002H\u0016¢\u0006\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00102¨\u00065"}, d2 = {"Lcom/facebook/react/views/text/i;", "Lcom/facebook/react/uimanager/y;", "Landroid/view/View;", "view", "", "originalFocus", "", "originalImportantForAccessibility", "<init>", "(Landroid/view/View;ZI)V", "Lcom/facebook/react/views/text/i$a$a;", "accessibleLink", "Landroid/graphics/Rect;", "m0", "(Lcom/facebook/react/views/text/i$a$a;)Landroid/graphics/Rect;", "virtualViewId", "hasFocus", "Ljn0/h0;", Gender.OTHER, "(IZ)V", "action", "Landroid/os/Bundle;", "arguments", "J", "(IILandroid/os/Bundle;)Z", "", "virtualViewIds", "C", "(Ljava/util/List;)V", "", "x", "y", "B", "(FF)I", "T", "start", "end", "Ljava/lang/Class;", "classType", "n0", "(IILjava/lang/Class;)Ljava/lang/Object;", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "node", Gender.NONE, "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "host", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "b", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "Lcom/facebook/react/views/text/i$a;", "Lcom/facebook/react/views/text/i$a;", "accessibilityLinks", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends y {

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private a accessibilityLinks;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/text/i$a;", "", "", "Landroid/text/style/ClickableSpan;", "spans", "Landroid/text/Spannable;", "text", "<init>", "([Landroid/text/style/ClickableSpan;Landroid/text/Spannable;)V", "", "id", "Lcom/facebook/react/views/text/i$a$a;", "a", "(I)Lcom/facebook/react/views/text/i$a$a;", "start", "end", "b", "(II)Lcom/facebook/react/views/text/i$a$a;", "c", "()I", "", "Ljava/util/List;", "links", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<C0463a> links;

        /* JADX INFO: renamed from: com.facebook.react.views.text.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/facebook/react/views/text/i$a$a;", "", "<init>", "()V", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "description", "", "b", "I", DateTokenConverter.CONVERTER_KEY, "()I", "h", "(I)V", "start", "c", "f", "end", "g", "id", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0463a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private String description;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private int start;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private int end;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            private int id;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getEnd() {
                return this.end;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final int getId() {
                return this.id;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            public final void e(String str) {
                this.description = str;
            }

            public final void f(int i11) {
                this.end = i11;
            }

            public final void g(int i11) {
                this.id = i11;
            }

            public final void h(int i11) {
                this.start = i11;
            }
        }

        public a(ClickableSpan[] spans, Spannable text) {
            s.k(spans, "spans");
            s.k(text, "text");
            ArrayList arrayList = new ArrayList();
            int length = spans.length;
            for (int i11 = 0; i11 < length; i11++) {
                ClickableSpan clickableSpan = spans[i11];
                int spanStart = text.getSpanStart(clickableSpan);
                int spanEnd = text.getSpanEnd(clickableSpan);
                if (spanStart != spanEnd && spanStart >= 0 && spanEnd >= 0 && spanStart <= text.length() && spanEnd <= text.length()) {
                    C0463a c0463a = new C0463a();
                    c0463a.e(text.subSequence(spanStart, spanEnd).toString());
                    c0463a.h(spanStart);
                    c0463a.f(spanEnd);
                    c0463a.g((spans.length - 1) - i11);
                    arrayList.add(c0463a);
                }
            }
            this.links = arrayList;
        }

        public final C0463a a(int id2) {
            for (C0463a c0463a : this.links) {
                if (c0463a.getId() == id2) {
                    return c0463a;
                }
            }
            return null;
        }

        public final C0463a b(int start, int end) {
            for (C0463a c0463a : this.links) {
                if (c0463a.getStart() == start && c0463a.getEnd() == end) {
                    return c0463a;
                }
            }
            return null;
        }

        public final int c() {
            return this.links.size();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.text.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/views/text/i$b;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "originalFocus", "", "originalImportantForAccessibility", "Ljn0/h0;", "b", "(Landroid/view/View;ZI)V", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(View view, boolean originalFocus, int originalImportantForAccessibility) {
            s.k(view, "view");
            ViewCompat.p0(view, new i(view, originalFocus, originalImportantForAccessibility));
        }

        public final void b(View view, boolean originalFocus, int originalImportantForAccessibility) {
            s.k(view, "view");
            if (ViewCompat.O(view)) {
                return;
            }
            if (view.getTag(com.facebook.react.m.f22657g) == null && view.getTag(com.facebook.react.m.f22658h) == null && view.getTag(com.facebook.react.m.f22651a) == null && view.getTag(com.facebook.react.m.f22670t) == null && view.getTag(com.facebook.react.m.f22653c) == null && view.getTag(com.facebook.react.m.f22656f) == null && view.getTag(com.facebook.react.m.D) == null) {
                return;
            }
            ViewCompat.p0(view, new i(view, originalFocus, originalImportantForAccessibility));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view, boolean z11, int i11) {
        super(view, z11, i11);
        s.k(view, "view");
        this.accessibilityLinks = (a) X().getTag(com.facebook.react.m.f22656f);
    }

    private final Rect m0(a.C0463a accessibleLink) {
        if (!(X() instanceof TextView)) {
            return new Rect(0, 0, X().getWidth(), X().getHeight());
        }
        View viewX = X();
        s.i(viewX, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewX;
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, textView.getWidth(), textView.getHeight());
        }
        int start = accessibleLink.getStart();
        int end = accessibleLink.getEnd();
        int lineForOffset = layout.getLineForOffset(start);
        if (start > layout.getLineEnd(lineForOffset)) {
            return null;
        }
        Rect rect = new Rect();
        double primaryHorizontal = layout.getPrimaryHorizontal(start);
        Paint paint = new Paint();
        AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) n0(accessibleLink.getStart(), accessibleLink.getEnd(), AbsoluteSizeSpan.class);
        paint.setTextSize(absoluteSizeSpan != null ? absoluteSizeSpan.getSize() : textView.getTextSize());
        int iCeil = (int) Math.ceil(paint.measureText(accessibleLink.getDescription()));
        boolean z11 = lineForOffset != layout.getLineForOffset(end);
        layout.getLineBounds(lineForOffset, rect);
        int scrollY = textView.getScrollY() + textView.getTotalPaddingTop();
        rect.top += scrollY;
        rect.bottom += scrollY;
        rect.left = (int) (((double) rect.left) + ((primaryHorizontal + ((double) textView.getTotalPaddingLeft())) - ((double) textView.getScrollX())));
        if (z11) {
            return new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int i11 = rect.left;
        return new Rect(i11, rect.top, iCeil + i11, rect.bottom);
    }

    @Override // com.facebook.react.uimanager.y, s6.a
    protected int B(float x11, float y11) {
        Layout layout;
        a aVar = this.accessibilityLinks;
        if (aVar != null && aVar.c() != 0 && (X() instanceof TextView)) {
            View viewX = X();
            s.i(viewX, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewX;
            if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
                return Integer.MIN_VALUE;
            }
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((y11 - textView.getTotalPaddingTop()) + textView.getScrollY())), (x11 - textView.getTotalPaddingLeft()) + textView.getScrollX());
            ClickableSpan clickableSpan = (ClickableSpan) n0(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpan == null) {
                return Integer.MIN_VALUE;
            }
            CharSequence text = textView.getText();
            s.i(text, "null cannot be cast to non-null type android.text.Spanned");
            Spanned spanned = (Spanned) text;
            a.C0463a c0463aB = aVar.b(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
            if (c0463aB != null) {
                return c0463aB.getId();
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // com.facebook.react.uimanager.y, s6.a
    protected void C(List<Integer> virtualViewIds) {
        s.k(virtualViewIds, "virtualViewIds");
        a aVar = this.accessibilityLinks;
        if (aVar == null) {
            return;
        }
        int iC = aVar.c();
        for (int i11 = 0; i11 < iC; i11++) {
            virtualViewIds.add(Integer.valueOf(i11));
        }
    }

    @Override // com.facebook.react.uimanager.y, s6.a
    protected boolean J(int virtualViewId, int action, Bundle arguments) {
        a.C0463a c0463aA;
        ClickableSpan clickableSpan;
        a aVar = this.accessibilityLinks;
        if (aVar == null || aVar == null || (c0463aA = aVar.a(virtualViewId)) == null || (clickableSpan = (ClickableSpan) n0(c0463aA.getStart(), c0463aA.getEnd(), ClickableSpan.class)) == null || !(clickableSpan instanceof ap.f) || action != 16) {
            return false;
        }
        View viewX = X();
        s.j(viewX, "getHostView(...)");
        ((ap.f) clickableSpan).onClick(viewX);
        return true;
    }

    @Override // com.facebook.react.uimanager.y, s6.a
    protected void N(int virtualViewId, AccessibilityNodeInfoCompat node) {
        s.k(node, "node");
        a aVar = this.accessibilityLinks;
        if (aVar == null) {
            node.x0("");
            node.p0(new Rect(0, 0, 1, 1));
            return;
        }
        a.C0463a c0463aA = aVar.a(virtualViewId);
        if (c0463aA == null) {
            node.x0("");
            node.p0(new Rect(0, 0, 1, 1));
            return;
        }
        Rect rectM0 = m0(c0463aA);
        if (rectM0 == null) {
            node.x0("");
            node.p0(new Rect(0, 0, 1, 1));
            return;
        }
        node.x0(c0463aA.getDescription());
        node.a(16);
        node.p0(rectM0);
        node.V0(X().getResources().getString(com.facebook.react.p.f22907w));
        node.t0(y.d.getValue(y.d.BUTTON));
    }

    @Override // s6.a
    protected void O(int virtualViewId, boolean hasFocus) {
        a.C0463a c0463aA;
        ClickableSpan clickableSpan;
        a aVar = this.accessibilityLinks;
        if (aVar == null || aVar == null || (c0463aA = aVar.a(virtualViewId)) == null || (clickableSpan = (ClickableSpan) n0(c0463aA.getStart(), c0463aA.getEnd(), ClickableSpan.class)) == null || !(clickableSpan instanceof ap.f) || !(X() instanceof h)) {
            return;
        }
        ap.f fVar = (ap.f) clickableSpan;
        fVar.b(hasFocus);
        View viewX = X();
        s.i(viewX, "null cannot be cast to non-null type android.widget.TextView");
        fVar.a(((TextView) viewX).getHighlightColor());
        X().invalidate();
    }

    @Override // com.facebook.react.uimanager.y, s6.a, androidx.core.view.a
    public AccessibilityNodeProviderCompat b(View host) {
        s.k(host, "host");
        if (this.accessibilityLinks != null) {
            return l0(host);
        }
        return null;
    }

    protected final <T> T n0(int start, int end, Class<T> classType) {
        if (X() instanceof TextView) {
            View viewX = X();
            s.i(viewX, "null cannot be cast to non-null type android.widget.TextView");
            if (((TextView) viewX).getText() instanceof Spanned) {
                View viewX2 = X();
                s.i(viewX2, "null cannot be cast to non-null type android.widget.TextView");
                CharSequence text = ((TextView) viewX2).getText();
                s.i(text, "null cannot be cast to non-null type android.text.Spanned");
                Object[] spans = ((Spanned) text).getSpans(start, end, classType);
                s.h(spans);
                if (!(spans.length == 0)) {
                    return (T) spans[0];
                }
            }
        }
        return null;
    }
}
