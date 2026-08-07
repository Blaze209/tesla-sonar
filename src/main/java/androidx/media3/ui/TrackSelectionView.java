package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p7.a1;
import p7.t0;
import p7.u0;

/* JADX INFO: loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f12761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckedTextView f12762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckedTextView f12763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f12764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<a1.a> f12765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<t0, u0> f12766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ia.a0 f12769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CheckedTextView[][] f12770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f12771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Comparator<c> f12772m;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a1.a f12774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12775b;

        public c(a1.a aVar, int i11) {
            this.f12774a = aVar;
            this.f12775b = i11;
        }

        public p7.u a() {
            return this.f12774a.d(this.f12775b);
        }
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public static Map<t0, u0> b(Map<t0, u0> map, List<a1.a> list, boolean z11) {
        HashMap map2 = new HashMap();
        for (int i11 = 0; i11 < list.size(); i11++) {
            u0 u0Var = map.get(list.get(i11).c());
            if (u0Var != null && (z11 || map2.isEmpty())) {
                map2.put(u0Var.f101584a, u0Var);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f12762c) {
            e();
        } else if (view == this.f12763d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f12771l = false;
        this.f12766g.clear();
    }

    private void e() {
        this.f12771l = true;
        this.f12766g.clear();
    }

    private void f(View view) {
        this.f12771l = false;
        c cVar = (c) s7.a.f(view.getTag());
        t0 t0VarC = cVar.f12774a.c();
        int i11 = cVar.f12775b;
        u0 u0Var = this.f12766g.get(t0VarC);
        if (u0Var == null) {
            if (!this.f12768i && !this.f12766g.isEmpty()) {
                this.f12766g.clear();
            }
            this.f12766g.put(t0VarC, new u0(t0VarC, com.google.common.collect.x.s(Integer.valueOf(i11))));
            return;
        }
        ArrayList arrayList = new ArrayList(u0Var.f101585b);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f12774a);
        boolean z11 = zG || h();
        if (zIsChecked && z11) {
            arrayList.remove(Integer.valueOf(i11));
            if (arrayList.isEmpty()) {
                this.f12766g.remove(t0VarC);
                return;
            } else {
                this.f12766g.put(t0VarC, new u0(t0VarC, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f12766g.put(t0VarC, new u0(t0VarC, com.google.common.collect.x.s(Integer.valueOf(i11))));
        } else {
            arrayList.add(Integer.valueOf(i11));
            this.f12766g.put(t0VarC, new u0(t0VarC, arrayList));
        }
    }

    private boolean g(a1.a aVar) {
        return this.f12767h && aVar.g();
    }

    private boolean h() {
        return this.f12768i && this.f12765f.size() > 1;
    }

    private void i() {
        this.f12762c.setChecked(this.f12771l);
        this.f12763d.setChecked(!this.f12771l && this.f12766g.isEmpty());
        for (int i11 = 0; i11 < this.f12770k.length; i11++) {
            u0 u0Var = this.f12766g.get(this.f12765f.get(i11).c());
            int i12 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f12770k[i11];
                if (i12 < checkedTextViewArr.length) {
                    if (u0Var != null) {
                        this.f12770k[i11][i12].setChecked(u0Var.f101585b.contains(Integer.valueOf(((c) s7.a.f(checkedTextViewArr[i12].getTag())).f12775b)));
                    } else {
                        checkedTextViewArr[i12].setChecked(false);
                    }
                    i12++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f12765f.isEmpty()) {
            this.f12762c.setEnabled(false);
            this.f12763d.setEnabled(false);
            return;
        }
        this.f12762c.setEnabled(true);
        this.f12763d.setEnabled(true);
        this.f12770k = new CheckedTextView[this.f12765f.size()][];
        boolean zH = h();
        for (int i11 = 0; i11 < this.f12765f.size(); i11++) {
            a1.a aVar = this.f12765f.get(i11);
            boolean zG = g(aVar);
            CheckedTextView[][] checkedTextViewArr = this.f12770k;
            int i12 = aVar.f101190a;
            checkedTextViewArr[i11] = new CheckedTextView[i12];
            c[] cVarArr = new c[i12];
            for (int i13 = 0; i13 < aVar.f101190a; i13++) {
                cVarArr[i13] = new c(aVar, i13);
            }
            Comparator<c> comparator = this.f12772m;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                if (i14 == 0) {
                    addView(this.f12761b.inflate(ia.v.f77259b, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f12761b.inflate((zG || zH) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f12760a);
                checkedTextView.setText(this.f12769j.a(cVarArr[i14].a()));
                checkedTextView.setTag(cVarArr[i14]);
                if (aVar.k(i14)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f12764e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f12770k[i11][i14] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f12771l;
    }

    public Map<t0, u0> getOverrides() {
        return this.f12766g;
    }

    public void setAllowAdaptiveSelections(boolean z11) {
        if (this.f12767h != z11) {
            this.f12767h = z11;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z11) {
        if (this.f12768i != z11) {
            this.f12768i = z11;
            if (!z11 && this.f12766g.size() > 1) {
                Map<t0, u0> mapB = b(this.f12766g, this.f12765f, false);
                this.f12766g.clear();
                this.f12766g.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z11) {
        this.f12762c.setVisibility(z11 ? 0 : 8);
    }

    public void setTrackNameProvider(ia.a0 a0Var) {
        this.f12769j = (ia.a0) s7.a.f(a0Var);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f12760a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f12761b = layoutInflaterFrom;
        b bVar = new b();
        this.f12764e = bVar;
        this.f12769j = new ia.d(getResources());
        this.f12765f = new ArrayList();
        this.f12766g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f12762c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(ia.x.f77290x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(ia.v.f77259b, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f12763d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(ia.x.f77289w);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
