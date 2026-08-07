package com.facebook.react.views.textinput;

import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import com.facebook.react.uimanager.h1;
import com.facebook.react.uimanager.v0;

/* JADX INFO: loaded from: classes4.dex */
public class v extends com.facebook.react.views.text.c implements com.facebook.yoga.o {
    private int B;
    private EditText C;
    private r D;
    private String E;
    private String F;

    public v(com.facebook.react.views.text.j jVar) {
        super(jVar);
        this.B = -1;
        this.E = null;
        this.F = null;
        this.f23667j = 1;
        g();
    }

    private void g() {
        setMeasureFunction(this);
    }

    @Override // com.facebook.yoga.o
    public long a(com.facebook.yoga.r rVar, float f11, com.facebook.yoga.p pVar, float f12, com.facebook.yoga.p pVar2) {
        EditText editText = (EditText) gn.a.c(this.C);
        r rVar2 = this.D;
        if (rVar2 != null) {
            rVar2.a(editText);
        } else {
            editText.setTextSize(0, this.f23658a.c());
            int i11 = this.f23665h;
            if (i11 != -1) {
                editText.setLines(i11);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i12 = this.f23667j;
            if (breakStrategy != i12) {
                editText.setBreakStrategy(i12);
            }
        }
        editText.setHint(e());
        editText.measure(com.facebook.react.views.view.c.a(f11, pVar), com.facebook.react.views.view.c.a(f12, pVar2));
        return com.facebook.yoga.q.b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    protected EditText d() {
        return new EditText(new n.c(getThemedContext(), com.facebook.react.q.f22917g));
    }

    public String e() {
        return this.F;
    }

    public String f() {
        return this.E;
    }

    @Override // com.facebook.react.uimanager.j0
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.j0
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.react.uimanager.j0
    public void onCollectExtraUpdates(h1 h1Var) {
        super.onCollectExtraUpdates(h1Var);
        if (this.B != -1) {
            h1Var.O(getReactTag(), new com.facebook.react.views.text.g(c(this, f(), false, null), this.B, this.f23683z, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.f23666i, this.f23667j, this.f23669l));
        }
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void setLocalData(Object obj) {
        gn.a.a(obj instanceof r);
        this.D = (r) obj;
        dirty();
    }

    @no.a(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i11) {
        this.B = i11;
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void setPadding(int i11, float f11) {
        super.setPadding(i11, f11);
        markUpdated();
    }

    @no.a(name = "placeholder")
    public void setPlaceholder(String str) {
        this.F = str;
        markUpdated();
    }

    @no.a(name = "text")
    public void setText(String str) {
        this.E = str;
        markUpdated();
    }

    @Override // com.facebook.react.views.text.c
    public void setTextBreakStrategy(String str) {
        if (str == null || "simple".equals(str)) {
            this.f23667j = 0;
            return;
        }
        if ("highQuality".equals(str)) {
            this.f23667j = 1;
            return;
        }
        if ("balanced".equals(str)) {
            this.f23667j = 2;
            return;
        }
        qk.a.I("ReactNative", "Invalid textBreakStrategy: " + str);
        this.f23667j = 0;
    }

    @Override // com.facebook.react.uimanager.j0, com.facebook.react.uimanager.i0
    public void setThemedContext(v0 v0Var) {
        super.setThemedContext(v0Var);
        EditText editTextD = d();
        setDefaultPadding(4, ViewCompat.F(editTextD));
        setDefaultPadding(1, editTextD.getPaddingTop());
        setDefaultPadding(5, ViewCompat.E(editTextD));
        setDefaultPadding(3, editTextD.getPaddingBottom());
        this.C = editTextD;
        editTextD.setPadding(0, 0, 0, 0);
        this.C.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public v() {
        this(null);
    }
}
