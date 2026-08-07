package g90;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.lang.annotation.Annotation;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.u;
import ro0.p;
import vo0.a0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\"\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lg90/g;", "", "", "stringResId", "<init>", "(Ljava/lang/String;II)V", "I", "getStringResId", "()I", "Companion", "b", "Area", "Cedex", "City", "Country", "County", "Department", "District", "DoSi", "Eircode", "Emirate", "Island", "Neighborhood", "Oblast", "Parish", "Pin", "PostTown", "Postal", "Perfecture", "Province", "State", "Suburb", "SuburbOrCity", "Townload", "VillageTownship", "Zip", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@p
public enum g {
    Area(f90.h.f64621i),
    Cedex(f90.h.f64618f),
    City(o30.e.f96364b),
    Country(o30.e.f96365c),
    County(o30.e.f96366d),
    Department(f90.h.f64619g),
    District(f90.h.f64620h),
    DoSi(f90.h.f64627o),
    Eircode(f90.h.f64622j),
    Emirate(f90.h.f64615c),
    Island(f90.h.f64625m),
    Neighborhood(f90.h.f64628p),
    Oblast(f90.h.f64629q),
    Parish(f90.h.f64617e),
    Pin(f90.h.f64624l),
    PostTown(f90.h.f64630r),
    Postal(o30.e.f96369g),
    Perfecture(f90.h.f64626n),
    Province(o30.e.f96370h),
    State(o30.e.f96371i),
    Suburb(f90.h.f64631s),
    SuburbOrCity(f90.h.f64616d),
    Townload(f90.h.f64623k),
    VillageTownship(f90.h.f64632t),
    Zip(o30.e.f96372j);

    private final int stringResId;
    private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ro0.d<Object>> $cachedSerializer$delegate = m.a(jn0.p.PUBLICATION, a.f67668c);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements wn0.a<ro0.d<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f67668c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ro0.d<Object> invoke() {
            return a0.a("com.stripe.android.uicore.address.NameType", g.values(), new String[]{"area", "cedex", "city", PlaceTypes.COUNTRY, "county", "department", "district", "do_si", "eircode", "emirate", "island", PlaceTypes.NEIGHBORHOOD, "oblast", "parish", "pin", "post_town", "postal", "prefecture", "province", "state", "suburb", "suburb_or_city", "townland", "village_township", "zip"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}, null);
        }
    }

    /* JADX INFO: renamed from: g90.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg90/g$b;", "", "<init>", "()V", "Lro0/d;", "Lg90/g;", "serializer", "()Lro0/d;", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ ro0.d a() {
            return (ro0.d) g.$cachedSerializer$delegate.getValue();
        }

        public final ro0.d<g> serializer() {
            return a();
        }

        private Companion() {
        }
    }

    g(int i11) {
        this.stringResId = i11;
    }

    public static EnumEntries<g> getEntries() {
        return $ENTRIES;
    }

    public final int getStringResId() {
        return this.stringResId;
    }
}
