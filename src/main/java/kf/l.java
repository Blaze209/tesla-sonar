package kf;

import android.widget.Filter;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkf/l;", "Landroid/widget/Filter;", "", "Lkf/m;", "itemList", "<init>", "(Ljava/util/List;)V", "", "constraint", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "results", "Ljn0/h0;", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "", "resultValue", "convertResultToString", "(Ljava/lang/Object;)Ljava/lang/CharSequence;", "a", "Ljava/util/List;", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<m> itemList;

    /* JADX WARN: Multi-variable type inference failed */
    public l(List<? extends m> itemList) {
        p013kotlin.jvm.internal.s.k(itemList, "itemList");
        this.itemList = itemList;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object resultValue) {
        m mVar = resultValue instanceof m ? (m) resultValue : null;
        String text = mVar != null ? mVar.getText() : null;
        return text == null ? "" : text;
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence constraint) {
        Filter.FilterResults filterResults = new Filter.FilterResults();
        List<m> list = this.itemList;
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence constraint, Filter.FilterResults results) {
    }
}
