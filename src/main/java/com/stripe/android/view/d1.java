package com.stripe.android.view;

import android.widget.AutoCompleteTextView;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/d1;", "Landroid/widget/AutoCompleteTextView$Validator;", "Lcom/stripe/android/view/c1;", "countryAdapter", "Lkotlin/Function1;", "Lt30/a;", "Ljn0/h0;", "onCountrySelected", "<init>", "(Lcom/stripe/android/view/c1;Lwn0/l;)V", "", "invalidText", "fixText", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "text", "", "isValid", "(Ljava/lang/CharSequence;)Z", "a", "Lcom/stripe/android/view/c1;", "b", "Lwn0/l;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d1 implements AutoCompleteTextView.Validator {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c1 countryAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<t30.a, jn0.h0> onCountrySelected;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(c1 countryAdapter, wn0.l<? super t30.a, jn0.h0> onCountrySelected) {
        p013kotlin.jvm.internal.s.k(countryAdapter, "countryAdapter");
        p013kotlin.jvm.internal.s.k(onCountrySelected, "onCountrySelected");
        this.countryAdapter = countryAdapter;
        this.onCountrySelected = onCountrySelected;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public CharSequence fixText(CharSequence invalidText) {
        return invalidText == null ? "" : invalidText;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public boolean isValid(CharSequence text) {
        Object next;
        Iterator<T> it = this.countryAdapter.e().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((t30.a) next).getName(), String.valueOf(text)));
        this.onCountrySelected.invoke((t30.a) next);
        return ((t30.a) next) != null;
    }
}
