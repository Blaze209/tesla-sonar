package com.stripe.android.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p013kotlin.Metadata;
import t30.CountryCode;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010&\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0000¢\u0006\u0004\b&\u0010'R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0014\u00105\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u00104¨\u00066"}, d2 = {"Lcom/stripe/android/view/c1;", "Landroid/widget/ArrayAdapter;", "Lt30/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "unfilteredCountries", "", "itemLayoutId", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "Landroid/widget/TextView;", "textViewFactory", "<init>", "(Landroid/content/Context;Ljava/util/List;ILwn0/l;)V", "getCount", "()I", IntegerTokenConverter.CONVERTER_KEY, "c", "(I)Lt30/a;", "item", DateTokenConverter.CONVERTER_KEY, "(Lt30/a;)I", "", "getItemId", "(I)J", "Landroid/view/View;", "view", "viewGroup", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "", "", "allowedCountryCodes", "", "f", "(Ljava/util/Set;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "setUnfilteredCountries$payments_core_release", "(Ljava/util/List;)V", "b", "Lwn0/l;", "Lcom/stripe/android/view/c1$a;", "Lcom/stripe/android/view/c1$a;", "countryFilter", "suggestions", "()Lt30/a;", "firstItem", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c1 extends ArrayAdapter<t30.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<t30.a> unfilteredCountries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<ViewGroup, TextView> textViewFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a countryFilter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<t30.a> suggestions;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$¨\u0006&"}, d2 = {"Lcom/stripe/android/view/c1$a;", "Landroid/widget/Filter;", "", "Lt30/a;", "unfilteredCountries", "Lcom/stripe/android/view/c1;", "adapter", "Landroid/app/Activity;", "activity", "<init>", "(Ljava/util/List;Lcom/stripe/android/view/c1;Landroid/app/Activity;)V", "", "constraint", "a", "(Ljava/lang/CharSequence;)Ljava/util/List;", "b", "countries", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/lang/CharSequence;)Z", "Ljn0/h0;", "c", "(Landroid/app/Activity;)V", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "filterResults", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "Ljava/util/List;", "getUnfilteredCountries", "()Ljava/util/List;", "e", "(Ljava/util/List;)V", "Lcom/stripe/android/view/c1;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "activityRef", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a extends Filter {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private List<t30.a> unfilteredCountries;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final c1 adapter;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final WeakReference<Activity> activityRef;

        public a(List<t30.a> unfilteredCountries, c1 adapter, Activity activity) {
            p013kotlin.jvm.internal.s.k(unfilteredCountries, "unfilteredCountries");
            p013kotlin.jvm.internal.s.k(adapter, "adapter");
            this.unfilteredCountries = unfilteredCountries;
            this.adapter = adapter;
            this.activityRef = new WeakReference<>(activity);
        }

        private final List<t30.a> a(CharSequence constraint) {
            List<t30.a> listB = b(constraint);
            return (listB.isEmpty() || d(listB, constraint)) ? this.unfilteredCountries : listB;
        }

        private final List<t30.a> b(CharSequence constraint) {
            List<t30.a> list = this.unfilteredCountries;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String name = ((t30.a) obj).getName();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
                String lowerCase2 = String.valueOf(constraint).toLowerCase(locale);
                p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
                if (p013kotlin.text.t.b0(lowerCase, lowerCase2, false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        private final void c(Activity activity) {
            Object systemService = activity.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager == null || !inputMethodManager.isAcceptingText()) {
                return;
            }
            View currentFocus = activity.getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
        }

        private final boolean d(List<t30.a> countries, CharSequence constraint) {
            return countries.size() == 1 && p013kotlin.jvm.internal.s.f(countries.get(0).getName(), String.valueOf(constraint));
        }

        public final void e(List<t30.a> list) {
            p013kotlin.jvm.internal.s.k(list, "<set-?>");
            this.unfilteredCountries = list;
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence constraint) {
            List<t30.a> listA;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (constraint == null || (listA = a(constraint)) == null) {
                listA = this.unfilteredCountries;
            }
            filterResults.values = listA;
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence constraint, Filter.FilterResults filterResults) {
            Object obj = filterResults != null ? filterResults.values : null;
            p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<com.stripe.android.core.model.Country>");
            List list = (List) obj;
            Activity activity = this.activityRef.get();
            if (activity != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (p013kotlin.jvm.internal.s.f(((t30.a) it.next()).getName(), constraint)) {
                            c(activity);
                            break;
                        }
                    }
                }
            }
            this.adapter.suggestions = list;
            this.adapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1(Context context, List<t30.a> unfilteredCountries, int i11, wn0.l<? super ViewGroup, ? extends TextView> textViewFactory) {
        super(context, i11);
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(unfilteredCountries, "unfilteredCountries");
        p013kotlin.jvm.internal.s.k(textViewFactory, "textViewFactory");
        this.unfilteredCountries = unfilteredCountries;
        this.textViewFactory = textViewFactory;
        this.countryFilter = new a(this.unfilteredCountries, this, context instanceof Activity ? (Activity) context : null);
        this.suggestions = this.unfilteredCountries;
    }

    public final /* synthetic */ t30.a b() {
        return getItem(0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public t30.a getItem(int i11) {
        return this.suggestions.get(i11);
    }

    @Override // android.widget.ArrayAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int getPosition(t30.a item) {
        return p013kotlin.collections.v.t0(this.suggestions, item);
    }

    public final List<t30.a> e() {
        return this.unfilteredCountries;
    }

    public final boolean f(Set<String> allowedCountryCodes) {
        p013kotlin.jvm.internal.s.k(allowedCountryCodes, "allowedCountryCodes");
        if (allowedCountryCodes.isEmpty()) {
            return false;
        }
        List<t30.a> list = this.unfilteredCountries;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CountryCode code = ((t30.a) obj).getCode();
            Set<String> set = allowedCountryCodes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (p013kotlin.text.t.M((String) it.next(), code.getValue(), true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        this.unfilteredCountries = arrayList;
        this.countryFilter.e(arrayList);
        this.suggestions = this.unfilteredCountries;
        notifyDataSetChanged();
        return true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.suggestions.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        return this.countryFilter;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i11) {
        return getItem(i11).hashCode();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        p013kotlin.jvm.internal.s.k(viewGroup, "viewGroup");
        TextView textViewInvoke = view instanceof TextView ? (TextView) view : this.textViewFactory.invoke(viewGroup);
        textViewInvoke.setText(getItem(i11).getName());
        return textViewInvoke;
    }
}
