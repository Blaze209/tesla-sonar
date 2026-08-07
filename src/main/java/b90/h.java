package b90;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.model.Address;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0016\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\" \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lb90/g;", "Lb90/g$c;", "type", "Lb90/b;", DateTokenConverter.CONVERTER_KEY, "(Lb90/g;Lb90/g$c;)Lb90/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lb90/c;", "addressLine1", "Lb90/a;", PlaceTypes.ADDRESS, "", "b", "(Landroid/content/Context;Lb90/c;Lb90/a;)Ljava/lang/String;", "localityComponent", "premiseComponent", "c", "(Landroid/content/Context;Lb90/c;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "a", "(Lb90/a;)Lb90/a;", "place", "e", "(Lb90/a;Lb90/g;)Lb90/a;", "Lcom/stripe/android/model/b;", "f", "(Lb90/g;Landroid/content/Context;)Lcom/stripe/android/model/b;", "", "Ljava/util/Set;", "getSTREET_NAME_FIRST_COUNTRIES", "()Ljava/util/Set;", "STREET_NAME_FIRST_COUNTRIES", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f16925a = d1.i("BE", "BR", "CH", "DE", "ES", "ID", "IT", "MX", "NL", "NO", "PL", "RU", "SE");

    public static final Address a(Address address) {
        String dependentLocality;
        s.k(address, "<this>");
        Address addressB = Address.b(address, null, null, null, null, null, null, null, 127, null);
        if (address.getDependentLocality() != null) {
            if (address.getAddressLine2() != null) {
                dependentLocality = address.getAddressLine2() + ", " + address.getDependentLocality();
            } else {
                dependentLocality = address.getDependentLocality();
            }
            addressB.k(dependentLocality);
        }
        return addressB;
    }

    public static final String b(Context context, AddressLine1 addressLine1, Address address) {
        s.k(context, "context");
        s.k(addressLine1, "addressLine1");
        s.k(address, "address");
        String streetNumber = addressLine1.getStreetNumber();
        if (streetNumber == null) {
            streetNumber = "";
        }
        String route = addressLine1.getRoute();
        if (route == null) {
            route = "";
        }
        String locality = address.getLocality();
        String country = address.getCountry();
        if (s.f(country, "JP")) {
            return c(context, addressLine1, locality, address.getAddressLine2());
        }
        if (t.y0(streetNumber) && t.y0(route)) {
            return "";
        }
        if (v.g0(f16925a, country)) {
            return t.F1(route + " " + streetNumber).toString();
        }
        return t.F1(streetNumber + " " + route).toString();
    }

    public static final String c(Context context, AddressLine1 addressLine1, String str, String str2) {
        s.k(context, "context");
        s.k(addressLine1, "addressLine1");
        boolean z11 = (addressLine1.getSubLocalityLevel2() == null || addressLine1.getSubLocalityLevel3() == null || addressLine1.getSubLocalityLevel4() == null) ? false : true;
        String subLocalityLevel3 = addressLine1.getSubLocalityLevel3();
        String subLocalityLevel4 = addressLine1.getSubLocalityLevel4();
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        String subLocalityLevel2 = addressLine1.getSubLocalityLevel2();
        if (s.f(context.getResources().getConfiguration().getLocales().get(0), Locale.JAPANESE)) {
            if (z11) {
                str3 = subLocalityLevel3 + subLocalityLevel4 + "-" + str2;
            }
            return str + subLocalityLevel2 + str3;
        }
        if (z11) {
            str3 = subLocalityLevel3 + "-" + subLocalityLevel4 + "-" + str2;
        }
        return str3 + " " + subLocalityLevel2 + " " + str;
    }

    public static final AddressComponent d(Place place, Place.c type) {
        s.k(place, "<this>");
        s.k(type, "type");
        List<AddressComponent> listB = place.b();
        Object obj = null;
        if (listB == null) {
            return null;
        }
        for (Object obj2 : listB) {
            if (((AddressComponent) obj2).d().contains(type.getValue())) {
                obj = obj2;
                break;
            }
        }
        return (AddressComponent) obj;
    }

    public static final Address e(Address address, Place place) {
        s.k(address, "<this>");
        s.k(place, "place");
        AddressComponent addressComponentD = d(place, Place.c.ADMINISTRATIVE_AREA_LEVEL_2);
        String shortName = addressComponentD != null ? addressComponentD.getShortName() : null;
        AddressComponent addressComponentD2 = d(place, Place.c.ADMINISTRATIVE_AREA_LEVEL_1);
        String longName = addressComponentD2 != null ? addressComponentD2.getLongName() : null;
        Address addressB = Address.b(address, null, null, null, null, null, null, null, 127, null);
        String country = address.getCountry();
        if (country == null) {
            return addressB;
        }
        int iHashCode = country.hashCode();
        if (iHashCode != 2128) {
            if (iHashCode != 2222) {
                if (iHashCode == 2332) {
                    if (!country.equals("IE") || longName == null) {
                        return addressB;
                    }
                    addressB.l(longName);
                    return a(addressB);
                }
                if (iHashCode != 2347) {
                    if (iHashCode == 2374) {
                        if (!country.equals("JP")) {
                            return addressB;
                        }
                        addressB.k(null);
                        return addressB;
                    }
                    if (iHashCode != 2552) {
                        if (iHashCode != 2686) {
                            if (iHashCode != 2855) {
                                if (iHashCode != 2475) {
                                    if (iHashCode != 2476 || !country.equals("MY")) {
                                        return addressB;
                                    }
                                } else if (!country.equals("MX")) {
                                    return addressB;
                                }
                            } else if (!country.equals("ZA")) {
                                return addressB;
                            }
                        } else if (!country.equals("TR")) {
                            return addressB;
                        }
                    } else if (!country.equals("PH")) {
                        return addressB;
                    }
                    return a(addressB);
                }
                if (!country.equals("IT")) {
                    return addressB;
                }
            } else if (!country.equals("ES")) {
                return addressB;
            }
            if (shortName == null) {
                return addressB;
            }
            addressB.l(shortName);
            return addressB;
        }
        if (!country.equals("BR")) {
            return addressB;
        }
        if (address.getLocality() == null && shortName != null) {
            addressB.o(shortName);
        }
        return a(addressB);
    }

    public static final Address f(Place place, Context context) {
        s.k(place, "<this>");
        s.k(context, "context");
        Address address = new Address(null, null, null, null, null, null, null, 127, null);
        AddressLine1 addressLine1 = new AddressLine1(null, null, null, null, null, 31, null);
        List<AddressComponent> listB = place.b();
        if (listB != null) {
            for (AddressComponent addressComponent : listB) {
                String str = addressComponent.d().get(0);
                if (s.f(str, Place.c.STREET_NUMBER.getValue())) {
                    addressLine1.g(addressComponent.getLongName());
                } else if (s.f(str, Place.c.ROUTE.getValue())) {
                    addressLine1.f(addressComponent.getLongName());
                } else if (s.f(str, Place.c.PREMISE.getValue())) {
                    address.k(addressComponent.getLongName());
                } else if (s.f(str, Place.c.LOCALITY.getValue()) ? true : s.f(str, Place.c.SUBLOCALITY.getValue()) ? true : s.f(str, Place.c.POSTAL_TOWN.getValue())) {
                    address.o(addressComponent.getLongName());
                } else if (s.f(str, Place.c.ADMINISTRATIVE_AREA_LEVEL_1.getValue())) {
                    address.l(addressComponent.getShortName());
                } else if (s.f(str, Place.c.ADMINISTRATIVE_AREA_LEVEL_3.getValue())) {
                    if (address.getLocality() == null) {
                        address.o(addressComponent.getLongName());
                    }
                } else if (s.f(str, Place.c.ADMINISTRATIVE_AREA_LEVEL_2.getValue())) {
                    if (address.getAdministrativeArea() == null && address.getDependentLocality() == null) {
                        address.n(addressComponent.getLongName());
                    } else {
                        address.l(addressComponent.getShortName());
                    }
                } else if (s.f(str, Place.c.NEIGHBORHOOD.getValue())) {
                    if (address.getLocality() == null) {
                        address.o(addressComponent.getLongName());
                    } else {
                        address.n(addressComponent.getLongName());
                    }
                } else if (s.f(str, Place.c.POSTAL_CODE.getValue())) {
                    address.p(addressComponent.getLongName());
                } else if (s.f(str, Place.c.COUNTRY.getValue())) {
                    address.m(addressComponent.getShortName());
                } else if (s.f(str, Place.c.SUBLOCALITY_LEVEL_1.getValue())) {
                    if (address.getLocality() == null) {
                        address.n(addressComponent.getLongName());
                    } else {
                        address.o(addressComponent.getLongName());
                    }
                } else if (s.f(str, Place.c.SUBLOCALITY_LEVEL_2.getValue())) {
                    addressLine1.h(addressComponent.getLongName());
                } else if (s.f(str, Place.c.SUBLOCALITY_LEVEL_3.getValue())) {
                    addressLine1.i(addressComponent.getLongName());
                } else if (s.f(str, Place.c.SUBLOCALITY_LEVEL_4.getValue())) {
                    addressLine1.j(addressComponent.getLongName());
                }
            }
        }
        address.j(b(context, addressLine1, address));
        Address addressE = e(address, place);
        return new Address.a().e(addressE.getAddressLine1()).f(addressE.getAddressLine2()).b(addressE.getLocality()).h(addressE.getAdministrativeArea()).c(addressE.getCountry()).g(addressE.getPostalCode()).a();
    }
}
