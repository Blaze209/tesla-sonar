package p70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lp70/a;", "Lw30/a;", "<init>", "()V", "", "", "", "a", "()Ljava/util/Map;", "additionalParams", "b", "c", "Lp70/a$b;", "Lp70/a$c;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class a implements w30.a {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lp70/a$b;", "Lp70/a;", "", PlaceTypes.COUNTRY, "", "autocompleteResultSelected", "", "editDistance", "<init>", "(Ljava/lang/String;ZLjava/lang/Integer;)V", "b", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "e", "getEventName", "eventName", "", "", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String country;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean autocompleteResultSelected;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Integer editDistance;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String country, boolean z11, Integer num) {
            super(null);
            s.k(country, "country");
            this.country = country;
            this.autocompleteResultSelected = z11;
            this.editDistance = num;
            this.eventName = "mc_address_completed";
        }

        @Override // p70.a
        public Map<String, Object> a() {
            Map mapO = v0.o(x.a("address_country_code", this.country), x.a("auto_complete_result_selected", Boolean.valueOf(this.autocompleteResultSelected)));
            Integer num = this.editDistance;
            if (num != null) {
                mapO.put("edit_distance", Integer.valueOf(num.intValue()));
            }
            return v0.f(x.a("address_data_blob", mapO));
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lp70/a$c;", "Lp70/a;", "", PlaceTypes.COUNTRY, "<init>", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "c", "getEventName", "eventName", "", "", "a", "()Ljava/util/Map;", "additionalParams", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String country;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String country) {
            super(null);
            s.k(country, "country");
            this.country = country;
            this.eventName = "mc_address_show";
        }

        @Override // p70.a
        public Map<String, Object> a() {
            return v0.f(x.a("address_data_blob", v0.f(x.a("address_country_code", this.country))));
        }

        @Override // w30.a
        public String getEventName() {
            return this.eventName;
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, Object> a();

    private a() {
    }
}
