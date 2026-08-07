package ni0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import ui0.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lni0/a;", "Landroid/widget/ArrayAdapter;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "resource", "", "objects", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textStyle", "<init>", "(Landroid/content/Context;ILjava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends ArrayAdapter<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> objects;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextBasedComponentStyle textStyle;

    /* JADX INFO: renamed from: ni0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lni0/a$a;", "Landroid/widget/Filter;", "<init>", "(Lni0/a;)V", "", "arg0", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "arg1", "Ljn0/h0;", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class C2024a extends Filter {
        public C2024a() {
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence arg0) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = a.this.a();
            filterResults.count = a.this.a().size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence arg0, Filter.FilterResults arg1) {
            a.this.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i11, List<String> objects, TextBasedComponentStyle textBasedComponentStyle) {
        super(context, i11, objects);
        s.k(context, "context");
        s.k(objects, "objects");
        this.objects = objects;
        this.textStyle = textBasedComponentStyle;
    }

    public final List<String> a() {
        return this.objects;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return new C2024a();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        s.k(parent, "parent");
        View view = super.getView(position, convertView, parent);
        s.j(view, "getView(...)");
        TextBasedComponentStyle textBasedComponentStyle = this.textStyle;
        if (textBasedComponentStyle != null) {
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                e0.n(textView, textBasedComponentStyle, null, 2, null);
            }
        }
        return view;
    }
}
