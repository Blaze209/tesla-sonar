package si0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import oi0.Option;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import ri0.q;
import ui0.e0;
import yh0.b0;
import yh0.c0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R.\u00104\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001c\u00108\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00107R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020\u0006098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010:R\"\u0010>\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u00010\u00060\u00060<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010=R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010?¨\u0006A"}, d2 = {"Lsi0/n;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Loi0/e4;", "options", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "styles", "", "canSelectMultipleValues", "initialSelectedOptions", "Lkotlin/Function1;", "Ljn0/h0;", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;ZLjava/util/List;Lwn0/l;)V", "", "position", "f", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$g0;", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$g0;I)V", "h", "()V", "a", "Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "Lwn0/l;", "getOnClick", "()Lwn0/l;", "", "value", "e", "Ljava/lang/String;", "getQuery", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", SearchIntents.EXTRA_QUERY, "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "inflater", "", "Ljava/util/Set;", "_selectedValues", "Landroidx/recyclerview/widget/d;", "Landroidx/recyclerview/widget/d;", "asyncListDiffer", "()Ljava/util/List;", "selectedOptions", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Option> options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InputSelectBoxComponentStyle styles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean canSelectMultipleValues;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Option, h0> onClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String query;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final LayoutInflater inflater;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Set<Option> _selectedValues;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final androidx.recyclerview.widget.d<Option> asyncListDiffer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lsi0/n$a;", "Landroidx/recyclerview/widget/h$f;", "Loi0/e4;", "<init>", "()V", "oldItem", "newItem", "", "b", "(Loi0/e4;Loi0/e4;)Z", "a", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a extends androidx.recyclerview.widget.h.f<Option> {
        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(Option oldItem, Option newItem) {
            s.k(oldItem, "oldItem");
            s.k(newItem, "newItem");
            return s.f(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(Option oldItem, Option newItem) {
            s.k(oldItem, "oldItem");
            s.k(newItem, "newItem");
            return s.f(oldItem, newItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(Context context, List<Option> options, InputSelectBoxComponentStyle inputSelectBoxComponentStyle, boolean z11, List<Option> initialSelectedOptions, wn0.l<? super Option, h0> onClick) {
        s.k(context, "context");
        s.k(options, "options");
        s.k(initialSelectedOptions, "initialSelectedOptions");
        s.k(onClick, "onClick");
        this.options = options;
        this.styles = inputSelectBoxComponentStyle;
        this.canSelectMultipleValues = z11;
        this.onClick = onClick;
        this.inflater = LayoutInflater.from(context);
        this.asyncListDiffer = new androidx.recyclerview.widget.d<>(this, new a());
        List<Option> list = options;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Option) it.next()).getValue());
        }
        Set setR1 = v.r1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : initialSelectedOptions) {
            if (setR1.contains(((Option) obj).getValue())) {
                arrayList2.add(obj);
            }
        }
        this._selectedValues = v.q1(arrayList2);
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(n nVar, RecyclerView.g0 g0Var, View view) {
        nVar.f(g0Var.getAdapterPosition());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(n nVar, RecyclerView.g0 g0Var, View view) {
        nVar.f(g0Var.getAdapterPosition());
    }

    private final void f(int position) {
        if (!this.canSelectMultipleValues) {
            this._selectedValues.clear();
        }
        Option option = this.asyncListDiffer.b().get(position);
        if (this._selectedValues.contains(option)) {
            this._selectedValues.remove(option);
        } else {
            Set<Option> set = this._selectedValues;
            s.h(option);
            set.add(option);
        }
        notifyItemChanged(position);
        wn0.l<Option, h0> lVar = this.onClick;
        s.h(option);
        lVar.invoke(option);
    }

    public final List<Option> c() {
        return v.m1(this._selectedValues);
    }

    public final void g(String str) {
        this.query = str;
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.asyncListDiffer.b().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void h() {
        Collection arrayList;
        String str = this.query;
        if (str == null || t.y0(str)) {
            arrayList = this.options;
        } else {
            List<Option> list = this.options;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (t.f0(((Option) obj).getText(), str, true)) {
                    arrayList.add(obj);
                }
            }
        }
        this.asyncListDiffer.e(arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(final RecyclerView.g0 holder, int position) {
        Integer focusedBackgroundColorValue;
        s.k(holder, "holder");
        Option option = this.asyncListDiffer.b().get(position);
        q qVar = (q) c0.a(holder);
        qVar.f108385c.setText(option.getText());
        qVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: si0.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.d(this.f111270a, holder, view);
            }
        });
        qVar.f108384b.setOnClickListener(new View.OnClickListener() { // from class: si0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.e(this.f111272a, holder, view);
            }
        });
        boolean zContains = this._selectedValues.contains(option);
        qVar.f108384b.setChecked(zContains);
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle == null || (focusedBackgroundColorValue = inputSelectBoxComponentStyle.getFocusedBackgroundColorValue()) == null) {
            return;
        }
        int iIntValue = focusedBackgroundColorValue.intValue();
        if (this.canSelectMultipleValues) {
            return;
        }
        if (zContains) {
            qVar.getRoot().setBackgroundColor(iIntValue);
            return;
        }
        TypedValue typedValue = new TypedValue();
        qVar.getRoot().getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        qVar.getRoot().setBackgroundResource(typedValue.resourceId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public RecyclerView.g0 onCreateViewHolder(ViewGroup parent, int viewType) {
        s.k(parent, "parent");
        q qVarC = q.c(this.inflater, parent, false);
        s.j(qVarC, "inflate(...)");
        b0 b0Var = new b0(qVarC);
        gb.a aVarA = b0Var.a();
        s.j(aVarA, "<get-binding>(...)");
        q qVar = (q) aVarA;
        InputSelectBoxComponentStyle inputSelectBoxComponentStyle = this.styles;
        if (inputSelectBoxComponentStyle != null) {
            TextView label = qVar.f108385c;
            s.j(label, "label");
            e0.n(label, inputSelectBoxComponentStyle.getTextBasedStyle(), null, 2, null);
        }
        if (!this.canSelectMultipleValues) {
            qVar.f108384b.setVisibility(8);
            return b0Var;
        }
        qVar.f108384b.setVisibility(0);
        qVar.f108384b.setButtonTintList(ColorStateList.valueOf(qVar.f108385c.getCurrentTextColor()));
        return b0Var;
    }
}
