package com.content.addresssheet;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.content.utils.PaymentSheetAppearanceException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.paymentsheet.y;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p017o70.AddressDetails;
import s10.e;
import s10.i;
import wn0.p;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u0015J\u001b\u0010\u001d\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001b¢\u0006\u0004\b#\u0010\"J\u0015\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001b¢\u0006\u0004\b%\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010)R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00100R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010:\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00107R\u0018\u0010<\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00104R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/d;", "Landroid/widget/FrameLayout;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Lcom/facebook/react/bridge/WritableMap;", "params", "Ljn0/h0;", "e", "(Lcom/facebook/react/bridge/WritableMap;)V", DateTokenConverter.CONVERTER_KEY, "b", "()V", "", "newVisibility", "setVisible", "(Z)V", "Lcom/facebook/react/bridge/ReadableMap;", "appearanceParams", "setAppearance", "(Lcom/facebook/react/bridge/ReadableMap;)V", "defaults", "setDefaultValues", "fields", "setAdditionalFields", "", "", "countries", "setAllowedCountries", "(Ljava/util/List;)V", "setAutocompleteCountries", "title", "setPrimaryButtonTitle", "(Ljava/lang/String;)V", "setSheetTitle", Action.KEY_ATTRIBUTE, "setGooglePlacesApiKey", "a", "Lcom/facebook/react/uimanager/v0;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "c", "Z", "isVisible", "Lcom/facebook/react/bridge/ReadableMap;", "Lo70/a;", "Lo70/a;", "defaultAddress", "", "f", "Ljava/util/Set;", "allowedCountries", "g", "Ljava/lang/String;", "buttonTitle", "h", "sheetTitle", IntegerTokenConverter.CONVERTER_KEY, "googlePlacesApiKey", "j", "autocompleteCountries", "Lcom/stripe/android/paymentsheet/addresselement/d$a;", "k", "Lcom/stripe/android/paymentsheet/addresselement/d$a;", "additionalFields", "l", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends FrameLayout {

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private EventDispatcher eventDispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isVisible;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ReadableMap appearanceParams;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private AddressDetails defaultAddress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Set<String> allowedCountries;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String buttonTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String sheetTitle;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String googlePlacesApiKey;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Set<String> autocompleteCountries;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private com.stripe.android.paymentsheet.addresselement.d.AdditionalFieldsConfiguration additionalFields;

    /* JADX INFO: renamed from: com.reactnativestripesdk.addresssheet.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/reactnativestripesdk/addresssheet/d$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lo70/a;", "c", "(Landroid/os/Bundle;)Lo70/a;", "Lcom/facebook/react/bridge/ReadableMap;", "map", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/bridge/ReadableMap;)Lo70/a;", "Lcom/stripe/android/paymentsheet/y$a;", "b", "(Landroid/os/Bundle;)Lcom/stripe/android/paymentsheet/y$a;", "", Action.KEY_ATTRIBUTE, "Lcom/stripe/android/paymentsheet/addresselement/d$a$b;", "f", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/addresselement/d$a$b;", "params", "Lcom/stripe/android/paymentsheet/addresselement/d$a;", "a", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/paymentsheet/addresselement/d$a;", "addressDetails", "Lcom/facebook/react/bridge/WritableMap;", "e", "(Lo70/a;)Lcom/facebook/react/bridge/WritableMap;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.stripe.android.paymentsheet.addresselement.d.AdditionalFieldsConfiguration a(ReadableMap params) {
            s.k(params, "params");
            return new com.stripe.android.paymentsheet.addresselement.d.AdditionalFieldsConfiguration(f(params.getString("phoneNumber")), params.getString("checkboxLabel"));
        }

        public final y.Address b(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return new y.Address(bundle.getString("city"), bundle.getString(PlaceTypes.COUNTRY), bundle.getString("line1"), bundle.getString("line2"), bundle.getString("postalCode"), bundle.getString("state"));
        }

        public final AddressDetails c(Bundle bundle) {
            s.k(bundle, "bundle");
            return new AddressDetails(bundle.getString("name"), b(bundle.getBundle(PlaceTypes.ADDRESS)), bundle.getString("phone"), Boolean.valueOf(bundle.getBoolean("isCheckboxSelected")));
        }

        public final AddressDetails d(ReadableMap map) {
            s.k(map, "map");
            return c(i.V(map));
        }

        public final WritableMap e(AddressDetails addressDetails) {
            s.k(addressDetails, "addressDetails");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putString("name", addressDetails.getName());
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            y.Address address = addressDetails.getAddress();
            writableNativeMap2.putString("city", address != null ? address.getCity() : null);
            y.Address address2 = addressDetails.getAddress();
            writableNativeMap2.putString(PlaceTypes.COUNTRY, address2 != null ? address2.getCountry() : null);
            y.Address address3 = addressDetails.getAddress();
            writableNativeMap2.putString("line1", address3 != null ? address3.getLine1() : null);
            y.Address address4 = addressDetails.getAddress();
            writableNativeMap2.putString("line2", address4 != null ? address4.getLine2() : null);
            y.Address address5 = addressDetails.getAddress();
            writableNativeMap2.putString("postalCode", address5 != null ? address5.getPostalCode() : null);
            y.Address address6 = addressDetails.getAddress();
            writableNativeMap2.putString("state", address6 != null ? address6.getState() : null);
            writableNativeMap.putMap(PlaceTypes.ADDRESS, writableNativeMap2);
            writableNativeMap.putString("phone", addressDetails.getPhoneNumber());
            Boolean isCheckboxSelected = addressDetails.getIsCheckboxSelected();
            writableNativeMap.putBoolean("isCheckboxSelected", isCheckboxSelected != null ? isCheckboxSelected.booleanValue() : false);
            return writableNativeMap;
        }

        public final com.stripe.android.paymentsheet.addresselement.d.AdditionalFieldsConfiguration.b f(String key) {
            if (key != null) {
                int iHashCode = key.hashCode();
                if (iHashCode != -1217487446) {
                    if (iHashCode != -393139297) {
                        if (iHashCode == -79017120 && key.equals("optional")) {
                            return com.stripe.android.paymentsheet.addresselement.d.AdditionalFieldsConfiguration.b.OPTIONAL;
                        }
                    } else if (key.equals("required")) {
                        return com.stripe.android.paymentsheet.addresselement.d.AdditionalFieldsConfiguration.b.REQUIRED;
                    }
                } else if (key.equals("hidden")) {
                    return com.stripe.android.paymentsheet.addresselement.d.AdditionalFieldsConfiguration.b.HIDDEN;
                }
            }
            return com.stripe.android.paymentsheet.addresselement.d.AdditionalFieldsConfiguration.b.HIDDEN;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v0 context) {
        super(context);
        s.k(context, "context");
        this.context = context;
        UIManagerModule uIManagerModule = (UIManagerModule) context.getNativeModule(UIManagerModule.class);
        this.eventDispatcher = uIManagerModule != null ? uIManagerModule.getEventDispatcher() : null;
        this.allowedCountries = d1.d();
        this.autocompleteCountries = d1.d();
    }

    private final void b() {
        try {
            new a().g(this.context, com.content.Bundle.b(i.V(this.appearanceParams), this.context), this.defaultAddress, this.allowedCountries, this.buttonTitle, this.sheetTitle, this.googlePlacesApiKey, this.autocompleteCountries, this.additionalFields, new p() { // from class: com.reactnativestripesdk.addresssheet.c
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return d.c(this.f48743a, (WritableMap) obj, (AddressDetails) obj2);
                }
            });
        } catch (PaymentSheetAppearanceException e11) {
            d(e.c(s10.d.Failed.toString(), e11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c(d dVar, WritableMap writableMap, AddressDetails addressDetails) {
        if (addressDetails != null) {
            dVar.e(INSTANCE.e(addressDetails));
        } else {
            dVar.d(writableMap);
        }
        dVar.isVisible = false;
        return h0.f84049a;
    }

    private final void d(WritableMap params) {
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.h(new b(getId(), b.EnumC0772b.OnError, params));
        }
    }

    private final void e(WritableMap params) {
        EventDispatcher eventDispatcher = this.eventDispatcher;
        if (eventDispatcher != null) {
            eventDispatcher.h(new b(getId(), b.EnumC0772b.OnSubmit, params));
        }
    }

    public final void setAdditionalFields(ReadableMap fields) {
        s.k(fields, "fields");
        this.additionalFields = INSTANCE.a(fields);
    }

    public final void setAllowedCountries(List<String> countries) {
        s.k(countries, "countries");
        this.allowedCountries = v.r1(countries);
    }

    public final void setAppearance(ReadableMap appearanceParams) {
        s.k(appearanceParams, "appearanceParams");
        this.appearanceParams = appearanceParams;
    }

    public final void setAutocompleteCountries(List<String> countries) {
        s.k(countries, "countries");
        this.autocompleteCountries = v.r1(countries);
    }

    public final void setDefaultValues(ReadableMap defaults) {
        s.k(defaults, "defaults");
        this.defaultAddress = INSTANCE.d(defaults);
    }

    public final void setGooglePlacesApiKey(String key) {
        s.k(key, "key");
        this.googlePlacesApiKey = key;
    }

    public final void setPrimaryButtonTitle(String title) {
        s.k(title, "title");
        this.buttonTitle = title;
    }

    public final void setSheetTitle(String title) {
        s.k(title, "title");
        this.sheetTitle = title;
    }

    public final void setVisible(boolean newVisibility) {
        if (newVisibility && !this.isVisible) {
            b();
        } else if (!newVisibility && this.isVisible) {
            Log.w("StripeReactNative", "Programmatically dismissing the Address Sheet is not supported on Android.");
        }
        this.isVisible = newVisibility;
    }
}
