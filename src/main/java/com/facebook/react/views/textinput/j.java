package com.facebook.react.views.textinput;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.ViewCompat;
import ap.ReactTextPaintHolderSpan;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.u0;
import com.plaid.internal.EnumC4419g;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class j extends androidx.appcompat.widget.i {
    public static final boolean M;
    private static final KeyListener N;
    private int A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private String G;
    private so.p H;
    private u0 I;
    protected boolean J;
    protected boolean K;
    private EventDispatcher L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InputMethodManager f23810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f23811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f23812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f23815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CopyOnWriteArrayList<TextWatcher> f23816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private d f23817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f23819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f23820o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f23821p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f23822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private y f23823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.facebook.react.views.textinput.a f23824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f23825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private c f23826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f23827v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f23828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.facebook.react.views.text.n f23829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f23830y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private String f23831z;

    class a extends com.facebook.react.uimanager.y {
        a(View view, boolean z11, int i11) {
            super(view, z11, i11);
        }

        @Override // com.facebook.react.uimanager.y, androidx.core.view.a
        public boolean j(View view, int i11, Bundle bundle) {
            if (i11 != 16) {
                return super.j(view, i11, bundle);
            }
            int length = j.this.getText().length();
            if (length > 0) {
                j.this.setSelection(length);
            }
            return j.this.Q();
        }
    }

    class b implements ActionMode.Callback {
        b() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (j.this.D) {
                return false;
            }
            menu.removeItem(R.id.pasteAsPlainText);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }
    }

    private static class c implements KeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23834a = 0;

        public void a(int i11) {
            this.f23834a = i11;
        }

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i11) {
            j.N.clearMetaKeyState(view, editable, i11);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.f23834a;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i11, KeyEvent keyEvent) {
            return j.N.onKeyDown(view, editable, i11, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return j.N.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i11, KeyEvent keyEvent) {
            return j.N.onKeyUp(view, editable, i11, keyEvent);
        }
    }

    private class d implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            j jVar = j.this;
            if (jVar.f23812g || jVar.f23816k == null) {
                return;
            }
            Iterator it = j.this.f23816k.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            j jVar = j.this;
            if (jVar.f23812g || jVar.f23816k == null) {
                return;
            }
            Iterator it = j.this.f23816k.iterator();
            while (it.hasNext()) {
                ((TextWatcher) it.next()).beforeTextChanged(charSequence, i11, i12, i13);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            if (j.M) {
                qk.a.m(j.this.f23811f, "onTextChanged[" + j.this.getId() + "]: " + ((Object) charSequence) + " " + i11 + " " + i12 + " " + i13);
            }
            j jVar = j.this;
            if (!jVar.f23812g && jVar.f23816k != null) {
                Iterator it = j.this.f23816k.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i11, i12, i13);
                }
            }
            j.this.Y();
            j.this.O();
        }

        private d() {
        }
    }

    static {
        ln.a aVar = ln.a.f90481a;
        M = false;
        N = QwertyKeyListener.getInstanceForFullKeyboard();
    }

    public j(Context context) {
        super(context);
        this.f23811f = j.class.getSimpleName();
        this.f23820o = null;
        this.f23827v = false;
        this.f23828w = false;
        this.f23830y = false;
        this.f23831z = null;
        this.A = -1;
        this.B = -1;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = null;
        this.H = so.p.VISIBLE;
        this.I = null;
        this.J = false;
        this.K = false;
        this.f23810e = (InputMethodManager) gn.a.c(context.getSystemService("input_method"));
        this.f23813h = getGravity() & 8388615;
        this.f23814i = getGravity() & 112;
        this.f23815j = 0;
        this.f23812g = false;
        this.f23821p = false;
        this.f23816k = null;
        this.f23817l = null;
        this.f23818m = getInputType();
        if (this.f23826u == null) {
            this.f23826u = new c();
        }
        this.f23825t = null;
        this.f23829x = new com.facebook.react.views.text.n();
        q();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26 && i11 <= 27) {
            setLayerType(1, null);
        }
        ViewCompat.p0(this, new a(this, isFocusable(), getImportantForAccessibility()));
        b bVar = new b();
        setCustomSelectionActionModeCallback(bVar);
        setCustomInsertionActionModeCallback(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean A(ap.d dVar) {
        return dVar.getSize() == this.f23829x.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean B(ap.e eVar) {
        return Integer.valueOf(eVar.getBackgroundColor()).equals(com.facebook.react.uimanager.a.i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean C(ap.g gVar) {
        return gVar.getForegroundColor() == getCurrentTextColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean D(ap.j jVar) {
        return (getPaintFlags() & 16) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean E(ap.m mVar) {
        return (getPaintFlags() & 8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean F(ap.a aVar) {
        return aVar.getSpacing() == this.f23829x.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean G(ap.c cVar) {
        return cVar.c() == this.B && Objects.equals(cVar.getFontFamily(), this.f23831z) && cVar.d() == this.A && Objects.equals(cVar.getFontFeatureSettings(), getFontFeatureSettings());
    }

    private void H(SpannableStringBuilder spannableStringBuilder) {
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            boolean z11 = (spanFlags & 33) == 33;
            if (obj instanceof ap.i) {
                getText().removeSpan(obj);
            }
            if (z11) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (R(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    private void I(int i11, int i12) {
        if (i11 == -1 || i12 == -1) {
            return;
        }
        setSelection(s(i11), s(i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        com.facebook.react.views.textinput.a aVar = this.f23824s;
        if (aVar != null) {
            aVar.a();
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Q() {
        boolean zRequestFocus = super.requestFocus(EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, null);
        if (isInTouchMode() && getShowSoftInputOnFocus()) {
            V();
        }
        return zRequestFocus;
    }

    private static boolean R(Editable editable, SpannableStringBuilder spannableStringBuilder, int i11, int i12) {
        if (i11 > spannableStringBuilder.length() || i12 > spannableStringBuilder.length()) {
            return false;
        }
        while (i11 < i12) {
            if (editable.charAt(i11) != spannableStringBuilder.charAt(i11)) {
                return false;
            }
            i11++;
        }
        return true;
    }

    private void S() {
        ReactContext reactContextD = b1.d(this);
        if (this.I != null || reactContextD.isBridgeless()) {
            return;
        }
        r rVar = new r(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextD.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), rVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void W(SpannableStringBuilder spannableStringBuilder, Class<T> cls, u5.i<T> iVar) {
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
            if (iVar.test(obj)) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
    }

    private void X(SpannableStringBuilder spannableStringBuilder) {
        W(spannableStringBuilder, ap.d.class, new u5.i() { // from class: com.facebook.react.views.textinput.c
            @Override // u5.i
            public final boolean test(Object obj) {
                return this.f23803a.A((ap.d) obj);
            }
        });
        W(spannableStringBuilder, ap.e.class, new u5.i() { // from class: com.facebook.react.views.textinput.d
            @Override // u5.i
            public final boolean test(Object obj) {
                return this.f23804a.B((ap.e) obj);
            }
        });
        W(spannableStringBuilder, ap.g.class, new u5.i() { // from class: com.facebook.react.views.textinput.e
            @Override // u5.i
            public final boolean test(Object obj) {
                return this.f23805a.C((ap.g) obj);
            }
        });
        W(spannableStringBuilder, ap.j.class, new u5.i() { // from class: com.facebook.react.views.textinput.f
            @Override // u5.i
            public final boolean test(Object obj) {
                return this.f23806a.D((ap.j) obj);
            }
        });
        W(spannableStringBuilder, ap.m.class, new u5.i() { // from class: com.facebook.react.views.textinput.g
            @Override // u5.i
            public final boolean test(Object obj) {
                return this.f23807a.E((ap.m) obj);
            }
        });
        W(spannableStringBuilder, ap.a.class, new u5.i() { // from class: com.facebook.react.views.textinput.h
            @Override // u5.i
            public final boolean test(Object obj) {
                return this.f23808a.F((ap.a) obj);
            }
        });
        W(spannableStringBuilder, ap.c.class, new u5.i() { // from class: com.facebook.react.views.textinput.i
            @Override // u5.i
            public final boolean test(Object obj) {
                return this.f23809a.G((ap.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (this.I == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z11 = text != null && text.length() > 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z11) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e11) {
                ReactSoftExceptionLogger.logSoftException(this.f23811f, e11);
            }
        }
        if (!z11) {
            if (getHint() != null && getHint().length() > 0) {
                spannableStringBuilder.append(getHint());
            } else if (oo.a.c(this) != 2) {
                spannableStringBuilder.append("I");
            }
        }
        p(spannableStringBuilder);
        spannableStringBuilder.setSpan(new ReactTextPaintHolderSpan(new TextPaint(getPaint())), 0, spannableStringBuilder.length(), 18);
        com.facebook.react.views.text.o.o(getId(), spannableStringBuilder);
    }

    /* JADX WARN: switch over string: strings are not added: [[done]] */
    private void Z() {
        String str = this.f23822q;
        int i11 = 6;
        if (str != null) {
            str.getClass();
            switch (str) {
                case "previous":
                    i11 = 7;
                    break;
                case "search":
                    i11 = 3;
                    break;
                case "go":
                    i11 = 2;
                    break;
                case "next":
                    i11 = 5;
                    break;
                case "none":
                    i11 = 1;
                    break;
                case "send":
                    i11 = 4;
                    break;
            }
        }
        if (this.f23821p) {
            setImeOptions(33554432 | i11);
        } else {
            setImeOptions(i11);
        }
    }

    private d getTextWatcherDelegator() {
        if (this.f23817l == null) {
            this.f23817l = new d();
        }
        return this.f23817l;
    }

    private void p(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new ap.d(this.f23829x.c()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new ap.g(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        Integer numI = com.facebook.react.uimanager.a.i(this);
        if (numI != null && numI.intValue() != 0) {
            spannableStringBuilder.setSpan(new ap.e(numI.intValue()), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new ap.j(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new ap.m(), 0, spannableStringBuilder.length(), 16711698);
        }
        float fD = this.f23829x.d();
        if (!Float.isNaN(fD)) {
            spannableStringBuilder.setSpan(new ap.a(fD), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.B != -1 || this.A != -1 || this.f23831z != null || getFontFeatureSettings() != null) {
            spannableStringBuilder.setSpan(new ap.c(this.B, this.A, getFontFeatureSettings(), this.f23831z, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float fE = this.f23829x.e();
        if (Float.isNaN(fE)) {
            return;
        }
        spannableStringBuilder.setSpan(new ap.b(fE), 0, spannableStringBuilder.length(), 16711698);
    }

    private int s(int i11) {
        return Math.max(0, Math.min(i11, getText() == null ? 0 : getText().length()));
    }

    private boolean z() {
        return (getInputType() & 144) != 0;
    }

    public void J(int i11, int i12, int i13) {
        if (r(i11)) {
            I(i12, i13);
        }
    }

    public void K(com.facebook.react.views.text.g gVar) {
        if (!(z() && TextUtils.equals(getText(), gVar.getText())) && r(gVar.getJsEventCounter())) {
            if (M) {
                qk.a.m(this.f23811f, "maybeSetText[" + getId() + "]: current text: " + ((Object) getText()) + " update: " + ((Object) gVar.getText()));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            H(spannableStringBuilder);
            X(spannableStringBuilder);
            this.f23819n = gVar.getContainsImages();
            this.J = true;
            if (gVar.getText().length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.J = false;
            if (getBreakStrategy() != gVar.getTextBreakStrategy()) {
                setBreakStrategy(gVar.getTextBreakStrategy());
            }
            Y();
        }
    }

    public void L(com.facebook.react.views.text.g gVar) {
        this.f23812g = true;
        K(gVar);
        this.f23812g = false;
    }

    public void M(com.facebook.react.views.text.g gVar) {
        this.K = true;
        K(gVar);
        this.K = false;
    }

    public void N() {
        if (this.f23830y) {
            this.f23830y = false;
            setTypeface(com.facebook.react.views.text.k.a(getTypeface(), this.B, this.A, this.f23831z, getContext().getAssets()));
            if (this.B == -1 && this.A == -1 && this.f23831z == null && getFontFeatureSettings() == null) {
                setPaintFlags(getPaintFlags() & (-129));
            } else {
                setPaintFlags(getPaintFlags() | 128);
            }
        }
    }

    public void P() {
        Q();
    }

    public boolean T() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            return !y();
        }
        return submitBehavior.equals("blurAndSubmit");
    }

    public boolean U() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            return !y();
        }
        return submitBehavior.equals("submit") || submitBehavior.equals("blurAndSubmit");
    }

    protected boolean V() {
        return this.f23810e.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f23816k == null) {
            this.f23816k = new CopyOnWriteArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f23816k.add(textWatcher);
    }

    protected void finalize() {
        if (M) {
            qk.a.m(this.f23811f, "finalize[" + getId() + "] delete cached spannable");
        }
        com.facebook.react.views.text.o.f(getId());
    }

    public boolean getDisableFullscreenUI() {
        return this.f23821p;
    }

    int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public String getReturnKeyType() {
        return this.f23822q;
    }

    int getStagedInputType() {
        return this.f23818m;
    }

    public u0 getStateWrapper() {
        return this.I;
    }

    public String getSubmitBehavior() {
        return this.f23820o;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.f23819n) {
            Editable text = getText();
            for (ap.p pVar : (ap.p[]) text.getSpans(0, text.length(), ap.p.class)) {
                if (pVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setTextIsSelectable(true);
        I(selectionStart, selectionEnd);
        if (this.f23819n) {
            Editable text = getText();
            for (ap.p pVar : (ap.p[]) text.getSpans(0, text.length(), ap.p.class)) {
                pVar.c();
            }
        }
        if (this.C && !this.E) {
            Q();
        }
        this.E = true;
    }

    @Override // androidx.appcompat.widget.i, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContextD = b1.d(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && this.f23828w) {
            inputConnectionOnCreateInputConnection = new l(inputConnectionOnCreateInputConnection, reactContextD, this, this.L);
        }
        if (y() && (T() || U())) {
            editorInfo.imeOptions &= -1073741825;
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f23819n) {
            Editable text = getText();
            for (ap.p pVar : (ap.p[]) text.getSpans(0, text.length(), ap.p.class)) {
                pVar.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.H != so.p.VISIBLE) {
            com.facebook.react.uimanager.a.a(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f23819n) {
            Editable text = getText();
            for (ap.p pVar : (ap.p[]) text.getSpans(0, text.length(), ap.p.class)) {
                pVar.e();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        y yVar;
        super.onFocusChanged(z11, i11, rect);
        if (!z11 || (yVar = this.f23823r) == null) {
            return;
        }
        yVar.a(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 != 66 || y()) {
            return super.onKeyUp(i11, keyEvent);
        }
        w();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        O();
        if (this.F && isFocused()) {
            selectAll();
            this.F = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        x xVar = this.f23825t;
        if (xVar != null) {
            xVar.a(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i11, int i12) {
        if (M) {
            qk.a.m(this.f23811f, "onSelectionChanged[" + getId() + "]: " + i11 + " " + i12);
        }
        super.onSelectionChanged(i11, i12);
        if (this.f23823r == null || !hasFocus()) {
            return;
        }
        this.f23823r.a(i11, i12);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f23819n) {
            Editable text = getText();
            for (ap.p pVar : (ap.p[]) text.getSpans(0, text.length(), ap.p.class)) {
                pVar.f();
            }
        }
    }

    @Override // androidx.appcompat.widget.i, android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        if (i11 == 16908322) {
            i11 = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i11);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f23827v = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f23827v) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f23827v = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected void q() {
        setTextSize(0, this.f23829x.c());
        float fD = this.f23829x.d();
        if (Float.isNaN(fD)) {
            return;
        }
        setLetterSpacing(fD);
    }

    public boolean r(int i11) {
        return i11 >= this.f23815j;
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        CopyOnWriteArrayList<TextWatcher> copyOnWriteArrayList = this.f23816k;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(textWatcher);
            if (this.f23816k.isEmpty()) {
                this.f23816k = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    public void setAllowFontScaling(boolean z11) {
        if (this.f23829x.b() != z11) {
            this.f23829x.m(z11);
            q();
        }
    }

    public void setAutoFocus(boolean z11) {
        this.C = z11;
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
        com.facebook.react.uimanager.a.t(this, so.n.values()[i11], Float.valueOf(com.facebook.react.uimanager.w.f(f11)));
    }

    public void setContentSizeWatcher(com.facebook.react.views.textinput.a aVar) {
        this.f23824s = aVar;
    }

    public void setContextMenuHidden(boolean z11) {
        this.D = z11;
    }

    public void setDisableFullscreenUI(boolean z11) {
        this.f23821p = z11;
        Z();
    }

    void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.L = eventDispatcher;
    }

    public void setFontFamily(String str) {
        this.f23831z = str;
        this.f23830y = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (Objects.equals(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.f23830y = true;
    }

    public void setFontSize(float f11) {
        this.f23829x.n(f11);
        q();
    }

    public void setFontStyle(String str) {
        int iB = com.facebook.react.views.text.k.b(str);
        if (iB != this.B) {
            this.B = iB;
            this.f23830y = true;
        }
    }

    public void setFontWeight(String str) {
        int iD = com.facebook.react.views.text.k.d(str);
        if (iD != this.A) {
            this.A = iD;
            this.f23830y = true;
        }
    }

    void setGravityHorizontal(int i11) {
        if (i11 == 0) {
            i11 = this.f23813h;
        }
        setGravity(i11 | (getGravity() & (-8388616)));
    }

    void setGravityVertical(int i11) {
        if (i11 == 0) {
            i11 = this.f23814i;
        }
        setGravity(i11 | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i11) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i11);
        this.f23818m = i11;
        super.setTypeface(typeface);
        if (y()) {
            setSingleLine(false);
        }
        if (this.f23826u == null) {
            this.f23826u = new c();
        }
        this.f23826u.a(i11);
        setKeyListener(this.f23826u);
    }

    public void setLetterSpacingPt(float f11) {
        this.f23829x.p(f11);
        q();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11) {
        this.f23829x.q(i11);
    }

    public void setMaxFontSizeMultiplier(float f11) {
        if (f11 != this.f23829x.k()) {
            this.f23829x.r(f11);
            q();
        }
    }

    public void setOnKeyPress(boolean z11) {
        this.f23828w = z11;
    }

    public void setOverflow(String str) {
        if (str == null) {
            this.H = so.p.VISIBLE;
        } else {
            so.p pVarFromString = so.p.fromString(str);
            if (pVarFromString == null) {
                pVarFromString = so.p.VISIBLE;
            }
            this.H = pVarFromString;
        }
        invalidate();
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.G)) {
            return;
        }
        this.G = str;
        setHint(str);
    }

    public void setReturnKeyType(String str) {
        this.f23822q = str;
        Z();
    }

    public void setScrollWatcher(x xVar) {
        this.f23825t = xVar;
    }

    public void setSelectTextOnFocus(boolean z11) {
        super.setSelectAllOnFocus(z11);
        this.F = z11;
    }

    @Override // android.widget.EditText
    public void setSelection(int i11, int i12) {
        if (M) {
            qk.a.m(this.f23811f, "setSelection[" + getId() + "]: " + i11 + " " + i12);
        }
        super.setSelection(i11, i12);
    }

    public void setSelectionWatcher(y yVar) {
        this.f23823r = yVar;
    }

    void setStagedInputType(int i11) {
        this.f23818m = i11;
    }

    public void setStateWrapper(u0 u0Var) {
        this.I = u0Var;
    }

    public void setSubmitBehavior(String str) {
        this.f23820o = str;
    }

    public void t() {
        if (Build.VERSION.SDK_INT > 28 || !isInTouchMode()) {
            super.clearFocus();
        } else {
            ViewGroup viewGroup = (ViewGroup) getRootView();
            int descendantFocusability = viewGroup.getDescendantFocusability();
            viewGroup.setDescendantFocusability(393216);
            super.clearFocus();
            viewGroup.setDescendantFocusability(descendantFocusability);
        }
        w();
    }

    void u() {
        t();
    }

    void v() {
        if (getInputType() != this.f23818m) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f23818m);
            I(selectionStart, selectionEnd);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.f23819n) {
            Editable text = getText();
            for (ap.p pVar : (ap.p[]) text.getSpans(0, text.length(), ap.p.class)) {
                if (pVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    protected void w() {
        this.f23810e.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int x() {
        int i11 = this.f23815j + 1;
        this.f23815j = i11;
        return i11;
    }

    boolean y() {
        return (getInputType() & 131072) != 0;
    }

    public void setBorderRadius(float f11, int i11) {
        com.facebook.react.uimanager.a.r(this, so.d.values()[i11], Float.isNaN(f11) ? null : new LengthPercentage(com.facebook.react.uimanager.w.f(f11), com.facebook.react.uimanager.p.POINT));
    }
}
