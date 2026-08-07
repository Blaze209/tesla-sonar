package com.adyen.checkout.ui.core.internal.ui.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.ui.core.internal.ui.view.AddressFormInput;
import com.google.android.material.textfield.TextInputLayout;
import gf.f;
import gf.g;
import kf.k;
import lf.AddressListItem;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0016\u0010'\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010 R\u0016\u0010)\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0016\u0010+\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0016\u0010/\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0016\u00103\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0016\u00105\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0016\u00107\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0016\u00109\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u0010.R\u0016\u0010;\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010.R\u0016\u0010=\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010.¨\u0006>"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/view/AddressFormInput;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkf/k;", "Llf/a;", "a", "Lkf/k;", "countryAdapter", "b", "statesAdapter", "Landroid/widget/TextView;", "getTextViewHeader", "()Landroid/widget/TextView;", "textViewHeader", "getFormContainer", "()Landroid/widget/LinearLayout;", "formContainer", "Landroid/widget/AutoCompleteTextView;", "getAutoCompleteTextViewCountry", "()Landroid/widget/AutoCompleteTextView;", "autoCompleteTextViewCountry", "getAutoCompleteTextViewState", "autoCompleteTextViewState", "Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "getEditTextStreet", "()Lcom/adyen/checkout/ui/core/internal/ui/view/AdyenTextInputEditText;", "editTextStreet", "getEditTextHouseNumber", "editTextHouseNumber", "getEditTextApartmentSuite", "editTextApartmentSuite", "getEditTextPostalCode", "editTextPostalCode", "getEditTextCity", "editTextCity", "getEditTextProvinceTerritory", "editTextProvinceTerritory", "Lcom/google/android/material/textfield/TextInputLayout;", "getTextInputLayoutCountry", "()Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayoutCountry", "getTextInputLayoutStreet", "textInputLayoutStreet", "getTextInputLayoutHouseNumber", "textInputLayoutHouseNumber", "getTextInputLayoutApartmentSuite", "textInputLayoutApartmentSuite", "getTextInputLayoutPostalCode", "textInputLayoutPostalCode", "getTextInputLayoutCity", "textInputLayoutCity", "getTextInputLayoutProvinceTerritory", "textInputLayoutProvinceTerritory", "getTextInputLayoutState", "textInputLayoutState", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AddressFormInput extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private k<AddressListItem> countryAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private k<AddressListItem> statesAdapter;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressFormInput(Context context) {
        this(context, null, 0, 6, null);
        s.k(context, "context");
    }

    public static void a(AddressFormInput this$0, AdapterView adapterView, View view, int i11, long j11) {
        s.k(this$0, "this$0");
        ((AddressListItem) this$0.countryAdapter.getItem(i11)).getCode();
        s.B("delegate");
        throw null;
    }

    private final AutoCompleteTextView getAutoCompleteTextViewCountry() {
        View viewFindViewById = getRootView().findViewById(f.f68800a);
        s.j(viewFindViewById, "findViewById(...)");
        return (AutoCompleteTextView) viewFindViewById;
    }

    private final AutoCompleteTextView getAutoCompleteTextViewState() {
        return (AutoCompleteTextView) getRootView().findViewById(f.f68801b);
    }

    private final AdyenTextInputEditText getEditTextApartmentSuite() {
        return (AdyenTextInputEditText) getRootView().findViewById(f.f68803d);
    }

    private final AdyenTextInputEditText getEditTextCity() {
        return (AdyenTextInputEditText) getRootView().findViewById(f.f68804e);
    }

    private final AdyenTextInputEditText getEditTextHouseNumber() {
        return (AdyenTextInputEditText) getRootView().findViewById(f.f68805f);
    }

    private final AdyenTextInputEditText getEditTextPostalCode() {
        return (AdyenTextInputEditText) getFormContainer().findViewById(f.f68806g);
    }

    private final AdyenTextInputEditText getEditTextProvinceTerritory() {
        return (AdyenTextInputEditText) getRootView().findViewById(f.f68807h);
    }

    private final AdyenTextInputEditText getEditTextStreet() {
        return (AdyenTextInputEditText) getRootView().findViewById(f.f68808i);
    }

    private final LinearLayout getFormContainer() {
        View viewFindViewById = getRootView().findViewById(f.f68811l);
        s.j(viewFindViewById, "findViewById(...)");
        return (LinearLayout) viewFindViewById;
    }

    private final TextInputLayout getTextInputLayoutApartmentSuite() {
        return (TextInputLayout) getRootView().findViewById(f.f68814o);
    }

    private final TextInputLayout getTextInputLayoutCity() {
        return (TextInputLayout) getRootView().findViewById(f.f68815p);
    }

    private final TextInputLayout getTextInputLayoutCountry() {
        return (TextInputLayout) getRootView().findViewById(f.f68816q);
    }

    private final TextInputLayout getTextInputLayoutHouseNumber() {
        return (TextInputLayout) getRootView().findViewById(f.f68817r);
    }

    private final TextInputLayout getTextInputLayoutPostalCode() {
        return (TextInputLayout) getFormContainer().findViewById(f.f68818s);
    }

    private final TextInputLayout getTextInputLayoutProvinceTerritory() {
        return (TextInputLayout) getRootView().findViewById(f.f68819t);
    }

    private final TextInputLayout getTextInputLayoutState() {
        return (TextInputLayout) getRootView().findViewById(f.f68820u);
    }

    private final TextInputLayout getTextInputLayoutStreet() {
        return (TextInputLayout) getRootView().findViewById(f.f68821v);
    }

    private final TextView getTextViewHeader() {
        View viewFindViewById = getRootView().findViewById(f.f68822w);
        s.j(viewFindViewById, "findViewById(...)");
        return (TextView) viewFindViewById;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddressFormInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.k(context, "context");
    }

    public /* synthetic */ AddressFormInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressFormInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.k(context, "context");
        this.countryAdapter = new k<>(context);
        this.statesAdapter = new k<>(context);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LayoutInflater.from(context).inflate(g.f68826a, (ViewGroup) this, true);
        AutoCompleteTextView autoCompleteTextViewCountry = getAutoCompleteTextViewCountry();
        if (Build.VERSION.SDK_INT >= 26) {
            autoCompleteTextViewCountry.setAutofillHints(new String[]{"addressCountry"});
        }
        autoCompleteTextViewCountry.setInputType(0);
        autoCompleteTextViewCountry.setAdapter(this.countryAdapter);
        autoCompleteTextViewCountry.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: mf.a
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i12, long j11) {
                AddressFormInput.a(this.f92044a, adapterView, view, i12, j11);
            }
        });
    }
}
