package b90;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.o;
import ro0.p;
import vo0.e0;
import vo0.h1;
import vo0.m1;
import vo0.v1;

/* JADX INFO: renamed from: b90.g, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003\u001d\u001f\u0012B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lb90/g;", "", "", "Lb90/b;", "addressComponents", "<init>", "(Ljava/util/List;)V", "", "seen1", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/util/List;Lvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "c", "(Lb90/g;Luo0/d;Lto0/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getAddressComponents$annotations", "()V", "Companion", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public final /* data */ class Place {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f16921b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ro0.d<Object>[] f16922c = {new vo0.e(AddressComponent.a.f16910a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<AddressComponent> addressComponents;

    /* JADX INFO: renamed from: b90.g$a */
    @jn0.e
    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/stripe/android/ui/core/elements/autocomplete/model/Place.$serializer", "Lvo0/e0;", "Lb90/g;", "<init>", "()V", "", "Lro0/d;", "childSerializers", "()[Lro0/d;", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lb90/g;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lb90/g;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements e0<Place> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f16924a;
        private static final /* synthetic */ m1 descriptor;

        static {
            a aVar = new a();
            f16924a = aVar;
            m1 m1Var = new m1("com.stripe.android.ui.core.elements.autocomplete.model.Place", aVar, 1);
            m1Var.o("address_components", false);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // ro0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Place deserialize(uo0.e decoder) {
            List list;
            s.k(decoder, "decoder");
            to0.f descriptor2 = getDescriptor();
            uo0.c cVarB = decoder.b(descriptor2);
            ro0.d[] dVarArr = Place.f16922c;
            int i11 = 1;
            v1 v1Var = null;
            if (cVarB.i()) {
                list = (List) cVarB.v(descriptor2, 0, dVarArr[0], null);
            } else {
                boolean z11 = true;
                int i12 = 0;
                List list2 = null;
                while (z11) {
                    int iA = cVarB.A(descriptor2);
                    if (iA == -1) {
                        z11 = false;
                    } else {
                        if (iA != 0) {
                            throw new UnknownFieldException(iA);
                        }
                        list2 = (List) cVarB.v(descriptor2, 0, dVarArr[0], list2);
                        i12 = 1;
                    }
                }
                list = list2;
                i11 = i12;
            }
            cVarB.c(descriptor2);
            return new Place(i11, list, v1Var);
        }

        @Override // ro0.q
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(uo0.f encoder, Place value) {
            s.k(encoder, "encoder");
            s.k(value, "value");
            to0.f descriptor2 = getDescriptor();
            uo0.d dVarB = encoder.b(descriptor2);
            Place.c(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // vo0.e0
        public ro0.d<?>[] childSerializers() {
            return new ro0.d[]{so0.a.p(Place.f16922c[0])};
        }

        @Override // ro0.d, ro0.q, ro0.c
        public to0.f getDescriptor() {
            return descriptor;
        }

        @Override // vo0.e0
        public ro0.d<?>[] typeParametersSerializers() {
            return e0.a.a(this);
        }
    }

    /* JADX INFO: renamed from: b90.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb90/g$b;", "", "<init>", "()V", "Lro0/d;", "Lb90/g;", "serializer", "()Lro0/d;", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ro0.d<Place> serializer() {
            return a.f16924a;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: b90.g$c */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lb90/g$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "ADMINISTRATIVE_AREA_LEVEL_3", "ADMINISTRATIVE_AREA_LEVEL_4", "COUNTRY", "LOCALITY", "NEIGHBORHOOD", "POSTAL_TOWN", "POSTAL_CODE", "PREMISE", "ROUTE", "STREET_NUMBER", "SUBLOCALITY", "SUBLOCALITY_LEVEL_1", "SUBLOCALITY_LEVEL_2", "SUBLOCALITY_LEVEL_3", "SUBLOCALITY_LEVEL_4", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum c {
        ADMINISTRATIVE_AREA_LEVEL_1(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_1),
        ADMINISTRATIVE_AREA_LEVEL_2(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_2),
        ADMINISTRATIVE_AREA_LEVEL_3(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_3),
        ADMINISTRATIVE_AREA_LEVEL_4(PlaceTypes.ADMINISTRATIVE_AREA_LEVEL_4),
        COUNTRY(PlaceTypes.COUNTRY),
        LOCALITY(PlaceTypes.LOCALITY),
        NEIGHBORHOOD(PlaceTypes.NEIGHBORHOOD),
        POSTAL_TOWN(PlaceTypes.POSTAL_TOWN),
        POSTAL_CODE(PlaceTypes.POSTAL_CODE),
        PREMISE(PlaceTypes.PREMISE),
        ROUTE(PlaceTypes.ROUTE),
        STREET_NUMBER(PlaceTypes.STREET_NUMBER),
        SUBLOCALITY(PlaceTypes.SUBLOCALITY),
        SUBLOCALITY_LEVEL_1(PlaceTypes.SUBLOCALITY_LEVEL_1),
        SUBLOCALITY_LEVEL_2(PlaceTypes.SUBLOCALITY_LEVEL_2),
        SUBLOCALITY_LEVEL_3(PlaceTypes.SUBLOCALITY_LEVEL_3),
        SUBLOCALITY_LEVEL_4(PlaceTypes.SUBLOCALITY_LEVEL_4);

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        c(String str) {
            this.value = str;
        }

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @jn0.e
    public /* synthetic */ Place(int i11, @o("address_components") List list, v1 v1Var) {
        if (1 != (i11 & 1)) {
            h1.b(i11, 1, a.f16924a.getDescriptor());
        }
        this.addressComponents = list;
    }

    public static final /* synthetic */ void c(Place self, uo0.d output, to0.f serialDesc) {
        output.y(serialDesc, 0, f16922c[0], self.addressComponents);
    }

    public final List<AddressComponent> b() {
        return this.addressComponents;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Place) && s.f(this.addressComponents, ((Place) other).addressComponents);
    }

    public int hashCode() {
        List<AddressComponent> list = this.addressComponents;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "Place(addressComponents=" + this.addressComponents + ")";
    }

    public Place(List<AddressComponent> list) {
        this.addressComponents = list;
    }
}
