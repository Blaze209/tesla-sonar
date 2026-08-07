package kf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kf.m;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lkf/k;", "Lkf/m;", "T", "Landroid/widget/BaseAdapter;", "Landroid/widget/Filterable;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "getCount", "()I", "position", "a", "(I)Lkf/m;", "", "getItemId", "(I)J", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "Landroid/content/Context;", "", "b", "Ljava/util/List;", "itemList", "Lkf/l;", "c", "Lkf/l;", "simpleTextListFilter", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k<T extends m> extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<T> itemList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l simpleTextListFilter;

    public k(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        this.context = context;
        ArrayList arrayList = new ArrayList();
        this.itemList = arrayList;
        this.simpleTextListFilter = new l(arrayList);
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T getItem(int position) {
        return this.itemList.get(position);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.itemList.size();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.simpleTextListFilter;
    }

    @Override // android.widget.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        n nVar;
        if (convertView == null) {
            hf.c cVarC = hf.c.c(LayoutInflater.from(this.context), parent, false);
            p013kotlin.jvm.internal.s.j(cVarC, "inflate(...)");
            LinearLayout root = cVarC.getRoot();
            p013kotlin.jvm.internal.s.j(root, "getRoot(...)");
            nVar = new n(cVarC);
            root.setTag(nVar);
            convertView = root;
        } else {
            Object tag = convertView.getTag();
            p013kotlin.jvm.internal.s.i(tag, "null cannot be cast to non-null type com.adyen.checkout.ui.core.internal.ui.SimpleTextViewHolder");
            nVar = (n) tag;
        }
        nVar.a(getItem(position));
        return convertView;
    }
}
