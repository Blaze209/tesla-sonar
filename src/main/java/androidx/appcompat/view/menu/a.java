package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f2237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f2238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f2239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected LayoutInflater f2240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected LayoutInflater f2241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private j.a f2242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f2244h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected k f2245i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2246j;

    public a(Context context, int i11, int i12) {
        this.f2237a = context;
        this.f2240d = LayoutInflater.from(context);
        this.f2243g = i11;
        this.f2244h = i12;
    }

    protected void a(View view, int i11) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2245i).addView(view, i11);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z11) {
        j.a aVar = this.f2242f;
        if (aVar != null) {
            aVar.b(eVar, z11);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean c(e eVar, g gVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.j
    public void e(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) this.f2245i;
        if (viewGroup == null) {
            return;
        }
        e eVar = this.f2239c;
        int i11 = 0;
        if (eVar != null) {
            eVar.t();
            ArrayList<g> arrayListG = this.f2239c.G();
            int size = arrayListG.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                g gVar = arrayListG.get(i13);
                if (s(i12, gVar)) {
                    View childAt = viewGroup.getChildAt(i12);
                    g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                    View viewP = p(gVar, childAt, viewGroup);
                    if (gVar != itemData) {
                        viewP.setPressed(false);
                        viewP.jumpDrawablesToCurrentState();
                    }
                    if (viewP != childAt) {
                        a(viewP, i12);
                    }
                    i12++;
                }
            }
            i11 = i12;
        }
        while (i11 < viewGroup.getChildCount()) {
            if (!n(viewGroup, i11)) {
                i11++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public int getId() {
        return this.f2246j;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(Context context, e eVar) {
        this.f2238b = context;
        this.f2241e = LayoutInflater.from(context);
        this.f2239c = eVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(j.a aVar) {
        this.f2242f = aVar;
    }

    public abstract void j(g gVar, k.a aVar);

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.j
    public boolean l(m mVar) {
        j.a aVar = this.f2242f;
        e eVar = mVar;
        if (aVar == null) {
            return false;
        }
        if (mVar == null) {
            eVar = this.f2239c;
        }
        return aVar.c(eVar);
    }

    public k.a m(ViewGroup viewGroup) {
        return (k.a) this.f2240d.inflate(this.f2244h, viewGroup, false);
    }

    protected boolean n(ViewGroup viewGroup, int i11) {
        viewGroup.removeViewAt(i11);
        return true;
    }

    public j.a o() {
        return this.f2242f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View p(g gVar, View view, ViewGroup viewGroup) {
        k.a aVarM = view instanceof k.a ? (k.a) view : m(viewGroup);
        j(gVar, aVarM);
        return (View) aVarM;
    }

    public k q(ViewGroup viewGroup) {
        if (this.f2245i == null) {
            k kVar = (k) this.f2240d.inflate(this.f2243g, viewGroup, false);
            this.f2245i = kVar;
            kVar.a(this.f2239c);
            e(true);
        }
        return this.f2245i;
    }

    public void r(int i11) {
        this.f2246j = i11;
    }

    public abstract boolean s(int i11, g gVar);
}
